package org.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commercefacades.product.data.ProductData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.training.facades.rekomendasi.impl.DefaultRekomendasiFacade;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class RecomPageController extends AbstractPageController {
    private static final String TERMS_PAGE = "recom-page";

    @Resource(name = "rekomendasiFacade")
    private DefaultRekomendasiFacade defaultRekomendasiFacade;

    @RequestMapping(value = TERMS_PAGE, method = RequestMethod.GET)
    public String getPriceEngine(final Model model) throws CMSItemNotFoundException{
        List<ProductData> productDataList = defaultRekomendasiFacade.getListProductData();
        model.addAttribute("productListData",productDataList);
//        model.addAttribute("product",productDataList.get(0));
        final ContentPageModel contentPageModel = getContentPageForLabelOrId(TERMS_PAGE);
        storeCmsPageInModel(model, contentPageModel);
        setUpMetaDataForContentPage(model, contentPageModel);
        return getViewForPage(model);
    }

}
