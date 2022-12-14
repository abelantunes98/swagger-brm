/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.NotificationEvent;
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
public interface NotificationEventApi {

    @Operation(summary = "Get Notification Events", description = "Gets the notification events that match the specified query criteria.", tags={ "Notifications" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The notification events were returned successfully.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = NotificationEvent.class)))),
        
        @ApiResponse(responseCode = "400", description = "The request isn't valid.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "401", description = "Unauthorized request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "403", description = "The server understood the request but refuses to authorize it.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "404", description = "The server could not find the requested object.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "409", description = "The request could not be processed due to conflict. An item already exists.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "422", description = "Unprocessable entity. The server understands the request but is unable to process the instructions.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "500", description = "An internal server error occurred.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))),
        
        @ApiResponse(responseCode = "503", description = "Service unavailable. The server is currently unable to handle the request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = APIError.class))) })
    @RequestMapping(value = "/notificationEvent",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<NotificationEvent>> getNotificationEvent(@Parameter(in = ParameterIn.QUERY, description = "The notification event name." ,schema=@Schema()) @Valid @RequestParam(value = "eventName", required = false) String eventName, @Min(0)@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema(allowableValues={  }
)) @Valid @RequestParam(value = "skip", required = false) Integer skip, @Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit);

}
