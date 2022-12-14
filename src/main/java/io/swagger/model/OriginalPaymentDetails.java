package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about an original payment.
 */
@Schema(description = "Details about an original payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class OriginalPaymentDetails   {
  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("paymentItemNumber")
  private String paymentItemNumber = null;

  public OriginalPaymentDetails paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The payment ID.
   * @return paymentId
   **/
  @Schema(description = "The payment ID.")
  
    public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public OriginalPaymentDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account ID.
   * @return accountId
   **/
  @Schema(description = "The account ID.")
  
    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OriginalPaymentDetails paymentItemNumber(String paymentItemNumber) {
    this.paymentItemNumber = paymentItemNumber;
    return this;
  }

  /**
   * The payment item number.
   * @return paymentItemNumber
   **/
  @Schema(description = "The payment item number.")
  
    public String getPaymentItemNumber() {
    return paymentItemNumber;
  }

  public void setPaymentItemNumber(String paymentItemNumber) {
    this.paymentItemNumber = paymentItemNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginalPaymentDetails originalPaymentDetails = (OriginalPaymentDetails) o;
    return Objects.equals(this.paymentId, originalPaymentDetails.paymentId) &&
        Objects.equals(this.accountId, originalPaymentDetails.accountId) &&
        Objects.equals(this.paymentItemNumber, originalPaymentDetails.paymentItemNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, accountId, paymentItemNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalPaymentDetails {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    paymentItemNumber: ").append(toIndentedString(paymentItemNumber)).append("\n");
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
