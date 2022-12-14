package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SubBalances;
import io.swagger.model.TempCreditLimit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of balances associated with the balance group.
 */
@Schema(description = "The list of balances associated with the balance group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Balances   {
  @JsonProperty("modifyLimit")
  private Boolean modifyLimit = null;

  @JsonProperty("currentBalance")
  private BigDecimal currentBalance = null;

  @JsonProperty("creditFloor")
  private BigDecimal creditFloor = null;

  @JsonProperty("creditLimit")
  private BigDecimal creditLimit = null;

  @JsonProperty("creditThresholds")
  private Integer creditThresholds = null;

  @JsonProperty("formattedCreditThresholds")
  private String formattedCreditThresholds = null;

  @JsonProperty("creditThresholdsFixed")
  private String creditThresholdsFixed = null;

  @JsonProperty("expiredBeforeUsing")
  private BigDecimal expiredBeforeUsing = null;

  @JsonProperty("subBalances")
  @Valid
  private List<SubBalances> subBalances = null;

  @JsonProperty("outstandingAmount")
  private BigDecimal outstandingAmount = null;

  @JsonProperty("loanThresholds")
  private Integer loanThresholds = null;

  @JsonProperty("loanThresholdsFixed")
  private String loanThresholdsFixed = null;

  @JsonProperty("tempCreditLimit")
  @Valid
  private List<TempCreditLimit> tempCreditLimit = null;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  public Balances modifyLimit(Boolean modifyLimit) {
    this.modifyLimit = modifyLimit;
    return this;
  }

  /**
   * Whether a credit limit is being modified by the request (<b>true</b>) or not (<b>false</b>).
   * @return modifyLimit
   **/
  @Schema(description = "Whether a credit limit is being modified by the request (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isModifyLimit() {
    return modifyLimit;
  }

  public void setModifyLimit(Boolean modifyLimit) {
    this.modifyLimit = modifyLimit;
  }

  public Balances currentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * The current balance.
   * @return currentBalance
   **/
  @Schema(required = true, description = "The current balance.")
      @NotNull

    @Valid
    public BigDecimal getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }

  public Balances creditFloor(BigDecimal creditFloor) {
    this.creditFloor = creditFloor;
    return this;
  }

  /**
   * The credit floor associated with the balance.
   * @return creditFloor
   **/
  @Schema(description = "The credit floor associated with the balance.")
  
    @Valid
    public BigDecimal getCreditFloor() {
    return creditFloor;
  }

  public void setCreditFloor(BigDecimal creditFloor) {
    this.creditFloor = creditFloor;
  }

  public Balances creditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * The credit limit associated with the balance.
   * @return creditLimit
   **/
  @Schema(description = "The credit limit associated with the balance.")
  
    @Valid
    public BigDecimal getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public Balances creditThresholds(Integer creditThresholds) {
    this.creditThresholds = creditThresholds;
    return this;
  }

  /**
   * The credit thresholds associated with the balance.
   * @return creditThresholds
   **/
  @Schema(description = "The credit thresholds associated with the balance.")
  
    public Integer getCreditThresholds() {
    return creditThresholds;
  }

  public void setCreditThresholds(Integer creditThresholds) {
    this.creditThresholds = creditThresholds;
  }

  public Balances formattedCreditThresholds(String formattedCreditThresholds) {
    this.formattedCreditThresholds = formattedCreditThresholds;
    return this;
  }

  /**
   * The balance percentage usage at which to notify the customer.
   * @return formattedCreditThresholds
   **/
  @Schema(description = "The balance percentage usage at which to notify the customer.")
  
    public String getFormattedCreditThresholds() {
    return formattedCreditThresholds;
  }

  public void setFormattedCreditThresholds(String formattedCreditThresholds) {
    this.formattedCreditThresholds = formattedCreditThresholds;
  }

  public Balances creditThresholdsFixed(String creditThresholdsFixed) {
    this.creditThresholdsFixed = creditThresholdsFixed;
    return this;
  }

  /**
   * The value at which to send a notification, such as 30 US dollars or 30 minutes.
   * @return creditThresholdsFixed
   **/
  @Schema(description = "The value at which to send a notification, such as 30 US dollars or 30 minutes.")
  
    public String getCreditThresholdsFixed() {
    return creditThresholdsFixed;
  }

  public void setCreditThresholdsFixed(String creditThresholdsFixed) {
    this.creditThresholdsFixed = creditThresholdsFixed;
  }

  public Balances expiredBeforeUsing(BigDecimal expiredBeforeUsing) {
    this.expiredBeforeUsing = expiredBeforeUsing;
    return this;
  }

  /**
   * The number of days until the balance expires.
   * @return expiredBeforeUsing
   **/
  @Schema(description = "The number of days until the balance expires.")
  
    @Valid
    public BigDecimal getExpiredBeforeUsing() {
    return expiredBeforeUsing;
  }

  public void setExpiredBeforeUsing(BigDecimal expiredBeforeUsing) {
    this.expiredBeforeUsing = expiredBeforeUsing;
  }

  public Balances subBalances(List<SubBalances> subBalances) {
    this.subBalances = subBalances;
    return this;
  }

  public Balances addSubBalancesItem(SubBalances subBalancesItem) {
    if (this.subBalances == null) {
      this.subBalances = new ArrayList<SubBalances>();
    }
    this.subBalances.add(subBalancesItem);
    return this;
  }

  /**
   * The list of sub-balances associated with the balance.
   * @return subBalances
   **/
  @Schema(description = "The list of sub-balances associated with the balance.")
      @Valid
    public List<SubBalances> getSubBalances() {
    return subBalances;
  }

  public void setSubBalances(List<SubBalances> subBalances) {
    this.subBalances = subBalances;
  }

  public Balances outstandingAmount(BigDecimal outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
    return this;
  }

  /**
   * An amount that the customer still owes, for loans or when they exceed their credit limit.
   * @return outstandingAmount
   **/
  @Schema(required = true, description = "An amount that the customer still owes, for loans or when they exceed their credit limit.")
      @NotNull

    @Valid
    public BigDecimal getOutstandingAmount() {
    return outstandingAmount;
  }

  public void setOutstandingAmount(BigDecimal outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
  }

  public Balances loanThresholds(Integer loanThresholds) {
    this.loanThresholds = loanThresholds;
    return this;
  }

  /**
   * The percent-based threshold for offering a loan. If the customer's balance falls below this percent, they are notified and offered a loan.
   * @return loanThresholds
   **/
  @Schema(description = "The percent-based threshold for offering a loan. If the customer's balance falls below this percent, they are notified and offered a loan.")
  
    public Integer getLoanThresholds() {
    return loanThresholds;
  }

  public void setLoanThresholds(Integer loanThresholds) {
    this.loanThresholds = loanThresholds;
  }

  public Balances loanThresholdsFixed(String loanThresholdsFixed) {
    this.loanThresholdsFixed = loanThresholdsFixed;
    return this;
  }

  /**
   * The fixed amount threshold for offering a loan. If the customer's balance falls below this amount, they are notified and offered a loan.
   * @return loanThresholdsFixed
   **/
  @Schema(description = "The fixed amount threshold for offering a loan. If the customer's balance falls below this amount, they are notified and offered a loan.")
  
    public String getLoanThresholdsFixed() {
    return loanThresholdsFixed;
  }

  public void setLoanThresholdsFixed(String loanThresholdsFixed) {
    this.loanThresholdsFixed = loanThresholdsFixed;
  }

  public Balances tempCreditLimit(List<TempCreditLimit> tempCreditLimit) {
    this.tempCreditLimit = tempCreditLimit;
    return this;
  }

  public Balances addTempCreditLimitItem(TempCreditLimit tempCreditLimitItem) {
    if (this.tempCreditLimit == null) {
      this.tempCreditLimit = new ArrayList<TempCreditLimit>();
    }
    this.tempCreditLimit.add(tempCreditLimitItem);
    return this;
  }

  /**
   * The temporary credit limit, used when a loan has been granted or credit limit breach has been allowed.
   * @return tempCreditLimit
   **/
  @Schema(description = "The temporary credit limit, used when a loan has been granted or credit limit breach has been allowed.")
      @Valid
    public List<TempCreditLimit> getTempCreditLimit() {
    return tempCreditLimit;
  }

  public void setTempCreditLimit(List<TempCreditLimit> tempCreditLimit) {
    this.tempCreditLimit = tempCreditLimit;
  }

  public Balances resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The resource ID associated with the balance.
   * @return resourceId
   **/
  @Schema(description = "The resource ID associated with the balance.")
  
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
    Balances balances = (Balances) o;
    return Objects.equals(this.modifyLimit, balances.modifyLimit) &&
        Objects.equals(this.currentBalance, balances.currentBalance) &&
        Objects.equals(this.creditFloor, balances.creditFloor) &&
        Objects.equals(this.creditLimit, balances.creditLimit) &&
        Objects.equals(this.creditThresholds, balances.creditThresholds) &&
        Objects.equals(this.formattedCreditThresholds, balances.formattedCreditThresholds) &&
        Objects.equals(this.creditThresholdsFixed, balances.creditThresholdsFixed) &&
        Objects.equals(this.expiredBeforeUsing, balances.expiredBeforeUsing) &&
        Objects.equals(this.subBalances, balances.subBalances) &&
        Objects.equals(this.outstandingAmount, balances.outstandingAmount) &&
        Objects.equals(this.loanThresholds, balances.loanThresholds) &&
        Objects.equals(this.loanThresholdsFixed, balances.loanThresholdsFixed) &&
        Objects.equals(this.tempCreditLimit, balances.tempCreditLimit) &&
        Objects.equals(this.resourceId, balances.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifyLimit, currentBalance, creditFloor, creditLimit, creditThresholds, formattedCreditThresholds, creditThresholdsFixed, expiredBeforeUsing, subBalances, outstandingAmount, loanThresholds, loanThresholdsFixed, tempCreditLimit, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balances {\n");
    
    sb.append("    modifyLimit: ").append(toIndentedString(modifyLimit)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    creditFloor: ").append(toIndentedString(creditFloor)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    creditThresholds: ").append(toIndentedString(creditThresholds)).append("\n");
    sb.append("    formattedCreditThresholds: ").append(toIndentedString(formattedCreditThresholds)).append("\n");
    sb.append("    creditThresholdsFixed: ").append(toIndentedString(creditThresholdsFixed)).append("\n");
    sb.append("    expiredBeforeUsing: ").append(toIndentedString(expiredBeforeUsing)).append("\n");
    sb.append("    subBalances: ").append(toIndentedString(subBalances)).append("\n");
    sb.append("    outstandingAmount: ").append(toIndentedString(outstandingAmount)).append("\n");
    sb.append("    loanThresholds: ").append(toIndentedString(loanThresholds)).append("\n");
    sb.append("    loanThresholdsFixed: ").append(toIndentedString(loanThresholdsFixed)).append("\n");
    sb.append("    tempCreditLimit: ").append(toIndentedString(tempCreditLimit)).append("\n");
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
