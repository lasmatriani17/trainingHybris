/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.enums.Gender;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.type.TypeService;
import org.apache.commons.beanutils.ConversionException;
import org.springframework.beans.factory.annotation.Required;
import org.training.core.model.TrainingVariantProductModel;
import org.training.facades.product.data.GenderData;

/**
 * Populates {@link GenderData} with name and code.
 */
public class ProductSKUPopulator implements Populator <ProductModel, ProductData>
{
 @Override
	public void populate(ProductModel source, ProductData target) throws ConversionException{
 	if (source instanceof TrainingVariantProductModel){
 		TrainingVariantProductModel trainingVariantProductModel = (TrainingVariantProductModel) source;
 		target.setSku(trainingVariantProductModel.getSku());
	}
 }
}
