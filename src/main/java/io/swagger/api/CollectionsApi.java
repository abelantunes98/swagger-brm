/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AccountCollectionDetails;
import io.swagger.model.AssignCollectionsAgent;
import io.swagger.model.CollectionDetails;
import io.swagger.model.CollectionsActionHistory;
import io.swagger.model.CollectionsExemptedBillUnits;
import io.swagger.model.CollectionsGroup;
import io.swagger.model.CollectionsGroupDetails;
import io.swagger.model.Configurations;
import io.swagger.model.EditAction;
import io.swagger.model.InsertAction;
import io.swagger.model.NotesInfo;
import io.swagger.model.PromiseToPay;
import io.swagger.model.ReplaceScenarioDetails;
import org.springframework.core.io.Resource;
import io.swagger.model.User;
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
public interface CollectionsApi {

    @Operation(summary = "Add a Member to a Collections Group", description = "Adds a member to an existing collections group.<p>Both the <b>id</b> parameter and the <b>collectiongroupid</b> query parameter are required.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The member was added successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/group/member/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addMember(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit to add, such as 0.0.0.1+-billinfo+69381+10.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The ID of the collections group.<p>This query parameter is required." ,schema=@Schema()) @Valid @RequestParam(value = "collectiongroupid", required = false) String collectiongroupid, @Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the member added to the collections group.", schema=@Schema()) @Valid @RequestBody NotesInfo body);


