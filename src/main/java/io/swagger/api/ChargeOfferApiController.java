package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.ChargeOffer;
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
public class ChargeOfferApiController implements ChargeOfferApi {

    private static final Logger log = LoggerFactory.getLogger(ChargeOfferApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ChargeOfferApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ChargeOffer>> getChargeOffer(@Parameter(in = ParameterIn.QUERY, description = "The charge offer name." ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name,@Parameter(in = ParameterIn.QUERY, description = "The charge offer type." ,schema=@Schema()) @Valid @RequestParam(value = "chargeOfferType", required = false) String chargeOfferType,@Parameter(in = ParameterIn.QUERY, description = "The charge offer is permitted or not." ,schema=@Schema()) @Valid @RequestParam(value = "permitted", required = false) String permitted,@Parameter(in = ParameterIn.QUERY, description = "The charge offer expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) String expiresAt,@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) String skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ChargeOffer>>(objectMapper.readValue("[ {\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"offerType\" : \"SYSTEM\",\n  \"code\" : \"code\",\n  \"permitted\" : \"permitted\",\n  \"name\" : \"name\",\n  \"startsAt\" : \"startsAt\",\n  \"id\" : \"id\",\n  \"expiresAt\" : \"expiresAt\"\n}, {\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"offerType\" : \"SYSTEM\",\n  \"code\" : \"code\",\n  \"permitted\" : \"permitted\",\n  \"name\" : \"name\",\n  \"startsAt\" : \"startsAt\",\n  \"id\" : \"id\",\n  \"expiresAt\" : \"expiresAt\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ChargeOffer>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ChargeOffer>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
