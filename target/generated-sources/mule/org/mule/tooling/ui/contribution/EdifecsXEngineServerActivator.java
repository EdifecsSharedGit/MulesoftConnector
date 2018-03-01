
package org.mule.tooling.ui.contribution;

import javax.annotation.Generated;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.3", date = "2018-03-01T10:40:34-08:00", comments = "Build UNNAMED.2806.b026f34")
public class EdifecsXEngineServerActivator
    extends AbstractUIPlugin
{

    public final static String PLUGIN_ID = "org.mule.tooling.ui.contribution.edifecs-x-engine-server";
    private static org.mule.tooling.ui.contribution.EdifecsXEngineServerActivator plugin;

    public void start(BundleContext context)
        throws Exception
    {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context)
        throws Exception
    {
        plugin = null;
        super.stop(context);
    }

    public static org.mule.tooling.ui.contribution.EdifecsXEngineServerActivator getDefault() {
        return plugin;
    }

}