    @Operation(summary = "Assign a Collections Agent to a Bill Unit", description = "Assigns the specified collections agent to the bill unit.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections agent was successfully assigned to the bill unit."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/assignagent",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> assignCollectionAgent(@Parameter(in = ParameterIn.DEFAULT, description = "Details about the collections agent to assign to the bill unit. The minimum required parameters are&colon;<ul><li><b>billunitRef</b></li><li><b>collectionAgent</b></li></ul>", schema=@Schema()) @Valid @RequestBody AssignCollectionsAgent body);


    @Operation(summary = "Create a Collections Group", description = "Creates a collections group.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections group was created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/group",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> createCollectionsGroup(@Parameter(in = ParameterIn.DEFAULT, description = "The collections group to create. The minimum required parameters are&colon;<p><ul><li><b>parentBillUnitRef</b></li><li><b>name</b></li></ul>This payload can also contain an optional list of members in the collections group.", schema=@Schema()) @Valid @RequestBody CollectionsGroup body);


    @Operation(summary = "Delete a Collections Group", description = "Deletes the collections group that matches the specified ID.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "The collections group was deleted successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/group/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteCollectionsGroup(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections group to delete, such as 0.0.0.1+-group-collections_targets+278050.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Modify an Account's Collections Action", description = "Modifies the specified collections action being taken against a customer. For example, you can change the action's status, the action's scheduled date, and the follow-on actions.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections action was returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred") })
    @RequestMapping(value = "/collections/task/{id}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Resource> editAction(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections action, such as 0.0.0.1+-collections_action-manual_action+2304239.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The modifications to make to the collections action. The minimum required parameter is&colon; <b>rescheduleDate</b>.", schema=@Schema()) @Valid @RequestBody EditAction body);


    @Operation(summary = "Exempt a Bill Unit from Collections", description = "Exempts the specified bill unit from collections.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The bill unit was successfully exempted from collections."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/exempt/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> exempt(@Parameter(in = ParameterIn.PATH, description = "The bill unit ID to exempt from collections.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the exemption.", schema=@Schema()) @Valid @RequestBody NotesInfo body);


    @Operation(summary = "Get Collections and Aging Buckets for an Account", description = "Gets collections details, including information about aging buckets, for the specified account ID.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections and aging bucket details were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CollectionDetails.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/account/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<CollectionDetails> getCollectionDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+123123, to get collections details for.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Collections Details for an Account", description = "Gets the collections details for all bill units that are in collections for the specified account ID.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections details were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AccountCollectionDetails.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/details/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<AccountCollectionDetails> getCollectionDetailsForAccount(@Parameter(in = ParameterIn.PATH, description = "The ID for the account, such as 0.0.0.1+-account+123123.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get History of a Collections Action", description = "Gets the history for the collections action that matches the specified ID.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections action history was returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CollectionsActionHistory.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/history/action/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<CollectionsActionHistory> getCollectionsActionHistory(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections action to get.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Exempted Bill Units", description = "Gets all bill units that are exempted from collections.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The exempted bill units were returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = CollectionsExemptedBillUnits.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/exempt",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<CollectionsExemptedBillUnits>> getCollectionsExemptedBillUnits();


    @Operation(summary = "Get a Collections Group by Parent Bill Unit", description = "Gets the collections group details for the specified parent bill unit.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections group details were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CollectionsGroup.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/group/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<CollectionsGroup> getCollectionsGroup(@Parameter(in = ParameterIn.PATH, description = "The parent bill unit of the collection's group, such as 0.0.0.1+-billinfo+123123.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Collections Group Details for an Account", description = "Gets the collections group information for all bill units that match the specified account ID.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections group details were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CollectionsGroupDetails.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/group/account/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<CollectionsGroupDetails> getCollectionsGroupDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get collections group details for.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Collections Users", description = "Gets the list of users who have the permission to start, modify, and cancel collections for your customers.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The list of users was returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/users",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> getCollectionsUsers();


    @Operation(summary = "Get Collections Actions", description = "Gets all collections actions, including their ID, name, and description.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections actions were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Configurations.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/actions",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Configurations> getConfigActions();


    @Operation(summary = "Get All Collections Profiles", description = "Gets all collections profiles from the system.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections profiles were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Configurations.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/profiles",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Configurations> getConfigProfiles();


    @Operation(summary = "Get Collections Scenarios", description = "Gets all collections scenarios in the system. You can optionally use the <b>id</b> query parameter to get a specific collections scenario.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections scenarios were returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Configurations.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/scenarios",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Configurations> getConfigScenarios(@Parameter(in = ParameterIn.QUERY, description = "The ID of the collections scenario to get." ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id);


    @Operation(summary = "Add a Collections Action", description = "Adds a collections action to a collections scenario.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections action was added successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/task/insert/{id}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> insertAction(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections action to add, such as 0.0.0.1+-config-collections-action+826.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Information about the collections action to add.", schema=@Schema()) @Valid @RequestBody InsertAction body);


    @Operation(summary = "Update a Collections Group", description = "Updates the collections group that matches the specified ID. <p>You can optionally do this&colon;<ul><li>Replace the existing set of members</li><li>Change the name of the collections group</li><li>Change the parent bill unit</li></ul>", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The collections group was updated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/group/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyCollectionsGroup(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections group to update.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Details about the collections group update.", schema=@Schema()) @Valid @RequestBody CollectionsGroup body);


    @Operation(summary = "Create a Promise-to-Pay Agreement for a Bill Unit", description = "Creates a promise-to-pay agreement for the specified bill unit.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The promise-to-pay agreement was created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/promisetopay/invoke/{id}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Resource> promiseToPay(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit, such as 0.0.0.1+-billinfo+2313045.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Details about the promise to pay agreement. The minimum required parameter is&colon; <b>effectiveDate</b>.", schema=@Schema()) @Valid @RequestBody PromiseToPay body);


    @Operation(summary = "Remove a Bill Unit from Collections", description = "Removes the specified bill unit from collections.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The bill unit was successfully removed from collections."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/exit/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> removeBillUnitFromCollections(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit, such as 0.0.0.1+-billinfo+69381+10.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the removal.", schema=@Schema()) @Valid @RequestBody NotesInfo body);


    @Operation(summary = "Remove a Member from a Collections Group", description = "Removes the specified member from a collections group.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The member was removed successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/group/member/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> removeMember(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit to remove from the collections group, such as 0.0.0.1+-billinfo+69381+10.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the removal.", schema=@Schema()) @Valid @RequestBody NotesInfo body);


    @Operation(summary = "Replace the Collections Scenario for a Bill Unit", description = "Replaces a bill unit's existing collection scenario with a new collections scenario.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The bill unit's collections scenario was replaced successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/scenario/replace/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> replaceCollectionScenario(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Details about the old and new collections scenarios. It also contains the date from when new scenario has to be scheduled.", schema=@Schema()) @Valid @RequestBody ReplaceScenarioDetails body);


    @Operation(summary = "Cancel a Promise-to-Pay Agreement", description = "Cancels the specified promise-to-pay agreement.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The promise-to-pay agreement was canceled successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/promisetopay/revoke/{id}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Resource> revokePromiseToPay(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections scenario, such as 0.0.0.1+-collections_scenario+206452.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The CSR notes to associate with the cancelled promise-to-pay agreement.", schema=@Schema()) @Valid @RequestBody NotesInfo body);


    @Operation(summary = "Unexempt a Bill Unit from Collections", description = "Unexempts the specified bill unit from collections.", tags={ "Collections" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The bill unit was unexempted from collections."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/collections/unexempt/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> unexempt(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit to unexempt from collections.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Optional notes objectt", schema=@Schema()) @Valid @RequestBody NotesInfo body);

}

