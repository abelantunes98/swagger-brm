package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DisputeBill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DisputeBill   {
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

  public DisputeBill extension(Object extension) {
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

  public DisputeBill actionAffectsRef(ResourceRef actionAffectsRef) {
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

  public DisputeBill effective(OffsetDateTime effective) {
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

  public DisputeBill notes(Notes notes) {
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

  public DisputeBill amount(BigDecimal amount) {
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

  public DisputeBill amountIsCredit(Boolean amountIsCredit) {
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

  public DisputeBill resourceId(Integer resourceId) {
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

  public DisputeBill includeTax(Boolean includeTax) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeBill disputeBill = (DisputeBill) o;
    return Objects.equals(this.extension, disputeBill.extension) &&
        Objects.equals(this.actionAffectsRef, disputeBill.actionAffectsRef) &&
        Objects.equals(this.effective, disputeBill.effective) &&
        Objects.equals(this.notes, disputeBill.notes) &&
        Objects.equals(this.amount, disputeBill.amount) &&
        Objects.equals(this.amountIsCredit, disputeBill.amountIsCredit) &&
        Objects.equals(this.resourceId, disputeBill.resourceId) &&
        Objects.equals(this.includeTax, disputeBill.includeTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effective, notes, amount, amountIsCredit, resourceId, includeTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeBill {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionAffectsRef: ").append(toIndentedString(actionAffectsRef)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountIsCredit: ").append(toIndentedString(amountIsCredit)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    includeTax: ").append(toIndentedString(includeTax)).append("\n");
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
