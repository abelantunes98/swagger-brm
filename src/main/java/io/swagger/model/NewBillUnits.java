package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BalanceGroup;
import io.swagger.model.PaymentMethod;
import io.swagger.model.ResourceRef;
import io.swagger.model.ServiceGroupIndex;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of new bill units.
 */
@Schema(description = "The list of new bill units.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class NewBillUnits   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("forServiceGroup")
  @Valid
  private List<ServiceGroupIndex> forServiceGroup = new ArrayList<ServiceGroupIndex>();

  @JsonProperty("walletPaymentInstrumentIndex")
  private Integer walletPaymentInstrumentIndex = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("accountingCycleDom")
  private Integer accountingCycleDom = null;

  @JsonProperty("paymentType")
  private Integer paymentType = null;

  @JsonProperty("paymentMethod")
  private PaymentMethod paymentMethod = null;

  @JsonProperty("paymentMethodId")
  private String paymentMethodId = null;

  @JsonProperty("accountingType")
  private Integer accountingType = null;

  @JsonProperty("billingFrequencyInMonths")
  private Integer billingFrequencyInMonths = null;

  @JsonProperty("segment")
  private Integer segment = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("arBillUnitRef")
  private ResourceRef arBillUnitRef = null;

  @JsonProperty("parentBillUnitRef")
  private ResourceRef parentBillUnitRef = null;

  @JsonProperty("parentRef")
  private String parentRef = null;

  @JsonProperty("balanceGroups")
  @Valid
  private List<BalanceGroup> balanceGroups = null;

  public NewBillUnits name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the bill unit.
   * @return name
   **/
  @Schema(description = "The name of the bill unit.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewBillUnits forServiceGroup(List<ServiceGroupIndex> forServiceGroup) {
    this.forServiceGroup = forServiceGroup;
    return this;
  }

  public NewBillUnits addForServiceGroupItem(ServiceGroupIndex forServiceGroupItem) {
    this.forServiceGroup.add(forServiceGroupItem);
    return this;
  }

  /**
   * The list of service groups associated with the bill unit.
   * @return forServiceGroup
   **/
  @Schema(required = true, description = "The list of service groups associated with the bill unit.")
      @NotNull
    @Valid
    public List<ServiceGroupIndex> getForServiceGroup() {
    return forServiceGroup;
  }

  public void setForServiceGroup(List<ServiceGroupIndex> forServiceGroup) {
    this.forServiceGroup = forServiceGroup;
  }

  public NewBillUnits walletPaymentInstrumentIndex(Integer walletPaymentInstrumentIndex) {
    this.walletPaymentInstrumentIndex = walletPaymentInstrumentIndex;
    return this;
  }

  /**
   * The wallet index number for the payment instrument associated with the bill unit.
   * @return walletPaymentInstrumentIndex
   **/
  @Schema(description = "The wallet index number for the payment instrument associated with the bill unit.")
  
    public Integer getWalletPaymentInstrumentIndex() {
    return walletPaymentInstrumentIndex;
  }

  public void setWalletPaymentInstrumentIndex(Integer walletPaymentInstrumentIndex) {
    this.walletPaymentInstrumentIndex = walletPaymentInstrumentIndex;
  }

  public NewBillUnits effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the bill unit takes effect.
   * @return effectiveDate
   **/
  @Schema(description = "The date and time the bill unit takes effect.")
  
    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public NewBillUnits currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The primary currency of the bill unit.
   * @return currency
   **/
  @Schema(description = "The primary currency of the bill unit.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public NewBillUnits accountingCycleDom(Integer accountingCycleDom) {
    this.accountingCycleDom = accountingCycleDom;
    return this;
  }

  /**
   * The accounting cycle day of month (DOM).
   * @return accountingCycleDom
   **/
  @Schema(description = "The accounting cycle day of month (DOM).")
  
    public Integer getAccountingCycleDom() {
    return accountingCycleDom;
  }

  public void setAccountingCycleDom(Integer accountingCycleDom) {
    this.accountingCycleDom = accountingCycleDom;
  }

  public NewBillUnits paymentType(Integer paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The payment type. Can be one of the following: <ul><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>
   * @return paymentType
   **/
  @Schema(description = "The payment type. Can be one of the following: <ul><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>")
  
    public Integer getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Integer paymentType) {
    this.paymentType = paymentType;
  }

  public NewBillUnits paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   **/
  @Schema(description = "")
  
    @Valid
    public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public NewBillUnits paymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

  /**
   * The ID of the payment method.
   * @return paymentMethodId
   **/
  @Schema(description = "The ID of the payment method.")
  
    public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public NewBillUnits accountingType(Integer accountingType) {
    this.accountingType = accountingType;
    return this;
  }

  /**
   * The accounting type. Can be one of the following: <ul><li><b>1</b>: Open item</li><li><b>2</b>: Balance forward</li></ul>
   * @return accountingType
   **/
  @Schema(description = "The accounting type. Can be one of the following: <ul><li><b>1</b>: Open item</li><li><b>2</b>: Balance forward</li></ul>")
  
    public Integer getAccountingType() {
    return accountingType;
  }

  public void setAccountingType(Integer accountingType) {
    this.accountingType = accountingType;
  }

  public NewBillUnits billingFrequencyInMonths(Integer billingFrequencyInMonths) {
    this.billingFrequencyInMonths = billingFrequencyInMonths;
    return this;
  }

  /**
   * The billing frequency in number of months. Can be one of the following: <ul><li><b>1</b>: Monthly</li><li><b>2</b>: Bi-monthly</li><li><b>3</b>: Quarterly</li><li><b>12</b>: Yearly</li></ul>
   * @return billingFrequencyInMonths
   **/
  @Schema(description = "The billing frequency in number of months. Can be one of the following: <ul><li><b>1</b>: Monthly</li><li><b>2</b>: Bi-monthly</li><li><b>3</b>: Quarterly</li><li><b>12</b>: Yearly</li></ul>")
  
    public Integer getBillingFrequencyInMonths() {
    return billingFrequencyInMonths;
  }

  public void setBillingFrequencyInMonths(Integer billingFrequencyInMonths) {
    this.billingFrequencyInMonths = billingFrequencyInMonths;
  }

  public NewBillUnits segment(Integer segment) {
    this.segment = segment;
    return this;
  }

  /**
   * The customer segment associated with the bill unit. A customer segment is a user-defined customer description that can be used to group accounts according to customer billing and payment practices.
   * @return segment
   **/
  @Schema(description = "The customer segment associated with the bill unit. A customer segment is a user-defined customer description that can be used to group accounts according to customer billing and payment practices.")
  
    public Integer getSegment() {
    return segment;
  }

  public void setSegment(Integer segment) {
    this.segment = segment;
  }

  public NewBillUnits status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the bill unit, such as active, inactive, or closed.
   * @return status
   **/
  @Schema(description = "The status of the bill unit, such as active, inactive, or closed.")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NewBillUnits arBillUnitRef(ResourceRef arBillUnitRef) {
    this.arBillUnitRef = arBillUnitRef;
    return this;
  }

  /**
   * Get arBillUnitRef
   * @return arBillUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getArBillUnitRef() {
    return arBillUnitRef;
  }

  public void setArBillUnitRef(ResourceRef arBillUnitRef) {
    this.arBillUnitRef = arBillUnitRef;
  }

  public NewBillUnits parentBillUnitRef(ResourceRef parentBillUnitRef) {
    this.parentBillUnitRef = parentBillUnitRef;
    return this;
  }

  /**
   * Get parentBillUnitRef
   * @return parentBillUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getParentBillUnitRef() {
    return parentBillUnitRef;
  }

  public void setParentBillUnitRef(ResourceRef parentBillUnitRef) {
    this.parentBillUnitRef = parentBillUnitRef;
  }

  public NewBillUnits parentRef(String parentRef) {
    this.parentRef = parentRef;
    return this;
  }

  /**
   * A reference to the parent.
   * @return parentRef
   **/
  @Schema(description = "A reference to the parent.")
  
    public String getParentRef() {
    return parentRef;
  }

  public void setParentRef(String parentRef) {
    this.parentRef = parentRef;
  }

  public NewBillUnits balanceGroups(List<BalanceGroup> balanceGroups) {
    this.balanceGroups = balanceGroups;
    return this;
  }

  public NewBillUnits addBalanceGroupsItem(BalanceGroup balanceGroupsItem) {
    if (this.balanceGroups == null) {
      this.balanceGroups = new ArrayList<BalanceGroup>();
    }
    this.balanceGroups.add(balanceGroupsItem);
    return this;
  }

  /**
   * The list of balance groups associated with the bill unit.
   * @return balanceGroups
   **/
  @Schema(description = "The list of balance groups associated with the bill unit.")
      @Valid
    public List<BalanceGroup> getBalanceGroups() {
    return balanceGroups;
  }

  public void setBalanceGroups(List<BalanceGroup> balanceGroups) {
    this.balanceGroups = balanceGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBillUnits newBillUnits = (NewBillUnits) o;
    return Objects.equals(this.name, newBillUnits.name) &&
        Objects.equals(this.forServiceGroup, newBillUnits.forServiceGroup) &&
        Objects.equals(this.walletPaymentInstrumentIndex, newBillUnits.walletPaymentInstrumentIndex) &&
        Objects.equals(this.effectiveDate, newBillUnits.effectiveDate) &&
        Objects.equals(this.currency, newBillUnits.currency) &&
        Objects.equals(this.accountingCycleDom, newBillUnits.accountingCycleDom) &&
        Objects.equals(this.paymentType, newBillUnits.paymentType) &&
        Objects.equals(this.paymentMethod, newBillUnits.paymentMethod) &&
        Objects.equals(this.paymentMethodId, newBillUnits.paymentMethodId) &&
        Objects.equals(this.accountingType, newBillUnits.accountingType) &&
        Objects.equals(this.billingFrequencyInMonths, newBillUnits.billingFrequencyInMonths) &&
        Objects.equals(this.segment, newBillUnits.segment) &&
        Objects.equals(this.status, newBillUnits.status) &&
        Objects.equals(this.arBillUnitRef, newBillUnits.arBillUnitRef) &&
        Objects.equals(this.parentBillUnitRef, newBillUnits.parentBillUnitRef) &&
        Objects.equals(this.parentRef, newBillUnits.parentRef) &&
        Objects.equals(this.balanceGroups, newBillUnits.balanceGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, forServiceGroup, walletPaymentInstrumentIndex, effectiveDate, currency, accountingCycleDom, paymentType, paymentMethod, paymentMethodId, accountingType, billingFrequencyInMonths, segment, status, arBillUnitRef, parentBillUnitRef, parentRef, balanceGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBillUnits {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    forServiceGroup: ").append(toIndentedString(forServiceGroup)).append("\n");
    sb.append("    walletPaymentInstrumentIndex: ").append(toIndentedString(walletPaymentInstrumentIndex)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountingCycleDom: ").append(toIndentedString(accountingCycleDom)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    accountingType: ").append(toIndentedString(accountingType)).append("\n");
    sb.append("    billingFrequencyInMonths: ").append(toIndentedString(billingFrequencyInMonths)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    arBillUnitRef: ").append(toIndentedString(arBillUnitRef)).append("\n");
    sb.append("    parentBillUnitRef: ").append(toIndentedString(parentBillUnitRef)).append("\n");
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
    sb.append("    balanceGroups: ").append(toIndentedString(balanceGroups)).append("\n");
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
