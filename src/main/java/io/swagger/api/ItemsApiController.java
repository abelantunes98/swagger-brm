package io.swagger.api;

import io.swagger.model.ArActionsList;
import io.swagger.model.BillDetails;
import io.swagger.model.BillItem;
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
public class ItemsApiController implements ItemsApi {

    private static final Logger log = LoggerFactory.getLogger(ItemsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ItemsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ArActionsList>> getARActions1(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill item.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ArActionsList>>(objectMapper.readValue("[ {\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"arActionAmount\" : 6.027456183070403,\n  \"accountNumber\" : \"accountNumber\",\n  \"billingStatus\" : 5,\n  \"firstName\" : \"firstName\",\n  \"arUnallocatedAmount\" : 1.4658129805029452,\n  \"arActionId\" : \"arActionId\",\n  \"itemName\" : \"itemName\",\n  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"billID\" : \"billID\",\n  \"billUnitName\" : \"billUnitName\",\n  \"arActionType\" : 0,\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"arActionAmount\" : 6.027456183070403,\n  \"accountNumber\" : \"accountNumber\",\n  \"billingStatus\" : 5,\n  \"firstName\" : \"firstName\",\n  \"arUnallocatedAmount\" : 1.4658129805029452,\n  \"arActionId\" : \"arActionId\",\n  \"itemName\" : \"itemName\",\n  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"billID\" : \"billID\",\n  \"billUnitName\" : \"billUnitName\",\n  \"arActionType\" : 0,\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ArActionsList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ArActionsList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> getARItemNo(@Parameter(in = ParameterIn.PATH, description = "The ID for the internal A/R item, such as 0.0.0.1+-item-adjustment+293824691314016398.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<BillDetails> getBillItemDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The accepted values are&colon;<ul><li><b>parentonly</b> retrieves only charges made by the parent.</li><li><b>childonly</b> retrieves only the child charges.</li><li><b>all</b> retrieves charges from the parent and all children.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand,@Parameter(in = ParameterIn.QUERY, description = "The service ID, which could be a login ID or a device ID to get specific items for that service. The default is to return all services." ,schema=@Schema()) @Valid @RequestParam(value = "serviceID", required = false) String serviceID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BillDetails>(objectMapper.readValue("{\n  \"itemsAffectedCount\" : 2,\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dueAmount\" : 5.637376656633329,\n  \"billId\" : \"billId\",\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"itemsAffected\" : [ {\n    \"amount\" : 7.061401241503109,\n    \"item\" : \"item\",\n    \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"settledNonTaxedAmount\" : 2.027123023002322,\n    \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"settledTaxAmount\" : 9.301444243932576,\n    \"settledTaxedAmount\" : 3.616076749251911,\n    \"accountNumber\" : \"accountNumber\",\n    \"billNumber\" : \"billNumber\",\n    \"billUnitId\" : \"billUnitId\"\n  }, {\n    \"amount\" : 7.061401241503109,\n    \"item\" : \"item\",\n    \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"settledNonTaxedAmount\" : 2.027123023002322,\n    \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"settledTaxAmount\" : 9.301444243932576,\n    \"settledTaxedAmount\" : 3.616076749251911,\n    \"accountNumber\" : \"accountNumber\",\n    \"billNumber\" : \"billNumber\",\n    \"billUnitId\" : \"billUnitId\"\n  } ],\n  \"accountNumber\" : \"accountNumber\",\n  \"billUnitId\" : \"billUnitId\"\n}", BillDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BillDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BillDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<BillItem>> getBillItems(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+123123, to get bill items for.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of bill items to retrieve: <ul><li><b>open</b> retrieves all bill items regardless of the due date.</li><li><b>past</b> retrieves only bill items whose due date has already passed.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.QUERY, description = "The number of bill items to return." ,schema=@Schema()) @Valid @RequestParam(value = "count", required = false) Integer count,@Parameter(in = ParameterIn.QUERY, description = "The additional details to include in the response. Enter <b>all</b> to return bill items for the parent account and all of its child accounts. Enter <b>childonly</b> to return bill items for only the child accounts associated with a parent account." ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<BillItem>>(objectMapper.readValue("[ {\n  \"transfered\" : 2.027123023002322,\n  \"writeoff\" : 4.145608029883936,\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountName\" : \"accountName\",\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"discount\" : 1.2315135367772556,\n  \"itemNo\" : \"itemNo\",\n  \"type\" : \"type\",\n  \"login\" : \"login\",\n  \"billInfoId\" : \"billInfoId\",\n  \"aliasList\" : [ {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  }, {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  } ],\n  \"currency\" : 5,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"disputed\" : 2.3021358869347655,\n  \"amount\" : 7.386281948385884,\n  \"adjusted\" : 7.061401241503109,\n  \"received\" : 3.616076749251911,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"accountNumber\" : \"accountNumber\",\n  \"firstName\" : \"firstName\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 9.301444243932576,\n  \"name\" : \"name\",\n  \"deltaDue\" : 5.637376656633329,\n  \"serviceTypeName\" : \"serviceTypeName\",\n  \"status\" : \"status\"\n}, {\n  \"transfered\" : 2.027123023002322,\n  \"writeoff\" : 4.145608029883936,\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountName\" : \"accountName\",\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"discount\" : 1.2315135367772556,\n  \"itemNo\" : \"itemNo\",\n  \"type\" : \"type\",\n  \"login\" : \"login\",\n  \"billInfoId\" : \"billInfoId\",\n  \"aliasList\" : [ {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  }, {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  } ],\n  \"currency\" : 5,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"disputed\" : 2.3021358869347655,\n  \"amount\" : 7.386281948385884,\n  \"adjusted\" : 7.061401241503109,\n  \"received\" : 3.616076749251911,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"accountNumber\" : \"accountNumber\",\n  \"firstName\" : \"firstName\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 9.301444243932576,\n  \"name\" : \"name\",\n  \"deltaDue\" : 5.637376656633329,\n  \"serviceTypeName\" : \"serviceTypeName\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<BillItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<BillItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<BillItem>> getIndividualBillItems(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of bill items to retrieve: <b>open</b> or <b>past</b>. Open retrieves all bill items irrespective of the due date. Past retrieves only the bill items whose due date has passed." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.QUERY, description = "The number of bill items to retrieve." ,schema=@Schema()) @Valid @RequestParam(value = "count", required = false) Integer count,@Parameter(in = ParameterIn.QUERY, description = "Whether to retreive the bill items for the parent bill unit and its child bill units (<b>all</b>) or just the child bill units (<b>childonly</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<BillItem>>(objectMapper.readValue("[ {\n  \"transfered\" : 2.027123023002322,\n  \"writeoff\" : 4.145608029883936,\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountName\" : \"accountName\",\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"discount\" : 1.2315135367772556,\n  \"itemNo\" : \"itemNo\",\n  \"type\" : \"type\",\n  \"login\" : \"login\",\n  \"billInfoId\" : \"billInfoId\",\n  \"aliasList\" : [ {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  }, {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  } ],\n  \"currency\" : 5,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"disputed\" : 2.3021358869347655,\n  \"amount\" : 7.386281948385884,\n  \"adjusted\" : 7.061401241503109,\n  \"received\" : 3.616076749251911,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"accountNumber\" : \"accountNumber\",\n  \"firstName\" : \"firstName\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 9.301444243932576,\n  \"name\" : \"name\",\n  \"deltaDue\" : 5.637376656633329,\n  \"serviceTypeName\" : \"serviceTypeName\",\n  \"status\" : \"status\"\n}, {\n  \"transfered\" : 2.027123023002322,\n  \"writeoff\" : 4.145608029883936,\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountName\" : \"accountName\",\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"discount\" : 1.2315135367772556,\n  \"itemNo\" : \"itemNo\",\n  \"type\" : \"type\",\n  \"login\" : \"login\",\n  \"billInfoId\" : \"billInfoId\",\n  \"aliasList\" : [ {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  }, {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  } ],\n  \"currency\" : 5,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"disputed\" : 2.3021358869347655,\n  \"amount\" : 7.386281948385884,\n  \"adjusted\" : 7.061401241503109,\n  \"received\" : 3.616076749251911,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"accountNumber\" : \"accountNumber\",\n  \"firstName\" : \"firstName\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 9.301444243932576,\n  \"name\" : \"name\",\n  \"deltaDue\" : 5.637376656633329,\n  \"serviceTypeName\" : \"serviceTypeName\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<BillItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<BillItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<BillItem>> getItemsForBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of bill items to retrieve:<ul><li><b>open</b> retrieves all open bill items.</li><li><b>pending</b> retrieves all pending bill items.</li><li><b>closed</b> retrieves all closed bill items.</li><li><b>all</b> retrieves all bill items. This is the default.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<BillItem>>(objectMapper.readValue("[ {\n  \"transfered\" : 2.027123023002322,\n  \"writeoff\" : 4.145608029883936,\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountName\" : \"accountName\",\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"discount\" : 1.2315135367772556,\n  \"itemNo\" : \"itemNo\",\n  \"type\" : \"type\",\n  \"login\" : \"login\",\n  \"billInfoId\" : \"billInfoId\",\n  \"aliasList\" : [ {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  }, {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  } ],\n  \"currency\" : 5,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"disputed\" : 2.3021358869347655,\n  \"amount\" : 7.386281948385884,\n  \"adjusted\" : 7.061401241503109,\n  \"received\" : 3.616076749251911,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"accountNumber\" : \"accountNumber\",\n  \"firstName\" : \"firstName\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 9.301444243932576,\n  \"name\" : \"name\",\n  \"deltaDue\" : 5.637376656633329,\n  \"serviceTypeName\" : \"serviceTypeName\",\n  \"status\" : \"status\"\n}, {\n  \"transfered\" : 2.027123023002322,\n  \"writeoff\" : 4.145608029883936,\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountName\" : \"accountName\",\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"discount\" : 1.2315135367772556,\n  \"itemNo\" : \"itemNo\",\n  \"type\" : \"type\",\n  \"login\" : \"login\",\n  \"billInfoId\" : \"billInfoId\",\n  \"aliasList\" : [ {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  }, {\n    \"elem\" : 6,\n    \"name\" : \"name\"\n  } ],\n  \"currency\" : 5,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"disputed\" : 2.3021358869347655,\n  \"amount\" : 7.386281948385884,\n  \"adjusted\" : 7.061401241503109,\n  \"received\" : 3.616076749251911,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"accountNumber\" : \"accountNumber\",\n  \"firstName\" : \"firstName\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 9.301444243932576,\n  \"name\" : \"name\",\n  \"deltaDue\" : 5.637376656633329,\n  \"serviceTypeName\" : \"serviceTypeName\",\n  \"status\" : \"status\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<BillItem>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<BillItem>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
