package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.EndingType;
import io.swagger.model.OverriddenCharges;
import io.swagger.model.ResourceRef;
import io.swagger.model.StartingType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of customized discount offers.
 */
@Schema(description = "The list of customized discount offers.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomizedDiscountOffers   {
  @JsonProperty("baseDiscountOfferRef")
  private ResourceRef baseDiscountOfferRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("purchaseStart")
  private StartingType purchaseStart = null;

  @JsonProperty("purchaseEnd")
  private EndingType purchaseEnd = null;

  @JsonProperty("cycleStart")
  private StartingType cycleStart = null;

  @JsonProperty("cycleEnd")
  private EndingType cycleEnd = null;

  @JsonProperty("usageStart")
  private StartingType usageStart = null;

  @JsonProperty("usageEnd")
  private EndingType usageEnd = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("statusFlag")
  private Integer statusFlag = null;

  @JsonProperty("overriddenCharges")
  @Valid
  private List<OverriddenCharges> overriddenCharges = null;

  public CustomizedDiscountOffers baseDiscountOfferRef(ResourceRef baseDiscountOfferRef) {
    this.baseDiscountOfferRef = baseDiscountOfferRef;
    return this;
  }

  /**
   * Get baseDiscountOfferRef
   * @return baseDiscountOfferRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBaseDiscountOfferRef() {
    return baseDiscountOfferRef;
  }

  public void setBaseDiscountOfferRef(ResourceRef baseDiscountOfferRef) {
    this.baseDiscountOfferRef = baseDiscountOfferRef;
  }

  public CustomizedDiscountOffers name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The discount offer's name.
   * @return name
   **/
  @Schema(description = "The discount offer's name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomizedDiscountOffers description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The discount offer's description.
   * @return description
   **/
  @Schema(description = "The discount offer's description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomizedDiscountOffers quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The discount's quantity.
   * @return quantity
   **/
  @Schema(description = "The discount's quantity.")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public CustomizedDiscountOffers purchaseStart(StartingType purchaseStart) {
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

  public CustomizedDiscountOffers purchaseEnd(EndingType purchaseEnd) {
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

  public CustomizedDiscountOffers cycleStart(StartingType cycleStart) {
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

  public CustomizedDiscountOffers cycleEnd(EndingType cycleEnd) {
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

  public CustomizedDiscountOffers usageStart(StartingType usageStart) {
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

  public CustomizedDiscountOffers usageEnd(EndingType usageEnd) {
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

  public CustomizedDiscountOffers status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The discount offer's status. Can be one of the following: <ul><li><b>0</b>: Not set</li><li><b>1</b>: Active</li><li><b>2</b>: Inactive</li><li><b>3</b>: Canceled</li></ul>
   * @return status
   **/
  @Schema(description = "The discount offer's status. Can be one of the following: <ul><li><b>0</b>: Not set</li><li><b>1</b>: Active</li><li><b>2</b>: Inactive</li><li><b>3</b>: Canceled</li></ul>")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public CustomizedDiscountOffers statusFlag(Integer statusFlag) {
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

  public CustomizedDiscountOffers overriddenCharges(List<OverriddenCharges> overriddenCharges) {
    this.overriddenCharges = overriddenCharges;
    return this;
  }

  public CustomizedDiscountOffers addOverriddenChargesItem(OverriddenCharges overriddenChargesItem) {
    if (this.overriddenCharges == null) {
      this.overriddenCharges = new ArrayList<OverriddenCharges>();
    }
    this.overriddenCharges.add(overriddenChargesItem);
    return this;
  }

  /**
   * The dynamic charges associated with the discount offer.
   * @return overriddenCharges
   **/
  @Schema(description = "The dynamic charges associated with the discount offer.")
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
    CustomizedDiscountOffers customizedDiscountOffers = (CustomizedDiscountOffers) o;
    return Objects.equals(this.baseDiscountOfferRef, customizedDiscountOffers.baseDiscountOfferRef) &&
        Objects.equals(this.name, customizedDiscountOffers.name) &&
        Objects.equals(this.description, customizedDiscountOffers.description) &&
        Objects.equals(this.quantity, customizedDiscountOffers.quantity) &&
        Objects.equals(this.purchaseStart, customizedDiscountOffers.purchaseStart) &&
        Objects.equals(this.purchaseEnd, customizedDiscountOffers.purchaseEnd) &&
        Objects.equals(this.cycleStart, customizedDiscountOffers.cycleStart) &&
        Objects.equals(this.cycleEnd, customizedDiscountOffers.cycleEnd) &&
        Objects.equals(this.usageStart, customizedDiscountOffers.usageStart) &&
        Objects.equals(this.usageEnd, customizedDiscountOffers.usageEnd) &&
        Objects.equals(this.status, customizedDiscountOffers.status) &&
        Objects.equals(this.statusFlag, customizedDiscountOffers.statusFlag) &&
        Objects.equals(this.overriddenCharges, customizedDiscountOffers.overriddenCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDiscountOfferRef, name, description, quantity, purchaseStart, purchaseEnd, cycleStart, cycleEnd, usageStart, usageEnd, status, statusFlag, overriddenCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizedDiscountOffers {\n");
    
    sb.append("    baseDiscountOfferRef: ").append(toIndentedString(baseDiscountOfferRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    purchaseStart: ").append(toIndentedString(purchaseStart)).append("\n");
    sb.append("    purchaseEnd: ").append(toIndentedString(purchaseEnd)).append("\n");
    sb.append("    cycleStart: ").append(toIndentedString(cycleStart)).append("\n");
    sb.append("    cycleEnd: ").append(toIndentedString(cycleEnd)).append("\n");
    sb.append("    usageStart: ").append(toIndentedString(usageStart)).append("\n");
    sb.append("    usageEnd: ").append(toIndentedString(usageEnd)).append("\n");
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
