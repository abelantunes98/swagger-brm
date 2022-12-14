package io.swagger.api;

import io.swagger.model.AdjustmentAccount;
import io.swagger.model.AdjustmentBill;
import io.swagger.model.AdjustmentDetails;
import io.swagger.model.AdjustmentEvent;
import io.swagger.model.AdjustmentItem;
import io.swagger.model.AdjustmentNonCurrencyBalance;
import io.swagger.model.ArActionsList;
import org.springframework.core.io.Resource;
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
public class AdjustmentsApiController implements AdjustmentsApi {

    private static final Logger log = LoggerFactory.getLogger(AdjustmentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AdjustmentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> adjustAccount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to adjust.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the account-level adjustment. The minimum required parameter is <b>amount</b>.", schema=@Schema()) @Valid @RequestBody AdjustmentAccount body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("{\n  \"reference\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"extension\" : { }\n}", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdjustmentBill> adjustBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill to adjust.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the adjustment. The minimum required parameter is <b>amount</b>.", schema=@Schema()) @Valid @RequestBody AdjustmentBill body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdjustmentBill>(objectMapper.readValue("{\n  \"includeTax\" : true,\n  \"effective\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"extension\" : { },\n  \"amount\" : 0.8008281904610115,\n  \"resourceId\" : 6,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"amountIsCredit\" : true,\n  \"billItem\" : [ {\n    \"transfered\" : 2.027123023002322,\n    \"writeoff\" : 4.145608029883936,\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"accountName\" : \"accountName\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"discount\" : 1.2315135367772556,\n    \"itemNo\" : \"itemNo\",\n    \"type\" : \"type\",\n    \"login\" : \"login\",\n    \"billInfoId\" : \"billInfoId\",\n    \"aliasList\" : [ {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    }, {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    } ],\n    \"currency\" : 5,\n    \"id\" : \"id\",\n    \"billNo\" : \"billNo\",\n    \"disputed\" : 2.3021358869347655,\n    \"amount\" : 7.386281948385884,\n    \"adjusted\" : 7.061401241503109,\n    \"received\" : 3.616076749251911,\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"accountNumber\" : \"accountNumber\",\n    \"firstName\" : \"firstName\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"due\" : 9.301444243932576,\n    \"name\" : \"name\",\n    \"deltaDue\" : 5.637376656633329,\n    \"serviceTypeName\" : \"serviceTypeName\",\n    \"status\" : \"status\"\n  }, {\n    \"transfered\" : 2.027123023002322,\n    \"writeoff\" : 4.145608029883936,\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"accountName\" : \"accountName\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"discount\" : 1.2315135367772556,\n    \"itemNo\" : \"itemNo\",\n    \"type\" : \"type\",\n    \"login\" : \"login\",\n    \"billInfoId\" : \"billInfoId\",\n    \"aliasList\" : [ {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    }, {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    } ],\n    \"currency\" : 5,\n    \"id\" : \"id\",\n    \"billNo\" : \"billNo\",\n    \"disputed\" : 2.3021358869347655,\n    \"amount\" : 7.386281948385884,\n    \"adjusted\" : 7.061401241503109,\n    \"received\" : 3.616076749251911,\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"accountNumber\" : \"accountNumber\",\n    \"firstName\" : \"firstName\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"due\" : 9.301444243932576,\n    \"name\" : \"name\",\n    \"deltaDue\" : 5.637376656633329,\n    \"serviceTypeName\" : \"serviceTypeName\",\n    \"status\" : \"status\"\n  } ],\n  \"actionAffectsRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"percent\" : 1.4658129805029452\n}", AdjustmentBill.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdjustmentBill>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdjustmentBill>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdjustmentEvent> adjustEvent(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the event-level adjustment. The minimum required parameters are&colon;<ul><li><b>accountRef</b><ul><li><b>id</b></li></ul></li><li><b>amount</b></li><li><b>events</b><ul><li><b>eventRef</b><ul><li><b>id</b></li></ul></li></ul></li></ul>", schema=@Schema()) @Valid @RequestBody AdjustmentEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdjustmentEvent>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"amount\" : 0.8008281904610115,\n  \"resourceId\" : 6,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"amountIsCredit\" : true,\n  \"actionAffectsRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"percent\" : 1.4658129805029452,\n  \"includeTax\" : true,\n  \"effective\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"billItem\" : [ {\n    \"transfered\" : 2.027123023002322,\n    \"writeoff\" : 4.145608029883936,\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"accountName\" : \"accountName\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"discount\" : 1.2315135367772556,\n    \"itemNo\" : \"itemNo\",\n    \"type\" : \"type\",\n    \"login\" : \"login\",\n    \"billInfoId\" : \"billInfoId\",\n    \"aliasList\" : [ {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    }, {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    } ],\n    \"currency\" : 5,\n    \"id\" : \"id\",\n    \"billNo\" : \"billNo\",\n    \"disputed\" : 2.3021358869347655,\n    \"amount\" : 7.386281948385884,\n    \"adjusted\" : 7.061401241503109,\n    \"received\" : 3.616076749251911,\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"accountNumber\" : \"accountNumber\",\n    \"firstName\" : \"firstName\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"due\" : 9.301444243932576,\n    \"name\" : \"name\",\n    \"deltaDue\" : 5.637376656633329,\n    \"serviceTypeName\" : \"serviceTypeName\",\n    \"status\" : \"status\"\n  }, {\n    \"transfered\" : 2.027123023002322,\n    \"writeoff\" : 4.145608029883936,\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"accountName\" : \"accountName\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"discount\" : 1.2315135367772556,\n    \"itemNo\" : \"itemNo\",\n    \"type\" : \"type\",\n    \"login\" : \"login\",\n    \"billInfoId\" : \"billInfoId\",\n    \"aliasList\" : [ {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    }, {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    } ],\n    \"currency\" : 5,\n    \"id\" : \"id\",\n    \"billNo\" : \"billNo\",\n    \"disputed\" : 2.3021358869347655,\n    \"amount\" : 7.386281948385884,\n    \"adjusted\" : 7.061401241503109,\n    \"received\" : 3.616076749251911,\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"accountNumber\" : \"accountNumber\",\n    \"firstName\" : \"firstName\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"due\" : 9.301444243932576,\n    \"name\" : \"name\",\n    \"deltaDue\" : 5.637376656633329,\n    \"serviceTypeName\" : \"serviceTypeName\",\n    \"status\" : \"status\"\n  } ],\n  \"appliesToTotalOfAllEvents\" : true,\n  \"taxType\" : 5,\n  \"events\" : {\n    \"eventRef\" : [ null, null ]\n  }\n}", AdjustmentEvent.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdjustmentEvent>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdjustmentEvent>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdjustmentBill> adjustItem(@Parameter(in = ParameterIn.PATH, description = "The ID of the A/R item.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the item-level adjustment. The minimum required parameter is&colon; <b>amount</b>.", schema=@Schema()) @Valid @RequestBody AdjustmentItem body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdjustmentBill>(objectMapper.readValue("{\n  \"includeTax\" : true,\n  \"effective\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"extension\" : { },\n  \"amount\" : 0.8008281904610115,\n  \"resourceId\" : 6,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"amountIsCredit\" : true,\n  \"billItem\" : [ {\n    \"transfered\" : 2.027123023002322,\n    \"writeoff\" : 4.145608029883936,\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"accountName\" : \"accountName\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"discount\" : 1.2315135367772556,\n    \"itemNo\" : \"itemNo\",\n    \"type\" : \"type\",\n    \"login\" : \"login\",\n    \"billInfoId\" : \"billInfoId\",\n    \"aliasList\" : [ {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    }, {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    } ],\n    \"currency\" : 5,\n    \"id\" : \"id\",\n    \"billNo\" : \"billNo\",\n    \"disputed\" : 2.3021358869347655,\n    \"amount\" : 7.386281948385884,\n    \"adjusted\" : 7.061401241503109,\n    \"received\" : 3.616076749251911,\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"accountNumber\" : \"accountNumber\",\n    \"firstName\" : \"firstName\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"due\" : 9.301444243932576,\n    \"name\" : \"name\",\n    \"deltaDue\" : 5.637376656633329,\n    \"serviceTypeName\" : \"serviceTypeName\",\n    \"status\" : \"status\"\n  }, {\n    \"transfered\" : 2.027123023002322,\n    \"writeoff\" : 4.145608029883936,\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"accountName\" : \"accountName\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"discount\" : 1.2315135367772556,\n    \"itemNo\" : \"itemNo\",\n    \"type\" : \"type\",\n    \"login\" : \"login\",\n    \"billInfoId\" : \"billInfoId\",\n    \"aliasList\" : [ {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    }, {\n      \"elem\" : 6,\n      \"name\" : \"name\"\n    } ],\n    \"currency\" : 5,\n    \"id\" : \"id\",\n    \"billNo\" : \"billNo\",\n    \"disputed\" : 2.3021358869347655,\n    \"amount\" : 7.386281948385884,\n    \"adjusted\" : 7.061401241503109,\n    \"received\" : 3.616076749251911,\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"accountNumber\" : \"accountNumber\",\n    \"firstName\" : \"firstName\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"due\" : 9.301444243932576,\n    \"name\" : \"name\",\n    \"deltaDue\" : 5.637376656633329,\n    \"serviceTypeName\" : \"serviceTypeName\",\n    \"status\" : \"status\"\n  } ],\n  \"actionAffectsRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"percent\" : 1.4658129805029452\n}", AdjustmentBill.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdjustmentBill>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdjustmentBill>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> adjustNonCurrencyBalance(@Parameter(in = ParameterIn.DEFAULT, description = "Details about the adjustment. The minimum required parameters are&colon; <ul><li><b>accountRef</b><ul><li><b>id</b></li></ul></li><li><b>amount</b></li><li><b>balanceGroupRef</b><ul><li><b>id</b></li></ul></li><li><b>validFrom</b></li><li><b>validTo</b></li></ul>", schema=@Schema()) @Valid @RequestBody AdjustmentNonCurrencyBalance body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("{\n  \"reference\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"extension\" : { }\n}", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AdjustmentDetails> getAdjustmentDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the adjustment, such as 0.0.0.1+-item-adjustment+73707.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AdjustmentDetails>(objectMapper.readValue("{\n  \"billDetails\" : [ {\n    \"itemsAffectedCount\" : 2,\n    \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueAmount\" : 5.637376656633329,\n    \"billId\" : \"billId\",\n    \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"itemsAffected\" : [ {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    }, {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    } ],\n    \"accountNumber\" : \"accountNumber\",\n    \"billUnitId\" : \"billUnitId\"\n  }, {\n    \"itemsAffectedCount\" : 2,\n    \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueAmount\" : 5.637376656633329,\n    \"billId\" : \"billId\",\n    \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"itemsAffected\" : [ {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    }, {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    } ],\n    \"accountNumber\" : \"accountNumber\",\n    \"billUnitId\" : \"billUnitId\"\n  } ],\n  \"allocatedAmount\" : 6.027456183070403,\n  \"accountId\" : \"accountId\",\n  \"extension\" : { },\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"adjustmentId\" : \"adjustmentId\",\n  \"unallocatedAmount\" : 1.4658129805029452,\n  \"taxAmount\" : 5.962133916683182,\n  \"originalAdjustmentAmount\" : 0.8008281904610115,\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}", AdjustmentDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AdjustmentDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AdjustmentDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ArActionsList>> getAdjustments(@Parameter(in = ParameterIn.PATH, description = "The ID of the account.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of adjustments to retrieve. The type can be&colon;<ul><li><b>unallocated</b>&colon; Gets only unallocated adjustments.</li><li><b>allocated</b>&colon; Gets only allocated adjustments.</li><li><b>all</b>&colon; Gets all adjustments. This is the default.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
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

    public ResponseEntity<Void> getAdjustmentsForBillUnit(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of adjustments to retrieve. The type can be&colon;<ul><li><b>unallocated</b>&colon; Gets only unallocated adjustments.</li><li><b>allocated</b>&colon; Gets only allocated adjustments.</li><li><b>all</b>&colon; Gets all adjustments. This is the default.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
