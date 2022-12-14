package io.swagger.api;

import io.swagger.model.LifeCycleStates;
import io.swagger.model.ServiceDetails;
import io.swagger.model.ServiceProfile;
import io.swagger.model.ServicesByPurchase;
import io.swagger.model.UpdateServiceAndEras;
import io.swagger.model.UpdateServiceProfile;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")
@RestController
public class ServicesApiController implements ServicesApi {

    private static final Logger log = LoggerFactory.getLogger(ServicesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServicesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ServiceDetails>> getFriendlyNamesServiceMapping() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ServiceDetails>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"type\" : \"type\",\n  \"friendlyName\" : \"friendlyName\"\n}, {\n  \"extension\" : { },\n  \"type\" : \"type\",\n  \"friendlyName\" : \"friendlyName\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ServiceDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ServiceDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LifeCycleStates> getLifeCycleStates() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LifeCycleStates>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"servicesWithLifecycleStates\" : [ \"servicesWithLifecycleStates\", \"servicesWithLifecycleStates\" ],\n  \"states\" : [ {\n    \"extension\" : { },\n    \"stateName\" : \"stateName\",\n    \"stateId\" : 0,\n    \"allowedTransitionStates\" : [ 6, 6 ]\n  }, {\n    \"extension\" : { },\n    \"stateName\" : \"stateName\",\n    \"stateId\" : 0,\n    \"allowedTransitionStates\" : [ 6, 6 ]\n  } ]\n}", LifeCycleStates.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LifeCycleStates>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LifeCycleStates>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServiceProfile> getServiceProfile(@Parameter(in = ParameterIn.PATH, description = "The service ID of the specified customer asset.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServiceProfile>(objectMapper.readValue("{\n  \"devices\" : [ {\n    \"extension\" : { },\n    \"description\" : \"description\",\n    \"deviceId\" : \"deviceId\"\n  }, {\n    \"extension\" : { },\n    \"description\" : \"description\",\n    \"deviceId\" : \"deviceId\"\n  } ],\n  \"service\" : {\n    \"extension\" : { },\n    \"passwordExpiration\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"lastStatusComment\" : \"lastStatusComment\",\n    \"passwordStatus\" : 1,\n    \"serviceAccessLevel\" : \"serviceAccessLevel\",\n    \"statusFlags\" : 5,\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"login\" : \"login\",\n    \"password\" : \"password\",\n    \"aliasList\" : [ {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    }, {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    } ],\n    \"balGrpIndex\" : 9,\n    \"lastStatusChange\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"name\" : \"name\",\n    \"lastModified\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"pendingDeferredActionsCount\" : 1,\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"lifeCycleState\" : 7,\n    \"status\" : 4\n  },\n  \"profile\" : {\n    \"extension\" : { },\n    \"parentName\" : \"parentName\",\n    \"name\" : \"name\",\n    \"id\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"multiValued\" : true,\n    \"selected\" : true\n  }\n}", ServiceProfile.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServiceProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServiceProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ServicesByPurchase>> getServicesCount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+1117902.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ServicesByPurchase>>(objectMapper.readValue("[ {\n  \"serviceType\" : \"serviceType\",\n  \"extension\" : { },\n  \"count\" : 0\n}, {\n  \"serviceType\" : \"serviceType\",\n  \"extension\" : { },\n  \"count\" : 0\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ServicesByPurchase>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ServicesByPurchase>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateServiceAndEras(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the service login and ERAs to update.", schema=@Schema()) @Valid @RequestBody UpdateServiceAndEras body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateServiceProfile(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the service details and profile details to update.", schema=@Schema()) @Valid @RequestBody UpdateServiceProfile body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
