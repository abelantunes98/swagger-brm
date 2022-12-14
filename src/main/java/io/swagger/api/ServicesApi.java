/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.LifeCycleStates;
import io.swagger.model.ServiceDetails;
import io.swagger.model.ServiceProfile;
import io.swagger.model.ServicesByPurchase;
import io.swagger.model.UpdateServiceAndEras;
import io.swagger.model.UpdateServiceProfile;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")
@Validated
public interface ServicesApi {

    @Operation(summary = "Get Friendly Service Names", description = "Gets a list of service types and their associated friendly names from BRM. For example:<p> \"/service/provider => remittance definition\"", tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The list of service types and their friendly names was returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ServiceDetails.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/services/friendlynames",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ServiceDetails>> getFriendlyNamesServiceMapping();


    @Operation(summary = "Get Life Cycle States", description = "Gets the life cycle states and their allowed state transitions.", tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The life cycle states were returned successully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = LifeCycleStates.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/services/lifecyclestates",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<LifeCycleStates> getLifeCycleStates();


    @Operation(summary = "Get Details for a Service", description = "Gets the service details and profile details for the specified service. The service fields and profile fields are configured in the <b>ServiceProfileConfigurations.xml</b> file and mapped to a service type.", tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The details for the service were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServiceProfile.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/services/{id}/serviceprofile",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServiceProfile> getServiceProfile(@Parameter(in = ParameterIn.PATH, description = "The service ID of the specified customer asset.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Count for Service Types", description = "Gets the number of different types of services associated with the specified account.", tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The service type count was returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ServicesByPurchase.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/services/account/{id}/count",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ServicesByPurchase>> getServicesCount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+1117902.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Update Service And ERAs", description = "Updates a service login and its associated service ERAs.", tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The service and ERAs were updated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal service error occurred.") })
    @RequestMapping(value = "/services/serviceAndEras",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateServiceAndEras(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the service login and ERAs to update.", schema=@Schema()) @Valid @RequestBody UpdateServiceAndEras body);


    @Operation(summary = "Update Details for a Service", description = "Updates the service details and profile details for the specified service.", tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The details were updated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/services/serviceprofile",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateServiceProfile(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the service details and profile details to update.", schema=@Schema()) @Valid @RequestBody UpdateServiceProfile body);

}

