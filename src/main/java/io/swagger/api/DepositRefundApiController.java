package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.DepositRefund;
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
public class DepositRefundApiController implements DepositRefundApi {

    private static final Logger log = LoggerFactory.getLogger(DepositRefundApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DepositRefundApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<DepositRefund>> getCustomerDepositRefund(@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "customeDepositRef", required = true) String customeDepositRef,@Parameter(in = ParameterIn.QUERY, description = "The customer reference." ,schema=@Schema()) @Valid @RequestParam(value = "customerRef", required = false) String customerRef,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema(allowableValues={  }
)) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DepositRefund>>(objectMapper.readValue("[ {\n  \"reason\" : \"reason\",\n  \"completedAt\" : \"completedAt\",\n  \"notes\" : \"notes\",\n  \"customerDepositRef\" : \"customerDepositRef\",\n  \"glCode\" : \"glCode\",\n  \"error\" : \"error\",\n  \"createdAt\" : \"createdAt\",\n  \"refundRef\" : \"refundRef\",\n  \"customerRef\" : \"customerRef\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"status\" : \"COMPLETED\",\n  \"refundAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  }\n}, {\n  \"reason\" : \"reason\",\n  \"completedAt\" : \"completedAt\",\n  \"notes\" : \"notes\",\n  \"customerDepositRef\" : \"customerDepositRef\",\n  \"glCode\" : \"glCode\",\n  \"error\" : \"error\",\n  \"createdAt\" : \"createdAt\",\n  \"refundRef\" : \"refundRef\",\n  \"customerRef\" : \"customerRef\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"status\" : \"COMPLETED\",\n  \"refundAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DepositRefund>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DepositRefund>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DepositRefund> getDepositRefundById(@Parameter(in = ParameterIn.PATH, description = "The ID of the deposit refund to get.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepositRefund>(objectMapper.readValue("{\n  \"reason\" : \"reason\",\n  \"completedAt\" : \"completedAt\",\n  \"notes\" : \"notes\",\n  \"customerDepositRef\" : \"customerDepositRef\",\n  \"glCode\" : \"glCode\",\n  \"error\" : \"error\",\n  \"createdAt\" : \"createdAt\",\n  \"refundRef\" : \"refundRef\",\n  \"customerRef\" : \"customerRef\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"status\" : \"COMPLETED\",\n  \"refundAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  }\n}", DepositRefund.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepositRefund>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepositRefund>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EntityRef> refundCustomerDeposit(@Parameter(in = ParameterIn.DEFAULT, description = "The deposit to refund. The minimum required parameters are:<ul><li><b>customerRef</b></li><li><b>customerDepositRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositRefund body) {
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

    public ResponseEntity<Void> updateDepositRefund(@Parameter(in = ParameterIn.PATH, description = "The deposit ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The deposit to refund. The minimum required parameters are:<ul><li><b>customerRef</b></li><li><b>status</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositRefund body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
