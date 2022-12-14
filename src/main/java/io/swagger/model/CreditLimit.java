package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TempCreditLimit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditLimit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CreditLimit   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("limit")
  private BigDecimal limit = null;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  @JsonProperty("thresholds")
  private String thresholds = null;

  @JsonProperty("floor")
  private BigDecimal floor = null;

  @JsonProperty("fixedThresholds")
  private String fixedThresholds = null;

  @JsonProperty("tempCreditLimit")
  @Valid
  private List<TempCreditLimit> tempCreditLimit = null;

  public CreditLimit extension(Object extension) {
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

  public CreditLimit limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The credit limit amount.
   * @return limit
   **/
  @Schema(description = "The credit limit amount.")
  
    @Valid
    public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public CreditLimit resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The resource ID.
   * @return resourceId
   **/
  @Schema(description = "The resource ID.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public CreditLimit thresholds(String thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  /**
   * The value of any percentage thresholds.
   * @return thresholds
   **/
  @Schema(description = "The value of any percentage thresholds.")
  
    public String getThresholds() {
    return thresholds;
  }

  public void setThresholds(String thresholds) {
    this.thresholds = thresholds;
  }

  public CreditLimit floor(BigDecimal floor) {
    this.floor = floor;
    return this;
  }

  /**
   * The credit floor, which is a number that indicates none of the balance has been used. For example, it specifies the allowance of minutes or gigabytes that you granted to a customer. For currency balances, the credit floor is 0.
   * @return floor
   **/
  @Schema(description = "The credit floor, which is a number that indicates none of the balance has been used. For example, it specifies the allowance of minutes or gigabytes that you granted to a customer. For currency balances, the credit floor is 0.")
  
    @Valid
    public BigDecimal getFloor() {
    return floor;
  }

  public void setFloor(BigDecimal floor) {
    this.floor = floor;
  }

  public CreditLimit fixedThresholds(String fixedThresholds) {
    this.fixedThresholds = fixedThresholds;
    return this;
  }

  /**
   * The value of any fixed thresholds.
   * @return fixedThresholds
   **/
  @Schema(description = "The value of any fixed thresholds.")
  
    public String getFixedThresholds() {
    return fixedThresholds;
  }

  public void setFixedThresholds(String fixedThresholds) {
    this.fixedThresholds = fixedThresholds;
  }

  public CreditLimit tempCreditLimit(List<TempCreditLimit> tempCreditLimit) {
    this.tempCreditLimit = tempCreditLimit;
    return this;
  }

  public CreditLimit addTempCreditLimitItem(TempCreditLimit tempCreditLimitItem) {
    if (this.tempCreditLimit == null) {
      this.tempCreditLimit = new ArrayList<TempCreditLimit>();
    }
    this.tempCreditLimit.add(tempCreditLimitItem);
    return this;
  }

  /**
   * The list of temporary credit limits.
   * @return tempCreditLimit
   **/
  @Schema(description = "The list of temporary credit limits.")
      @Valid
    public List<TempCreditLimit> getTempCreditLimit() {
    return tempCreditLimit;
  }

  public void setTempCreditLimit(List<TempCreditLimit> tempCreditLimit) {
    this.tempCreditLimit = tempCreditLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditLimit creditLimit = (CreditLimit) o;
    return Objects.equals(this.extension, creditLimit.extension) &&
        Objects.equals(this.limit, creditLimit.limit) &&
        Objects.equals(this.resourceId, creditLimit.resourceId) &&
        Objects.equals(this.thresholds, creditLimit.thresholds) &&
        Objects.equals(this.floor, creditLimit.floor) &&
        Objects.equals(this.fixedThresholds, creditLimit.fixedThresholds) &&
        Objects.equals(this.tempCreditLimit, creditLimit.tempCreditLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, limit, resourceId, thresholds, floor, fixedThresholds, tempCreditLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditLimit {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    fixedThresholds: ").append(toIndentedString(fixedThresholds)).append("\n");
    sb.append("    tempCreditLimit: ").append(toIndentedString(tempCreditLimit)).append("\n");
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
