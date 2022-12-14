package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.CustomerDeposit;
import io.swagger.model.DepositOrder;
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
public class CustomerDepositApiController implements CustomerDepositApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerDepositApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerDepositApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EntityRef> addCustomerDepositOrder(@Parameter(in = ParameterIn.DEFAULT, description = "The customer deposit to create. The minimum required parameters are:<ul><li><b>customerDeposit</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositOrder body) {
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

    public ResponseEntity<CustomerDeposit> getCustomerDepositById(@Parameter(in = ParameterIn.PATH, description = "The customer deposit ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CustomerDeposit>(objectMapper.readValue("{\n  \"code\" : \"code\",\n  \"validFor\" : {\n    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"modifiedAt\" : \"modifiedAt\",\n  \"serviceRef\" : \"serviceRef\",\n  \"DepositSpecRef\" : \"DepositSpecRef\",\n  \"transactions\" : [ {\n    \"transactionRef\" : \"transactionRef\"\n  }, {\n    \"transactionRef\" : \"transactionRef\"\n  } ],\n  \"createdAt\" : \"createdAt\",\n  \"totalAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"customerRef\" : \"customerRef\",\n  \"releaseType\" : \"PREPAYMENT\",\n  \"discountType\" : \"PERCENTAGE\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"billProfileRef\" : \"billProfileRef\",\n  \"effectiveDate\" : \"effectiveDate\",\n  \"status\" : \"WAITING\"\n}", CustomerDeposit.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CustomerDeposit>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CustomerDeposit>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CustomerDeposit>> searchCustomerDeposit(@Parameter(in = ParameterIn.QUERY, description = "The customer deposit reference." ,schema=@Schema()) @Valid @RequestParam(value = "customerRef", required = false) String customerRef,@Parameter(in = ParameterIn.QUERY, description = "The service reference." ,schema=@Schema()) @Valid @RequestParam(value = "serviceRef", required = false) String serviceRef,@Parameter(in = ParameterIn.QUERY, description = "The bill profile reference." ,schema=@Schema()) @Valid @RequestParam(value = "billProfileRef", required = false) String billProfileRef,@Parameter(in = ParameterIn.QUERY, description = "The deposit specification reference." ,schema=@Schema()) @Valid @RequestParam(value = "depositSpecRef", required = false) String depositSpecRef,@Parameter(in = ParameterIn.QUERY, description = "The deposit specification status." ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status,@Parameter(in = ParameterIn.QUERY, description = "The deposit specification expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) String expiresAt,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema(allowableValues={  }
)) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CustomerDeposit>>(objectMapper.readValue("[ {\n  \"code\" : \"code\",\n  \"validFor\" : {\n    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"modifiedAt\" : \"modifiedAt\",\n  \"serviceRef\" : \"serviceRef\",\n  \"DepositSpecRef\" : \"DepositSpecRef\",\n  \"transactions\" : [ {\n    \"transactionRef\" : \"transactionRef\"\n  }, {\n    \"transactionRef\" : \"transactionRef\"\n  } ],\n  \"createdAt\" : \"createdAt\",\n  \"totalAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"customerRef\" : \"customerRef\",\n  \"releaseType\" : \"PREPAYMENT\",\n  \"discountType\" : \"PERCENTAGE\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"billProfileRef\" : \"billProfileRef\",\n  \"effectiveDate\" : \"effectiveDate\",\n  \"status\" : \"WAITING\"\n}, {\n  \"code\" : \"code\",\n  \"validFor\" : {\n    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"modifiedAt\" : \"modifiedAt\",\n  \"serviceRef\" : \"serviceRef\",\n  \"DepositSpecRef\" : \"DepositSpecRef\",\n  \"transactions\" : [ {\n    \"transactionRef\" : \"transactionRef\"\n  }, {\n    \"transactionRef\" : \"transactionRef\"\n  } ],\n  \"createdAt\" : \"createdAt\",\n  \"totalAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"customerRef\" : \"customerRef\",\n  \"releaseType\" : \"PREPAYMENT\",\n  \"discountType\" : \"PERCENTAGE\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\",\n  \"billProfileRef\" : \"billProfileRef\",\n  \"effectiveDate\" : \"effectiveDate\",\n  \"status\" : \"WAITING\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CustomerDeposit>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CustomerDeposit>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateCustomerDeposit(@Parameter(in = ParameterIn.PATH, description = "The customer deposit object ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The customer deposit to update. The minimum required parameters are:<ul><li><b>customerRef</b></li><li><b>DepositSpecRef</b></li><li><b>totalAmount</b></li></ul>", schema=@Schema()) @Valid @RequestBody CustomerDeposit body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
