package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillItem;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An adjustment to a bill.
 */
@Schema(description = "An adjustment to a bill.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AdjustmentBill   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionAffectsRef")
  private ResourceRef actionAffectsRef = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("amountIsCredit")
  private Boolean amountIsCredit = true;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  @JsonProperty("includeTax")
  private Boolean includeTax = true;

  @JsonProperty("percent")
  private BigDecimal percent = null;

  @JsonProperty("billItem")
  @Valid
  private List<BillItem> billItem = null;

  public AdjustmentBill extension(Object extension) {
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

  public AdjustmentBill actionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
    return this;
  }

  /**
   * Get actionAffectsRef
   * @return actionAffectsRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getActionAffectsRef() {
    return actionAffectsRef;
  }

  public void setActionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
  }

  public AdjustmentBill effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the adjustment takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the adjustment takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public AdjustmentBill notes(Notes notes) {
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

  public AdjustmentBill amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the adjustment.
   * @return amount
   **/
  @Schema(required = true, description = "The amount of the adjustment.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public AdjustmentBill amountIsCredit(Boolean amountIsCredit) {
    this.amountIsCredit = amountIsCredit;
    return this;
  }

  /**
   * Whether the adjustment is a credit (<b>true</b>) or a debit (<b>false</b>). The default is <b>true</b>.
   * @return amountIsCredit
   **/
  @Schema(description = "Whether the adjustment is a credit (<b>true</b>) or a debit (<b>false</b>). The default is <b>true</b>.")
  
    public Boolean isAmountIsCredit() {
    return amountIsCredit;
  }

  public void setAmountIsCredit(Boolean amountIsCredit) {
    this.amountIsCredit = amountIsCredit;
  }

  public AdjustmentBill resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The ID of the resource to adjust.
   * @return resourceId
   **/
  @Schema(description = "The ID of the resource to adjust.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public AdjustmentBill includeTax(Boolean includeTax) {
    this.includeTax = includeTax;
    return this;
  }

  /**
   * Whether to include the tax in the adjustment (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.
   * @return includeTax
   **/
  @Schema(description = "Whether to include the tax in the adjustment (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.")
  
    public Boolean isIncludeTax() {
    return includeTax;
  }

  public void setIncludeTax(Boolean includeTax) {
    this.includeTax = includeTax;
  }

  public AdjustmentBill percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * The amount of the adjustment, as a percentage. For example, enter <b>5</b> for 5%.
   * @return percent
   **/
  @Schema(description = "The amount of the adjustment, as a percentage. For example, enter <b>5</b> for 5%.")
  
    @Valid
    public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public AdjustmentBill billItem(List<BillItem> billItem) {
    this.billItem = billItem;
    return this;
  }

  public AdjustmentBill addBillItemItem(BillItem billItemItem) {
    if (this.billItem == null) {
      this.billItem = new ArrayList<BillItem>();
    }
    this.billItem.add(billItemItem);
    return this;
  }

  /**
   * The list of bill items associated with the adjustment.
   * @return billItem
   **/
  @Schema(description = "The list of bill items associated with the adjustment.")
      @Valid
    public List<BillItem> getBillItem() {
    return billItem;
  }

  public void setBillItem(List<BillItem> billItem) {
    this.billItem = billItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustmentBill adjustmentBill = (AdjustmentBill) o;
    return Objects.equals(this.extension, adjustmentBill.extension) &&
        Objects.equals(this.actionAffectsRef, adjustmentBill.actionAffectsRef) &&
        Objects.equals(this.effective, adjustmentBill.effective) &&
        Objects.equals(this.notes, adjustmentBill.notes) &&
        Objects.equals(this.amount, adjustmentBill.amount) &&
        Objects.equals(this.amountIsCredit, adjustmentBill.amountIsCredit) &&
        Objects.equals(this.resourceId, adjustmentBill.resourceId) &&
        Objects.equals(this.includeTax, adjustmentBill.includeTax) &&
        Objects.equals(this.percent, adjustmentBill.percent) &&
        Objects.equals(this.billItem, adjustmentBill.billItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effective, notes, amount, amountIsCredit, resourceId, includeTax, percent, billItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentBill {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionAffectsRef: ").append(toIndentedString(actionAffectsRef)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountIsCredit: ").append(toIndentedString(amountIsCredit)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    includeTax: ").append(toIndentedString(includeTax)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    billItem: ").append(toIndentedString(billItem)).append("\n");
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
