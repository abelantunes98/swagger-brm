package io.swagger.api;

import io.swagger.model.ProfileBase;
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
public class ProfilesApiController implements ProfilesApi {

    private static final Logger log = LoggerFactory.getLogger(ProfilesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProfilesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> create(@Parameter(in = ParameterIn.DEFAULT, description = "The profile to create.", schema=@Schema()) @Valid @RequestBody ProfileBase body) {
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

    public ResponseEntity<Void> deletProfile(@Parameter(in = ParameterIn.PATH, description = "The profile ID such as 0.0.0.1+-profile-customer_care+123123.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletProfile(@Parameter(in = ParameterIn.QUERY, description = "The type of profile to delete." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.QUERY, description = "The ID of the account to delete a profile from." ,schema=@Schema()) @Valid @RequestParam(value = "accountid", required = false) String accountid,@Parameter(in = ParameterIn.QUERY, description = "The ID of the service to delete a profile from." ,schema=@Schema()) @Valid @RequestParam(value = "serviceid", required = false) String serviceid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getProfile(@Parameter(in = ParameterIn.PATH, description = "The profile ID, such as 0.0.0.1+-profile-customer_care+123123.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getProfileTypes(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to retrieve profiles for.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "profile type to be retrieved" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.QUERY, description = "Service to retrieve profiles for" ,schema=@Schema()) @Valid @RequestParam(value = "serviceid", required = false) String serviceid) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> save(@Parameter(in = ParameterIn.DEFAULT, description = "The updates to make to the account profile.", schema=@Schema()) @Valid @RequestBody ProfileBase body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
