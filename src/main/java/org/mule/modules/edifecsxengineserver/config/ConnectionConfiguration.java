/****************************************
* Copyright (c) 2003-2018 Edifecs, Inc. The software in this package is 
* published under the terms of the Commercial Software license, a copy 
* of which has been included with this distribution in the LICENSE.md file.
****************************************/
package org.mule.modules.edifecsxengineserver.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.param.Default;


@Configuration(friendlyName="Edifecs REST Connection Configuration")
public class ConnectionConfiguration {
	
	
	@Configurable
	@Default("https://xes-certification-mulesoft.collablynk.com:9058/rest")
	String baseURL;
	
	@Configurable
	@Default("MuleSoftCertification")
	String user;
	
	@Configurable
	@Default("Ad#$CeR1fi_1")
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
