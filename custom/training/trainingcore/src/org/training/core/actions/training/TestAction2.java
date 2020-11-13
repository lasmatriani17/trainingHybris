/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.core.actions.training;

import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;

public class TestAction2 extends AbstractSimpleDecisionAction<TestActionProcessModel> {
    @Override
    public Transition executeAction(TestActionProcessModel testActionProcessModel) {
//        do something
        if (Boolean.TRUE) {
            return Transition.OK;
        }
        return Transition.NOK;
    }
}