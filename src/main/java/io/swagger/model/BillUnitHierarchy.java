package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bill unit hierarchy.
 */
@Schema(description = "A bill unit hierarchy.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillUnitHierarchy   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("parentBillUnitId")
  private String parentBillUnitId = null;

  @JsonProperty("billUnitId")
  private String billUnitId = null;

  @JsonProperty("arBillUnitRef")
  private ResourceRef arBillUnitRef = null;

  @JsonProperty("paymentInstrumentRef")
  private ResourceRef paymentInstrumentRef = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("billCurrentDue")
  private Boolean billCurrentDue = null;

  public BillUnitHierarchy extension(Object extension) {
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

  public BillUnitHierarchy parentBillUnitId(String parentBillUnitId) {
    this.parentBillUnitId = parentBillUnitId;
    return this;
  }

  /**
   * The ID of parent bill unit.
   * @return parentBillUnitId
   **/
  @Schema(description = "The ID of parent bill unit.")
  
    public String getParentBillUnitId() {
    return parentBillUnitId;
  }

  public void setParentBillUnitId(String parentBillUnitId) {
    this.parentBillUnitId = parentBillUnitId;
  }

  public BillUnitHierarchy billUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
    return this;
  }

  /**
   * The ID of this bill unit.
   * @return billUnitId
   **/
  @Schema(description = "The ID of this bill unit.")
  
    public String getBillUnitId() {
    return billUnitId;
  }

  public void setBillUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
  }

  public BillUnitHierarchy arBillUnitRef(ResourceRef arBillUnitRef) {
    this.arBillUnitRef = arBillUnitRef;
    return this;
  }

  /**
   * Get arBillUnitRef
   * @return arBillUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getArBillUnitRef() {
    return arBillUnitRef;
  }

  public void setArBillUnitRef(ResourceRef arBillUnitRef) {
    this.arBillUnitRef = arBillUnitRef;
  }

  public BillUnitHierarchy paymentInstrumentRef(ResourceRef paymentInstrumentRef) {
    this.paymentInstrumentRef = paymentInstrumentRef;
    return this;
  }

  /**
   * Get paymentInstrumentRef
   * @return paymentInstrumentRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentInstrumentRef() {
    return paymentInstrumentRef;
  }

  public void setPaymentInstrumentRef(ResourceRef paymentInstrumentRef) {
    this.paymentInstrumentRef = paymentInstrumentRef;
  }

  public BillUnitHierarchy notes(Notes notes) {
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

  public BillUnitHierarchy billCurrentDue(Boolean billCurrentDue) {
    this.billCurrentDue = billCurrentDue;
    return this;
  }

  /**
   * The current amount due.
   * @return billCurrentDue
   **/
  @Schema(description = "The current amount due.")
  
    public Boolean isBillCurrentDue() {
    return billCurrentDue;
  }

  public void setBillCurrentDue(Boolean billCurrentDue) {
    this.billCurrentDue = billCurrentDue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillUnitHierarchy billUnitHierarchy = (BillUnitHierarchy) o;
    return Objects.equals(this.extension, billUnitHierarchy.extension) &&
        Objects.equals(this.parentBillUnitId, billUnitHierarchy.parentBillUnitId) &&
        Objects.equals(this.billUnitId, billUnitHierarchy.billUnitId) &&
        Objects.equals(this.arBillUnitRef, billUnitHierarchy.arBillUnitRef) &&
        Objects.equals(this.paymentInstrumentRef, billUnitHierarchy.paymentInstrumentRef) &&
        Objects.equals(this.notes, billUnitHierarchy.notes) &&
        Objects.equals(this.billCurrentDue, billUnitHierarchy.billCurrentDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, parentBillUnitId, billUnitId, arBillUnitRef, paymentInstrumentRef, notes, billCurrentDue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillUnitHierarchy {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    parentBillUnitId: ").append(toIndentedString(parentBillUnitId)).append("\n");
    sb.append("    billUnitId: ").append(toIndentedString(billUnitId)).append("\n");
    sb.append("    arBillUnitRef: ").append(toIndentedString(arBillUnitRef)).append("\n");
    sb.append("    paymentInstrumentRef: ").append(toIndentedString(paymentInstrumentRef)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    billCurrentDue: ").append(toIndentedString(billCurrentDue)).append("\n");
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
