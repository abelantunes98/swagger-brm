/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Bill;
import io.swagger.model.BillItem;
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
public interface AllocationsApi {

    @Operation(summary = "Allocate an Adjustment to Bills", description = "Allocates the specified adjustment to a set of bills.", tags={ "Allocations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The adjustment was successfully allocated to the bills."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/allocations/adjustment/{id}/bills",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> billLevelAdjustmentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the adjustment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The list of bills to allocate the adjustment to. The minimum required parameters are&colon;<ul><li><b>accountRef</b><ul><li><b>id</b></li></ul></li><li><b>billPaidDate</b></li><li><b>creationDate</b></li><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<Bill> body);


    @Operation(summary = "Allocate a Payment to Bills", description = "Allocates a payment to one or more bills that you specify.", tags={ "Allocations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The payment was allocated to the bills successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred") })
    @RequestMapping(value = "/allocations/payment/{id}/bills",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> billLevelPaymentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "The list of bills containing an allocated amount, the account ID, and the bill unit ID. The minimum required parameter are&colon;<ul><li><b>amount</b></li><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<Bill> body);


    @Operation(summary = "Allocate an Adjustment to A/R Items", description = "Allocates the specified adjustment to a set of A/R items. This operation accepts bills against which the allocation needs to be done.", tags={ "Allocations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "The adjustment was allocated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/allocations/adjustment/{id}/items",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> itemLevelAdjustmentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the adjustment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Details about the allocation. The minimum required parameters are&colon;<ul><li><b>amount</b></li><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<BillItem> body);


    @Operation(summary = "Allocate a Payment to Bill Items", description = "Allocates a payment to one or more bill items.", tags={ "Allocations" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The payment was allocated successfully."),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.") })
    @RequestMapping(value = "/allocations/payment/{id}/items",
        consumes = { "application/xml", "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> itemLevelPaymentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "A list of bill items containing an allocated amount, the account ID, and the bill item ID. The minimum required parameters are&colon;<ul><li><b>amount</b><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<BillItem> body);

}
