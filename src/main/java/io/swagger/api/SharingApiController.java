package io.swagger.api;

import io.swagger.model.ProfileServExtratingType;
import io.swagger.model.SharingGroupMembers;
import io.swagger.model.SharingMember;
import io.swagger.model.SharingMemberDetails;
import io.swagger.model.SharingMemberServiceDetails;
import io.swagger.model.SharingOwner;
import io.swagger.model.SharingOwnerDetails;
import io.swagger.model.Sponsor;
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
public class SharingApiController implements SharingApi {

    private static final Logger log = LoggerFactory.getLogger(SharingApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SharingApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addMembers(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group, which is either <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.DEFAULT, description = "The sharing group member details.", schema=@Schema()) @Valid @RequestBody SharingMember body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> createSharingGroup(@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the sharing group to create. The minimum required parameters are&colon;<ul><li><b>accountRef</b></li><li><b>groupName</b></li><li><b>groupOwnerBalGroupref</b></li><li><b>parentRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody SharingOwner body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteMembers(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.DEFAULT, description = "The list of members in the sharing group to delete.  The minimum required parameters are&colon;<ul><li><b>membership</b></li><li><b>orderedBalGroupRef</b></li></ul>", schema=@Schema()) @Valid @RequestBody SharingMember body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteOwnership(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group, which is either <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> editMembers(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group to which the member belongs." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.DEFAULT, description = "The details to update for the member.", schema=@Schema()) @Valid @RequestBody SharingMemberServiceDetails body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SharingOwnerDetails> getGroupDetails(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SharingOwnerDetails>(objectMapper.readValue("{\n  \"extension\" : { },\n  \"billunitName\" : \"billunitName\",\n  \"ownershipDetails\" : [ {\n    \"quantity\" : 6.027456183070403,\n    \"name\" : \"name\",\n    \"index\" : 1,\n    \"description\" : \"description\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"quantity\" : 6.027456183070403,\n    \"name\" : \"name\",\n    \"index\" : 1,\n    \"description\" : \"description\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"memberCount\" : 0,\n  \"globalChargeShareGroup\" : true,\n  \"groupOwnerBalGroupName\" : \"groupOwnerBalGroupName\",\n  \"groupName\" : \"groupName\",\n  \"parentName\" : \"parentName\",\n  \"paymentMethod\" : \"paymentMethod\",\n  \"groupRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}", SharingOwnerDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SharingOwnerDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SharingOwnerDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SharingGroupMembers>> getMembersOfGroup(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group to get.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SharingGroupMembers>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"memberDetails\" : [ {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"accountRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"services\" : [ {\n      \"index\" : 0\n    }, {\n      \"index\" : 0\n    } ],\n    \"accountNumber\" : \"accountNumber\"\n  }, {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"accountRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"services\" : [ {\n      \"index\" : 0\n    }, {\n      \"index\" : 0\n    } ],\n    \"accountNumber\" : \"accountNumber\"\n  } ]\n}, {\n  \"extension\" : { },\n  \"memberDetails\" : [ {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"accountRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"services\" : [ {\n      \"index\" : 0\n    }, {\n      \"index\" : 0\n    } ],\n    \"accountNumber\" : \"accountNumber\"\n  }, {\n    \"firstName\" : \"firstName\",\n    \"lastName\" : \"lastName\",\n    \"accountRef\" : {\n      \"id\" : \"id\",\n      \"uri\" : \"uri\"\n    },\n    \"services\" : [ {\n      \"index\" : 0\n    }, {\n      \"index\" : 0\n    } ],\n    \"accountNumber\" : \"accountNumber\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SharingGroupMembers>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SharingGroupMembers>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SharingMemberDetails>> getMembership(@Parameter(in = ParameterIn.PATH, description = "The account ID of the sharing group member.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group to get: <b>charge</b> or <b>discount</b>.<p>This query parameter is required." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SharingMemberDetails>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"membershipDetails\" : [ {\n    \"groupName\" : \"groupName\",\n    \"parentName\" : \"parentName\",\n    \"serviceName\" : \"serviceName\",\n    \"priority\" : 0,\n    \"accountNumber\" : \"accountNumber\"\n  }, {\n    \"groupName\" : \"groupName\",\n    \"parentName\" : \"parentName\",\n    \"serviceName\" : \"serviceName\",\n    \"priority\" : 0,\n    \"accountNumber\" : \"accountNumber\"\n  } ],\n  \"groupref\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}, {\n  \"extension\" : { },\n  \"membershipDetails\" : [ {\n    \"groupName\" : \"groupName\",\n    \"parentName\" : \"parentName\",\n    \"serviceName\" : \"serviceName\",\n    \"priority\" : 0,\n    \"accountNumber\" : \"accountNumber\"\n  }, {\n    \"groupName\" : \"groupName\",\n    \"parentName\" : \"parentName\",\n    \"serviceName\" : \"serviceName\",\n    \"priority\" : 0,\n    \"accountNumber\" : \"accountNumber\"\n  } ],\n  \"groupref\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SharingMemberDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SharingMemberDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<SharingOwnerDetails>> getOwnership(@Parameter(in = ParameterIn.PATH, description = "The ID of the account.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<SharingOwnerDetails>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"billunitName\" : \"billunitName\",\n  \"ownershipDetails\" : [ {\n    \"quantity\" : 6.027456183070403,\n    \"name\" : \"name\",\n    \"index\" : 1,\n    \"description\" : \"description\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"quantity\" : 6.027456183070403,\n    \"name\" : \"name\",\n    \"index\" : 1,\n    \"description\" : \"description\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"memberCount\" : 0,\n  \"globalChargeShareGroup\" : true,\n  \"groupOwnerBalGroupName\" : \"groupOwnerBalGroupName\",\n  \"groupName\" : \"groupName\",\n  \"parentName\" : \"parentName\",\n  \"paymentMethod\" : \"paymentMethod\",\n  \"groupRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n}, {\n  \"extension\" : { },\n  \"billunitName\" : \"billunitName\",\n  \"ownershipDetails\" : [ {\n    \"quantity\" : 6.027456183070403,\n    \"name\" : \"name\",\n    \"index\" : 1,\n    \"description\" : \"description\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"quantity\" : 6.027456183070403,\n    \"name\" : \"name\",\n    \"index\" : 1,\n    \"description\" : \"description\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"memberCount\" : 0,\n  \"globalChargeShareGroup\" : true,\n  \"groupOwnerBalGroupName\" : \"groupOwnerBalGroupName\",\n  \"groupName\" : \"groupName\",\n  \"parentName\" : \"parentName\",\n  \"paymentMethod\" : \"paymentMethod\",\n  \"groupRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<SharingOwnerDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<SharingOwnerDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProfileServExtratingType>> getProfiles(@Parameter(in = ParameterIn.PATH, description = "The ID of the profile sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProfileServExtratingType>>(objectMapper.readValue("[ {\n  \"dataArray\" : [ {\n    \"elem\" : 0,\n    \"name\" : \"name\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"value\" : \"value\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"elem\" : 0,\n    \"name\" : \"name\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"value\" : \"value\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"extension\" : { },\n  \"parentName\" : \"parentName\",\n  \"name\" : \"name\",\n  \"id\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"extrating\" : {\n    \"referenceCount\" : 6,\n    \"label\" : \"label\",\n    \"status\" : 1\n  },\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"multiValued\" : true,\n  \"selected\" : true\n}, {\n  \"dataArray\" : [ {\n    \"elem\" : 0,\n    \"name\" : \"name\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"value\" : \"value\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"elem\" : 0,\n    \"name\" : \"name\",\n    \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"value\" : \"value\",\n    \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"extension\" : { },\n  \"parentName\" : \"parentName\",\n  \"name\" : \"name\",\n  \"id\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"extrating\" : {\n    \"referenceCount\" : 6,\n    \"label\" : \"label\",\n    \"status\" : 1\n  },\n  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"multiValued\" : true,\n  \"selected\" : true\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProfileServExtratingType>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProfileServExtratingType>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Sponsor>> getSponsors() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Sponsor>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"quantity\" : \"quantity\",\n  \"name\" : \"name\",\n  \"eventDescription\" : \"eventDescription\",\n  \"description\" : \"description\",\n  \"eventType\" : \"eventType\",\n  \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"sponsorshipRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"selected\" : true,\n  \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"extension\" : { },\n  \"quantity\" : \"quantity\",\n  \"name\" : \"name\",\n  \"eventDescription\" : \"eventDescription\",\n  \"description\" : \"description\",\n  \"eventType\" : \"eventType\",\n  \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"sponsorshipRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"selected\" : true,\n  \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Sponsor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Sponsor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Sponsor>> getSponsorsForDiscount(@Parameter(in = ParameterIn.PATH, description = "The ID of the account.", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Sponsor>>(objectMapper.readValue("[ {\n  \"extension\" : { },\n  \"quantity\" : \"quantity\",\n  \"name\" : \"name\",\n  \"eventDescription\" : \"eventDescription\",\n  \"description\" : \"description\",\n  \"eventType\" : \"eventType\",\n  \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"sponsorshipRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"selected\" : true,\n  \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"extension\" : { },\n  \"quantity\" : \"quantity\",\n  \"name\" : \"name\",\n  \"eventDescription\" : \"eventDescription\",\n  \"description\" : \"description\",\n  \"eventType\" : \"eventType\",\n  \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"sponsorshipRef\" : {\n    \"id\" : \"id\",\n    \"uri\" : \"uri\"\n  },\n  \"selected\" : true,\n  \"validTo\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Sponsor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Sponsor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyOwnership(@Parameter(in = ParameterIn.PATH, description = "The ID of the sharing group.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group&colon; <b>charge</b> or <b>discount</b>. <p>This query parameter is required." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the sharing group.", schema=@Schema()) @Valid @RequestBody SharingOwner body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> modifyPriority(@Parameter(in = ParameterIn.QUERY, description = "The type of sharing group, which is either <b>charge</b> or <b>discount</b>." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type,@Parameter(in = ParameterIn.DEFAULT, description = "The list of members in the sharing group. If a sharing member's ordered balance group is empty or null, a new ordered balance group will be created and members will be added. If present, the ordered balance group will be modified to add new members.", schema=@Schema()) @Valid @RequestBody List<SharingMember> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
