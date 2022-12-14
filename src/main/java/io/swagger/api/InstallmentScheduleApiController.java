package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.EntityRef;
import io.swagger.model.InstallmentSchedule;
import io.swagger.model.InstallmentScheduleBills;
import org.threeten.bp.LocalDate;
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
public class InstallmentScheduleApiController implements InstallmentScheduleApi {

    private static final Logger log = LoggerFactory.getLogger(InstallmentScheduleApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InstallmentScheduleApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EntityRef> addInstallmentSchedule(@Parameter(in = ParameterIn.DEFAULT, description = "The installmentSchedule to create. The minimum required parameters are&colon;<ul><li><b>customerRef</b></li><li><b>validFor</b></li><li><b>scheduleSpecRef</b></li><li><b>totalAmount</b></li><li><b>bills</b></li><li><b>installments</b></li></ul>", required=true, schema=@Schema()) @Valid @RequestBody InstallmentSchedule body) {
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

    public ResponseEntity<InstallmentScheduleBills> getBillsByIDInstallmentSchedule(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The bill ID." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "billIds", required = true) String billIds) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InstallmentScheduleBills>(objectMapper.readValue("{\n  \"billId\" : \"billId\"\n}", InstallmentScheduleBills.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InstallmentScheduleBills>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InstallmentScheduleBills>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InstallmentSchedule> getInstallmentSchedule(@Parameter(in = ParameterIn.PATH, description = "The installment schedule ID.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InstallmentSchedule>(objectMapper.readValue("{\n  \"billPreference\" : \"AUTO-ALIGN\",\n  \"validFor\" : {\n    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"scheduleSpecRef\" : \"scheduleSpecRef\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"installmentPeriod\" : \"MONTHLY\",\n  \"channel\" : \"channel\",\n  \"installmentType\" : \"EQUAL INSTALLMENT\",\n  \"nextInstallmentAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"glid\" : \"glid\",\n  \"descr\" : \"descr\",\n  \"createdAt\" : \"createdAt\",\n  \"totalAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"totalInstallments\" : 6,\n  \"lastInstallmentAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"customerRef\" : \"customerRef\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"installments\" : [ {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"descr\" : \"descr\",\n    \"scheduleRef\" : \"scheduleRef\",\n    \"customerRef\" : \"customerRef\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"status\" : \"OPEN\"\n  }, {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"descr\" : \"descr\",\n    \"scheduleRef\" : \"scheduleRef\",\n    \"customerRef\" : \"customerRef\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"status\" : \"OPEN\"\n  } ],\n  \"bills\" : [ {\n    \"billId\" : \"billId\"\n  }, {\n    \"billId\" : \"billId\"\n  } ],\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"billProfileRef\" : \"billProfileRef\",\n  \"status\" : \"OPEN\"\n}", InstallmentSchedule.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InstallmentSchedule>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InstallmentSchedule>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<InstallmentSchedule>> searchInstallmentSchedule(@Parameter(in = ParameterIn.QUERY, description = "The customer reference." ,schema=@Schema()) @Valid @RequestParam(value = "customerRef", required = false) String customerRef,@Parameter(in = ParameterIn.QUERY, description = "The service reference." ,schema=@Schema()) @Valid @RequestParam(value = "serviceRef", required = false) String serviceRef,@Parameter(in = ParameterIn.QUERY, description = "The schedule specification reference." ,schema=@Schema()) @Valid @RequestParam(value = "scheduleSpecRef", required = false) String scheduleSpecRef,@Parameter(in = ParameterIn.QUERY, description = "The installment schedule status." ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) String status,@Parameter(in = ParameterIn.QUERY, description = "The expiry date." ,schema=@Schema()) @Valid @RequestParam(value = "expiresAt", required = false) LocalDate expiresAt,@Parameter(in = ParameterIn.QUERY, description = "The bill profile reference." ,schema=@Schema()) @Valid @RequestParam(value = "billProfileRef", required = false) String billProfileRef,@Parameter(in = ParameterIn.QUERY, description = "The position from where the fetch records must start." ,schema=@Schema()) @Valid @RequestParam(value = "skip", required = false) String skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "The maximum number of records to be displayed in a page." ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<InstallmentSchedule>>(objectMapper.readValue("[ {\n  \"billPreference\" : \"AUTO-ALIGN\",\n  \"validFor\" : {\n    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"scheduleSpecRef\" : \"scheduleSpecRef\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"installmentPeriod\" : \"MONTHLY\",\n  \"channel\" : \"channel\",\n  \"installmentType\" : \"EQUAL INSTALLMENT\",\n  \"nextInstallmentAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"glid\" : \"glid\",\n  \"descr\" : \"descr\",\n  \"createdAt\" : \"createdAt\",\n  \"totalAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"totalInstallments\" : 6,\n  \"lastInstallmentAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"customerRef\" : \"customerRef\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"installments\" : [ {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"descr\" : \"descr\",\n    \"scheduleRef\" : \"scheduleRef\",\n    \"customerRef\" : \"customerRef\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"status\" : \"OPEN\"\n  }, {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"descr\" : \"descr\",\n    \"scheduleRef\" : \"scheduleRef\",\n    \"customerRef\" : \"customerRef\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"status\" : \"OPEN\"\n  } ],\n  \"bills\" : [ {\n    \"billId\" : \"billId\"\n  }, {\n    \"billId\" : \"billId\"\n  } ],\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"billProfileRef\" : \"billProfileRef\",\n  \"status\" : \"OPEN\"\n}, {\n  \"billPreference\" : \"AUTO-ALIGN\",\n  \"validFor\" : {\n    \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"scheduleSpecRef\" : \"scheduleSpecRef\",\n  \"modifiedAt\" : \"modifiedAt\",\n  \"installmentPeriod\" : \"MONTHLY\",\n  \"channel\" : \"channel\",\n  \"installmentType\" : \"EQUAL INSTALLMENT\",\n  \"nextInstallmentAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"glid\" : \"glid\",\n  \"descr\" : \"descr\",\n  \"createdAt\" : \"createdAt\",\n  \"totalAmount\" : {\n    \"amount\" : 0.8008281904610115,\n    \"currency\" : \"currency\"\n  },\n  \"totalInstallments\" : 6,\n  \"lastInstallmentAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"customerRef\" : \"customerRef\",\n  \"chargeOfferRef\" : \"chargeOfferRef\",\n  \"installments\" : [ {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"descr\" : \"descr\",\n    \"scheduleRef\" : \"scheduleRef\",\n    \"customerRef\" : \"customerRef\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"status\" : \"OPEN\"\n  }, {\n    \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"descr\" : \"descr\",\n    \"scheduleRef\" : \"scheduleRef\",\n    \"customerRef\" : \"customerRef\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"status\" : \"OPEN\"\n  } ],\n  \"bills\" : [ {\n    \"billId\" : \"billId\"\n  }, {\n    \"billId\" : \"billId\"\n  } ],\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"billProfileRef\" : \"billProfileRef\",\n  \"status\" : \"OPEN\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<InstallmentSchedule>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<InstallmentSchedule>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateInstallmentSchedule(@Parameter(in = ParameterIn.PATH, description = "The installment schedule ID.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody InstallmentSchedule body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
