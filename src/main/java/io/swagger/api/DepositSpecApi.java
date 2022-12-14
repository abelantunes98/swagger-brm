/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.DepositSpec;
import io.swagger.model.EntityRef;
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
public interface DepositSpecApi {

    @Operation(summary = "Create a Deposit Specification", description = "Creates a deposit specification.", tags={ "Deposits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The deposit specification was created successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityRef.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "403", description = "The server understood the request but refuses to authorize it.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "404", description = "The server could not find the requested object.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "409", description = "The request could not be processed due to conflict. An item already exists.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable entity. The server understands the request but is unable to process the instructions.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "503", description = "Service unavailable. The server is currently unable to handle the request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))) })
    @RequestMapping(value = "/depositSpec",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<EntityRef> addDepositSpec(@Parameter(in = ParameterIn.DEFAULT, description = "The deposit specification to create. The minimum required parameters are&colon;<ul><li><b>name</b></li><li><b>chargeOfferRef</b></li><li><b>profileRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositSpec body);


    @Operation(summary = "Delete a Deposit Specification", description = "Deletes the deposit specification with the specified ID.", tags={ "Deposits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The deposit specification was deleted successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "403", description = "The server understood the request but refuses to authorize it.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "404", description = "The server could not find the requested object.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "409", description = "The request could not be processed due to conflict. An item already exists.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable entity. The server understands the request but is unable to process the instructions.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "503", description = "Service unavailable. The server is currently unable to handle the request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))) })
    @RequestMapping(value = "/depositSpec/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDepositSpecById(@Parameter(in = ParameterIn.PATH, description = "The deposit specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get a Deposit Specification by ID", description = "Gets the deposit specification details with the specified ID.", tags={ "Deposits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The deposit offer was returned successfully.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = DepositSpec.class))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "403", description = "The server understood the request but refuses to authorize it.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "404", description = "The server could not find the requested object.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "409", description = "The request could not be processed due to conflict. An item already exists.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable entity. The server understands the request but is unable to process the instructions.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "503", description = "Service unavailable. The server is currently unable to handle the request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))) })
    @RequestMapping(value = "/depositSpec/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<DepositSpec> getDepositSpecById(@Parameter(in = ParameterIn.PATH, description = "The deposit specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get Deposit Specifications or Offers", description = "Gets the deposit specifications or offers that match the query criteria.", tags={ "Deposits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The deposit specifications were returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = DepositSpec.class)))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "403", description = "The server understood the request but refuses to authorize it.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "404", description = "The server could not find the requested object.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "409", description = "The request could not be processed due to conflict. An item already exists.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable entity. The server understands the request but is unable to process the instructions.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "503", description = "Service unavailable. The server is currently unable to handle the request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))) })
    @RequestMapping(value = "/depositSpec",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<DepositSpec>> searchDepositSpec(@Parameter(in = ParameterIn.QUERY, description = "The specification name." ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name, @Parameter(in = ParameterIn.QUERY, description = "The specification category." ,schema=@Schema()) @Valid @RequestParam(value = "category", required = false) String category, @Parameter(in = ParameterIn.QUERY, description = "The specification is permitted or not." ,schema=@Schema()) @Valid @RequestParam(value = "permitted", required = false) String permitted, @Parameter(in = ParameterIn.QUERY, description = "The specification status." ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status, @Parameter(in = ParameterIn.QUERY, description = "The specification expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) String expiresAt, @Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) String skip, @Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @Operation(summary = "Update a Deposit Specification", description = "Updates the specified deposit specification.", tags={ "Deposits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The deposit specification was updated successfully."),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "403", description = "The server understood the request but refuses to authorize it.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "404", description = "The server could not find the requested object.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "409", description = "The request could not be processed due to conflict. An item already exists.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable entity. The server understands the request but is unable to process the instructions.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "503", description = "Service unavailable. The server is currently unable to handle the request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))) })
    @RequestMapping(value = "/depositSpec/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<Void> updateDepositSpec(@Parameter(in = ParameterIn.PATH, description = "The deposit specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The deposit specification  to update. The minimum required parameters are&colon;<ul><li><b>name</b></li><li><b>chargeOfferRef</b></li><li><b>profileRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositSpec body);

}
