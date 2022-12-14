package io.swagger.api;

import io.swagger.model.Bill;
import io.swagger.model.BillItem;
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
public class AllocationsApiController implements AllocationsApi {

    private static final Logger log = LoggerFactory.getLogger(AllocationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AllocationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> billLevelAdjustmentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the adjustment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The list of bills to allocate the adjustment to. The minimum required parameters are&colon;<ul><li><b>accountRef</b><ul><li><b>id</b></li></ul></li><li><b>billPaidDate</b></li><li><b>creationDate</b></li><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<Bill> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> billLevelPaymentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The list of bills containing an allocated amount, the account ID, and the bill unit ID. The minimum required parameter are&colon;<ul><li><b>amount</b></li><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<Bill> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> itemLevelAdjustmentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the adjustment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Details about the allocation. The minimum required parameters are&colon;<ul><li><b>amount</b></li><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<BillItem> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> itemLevelPaymentAllocation(@Parameter(in = ParameterIn.PATH, description = "The ID of the payment to allocate.", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "A list of bill items containing an allocated amount, the account ID, and the bill item ID. The minimum required parameters are&colon;<ul><li><b>amount</b><li><b>id</b></li></ul>", schema=@Schema()) @Valid @RequestBody List<BillItem> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
