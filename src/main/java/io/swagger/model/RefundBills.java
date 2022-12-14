package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.PaymentTypeBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundBills
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class RefundBills   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("payinfoTypeObject")
  private PaymentTypeBase payinfoTypeObject = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("bills")
  @Valid
  private List<String> bills = new ArrayList<String>();

  public RefundBills extension(Object extension) {
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

  public RefundBills payinfoTypeObject(PaymentTypeBase payinfoTypeObject) {
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

  public RefundBills notes(Notes notes) {
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

  public RefundBills bills(List<String> bills) {
    this.bills = bills;
    return this;
  }

  public RefundBills addBillsItem(String billsItem) {
    this.bills.add(billsItem);
    return this;
  }

  /**
   * The list of bills impacted by the refund.
   * @return bills
   **/
  @Schema(required = true, description = "The list of bills impacted by the refund.")
      @NotNull

    public List<String> getBills() {
    return bills;
  }

  public void setBills(List<String> bills) {
    this.bills = bills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundBills refundBills = (RefundBills) o;
    return Objects.equals(this.extension, refundBills.extension) &&
        Objects.equals(this.payinfoTypeObject, refundBills.payinfoTypeObject) &&
        Objects.equals(this.notes, refundBills.notes) &&
        Objects.equals(this.bills, refundBills.bills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, payinfoTypeObject, notes, bills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundBills {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    payinfoTypeObject: ").append(toIndentedString(payinfoTypeObject)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    bills: ").append(toIndentedString(bills)).append("\n");
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
