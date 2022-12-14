package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.WalletPaymentInstrument;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of payment methods in a wallet.
 */
@Schema(description = "A list of payment methods in a wallet.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Wallet   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("paymentInstrument")
  @Valid
  private List<WalletPaymentInstrument> paymentInstrument = null;

  public Wallet extension(Object extension) {
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

  public Wallet paymentInstrument(List<WalletPaymentInstrument> paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
    return this;
  }

  public Wallet addPaymentInstrumentItem(WalletPaymentInstrument paymentInstrumentItem) {
    if (this.paymentInstrument == null) {
      this.paymentInstrument = new ArrayList<WalletPaymentInstrument>();
    }
    this.paymentInstrument.add(paymentInstrumentItem);
    return this;
  }

  /**
   * Get paymentInstrument
   * @return paymentInstrument
   **/
  @Schema(description = "")
      @Valid
    public List<WalletPaymentInstrument> getPaymentInstrument() {
    return paymentInstrument;
  }

  public void setPaymentInstrument(List<WalletPaymentInstrument> paymentInstrument) {
    this.paymentInstrument = paymentInstrument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wallet wallet = (Wallet) o;
    return Objects.equals(this.extension, wallet.extension) &&
        Objects.equals(this.paymentInstrument, wallet.paymentInstrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, paymentInstrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wallet {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    paymentInstrument: ").append(toIndentedString(paymentInstrument)).append("\n");
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
