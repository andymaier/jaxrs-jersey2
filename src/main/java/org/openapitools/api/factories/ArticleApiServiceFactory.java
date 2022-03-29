package org.openapitools.api.factories;

import org.openapitools.api.ArticleApiService;
import org.openapitools.api.impl.ArticleApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-03-28T20:45:51.231015+02:00[Europe/Berlin]")
public class ArticleApiServiceFactory {
    private static final ArticleApiService service = new ArticleApiServiceImpl();

    public static ArticleApiService getArticleApi() {
        return service;
    }
}
