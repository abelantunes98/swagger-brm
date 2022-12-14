package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.DepositSpecProfile;
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
public class DepositSpecProfileApiController implements DepositSpecProfileApi {

    private static final Logger log = LoggerFactory.getLogger(DepositSpecProfileApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DepositSpecProfileApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EntityRef> addDepositProfile(@Parameter(in = ParameterIn.DEFAULT, description = "The deposit specification profile to create. You must enter specification name.", schema=@Schema()) @Valid @RequestBody DepositSpecProfile body) {
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

    public ResponseEntity<DepositSpecProfile> getDepositSpecProfileById(@Parameter(in = ParameterIn.PATH, description = "The deposit specification profile ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DepositSpecProfile>(objectMapper.readValue("{\n  \"isTransferrable\" : true,\n  \"code\" : \"code\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"isPayinterest\" : false,\n  \"isOverridable\" : true,\n  \"interestRule\" : {\n    \"interestRate\" : 1.4658129805029452,\n    \"glCode\" : \"glCode\",\n    \"interestType\" : \"FLAT\",\n    \"startInterestFrom\" : \"DEPOSIT_DATE\",\n    \"interestFrequencyValue\" : 5,\n    \"interestFrequencyUnit\" : \"MONTH\"\n  },\n  \"expiresAt\" : \"expiresAt\",\n  \"isRefundable\" : true,\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"isExemptible\" : false,\n  \"validityRule\" : {\n    \"startOffsetPeriodValue\" : 2,\n    \"id\" : 5,\n    \"endOffsetPeriodUnit\" : \"DAY\",\n    \"endOffsetPeriodValue\" : 7,\n    \"startOffsetPeriodUnit\" : \"DAY\"\n  },\n  \"releaseType\" : \"REFUND\",\n  \"refundRule\" : {\n    \"offsetPeriodValue\" : 6,\n    \"handlingFeeType\" : \"PERCENTAGE\",\n    \"glCode\" : \"glCode\",\n    \"minRefundAmount\" : {\n      \"amount\" : 0.8008281904610115,\n      \"currency\" : \"currency\"\n    },\n    \"id\" : 0,\n    \"hasWorkFlow\" : true,\n    \"offsetPeriodUnit\" : \"DAY\"\n  },\n  \"name\" : \"name\",\n  \"validityRuleSource\" : \"SYSTEM_DEFINED\",\n  \"startsAt\" : \"startsAt\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\"\n}", DepositSpecProfile.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DepositSpecProfile>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DepositSpecProfile>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<DepositSpecProfile>> searchDepositSpecProfile(@Parameter(in = ParameterIn.QUERY, description = "The deposit specification profile name." ,schema=@Schema()) @Valid @RequestParam(value = "Deposit Specification Profile Name", required = false) String depositSpecificationProfileName,@Parameter(in = ParameterIn.QUERY, description = "The deposit specification status." ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status,@Parameter(in = ParameterIn.QUERY, description = "The deposit specification expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) String expiresAt,@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) String skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<DepositSpecProfile>>(objectMapper.readValue("[ {\n  \"isTransferrable\" : true,\n  \"code\" : \"code\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"isPayinterest\" : false,\n  \"isOverridable\" : true,\n  \"interestRule\" : {\n    \"interestRate\" : 1.4658129805029452,\n    \"glCode\" : \"glCode\",\n    \"interestType\" : \"FLAT\",\n    \"startInterestFrom\" : \"DEPOSIT_DATE\",\n    \"interestFrequencyValue\" : 5,\n    \"interestFrequencyUnit\" : \"MONTH\"\n  },\n  \"expiresAt\" : \"expiresAt\",\n  \"isRefundable\" : true,\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"isExemptible\" : false,\n  \"validityRule\" : {\n    \"startOffsetPeriodValue\" : 2,\n    \"id\" : 5,\n    \"endOffsetPeriodUnit\" : \"DAY\",\n    \"endOffsetPeriodValue\" : 7,\n    \"startOffsetPeriodUnit\" : \"DAY\"\n  },\n  \"releaseType\" : \"REFUND\",\n  \"refundRule\" : {\n    \"offsetPeriodValue\" : 6,\n    \"handlingFeeType\" : \"PERCENTAGE\",\n    \"glCode\" : \"glCode\",\n    \"minRefundAmount\" : {\n      \"amount\" : 0.8008281904610115,\n      \"currency\" : \"currency\"\n    },\n    \"id\" : 0,\n    \"hasWorkFlow\" : true,\n    \"offsetPeriodUnit\" : \"DAY\"\n  },\n  \"name\" : \"name\",\n  \"validityRuleSource\" : \"SYSTEM_DEFINED\",\n  \"startsAt\" : \"startsAt\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\"\n}, {\n  \"isTransferrable\" : true,\n  \"code\" : \"code\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"isPayinterest\" : false,\n  \"isOverridable\" : true,\n  \"interestRule\" : {\n    \"interestRate\" : 1.4658129805029452,\n    \"glCode\" : \"glCode\",\n    \"interestType\" : \"FLAT\",\n    \"startInterestFrom\" : \"DEPOSIT_DATE\",\n    \"interestFrequencyValue\" : 5,\n    \"interestFrequencyUnit\" : \"MONTH\"\n  },\n  \"expiresAt\" : \"expiresAt\",\n  \"isRefundable\" : true,\n  \"createdAt\" : \"createdAt\",\n  \"descr\" : \"descr\",\n  \"isExemptible\" : false,\n  \"validityRule\" : {\n    \"startOffsetPeriodValue\" : 2,\n    \"id\" : 5,\n    \"endOffsetPeriodUnit\" : \"DAY\",\n    \"endOffsetPeriodValue\" : 7,\n    \"startOffsetPeriodUnit\" : \"DAY\"\n  },\n  \"releaseType\" : \"REFUND\",\n  \"refundRule\" : {\n    \"offsetPeriodValue\" : 6,\n    \"handlingFeeType\" : \"PERCENTAGE\",\n    \"glCode\" : \"glCode\",\n    \"minRefundAmount\" : {\n      \"amount\" : 0.8008281904610115,\n      \"currency\" : \"currency\"\n    },\n    \"id\" : 0,\n    \"hasWorkFlow\" : true,\n    \"offsetPeriodUnit\" : \"DAY\"\n  },\n  \"name\" : \"name\",\n  \"validityRuleSource\" : \"SYSTEM_DEFINED\",\n  \"startsAt\" : \"startsAt\",\n  \"id\" : \"id\",\n  \"href\" : \"http://example.com/aeiou\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DepositSpecProfile>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DepositSpecProfile>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDepositProfile(@Parameter(in = ParameterIn.PATH, description = "The deposit specification profile ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The deposit specification profile to create. The minimum required parameters are&colon;<ul><li><b>name</b></li></ul>", schema=@Schema()) @Valid @RequestBody DepositSpecProfile body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
