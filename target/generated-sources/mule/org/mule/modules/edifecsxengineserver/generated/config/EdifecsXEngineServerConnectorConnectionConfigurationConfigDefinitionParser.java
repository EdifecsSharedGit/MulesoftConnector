
package org.mule.modules.edifecsxengineserver.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.edifecsxengineserver.config.ConnectionConfiguration;
import org.mule.modules.edifecsxengineserver.generated.adapters.EdifecsXEngineServerConnectorConnectionConfigurationBasicAdapter;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.3", date = "2018-03-01T10:40:34-08:00", comments = "Build UNNAMED.2806.b026f34")
public class EdifecsXEngineServerConnectorConnectionConfigurationConfigDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(EdifecsXEngineServerConnectorConnectionConfigurationConfigDefinitionParser.class);

    public String moduleName() {
        return "Edifecs XEngine Server Connector";
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, EdifecsXEngineServerConnectorConnectionConfigurationBasicAdapter.class);
        setDestroyMethodIfNeeded(builder, EdifecsXEngineServerConnectorConnectionConfigurationBasicAdapter.class);
        BeanDefinitionBuilder basicConfigBuilder = BeanDefinitionBuilder.rootBeanDefinition(ConnectionConfiguration.class.getName());
        parseProperty(basicConfigBuilder, element, "baseURL", "baseURL");
        parseProperty(basicConfigBuilder, element, "user", "user");
        parseProperty(basicConfigBuilder, element, "password", "password");
        builder.addPropertyValue("config", basicConfigBuilder.getBeanDefinition());
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(EdifecsXEngineServerConnectorConnectionConfigurationBasicAdapter.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config] within the connector [edifecs-x-engine-server] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config] within the connector [edifecs-x-engine-server] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
