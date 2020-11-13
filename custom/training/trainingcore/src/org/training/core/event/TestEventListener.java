/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.event;


import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Required;

/**
 * Listener for order submits.
 */
public class TestEventListener extends AbstractAcceleratorSiteEventListener<TestEvent> {

    private ModelService modelService;

    private BusinessProcessService businessProcessService;

    private BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    @Required
    public void setBusinessProcessService(final BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    protected ModelService getModelService() {
        return modelService;
    }

    @Required
    public void setModelService(final ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    protected void onSiteEvent(final TestEvent testEvent) {
        final TestActionProcessModel testActionProcessModel = (TestActionProcessModel) getBusinessProcessService()
                .createProcess("testAction" + "-" + System.currentTimeMillis(), "defaultTestAction");
        testActionProcessModel.setSomething(testEvent.getProductModel().getCode());
        getModelService().save(testActionProcessModel);
        getBusinessProcessService().startProcess(testActionProcessModel);
    }

    @Override
    protected SiteChannel getSiteChannelForEvent(TestEvent event){
        final BaseSiteModel site = event.getSite();
        return site.getChannel();
    }


}
