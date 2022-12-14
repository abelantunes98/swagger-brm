package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PaymentInstrumentType;
import io.swagger.model.WalletName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * WalletPaymentInstrument
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class WalletPaymentInstrument   {
  @JsonProperty("name")
  private WalletName name = null;

  @JsonProperty("value")
  private PaymentInstrumentType value = null;

  @JsonProperty("nil")
  private Boolean nil = null;

  @JsonProperty("globalScope")
  private Boolean globalScope = null;

  @JsonProperty("typeSubstituted")
  private Boolean typeSubstituted = null;

  public WalletPaymentInstrument name(WalletName name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    @Valid
    public WalletName getName() {
    return name;
  }

  public void setName(WalletName name) {
    this.name = name;
  }

  public WalletPaymentInstrument value(PaymentInstrumentType value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    @Valid
    public PaymentInstrumentType getValue() {
    return value;
  }

  public void setValue(PaymentInstrumentType value) {
    this.value = value;
  }

  public WalletPaymentInstrument nil(Boolean nil) {
    this.nil = nil;
    return this;
  }

  /**
   * Get nil
   * @return nil
   **/
  @Schema(description = "")
  
    public Boolean isNil() {
    return nil;
  }

  public void setNil(Boolean nil) {
    this.nil = nil;
  }

  public WalletPaymentInstrument globalScope(Boolean globalScope) {
    this.globalScope = globalScope;
    return this;
  }

  /**
   * Get globalScope
   * @return globalScope
   **/
  @Schema(description = "")
  
    public Boolean isGlobalScope() {
    return globalScope;
  }

  public void setGlobalScope(Boolean globalScope) {
    this.globalScope = globalScope;
  }

  public WalletPaymentInstrument typeSubstituted(Boolean typeSubstituted) {
    this.typeSubstituted = typeSubstituted;
    return this;
  }

  /**
   * Get typeSubstituted
   * @return typeSubstituted
   **/
  @Schema(description = "")
  
    public Boolean isTypeSubstituted() {
    return typeSubstituted;
  }

  public void setTypeSubstituted(Boolean typeSubstituted) {
    this.typeSubstituted = typeSubstituted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletPaymentInstrument walletPaymentInstrument = (WalletPaymentInstrument) o;
    return Objects.equals(this.name, walletPaymentInstrument.name) &&
        Objects.equals(this.value, walletPaymentInstrument.value) &&
        Objects.equals(this.nil, walletPaymentInstrument.nil) &&
        Objects.equals(this.globalScope, walletPaymentInstrument.globalScope) &&
        Objects.equals(this.typeSubstituted, walletPaymentInstrument.typeSubstituted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, nil, globalScope, typeSubstituted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletPaymentInstrument {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    nil: ").append(toIndentedString(nil)).append("\n");
    sb.append("    globalScope: ").append(toIndentedString(globalScope)).append("\n");
    sb.append("    typeSubstituted: ").append(toIndentedString(typeSubstituted)).append("\n");
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
