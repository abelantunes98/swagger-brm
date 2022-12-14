package io.swagger.api;

import io.swagger.model.APIError;
import io.swagger.model.InstallmentProposal;
import io.swagger.model.InstallmentSchedule;
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
public class InstallmentProposalApiController implements InstallmentProposalApi {

    private static final Logger log = LoggerFactory.getLogger(InstallmentProposalApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InstallmentProposalApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InstallmentSchedule> addInstallmentProposal(@Parameter(in = ParameterIn.DEFAULT, description = "The installment proposal to create. The minimum required parameters are&colon;<ul><li><b>customerRef</b></li><li><b>specRef</b></li><li><b>totalAmount</b></li></ul>", required=true, schema=@Schema()) @Valid @RequestBody InstallmentProposal body) {
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

}
