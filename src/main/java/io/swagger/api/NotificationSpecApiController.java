package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.EntityRef;
import io.swagger.model.NotificationSpec;
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
public class NotificationSpecApiController implements NotificationSpecApi {

    private static final Logger log = LoggerFactory.getLogger(NotificationSpecApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NotificationSpecApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EntityRef> addNotificationSpec(@Parameter(in = ParameterIn.DEFAULT, description = "The notification specification to create. The minimum required parameters are: <ul> <li><b>name</b></li> <li><b>systemEvent</b></li> <li><b>deliveryMethods</b></li> <li><b>deliverySpec</b></li> </ul>", schema=@Schema()) @Valid @RequestBody NotificationSpec body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EntityRef>(objectMapper.readValue("{\n  \"id\" : \"0.0.0.1+-/account+3255+0\",\n  \"href\" : \"https://host:port/bc/webresources/v1.0/*0.0.0.1+-/account+3255+0\"\n}", EntityRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EntityRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EntityRef>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<NotificationSpec> getNotificationSpecbyId(@Parameter(in = ParameterIn.PATH, description = "The notification specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<NotificationSpec>(objectMapper.readValue("{\n  \"deliveryControlFlag\" : \"NO_DELIVERY_IN_SILENT_PERIOD\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"criteria\" : {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  },\n  \"deliverySpec\" : {\n    \"dayOfWeek\" : 4,\n    \"dayOfMonth\" : 3,\n    \"deliveryPeriodEnd\" : \"deliveryPeriodEnd\",\n    \"deliveryPreference\" : \"IMMEDIATE\",\n    \"deliveryPeriodStart\" : \"deliveryPeriodStart\",\n    \"silentPeriodStart\" : \"silentPeriodStart\",\n    \"silentPeriodEnd\" : \"silentPeriodEnd\"\n  },\n  \"type\" : \"ADVANCE\",\n  \"deliveryMethods\" : [ {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"status\" : \"ACTIVE\"\n  }, {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"status\" : \"ACTIVE\"\n  } ],\n  \"expiresAt\" : \"expiresAt\",\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"scope\" : \"USER\",\n  \"name\" : \"name\",\n  \"startsAt\" : \"startsAt\",\n  \"systemEvent\" : \"systemEvent\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"triggerType\" : \"SYSTEM\",\n  \"category\" : \"category\",\n  \"status\" : \"ACTIVE\",\n  \"advanceNotifications\" : [ {\n    \"offsetUnit\" : \"SECOND\",\n    \"offsetValue\" : \"offsetValue\"\n  }, {\n    \"offsetUnit\" : \"SECOND\",\n    \"offsetValue\" : \"offsetValue\"\n  } ]\n}", NotificationSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<NotificationSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<NotificationSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<NotificationSpec>> searchNotificationSpec(@Parameter(in = ParameterIn.QUERY, description = "The notification specification name." ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name,@Parameter(in = ParameterIn.QUERY, description = "The specification status." ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status,@Parameter(in = ParameterIn.QUERY, description = "The specification expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) String expiresAt,@Parameter(in = ParameterIn.QUERY, description = "The specification trigger type." ,schema=@Schema(allowableValues={ "AUTO", "SYSTEM", "ALL" }
)) @Valid @RequestParam(value = "triggerType", required = false) String triggerType,@Parameter(in = ParameterIn.QUERY, description = "The specification type." ,schema=@Schema(allowableValues={ "ADVANCE", "REALTIME", "POSTEVENT", "ALL" }
)) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.QUERY, description = "The event type." ,schema=@Schema()) @Valid @RequestParam(value = "systemEvent", required = false) String systemEvent,@Parameter(in = ParameterIn.QUERY, description = "The specification scope." ,schema=@Schema(allowableValues={ "USER", "SYSTEM", "ALL" }
)) @Valid @RequestParam(value = "scope", required = false) String scope,@Parameter(in = ParameterIn.QUERY, description = "The delivery method." ,schema=@Schema()) @Valid @RequestParam(value = "deliveryMethod", required = false) String deliveryMethod,@Parameter(in = ParameterIn.QUERY, description = "The specification category." ,schema=@Schema()) @Valid @RequestParam(value = "category", required = false) String category,@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) String skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<NotificationSpec>>(objectMapper.readValue("[ {\n  \"deliveryControlFlag\" : \"NO_DELIVERY_IN_SILENT_PERIOD\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"criteria\" : {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  },\n  \"deliverySpec\" : {\n    \"dayOfWeek\" : 4,\n    \"dayOfMonth\" : 3,\n    \"deliveryPeriodEnd\" : \"deliveryPeriodEnd\",\n    \"deliveryPreference\" : \"IMMEDIATE\",\n    \"deliveryPeriodStart\" : \"deliveryPeriodStart\",\n    \"silentPeriodStart\" : \"silentPeriodStart\",\n    \"silentPeriodEnd\" : \"silentPeriodEnd\"\n  },\n  \"type\" : \"ADVANCE\",\n  \"deliveryMethods\" : [ {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"status\" : \"ACTIVE\"\n  }, {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"status\" : \"ACTIVE\"\n  } ],\n  \"expiresAt\" : \"expiresAt\",\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"scope\" : \"USER\",\n  \"name\" : \"name\",\n  \"startsAt\" : \"startsAt\",\n  \"systemEvent\" : \"systemEvent\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"triggerType\" : \"SYSTEM\",\n  \"category\" : \"category\",\n  \"status\" : \"ACTIVE\",\n  \"advanceNotifications\" : [ {\n    \"offsetUnit\" : \"SECOND\",\n    \"offsetValue\" : \"offsetValue\"\n  }, {\n    \"offsetUnit\" : \"SECOND\",\n    \"offsetValue\" : \"offsetValue\"\n  } ]\n}, {\n  \"deliveryControlFlag\" : \"NO_DELIVERY_IN_SILENT_PERIOD\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"criteria\" : {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  },\n  \"deliverySpec\" : {\n    \"dayOfWeek\" : 4,\n    \"dayOfMonth\" : 3,\n    \"deliveryPeriodEnd\" : \"deliveryPeriodEnd\",\n    \"deliveryPreference\" : \"IMMEDIATE\",\n    \"deliveryPeriodStart\" : \"deliveryPeriodStart\",\n    \"silentPeriodStart\" : \"silentPeriodStart\",\n    \"silentPeriodEnd\" : \"silentPeriodEnd\"\n  },\n  \"type\" : \"ADVANCE\",\n  \"deliveryMethods\" : [ {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"status\" : \"ACTIVE\"\n  }, {\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"status\" : \"ACTIVE\"\n  } ],\n  \"expiresAt\" : \"expiresAt\",\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"scope\" : \"USER\",\n  \"name\" : \"name\",\n  \"startsAt\" : \"startsAt\",\n  \"systemEvent\" : \"systemEvent\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"triggerType\" : \"SYSTEM\",\n  \"category\" : \"category\",\n  \"status\" : \"ACTIVE\",\n  \"advanceNotifications\" : [ {\n    \"offsetUnit\" : \"SECOND\",\n    \"offsetValue\" : \"offsetValue\"\n  }, {\n    \"offsetUnit\" : \"SECOND\",\n    \"offsetValue\" : \"offsetValue\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<NotificationSpec>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<NotificationSpec>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EntityRef> updateNotificationSpec(@Parameter(in = ParameterIn.PATH, description = "The notification specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The notification specification to update. The minimum required parameters are&colon; <ul><li><b>name</b></li></ul>", schema=@Schema()) @Valid @RequestBody NotificationSpec body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EntityRef>(objectMapper.readValue("{\n  \"id\" : \"0.0.0.1+-/account+3255+0\",\n  \"href\" : \"https://host:port/bc/webresources/v1.0/*0.0.0.1+-/account+3255+0\"\n}", EntityRef.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EntityRef>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EntityRef>(HttpStatus.NOT_IMPLEMENTED);
    }

}
