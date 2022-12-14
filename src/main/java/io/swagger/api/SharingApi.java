/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ProfileServExtratingType;
import io.swagger.model.SharingGroupMembers;
import io.swagger.model.SharingMember;
import io.swagger.model.SharingMemberDetails;
import io.swagger.model.SharingMemberServiceDetails;
import io.swagger.model.SharingOwner;
import io.swagger.model.SharingOwnerDetails;
import io.swagger.model.Sponsor;
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
public interface SharingApi {

    @Operation(summary = "Add Members to a Group", description = "Adds members to a sharing group.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The members were added successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/members/{id}",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addMembers(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group, which is either <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.DEFAULT, description = "The sharing group member details.", schema=@Schema()) @Valid @RequestBody SharingMember body);


    @Operation(summary = "Create a Sharing Group", description = "Creates a sharing group with the specified details.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The sharing group was created successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createSharingGroup(@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.DEFAULT, description = "Details about the sharing group to create. The minimum required parameters are&colon;<ul><li><b>accountRef</b></li><li><b>groupName</b></li><li><b>groupOwnerBalGroupref</b></li><li><b>parentRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody SharingOwner body);


    @Operation(summary = "Remove Members from a Group", description = "Removes one or more members from the specified sharing group.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The members were deleted successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/members/account/{id}",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> deleteMembers(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.DEFAULT, description = "The list of members in the sharing group to delete.  The minimum required parameters are&colon;<ul><li><b>membership</b></li><li><b>orderedBalGroupRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody SharingMember body);


    @Operation(summary = "Delete a Sharing Group", description = "Delete the sharing group that matches the specified ID. <p>Both the <b>id</b> parameter and the <b>type</b> query parameter are required.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The sharing group was deleted successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOwnership(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group, which is either <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type);


    @Operation(summary = "Update Shared Services for a Member", description = "Updates the shared services for a member in a sharing group.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The shared services were updated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/members/{id}",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> editMembers(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group to which the member belongs." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.DEFAULT, description = "The details to update for the member.", schema=@Schema()) @Valid @RequestBody SharingMemberServiceDetails body);


    @Operation(summary = "Get Group Ownership Details", description = "Gets the ownership details for the specified sharing group.<p>Both the <b>id</b> parameter and the <b>type</b> query parameter are required.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The sharing group's ownership details were returned successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = SharingOwnerDetails.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/group/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SharingOwnerDetails> getGroupDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type);


    @Operation(summary = "Get Members of a Group", description = "Gets the members of the sharing group that matches the specified ID.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The members were returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = SharingGroupMembers.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/members/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<SharingGroupMembers>> getMembersOfGroup(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group to get.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Membership Details for an Account", description = "Gets membership details for an account that is a charge sharing group member or discount sharing group member.<p>Both the <b>id</b> parameter and <b>type</b> query parameter are required.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The membership details were returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = SharingMemberDetails.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/membership/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<SharingMemberDetails>> getMembership(@Parameter(in = ParameterIn.PATH, description = "The account ID of the sharing group member.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group to get: <b>charge</b> or <b>discount</b>.<p>This query parameter is required." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type);


    @Operation(summary = "Get Ownership Details for an Account", description = "Gets the ownership details for the specified account and sharing group type.<p>Both the <b>id</b> parameter and the <b>type</b> query parameter are required.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The ownership details were returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = SharingOwnerDetails.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<SharingOwnerDetails>> getOwnership(@Parameter(in = ParameterIn.PATH, description = "The ID of the account.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type);


    @Operation(summary = "Get a Profile Sharing Group", description = "Gets the profile sharing group that matches the specified ID.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The profile sharing group was returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = ProfileServExtratingType.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/profiles/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ProfileServExtratingType>> getProfiles(@Parameter(in = ParameterIn.PATH, description = "The ID of the profile sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Charges Added to Sharing Groups", description = "Gets a list of all charges that have been added to sharing groups across the system.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The list of sponsors was returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Sponsor.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/sponsors/charge",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Sponsor>> getSponsors();


    @Operation(summary = "Get Available Discount Shares for Account", description = "Gets a list of purchased discount shares that are available for an account while creating a new discount sharing group.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The list of available purchased discount shares was returned successfully.", content = @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Sponsor.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/sponsors/discount/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Sponsor>> getSponsorsForDiscount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Update a Sharing Group", description = "Updates the specified charge sharing group or discount sharing group.<p>Both the <b>id</b> parameter and <b>type</b> query parameter are required.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The sharing group was updated successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/{id}",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyOwnership(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>. <p>This query parameter is required." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.DEFAULT, description = "Details about the sharing group.", schema=@Schema()) @Valid @RequestBody SharingOwner body);


    @Operation(summary = "Update Membership in Sharing Group", description = "Updates the list of members in the specified sharing group.", tags={ "Sharing" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The membership was updated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/sharing/members/priority",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> modifyPriority(@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group, which is either <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.DEFAULT, description = "The list of members in the sharing group. If a sharing member's ordered balance group is empty or null, a new ordered balance group will be created and members will be added. If present, the ordered balance group will be modified to add new members.", schema=@Schema()) @Valid @RequestBody List<SharingMember> body);

}

