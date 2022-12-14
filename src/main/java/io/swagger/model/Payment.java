package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.PaymentTypeBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A payment.
 */
@Schema(description = "A payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Payment   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("payinfoTypeObject")
  private PaymentTypeBase payinfoTypeObject = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("selectedBillUnit")
  private String selectedBillUnit = null;

  @JsonProperty("itemPaymentRef")
  private String itemPaymentRef = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public Payment extension(Object extension) {
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

  public Payment payinfoTypeObject(PaymentTypeBase payinfoTypeObject) {
    this.payinfoTypeObject = payinfoTypeObject;
    return this;
  }

  /**
   * Get payinfoTypeObject
   * @return payinfoTypeObject
   **/
  @Schema(description = "")
  
    @Valid
    public PaymentTypeBase getPayinfoTypeObject() {
    return payinfoTypeObject;
  }

  public void setPayinfoTypeObject(PaymentTypeBase payinfoTypeObject) {
    this.payinfoTypeObject = payinfoTypeObject;
  }

  public Payment currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The payment's currency.
   * @return currency
   **/
  @Schema(description = "The payment's currency.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public Payment selectedBillUnit(String selectedBillUnit) {
    this.selectedBillUnit = selectedBillUnit;
    return this;
  }

  /**
   * The bill unit associated with the payment.
   * @return selectedBillUnit
   **/
  @Schema(description = "The bill unit associated with the payment.")
  
    public String getSelectedBillUnit() {
    return selectedBillUnit;
  }

  public void setSelectedBillUnit(String selectedBillUnit) {
    this.selectedBillUnit = selectedBillUnit;
  }

  public Payment itemPaymentRef(String itemPaymentRef) {
    this.itemPaymentRef = itemPaymentRef;
    return this;
  }

  /**
   * The item associated with the payment.
   * @return itemPaymentRef
   **/
  @Schema(description = "The item associated with the payment.")
  
    public String getItemPaymentRef() {
    return itemPaymentRef;
  }

  public void setItemPaymentRef(String itemPaymentRef) {
    this.itemPaymentRef = itemPaymentRef;
  }

  public Payment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The payment amount.
   * @return amount
   **/
  @Schema(required = true, description = "The payment amount.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Payment notes(Notes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    @Valid
    public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.extension, payment.extension) &&
        Objects.equals(this.payinfoTypeObject, payment.payinfoTypeObject) &&
        Objects.equals(this.currency, payment.currency) &&
        Objects.equals(this.selectedBillUnit, payment.selectedBillUnit) &&
        Objects.equals(this.itemPaymentRef, payment.itemPaymentRef) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.notes, payment.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, payinfoTypeObject, currency, selectedBillUnit, itemPaymentRef, amount, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    payinfoTypeObject: ").append(toIndentedString(payinfoTypeObject)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    selectedBillUnit: ").append(toIndentedString(selectedBillUnit)).append("\n");
    sb.append("    itemPaymentRef: ").append(toIndentedString(itemPaymentRef)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
