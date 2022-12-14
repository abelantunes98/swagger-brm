package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillDetails;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about an adjustment.
 */
@Schema(description = "Details about an adjustment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AdjustmentDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("adjustmentId")
  private String adjustmentId = null;

  @JsonProperty("originalAdjustmentAmount")
  private BigDecimal originalAdjustmentAmount = null;

  @JsonProperty("allocatedAmount")
  private BigDecimal allocatedAmount = null;

  @JsonProperty("unallocatedAmount")
  private BigDecimal unallocatedAmount = null;

  @JsonProperty("taxAmount")
  private BigDecimal taxAmount = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("billDetails")
  @Valid
  private List<BillDetails> billDetails = null;

  public AdjustmentDetails extension(Object extension) {
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

  public AdjustmentDetails effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the adjustment takes effect.
   * @return effectiveDate
   **/
  @Schema(required = true, description = "The date and time the adjustment takes effect.")
      @NotNull

    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public AdjustmentDetails adjustmentId(String adjustmentId) {
    this.adjustmentId = adjustmentId;
    return this;
  }

  /**
   * The adjustment's ID.
   * @return adjustmentId
   **/
  @Schema(description = "The adjustment's ID.")
  
    public String getAdjustmentId() {
    return adjustmentId;
  }

  public void setAdjustmentId(String adjustmentId) {
    this.adjustmentId = adjustmentId;
  }

  public AdjustmentDetails originalAdjustmentAmount(BigDecimal originalAdjustmentAmount) {
    this.originalAdjustmentAmount = originalAdjustmentAmount;
    return this;
  }

  /**
   * The original amount before the adjustment.
   * @return originalAdjustmentAmount
   **/
  @Schema(description = "The original amount before the adjustment.")
  
    @Valid
    public BigDecimal getOriginalAdjustmentAmount() {
    return originalAdjustmentAmount;
  }

  public void setOriginalAdjustmentAmount(BigDecimal originalAdjustmentAmount) {
    this.originalAdjustmentAmount = originalAdjustmentAmount;
  }

  public AdjustmentDetails allocatedAmount(BigDecimal allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
    return this;
  }

  /**
   * The amount of the adjustment that has been allocated.
   * @return allocatedAmount
   **/
  @Schema(description = "The amount of the adjustment that has been allocated.")
  
    @Valid
    public BigDecimal getAllocatedAmount() {
    return allocatedAmount;
  }

  public void setAllocatedAmount(BigDecimal allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
  }

  public AdjustmentDetails unallocatedAmount(BigDecimal unallocatedAmount) {
    this.unallocatedAmount = unallocatedAmount;
    return this;
  }

  /**
   * The amount of the adjustment that has not been allocated.
   * @return unallocatedAmount
   **/
  @Schema(description = "The amount of the adjustment that has not been allocated.")
  
    @Valid
    public BigDecimal getUnallocatedAmount() {
    return unallocatedAmount;
  }

  public void setUnallocatedAmount(BigDecimal unallocatedAmount) {
    this.unallocatedAmount = unallocatedAmount;
  }

  public AdjustmentDetails taxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * The amount of tax associated with the adjustment.
   * @return taxAmount
   **/
  @Schema(description = "The amount of tax associated with the adjustment.")
  
    @Valid
    public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public AdjustmentDetails notes(Notes notes) {
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

  public AdjustmentDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The ID of the account associated with the adjustment.
   * @return accountId
   **/
  @Schema(required = true, description = "The ID of the account associated with the adjustment.")
      @NotNull

    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AdjustmentDetails billDetails(List<BillDetails> billDetails) {
    this.billDetails = billDetails;
    return this;
  }

  public AdjustmentDetails addBillDetailsItem(BillDetails billDetailsItem) {
    if (this.billDetails == null) {
      this.billDetails = new ArrayList<BillDetails>();
    }
    this.billDetails.add(billDetailsItem);
    return this;
  }

  /**
   * The list of bills associated with the adjustment.
   * @return billDetails
   **/
  @Schema(description = "The list of bills associated with the adjustment.")
      @Valid
    public List<BillDetails> getBillDetails() {
    return billDetails;
  }

  public void setBillDetails(List<BillDetails> billDetails) {
    this.billDetails = billDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustmentDetails adjustmentDetails = (AdjustmentDetails) o;
    return Objects.equals(this.extension, adjustmentDetails.extension) &&
        Objects.equals(this.effectiveDate, adjustmentDetails.effectiveDate) &&
        Objects.equals(this.adjustmentId, adjustmentDetails.adjustmentId) &&
        Objects.equals(this.originalAdjustmentAmount, adjustmentDetails.originalAdjustmentAmount) &&
        Objects.equals(this.allocatedAmount, adjustmentDetails.allocatedAmount) &&
        Objects.equals(this.unallocatedAmount, adjustmentDetails.unallocatedAmount) &&
        Objects.equals(this.taxAmount, adjustmentDetails.taxAmount) &&
        Objects.equals(this.notes, adjustmentDetails.notes) &&
        Objects.equals(this.accountId, adjustmentDetails.accountId) &&
        Objects.equals(this.billDetails, adjustmentDetails.billDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, effectiveDate, adjustmentId, originalAdjustmentAmount, allocatedAmount, unallocatedAmount, taxAmount, notes, accountId, billDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    adjustmentId: ").append(toIndentedString(adjustmentId)).append("\n");
    sb.append("    originalAdjustmentAmount: ").append(toIndentedString(originalAdjustmentAmount)).append("\n");
    sb.append("    allocatedAmount: ").append(toIndentedString(allocatedAmount)).append("\n");
    sb.append("    unallocatedAmount: ").append(toIndentedString(unallocatedAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    billDetails: ").append(toIndentedString(billDetails)).append("\n");
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
