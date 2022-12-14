package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A credit limit, credit floor, credit threshold, or loan threshold and associated consumption rule and resource.
 */
@Schema(description = "A credit limit, credit floor, credit threshold, or loan threshold and associated consumption rule and resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class LimitType   {
  @JsonProperty("creditFloor")
  private BigDecimal creditFloor = null;

  @JsonProperty("creditLimit")
  private BigDecimal creditLimit = null;

  @JsonProperty("creditThresholds")
  private Integer creditThresholds = null;

  @JsonProperty("creditThresholdsFixed")
  private String creditThresholdsFixed = null;

  @JsonProperty("consumptionRule")
  private Integer consumptionRule = null;

  @JsonProperty("loanThresholds")
  private Integer loanThresholds = null;

  @JsonProperty("loanThresholdsFixed")
  private String loanThresholdsFixed = null;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  public LimitType creditFloor(BigDecimal creditFloor) {
    this.creditFloor = creditFloor;
    return this;
  }

  /**
   * The credit floor amount. The credit floor is the amount that indicates none of the balance has been used. For example, if an account is granted 200 minutes, the credit floor would be -200. For currency balances, the credit floor is usually 0.
   * @return creditFloor
   **/
  @Schema(description = "The credit floor amount. The credit floor is the amount that indicates none of the balance has been used. For example, if an account is granted 200 minutes, the credit floor would be -200. For currency balances, the credit floor is usually 0.")
  
    @Valid
    public BigDecimal getCreditFloor() {
    return creditFloor;
  }

  public void setCreditFloor(BigDecimal creditFloor) {
    this.creditFloor = creditFloor;
  }

  public LimitType creditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * The credit limit amount. A credit limit specifies the maximum amount of a balance that your customers can spend. For currency balances, the credit limit is the maximum balance of euros, dollars, or so on that can accumulate in an account. For noncurrency balances, the credit limit is the amount at which an account has used all of its minutes, gigabytes, or so on, which is usually 0.
   * @return creditLimit
   **/
  @Schema(description = "The credit limit amount. A credit limit specifies the maximum amount of a balance that your customers can spend. For currency balances, the credit limit is the maximum balance of euros, dollars, or so on that can accumulate in an account. For noncurrency balances, the credit limit is the amount at which an account has used all of its minutes, gigabytes, or so on, which is usually 0.")
  
    @Valid
    public BigDecimal getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public LimitType creditThresholds(Integer creditThresholds) {
    this.creditThresholds = creditThresholds;
    return this;
  }

  /**
   * The percent threshold for notifications. The account is sent a notification when this percent of the balance is used. The percentage must be a 5% increment. Use the decimal notation of the binary number for the bit position. <p>For example, to notify the account when 90% of the free minutes have been used, you calculate 90/5=18, so use the 18th bit position, which is 131072 in decimal notation. To notify when 95% have been used, use the 19th bit position, which is 262144 in decimal notation.
   * @return creditThresholds
   **/
  @Schema(description = "The percent threshold for notifications. The account is sent a notification when this percent of the balance is used. The percentage must be a 5% increment. Use the decimal notation of the binary number for the bit position. <p>For example, to notify the account when 90% of the free minutes have been used, you calculate 90/5=18, so use the 18th bit position, which is 131072 in decimal notation. To notify when 95% have been used, use the 19th bit position, which is 262144 in decimal notation.")
  
    public Integer getCreditThresholds() {
    return creditThresholds;
  }

  public void setCreditThresholds(Integer creditThresholds) {
    this.creditThresholds = creditThresholds;
  }

  public LimitType creditThresholdsFixed(String creditThresholdsFixed) {
    this.creditThresholdsFixed = creditThresholdsFixed;
    return this;
  }

  /**
   * The fixed threshold for notifications. The account is sent a notification when this fixed value of the balance is reached. You can set multiple values by using the <b>|</b> delimiter. For example, to notify the account when 30 minutes of usage remains and again when 5 minutes of usage remains, use <b>|30.00|5.00</b>
   * @return creditThresholdsFixed
   **/
  @Schema(description = "The fixed threshold for notifications. The account is sent a notification when this fixed value of the balance is reached. You can set multiple values by using the <b>|</b> delimiter. For example, to notify the account when 30 minutes of usage remains and again when 5 minutes of usage remains, use <b>|30.00|5.00</b>")
  
    public String getCreditThresholdsFixed() {
    return creditThresholdsFixed;
  }

  public void setCreditThresholdsFixed(String creditThresholdsFixed) {
    this.creditThresholdsFixed = creditThresholdsFixed;
  }

  public LimitType consumptionRule(Integer consumptionRule) {
    this.consumptionRule = consumptionRule;
    return this;
  }

  /**
   * The consumption rule. Can be one of the following&colon; <ul><li><b>0</b>: Not defined</li><li><b>1</b>: Earliest start time</li><li><b>2</b>: Latest start time</li><li><b>3</b>: Earliest expiration time</li><li><b>4</b>: Latest expiration time</li><li><b>5</b>: Earliest start time and latest expiration time</li><li><b>6</b>: Earliest start time and earliest expiration time</li><li><b>7</b>: Latest start time and earliest expiration time</li><li><b>8</b>: Latest start time and latest expiration time</li><li><b>9</b>: Earliest expiration time and earliest start time</li><li><b>10</b>: Earliest expiration time and latest start time</li><li><b>10</b>: Latest expiration time and earliest start time</li><li><b>10</b>: Latest expiration time and latest start time</li></ul>
   * @return consumptionRule
   **/
  @Schema(description = "The consumption rule. Can be one of the following&colon; <ul><li><b>0</b>: Not defined</li><li><b>1</b>: Earliest start time</li><li><b>2</b>: Latest start time</li><li><b>3</b>: Earliest expiration time</li><li><b>4</b>: Latest expiration time</li><li><b>5</b>: Earliest start time and latest expiration time</li><li><b>6</b>: Earliest start time and earliest expiration time</li><li><b>7</b>: Latest start time and earliest expiration time</li><li><b>8</b>: Latest start time and latest expiration time</li><li><b>9</b>: Earliest expiration time and earliest start time</li><li><b>10</b>: Earliest expiration time and latest start time</li><li><b>10</b>: Latest expiration time and earliest start time</li><li><b>10</b>: Latest expiration time and latest start time</li></ul>")
  
    public Integer getConsumptionRule() {
    return consumptionRule;
  }

  public void setConsumptionRule(Integer consumptionRule) {
    this.consumptionRule = consumptionRule;
  }

  public LimitType loanThresholds(Integer loanThresholds) {
    this.loanThresholds = loanThresholds;
    return this;
  }

  /**
   * Get loanThresholds
   * @return loanThresholds
   **/
  @Schema(description = "")
  
    public Integer getLoanThresholds() {
    return loanThresholds;
  }

  public void setLoanThresholds(Integer loanThresholds) {
    this.loanThresholds = loanThresholds;
  }

  public LimitType loanThresholdsFixed(String loanThresholdsFixed) {
    this.loanThresholdsFixed = loanThresholdsFixed;
    return this;
  }

  /**
   * Get loanThresholdsFixed
   * @return loanThresholdsFixed
   **/
  @Schema(description = "")
  
    public String getLoanThresholdsFixed() {
    return loanThresholdsFixed;
  }

  public void setLoanThresholdsFixed(String loanThresholdsFixed) {
    this.loanThresholdsFixed = loanThresholdsFixed;
  }

  public LimitType resourceId(Integer resourceId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitType limitType = (LimitType) o;
    return Objects.equals(this.creditFloor, limitType.creditFloor) &&
        Objects.equals(this.creditLimit, limitType.creditLimit) &&
        Objects.equals(this.creditThresholds, limitType.creditThresholds) &&
        Objects.equals(this.creditThresholdsFixed, limitType.creditThresholdsFixed) &&
        Objects.equals(this.consumptionRule, limitType.consumptionRule) &&
        Objects.equals(this.loanThresholds, limitType.loanThresholds) &&
        Objects.equals(this.loanThresholdsFixed, limitType.loanThresholdsFixed) &&
        Objects.equals(this.resourceId, limitType.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditFloor, creditLimit, creditThresholds, creditThresholdsFixed, consumptionRule, loanThresholds, loanThresholdsFixed, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitType {\n");
    
    sb.append("    creditFloor: ").append(toIndentedString(creditFloor)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    creditThresholds: ").append(toIndentedString(creditThresholds)).append("\n");
    sb.append("    creditThresholdsFixed: ").append(toIndentedString(creditThresholdsFixed)).append("\n");
    sb.append("    consumptionRule: ").append(toIndentedString(consumptionRule)).append("\n");
    sb.append("    loanThresholds: ").append(toIndentedString(loanThresholds)).append("\n");
    sb.append("    loanThresholdsFixed: ").append(toIndentedString(loanThresholdsFixed)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
