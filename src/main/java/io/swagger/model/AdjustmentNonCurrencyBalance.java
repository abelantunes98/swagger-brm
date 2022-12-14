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
 * AdjustmentNonCurrencyBalance
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AdjustmentNonCurrencyBalance   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionAffectsRef")
  private ResourceRef actionAffectsRef = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("balanceGroupRef")
  private ResourceRef balanceGroupRef = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  public AdjustmentNonCurrencyBalance extension(Object extension) {
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

  public AdjustmentNonCurrencyBalance actionAffectsRef(ResourceRef actionAffectsRef) {
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

  public AdjustmentNonCurrencyBalance effective(OffsetDateTime effective) {
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

  public AdjustmentNonCurrencyBalance notes(Notes notes) {
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

  public AdjustmentNonCurrencyBalance resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The resource ID of the noncurrency balance to adjust.
   * @return resourceId
   **/
  @Schema(description = "The resource ID of the noncurrency balance to adjust.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public AdjustmentNonCurrencyBalance amount(BigDecimal amount) {
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

  public AdjustmentNonCurrencyBalance accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public AdjustmentNonCurrencyBalance balanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
    return this;
  }

  /**
   * Get balanceGroupRef
   * @return balanceGroupRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBalanceGroupRef() {
    return balanceGroupRef;
  }

  public void setBalanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
  }

  public AdjustmentNonCurrencyBalance validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time the adjustment's validity period starts.
   * @return validFrom
   **/
  @Schema(required = true, description = "The date and time the adjustment's validity period starts.")
      @NotNull

    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public AdjustmentNonCurrencyBalance validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the adjustment's validity period ends.
   * @return validTo
   **/
  @Schema(required = true, description = "The date and time the adjustment's validity period ends.")
      @NotNull

    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustmentNonCurrencyBalance adjustmentNonCurrencyBalance = (AdjustmentNonCurrencyBalance) o;
    return Objects.equals(this.extension, adjustmentNonCurrencyBalance.extension) &&
        Objects.equals(this.actionAffectsRef, adjustmentNonCurrencyBalance.actionAffectsRef) &&
        Objects.equals(this.effective, adjustmentNonCurrencyBalance.effective) &&
        Objects.equals(this.notes, adjustmentNonCurrencyBalance.notes) &&
        Objects.equals(this.resourceId, adjustmentNonCurrencyBalance.resourceId) &&
        Objects.equals(this.amount, adjustmentNonCurrencyBalance.amount) &&
        Objects.equals(this.accountRef, adjustmentNonCurrencyBalance.accountRef) &&
        Objects.equals(this.balanceGroupRef, adjustmentNonCurrencyBalance.balanceGroupRef) &&
        Objects.equals(this.validFrom, adjustmentNonCurrencyBalance.validFrom) &&
        Objects.equals(this.validTo, adjustmentNonCurrencyBalance.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effective, notes, resourceId, amount, accountRef, balanceGroupRef, validFrom, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustmentNonCurrencyBalance {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionAffectsRef: ").append(toIndentedString(actionAffectsRef)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    balanceGroupRef: ").append(toIndentedString(balanceGroupRef)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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
