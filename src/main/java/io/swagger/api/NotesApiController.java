package io.swagger.api;

import io.swagger.model.Notes;
import io.swagger.model.NotesInfo;
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
public class NotesApiController implements NotesApi {

    private static final Logger log = LoggerFactory.getLogger(NotesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NotesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<NotesInfo> createNotes(@Parameter(in = ParameterIn.DEFAULT, description = "Details about the new note or follow-up comment. The minimum required parameters are&colon;<ul><li><b>notes</b><ul><li><b>accountId</b></li><li>For new notes only, you must also include the <b>type</b> and <b>subtype</b> parameters</li></ul>", schema=@Schema()) @Valid @RequestBody NotesInfo body) {
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

    public ResponseEntity<NotesInfo> getAllNotes(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The start date of the notes in milliseconds, such as 1444209849879. This parameter is optional." ,schema=@Schema()) @Valid @RequestParam(value = "starts", required = false) String starts,@Parameter(in = ParameterIn.QUERY, description = "The end date of the notes in milliseconds, such as 1444209849879. This parameter is optional." ,schema=@Schema()) @Valid @RequestParam(value = "ends", required = false) String ends) {
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

    public ResponseEntity<Notes> getAllNotesforItemId(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill item, such as 0.0.0.1+-item-payment+295196881825603320.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Notes>(objectMapper.readValue("{\n  \"eventId\" : \"eventId\",\n  \"extension\" : { },\n  \"amount\" : 0.8008281904610115,\n  \"comments\" : [ {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  }, {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  } ],\n  \"count\" : 6,\n  \"type\" : 5,\n  \"domainId\" : 5,\n  \"accountId\" : \"accountId\",\n  \"itemId\" : \"itemId\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"reasonId\" : 2,\n  \"billId\" : \"billId\",\n  \"header\" : \"header\",\n  \"subType\" : 1,\n  \"id\" : \"id\",\n  \"billUnitId\" : \"billUnitId\",\n  \"serviceId\" : \"serviceId\",\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"status\" : 7.061401241503109\n}", Notes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Notes> getAllNotesforTransactionId(@Parameter(in = ParameterIn.PATH, description = "The transaction ID of the payment, such as T1,a,0.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Notes>(objectMapper.readValue("{\n  \"eventId\" : \"eventId\",\n  \"extension\" : { },\n  \"amount\" : 0.8008281904610115,\n  \"comments\" : [ {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  }, {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  } ],\n  \"count\" : 6,\n  \"type\" : 5,\n  \"domainId\" : 5,\n  \"accountId\" : \"accountId\",\n  \"itemId\" : \"itemId\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"reasonId\" : 2,\n  \"billId\" : \"billId\",\n  \"header\" : \"header\",\n  \"subType\" : 1,\n  \"id\" : \"id\",\n  \"billUnitId\" : \"billUnitId\",\n  \"serviceId\" : \"serviceId\",\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"status\" : 7.061401241503109\n}", Notes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Notes>> getNotesforAccount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get the notes for. For example, <b>0.0.0.1+-account+1117902</b>.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Notes>>(objectMapper.readValue("[ {\n  \"eventId\" : \"eventId\",\n  \"extension\" : { },\n  \"amount\" : 0.8008281904610115,\n  \"comments\" : [ {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  }, {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  } ],\n  \"count\" : 6,\n  \"type\" : 5,\n  \"domainId\" : 5,\n  \"accountId\" : \"accountId\",\n  \"itemId\" : \"itemId\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"reasonId\" : 2,\n  \"billId\" : \"billId\",\n  \"header\" : \"header\",\n  \"subType\" : 1,\n  \"id\" : \"id\",\n  \"billUnitId\" : \"billUnitId\",\n  \"serviceId\" : \"serviceId\",\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"status\" : 7.061401241503109\n}, {\n  \"eventId\" : \"eventId\",\n  \"extension\" : { },\n  \"amount\" : 0.8008281904610115,\n  \"comments\" : [ {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  }, {\n    \"csrLastName\" : \"csrLastName\",\n    \"externalUser\" : \"externalUser\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"csrLoginId\" : \"csrLoginId\",\n    \"csrFirstName\" : \"csrFirstName\",\n    \"csrAccountId\" : \"csrAccountId\",\n    \"comment\" : \"comment\",\n    \"trackingId\" : \"trackingId\"\n  } ],\n  \"count\" : 6,\n  \"type\" : 5,\n  \"domainId\" : 5,\n  \"accountId\" : \"accountId\",\n  \"itemId\" : \"itemId\",\n  \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"reasonId\" : 2,\n  \"billId\" : \"billId\",\n  \"header\" : \"header\",\n  \"subType\" : 1,\n  \"id\" : \"id\",\n  \"billUnitId\" : \"billUnitId\",\n  \"serviceId\" : \"serviceId\",\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"status\" : 7.061401241503109\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Notes>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Notes>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
