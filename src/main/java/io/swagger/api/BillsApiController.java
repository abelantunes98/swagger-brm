package io.swagger.api;

import io.swagger.model.ArActionsList;
import io.swagger.model.Bill;
import io.swagger.model.CorrectiveBill;
import io.swagger.model.CorrectiveBillTrail;
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
public class BillsApiController implements BillsApi {

    private static final Logger log = LoggerFactory.getLogger(BillsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BillsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Resource> billNow(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit.", required=true, schema=@Schema()) @PathVariable("id") String id) {
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

    public ResponseEntity<List<ArActionsList>> getArActions(@Parameter(in = ParameterIn.PATH, description = "The ID for the bill.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The bill number, such as B1728." ,schema=@Schema()) @Valid @RequestParam(value = "number", required = false) String number) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ArActionsList>>(objectMapper.readValue("[ {\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"arActionAmount\" : 6.027456183070403,\n  \"accountNumber\" : \"accountNumber\",\n  \"billingStatus\" : 5,\n  \"firstName\" : \"firstName\",\n  \"arUnallocatedAmount\" : 1.4658129805029452,\n  \"arActionId\" : \"arActionId\",\n  \"itemName\" : \"itemName\",\n  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"billID\" : \"billID\",\n  \"billUnitName\" : \"billUnitName\",\n  \"arActionType\" : 0,\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"arActionAmount\" : 6.027456183070403,\n  \"accountNumber\" : \"accountNumber\",\n  \"billingStatus\" : 5,\n  \"firstName\" : \"firstName\",\n  \"arUnallocatedAmount\" : 1.4658129805029452,\n  \"arActionId\" : \"arActionId\",\n  \"itemName\" : \"itemName\",\n  \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"billID\" : \"billID\",\n  \"billUnitName\" : \"billUnitName\",\n  \"arActionType\" : 0,\n  \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ArActionsList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ArActionsList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Bill> getBillDetails(@Parameter(in = ParameterIn.PATH, description = "The bill number such as \"B1-111\", or the bill ID such as \"0.0.0.1+-bill+295302434942001779\".", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Account Id" ,schema=@Schema()) @Valid @RequestParam(value = "accountid", required = false) String accountid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Bill>(objectMapper.readValue("{\n  \"transfered\" : 7.386281948385884,\n  \"writeoff\" : 1.2315135367772556,\n  \"extension\" : { },\n  \"billDisputed\" : true,\n  \"totalDue\" : 7.061401241503109,\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"previousTotal\" : 2.3021358869347655,\n  \"billInfoId\" : \"billInfoId\",\n  \"subordsTotal\" : 4.145608029883936,\n  \"billPaidDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"receivedForBill\" : 9.301444243932576,\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionsAmtExcludingPayments\" : 3.616076749251911,\n  \"currency\" : 6,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"hierarchySize\" : 2,\n  \"originalBillNo\" : \"originalBillNo\",\n  \"disputed\" : 1.4658129805029452,\n  \"amount\" : 1.0246457001441578,\n  \"parentLastName\" : \"parentLastName\",\n  \"adjusted\" : 0.8008281904610115,\n  \"recurringCharges\" : 1.4894159098541704,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"parentCompanyName\" : \"parentCompanyName\",\n  \"parentFirstName\" : \"parentFirstName\",\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 5.637376656633329,\n  \"parentSalutation\" : \"parentSalutation\",\n  \"name\" : \"name\",\n  \"accountRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"currentTotal\" : 5.962133916683182\n}", Bill.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Bill>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Bill>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Bill>> getBills(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get bills for.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Whether to retrieve only open bills (<b>open</b>) or not (blank)." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.QUERY, description = "The number of bills to get." ,schema=@Schema()) @Valid @RequestParam(value = "count", required = false) Integer count,@Parameter(in = ParameterIn.QUERY, description = "The sort order, which is either ascending (<b>asc</b>) or descending (<b>desc</b>). The default is descending." ,schema=@Schema()) @Valid @RequestParam(value = "order", required = false) String order,@Parameter(in = ParameterIn.QUERY, description = "The type of bill, which can be <b>all</b> (parent and children) or <b>childonly</b> (only children)." ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand,@Parameter(in = ParameterIn.QUERY, description = "Whether to get a bill's recurring charges (<b>true</b>) or not (<b>false</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "retrieveRecurringCharges", required = false) String retrieveRecurringCharges) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Bill>>(objectMapper.readValue("[ {\n  \"transfered\" : 7.386281948385884,\n  \"writeoff\" : 1.2315135367772556,\n  \"extension\" : { },\n  \"billDisputed\" : true,\n  \"totalDue\" : 7.061401241503109,\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"previousTotal\" : 2.3021358869347655,\n  \"billInfoId\" : \"billInfoId\",\n  \"subordsTotal\" : 4.145608029883936,\n  \"billPaidDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"receivedForBill\" : 9.301444243932576,\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionsAmtExcludingPayments\" : 3.616076749251911,\n  \"currency\" : 6,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"hierarchySize\" : 2,\n  \"originalBillNo\" : \"originalBillNo\",\n  \"disputed\" : 1.4658129805029452,\n  \"amount\" : 1.0246457001441578,\n  \"parentLastName\" : \"parentLastName\",\n  \"adjusted\" : 0.8008281904610115,\n  \"recurringCharges\" : 1.4894159098541704,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"parentCompanyName\" : \"parentCompanyName\",\n  \"parentFirstName\" : \"parentFirstName\",\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 5.637376656633329,\n  \"parentSalutation\" : \"parentSalutation\",\n  \"name\" : \"name\",\n  \"accountRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"currentTotal\" : 5.962133916683182\n}, {\n  \"transfered\" : 7.386281948385884,\n  \"writeoff\" : 1.2315135367772556,\n  \"extension\" : { },\n  \"billDisputed\" : true,\n  \"totalDue\" : 7.061401241503109,\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"previousTotal\" : 2.3021358869347655,\n  \"billInfoId\" : \"billInfoId\",\n  \"subordsTotal\" : 4.145608029883936,\n  \"billPaidDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"receivedForBill\" : 9.301444243932576,\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionsAmtExcludingPayments\" : 3.616076749251911,\n  \"currency\" : 6,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"hierarchySize\" : 2,\n  \"originalBillNo\" : \"originalBillNo\",\n  \"disputed\" : 1.4658129805029452,\n  \"amount\" : 1.0246457001441578,\n  \"parentLastName\" : \"parentLastName\",\n  \"adjusted\" : 0.8008281904610115,\n  \"recurringCharges\" : 1.4894159098541704,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"parentCompanyName\" : \"parentCompanyName\",\n  \"parentFirstName\" : \"parentFirstName\",\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 5.637376656633329,\n  \"parentSalutation\" : \"parentSalutation\",\n  \"name\" : \"name\",\n  \"accountRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"currentTotal\" : 5.962133916683182\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Bill>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Bill>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Bill>> getBillsForBillUnit(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of bill, which can be <b>inprogress</b>, <b>open</b>, or <b>all</b>. The default is <b>open</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.QUERY, description = "The number of bills to get." ,schema=@Schema()) @Valid @RequestParam(value = "count", required = false) Integer count,@Parameter(in = ParameterIn.QUERY, description = "The sort order, which is either ascending (<b>asc</b>) or descending (<b>desc</b>). The default is descending." ,schema=@Schema()) @Valid @RequestParam(value = "order", required = false) String order,@Parameter(in = ParameterIn.QUERY, description = "The type of bills to get, which is either <b>all</b> (parent as well as children) or <b>childonly</b> (children only)." ,schema=@Schema()) @Valid @RequestParam(value = "expand", required = false) String expand,@Parameter(in = ParameterIn.QUERY, description = "Whether to retrieve recurring charges of a bill (<b>true</b>) or not (<b>false</b>)." ,schema=@Schema()) @Valid @RequestParam(value = "retrieveRecurringCharges", required = false) String retrieveRecurringCharges) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Bill>>(objectMapper.readValue("[ {\n  \"transfered\" : 7.386281948385884,\n  \"writeoff\" : 1.2315135367772556,\n  \"extension\" : { },\n  \"billDisputed\" : true,\n  \"totalDue\" : 7.061401241503109,\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"previousTotal\" : 2.3021358869347655,\n  \"billInfoId\" : \"billInfoId\",\n  \"subordsTotal\" : 4.145608029883936,\n  \"billPaidDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"receivedForBill\" : 9.301444243932576,\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionsAmtExcludingPayments\" : 3.616076749251911,\n  \"currency\" : 6,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"hierarchySize\" : 2,\n  \"originalBillNo\" : \"originalBillNo\",\n  \"disputed\" : 1.4658129805029452,\n  \"amount\" : 1.0246457001441578,\n  \"parentLastName\" : \"parentLastName\",\n  \"adjusted\" : 0.8008281904610115,\n  \"recurringCharges\" : 1.4894159098541704,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"parentCompanyName\" : \"parentCompanyName\",\n  \"parentFirstName\" : \"parentFirstName\",\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 5.637376656633329,\n  \"parentSalutation\" : \"parentSalutation\",\n  \"name\" : \"name\",\n  \"accountRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"currentTotal\" : 5.962133916683182\n}, {\n  \"transfered\" : 7.386281948385884,\n  \"writeoff\" : 1.2315135367772556,\n  \"extension\" : { },\n  \"billDisputed\" : true,\n  \"totalDue\" : 7.061401241503109,\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"previousTotal\" : 2.3021358869347655,\n  \"billInfoId\" : \"billInfoId\",\n  \"subordsTotal\" : 4.145608029883936,\n  \"billPaidDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"receivedForBill\" : 9.301444243932576,\n  \"cycleEnds\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"arActionsAmtExcludingPayments\" : 3.616076749251911,\n  \"currency\" : 6,\n  \"id\" : \"id\",\n  \"billNo\" : \"billNo\",\n  \"hierarchySize\" : 2,\n  \"originalBillNo\" : \"originalBillNo\",\n  \"disputed\" : 1.4658129805029452,\n  \"amount\" : 1.0246457001441578,\n  \"parentLastName\" : \"parentLastName\",\n  \"adjusted\" : 0.8008281904610115,\n  \"recurringCharges\" : 1.4894159098541704,\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"parentCompanyName\" : \"parentCompanyName\",\n  \"parentFirstName\" : \"parentFirstName\",\n  \"cycleStarts\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"due\" : 5.637376656633329,\n  \"parentSalutation\" : \"parentSalutation\",\n  \"name\" : \"name\",\n  \"accountRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"currentTotal\" : 5.962133916683182\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Bill>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Bill>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CorrectiveBillTrail> getCorrectiveBillInfo(@Parameter(in = ParameterIn.PATH, description = "The ID of the corrective bill.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CorrectiveBillTrail>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"disputed\" : 5.962133916683182,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"adjusted\" : 1.4658129805029452,\n  \"totalDue\" : 9.301444243932576,\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"subordsTotal\" : 3.616076749251911,\n  \"invoiceFormat\" : 0,\n  \"due\" : 7.061401241503109,\n  \"receivedForBill\" : 2.027123023002322,\n  \"arActionsAmtExcludingPayments\" : 2.3021358869347655,\n  \"invoiceType\" : 6,\n  \"currentTotal\" : 5.637376656633329,\n  \"billNo\" : \"billNo\",\n  \"originalBill\" : {\n    \"extension\" : { },\n    \"disputed\" : 1.0246457001441578,\n    \"adjusted\" : 1.2315135367772556,\n    \"totalDue\" : 1.1730742509559433,\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"subordsTotal\" : 4.965218492984954,\n    \"invoiceFormat\" : 4,\n    \"due\" : 7.457744773683766,\n    \"receivedForBill\" : 5.025004791520295,\n    \"arActionsAmtExcludingPayments\" : 6.84685269835264,\n    \"invoiceType\" : 7,\n    \"currentTotal\" : 1.4894159098541704,\n    \"billNo\" : \"billNo\"\n  }\n}", CorrectiveBillTrail.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CorrectiveBillTrail>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CorrectiveBillTrail>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getInvoice(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill, such as 0.0.0.1+-bill+514617.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The bill number." ,schema=@Schema()) @Valid @RequestParam(value = "number", required = false) String number) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> produceCorrectiveBill(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the corrective bill.", schema=@Schema()) @Valid @RequestBody CorrectiveBill body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> transferNegativeBalance(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill to transfer the negative balance from.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The details of the bills to transfer the balance to.", schema=@Schema()) @Valid @RequestBody List<Bill> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
