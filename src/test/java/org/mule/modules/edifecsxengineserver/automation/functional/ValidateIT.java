package org.mule.modules.edifecsxengineserver.automation.functional;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mule.modules.edifecsxengineserver.EdifecsXEngineServerConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import junit.framework.Assert;

public class ValidateIT extends AbstractTestCase<EdifecsXEngineServerConnector>{
	
	public ValidateIT(){
		this.setConnectorClass(EdifecsXEngineServerConnector.class);
	}
	
	@Test
	public void validateNormalDataTest() {
		String transaction = "test";
		Map<String, String> options = new HashMap<String, String>();
		
		InputStream stream = getConnector().validate(transaction, options);
		Assert.assertNotNull(stream);
	}
	
	@Test
	public void validateNullDataTest() {
		String transaction = null;
		Map<String, String> options = null;
		InputStream stream = getConnector().validate(transaction, options);
		Assert.assertNotNull(stream);
	}
	
	@Test
	public void validateEmptyDataTest() {
		String transaction = "";
		Map<String, String> options = null;
		InputStream stream = getConnector().validate(transaction, options);
		Assert.assertNotNull(stream);
	}
}
