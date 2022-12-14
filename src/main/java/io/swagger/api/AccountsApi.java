/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Account;
import io.swagger.model.BalanceGroup;
import io.swagger.model.CustomizedBundleForPurchase;
import io.swagger.model.OrganizationHierarchy;
import io.swagger.model.PackageBasedOrder;
import io.swagger.model.RegistrationAccount;
import org.springframework.core.io.Resource;
import io.swagger.model.TaxInfo;
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
public interface AccountsApi {

    @Operation(summary = "Add Accounts to a Hierarchy", description = "Adds the accounts listed in the request body as child accounts to an existing organization hierarchy. You specify the organization hierarchy's parent account in the path parameter.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "The account was added successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/hierarchy/add/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addAccountToHierarchy(@Parameter(in = ParameterIn.PATH, description = "The ID of the parent account in the hierarchy", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The list of child account IDs to add to the hierarchy.", schema=@Schema()) @Valid @RequestBody List<String> body);


    @Operation(summary = "Create an Account", description = "Creates an account along with the address, contacts, and billing profiles associated with the account.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The account was created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Resource.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Resource> createAccount(@Parameter(in = ParameterIn.DEFAULT, description = "The account to create. The minimum required parameters are&colon;<ul><li><b>contacts</b><ul><li><b>address</b></li><li><b>city</b></li><li><b>country</b></li><li><b>firstName</b></li><li><b>lastName</b></li></ul></ul><p>You can optionally include&colon;<ul><li>Bill unit assignments for the balance groups defined by the package. The account payload can include a list of bill unit definitions, but if it doesn't, one will be created.</li><li>Customized details about the products and discounts in each bundle. If you don't customize the bundles, the account won't contain references to the bundles. If you override the product's prices and dates, they are included in the <b>CustomizedBundleForPurchase</b> parameter.</li></ul><p><b>Note:</b> Set the <b>purchasingPlanRef</b> and <b>notes</b> parameters to <b>null</b> if they don't have any value.", schema=@Schema()) @Valid @RequestBody RegistrationAccount body);


    @Operation(summary = "Get Account Details", description = "Gets the details for the account that matches the specified ID.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The account details were retrieved successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Account.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Account> getAccount(@Parameter(in = ParameterIn.PATH, description = "The account ID, such as 0.0.0.1+-account+123123.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "Whether to retrieve additional account information (<b>true</b>) or not (<b>false</b>). The default value is <b>true</b>." ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand);


    @Operation(summary = "Get Limits for an Account or Balance Group", description = "Gets the limits for the specified account and balance group.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The balance groups were returned successfully. Limits are listed within the balances array.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BalanceGroup.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/{id}/limits",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<BalanceGroup> getLimits(@Parameter(in = ParameterIn.PATH, description = "The ID of account to get limits for.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The ID of the balance group to get limits for. " ,schema=@Schema()) @Valid @RequestParam(value = "balanceGroupId", required = false) String balanceGroupId, @Parameter(in = ParameterIn.QUERY, description = "The resource ID to get limits for." ,schema=@Schema()) @Valid @RequestParam(value = "resourceId", required = false) String resourceId, @Parameter(in = ParameterIn.QUERY, description = "The end date for the limit's validity." ,schema=@Schema()) @Valid @RequestParam(value = "endDate", required = false) String endDate);


    @Operation(summary = "Get the Organization Hierarchy for an Account", description = "Gets the organization hierarchy for the account that matches the specified ID.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The account's organization hierarchy was returned successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = OrganizationHierarchy.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/hierarchy/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<OrganizationHierarchy> getOrganizationHierarchy(@Parameter(in = ParameterIn.PATH, description = "The ID of the account.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "Whether to return child details (<b>true</b>) or not (<b>false</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) Boolean expand);


    @Operation(summary = "Get Tax Details for an Account", description = "Gets the tax details for the account that matches the specified ID.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The account's tax details were returned successfully.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = TaxInfo.class))) })
    @RequestMapping(value = "/accounts/taxinfo/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<TaxInfo> getTaxInfo(@Parameter(in = ParameterIn.PATH, description = "The ID of an account, such as 0.0.0.1+-account+123123.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Move an Account Hierarchy", description = "Moves child accounts to a new parent in an organization hierarchy. You can do the following: <ul><li>Move a parent account and all its children to a new parent. Set only the path <b>id</b> and <b>primaryParentId</b>.</li><li>Move a parent account to a new parent and move all its children to a different parent. Set the path <b>id</b>, <b>primaryParentId</b>, <b>childrenParentId</b>, and list all of the children in the request body. The account specified in the path is moved to <b>primaryParentId</b> and the children are moved to <b>childrenParentId</b>.</li><li>Move a parent account and some of its children to a new parent, and move some of its children to a different parent. Set the path <b>id</b>, <b>primaryParentId</b>, <b>childrenParentId</b>, and list the children to move to the new parent in the request body. The children listed in the body are moved to <b>childrenParentId</b>, and the account specified in the path is moved with any remaining children to <b>primaryParentId</b>.</li><li>Move specified children to a different parent, leaving the original parent and any unspecified children behind. Set the path <b>id</b> and <b>primaryParentId</b>, set <b>moveChildren</b> to <b>true</b>, and list the children to move to the new parent in the request body. The account specified in the path and any of its children not listed in the body are left as-is. The children listed in the body are moved to <b>primaryParentId</b>.</li></ul><p>The request body is ignored unless <b>childrenParentId</b> is set or <b>moveChildren</b> is set to <b>true</b>. When <b>moveChildren</b> is set to <b>true</b>, a body is required and <b>childrenParentId</b> is ignored. If <b>moveChildren</b> isn't set, the default of <b>false</b> is used.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The hierarchy was moved successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/hierarchy/move/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> moveHierarchy(@Parameter(in = ParameterIn.PATH, description = "The ID of the primary account of the hierarchy to move to a new hierarchy.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The ID of the account to move the hiearchy to. If <b>moveChildren</b> is unset or set to <b>false</b>, this will be the new parent of the primary account specified in the path. If <b>moveChildren</b> is set to <b>true</b>, this will be the new parent of the children listed in the request body." ,schema=@Schema()) @Valid @RequestParam(value = "primaryParentId", required = false) String primaryParentId, @Parameter(in = ParameterIn.QUERY, description = "The ID of the account to move the primary account's children to. This can be any account. <p>If you specify this, a request body is required. <p>This parameter is ignored when <b>moveChildren</b> is set to <b>true</b>. " ,schema=@Schema()) @Valid @RequestParam(value = "childrenParentId", required = false) String childrenParentId, @Parameter(in = ParameterIn.QUERY, description = "Whether only the children are moved (<b>true</b>) or the children and the parent are moved (<b>false</b>).<p>If you set this to <b>true</b>, a request body is required and only the children listed in the request body are moved to the account specified in <b>primaryParentId</b>. The account specified in the path and any of its children not listed in the request body remain in place. <b>childrenParentId</b> is ignored.<p>If you set this to <b>false</b> or do not set it, the account specified in the path and all its children are moved according to <b>primaryParentId</b> and <b>childrenParentId</b>." ,schema=@Schema()) @Valid @RequestParam(value = "moveChildren", required = false) Boolean moveChildren, @Parameter(in = ParameterIn.DEFAULT, description = "The list of immediate child account IDs to move. All children of the listed accounts will also be moved. Any siblings not listed will not be moved. <p>Used only when <b>childrenParentId</b> is specified or <b>moveChildren</b> is set to <b>true</b>.", schema=@Schema()) @Valid @RequestBody List<String> body);


    @Operation(summary = "Add a Bundle to an Account", description = "Adds a bundle to an existing service or account.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "The bundle was added to the account successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/{id}/bundle",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> purchaseBundle(@Parameter(in = ParameterIn.PATH, description = "The ID of the service or account to add the bundle to.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Details about the bundle to add. The minimum required parameters are&colon;<ul><li><b>id</b></li><li><b>name</b></li></ul>", schema=@Schema()) @Valid @RequestBody CustomizedBundleForPurchase body);


    @Operation(summary = "Remove an Account from a Hierarchy", description = "Removes the specified account from an organization hierarchy.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The account was successfully removed from the organization hierarchy."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/hierarchy/remove/{id}",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> removeAccountFromHierarchy(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to remove.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "Represents the accountId of the parent a/c of the current a/c to be the new parent of children accounts" ,schema=@Schema()) @Valid @RequestParam(value = "childrenParentId", required = false) String childrenParentId, @Parameter(in = ParameterIn.QUERY, description = "tells us if the operation is remove children operation" ,schema=@Schema()) @Valid @RequestParam(value = "removeChildren", required = false) Boolean removeChildren, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody List<String> body);


    @Operation(summary = "Update an Account's Tax Settings", description = "Adds or updates the specified account's tax settings. You can add or update the following&colon;<ul><li>The VAT certificate</li><li>The tax exemptions</li><li>The tax incorporation information</li><li>Whether the tax is for a business account</li></ul>", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The tax information was saved successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/taxinfo/{id}",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> saveTaxInfo(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+123123.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The tax settings to add or update. All parameters are optional.", schema=@Schema()) @Valid @RequestBody TaxInfo body);


    @Operation(summary = "Add Services to an Account", description = "Adds new services to the specified account.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The services were successfully added to the account."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/{id}/package",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> subscribePackage(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to add the services to.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Information about the services to add. The minimum required parameters are&colon;<ul><li><b>purchasingPackageRef</b></li><li><b>services</b><ul><li><b>serviceKey</b></li><li><b>@class</b></li><li><b>serviceType</b></li><li><b>login</b></li></ul>", schema=@Schema()) @Valid @RequestBody PackageBasedOrder body);


    @Operation(summary = "Update an Account", description = "Updates an account's properties and contact information. You can do the following&colon;<ul><li>Add or remove contacts</li><li>Change a contact's attributes, such as the name, contact type, email, address details, company name, and phone number</li><li>Remove optional attributes from a contact, such as the company name and phone number</li></ul>", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The account was updated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/general",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateAccountGeneralInfo(@Parameter(in = ParameterIn.DEFAULT, description = "The account attributes to update. The minimum required parameters are&colon;<ul><li><b>accountNumber</b></li><li><b>billUnit</b></li><li><b>contacts</b></li><li><b>creationDate</b></li><li><b>id</b></li><li><b>wallet</b></li></ul><p>If you are adding a contact, you must set the contact's <b>deleted</b> parameter to <b>false</b>.<p>If you are deleting a contact, only the contact's <b>elem</b> and <b>deleted</b> parameters are required. If you attempt to delete the last contact, the response returns a success but the contact isn't actually deleted.", schema=@Schema()) @Valid @RequestBody Account body);


    @Operation(summary = "Validate an Account", description = "Validates the registration data for the specified account.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The account data was validated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/accounts/validate",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> validateAccount(@Parameter(in = ParameterIn.DEFAULT, description = "The data for an account. The minimum required parameters are&colon;<ul><li><b>contacts</b><ul><li><b>address</b></li><li><b>city</b></li><li><b>country</b></li><li><b>firstName</b></li><li><b>lastName</b></li></ul></ul>", schema=@Schema()) @Valid @RequestBody RegistrationAccount body);

}

