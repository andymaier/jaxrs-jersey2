package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Article;
import java.net.URI;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-03-28T20:45:51.231015+02:00[Europe/Berlin]")
public abstract class ArticleApiService {
    public abstract Response articleAidDelete(String aid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response articleAidGet(String aid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response articleAidPatch(String aid,Article article,SecurityContext securityContext) throws NotFoundException;
    public abstract Response articleAidPut(String aid,Article article,SecurityContext securityContext) throws NotFoundException;
    public abstract Response articleGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response articlePost(Article article,SecurityContext securityContext) throws NotFoundException;
}
