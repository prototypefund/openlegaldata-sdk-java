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
import java.math.BigDecimal;
import io.swagger.client.model.CaseMarker;
import io.swagger.client.model.InlineResponse2002;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CaseMarkersApi
 */
@Ignore
public class CaseMarkersApiTest {

    private final CaseMarkersApi api = new CaseMarkersApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void caseMarkersCreateTest() throws ApiException {
        CaseMarker data = null;
        CaseMarker response = api.caseMarkersCreate(data);

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
    public void caseMarkersDeleteTest() throws ApiException {
        Integer id = null;
        api.caseMarkersDelete(id);

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
    public void caseMarkersListTest() throws ApiException {
        BigDecimal belongsTo = null;
        BigDecimal label = null;
        Integer limit = null;
        Integer offset = null;
        InlineResponse2002 response = api.caseMarkersList(belongsTo, label, limit, offset);

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
    public void caseMarkersPartialUpdateTest() throws ApiException {
        Integer id = null;
        CaseMarker data = null;
        CaseMarker response = api.caseMarkersPartialUpdate(id, data);

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
    public void caseMarkersReadTest() throws ApiException {
        Integer id = null;
        CaseMarker response = api.caseMarkersRead(id);

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
    public void caseMarkersUpdateTest() throws ApiException {
        Integer id = null;
        CaseMarker data = null;
        CaseMarker response = api.caseMarkersUpdate(id, data);

        // TODO: test validations
    }
    
}
