package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ArticleApiService;
import org.openapitools.api.factories.ArticleApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Article;
import java.net.URI;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/article")


@io.swagger.annotations.Api(description = "the article API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-03-28T20:45:51.231015+02:00[Europe/Berlin]")
public class ArticleApi  {
   private final ArticleApiService delegate;

   public ArticleApi(@Context ServletConfig servletContext) {
      ArticleApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ArticleApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ArticleApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ArticleApiServiceFactory.getArticleApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{aid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes an article", notes = "Deletes an article", response = Void.class, tags={ "Shop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class)
    })
    public Response articleAidDelete(@ApiParam(value = "", required = true) @PathParam("aid") @NotNull  String aid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.articleAidDelete(aid, securityContext);
    }
    @GET
    @Path("/{aid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get specified article", notes = "Get specified article", response = Article.class, tags={ "Shop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Article.class)
    })
    public Response articleAidGet(@ApiParam(value = "", required = true) @PathParam("aid") @NotNull  String aid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.articleAidGet(aid, securityContext);
    }
    @PATCH
    @Path("/{aid}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Partial changes on article", notes = "Partial changes on article", response = Void.class, tags={ "Shop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class)
    })
    public Response articleAidPatch(@ApiParam(value = "", required = true) @PathParam("aid") @NotNull  String aid,@ApiParam(value = "") @Valid  Article article,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.articleAidPatch(aid, article, securityContext);
    }
    @PUT
    @Path("/{aid}")
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Changes an article", notes = "Changes an article", response = Void.class, tags={ "Shop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class)
    })
    public Response articleAidPut(@ApiParam(value = "", required = true) @PathParam("aid") @NotNull  String aid,@ApiParam(value = "") @Valid  Article article,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.articleAidPut(aid, article, securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all articles", notes = "Get all articles of this Service", response = Article.class, responseContainer = "List", tags={ "Shop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Article.class, responseContainer = "List")
    })
    public Response articleGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.articleGet(securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Creates an Article", notes = "Test ======  Creates a new ***Articles*** based on the given requestBody.  - name - price  1. First ordered list item 2. Another item ⋅⋅* Unordered sub-list.      1. Actual numbers don't matter, just that it's a number   ⋅⋅1. Ordered sub-list 4. And another item.  [I'm an inline-style link with title](https://www.google.com \"Google's Homepage\")  ![alt text](https://www.predic8.de/logo6.png \"Logo Title Text 1\") ", response = Void.class, tags={ "Shop", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Void.class)
    })
    public Response articlePost(@ApiParam(value = "") @Valid  Article article,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.articlePost(article, securityContext);
    }
}
