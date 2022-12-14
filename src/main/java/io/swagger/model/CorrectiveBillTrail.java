package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.OriginalBill;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about a corrective bill.
 */
@Schema(description = "Details about a corrective bill.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CorrectiveBillTrail   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("invoiceFormat")
  private Integer invoiceFormat = null;

  @JsonProperty("invoiceType")
  private Integer invoiceType = null;

  @JsonProperty("adjusted")
  private BigDecimal adjusted = null;

  @JsonProperty("billNo")
  private String billNo = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("disputed")
  private BigDecimal disputed = null;

  @JsonProperty("currentTotal")
  private BigDecimal currentTotal = null;

  @JsonProperty("arActionsAmtExcludingPayments")
  private BigDecimal arActionsAmtExcludingPayments = null;

  @JsonProperty("due")
  private BigDecimal due = null;

  @JsonProperty("totalDue")
  private BigDecimal totalDue = null;

  @JsonProperty("subordsTotal")
  private BigDecimal subordsTotal = null;

  @JsonProperty("receivedForBill")
  private BigDecimal receivedForBill = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("originalBill")
  private OriginalBill originalBill = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public CorrectiveBillTrail extension(Object extension) {
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

  public CorrectiveBillTrail invoiceFormat(Integer invoiceFormat) {
    this.invoiceFormat = invoiceFormat;
    return this;
  }

  /**
   * The invoice format. Can be one of the following: <ul><li><b>1</b>: Detail</li><li><b>2</b>: Summary</li></ul>
   * @return invoiceFormat
   **/
  @Schema(description = "The invoice format. Can be one of the following: <ul><li><b>1</b>: Detail</li><li><b>2</b>: Summary</li></ul>")
  
    public Integer getInvoiceFormat() {
    return invoiceFormat;
  }

  public void setInvoiceFormat(Integer invoiceFormat) {
    this.invoiceFormat = invoiceFormat;
  }

  public CorrectiveBillTrail invoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

  /**
   * The invoice type. Can be one of the following: <ul><li><b>1</b>: Correction letter</li><li><b>2</b>: Replacement invoice</li></ul>
   * @return invoiceType
   **/
  @Schema(description = "The invoice type. Can be one of the following: <ul><li><b>1</b>: Correction letter</li><li><b>2</b>: Replacement invoice</li></ul>")
  
    public Integer getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
  }

  public CorrectiveBillTrail adjusted(BigDecimal adjusted) {
    this.adjusted = adjusted;
    return this;
  }

  /**
   * The amount of any adjustments.
   * @return adjusted
   **/
  @Schema(description = "The amount of any adjustments.")
  
    @Valid
    public BigDecimal getAdjusted() {
    return adjusted;
  }

  public void setAdjusted(BigDecimal adjusted) {
    this.adjusted = adjusted;
  }

  public CorrectiveBillTrail billNo(String billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * The bill number.
   * @return billNo
   **/
  @Schema(description = "The bill number.")
  
    public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  public CorrectiveBillTrail creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the corrective bill was created.
   * @return creationDate
   **/
  @Schema(required = true, description = "The date and time the corrective bill was created.")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public CorrectiveBillTrail disputed(BigDecimal disputed) {
    this.disputed = disputed;
    return this;
  }

  /**
   * The amount of any disputes.
   * @return disputed
   **/
  @Schema(description = "The amount of any disputes.")
  
    @Valid
    public BigDecimal getDisputed() {
    return disputed;
  }

  public void setDisputed(BigDecimal disputed) {
    this.disputed = disputed;
  }

  public CorrectiveBillTrail currentTotal(BigDecimal currentTotal) {
    this.currentTotal = currentTotal;
    return this;
  }

  /**
   * The current total amount due.
   * @return currentTotal
   **/
  @Schema(description = "The current total amount due.")
  
    @Valid
    public BigDecimal getCurrentTotal() {
    return currentTotal;
  }

  public void setCurrentTotal(BigDecimal currentTotal) {
    this.currentTotal = currentTotal;
  }

  public CorrectiveBillTrail arActionsAmtExcludingPayments(BigDecimal arActionsAmtExcludingPayments) {
    this.arActionsAmtExcludingPayments = arActionsAmtExcludingPayments;
    return this;
  }

  /**
   * The total amount of all accounts receivable actions, excluding any payments.
   * @return arActionsAmtExcludingPayments
   **/
  @Schema(description = "The total amount of all accounts receivable actions, excluding any payments.")
  
    @Valid
    public BigDecimal getArActionsAmtExcludingPayments() {
    return arActionsAmtExcludingPayments;
  }

  public void setArActionsAmtExcludingPayments(BigDecimal arActionsAmtExcludingPayments) {
    this.arActionsAmtExcludingPayments = arActionsAmtExcludingPayments;
  }

  public CorrectiveBillTrail due(BigDecimal due) {
    this.due = due;
    return this;
  }

  /**
   * The amount due for the corrective bill.
   * @return due
   **/
  @Schema(description = "The amount due for the corrective bill.")
  
    @Valid
    public BigDecimal getDue() {
    return due;
  }

  public void setDue(BigDecimal due) {
    this.due = due;
  }

  public CorrectiveBillTrail totalDue(BigDecimal totalDue) {
    this.totalDue = totalDue;
    return this;
  }

  /**
   * The total amount due for the parent account and all child accounts.
   * @return totalDue
   **/
  @Schema(description = "The total amount due for the parent account and all child accounts.")
  
    @Valid
    public BigDecimal getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(BigDecimal totalDue) {
    this.totalDue = totalDue;
  }

  public CorrectiveBillTrail subordsTotal(BigDecimal subordsTotal) {
    this.subordsTotal = subordsTotal;
    return this;
  }

  /**
   * The total amount due for all subordinate accounts.
   * @return subordsTotal
   **/
  @Schema(description = "The total amount due for all subordinate accounts.")
  
    @Valid
    public BigDecimal getSubordsTotal() {
    return subordsTotal;
  }

  public void setSubordsTotal(BigDecimal subordsTotal) {
    this.subordsTotal = subordsTotal;
  }

  public CorrectiveBillTrail receivedForBill(BigDecimal receivedForBill) {
    this.receivedForBill = receivedForBill;
    return this;
  }

  /**
   * The payment received against the original bill.
   * @return receivedForBill
   **/
  @Schema(description = "The payment received against the original bill.")
  
    @Valid
    public BigDecimal getReceivedForBill() {
    return receivedForBill;
  }

  public void setReceivedForBill(BigDecimal receivedForBill) {
    this.receivedForBill = receivedForBill;
  }

  public CorrectiveBillTrail dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The date and time the corrective bill is due.
   * @return dueDate
   **/
  @Schema(description = "The date and time the corrective bill is due.")
  
    @Valid
    public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public CorrectiveBillTrail originalBill(OriginalBill originalBill) {
    this.originalBill = originalBill;
    return this;
  }

  /**
   * Get originalBill
   * @return originalBill
   **/
  @Schema(description = "")
  
    @Valid
    public OriginalBill getOriginalBill() {
    return originalBill;
  }

  public void setOriginalBill(OriginalBill originalBill) {
    this.originalBill = originalBill;
  }

  public CorrectiveBillTrail notes(Notes notes) {
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
    CorrectiveBillTrail correctiveBillTrail = (CorrectiveBillTrail) o;
    return Objects.equals(this.extension, correctiveBillTrail.extension) &&
        Objects.equals(this.invoiceFormat, correctiveBillTrail.invoiceFormat) &&
        Objects.equals(this.invoiceType, correctiveBillTrail.invoiceType) &&
        Objects.equals(this.adjusted, correctiveBillTrail.adjusted) &&
        Objects.equals(this.billNo, correctiveBillTrail.billNo) &&
        Objects.equals(this.creationDate, correctiveBillTrail.creationDate) &&
        Objects.equals(this.disputed, correctiveBillTrail.disputed) &&
        Objects.equals(this.currentTotal, correctiveBillTrail.currentTotal) &&
        Objects.equals(this.arActionsAmtExcludingPayments, correctiveBillTrail.arActionsAmtExcludingPayments) &&
        Objects.equals(this.due, correctiveBillTrail.due) &&
        Objects.equals(this.totalDue, correctiveBillTrail.totalDue) &&
        Objects.equals(this.subordsTotal, correctiveBillTrail.subordsTotal) &&
        Objects.equals(this.receivedForBill, correctiveBillTrail.receivedForBill) &&
        Objects.equals(this.dueDate, correctiveBillTrail.dueDate) &&
        Objects.equals(this.originalBill, correctiveBillTrail.originalBill) &&
        Objects.equals(this.notes, correctiveBillTrail.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, invoiceFormat, invoiceType, adjusted, billNo, creationDate, disputed, currentTotal, arActionsAmtExcludingPayments, due, totalDue, subordsTotal, receivedForBill, dueDate, originalBill, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectiveBillTrail {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    invoiceFormat: ").append(toIndentedString(invoiceFormat)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    adjusted: ").append(toIndentedString(adjusted)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    disputed: ").append(toIndentedString(disputed)).append("\n");
    sb.append("    currentTotal: ").append(toIndentedString(currentTotal)).append("\n");
    sb.append("    arActionsAmtExcludingPayments: ").append(toIndentedString(arActionsAmtExcludingPayments)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
    sb.append("    subordsTotal: ").append(toIndentedString(subordsTotal)).append("\n");
    sb.append("    receivedForBill: ").append(toIndentedString(receivedForBill)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    originalBill: ").append(toIndentedString(originalBill)).append("\n");
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
