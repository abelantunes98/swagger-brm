package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.CustomerDepositTransactions;
import io.swagger.model.Money;
import io.swagger.model.TimePeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The customer deposit.
 */
@Schema(description = "The customer deposit.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomerDeposit   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("modifiedAt")
  private String modifiedAt = null;

  @JsonProperty("effectiveDate")
  private String effectiveDate = null;

  @JsonProperty("code")
  private String code = null;

  /**
   * The deposit status. Select the available status.
   */
  public enum StatusEnum {
    WAITING("WAITING"),
    
    ACTIVE("ACTIVE"),
    
    EXPIRED("EXPIRED"),
    
    TRANSFERRED("TRANSFERRED"),
    
    RELEASED("RELEASED"),
    
    REFUNDED("REFUNDED"),
    
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  @JsonProperty("serviceRef")
  private String serviceRef = null;

  @JsonProperty("billProfileRef")
  private String billProfileRef = null;

  @JsonProperty("DepositSpecRef")
  private String depositSpecRef = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("totalAmount")
  private Money totalAmount = null;

  @JsonProperty("receivedAmount")
  private Money receivedAmount = null;

  @JsonProperty("releasedAmount")
  private Money releasedAmount = null;

  @JsonProperty("interestAmount")
  private Money interestAmount = null;

  @JsonProperty("balanceAmount")
  private Money balanceAmount = null;

  /**
   * The release type.
   */
  public enum ReleaseTypeEnum {
    PREPAYMENT("PREPAYMENT"),
    
    REFUND("REFUND"),
    
    OTHER("OTHER");

    private String value;

    ReleaseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReleaseTypeEnum fromValue(String text) {
      for (ReleaseTypeEnum b : ReleaseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("releaseType")
  private ReleaseTypeEnum releaseType = ReleaseTypeEnum.PREPAYMENT;

  @JsonProperty("discountAmount")
  private Money discountAmount = null;

  /**
   * The discount type.
   */
  public enum DiscountTypeEnum {
    PERCENTAGE("PERCENTAGE"),
    
    FLAT("FLAT");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DiscountTypeEnum fromValue(String text) {
      for (DiscountTypeEnum b : DiscountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("discountType")
  private DiscountTypeEnum discountType = null;

  @JsonProperty("transactions")
  @Valid
  private List<CustomerDepositTransactions> transactions = null;

  public CustomerDeposit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The customer deposit ID.
   * @return id
   **/
  @Schema(description = "The customer deposit ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerDeposit href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL, used to get the object.
   * @return href
   **/
  @Schema(description = "The unique resource URL, used to get the object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CustomerDeposit createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the customer deposit is created.
   * @return createdAt
   **/
  @Schema(description = "The date when the customer deposit is created.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public CustomerDeposit modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date when the customer deposit is modified.
   * @return modifiedAt
   **/
  @Schema(description = "The date when the customer deposit is modified.")
  
    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public CustomerDeposit effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date from which the customer deposit is effective.
   * @return effectiveDate
   **/
  @Schema(description = "The date from which the customer deposit is effective.")
  
    public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public CustomerDeposit code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The external identifier.
   * @return code
   **/
  @Schema(description = "The external identifier.")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CustomerDeposit status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The deposit status. Select the available status.
   * @return status
   **/
  @Schema(description = "The deposit status. Select the available status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CustomerDeposit customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * The customer reference.
   * @return customerRef
   **/
  @Schema(required = true, description = "The customer reference.")
      @NotNull

    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  public CustomerDeposit serviceRef(String serviceRef) {
    this.serviceRef = serviceRef;
    return this;
  }

  /**
   * The service reference.
   * @return serviceRef
   **/
  @Schema(description = "The service reference.")
  
    public String getServiceRef() {
    return serviceRef;
  }

  public void setServiceRef(String serviceRef) {
    this.serviceRef = serviceRef;
  }

  public CustomerDeposit billProfileRef(String billProfileRef) {
    this.billProfileRef = billProfileRef;
    return this;
  }

  /**
   * The bill profile reference.
   * @return billProfileRef
   **/
  @Schema(description = "The bill profile reference.")
  
    public String getBillProfileRef() {
    return billProfileRef;
  }

  public void setBillProfileRef(String billProfileRef) {
    this.billProfileRef = billProfileRef;
  }

  public CustomerDeposit depositSpecRef(String depositSpecRef) {
    this.depositSpecRef = depositSpecRef;
    return this;
  }

  /**
   * The deposit specification reference.
   * @return depositSpecRef
   **/
  @Schema(required = true, description = "The deposit specification reference.")
      @NotNull

    public String getDepositSpecRef() {
    return depositSpecRef;
  }

  public void setDepositSpecRef(String depositSpecRef) {
    this.depositSpecRef = depositSpecRef;
  }

  public CustomerDeposit validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   **/
  @Schema(description = "")
  
    @Valid
    public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public CustomerDeposit totalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Money getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
  }

  public CustomerDeposit receivedAmount(Money receivedAmount) {
    this.receivedAmount = receivedAmount;
    return this;
  }

  /**
   * Get receivedAmount
   * @return receivedAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getReceivedAmount() {
    return receivedAmount;
  }

  public void setReceivedAmount(Money receivedAmount) {
    this.receivedAmount = receivedAmount;
  }

  public CustomerDeposit releasedAmount(Money releasedAmount) {
    this.releasedAmount = releasedAmount;
    return this;
  }

  /**
   * Get releasedAmount
   * @return releasedAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getReleasedAmount() {
    return releasedAmount;
  }

  public void setReleasedAmount(Money releasedAmount) {
    this.releasedAmount = releasedAmount;
  }

  public CustomerDeposit interestAmount(Money interestAmount) {
    this.interestAmount = interestAmount;
    return this;
  }

  /**
   * Get interestAmount
   * @return interestAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getInterestAmount() {
    return interestAmount;
  }

  public void setInterestAmount(Money interestAmount) {
    this.interestAmount = interestAmount;
  }

  public CustomerDeposit balanceAmount(Money balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

  /**
   * Get balanceAmount
   * @return balanceAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(Money balanceAmount) {
    this.balanceAmount = balanceAmount;
  }

  public CustomerDeposit releaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
    return this;
  }

  /**
   * The release type.
   * @return releaseType
   **/
  @Schema(description = "The release type.")
  
    public ReleaseTypeEnum getReleaseType() {
    return releaseType;
  }

  public void setReleaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
  }

  public CustomerDeposit discountAmount(Money discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount
   * @return discountAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Money discountAmount) {
    this.discountAmount = discountAmount;
  }

  public CustomerDeposit discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * The discount type.
   * @return discountType
   **/
  @Schema(description = "The discount type.")
  
    public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public CustomerDeposit transactions(List<CustomerDepositTransactions> transactions) {
    this.transactions = transactions;
    return this;
  }

  public CustomerDeposit addTransactionsItem(CustomerDepositTransactions transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<CustomerDepositTransactions>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
   **/
  @Schema(description = "")
      @Valid
    public List<CustomerDepositTransactions> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<CustomerDepositTransactions> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDeposit customerDeposit = (CustomerDeposit) o;
    return Objects.equals(this.id, customerDeposit.id) &&
        Objects.equals(this.href, customerDeposit.href) &&
        Objects.equals(this.createdAt, customerDeposit.createdAt) &&
        Objects.equals(this.modifiedAt, customerDeposit.modifiedAt) &&
        Objects.equals(this.effectiveDate, customerDeposit.effectiveDate) &&
        Objects.equals(this.code, customerDeposit.code) &&
        Objects.equals(this.status, customerDeposit.status) &&
        Objects.equals(this.customerRef, customerDeposit.customerRef) &&
        Objects.equals(this.serviceRef, customerDeposit.serviceRef) &&
        Objects.equals(this.billProfileRef, customerDeposit.billProfileRef) &&
        Objects.equals(this.depositSpecRef, customerDeposit.depositSpecRef) &&
        Objects.equals(this.validFor, customerDeposit.validFor) &&
        Objects.equals(this.totalAmount, customerDeposit.totalAmount) &&
        Objects.equals(this.receivedAmount, customerDeposit.receivedAmount) &&
        Objects.equals(this.releasedAmount, customerDeposit.releasedAmount) &&
        Objects.equals(this.interestAmount, customerDeposit.interestAmount) &&
        Objects.equals(this.balanceAmount, customerDeposit.balanceAmount) &&
        Objects.equals(this.releaseType, customerDeposit.releaseType) &&
        Objects.equals(this.discountAmount, customerDeposit.discountAmount) &&
        Objects.equals(this.discountType, customerDeposit.discountType) &&
        Objects.equals(this.transactions, customerDeposit.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, modifiedAt, effectiveDate, code, status, customerRef, serviceRef, billProfileRef, depositSpecRef, validFor, totalAmount, receivedAmount, releasedAmount, interestAmount, balanceAmount, releaseType, discountAmount, discountType, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDeposit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    billProfileRef: ").append(toIndentedString(billProfileRef)).append("\n");
    sb.append("    depositSpecRef: ").append(toIndentedString(depositSpecRef)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    receivedAmount: ").append(toIndentedString(receivedAmount)).append("\n");
    sb.append("    releasedAmount: ").append(toIndentedString(releasedAmount)).append("\n");
    sb.append("    interestAmount: ").append(toIndentedString(interestAmount)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
