package io.swagger.api;

import io.swagger.model.AssignSuspensePaymentHandler;
import io.swagger.model.Payment;
import io.swagger.model.PaymentAuditDetailsType;
import io.swagger.model.PaymentDetails;
import io.swagger.model.PaymentList;
import io.swagger.model.RecyclePayment;
import org.springframework.core.io.Resource;
import io.swagger.model.ReversePayment;
import io.swagger.model.SuspenseAccount;
import io.swagger.model.User;
import io.swagger.model.WithdrawPayment;
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
public class PaymentsApiController implements PaymentsApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> allocateSuspendedPayment(@Parameter(in = ParameterIn.QUERY, description = "Whether to validate that the account has an open bill that is due. When <b>validate=openBills</b>, it checks if the account has any open due bills. For any other value, validation is skipped." ,schema=@Schema()) @Valid @RequestParam(value = "validate", required = false) String validate,@Parameter(in = ParameterIn.DEFAULT, description = "Information for allocating the suspended payment. The schema payload should contain the following&colon; <ul><li>The event resource associated with the suspended account</li><li>The amount to allocate to the target account</li><li>The target account's currency</li><li>The total amount to allocate from suspense</li><li>(Optional) The bill items along with the amount to allocate to each one in case of manual allocation of items</li></ul>", schema=@Schema()) @Valid @RequestBody RecyclePayment body) {
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

