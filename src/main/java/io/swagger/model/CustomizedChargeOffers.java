package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.EndingType;
import io.swagger.model.OverriddenCharges;
import io.swagger.model.ResourceRef;
import io.swagger.model.StartingType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of customized charge offers in the bundle.
 */
@Schema(description = "The list of customized charge offers in the bundle.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomizedChargeOffers   {
  @JsonProperty("baseChargeOfferRef")
  private ResourceRef baseChargeOfferRef = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("cycleStart")
  private StartingType cycleStart = null;

  @JsonProperty("cycleEnd")
  private EndingType cycleEnd = null;

  @JsonProperty("cycleFeeOverride")
  private BigDecimal cycleFeeOverride = null;

  @JsonProperty("cycleDiscountOverride")
  private BigDecimal cycleDiscountOverride = null;

  @JsonProperty("cycleDiscountPercentOverride")
  private BigDecimal cycleDiscountPercentOverride = null;

  @JsonProperty("purchaseStart")
  private StartingType purchaseStart = null;

  @JsonProperty("purchaseEnd")
  private EndingType purchaseEnd = null;

  @JsonProperty("purchaseFeeOverride")
  private BigDecimal purchaseFeeOverride = null;

  @JsonProperty("purchaseDiscountOverride")
  private BigDecimal purchaseDiscountOverride = null;

  @JsonProperty("purchaseDiscountPercentOverride")
  private BigDecimal purchaseDiscountPercentOverride = null;

  @JsonProperty("usageStart")
  private StartingType usageStart = null;

  @JsonProperty("usageEnd")
  private EndingType usageEnd = null;

  @JsonProperty("usagePercentOverride")
  private BigDecimal usagePercentOverride = null;

  @JsonProperty("gracePeriodUnit")
  private Integer gracePeriodUnit = null;

  @JsonProperty("gracePeriodOffset")
  private Integer gracePeriodOffset = null;

  @JsonProperty("renewalMode")
  private Integer renewalMode = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("statusFlag")
  private Integer statusFlag = null;

  @JsonProperty("overriddenCharges")
  @Valid
  private List<OverriddenCharges> overriddenCharges = null;

  public CustomizedChargeOffers baseChargeOfferRef(ResourceRef baseChargeOfferRef) {
    this.baseChargeOfferRef = baseChargeOfferRef;
    return this;
  }

  /**
   * Get baseChargeOfferRef
   * @return baseChargeOfferRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBaseChargeOfferRef() {
    return baseChargeOfferRef;
  }

  public void setBaseChargeOfferRef(ResourceRef baseChargeOfferRef) {
    this.baseChargeOfferRef = baseChargeOfferRef;
  }

  public CustomizedChargeOffers quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity purchased.
   * @return quantity
   **/
  @Schema(description = "The quantity purchased.")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public CustomizedChargeOffers name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The charge offer's name.
   * @return name
   **/
  @Schema(description = "The charge offer's name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomizedChargeOffers description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The charge offer's description.
   * @return description
   **/
  @Schema(description = "The charge offer's description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomizedChargeOffers cycleStart(StartingType cycleStart) {
    this.cycleStart = cycleStart;
    return this;
  }

  /**
   * Get cycleStart
   * @return cycleStart
   **/
  @Schema(description = "")
  
    @Valid
    public StartingType getCycleStart() {
    return cycleStart;
  }

  public void setCycleStart(StartingType cycleStart) {
    this.cycleStart = cycleStart;
  }

  public CustomizedChargeOffers cycleEnd(EndingType cycleEnd) {
    this.cycleEnd = cycleEnd;
    return this;
  }

  /**
   * Get cycleEnd
   * @return cycleEnd
   **/
  @Schema(description = "")
  
    @Valid
    public EndingType getCycleEnd() {
    return cycleEnd;
  }

  public void setCycleEnd(EndingType cycleEnd) {
    this.cycleEnd = cycleEnd;
  }

  public CustomizedChargeOffers cycleFeeOverride(BigDecimal cycleFeeOverride) {
    this.cycleFeeOverride = cycleFeeOverride;
    return this;
  }

  /**
   * The amount of the cycle fee override.
   * @return cycleFeeOverride
   **/
  @Schema(description = "The amount of the cycle fee override.")
  
    @Valid
    public BigDecimal getCycleFeeOverride() {
    return cycleFeeOverride;
  }

  public void setCycleFeeOverride(BigDecimal cycleFeeOverride) {
    this.cycleFeeOverride = cycleFeeOverride;
  }

  public CustomizedChargeOffers cycleDiscountOverride(BigDecimal cycleDiscountOverride) {
    this.cycleDiscountOverride = cycleDiscountOverride;
    return this;
  }

  /**
   * The fixed amount of the cycle discount override.
   * @return cycleDiscountOverride
   **/
  @Schema(description = "The fixed amount of the cycle discount override.")
  
    @Valid
    public BigDecimal getCycleDiscountOverride() {
    return cycleDiscountOverride;
  }

  public void setCycleDiscountOverride(BigDecimal cycleDiscountOverride) {
    this.cycleDiscountOverride = cycleDiscountOverride;
  }

  public CustomizedChargeOffers cycleDiscountPercentOverride(BigDecimal cycleDiscountPercentOverride) {
    this.cycleDiscountPercentOverride = cycleDiscountPercentOverride;
    return this;
  }

  /**
   * The percentage amount of the cycle discount override.
   * @return cycleDiscountPercentOverride
   **/
  @Schema(description = "The percentage amount of the cycle discount override.")
  
    @Valid
    public BigDecimal getCycleDiscountPercentOverride() {
    return cycleDiscountPercentOverride;
  }

  public void setCycleDiscountPercentOverride(BigDecimal cycleDiscountPercentOverride) {
    this.cycleDiscountPercentOverride = cycleDiscountPercentOverride;
  }

  public CustomizedChargeOffers purchaseStart(StartingType purchaseStart) {
    this.purchaseStart = purchaseStart;
    return this;
  }

  /**
   * Get purchaseStart
   * @return purchaseStart
   **/
  @Schema(description = "")
  
    @Valid
    public StartingType getPurchaseStart() {
    return purchaseStart;
  }

  public void setPurchaseStart(StartingType purchaseStart) {
    this.purchaseStart = purchaseStart;
  }

  public CustomizedChargeOffers purchaseEnd(EndingType purchaseEnd) {
    this.purchaseEnd = purchaseEnd;
    return this;
  }

  /**
   * Get purchaseEnd
   * @return purchaseEnd
   **/
  @Schema(description = "")
  
    @Valid
    public EndingType getPurchaseEnd() {
    return purchaseEnd;
  }

  public void setPurchaseEnd(EndingType purchaseEnd) {
    this.purchaseEnd = purchaseEnd;
  }

  public CustomizedChargeOffers purchaseFeeOverride(BigDecimal purchaseFeeOverride) {
    this.purchaseFeeOverride = purchaseFeeOverride;
    return this;
  }

  /**
   * The fixed amount of the purchase fee override.
   * @return purchaseFeeOverride
   **/
  @Schema(description = "The fixed amount of the purchase fee override.")
  
    @Valid
    public BigDecimal getPurchaseFeeOverride() {
    return purchaseFeeOverride;
  }

  public void setPurchaseFeeOverride(BigDecimal purchaseFeeOverride) {
    this.purchaseFeeOverride = purchaseFeeOverride;
  }

  public CustomizedChargeOffers purchaseDiscountOverride(BigDecimal purchaseDiscountOverride) {
    this.purchaseDiscountOverride = purchaseDiscountOverride;
    return this;
  }

  /**
   * The fixed amount of the purchase discount override.
   * @return purchaseDiscountOverride
   **/
  @Schema(description = "The fixed amount of the purchase discount override.")
  
    @Valid
    public BigDecimal getPurchaseDiscountOverride() {
    return purchaseDiscountOverride;
  }

  public void setPurchaseDiscountOverride(BigDecimal purchaseDiscountOverride) {
    this.purchaseDiscountOverride = purchaseDiscountOverride;
  }

  public CustomizedChargeOffers purchaseDiscountPercentOverride(BigDecimal purchaseDiscountPercentOverride) {
    this.purchaseDiscountPercentOverride = purchaseDiscountPercentOverride;
    return this;
  }

  /**
   * The percentage amount of the purchase discount override.
   * @return purchaseDiscountPercentOverride
   **/
  @Schema(description = "The percentage amount of the purchase discount override.")
  
    @Valid
    public BigDecimal getPurchaseDiscountPercentOverride() {
    return purchaseDiscountPercentOverride;
  }

  public void setPurchaseDiscountPercentOverride(BigDecimal purchaseDiscountPercentOverride) {
    this.purchaseDiscountPercentOverride = purchaseDiscountPercentOverride;
  }

  public CustomizedChargeOffers usageStart(StartingType usageStart) {
    this.usageStart = usageStart;
    return this;
  }

  /**
   * Get usageStart
   * @return usageStart
   **/
  @Schema(description = "")
  
    @Valid
    public StartingType getUsageStart() {
    return usageStart;
  }

  public void setUsageStart(StartingType usageStart) {
    this.usageStart = usageStart;
  }

  public CustomizedChargeOffers usageEnd(EndingType usageEnd) {
    this.usageEnd = usageEnd;
    return this;
  }

  /**
   * Get usageEnd
   * @return usageEnd
   **/
  @Schema(description = "")
  
    @Valid
    public EndingType getUsageEnd() {
    return usageEnd;
  }

  public void setUsageEnd(EndingType usageEnd) {
    this.usageEnd = usageEnd;
  }

  public CustomizedChargeOffers usagePercentOverride(BigDecimal usagePercentOverride) {
    this.usagePercentOverride = usagePercentOverride;
    return this;
  }

  /**
   * The percentage amount of the usage override.
   * @return usagePercentOverride
   **/
  @Schema(description = "The percentage amount of the usage override.")
  
    @Valid
    public BigDecimal getUsagePercentOverride() {
    return usagePercentOverride;
  }

  public void setUsagePercentOverride(BigDecimal usagePercentOverride) {
    this.usagePercentOverride = usagePercentOverride;
  }

  public CustomizedChargeOffers gracePeriodUnit(Integer gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
    return this;
  }

  /**
   * The unit for the grace period.
   * @return gracePeriodUnit
   **/
  @Schema(description = "The unit for the grace period.")
  
    public Integer getGracePeriodUnit() {
    return gracePeriodUnit;
  }

  public void setGracePeriodUnit(Integer gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
  }

  public CustomizedChargeOffers gracePeriodOffset(Integer gracePeriodOffset) {
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

  public CustomizedChargeOffers renewalMode(Integer renewalMode) {
    this.renewalMode = renewalMode;
    return this;
  }

  /**
   * How to handle the charge offer's cycle alignment when its bundle is reactivated. Possible values are: <ul><li><b>0</b>: Cycle aligns with the original billing date or configured specific day of the month.</li><li><b>1</b>: Cycle aligns with the reactivation date.</li></ul>
   * @return renewalMode
   **/
  @Schema(description = "How to handle the charge offer's cycle alignment when its bundle is reactivated. Possible values are: <ul><li><b>0</b>: Cycle aligns with the original billing date or configured specific day of the month.</li><li><b>1</b>: Cycle aligns with the reactivation date.</li></ul>")
  
    public Integer getRenewalMode() {
    return renewalMode;
  }

  public void setRenewalMode(Integer renewalMode) {
    this.renewalMode = renewalMode;
  }

  public CustomizedChargeOffers status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The charge offer's status. Can be one of the following: <ul><li><b>0</b>: Not set</li><li><b>1</b>: Active</li><li><b>2</b>: Inactive</li><li><b>3</b>: Canceled</li></ul>
   * @return status
   **/
  @Schema(description = "The charge offer's status. Can be one of the following: <ul><li><b>0</b>: Not set</li><li><b>1</b>: Active</li><li><b>2</b>: Inactive</li><li><b>3</b>: Canceled</li></ul>")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public CustomizedChargeOffers statusFlag(Integer statusFlag) {
    this.statusFlag = statusFlag;
    return this;
  }

  /**
   * The status flag.
   * @return statusFlag
   **/
  @Schema(description = "The status flag.")
  
    public Integer getStatusFlag() {
    return statusFlag;
  }

  public void setStatusFlag(Integer statusFlag) {
    this.statusFlag = statusFlag;
  }

  public CustomizedChargeOffers overriddenCharges(List<OverriddenCharges> overriddenCharges) {
    this.overriddenCharges = overriddenCharges;
    return this;
  }

  public CustomizedChargeOffers addOverriddenChargesItem(OverriddenCharges overriddenChargesItem) {
    if (this.overriddenCharges == null) {
      this.overriddenCharges = new ArrayList<OverriddenCharges>();
    }
    this.overriddenCharges.add(overriddenChargesItem);
    return this;
  }

  /**
   * The dynamic charges associated with the charge offers.
   * @return overriddenCharges
   **/
  @Schema(description = "The dynamic charges associated with the charge offers.")
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
    CustomizedChargeOffers customizedChargeOffers = (CustomizedChargeOffers) o;
    return Objects.equals(this.baseChargeOfferRef, customizedChargeOffers.baseChargeOfferRef) &&
        Objects.equals(this.quantity, customizedChargeOffers.quantity) &&
        Objects.equals(this.name, customizedChargeOffers.name) &&
        Objects.equals(this.description, customizedChargeOffers.description) &&
        Objects.equals(this.cycleStart, customizedChargeOffers.cycleStart) &&
        Objects.equals(this.cycleEnd, customizedChargeOffers.cycleEnd) &&
        Objects.equals(this.cycleFeeOverride, customizedChargeOffers.cycleFeeOverride) &&
        Objects.equals(this.cycleDiscountOverride, customizedChargeOffers.cycleDiscountOverride) &&
        Objects.equals(this.cycleDiscountPercentOverride, customizedChargeOffers.cycleDiscountPercentOverride) &&
        Objects.equals(this.purchaseStart, customizedChargeOffers.purchaseStart) &&
        Objects.equals(this.purchaseEnd, customizedChargeOffers.purchaseEnd) &&
        Objects.equals(this.purchaseFeeOverride, customizedChargeOffers.purchaseFeeOverride) &&
        Objects.equals(this.purchaseDiscountOverride, customizedChargeOffers.purchaseDiscountOverride) &&
        Objects.equals(this.purchaseDiscountPercentOverride, customizedChargeOffers.purchaseDiscountPercentOverride) &&
        Objects.equals(this.usageStart, customizedChargeOffers.usageStart) &&
        Objects.equals(this.usageEnd, customizedChargeOffers.usageEnd) &&
        Objects.equals(this.usagePercentOverride, customizedChargeOffers.usagePercentOverride) &&
        Objects.equals(this.gracePeriodUnit, customizedChargeOffers.gracePeriodUnit) &&
        Objects.equals(this.gracePeriodOffset, customizedChargeOffers.gracePeriodOffset) &&
        Objects.equals(this.renewalMode, customizedChargeOffers.renewalMode) &&
        Objects.equals(this.status, customizedChargeOffers.status) &&
        Objects.equals(this.statusFlag, customizedChargeOffers.statusFlag) &&
        Objects.equals(this.overriddenCharges, customizedChargeOffers.overriddenCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseChargeOfferRef, quantity, name, description, cycleStart, cycleEnd, cycleFeeOverride, cycleDiscountOverride, cycleDiscountPercentOverride, purchaseStart, purchaseEnd, purchaseFeeOverride, purchaseDiscountOverride, purchaseDiscountPercentOverride, usageStart, usageEnd, usagePercentOverride, gracePeriodUnit, gracePeriodOffset, renewalMode, status, statusFlag, overriddenCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizedChargeOffers {\n");
    
    sb.append("    baseChargeOfferRef: ").append(toIndentedString(baseChargeOfferRef)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cycleStart: ").append(toIndentedString(cycleStart)).append("\n");
    sb.append("    cycleEnd: ").append(toIndentedString(cycleEnd)).append("\n");
    sb.append("    cycleFeeOverride: ").append(toIndentedString(cycleFeeOverride)).append("\n");
    sb.append("    cycleDiscountOverride: ").append(toIndentedString(cycleDiscountOverride)).append("\n");
    sb.append("    cycleDiscountPercentOverride: ").append(toIndentedString(cycleDiscountPercentOverride)).append("\n");
    sb.append("    purchaseStart: ").append(toIndentedString(purchaseStart)).append("\n");
    sb.append("    purchaseEnd: ").append(toIndentedString(purchaseEnd)).append("\n");
    sb.append("    purchaseFeeOverride: ").append(toIndentedString(purchaseFeeOverride)).append("\n");
    sb.append("    purchaseDiscountOverride: ").append(toIndentedString(purchaseDiscountOverride)).append("\n");
    sb.append("    purchaseDiscountPercentOverride: ").append(toIndentedString(purchaseDiscountPercentOverride)).append("\n");
    sb.append("    usageStart: ").append(toIndentedString(usageStart)).append("\n");
    sb.append("    usageEnd: ").append(toIndentedString(usageEnd)).append("\n");
    sb.append("    usagePercentOverride: ").append(toIndentedString(usagePercentOverride)).append("\n");
    sb.append("    gracePeriodUnit: ").append(toIndentedString(gracePeriodUnit)).append("\n");
    sb.append("    gracePeriodOffset: ").append(toIndentedString(gracePeriodOffset)).append("\n");
    sb.append("    renewalMode: ").append(toIndentedString(renewalMode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusFlag: ").append(toIndentedString(statusFlag)).append("\n");
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
