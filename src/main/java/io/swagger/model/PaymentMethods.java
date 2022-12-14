package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Wallet;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of payment methods.
 */
@Schema(description = "A list of payment methods.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PaymentMethods   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("paymentMethods")
  private Wallet paymentMethods = null;

  public PaymentMethods extension(Object extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extended attributes.
   * @return extension
   **/
  @Schema(description = "The extended attributes.")
  
    public Object getExtension() {
    return extension;
  }

  public void setExtension(Object extension) {
    this.extension = extension;
  }

  public PaymentMethods paymentMethods(Wallet paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  /**
   * Get paymentMethods
   * @return paymentMethods
   **/
  @Schema(description = "")
  
    @Valid
    public Wallet getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(Wallet paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethods paymentMethods = (PaymentMethods) o;
    return Objects.equals(this.extension, paymentMethods.extension) &&
        Objects.equals(this.paymentMethods, paymentMethods.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethods {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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
