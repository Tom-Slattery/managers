/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2020.
 */
package dev.galasa.cicsts.ceci.internal.properties;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import dev.galasa.cicsts.CeciManagerException;
import dev.galasa.framework.spi.IConfigurationPropertyStoreService;

@Component(service=CECIPropertiesSingleton.class, immediate=true)
public class CECIPropertiesSingleton {
    
    private static CECIPropertiesSingleton singletonInstance;
    private static void setInstance(CECIPropertiesSingleton instance) {
        singletonInstance = instance;
    }
    
    private IConfigurationPropertyStoreService cps;
    
    @Activate
    public void activate() {
        setInstance(this);
    }
    
    @Deactivate
    public void deacivate() {
        setInstance(null);
    }
    
    public static IConfigurationPropertyStoreService cps() throws CeciManagerException {
        if (singletonInstance != null) {
            return singletonInstance.cps;
        }
        
        throw new CeciManagerException("Attempt to access manager CPS before it has been initialised");
    }
    
    public static void setCps(IConfigurationPropertyStoreService cps) throws CeciManagerException {
        if (singletonInstance != null) {
            singletonInstance.cps = cps;
            return;
        }
        
        throw new CeciManagerException("Attempt to set manager CPS before instance created");
    }
}
