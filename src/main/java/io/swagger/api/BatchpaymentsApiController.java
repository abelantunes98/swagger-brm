package io.swagger.api;

import io.swagger.model.BatchPaymentTemplates;
import io.swagger.model.FormDataContentDisposition;
import io.swagger.model.PaymentBatchFileHeader;
import io.swagger.model.PaymentBatchStatistics;
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
public class BatchpaymentsApiController implements BatchpaymentsApi {

    private static final Logger log = LoggerFactory.getLogger(BatchpaymentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BatchpaymentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> autoProcessBatchPayments(@Parameter(in = ParameterIn.PATH, description = "Whether to start the automatic batch payment process (<b>true</b>) or stop the automatic batch payment process (<b>false</b>).", required=true, schema=@Schema()) @PathVariable("autoProcess") Boolean autoProcess) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<BatchPaymentTemplates>> getAvailableTemplates() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<BatchPaymentTemplates>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"payTypeCode\" : 0,\n  \"templateName\" : \"templateName\",\n  \"locale\" : \"locale\",\n  \"payTypeName\" : \"payTypeName\"\n}, {\n  \"extension\" : { },\n  \"payTypeCode\" : 0,\n  \"templateName\" : \"templateName\",\n  \"locale\" : \"locale\",\n  \"payTypeName\" : \"payTypeName\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<BatchPaymentTemplates>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<BatchPaymentTemplates>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getBatchPaymentsFile(@Parameter(in = ParameterIn.PATH, description = "The name of the batch payment file.", required=true, schema=@Schema()) @PathVariable("fileName") String fileName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentBatchFileHeader> getUnProcessedBatchPayments() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentBatchFileHeader>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"fileName\" : \"fileName\",\n  \"noOfPayments\" : 6,\n  \"templateName\" : \"templateName\",\n  \"fileCreationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"fileSize\" : 0.8008281904610115,\n  \"lockBoxName\" : \"lockBoxName\",\n  \"institutionName\" : \"institutionName\",\n  \"currency\" : \"currency\",\n  \"lockBoxId\" : \"lockBoxId\",\n  \"status\" : 1\n}", PaymentBatchFileHeader.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentBatchFileHeader>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentBatchFileHeader>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> isFileAlreadyProcessed(@Parameter(in = ParameterIn.PATH, description = "The name of the batch file to check.", required=true, schema=@Schema()) @PathVariable("fileName") String fileName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentBatchFileHeader> pollForBatchPayments() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentBatchFileHeader>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"fileName\" : \"fileName\",\n  \"noOfPayments\" : 6,\n  \"templateName\" : \"templateName\",\n  \"fileCreationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"fileSize\" : 0.8008281904610115,\n  \"lockBoxName\" : \"lockBoxName\",\n  \"institutionName\" : \"institutionName\",\n  \"currency\" : \"currency\",\n  \"lockBoxId\" : \"lockBoxId\",\n  \"status\" : 1\n}", PaymentBatchFileHeader.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentBatchFileHeader>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentBatchFileHeader>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentBatchStatistics> processBatchPayments(@Parameter(in = ParameterIn.QUERY, description = "Whether to automatically retry processing the batch payments if a failure occurs (<b>true</b>) or not (<b>false</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "retry", required = false) Boolean retry,@Parameter(in = ParameterIn.QUERY, description = "What to do when the number of suspended payments in a batch file has exceeded a pre-configured threshold:<ul><li><b>true</b> specifies to override the threshold checkpoint and proceed with submitting the payments.</li><li><b>false</b> specifies to stop processing the batch file and roll back any successful allocations in the payment batch.</li></ul> " ,schema=@Schema()) @Valid @RequestParam(value = "overrideThreshold", required = false) Boolean overrideThreshold,@Parameter(in = ParameterIn.DEFAULT, description = "The header information for the batch payment file, such as the institution name, file name, and so on. The minimum required parameters are&colon; <ul><li><b>currency</b></li><li><b>fileCreationDate</b></li><li><b>fileName</b></li><li><b>institutionName</b></li><li><b>lockBoxId</b></li><li><b>templateName</b></li></ul>", schema=@Schema()) @Valid @RequestBody PaymentBatchFileHeader body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentBatchStatistics>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"processCompletionDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"fileName\" : \"fileName\",\n  \"fileCreationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"lockBoxName\" : \"lockBoxName\",\n  \"processEndDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"durationInQueue\" : 5,\n  \"lockBoxId\" : \"lockBoxId\",\n  \"totalPayments\" : 6,\n  \"totalPaymentsSuspended\" : 1,\n  \"processStartDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"totalAmount\" : 9.301444243932576,\n  \"totalPaymentsProcessed\" : 0,\n  \"durationProcessed\" : 5,\n  \"fileSize\" : 7.061401241503109,\n  \"institutionName\" : \"institutionName\",\n  \"batchCurrency\" : 2,\n  \"batchRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"processedBy\" : \"processedBy\"\n}", PaymentBatchStatistics.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentBatchStatistics>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentBatchStatistics>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentBatchFileHeader> uploadBatchPaymentFile(@Parameter(in = ParameterIn.QUERY, description = "Whether to override an older version of the batch payment file (<b>true</b>) or not (<b>false</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "override", required = false) Boolean override,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="filename", required=false)  String filename,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="file", required=false)  FormDataContentDisposition file) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentBatchFileHeader>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"fileName\" : \"fileName\",\n  \"noOfPayments\" : 6,\n  \"templateName\" : \"templateName\",\n  \"fileCreationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"fileSize\" : 0.8008281904610115,\n  \"lockBoxName\" : \"lockBoxName\",\n  \"institutionName\" : \"institutionName\",\n  \"currency\" : \"currency\",\n  \"lockBoxId\" : \"lockBoxId\",\n  \"status\" : 1\n}", PaymentBatchFileHeader.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentBatchFileHeader>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentBatchFileHeader>(HttpStatus.NOT_IMPLEMENTED);
    }

}
