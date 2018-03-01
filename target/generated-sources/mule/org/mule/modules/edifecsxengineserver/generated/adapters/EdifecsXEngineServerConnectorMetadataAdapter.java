
package org.mule.modules.edifecsxengineserver.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.edifecsxengineserver.EdifecsXEngineServerConnector;


/**
 * A <code>EdifecsXEngineServerConnectorMetadataAdapter</code> is a wrapper around {@link EdifecsXEngineServerConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.3", date = "2018-03-01T10:40:34-08:00", comments = "Build UNNAMED.2806.b026f34")
public class EdifecsXEngineServerConnectorMetadataAdapter
    extends EdifecsXEngineServerConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Edifecs XEngine Server Connector";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.9.3";
    private final static String DEVKIT_BUILD = "UNNAMED.2806.b026f34";
    private final static String MIN_MULE_VERSION = "3.5.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
