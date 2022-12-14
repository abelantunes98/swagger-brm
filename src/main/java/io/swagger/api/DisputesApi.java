/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ArActionsList;
import io.swagger.model.DisputeBill;
import io.swagger.model.DisputeEvent;
import io.swagger.model.DisputeItem;
import io.swagger.model.NotesInfo;
import org.springframework.core.io.Resource;
import io.swagger.model.SettlementBill;
import io.swagger.model.SettlementDetails;
import io.swagger.model.SettlementEvent;
import io.swagger.model.SettlementItem;
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
public interface DisputesApi {

    @Operation(summary = "Create a Bill Dispute", description = "Creates a dispute for the specified bill.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The bill dispute was created successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/bill/{id}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> disputeBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Information about the disputed bill.", schema=@Schema()) @Valid @RequestBody DisputeBill body);


    @Operation(summary = "Create an Event Dispute", description = "Creates an event dispute.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The event dispute was created successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/event",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> disputeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the event dispute.", schema=@Schema()) @Valid @RequestBody DisputeEvent body);


    @Operation(summary = "Create an Item Dispute", description = "Creates a dispute for the specified item.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The item dispute was created successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/item/{id}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> disputeItem(@Parameter(in = ParameterIn.PATH, description = "The ID of the item to dispute.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Information about the item dispute.", schema=@Schema()) @Valid @RequestBody DisputeItem body);


    @Operation(summary = "Get Notes for a Disputed Bill", description = "Gets the notes information for the specified bill in dispute.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The notes were returned successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = NotesInfo.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/notes/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<NotesInfo> getNotes(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Open Disputes for an Account", description = "Gets all open disputes for the specified account that meet the query criteria.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The list of open disputes was returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = ArActionsList.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/account/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ArActionsList>> getOpenDisputes(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get open disputes for.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "Expand the list of open disputes. Supported values are&colon;<p><ul><li><b>all</b>&colon; Shows the open disputes for all child accounts. This is the default.</li><li><b>childonly</b>&colon; Shows the open disputes for only the current account.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand);


    @Operation(summary = "Get Open Disputes for a Bill", description = "Gets all open disputes for the specified bill.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The list of open disputes was returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = ArActionsList.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/bill/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ArActionsList>> getOpenDisputesForBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Settlement Details for a Dispute", description = "Gets settlement details of a dispute", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The settlement details were returned successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = SettlementDetails.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/settlement/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SettlementDetails> getSettlementDetails(@Parameter(in = ParameterIn.PATH, description = "The settlement ID or dispute ID.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The account ID." ,schema=@Schema()) @Valid @RequestParam(value = "accountId", required = false) String accountId, @Parameter(in = ParameterIn.QUERY, description = "The bill unit ID." ,schema=@Schema()) @Valid @RequestParam(value = "billunitId", required = false) String billunitId, @Parameter(in = ParameterIn.QUERY, description = "The bill ID." ,schema=@Schema()) @Valid @RequestParam(value = "billId", required = false) String billId);


    @Operation(summary = "Create a Settlement for a Bill Dispute", description = "Creates a settlement for the specified disputed bill.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The bill settlement was created successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/settlement/bill/{id}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> settleBillDispute(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Information about the settlement. The minimum required parameter is <b>amount</b>.", schema=@Schema()) @Valid @RequestBody SettlementBill body);


    @Operation(summary = "Create a Settlement for an Event Dispute", description = "Performs settlement of an event dispute", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The settlement was created successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/settlement/event/{id}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> settleEventDispute(@Parameter(in = ParameterIn.PATH, description = "The ID of the disputed event.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Information about the settlement. The minimum required parameters are&colon; <ul><li><b>accountRef</b></li><li><b>amount</b></li><li><b>events</b></li>", schema=@Schema()) @Valid @RequestBody SettlementEvent body);


    @Operation(summary = "Create a Settlement for an Item Dispute", description = "Create a settlement for the specified item.", tags={ "Disputes" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The settlement was created successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/disputes/settlement/item/{id}",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> settleItemDispute(@Parameter(in = ParameterIn.PATH, description = "The ID of the item in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Information about the settlement. The minimum required parameter is <b>amount</b>.", schema=@Schema()) @Valid @RequestBody SettlementItem body);

}

