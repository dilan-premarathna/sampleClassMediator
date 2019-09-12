package org.wso2.carbon.ei.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.ManagedLifecycle;
import org.apache.synapse.MessageContext;
import org.apache.synapse.core.SynapseEnvironment;
import org.apache.synapse.mediators.AbstractMediator;

public class SampleClassMediator extends AbstractMediator implements
        ManagedLifecycle {

    private static final Log log = LogFactory.getLog(SampleClassMediator.class);
    public static String APP_ID = "72f7085e4e8a593c56ddf61cdde47932";

    @Override
    public void init(SynapseEnvironment se) {

    }

    @Override
    public void destroy() {

    }

    @Override
    public boolean mediate(MessageContext mc) {

        log.info("Starting the mediation of the class mediator");
        log.info("APP_ID value is " + APP_ID);
        mc.setProperty("APP_ID", APP_ID);

        return true;
    }
}
