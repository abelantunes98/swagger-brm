package io.swagger.api;

import io.swagger.model.CreditorInfo;
import io.swagger.model.PayMethod;
import io.swagger.model.PaymentMethods;
import org.springframework.core.io.Resource;
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
public class PaymentmethodsApiController implements PaymentmethodsApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentmethodsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentmethodsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deletePaymentMethod(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment method.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CreditorInfo> getCreditorInfo(@Parameter(in = ParameterIn.QUERY, description = "The bank identifier code, such as IANILKU1MAR. If the value is null, it returns all creditors." ,schema=@Schema()) @Valid @RequestParam(value = "bic", required = false) String bic) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CreditorInfo>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"creditorsDetails\" : [ {\n    \"country\" : \"country\",\n    \"address\" : \"address\",\n    \"name\" : \"name\",\n    \"creditorID\" : \"creditorID\"\n  }, {\n    \"country\" : \"country\",\n    \"address\" : \"address\",\n    \"name\" : \"name\",\n    \"creditorID\" : \"creditorID\"\n  } ]\n}", CreditorInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreditorInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreditorInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentMethods> getPaymentMethods(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+1117902, to get payment methods for.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentMethods>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"paymentMethods\" : {\n    \"extension\" : { },\n    \"paymentInstrument\" : [ {\n      \"nil\" : true,\n      \"typeSubstituted\" : true,\n      \"globalScope\" : true,\n      \"name\" : {\n        \"localPart\" : \"localPart\",\n        \"prefix\" : \"prefix\",\n        \"namespaceURI\" : \"namespaceURI\"\n      },\n      \"value\" : {\n        \"extension\" : { },\n        \"correctiveInvoiceType\" : 7,\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"paymentType\" : 4\n      }\n    }, {\n      \"nil\" : true,\n      \"typeSubstituted\" : true,\n      \"globalScope\" : true,\n      \"name\" : {\n        \"localPart\" : \"localPart\",\n        \"prefix\" : \"prefix\",\n        \"namespaceURI\" : \"namespaceURI\"\n      },\n      \"value\" : {\n        \"extension\" : { },\n        \"correctiveInvoiceType\" : 7,\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"paymentType\" : 4\n      }\n    } ]\n  }\n}", PaymentMethods.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentMethods>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentMethods>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> savePaymentMethodsonFile(@Parameter(in = ParameterIn.DEFAULT, description = "Information about the new payment method.", schema=@Schema()) @Valid @RequestBody PayMethod body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("{\n  \"reference\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"extension\" : { }\n}", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> updatePaymentMethods(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment method.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The payment method to modify for the target account. To deassign a bill unit, you must put it in the <b>deassignedBillUnits</b> array; you can't just delete the bill unit from the <b>assignedBillUnits</b> array.", schema=@Schema()) @Valid @RequestBody PayMethod body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("{\n  \"reference\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"extension\" : { }\n}", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }

}
