/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ApplyLoan;
import io.swagger.model.LoanDetail;
import io.swagger.model.LoanProfileDetails;
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
public interface LoansApi {

    @Operation(summary = "Create a Loan", description = "Creates a new loan.", tags={ "Loans" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The loan was created successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/loans",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> applyLoan(@Parameter(in = ParameterIn.DEFAULT, description = "The details of the loan to create.", schema=@Schema()) @Valid @RequestBody ApplyLoan body);


    @Operation(summary = "Get Loan Configurations", description = "Gets the loan configurations that match the specified query criteria.", tags={ "Loans" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The loan configurations were returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = LoanProfileDetails.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/loans/loanProfiles",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<LoanProfileDetails>> getConfigLoanProfiles(@Parameter(in = ParameterIn.QUERY, description = "The ID of a <b>/config/loan</b> object to get. For example: 0.0.0.1+-config-loan+59508" ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id, @Parameter(in = ParameterIn.QUERY, description = "The name of a <b>/config/loan</b> object to get. For example: Resource Loan" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name);


    @Operation(summary = "Get Loans for an Account", description = "Gets the loans for the account with the specified ID.", tags={ "Loans" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The loans were returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = LoanDetail.class)))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/loans/account/{id}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<LoanDetail>> getLoanDetail(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get loans for. For example: 0.0.0.1+-account+123123", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.QUERY, description = "The service ID to filter loans by." ,schema=@Schema()) @Valid @RequestParam(value = "service.id", required = false) String serviceId, @Parameter(in = ParameterIn.QUERY, description = "The service type to filter loans by." ,schema=@Schema()) @Valid @RequestParam(value = "service.type", required = false) String serviceType, @Parameter(in = ParameterIn.QUERY, description = "The earliest start date of the loans to get, in milliseconds. For example: 1444209849879." ,schema=@Schema()) @Valid @RequestParam(value = "loanStartTime", required = false) String loanStartTime, @Parameter(in = ParameterIn.QUERY, description = "The latest end date of loans to get, in milliseconds. For example: 1444209849879." ,schema=@Schema()) @Valid @RequestParam(value = "loanEndTime", required = false) String loanEndTime, @Parameter(in = ParameterIn.QUERY, description = "Whether to retrieve only active loans (<b>true</b>) or all loans that have been granted (<b>false</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "onlyActiveLoans", required = false) Boolean onlyActiveLoans);

}
