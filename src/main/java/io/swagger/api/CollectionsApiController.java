package io.swagger.api;

import io.swagger.model.AccountCollectionDetails;
import io.swagger.model.AssignCollectionsAgent;
import io.swagger.model.CollectionDetails;
import io.swagger.model.CollectionsActionHistory;
import io.swagger.model.CollectionsExemptedBillUnits;
import io.swagger.model.CollectionsGroup;
import io.swagger.model.CollectionsGroupDetails;
import io.swagger.model.Configurations;
import io.swagger.model.EditAction;
import io.swagger.model.InsertAction;
import io.swagger.model.NotesInfo;
import io.swagger.model.PromiseToPay;
import io.swagger.model.ReplaceScenarioDetails;
import org.springframework.core.io.Resource;
import io.swagger.model.User;
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
public class CollectionsApiController implements CollectionsApi {

    private static final Logger log = LoggerFactory.getLogger(CollectionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CollectionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMember(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit to add, such as 0.0.0.1+-billinfo+69381+10.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The ID of the collections group.<p>This query parameter is required." ,schema=@Schema()) @Valid @RequestParam(value = "collectiongroupid", required = false) String collectiongroupid,@Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the member added to the collections group.", schema=@Schema()) @Valid @RequestBody NotesInfo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> assignCollectionAgent(@Parameter(in = ParameterIn.DEFAULT, description = "Details about the collections agent to assign to the bill unit. The minimum required parameters are&colon;<ul><li><b>billunitRef</b></li><li><b>collectionAgent</b></li></ul>", schema=@Schema()) @Valid @RequestBody AssignCollectionsAgent body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> createCollectionsGroup(@Parameter(in = ParameterIn.DEFAULT, description = "The collections group to create. The minimum required parameters are&colon;<p><ul><li><b>parentBillUnitRef</b></li><li><b>name</b></li></ul>This payload can also contain an optional list of members in the collections group.", schema=@Schema()) @Valid @RequestBody CollectionsGroup body) {
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

    public ResponseEntity<Void> deleteCollectionsGroup(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections group to delete, such as 0.0.0.1+-group-collections_targets+278050.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> editAction(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections action, such as 0.0.0.1+-collections_action-manual_action+2304239.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The modifications to make to the collections action. The minimum required parameter is&colon; <b>rescheduleDate</b>.", schema=@Schema()) @Valid @RequestBody EditAction body) {
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

    public ResponseEntity<Void> exempt(@Parameter(in = ParameterIn.PATH, description = "The bill unit ID to exempt from collections.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the exemption.", schema=@Schema()) @Valid @RequestBody NotesInfo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CollectionDetails> getCollectionDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the account, such as 0.0.0.1+-account+123123, to get collections details for.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CollectionDetails>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"overdueAmount\" : 0.8008281904610115,\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"agingBuckets\" : [ {\n    \"due\" : 5.637376656633329,\n    \"days\" : 5\n  }, {\n    \"due\" : 5.637376656633329,\n    \"days\" : 5\n  } ],\n  \"overdueDays\" : 6,\n  \"billUnitId\" : \"billUnitId\",\n  \"scenarioId\" : \"scenarioId\",\n  \"actions\" : [ {\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"actionId\" : \"actionId\",\n    \"action\" : \"action\",\n    \"completedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 2\n  }, {\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"actionId\" : \"actionId\",\n    \"action\" : \"action\",\n    \"completedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 2\n  } ],\n  \"minimumDue\" : 1.4658129805029452\n}", CollectionDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CollectionDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CollectionDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountCollectionDetails> getCollectionDetailsForAccount(@Parameter(in = ParameterIn.PATH, description = "The ID for the account, such as 0.0.0.1+-account+123123.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountCollectionDetails>(objectMapper.readValue("{\n  \"zip\" : \"zip\",\n  \"lastName\" : \"lastName\",\n  \"country\" : \"country\",\n  \"extension\" : { },\n  \"address\" : \"address\",\n  \"city\" : \"city\",\n  \"phonenumbers\" : [ {\n    \"number\" : \"number\",\n    \"phonetype\" : 9\n  }, {\n    \"number\" : \"number\",\n    \"phonetype\" : 9\n  } ],\n  \"accountNumber\" : \"accountNumber\",\n  \"numberOfBillUnitsInCollections\" : 3,\n  \"accountId\" : \"accountId\",\n  \"firstName\" : \"firstName\",\n  \"emailAddress\" : \"emailAddress\",\n  \"billUnitCollectionsDetails\" : [ {\n    \"overdueAmount\" : 0.8008281904610115,\n    \"notes\" : {\n      \"eventId\" : \"eventId\",\n      \"extension\" : { },\n      \"amount\" : 0.8008281904610115,\n      \"comments\" : [ {\n        \"csrLastName\" : \"csrLastName\",\n        \"externalUser\" : \"externalUser\",\n        \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"csrLoginId\" : \"csrLoginId\",\n        \"csrFirstName\" : \"csrFirstName\",\n        \"csrAccountId\" : \"csrAccountId\",\n        \"comment\" : \"comment\",\n        \"trackingId\" : \"trackingId\"\n      }, {\n        \"csrLastName\" : \"csrLastName\",\n        \"externalUser\" : \"externalUser\",\n        \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"csrLoginId\" : \"csrLoginId\",\n        \"csrFirstName\" : \"csrFirstName\",\n        \"csrAccountId\" : \"csrAccountId\",\n        \"comment\" : \"comment\",\n        \"trackingId\" : \"trackingId\"\n      } ],\n      \"count\" : 6,\n      \"type\" : 5,\n      \"domainId\" : 5,\n      \"accountId\" : \"accountId\",\n      \"itemId\" : \"itemId\",\n      \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"reasonId\" : 2,\n      \"billId\" : \"billId\",\n      \"header\" : \"header\",\n      \"subType\" : 1,\n      \"id\" : \"id\",\n      \"billUnitId\" : \"billUnitId\",\n      \"serviceId\" : \"serviceId\",\n      \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : 7.061401241503109\n    },\n    \"collectionsGroupId\" : \"collectionsGroupId\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"lastPaymentId\" : \"lastPaymentId\",\n    \"numberOfTimesInCollections\" : 2,\n    \"collectionsActions\" : [ {\n      \"amount\" : 7.061401241503109,\n      \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"action\" : \"action\",\n      \"actionId\" : \"actionId\",\n      \"configCollectionsId\" : \"configCollectionsId\",\n      \"completedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : 9\n    }, {\n      \"amount\" : 7.061401241503109,\n      \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"action\" : \"action\",\n      \"actionId\" : \"actionId\",\n      \"configCollectionsId\" : \"configCollectionsId\",\n      \"completedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : 9\n    } ],\n    \"collectionAgent\" : \"collectionAgent\",\n    \"minimumPayment\" : 6.027456183070403,\n    \"billUnitName\" : \"billUnitName\",\n    \"overdueDays\" : 1,\n    \"lastPaymentAmount\" : 5.962133916683182,\n    \"lastPaymentEffectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"currency\" : 5,\n    \"billUnitId\" : \"billUnitId\",\n    \"scenarioId\" : \"scenarioId\",\n    \"scenarioName\" : \"scenarioName\"\n  }, {\n    \"overdueAmount\" : 0.8008281904610115,\n    \"notes\" : {\n      \"eventId\" : \"eventId\",\n      \"extension\" : { },\n      \"amount\" : 0.8008281904610115,\n      \"comments\" : [ {\n        \"csrLastName\" : \"csrLastName\",\n        \"externalUser\" : \"externalUser\",\n        \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"csrLoginId\" : \"csrLoginId\",\n        \"csrFirstName\" : \"csrFirstName\",\n        \"csrAccountId\" : \"csrAccountId\",\n        \"comment\" : \"comment\",\n        \"trackingId\" : \"trackingId\"\n      }, {\n        \"csrLastName\" : \"csrLastName\",\n        \"externalUser\" : \"externalUser\",\n        \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"csrLoginId\" : \"csrLoginId\",\n        \"csrFirstName\" : \"csrFirstName\",\n        \"csrAccountId\" : \"csrAccountId\",\n        \"comment\" : \"comment\",\n        \"trackingId\" : \"trackingId\"\n      } ],\n      \"count\" : 6,\n      \"type\" : 5,\n      \"domainId\" : 5,\n      \"accountId\" : \"accountId\",\n      \"itemId\" : \"itemId\",\n      \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"reasonId\" : 2,\n      \"billId\" : \"billId\",\n      \"header\" : \"header\",\n      \"subType\" : 1,\n      \"id\" : \"id\",\n      \"billUnitId\" : \"billUnitId\",\n      \"serviceId\" : \"serviceId\",\n      \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : 7.061401241503109\n    },\n    \"collectionsGroupId\" : \"collectionsGroupId\",\n    \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"lastPaymentId\" : \"lastPaymentId\",\n    \"numberOfTimesInCollections\" : 2,\n    \"collectionsActions\" : [ {\n      \"amount\" : 7.061401241503109,\n      \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"action\" : \"action\",\n      \"actionId\" : \"actionId\",\n      \"configCollectionsId\" : \"configCollectionsId\",\n      \"completedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : 9\n    }, {\n      \"amount\" : 7.061401241503109,\n      \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"action\" : \"action\",\n      \"actionId\" : \"actionId\",\n      \"configCollectionsId\" : \"configCollectionsId\",\n      \"completedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : 9\n    } ],\n    \"collectionAgent\" : \"collectionAgent\",\n    \"minimumPayment\" : 6.027456183070403,\n    \"billUnitName\" : \"billUnitName\",\n    \"overdueDays\" : 1,\n    \"lastPaymentAmount\" : 5.962133916683182,\n    \"lastPaymentEffectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"currency\" : 5,\n    \"billUnitId\" : \"billUnitId\",\n    \"scenarioId\" : \"scenarioId\",\n    \"scenarioName\" : \"scenarioName\"\n  } ],\n  \"company\" : \"company\",\n  \"state\" : \"state\"\n}", AccountCollectionDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountCollectionDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountCollectionDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CollectionsActionHistory> getCollectionsActionHistory(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections action to get.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CollectionsActionHistory>(objectMapper.readValue("{\n  \"actionHistory\" : [ {\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"changeDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"description\" : \"description\",\n    \"agentName\" : \"agentName\",\n    \"status\" : 0\n  }, {\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"changeDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"description\" : \"description\",\n    \"agentName\" : \"agentName\",\n    \"status\" : 0\n  } ],\n  \"extension\" : { },\n  \"actionId\" : \"actionId\"\n}", CollectionsActionHistory.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CollectionsActionHistory>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CollectionsActionHistory>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CollectionsExemptedBillUnits>> getCollectionsExemptedBillUnits() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CollectionsExemptedBillUnits>>(objectMapper.readValue("[ {\n  \"accountId\" : \"accountId\",\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"billUnitName\" : \"billUnitName\",\n  \"billUnitId\" : \"billUnitId\",\n  \"accountNumber\" : \"accountNumber\"\n}, {\n  \"accountId\" : \"accountId\",\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"extension\" : { },\n  \"billUnitName\" : \"billUnitName\",\n  \"billUnitId\" : \"billUnitId\",\n  \"accountNumber\" : \"accountNumber\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CollectionsExemptedBillUnits>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CollectionsExemptedBillUnits>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CollectionsGroup> getCollectionsGroup(@Parameter(in = ParameterIn.PATH, description = "The parent bill unit of the collection's group, such as 0.0.0.1+-billinfo+123123.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CollectionsGroup>(objectMapper.readValue("{\n  \"parentBillUnitDue\" : 0.8008281904610115,\n  \"parentBillUnitRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"extension\" : { },\n  \"notes\" : {\n    \"eventId\" : \"eventId\",\n    \"extension\" : { },\n    \"amount\" : 0.8008281904610115,\n    \"comments\" : [ {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    }, {\n      \"csrLastName\" : \"csrLastName\",\n      \"externalUser\" : \"externalUser\",\n      \"entryDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"csrLoginId\" : \"csrLoginId\",\n      \"csrFirstName\" : \"csrFirstName\",\n      \"csrAccountId\" : \"csrAccountId\",\n      \"comment\" : \"comment\",\n      \"trackingId\" : \"trackingId\"\n    } ],\n    \"count\" : 6,\n    \"type\" : 5,\n    \"domainId\" : 5,\n    \"accountId\" : \"accountId\",\n    \"itemId\" : \"itemId\",\n    \"closedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"reasonId\" : 2,\n    \"billId\" : \"billId\",\n    \"header\" : \"header\",\n    \"subType\" : 1,\n    \"id\" : \"id\",\n    \"billUnitId\" : \"billUnitId\",\n    \"serviceId\" : \"serviceId\",\n    \"effectiveDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"status\" : 7.061401241503109\n  },\n  \"members\" : [ {\n    \"markAsDelete\" : true,\n    \"index\" : 6\n  }, {\n    \"markAsDelete\" : true,\n    \"index\" : 6\n  } ],\n  \"name\" : \"name\"\n}", CollectionsGroup.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CollectionsGroup>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CollectionsGroup>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CollectionsGroupDetails> getCollectionsGroupDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the account to get collections group details for.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CollectionsGroupDetails>(objectMapper.readValue("{\n  \"groupMembers\" : [ {\n    \"groupName\" : \"groupName\",\n    \"billUnitName\" : \"billUnitName\",\n    \"parentBillUnitName\" : \"parentBillUnitName\",\n    \"parentAccountNumber\" : \"parentAccountNumber\"\n  }, {\n    \"groupName\" : \"groupName\",\n    \"billUnitName\" : \"billUnitName\",\n    \"parentBillUnitName\" : \"parentBillUnitName\",\n    \"parentAccountNumber\" : \"parentAccountNumber\"\n  } ],\n  \"extension\" : { },\n  \"groupOwners\" : [ {\n    \"groupName\" : \"groupName\",\n    \"memberCount\" : 0,\n    \"billUnitName\" : \"billUnitName\",\n    \"groupRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    }\n  }, {\n    \"groupName\" : \"groupName\",\n    \"memberCount\" : 0,\n    \"billUnitName\" : \"billUnitName\",\n    \"groupRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    }\n  } ]\n}", CollectionsGroupDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CollectionsGroupDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CollectionsGroupDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getCollectionsUsers() {
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

    public ResponseEntity<Configurations> getConfigActions() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Configurations>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"thresholds\" : [ {\n    \"value\" : 0,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : 0,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"mapping\" : [ {\n    \"map\" : [ {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    }, {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    } ],\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"map\" : [ {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    }, {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    } ],\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"keyvals\" : [ {\n    \"value\" : \"value\",\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : \"value\",\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"flags\" : [ {\n    \"value\" : true,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : true,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ]\n}", Configurations.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Configurations>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Configurations>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Configurations> getConfigProfiles() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Configurations>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"thresholds\" : [ {\n    \"value\" : 0,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : 0,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"mapping\" : [ {\n    \"map\" : [ {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    }, {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    } ],\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"map\" : [ {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    }, {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    } ],\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"keyvals\" : [ {\n    \"value\" : \"value\",\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : \"value\",\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"flags\" : [ {\n    \"value\" : true,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : true,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ]\n}", Configurations.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Configurations>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Configurations>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Configurations> getConfigScenarios(@Parameter(in = ParameterIn.QUERY, description = "The ID of the collections scenario to get." ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Configurations>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"thresholds\" : [ {\n    \"value\" : 0,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : 0,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"mapping\" : [ {\n    \"map\" : [ {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    }, {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    } ],\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"map\" : [ {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    }, {\n      \"id\" : \"id\",\n      \"key\" : \"key\"\n    } ],\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"keyvals\" : [ {\n    \"value\" : \"value\",\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : \"value\",\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ],\n  \"flags\" : [ {\n    \"value\" : true,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  }, {\n    \"value\" : true,\n    \"version\" : \"version\",\n    \"key\" : \"key\",\n    \"desc\" : \"desc\"\n  } ]\n}", Configurations.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Configurations>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Configurations>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> insertAction(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections action to add, such as 0.0.0.1+-config-collections-action+826.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Information about the collections action to add.", schema=@Schema()) @Valid @RequestBody InsertAction body) {
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

    public ResponseEntity<Void> modifyCollectionsGroup(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections group to update.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the collections group update.", schema=@Schema()) @Valid @RequestBody CollectionsGroup body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> promiseToPay(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit, such as 0.0.0.1+-billinfo+2313045.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the promise to pay agreement. The minimum required parameter is&colon; <b>effectiveDate</b>.", schema=@Schema()) @Valid @RequestBody PromiseToPay body) {
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

    public ResponseEntity<Void> removeBillUnitFromCollections(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit, such as 0.0.0.1+-billinfo+69381+10.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the removal.", schema=@Schema()) @Valid @RequestBody NotesInfo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeMember(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit to remove from the collections group, such as 0.0.0.1+-billinfo+69381+10.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The optional notes associated with the removal.", schema=@Schema()) @Valid @RequestBody NotesInfo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> replaceCollectionScenario(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the old and new collections scenarios. It also contains the date from when new scenario has to be scheduled.", schema=@Schema()) @Valid @RequestBody ReplaceScenarioDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> revokePromiseToPay(@Parameter(in = ParameterIn.PATH, description = "The ID of the collections scenario, such as 0.0.0.1+-collections_scenario+206452.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The CSR notes to associate with the cancelled promise-to-pay agreement.", schema=@Schema()) @Valid @RequestBody NotesInfo body) {
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

    public ResponseEntity<Void> unexempt(@Parameter(in = ParameterIn.PATH, description = "The ID of the bill unit to unexempt from collections.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Optional notes objectt", schema=@Schema()) @Valid @RequestBody NotesInfo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
