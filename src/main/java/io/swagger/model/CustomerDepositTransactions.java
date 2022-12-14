package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerDepositTransactions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomerDepositTransactions   {
  @JsonProperty("transactionRef")
  private String transactionRef = null;

  public CustomerDepositTransactions transactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
    return this;
  }

  /**
   * Reference to the transaction record.
   * @return transactionRef
   **/
  @Schema(description = "Reference to the transaction record.")
  
    public String getTransactionRef() {
    return transactionRef;
  }

  public void setTransactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDepositTransactions customerDepositTransactions = (CustomerDepositTransactions) o;
    return Objects.equals(this.transactionRef, customerDepositTransactions.transactionRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDepositTransactions {\n");
    
    sb.append("    transactionRef: ").append(toIndentedString(transactionRef)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
