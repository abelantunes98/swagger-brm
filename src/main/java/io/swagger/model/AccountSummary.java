package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AccountSummary   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("pendingDue")
  private BigDecimal pendingDue = null;

  @JsonProperty("pendingDueDate")
  private OffsetDateTime pendingDueDate = null;

  @JsonProperty("unallocatedPayments")
  private BigDecimal unallocatedPayments = null;

  @JsonProperty("unallocatedAdjustments")
  private BigDecimal unallocatedAdjustments = null;

  @JsonProperty("billInProgressDue")
  private BigDecimal billInProgressDue = null;

  @JsonProperty("dueNow")
  private BigDecimal dueNow = null;

  @JsonProperty("numBills")
  private Integer numBills = null;

  @JsonProperty("disputed")
  private BigDecimal disputed = null;

  @JsonProperty("paymentTypeId")
  private String paymentTypeId = null;

  public AccountSummary extension(Object extension) {
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

  public AccountSummary pendingDue(BigDecimal pendingDue) {
    this.pendingDue = pendingDue;
    return this;
  }

  /**
   * The amount for the bill unit that is in pending state.
   * @return pendingDue
   **/
  @Schema(required = true, description = "The amount for the bill unit that is in pending state.")
      @NotNull

    @Valid
    public BigDecimal getPendingDue() {
    return pendingDue;
  }

  public void setPendingDue(BigDecimal pendingDue) {
    this.pendingDue = pendingDue;
  }

  public AccountSummary pendingDueDate(OffsetDateTime pendingDueDate) {
    this.pendingDueDate = pendingDueDate;
    return this;
  }

  /**
   * The date and time the pending amount is due.
   * @return pendingDueDate
   **/
  @Schema(required = true, description = "The date and time the pending amount is due.")
      @NotNull

    @Valid
    public OffsetDateTime getPendingDueDate() {
    return pendingDueDate;
  }

  public void setPendingDueDate(OffsetDateTime pendingDueDate) {
    this.pendingDueDate = pendingDueDate;
  }

  public AccountSummary unallocatedPayments(BigDecimal unallocatedPayments) {
    this.unallocatedPayments = unallocatedPayments;
    return this;
  }

  /**
   * The payment amount that is still unallocated.
   * @return unallocatedPayments
   **/
  @Schema(required = true, description = "The payment amount that is still unallocated.")
      @NotNull

    @Valid
    public BigDecimal getUnallocatedPayments() {
    return unallocatedPayments;
  }

  public void setUnallocatedPayments(BigDecimal unallocatedPayments) {
    this.unallocatedPayments = unallocatedPayments;
  }

  public AccountSummary unallocatedAdjustments(BigDecimal unallocatedAdjustments) {
    this.unallocatedAdjustments = unallocatedAdjustments;
    return this;
  }

  /**
   * The adjustment amount that is still unallocated.
   * @return unallocatedAdjustments
   **/
  @Schema(required = true, description = "The adjustment amount that is still unallocated.")
      @NotNull

    @Valid
    public BigDecimal getUnallocatedAdjustments() {
    return unallocatedAdjustments;
  }

  public void setUnallocatedAdjustments(BigDecimal unallocatedAdjustments) {
    this.unallocatedAdjustments = unallocatedAdjustments;
  }

  public AccountSummary billInProgressDue(BigDecimal billInProgressDue) {
    this.billInProgressDue = billInProgressDue;
    return this;
  }

  /**
   * The in progress amount due for the bill unit.
   * @return billInProgressDue
   **/
  @Schema(required = true, description = "The in progress amount due for the bill unit.")
      @NotNull

    @Valid
    public BigDecimal getBillInProgressDue() {
    return billInProgressDue;
  }

  public void setBillInProgressDue(BigDecimal billInProgressDue) {
    this.billInProgressDue = billInProgressDue;
  }

  public AccountSummary dueNow(BigDecimal dueNow) {
    this.dueNow = dueNow;
    return this;
  }

  /**
   * The amount that is due now.
   * @return dueNow
   **/
  @Schema(required = true, description = "The amount that is due now.")
      @NotNull

    @Valid
    public BigDecimal getDueNow() {
    return dueNow;
  }

  public void setDueNow(BigDecimal dueNow) {
    this.dueNow = dueNow;
  }

  public AccountSummary numBills(Integer numBills) {
    this.numBills = numBills;
    return this;
  }

  /**
   * The number of bills associated with the bill unit.
   * @return numBills
   **/
  @Schema(required = true, description = "The number of bills associated with the bill unit.")
      @NotNull

    public Integer getNumBills() {
    return numBills;
  }

  public void setNumBills(Integer numBills) {
    this.numBills = numBills;
  }

  public AccountSummary disputed(BigDecimal disputed) {
    this.disputed = disputed;
    return this;
  }

  /**
   * The amount for the bill unit that is in dispute.
   * @return disputed
   **/
  @Schema(required = true, description = "The amount for the bill unit that is in dispute.")
      @NotNull

    @Valid
    public BigDecimal getDisputed() {
    return disputed;
  }

  public void setDisputed(BigDecimal disputed) {
    this.disputed = disputed;
  }

  public AccountSummary paymentTypeId(String paymentTypeId) {
    this.paymentTypeId = paymentTypeId;
    return this;
  }

  /**
   * The ID for the bill unit's payment type.
   * @return paymentTypeId
   **/
  @Schema(required = true, description = "The ID for the bill unit's payment type.")
      @NotNull

    public String getPaymentTypeId() {
    return paymentTypeId;
  }

  public void setPaymentTypeId(String paymentTypeId) {
    this.paymentTypeId = paymentTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSummary accountSummary = (AccountSummary) o;
    return Objects.equals(this.extension, accountSummary.extension) &&
        Objects.equals(this.pendingDue, accountSummary.pendingDue) &&
        Objects.equals(this.pendingDueDate, accountSummary.pendingDueDate) &&
        Objects.equals(this.unallocatedPayments, accountSummary.unallocatedPayments) &&
        Objects.equals(this.unallocatedAdjustments, accountSummary.unallocatedAdjustments) &&
        Objects.equals(this.billInProgressDue, accountSummary.billInProgressDue) &&
        Objects.equals(this.dueNow, accountSummary.dueNow) &&
        Objects.equals(this.numBills, accountSummary.numBills) &&
        Objects.equals(this.disputed, accountSummary.disputed) &&
        Objects.equals(this.paymentTypeId, accountSummary.paymentTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, pendingDue, pendingDueDate, unallocatedPayments, unallocatedAdjustments, billInProgressDue, dueNow, numBills, disputed, paymentTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSummary {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    pendingDue: ").append(toIndentedString(pendingDue)).append("\n");
    sb.append("    pendingDueDate: ").append(toIndentedString(pendingDueDate)).append("\n");
    sb.append("    unallocatedPayments: ").append(toIndentedString(unallocatedPayments)).append("\n");
    sb.append("    unallocatedAdjustments: ").append(toIndentedString(unallocatedAdjustments)).append("\n");
    sb.append("    billInProgressDue: ").append(toIndentedString(billInProgressDue)).append("\n");
    sb.append("    dueNow: ").append(toIndentedString(dueNow)).append("\n");
    sb.append("    numBills: ").append(toIndentedString(numBills)).append("\n");
    sb.append("    disputed: ").append(toIndentedString(disputed)).append("\n");
    sb.append("    paymentTypeId: ").append(toIndentedString(paymentTypeId)).append("\n");
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
