
package org.mule.modules.edifecsxengineserver.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.devkit.internal.lic.LicenseValidatorFactory;
import org.mule.devkit.internal.lic.validator.LicenseValidator;
import org.mule.modules.edifecsxengineserver.EdifecsXEngineServerConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>EdifecsXEngineServerConnectorProcessAdapter</code> is a wrapper around {@link EdifecsXEngineServerConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.3", date = "2018-03-01T10:40:34-08:00", comments = "Build UNNAMED.2806.b026f34")
public class EdifecsXEngineServerConnectorProcessAdapter
    extends EdifecsXEngineServerConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<EdifecsXEngineServerConnectorCapabilitiesAdapter> , Initialisable
{


    public<P >ProcessTemplate<P, EdifecsXEngineServerConnectorCapabilitiesAdapter> getProcessTemplate() {
        final EdifecsXEngineServerConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,EdifecsXEngineServerConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, EdifecsXEngineServerConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, EdifecsXEngineServerConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

    @Override
    public void initialise()
        throws InitialisationException
    {
        super.initialise();
        checkMuleLicense();
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    private void checkMuleLicense() {
        LicenseValidator licenseValidator = LicenseValidatorFactory.getValidator("Edifecs XEngine Server Connector");
        licenseValidator.checkEnterpriseLicense(true);
    }

}
