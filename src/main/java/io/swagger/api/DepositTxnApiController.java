package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.DepositTxn;
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
public class DepositTxnApiController implements DepositTxnApi {

    private static final Logger log = LoggerFactory.getLogger(DepositTxnApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DepositTxnApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<DepositTxn> getDepositTxnById(@Parameter(in = ParameterIn.PATH, description = "The Deposit Transaction Event ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepositTxn>(objectMapper.readValue("{\n  \"quantity\" : 0,\n  \"notes\" : {\n    \"note\" : \"http://example.com/aeiou\",\n    \"createdAt\" : \"createdAt\",\n    \"modifiedAt\" : \"modifiedAt\",\n    \"id\" : \"id\"\n  },\n  \"modifiedAt\" : \"modifiedAt\",\n  \"txnType\" : \"txnType\",\n  \"depositInfo\" : {\n    \"amount\" : {\n      \"amount\" : 0.8008281904610115,\n      \"currency\" : \"currency\"\n    },\n    \"dayOfWeek\" : 6,\n    \"customerRef\" : \"customerRef\",\n    \"toServiceRef\" : \"toServiceRef\",\n    \"toBillInfoRef\" : \"toBillInfoRef\",\n    \"billInfoRef\" : \"billInfoRef\",\n    \"serviceRef\" : \"serviceRef\"\n  },\n  \"balanceImpacts\" : {\n    \"resourceId\" : \"resourceId\"\n  },\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"startsAt\" : \"startsAt\",\n  \"systemEvent\" : \"systemEvent\",\n  \"payment\" : {\n    \"createdAt\" : \"createdAt\",\n    \"completedAt\" : \"completedAt\",\n    \"notes\" : \"notes\",\n    \"customerRef\" : 1,\n    \"customerDepositRef\" : \"customerDepositRef\",\n    \"glCode\" : \"glCode\",\n    \"id\" : \"id\",\n    \"href\" : \"http://example.com/aeiou\",\n    \"paymentMethodType\" : \"paymentMethodType\",\n    \"status\" : \"status\",\n    \"paymentRef\" : \"paymentRef\"\n  },\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"depositDetails\" : {\n    \"sourceDepositRef\" : \"sourceDepositRef\",\n    \"destDepositRef\" : \"destDepositRef\",\n    \"depositRef\" : \"depositRef\"\n  }\n}", DepositTxn.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepositTxn>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepositTxn>(HttpStatus.NOT_IMPLEMENTED);
    }

}
