package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.EntityRef;
import io.swagger.model.InstallmentScheduleSpec;
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
public class InstallmentScheduleSpecApiController implements InstallmentScheduleSpecApi {

    private static final Logger log = LoggerFactory.getLogger(InstallmentScheduleSpecApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InstallmentScheduleSpecApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EntityRef> addInstallmentScheduleSpec(@Parameter(in = ParameterIn.DEFAULT, description = "Creates the installment specification. The minimum required parameters are&colon;<ul><li><b>maxIntervalDaysNEI</b></li><li><b>maxNumNEI</b></li><li><b>minAmount</b></li><li><b>minPercent</b></li><li><b>name</b></li><li><b>glid</b></li></ul>", required=true, schema=@Schema()) @Valid @RequestBody InstallmentScheduleSpec body) {
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

    public ResponseEntity<InstallmentScheduleSpec> getInstallmentScheduleSpec(@Parameter(in = ParameterIn.PATH, description = "The installment schedule specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InstallmentScheduleSpec>(objectMapper.readValue("{\n  \"minAmount\" : 6.027456183070403,\n  \"modifiedAt\" : \"modifiedAt\",\n  \"installmentPeriod\" : \"MONTHLY\",\n  \"qualifiers\" : [ {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  }, {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  } ],\n  \"maxIntervalDaysNEI\" : 1,\n  \"minPercent\" : 0.8008281904610115,\n  \"expiresAt\" : \"expiresAt\",\n  \"installmentType\" : \"EQUAL_INSTALLMENT\",\n  \"maxNumNEI\" : 5,\n  \"glid\" : \"glid\",\n  \"descr\" : \"descr\",\n  \"createdAt\" : \"createdAt\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"href\" : \"href\"\n}", InstallmentScheduleSpec.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InstallmentScheduleSpec>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InstallmentScheduleSpec>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<InstallmentScheduleSpec>> searchInstallmentScheduleSpec(@Parameter(in = ParameterIn.QUERY, description = "The installment schedule specification name." ,schema=@Schema()) @Valid @RequestParam(value = "Installment Schedule Specification Name", required = false) String installmentScheduleSpecificationName,@Parameter(in = ParameterIn.QUERY, description = "The installment schedule specification expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) String expiresAt,@Parameter(in = ParameterIn.QUERY, description = "The installment schedule specification type." ,schema=@Schema()) @Valid @RequestParam(value = "installmentType", required = false) String installmentType,@Parameter(in = ParameterIn.QUERY, description = "The customer reference number." ,schema=@Schema()) @Valid @RequestParam(value = "customerRef", required = false) String customerRef,@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) String skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InstallmentScheduleSpec>>(objectMapper.readValue("[ {\n  \"minAmount\" : 6.027456183070403,\n  \"modifiedAt\" : \"modifiedAt\",\n  \"installmentPeriod\" : \"MONTHLY\",\n  \"qualifiers\" : [ {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  }, {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  } ],\n  \"maxIntervalDaysNEI\" : 1,\n  \"minPercent\" : 0.8008281904610115,\n  \"expiresAt\" : \"expiresAt\",\n  \"installmentType\" : \"EQUAL_INSTALLMENT\",\n  \"maxNumNEI\" : 5,\n  \"glid\" : \"glid\",\n  \"descr\" : \"descr\",\n  \"createdAt\" : \"createdAt\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"href\" : \"href\"\n}, {\n  \"minAmount\" : 6.027456183070403,\n  \"modifiedAt\" : \"modifiedAt\",\n  \"installmentPeriod\" : \"MONTHLY\",\n  \"qualifiers\" : [ {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  }, {\n    \"dataType\" : \"STRING\",\n    \"value\" : \"value\",\n    \"key\" : \"key\",\n    \"operator\" : \"EQ\"\n  } ],\n  \"maxIntervalDaysNEI\" : 1,\n  \"minPercent\" : 0.8008281904610115,\n  \"expiresAt\" : \"expiresAt\",\n  \"installmentType\" : \"EQUAL_INSTALLMENT\",\n  \"maxNumNEI\" : 5,\n  \"glid\" : \"glid\",\n  \"descr\" : \"descr\",\n  \"createdAt\" : \"createdAt\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"name\" : \"name\",\n  \"id\" : \"id\",\n  \"href\" : \"href\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InstallmentScheduleSpec>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InstallmentScheduleSpec>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateInstallmentScheduleSpec(@Parameter(in = ParameterIn.PATH, description = "The installment schedule specification ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The definition for the installment schedule specification.", required=true, schema=@Schema()) @Valid @RequestBody InstallmentScheduleSpec body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
