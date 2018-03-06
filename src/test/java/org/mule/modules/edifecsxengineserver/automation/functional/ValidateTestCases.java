/**
 * (c) 2003-2018 Edifecs, Inc. The software in this package is published under the terms of the Commercial Software license, a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.modules.edifecsxengineserver.automation.functional;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mule.modules.edifecsxengineserver.EdifecsXEngineServerConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

import junit.framework.Assert;

public class ValidateTestCases extends AbstractTestCase<EdifecsXEngineServerConnector>{
	
	public ValidateTestCases(){
		this.setConnectorClass(EdifecsXEngineServerConnector.class);
	}
	
	@Test
	public void validateNormalDataTest() {
		String transaction = "test";
		Map<String, String> options = new HashMap<String, String>();
		options.put("test1", "test2");
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
