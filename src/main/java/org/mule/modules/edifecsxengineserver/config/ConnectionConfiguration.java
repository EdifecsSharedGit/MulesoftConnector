package org.mule.modules.edifecsxengineserver.config;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.TestConnectivity;
import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.components.ConnectionManagement;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.transport.ConnectException;


@Configuration(friendlyName="Edifecs REST Connection Configuration")
public class ConnectionConfiguration {
	
	
	@Configurable
	@Default("https://xes-certification-mulesoft.collablynk.com:9058/rest")
	String baseURL;
	
	@Configurable
	@Default("MuleSoftCertification")
	String user;
	
	@Configurable
	@Default("")
	@Password
	String password;
	
	
	public String getBaseURL() {
		return baseURL;
	}

	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
