package org.training.facades.rekomendasi.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.commercefacades.product.data.ProductData;
import org.apache.commons.collections.CollectionUtils;
import org.training.core.service.TrainingProductService;
import org.training.facades.rekomendasi.RekomendasiFacade;

import javax.annotation.Resource;
import java.util.List;

public class DefaultRekomendasiFacade implements RekomendasiFacade {

    @Resource(name = "trainingProductService")
    private TrainingProductService trainingProductService;

    @Resource(name = "plpConverter")
    private Converter<ProductModel, ProductData> plpConverter;


    @Override
    public List<ProductData> getListProductData() {
        trainingProductService.getAllProductModels();
        List<ProductData> productDataList = plpConverter.convertAll(trainingProductService.getAllProductModels());
        if (CollectionUtils.isEmpty(productDataList)) {
            return null;
        }
        return productDataList;

    }
}
