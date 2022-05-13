package io.swagger.api;

import io.swagger.model.AccountDTO;
import io.swagger.model.DepositDTO;
import io.swagger.model.NewAccountDTO;
import io.swagger.model.TransactionDTO;
import io.swagger.model.WithdrawDTO;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-13T12:24:48.718Z[GMT]")
@RestController
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AccountDTO> createAccount(@Parameter(in = ParameterIn.DEFAULT, description = "New account details", schema=@Schema()) @Valid @RequestBody NewAccountDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountDTO>(objectMapper.readValue("{\n  \"OwnerName\" : \"Erwin\",\n  \"Iban\" : \"NL01INHO0000000001\",\n  \"Balance\" : 23.45\n}", AccountDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TransactionDTO> deposit(@Size(min=18,max=18) @Parameter(in = ParameterIn.PATH, description = "The Iban for the account to get", required=true, schema=@Schema()) @PathVariable("Iban") String iban,@Parameter(in = ParameterIn.DEFAULT, description = "Deposit details", schema=@Schema()) @Valid @RequestBody DepositDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TransactionDTO>(objectMapper.readValue("{\n  \"Amount\" : 11.23,\n  \"Id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"From\" : \"NL01INHO0000000001\",\n  \"To\" : \"NL01INHO0000000002\"\n}", TransactionDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TransactionDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TransactionDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountDTO> getAccount(@Size(min=18,max=18) @Parameter(in = ParameterIn.PATH, description = "The Iban for the account to get", required=true, schema=@Schema()) @PathVariable("Iban") String iban) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountDTO>(objectMapper.readValue("{\n  \"OwnerName\" : \"Erwin\",\n  \"Iban\" : \"NL01INHO0000000001\",\n  \"Balance\" : 23.45\n}", AccountDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AccountDTO>> getAccounts(@Parameter(in = ParameterIn.QUERY, description = "search for this substring" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "number of records to skip for pagination" ,schema=@Schema(allowableValues={  }
)) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(50) @Parameter(in = ParameterIn.QUERY, description = "maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="50"
)) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<AccountDTO>>(objectMapper.readValue("[ {\n  \"OwnerName\" : \"Erwin\",\n  \"Iban\" : \"NL01INHO0000000001\",\n  \"Balance\" : 23.45\n}, {\n  \"OwnerName\" : \"Erwin\",\n  \"Iban\" : \"NL01INHO0000000001\",\n  \"Balance\" : 23.45\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AccountDTO>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AccountDTO>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TransactionDTO> withdraw(@Size(min=18,max=18) @Parameter(in = ParameterIn.PATH, description = "The Iban for the account to get", required=true, schema=@Schema()) @PathVariable("Iban") String iban,@Parameter(in = ParameterIn.DEFAULT, description = "Withdraw details", schema=@Schema()) @Valid @RequestBody WithdrawDTO body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TransactionDTO>(objectMapper.readValue("{\n  \"Amount\" : 11.23,\n  \"Id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"From\" : \"NL01INHO0000000001\",\n  \"To\" : \"NL01INHO0000000002\"\n}", TransactionDTO.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TransactionDTO>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TransactionDTO>(HttpStatus.NOT_IMPLEMENTED);
    }

}
