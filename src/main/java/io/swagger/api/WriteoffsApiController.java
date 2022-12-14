package io.swagger.api;

import io.swagger.model.ArActionsList;
import io.swagger.model.ReverseWriteoff;
import io.swagger.model.WriteOffDetails;
import io.swagger.model.Writeoff;
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
public class WriteoffsApiController implements WriteoffsApi {

    private static final Logger log = LoggerFactory.getLogger(WriteoffsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WriteoffsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ArActionsList>> getAccountWriteOffDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+296516.", required=true, schema=@Schema()) @PathVariable("id") String id) {
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

    public ResponseEntity<WriteOffDetails> getWriteOffDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the write off, such as 0.0.0.1+-item-writeoff+296516295779285649.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WriteOffDetails>(objectMapper.readValue("{\n  \"writeoffType\" : 0,\n  \"itemNumber\" : \"itemNumber\",\n  \"extension\" : { },\n  \"notes\" : [ {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  }, {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  } ],\n  \"accountNumber\" : \"accountNumber\",\n  \"actionAffectsRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"writeoffAmount\" : 6.027456183070403,\n  \"reversalAmount\" : 1.4658129805029452,\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"itemName\" : \"itemName\",\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"reversalId\" : \"reversalId\",\n  \"billUnitName\" : \"billUnitName\",\n  \"writeoffID\" : \"writeoffID\",\n  \"billNumber\" : \"billNumber\",\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"reversalEffectiveDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}", WriteOffDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WriteOffDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WriteOffDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> writeOffReverse(@Parameter(in = ParameterIn.PATH, description = "The ID of the account.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The write-off reversal to create. The minimum required parameters are&colon;<p> <ul><li><b>effective</b></li><li><b>notes</b></li></ul>", schema=@Schema()) @Valid @RequestBody ReverseWriteoff body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> writeoffAccount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to write off.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The write off details. The minimum required parameters are&colon;<ul><li><b>inactivateAccount</b></li><li><b>effective</b></li><li><b>notes</b></li><li><b>writeoffTax</b></li></ul>For write-off reversals, the account is required.", schema=@Schema()) @Valid @RequestBody Writeoff body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Writeoff> writeoffBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill to write off.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The write off details.", schema=@Schema()) @Valid @RequestBody Writeoff body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Writeoff>(objectMapper.readValue("{\n  \"effective\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"extension\" : { },\n  \"writeoffTax\" : true,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"inactivateAccount\" : false,\n  \"actionAffectsRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}", Writeoff.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Writeoff>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Writeoff>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Writeoff> writeoffItem(@Parameter(in = ParameterIn.PATH, description = "The ID of the item to write off.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The write off details.", schema=@Schema()) @Valid @RequestBody Writeoff body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Writeoff>(objectMapper.readValue("{\n  \"effective\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"extension\" : { },\n  \"writeoffTax\" : true,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"inactivateAccount\" : false,\n  \"actionAffectsRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}", Writeoff.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Writeoff>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Writeoff>(HttpStatus.NOT_IMPLEMENTED);
    }

}
