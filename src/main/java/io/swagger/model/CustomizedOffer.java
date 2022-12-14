package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OverriddenCharges;
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
 * A customized offer.
 */
@Schema(description = "A customized offer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomizedOffer   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("purchasedProductRef")
  private ResourceRef purchasedProductRef = null;

  @JsonProperty("cycleDuration")
  private Integer cycleDuration = null;

  @JsonProperty("recurringFee")
  private BigDecimal recurringFee = null;

  @JsonProperty("recurringFeeOverriden")
  private BigDecimal recurringFeeOverriden = null;

  @JsonProperty("recurringDiscount")
  private BigDecimal recurringDiscount = null;

  @JsonProperty("recurringDiscountPercent")
  private BigDecimal recurringDiscountPercent = null;

  @JsonProperty("purchaseFee")
  private BigDecimal purchaseFee = null;

  @JsonProperty("purchaseFeeOverriden")
  private BigDecimal purchaseFeeOverriden = null;

  @JsonProperty("purchaseDiscount")
  private BigDecimal purchaseDiscount = null;

  @JsonProperty("purchaseDiscountPercent")
  private BigDecimal purchaseDiscountPercent = null;

  @JsonProperty("usageDiscount")
  private BigDecimal usageDiscount = null;

  @JsonProperty("usageStartT")
  private OffsetDateTime usageStartT = null;

  @JsonProperty("usageEndT")
  private OffsetDateTime usageEndT = null;

  @JsonProperty("purchaseStartT")
  private OffsetDateTime purchaseStartT = null;

  @JsonProperty("purchaseEndT")
  private OffsetDateTime purchaseEndT = null;

  @JsonProperty("cycleStartT")
  private OffsetDateTime cycleStartT = null;

  @JsonProperty("cycleEndT")
  private OffsetDateTime cycleEndT = null;

  @JsonProperty("gracePeriodUnit")
  private Integer gracePeriodUnit = null;

  @JsonProperty("gracePeriodOffset")
  private Integer gracePeriodOffset = null;

  @JsonProperty("renewalMode")
  private Integer renewalMode = null;

  @JsonProperty("terminationFee")
  private BigDecimal terminationFee = null;

  @JsonProperty("overriddenCharges")
  @Valid
  private List<OverriddenCharges> overriddenCharges = new ArrayList<OverriddenCharges>();

  public CustomizedOffer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID.
   * @return id
   **/
  @Schema(required = true, description = "The ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomizedOffer purchasedProductRef(ResourceRef purchasedProductRef) {
    this.purchasedProductRef = purchasedProductRef;
    return this;
  }

  /**
   * Get purchasedProductRef
   * @return purchasedProductRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPurchasedProductRef() {
    return purchasedProductRef;
  }

  public void setPurchasedProductRef(ResourceRef purchasedProductRef) {
    this.purchasedProductRef = purchasedProductRef;
  }

  public CustomizedOffer cycleDuration(Integer cycleDuration) {
    this.cycleDuration = cycleDuration;
    return this;
  }

  /**
   * The accounting cycle duration.
   * @return cycleDuration
   **/
  @Schema(description = "The accounting cycle duration.")
  
    public Integer getCycleDuration() {
    return cycleDuration;
  }

  public void setCycleDuration(Integer cycleDuration) {
    this.cycleDuration = cycleDuration;
  }

  public CustomizedOffer recurringFee(BigDecimal recurringFee) {
    this.recurringFee = recurringFee;
    return this;
  }

  /**
   * The amount of the recurring fee.
   * @return recurringFee
   **/
  @Schema(required = true, description = "The amount of the recurring fee.")
      @NotNull

    @Valid
    public BigDecimal getRecurringFee() {
    return recurringFee;
  }

  public void setRecurringFee(BigDecimal recurringFee) {
    this.recurringFee = recurringFee;
  }

  public CustomizedOffer recurringFeeOverriden(BigDecimal recurringFeeOverriden) {
    this.recurringFeeOverriden = recurringFeeOverriden;
    return this;
  }

  /**
   * The amount by which to override the recurring fee.
   * @return recurringFeeOverriden
   **/
  @Schema(required = true, description = "The amount by which to override the recurring fee.")
      @NotNull

    @Valid
    public BigDecimal getRecurringFeeOverriden() {
    return recurringFeeOverriden;
  }

  public void setRecurringFeeOverriden(BigDecimal recurringFeeOverriden) {
    this.recurringFeeOverriden = recurringFeeOverriden;
  }

  public CustomizedOffer recurringDiscount(BigDecimal recurringDiscount) {
    this.recurringDiscount = recurringDiscount;
    return this;
  }

  /**
   * The fixed amount of the recurring discount.
   * @return recurringDiscount
   **/
  @Schema(required = true, description = "The fixed amount of the recurring discount.")
      @NotNull

    @Valid
    public BigDecimal getRecurringDiscount() {
    return recurringDiscount;
  }

  public void setRecurringDiscount(BigDecimal recurringDiscount) {
    this.recurringDiscount = recurringDiscount;
  }

  public CustomizedOffer recurringDiscountPercent(BigDecimal recurringDiscountPercent) {
    this.recurringDiscountPercent = recurringDiscountPercent;
    return this;
  }

  /**
   * The percentage amount of the recurring discount.
   * @return recurringDiscountPercent
   **/
  @Schema(required = true, description = "The percentage amount of the recurring discount.")
      @NotNull

    @Valid
    public BigDecimal getRecurringDiscountPercent() {
    return recurringDiscountPercent;
  }

  public void setRecurringDiscountPercent(BigDecimal recurringDiscountPercent) {
    this.recurringDiscountPercent = recurringDiscountPercent;
  }

  public CustomizedOffer purchaseFee(BigDecimal purchaseFee) {
    this.purchaseFee = purchaseFee;
    return this;
  }

  /**
   * The purchase fee amount.
   * @return purchaseFee
   **/
  @Schema(required = true, description = "The purchase fee amount.")
      @NotNull

    @Valid
    public BigDecimal getPurchaseFee() {
    return purchaseFee;
  }

  public void setPurchaseFee(BigDecimal purchaseFee) {
    this.purchaseFee = purchaseFee;
  }

  public CustomizedOffer purchaseFeeOverriden(BigDecimal purchaseFeeOverriden) {
    this.purchaseFeeOverriden = purchaseFeeOverriden;
    return this;
  }

  /**
   * The amount by which to override the purchase fee.
   * @return purchaseFeeOverriden
   **/
  @Schema(required = true, description = "The amount by which to override the purchase fee.")
      @NotNull

    @Valid
    public BigDecimal getPurchaseFeeOverriden() {
    return purchaseFeeOverriden;
  }

  public void setPurchaseFeeOverriden(BigDecimal purchaseFeeOverriden) {
    this.purchaseFeeOverriden = purchaseFeeOverriden;
  }

  public CustomizedOffer purchaseDiscount(BigDecimal purchaseDiscount) {
    this.purchaseDiscount = purchaseDiscount;
    return this;
  }

  /**
   * The amount of the purchase fee discount.
   * @return purchaseDiscount
   **/
  @Schema(required = true, description = "The amount of the purchase fee discount.")
      @NotNull

    @Valid
    public BigDecimal getPurchaseDiscount() {
    return purchaseDiscount;
  }

  public void setPurchaseDiscount(BigDecimal purchaseDiscount) {
    this.purchaseDiscount = purchaseDiscount;
  }

  public CustomizedOffer purchaseDiscountPercent(BigDecimal purchaseDiscountPercent) {
    this.purchaseDiscountPercent = purchaseDiscountPercent;
    return this;
  }

  /**
   * The percentage amount by which to discount the purchase fee.
   * @return purchaseDiscountPercent
   **/
  @Schema(required = true, description = "The percentage amount by which to discount the purchase fee.")
      @NotNull

    @Valid
    public BigDecimal getPurchaseDiscountPercent() {
    return purchaseDiscountPercent;
  }

  public void setPurchaseDiscountPercent(BigDecimal purchaseDiscountPercent) {
    this.purchaseDiscountPercent = purchaseDiscountPercent;
  }

  public CustomizedOffer usageDiscount(BigDecimal usageDiscount) {
    this.usageDiscount = usageDiscount;
    return this;
  }

  /**
   * The amount of the usage discount.
   * @return usageDiscount
   **/
  @Schema(required = true, description = "The amount of the usage discount.")
      @NotNull

    @Valid
    public BigDecimal getUsageDiscount() {
    return usageDiscount;
  }

  public void setUsageDiscount(BigDecimal usageDiscount) {
    this.usageDiscount = usageDiscount;
  }

  public CustomizedOffer usageStartT(OffsetDateTime usageStartT) {
    this.usageStartT = usageStartT;
    return this;
  }

  /**
   * The date and time the usage changes start.
   * @return usageStartT
   **/
  @Schema(required = true, description = "The date and time the usage changes start.")
      @NotNull

    @Valid
    public OffsetDateTime getUsageStartT() {
    return usageStartT;
  }

  public void setUsageStartT(OffsetDateTime usageStartT) {
    this.usageStartT = usageStartT;
  }

  public CustomizedOffer usageEndT(OffsetDateTime usageEndT) {
    this.usageEndT = usageEndT;
    return this;
  }

  /**
   * The date and time the usage changes end.
   * @return usageEndT
   **/
  @Schema(required = true, description = "The date and time the usage changes end.")
      @NotNull

    @Valid
    public OffsetDateTime getUsageEndT() {
    return usageEndT;
  }

  public void setUsageEndT(OffsetDateTime usageEndT) {
    this.usageEndT = usageEndT;
  }

  public CustomizedOffer purchaseStartT(OffsetDateTime purchaseStartT) {
    this.purchaseStartT = purchaseStartT;
    return this;
  }

  /**
   * The date and time the purchase changes start.
   * @return purchaseStartT
   **/
  @Schema(required = true, description = "The date and time the purchase changes start.")
      @NotNull

    @Valid
    public OffsetDateTime getPurchaseStartT() {
    return purchaseStartT;
  }

  public void setPurchaseStartT(OffsetDateTime purchaseStartT) {
    this.purchaseStartT = purchaseStartT;
  }

  public CustomizedOffer purchaseEndT(OffsetDateTime purchaseEndT) {
    this.purchaseEndT = purchaseEndT;
    return this;
  }

  /**
   * The date and time the purchase changes end.
   * @return purchaseEndT
   **/
  @Schema(required = true, description = "The date and time the purchase changes end.")
      @NotNull

    @Valid
    public OffsetDateTime getPurchaseEndT() {
    return purchaseEndT;
  }

  public void setPurchaseEndT(OffsetDateTime purchaseEndT) {
    this.purchaseEndT = purchaseEndT;
  }

  public CustomizedOffer cycleStartT(OffsetDateTime cycleStartT) {
    this.cycleStartT = cycleStartT;
    return this;
  }

  /**
   * The date and time the cycle changes start.
   * @return cycleStartT
   **/
  @Schema(required = true, description = "The date and time the cycle changes start.")
      @NotNull

    @Valid
    public OffsetDateTime getCycleStartT() {
    return cycleStartT;
  }

  public void setCycleStartT(OffsetDateTime cycleStartT) {
    this.cycleStartT = cycleStartT;
  }

  public CustomizedOffer cycleEndT(OffsetDateTime cycleEndT) {
    this.cycleEndT = cycleEndT;
    return this;
  }

  /**
   * The date and time the cycle changes end.
   * @return cycleEndT
   **/
  @Schema(required = true, description = "The date and time the cycle changes end.")
      @NotNull

    @Valid
    public OffsetDateTime getCycleEndT() {
    return cycleEndT;
  }

  public void setCycleEndT(OffsetDateTime cycleEndT) {
    this.cycleEndT = cycleEndT;
  }

  public CustomizedOffer gracePeriodUnit(Integer gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
    return this;
  }

  /**
   * The unit the grace period is measured in.
   * @return gracePeriodUnit
   **/
  @Schema(description = "The unit the grace period is measured in.")
  
    public Integer getGracePeriodUnit() {
    return gracePeriodUnit;
  }

  public void setGracePeriodUnit(Integer gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
  }

  public CustomizedOffer gracePeriodOffset(Integer gracePeriodOffset) {
    this.gracePeriodOffset = gracePeriodOffset;
    return this;
  }

  /**
   * The number to offset the grace period by.
   * @return gracePeriodOffset
   **/
  @Schema(description = "The number to offset the grace period by.")
  
    public Integer getGracePeriodOffset() {
    return gracePeriodOffset;
  }

  public void setGracePeriodOffset(Integer gracePeriodOffset) {
    this.gracePeriodOffset = gracePeriodOffset;
  }

  public CustomizedOffer renewalMode(Integer renewalMode) {
    this.renewalMode = renewalMode;
    return this;
  }

  /**
   * How to handle the offer's cycle alignment when its bundle is reactivated. Possible values are: <ul><li><b>0</b>: Cycle aligns with the original billing date or configured specific day of the month.</li><li><b>1</b>: Cycle aligns with the reactivation date.</li></ul>
   * @return renewalMode
   **/
  @Schema(description = "How to handle the offer's cycle alignment when its bundle is reactivated. Possible values are: <ul><li><b>0</b>: Cycle aligns with the original billing date or configured specific day of the month.</li><li><b>1</b>: Cycle aligns with the reactivation date.</li></ul>")
  
    public Integer getRenewalMode() {
    return renewalMode;
  }

  public void setRenewalMode(Integer renewalMode) {
    this.renewalMode = renewalMode;
  }

  public CustomizedOffer terminationFee(BigDecimal terminationFee) {
    this.terminationFee = terminationFee;
    return this;
  }

  /**
   * The amount of the early termination fee.
   * @return terminationFee
   **/
  @Schema(description = "The amount of the early termination fee.")
  
    @Valid
    public BigDecimal getTerminationFee() {
    return terminationFee;
  }

  public void setTerminationFee(BigDecimal terminationFee) {
    this.terminationFee = terminationFee;
  }

  public CustomizedOffer overriddenCharges(List<OverriddenCharges> overriddenCharges) {
    this.overriddenCharges = overriddenCharges;
    return this;
  }

  public CustomizedOffer addOverriddenChargesItem(OverriddenCharges overriddenChargesItem) {
    this.overriddenCharges.add(overriddenChargesItem);
    return this;
  }

  /**
   * The dynamic charges associated with the charge offer.
   * @return overriddenCharges
   **/
  @Schema(required = true, description = "The dynamic charges associated with the charge offer.")
      @NotNull
    @Valid
    public List<OverriddenCharges> getOverriddenCharges() {
    return overriddenCharges;
  }

  public void setOverriddenCharges(List<OverriddenCharges> overriddenCharges) {
    this.overriddenCharges = overriddenCharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizedOffer customizedOffer = (CustomizedOffer) o;
    return Objects.equals(this.id, customizedOffer.id) &&
        Objects.equals(this.purchasedProductRef, customizedOffer.purchasedProductRef) &&
        Objects.equals(this.cycleDuration, customizedOffer.cycleDuration) &&
        Objects.equals(this.recurringFee, customizedOffer.recurringFee) &&
        Objects.equals(this.recurringFeeOverriden, customizedOffer.recurringFeeOverriden) &&
        Objects.equals(this.recurringDiscount, customizedOffer.recurringDiscount) &&
        Objects.equals(this.recurringDiscountPercent, customizedOffer.recurringDiscountPercent) &&
        Objects.equals(this.purchaseFee, customizedOffer.purchaseFee) &&
        Objects.equals(this.purchaseFeeOverriden, customizedOffer.purchaseFeeOverriden) &&
        Objects.equals(this.purchaseDiscount, customizedOffer.purchaseDiscount) &&
        Objects.equals(this.purchaseDiscountPercent, customizedOffer.purchaseDiscountPercent) &&
        Objects.equals(this.usageDiscount, customizedOffer.usageDiscount) &&
        Objects.equals(this.usageStartT, customizedOffer.usageStartT) &&
        Objects.equals(this.usageEndT, customizedOffer.usageEndT) &&
        Objects.equals(this.purchaseStartT, customizedOffer.purchaseStartT) &&
        Objects.equals(this.purchaseEndT, customizedOffer.purchaseEndT) &&
        Objects.equals(this.cycleStartT, customizedOffer.cycleStartT) &&
        Objects.equals(this.cycleEndT, customizedOffer.cycleEndT) &&
        Objects.equals(this.gracePeriodUnit, customizedOffer.gracePeriodUnit) &&
        Objects.equals(this.gracePeriodOffset, customizedOffer.gracePeriodOffset) &&
        Objects.equals(this.renewalMode, customizedOffer.renewalMode) &&
        Objects.equals(this.terminationFee, customizedOffer.terminationFee) &&
        Objects.equals(this.overriddenCharges, customizedOffer.overriddenCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, purchasedProductRef, cycleDuration, recurringFee, recurringFeeOverriden, recurringDiscount, recurringDiscountPercent, purchaseFee, purchaseFeeOverriden, purchaseDiscount, purchaseDiscountPercent, usageDiscount, usageStartT, usageEndT, purchaseStartT, purchaseEndT, cycleStartT, cycleEndT, gracePeriodUnit, gracePeriodOffset, renewalMode, terminationFee, overriddenCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizedOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    purchasedProductRef: ").append(toIndentedString(purchasedProductRef)).append("\n");
    sb.append("    cycleDuration: ").append(toIndentedString(cycleDuration)).append("\n");
    sb.append("    recurringFee: ").append(toIndentedString(recurringFee)).append("\n");
    sb.append("    recurringFeeOverriden: ").append(toIndentedString(recurringFeeOverriden)).append("\n");
    sb.append("    recurringDiscount: ").append(toIndentedString(recurringDiscount)).append("\n");
    sb.append("    recurringDiscountPercent: ").append(toIndentedString(recurringDiscountPercent)).append("\n");
    sb.append("    purchaseFee: ").append(toIndentedString(purchaseFee)).append("\n");
    sb.append("    purchaseFeeOverriden: ").append(toIndentedString(purchaseFeeOverriden)).append("\n");
    sb.append("    purchaseDiscount: ").append(toIndentedString(purchaseDiscount)).append("\n");
    sb.append("    purchaseDiscountPercent: ").append(toIndentedString(purchaseDiscountPercent)).append("\n");
    sb.append("    usageDiscount: ").append(toIndentedString(usageDiscount)).append("\n");
    sb.append("    usageStartT: ").append(toIndentedString(usageStartT)).append("\n");
    sb.append("    usageEndT: ").append(toIndentedString(usageEndT)).append("\n");
    sb.append("    purchaseStartT: ").append(toIndentedString(purchaseStartT)).append("\n");
    sb.append("    purchaseEndT: ").append(toIndentedString(purchaseEndT)).append("\n");
    sb.append("    cycleStartT: ").append(toIndentedString(cycleStartT)).append("\n");
    sb.append("    cycleEndT: ").append(toIndentedString(cycleEndT)).append("\n");
    sb.append("    gracePeriodUnit: ").append(toIndentedString(gracePeriodUnit)).append("\n");
    sb.append("    gracePeriodOffset: ").append(toIndentedString(gracePeriodOffset)).append("\n");
    sb.append("    renewalMode: ").append(toIndentedString(renewalMode)).append("\n");
    sb.append("    terminationFee: ").append(toIndentedString(terminationFee)).append("\n");
    sb.append("    overriddenCharges: ").append(toIndentedString(overriddenCharges)).append("\n");
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
