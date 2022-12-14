package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.DepositSpec;
import io.swagger.model.EntityRef;
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
public class DepositSpecApiController implements DepositSpecApi {

    private static final Logger log = LoggerFactory.getLogger(DepositSpecApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DepositSpecApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EntityRef> addDepositSpec(@Parameter(in = ParameterIn.DEFAULT, description = "The deposit specification to create. The minimum required parameters are&colon;<ul><li><b>name</b></li><li><b>chargeOfferRef</b></li><li><b>profileRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositSpec body) {
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

    public ResponseEntity<Void> deleteDepositSpecById(@Parameter(in = ParameterIn.PATH, description = "The deposit specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepositSpec> getDepositSpecById(@Parameter(in = ParameterIn.PATH, description = "The deposit specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepositSpec>(objectMapper.readValue("{\n  \"billPreference\" : \"AUTOALIGN\",\n  \"amount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"code\" : \"code\",\n  \"creditLimitFlag\" : true,\n  \"modifiedAt\" : \"modifiedAt\",\n  \"glCode\" : \"glCode\",\n  \"profileRef\" : \"profileRef\",\n  \"expiresAt\" : \"expiresAt\",\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"permitted\" : \"permitted\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"category\" : \"category\",\n  \"status\" : \"DRAFT\"\n}", DepositSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepositSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepositSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<DepositSpec>> searchDepositSpec(@Parameter(in = ParameterIn.QUERY, description = "The specification name." ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name,@Parameter(in = ParameterIn.QUERY, description = "The specification category." ,schema=@Schema()) @Valid @RequestParam(value = "category", required = false) String category,@Parameter(in = ParameterIn.QUERY, description = "The specification is permitted or not." ,schema=@Schema()) @Valid @RequestParam(value = "permitted", required = false) String permitted,@Parameter(in = ParameterIn.QUERY, description = "The specification status." ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status,@Parameter(in = ParameterIn.QUERY, description = "The specification expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) String expiresAt,@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) String skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DepositSpec>>(objectMapper.readValue("[ {\n  \"billPreference\" : \"AUTOALIGN\",\n  \"amount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"code\" : \"code\",\n  \"creditLimitFlag\" : true,\n  \"modifiedAt\" : \"modifiedAt\",\n  \"glCode\" : \"glCode\",\n  \"profileRef\" : \"profileRef\",\n  \"expiresAt\" : \"expiresAt\",\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"permitted\" : \"permitted\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"category\" : \"category\",\n  \"status\" : \"DRAFT\"\n}, {\n  \"billPreference\" : \"AUTOALIGN\",\n  \"amount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"code\" : \"code\",\n  \"creditLimitFlag\" : true,\n  \"modifiedAt\" : \"modifiedAt\",\n  \"glCode\" : \"glCode\",\n  \"profileRef\" : \"profileRef\",\n  \"expiresAt\" : \"expiresAt\",\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"permitted\" : \"permitted\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"category\" : \"category\",\n  \"status\" : \"DRAFT\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DepositSpec>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DepositSpec>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDepositSpec(@Parameter(in = ParameterIn.PATH, description = "The deposit specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The deposit specification  to update. The minimum required parameters are&colon;<ul><li><b>name</b></li><li><b>chargeOfferRef</b></li><li><b>profileRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
