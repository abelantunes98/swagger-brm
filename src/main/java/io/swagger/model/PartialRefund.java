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
 * A partial refund.
 */
@Schema(description = "A partial refund.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PartialRefund   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("payinfoTypeObject")
  private PaymentTypeBase payinfoTypeObject = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  public PartialRefund extension(Object extension) {
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

  public PartialRefund payinfoTypeObject(PaymentTypeBase payinfoTypeObject) {
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

  public PartialRefund notes(Notes notes) {
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

  public PartialRefund amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount that was refunded.
   * @return amount
   **/
  @Schema(required = true, description = "The amount that was refunded.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialRefund partialRefund = (PartialRefund) o;
    return Objects.equals(this.extension, partialRefund.extension) &&
        Objects.equals(this.payinfoTypeObject, partialRefund.payinfoTypeObject) &&
        Objects.equals(this.notes, partialRefund.notes) &&
        Objects.equals(this.amount, partialRefund.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, payinfoTypeObject, notes, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialRefund {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    payinfoTypeObject: ").append(toIndentedString(payinfoTypeObject)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
