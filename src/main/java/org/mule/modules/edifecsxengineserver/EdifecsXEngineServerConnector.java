package org.mule.modules.edifecsxengineserver;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.FriendlyName;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.param.Payload;
import org.mule.modules.edifecsxengineserver.config.ConnectionConfiguration;


@Connector(name="edifecs-x-engine-server", friendlyName="Edifecs XEngine Server Connector")
public class EdifecsXEngineServerConnector {

    @Config
    ConnectionConfiguration config;
    
    
    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     * @throws Exception 
     */
    @Processor
    public InputStream validate(@Payload String transaction, @Placement(group = "Custom Options") @FriendlyName("Key-Value parameters") Map<String, String> customOptions) throws Exception{
    	InputStream response =  this.postData(transaction, customOptions,  "validate");
    	return response;
    }


    public ConnectionConfiguration getConfig() {
        return config;
    }

    public void setConfig(ConnectionConfiguration config) {
        this.config = config;
    }
    
	private InputStream postData(String content, Map<String, String> customOptions, String urlCommand){
		
		HttpAuthenticationFeature auth = HttpAuthenticationFeature.basic(config.getUser(), config.getPassword());
		InputStream stream = null;
		try{
			Client client = ignoreSSLClient();
			client.register(auth);
			String URL =  config.getBaseURL() + "/" + urlCommand + (customOptions.size() != 0 ? "?" +this.joinParams(customOptions, "=", "&"):"");
			WebTarget webTarget = client.target(URL);
			Invocation.Builder invocationBuilder =  webTarget.request(MediaType.TEXT_PLAIN).acceptEncoding("utf-8"); // 
			Response response = invocationBuilder.post(Entity.text(content)); 
			stream = response.readEntity(InputStream.class);
			return stream;
		}
		catch(Exception e){
			e.printStackTrace();
			if (stream == null)
				stream = new ByteArrayInputStream(e.getMessage().getBytes(StandardCharsets.UTF_8));
			return stream;
		}
		
	}
	
	
	private String joinParams(Map<String,String> stringMap, String keyValueSymbol, String joinSymbol)
	{
		StringBuilder joinedString = new StringBuilder();
		int length = stringMap.size();
		for(Map.Entry<String, String> keyValueInList : stringMap.entrySet())
		{
			if (length == 1)
			{
				joinedString.append(keyValueInList.getKey()).append(keyValueSymbol).append(keyValueInList.getValue());
			}
			else
			{
				joinedString.append(keyValueInList.getKey()).append(keyValueSymbol).append(keyValueInList.getValue()).append(joinSymbol);
				length--;
			}
		}
		
		return joinedString.toString();
	}
	
	public static Client ignoreSSLClient() throws Exception {

	    SSLContext sslcontext = SSLContext.getInstance("TLS");

	    sslcontext.init(null, new TrustManager[]{new X509TrustManager() {
	        public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
	        public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {}
	        public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
	    }}, new java.security.SecureRandom());

	    return ClientBuilder.newBuilder()
	                        .sslContext(sslcontext)
	                        .hostnameVerifier(new HostnameVerifier() {
								@Override
								public boolean verify(String s1, SSLSession s2) {
									return true;
								}
							})
	                        .build();
	}
	

}