    public ResponseEntity<Void> assignSuspensePaymentHandler(@Parameter(in = ParameterIn.DEFAULT, description = "The authorized payment handler to assign.", schema=@Schema()) @Valid @RequestBody AssignSuspensePaymentHandler body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentAuditDetailsType> getAuditTrails(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment transaction, such as T1,e7,0.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentAuditDetailsType>(objectMapper.readValue("{\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"amount\" : 3.616076749251911,\n  \"csrLoginId\" : \"csrLoginId\",\n  \"accountNumber\" : \"accountNumber\",\n  \"transactionId\" : \"transactionId\",\n  \"domainId\" : 4,\n  \"firstName\" : \"firstName\",\n  \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"subTransactionId\" : \"subTransactionId\",\n  \"reasonId\" : 7,\n  \"status\" : 2\n}", PaymentAuditDetailsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentAuditDetailsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentAuditDetailsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PaymentList>> getBillUnitPayments(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of payments to get. The only supported value is <b>type=unallocated</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PaymentList>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"paymentAction\" : 5,\n  \"originalPaymentAmount\" : 5.962133916683182,\n  \"paymentId\" : \"paymentId\",\n  \"unAllocatedAmount\" : 1.4658129805029452,\n  \"paymentMethod\" : 6,\n  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentAmount\" : 0.8008281904610115,\n  \"billingStatus\" : 2,\n  \"paymentRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}, {\n  \"extension\" : { },\n  \"paymentAction\" : 5,\n  \"originalPaymentAmount\" : 5.962133916683182,\n  \"paymentId\" : \"paymentId\",\n  \"unAllocatedAmount\" : 1.4658129805029452,\n  \"paymentMethod\" : 6,\n  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentAmount\" : 0.8008281904610115,\n  \"billingStatus\" : 2,\n  \"paymentRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PaymentList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PaymentList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PaymentList>> getPaymentAppliedSummary(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The number of payments to retrieve." ,schema=@Schema()) @Valid @RequestParam(value = "number", required = false) String number) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PaymentList>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"paymentAction\" : 5,\n  \"originalPaymentAmount\" : 5.962133916683182,\n  \"paymentId\" : \"paymentId\",\n  \"unAllocatedAmount\" : 1.4658129805029452,\n  \"paymentMethod\" : 6,\n  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentAmount\" : 0.8008281904610115,\n  \"billingStatus\" : 2,\n  \"paymentRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}, {\n  \"extension\" : { },\n  \"paymentAction\" : 5,\n  \"originalPaymentAmount\" : 5.962133916683182,\n  \"paymentId\" : \"paymentId\",\n  \"unAllocatedAmount\" : 1.4658129805029452,\n  \"paymentMethod\" : 6,\n  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentAmount\" : 0.8008281904610115,\n  \"billingStatus\" : 2,\n  \"paymentRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PaymentList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PaymentList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentDetails> getPaymentDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment or reversal to get, such as 0.0.0.1+-item-payment+294053389732590266.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentDetails>(objectMapper.readValue("{\n  \"billDetails\" : [ {\n    \"itemsAffectedCount\" : 2,\n    \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueAmount\" : 5.637376656633329,\n    \"billId\" : \"billId\",\n    \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"itemsAffected\" : [ {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    }, {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    } ],\n    \"accountNumber\" : \"accountNumber\",\n    \"billUnitId\" : \"billUnitId\"\n  }, {\n    \"itemsAffectedCount\" : 2,\n    \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueAmount\" : 5.637376656633329,\n    \"billId\" : \"billId\",\n    \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"itemsAffected\" : [ {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    }, {\n      \"amount\" : 7.061401241503109,\n      \"item\" : \"item\",\n      \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledNonTaxedAmount\" : 2.027123023002322,\n      \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"settledTaxAmount\" : 9.301444243932576,\n      \"settledTaxedAmount\" : 3.616076749251911,\n      \"accountNumber\" : \"accountNumber\",\n      \"billNumber\" : \"billNumber\",\n      \"billUnitId\" : \"billUnitId\"\n    } ],\n    \"accountNumber\" : \"accountNumber\",\n    \"billUnitId\" : \"billUnitId\"\n  } ],\n  \"extension\" : { },\n  \"paymentAuditDetails\" : [ {\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"amount\" : 3.616076749251911,\n    \"csrLoginId\" : \"csrLoginId\",\n    \"accountNumber\" : \"accountNumber\",\n    \"transactionId\" : \"transactionId\",\n    \"domainId\" : 4,\n    \"firstName\" : \"firstName\",\n    \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"subTransactionId\" : \"subTransactionId\",\n    \"reasonId\" : 7,\n    \"status\" : 2\n  }, {\n    \"lastName\" : \"lastName\",\n    \"extension\" : { },\n    \"amount\" : 3.616076749251911,\n    \"csrLoginId\" : \"csrLoginId\",\n    \"accountNumber\" : \"accountNumber\",\n    \"transactionId\" : \"transactionId\",\n    \"domainId\" : 4,\n    \"firstName\" : \"firstName\",\n    \"activityDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"subTransactionId\" : \"subTransactionId\",\n    \"reasonId\" : 7,\n    \"status\" : 2\n  } ],\n  \"notes\" : [ {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  }, {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  } ],\n  \"reversalDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"receiptDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"eventRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"transactionId\" : \"transactionId\",\n  \"postedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentType\" : 5,\n  \"reversalAmount\" : 7.061401241503109,\n  \"allocatedAmount\" : 6.027456183070403,\n  \"accountId\" : \"accountId\",\n  \"paymentAction\" : 2,\n  \"originalPaymentAmount\" : 0.8008281904610115,\n  \"subTransactionId\" : \"subTransactionId\",\n  \"paymentId\" : \"paymentId\",\n  \"reversalId\" : \"reversalId\",\n  \"originalPaymentDetails\" : {\n    \"accountId\" : \"accountId\",\n    \"paymentItemNumber\" : \"paymentItemNumber\",\n    \"paymentId\" : \"paymentId\"\n  },\n  \"unallocatedAmount\" : 1.4658129805029452,\n  \"currencyId\" : 5,\n  \"payinfoTypeObject\" : {\n    \"extension\" : { },\n    \"name\" : \"name\",\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"paymentType\" : 9\n  }\n}", PaymentDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getPaymentSuspenseUsers() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"userName\" : \"userName\"\n}, {\n  \"extension\" : { },\n  \"userName\" : \"userName\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<PaymentList>> getPayments(@Parameter(in = ParameterIn.PATH, description = "The ID of the account you are retrieving payments for, such as 0.0.0.1+-account+123123.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of payments to retrieve. The only supported value is <b>unallocated</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PaymentList>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"paymentAction\" : 5,\n  \"originalPaymentAmount\" : 5.962133916683182,\n  \"paymentId\" : \"paymentId\",\n  \"unAllocatedAmount\" : 1.4658129805029452,\n  \"paymentMethod\" : 6,\n  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentAmount\" : 0.8008281904610115,\n  \"billingStatus\" : 2,\n  \"paymentRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}, {\n  \"extension\" : { },\n  \"paymentAction\" : 5,\n  \"originalPaymentAmount\" : 5.962133916683182,\n  \"paymentId\" : \"paymentId\",\n  \"unAllocatedAmount\" : 1.4658129805029452,\n  \"paymentMethod\" : 6,\n  \"paymentDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"paymentAmount\" : 0.8008281904610115,\n  \"billingStatus\" : 2,\n  \"paymentRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PaymentList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PaymentList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SuspenseAccount>> getSuspenseAccounts() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SuspenseAccount>>(objectMapper.readValue("[ {\n  \"accountId\" : \"accountId\",\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountNumber\" : \"accountNumber\"\n}, {\n  \"accountId\" : \"accountId\",\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"accountNumber\" : \"accountNumber\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SuspenseAccount>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SuspenseAccount>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> makePayment(@Parameter(in = ParameterIn.QUERY, description = "Whether to save the payment method information: <ul><li><b>true</b> specifies to save the payment method information.</li><li><b>false</b> specifies to make the payment without saving the payment method.</li></ul>" ,schema=@Schema()) @Valid @RequestParam(value = "savePaymentType", required = false) Boolean savePaymentType,@Parameter(in = ParameterIn.DEFAULT, description = "The payment to create. Specifies the target bill unit and the payment amount.", schema=@Schema()) @Valid @RequestBody Payment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payment> makeSuspensePayment(@Parameter(in = ParameterIn.DEFAULT, description = "The suspended payment to create.", schema=@Schema()) @Valid @RequestBody Payment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payment>(objectMapper.readValue("{\n  \"itemPaymentRef\" : \"itemPaymentRef\",\n  \"extension\" : { },\n  \"selectedBillUnit\" : \"selectedBillUnit\",\n  \"amount\" : 6.027456183070403,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"currency\" : 0,\n  \"payinfoTypeObject\" : {\n    \"extension\" : { },\n    \"name\" : \"name\",\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"paymentType\" : 9\n  }\n}", Payment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> reversePayment(@Parameter(in = ParameterIn.DEFAULT, description = "The details about the payment to reverse. The minimum required parameters are&colon;<ul><li>eventID</li><li>Notes</li><li>effectiveDate</li></ul>", schema=@Schema()) @Valid @RequestBody ReversePayment body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> withdrawPaymentSuspense(@Parameter(in = ParameterIn.DEFAULT, description = "The details about the posted payment to withdraw into suspense. The minimum required parameters are&colon;<ul><li>paymentType</li><li>effectiveDate of withdrawal</li><li>domainId</li><li>reasonID</li></ul>", schema=@Schema()) @Valid @RequestBody WithdrawPayment body) {
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
