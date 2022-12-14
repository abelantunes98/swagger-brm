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
public class DisputesApiController implements DisputesApi {

    private static final Logger log = LoggerFactory.getLogger(DisputesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DisputesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> disputeBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the disputed bill.", schema=@Schema()) @Valid @RequestBody DisputeBill body) {
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

    public ResponseEntity<Void> disputeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the event dispute.", schema=@Schema()) @Valid @RequestBody DisputeEvent body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> disputeItem(@Parameter(in = ParameterIn.PATH, description = "The ID of the item to dispute.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the item dispute.", schema=@Schema()) @Valid @RequestBody DisputeItem body) {
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

    public ResponseEntity<NotesInfo> getNotes(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<NotesInfo>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  }\n}", NotesInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<NotesInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<NotesInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ArActionsList>> getOpenDisputes(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get open disputes for.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Expand the list of open disputes. Supported values are&colon;<p><ul><li><b>all</b>&colon; Shows the open disputes for all child accounts. This is the default.</li><li><b>childonly</b>&colon; Shows the open disputes for only the current account.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand) {
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

    public ResponseEntity<List<ArActionsList>> getOpenDisputesForBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill.", required=true, schema=@Schema()) @PathVariable("id") String id) {
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

    public ResponseEntity<SettlementDetails> getSettlementDetails(@Parameter(in = ParameterIn.PATH, description = "The settlement ID or dispute ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The account ID." ,schema=@Schema()) @Valid @RequestParam(value = "accountId", required = false) String accountId,@Parameter(in = ParameterIn.QUERY, description = "The bill unit ID." ,schema=@Schema()) @Valid @RequestParam(value = "billunitId", required = false) String billunitId,@Parameter(in = ParameterIn.QUERY, description = "The bill ID." ,schema=@Schema()) @Valid @RequestParam(value = "billId", required = false) String billId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SettlementDetails>(objectMapper.readValue("{\n  \"itemNumber\" : \"itemNumber\",\n  \"extension\" : { },\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"settlementId\" : \"settlementId\",\n  \"disputedAmount\" : 0.8008281904610115,\n  \"itemId\" : \"itemId\",\n  \"itemName\" : \"itemName\",\n  \"disputeRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"due\" : 1.4658129805029452,\n  \"disputeId\" : \"disputeId\",\n  \"billId\" : \"billId\",\n  \"disputedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"billingEnd\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"billingStart\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"settledDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"settlementAmount\" : 6.027456183070403,\n  \"eventsCount\" : \"eventsCount\",\n  \"billNumber\" : \"billNumber\"\n}", SettlementDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SettlementDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SettlementDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> settleBillDispute(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the settlement. The minimum required parameter is <b>amount</b>.", schema=@Schema()) @Valid @RequestBody SettlementBill body) {
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

    public ResponseEntity<Resource> settleEventDispute(@Parameter(in = ParameterIn.PATH, description = "The ID of the disputed event.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the settlement. The minimum required parameters are&colon; <ul><li><b>accountRef</b></li><li><b>amount</b></li><li><b>events</b></li>", schema=@Schema()) @Valid @RequestBody SettlementEvent body) {
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

    public ResponseEntity<Resource> settleItemDispute(@Parameter(in = ParameterIn.PATH, description = "The ID of the item in dispute.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the settlement. The minimum required parameter is <b>amount</b>.", schema=@Schema()) @Valid @RequestBody SettlementItem body) {
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

}
