package io.swagger.api;

import io.swagger.model.FullRefund;
import io.swagger.model.PartialRefund;
import io.swagger.model.RefundBills;
import io.swagger.model.RefundDetails;
import io.swagger.model.RefundableItems;
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
public class RefundsApiController implements RefundsApi {

    private static final Logger log = LoggerFactory.getLogger(RefundsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RefundsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> fullBillRefund(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill to refund.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the refund.", schema=@Schema()) @Valid @RequestBody FullRefund body) {
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

    public ResponseEntity<RefundDetails> getRefundDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the refund, such as 0.0.0.1+-item-refund+294950591220927922.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RefundDetails>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"refundMethod\" : \"refundMethod\",\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"refundStatus\" : 0,\n  \"refundType\" : 1,\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"details\" : [ {\n    \"scaledAmount\" : 4.678948,\n    \"balanceImpactResource\" : \"balanceImpactResource\",\n    \"fixedPriceTag\" : \"fixedPriceTag\",\n    \"fixedAmount\" : 1.0414449,\n    \"scaledPriceTag\" : \"scaledPriceTag\"\n  }, {\n    \"scaledAmount\" : 4.678948,\n    \"balanceImpactResource\" : \"balanceImpactResource\",\n    \"fixedPriceTag\" : \"fixedPriceTag\",\n    \"fixedAmount\" : 1.0414449,\n    \"scaledPriceTag\" : \"scaledPriceTag\"\n  } ],\n  \"id\" : \"id\",\n  \"accountRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"billNo\" : \"billNo\",\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"refundAmount\" : 6.027456183070403\n}", RefundDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RefundDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RefundDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<RefundableItems>> getRefundableItems(@Parameter(in = ParameterIn.PATH, description = "The account ID for the refundable items.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<RefundableItems>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"arActionId\" : \"arActionId\",\n  \"amount\" : 0.8008281904610115,\n  \"billUnitName\" : \"billUnitName\",\n  \"type\" : \"type\",\n  \"billRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}, {\n  \"extension\" : { },\n  \"arActionId\" : \"arActionId\",\n  \"amount\" : 0.8008281904610115,\n  \"billUnitName\" : \"billUnitName\",\n  \"type\" : \"type\",\n  \"billRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<RefundableItems>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<RefundableItems>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> partialBillRefund(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill for the partial refund.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the partial refund.", schema=@Schema()) @Valid @RequestBody PartialRefund body) {
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

    public ResponseEntity<Void> refundAccount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to refund.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the refund.", schema=@Schema()) @Valid @RequestBody FullRefund body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> refundMultipleBills(@Parameter(in = ParameterIn.DEFAULT, description = "Details about the bills to refund.", schema=@Schema()) @Valid @RequestBody RefundBills body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
