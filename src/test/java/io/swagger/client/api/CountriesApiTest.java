/*
 * Open Legal Data API
 * With the Open Legal Data API you can access various data from the legal domain, e.g. law text or case files. The data may be used for semantic analysis or to create statistics. For more information visit our website. https://openlegaldata.io/
 *
 * OpenAPI spec version: v1
 * Contact: hello@openlegaldata.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Country;
import io.swagger.client.model.InlineResponse2006;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CountriesApi
 */
@Ignore
public class CountriesApiTest {

    private final CountriesApi api = new CountriesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countriesListTest() throws ApiException {
        String code = null;
        Integer limit = null;
        Integer offset = null;
        InlineResponse2006 response = api.countriesList(code, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countriesReadTest() throws ApiException {
        Integer id = null;
        Country response = api.countriesRead(id);

        // TODO: test validations
    }
    
}
