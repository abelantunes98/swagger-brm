package io.swagger.api;

import io.swagger.model.ApplyLoan;
import io.swagger.model.LoanDetail;
import io.swagger.model.LoanProfileDetails;
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
public class LoansApiController implements LoansApi {

    private static final Logger log = LoggerFactory.getLogger(LoansApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LoansApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> applyLoan(@Parameter(in = ParameterIn.DEFAULT, description = "The details of the loan to create.", schema=@Schema()) @Valid @RequestBody ApplyLoan body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<LoanProfileDetails>> getConfigLoanProfiles(@Parameter(in = ParameterIn.QUERY, description = "The ID of a <b>/config/loan</b> object to get. For example: 0.0.0.1+-config-loan+59508" ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id,@Parameter(in = ParameterIn.QUERY, description = "The name of a <b>/config/loan</b> object to get. For example: Resource Loan" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<LoanProfileDetails>>(objectMapper.readValue("[ {\n  \"loanInfo\" : {\n    \"serviceFee\" : 6.027456183070403,\n    \"resourceId\" : 5,\n    \"maxQuantity\" : 2,\n    \"ageOffsetUnit\" : \"ageOffsetUnit\",\n    \"loanTaxCode\" : \"loanTaxCode\",\n    \"taxCode\" : \"taxCode\",\n    \"percentFee\" : 7.061401241503109,\n    \"reasonDomainId\" : 2,\n    \"reasonId\" : 3,\n    \"maximum\" : 5.962133916683182,\n    \"locationMode\" : 4,\n    \"minimum\" : 1.4658129805029452,\n    \"age\" : 0,\n    \"scaledMaximum\" : 9.301444243932576\n  },\n  \"name\" : \"name\",\n  \"locations\" : [ {\n    \"location\" : \"location\"\n  }, {\n    \"location\" : \"location\"\n  } ],\n  \"id\" : \"configLoanId\"\n}, {\n  \"loanInfo\" : {\n    \"serviceFee\" : 6.027456183070403,\n    \"resourceId\" : 5,\n    \"maxQuantity\" : 2,\n    \"ageOffsetUnit\" : \"ageOffsetUnit\",\n    \"loanTaxCode\" : \"loanTaxCode\",\n    \"taxCode\" : \"taxCode\",\n    \"percentFee\" : 7.061401241503109,\n    \"reasonDomainId\" : 2,\n    \"reasonId\" : 3,\n    \"maximum\" : 5.962133916683182,\n    \"locationMode\" : 4,\n    \"minimum\" : 1.4658129805029452,\n    \"age\" : 0,\n    \"scaledMaximum\" : 9.301444243932576\n  },\n  \"name\" : \"name\",\n  \"locations\" : [ {\n    \"location\" : \"location\"\n  }, {\n    \"location\" : \"location\"\n  } ],\n  \"id\" : \"configLoanId\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<LoanProfileDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<LoanProfileDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<LoanDetail>> getLoanDetail(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get loans for. For example: 0.0.0.1+-account+123123", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The service ID to filter loans by." ,schema=@Schema()) @Valid @RequestParam(value = "service.id", required = false) String serviceId,@Parameter(in = ParameterIn.QUERY, description = "The service type to filter loans by." ,schema=@Schema()) @Valid @RequestParam(value = "service.type", required = false) String serviceType,@Parameter(in = ParameterIn.QUERY, description = "The earliest start date of the loans to get, in milliseconds. For example: 1444209849879." ,schema=@Schema()) @Valid @RequestParam(value = "loanStartTime", required = false) String loanStartTime,@Parameter(in = ParameterIn.QUERY, description = "The latest end date of loans to get, in milliseconds. For example: 1444209849879." ,schema=@Schema()) @Valid @RequestParam(value = "loanEndTime", required = false) String loanEndTime,@Parameter(in = ParameterIn.QUERY, description = "Whether to retrieve only active loans (<b>true</b>) or all loans that have been granted (<b>false</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "onlyActiveLoans", required = false) Boolean onlyActiveLoans) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<LoanDetail>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"loanDetails\" : [ {\n    \"loanFee\" : 5.962133916683182,\n    \"outstandingAmount\" : 2.3021358869347655,\n    \"channel\" : \"channel\",\n    \"tax\" : 5.637376656633329,\n    \"serviceRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"type\" : 7,\n    \"loanAmount\" : 1.4658129805029452\n  }, {\n    \"loanFee\" : 5.962133916683182,\n    \"outstandingAmount\" : 2.3021358869347655,\n    \"channel\" : \"channel\",\n    \"tax\" : 5.637376656633329,\n    \"serviceRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"type\" : 7,\n    \"loanAmount\" : 1.4658129805029452\n  } ],\n  \"creditLimit\" : 6.027456183070403,\n  \"availableLoanLimit\" : 0.8008281904610115\n}, {\n  \"extension\" : { },\n  \"loanDetails\" : [ {\n    \"loanFee\" : 5.962133916683182,\n    \"outstandingAmount\" : 2.3021358869347655,\n    \"channel\" : \"channel\",\n    \"tax\" : 5.637376656633329,\n    \"serviceRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"type\" : 7,\n    \"loanAmount\" : 1.4658129805029452\n  }, {\n    \"loanFee\" : 5.962133916683182,\n    \"outstandingAmount\" : 2.3021358869347655,\n    \"channel\" : \"channel\",\n    \"tax\" : 5.637376656633329,\n    \"serviceRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"type\" : 7,\n    \"loanAmount\" : 1.4658129805029452\n  } ],\n  \"creditLimit\" : 6.027456183070403,\n  \"availableLoanLimit\" : 0.8008281904610115\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<LoanDetail>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<LoanDetail>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
