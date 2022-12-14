package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentAuditDetailsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PaymentAuditDetailsType   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("paymentTypeEventRef")
  private ResourceRef paymentTypeEventRef = null;

  @JsonProperty("activityDate")
  private OffsetDateTime activityDate = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("paymentItemRef")
  private ResourceRef paymentItemRef = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("subTransactionId")
  private String subTransactionId = null;

  @JsonProperty("csrLoginId")
  private String csrLoginId = null;

  @JsonProperty("domainId")
  private Integer domainId = null;

  @JsonProperty("reasonId")
  private Integer reasonId = null;

  public PaymentAuditDetailsType extension(Object extension) {
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

  public PaymentAuditDetailsType paymentTypeEventRef(ResourceRef paymentTypeEventRef) {
    this.paymentTypeEventRef = paymentTypeEventRef;
    return this;
  }

  /**
   * Get paymentTypeEventRef
   * @return paymentTypeEventRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentTypeEventRef() {
    return paymentTypeEventRef;
  }

  public void setPaymentTypeEventRef(ResourceRef paymentTypeEventRef) {
    this.paymentTypeEventRef = paymentTypeEventRef;
  }

  public PaymentAuditDetailsType activityDate(OffsetDateTime activityDate) {
    this.activityDate = activityDate;
    return this;
  }

  /**
   * The date and time the payment activity occurred.
   * @return activityDate
   **/
  @Schema(required = true, description = "The date and time the payment activity occurred.")
      @NotNull

    @Valid
    public OffsetDateTime getActivityDate() {
    return activityDate;
  }

  public void setActivityDate(OffsetDateTime activityDate) {
    this.activityDate = activityDate;
  }

  public PaymentAuditDetailsType accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public PaymentAuditDetailsType paymentItemRef(ResourceRef paymentItemRef) {
    this.paymentItemRef = paymentItemRef;
    return this;
  }

  /**
   * Get paymentItemRef
   * @return paymentItemRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentItemRef() {
    return paymentItemRef;
  }

  public void setPaymentItemRef(ResourceRef paymentItemRef) {
    this.paymentItemRef = paymentItemRef;
  }

  public PaymentAuditDetailsType accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number.
   * @return accountNumber
   **/
  @Schema(description = "The account number.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public PaymentAuditDetailsType firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name associated with the account.
   * @return firstName
   **/
  @Schema(description = "The first name associated with the account.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PaymentAuditDetailsType lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name associated with the account.
   * @return lastName
   **/
  @Schema(description = "The last name associated with the account.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PaymentAuditDetailsType amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the payment.
   * @return amount
   **/
  @Schema(required = true, description = "The amount of the payment.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PaymentAuditDetailsType status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the payment. Successful payment statuses are 0 to 14. Suspended payment statuses are 15 to 29. Failed payment statuses are 30 to 44.
   * @return status
   **/
  @Schema(description = "The status of the payment. Successful payment statuses are 0 to 14. Suspended payment statuses are 15 to 29. Failed payment statuses are 30 to 44.")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PaymentAuditDetailsType transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The transaction ID.
   * @return transactionId
   **/
  @Schema(description = "The transaction ID.")
  
    public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PaymentAuditDetailsType subTransactionId(String subTransactionId) {
    this.subTransactionId = subTransactionId;
    return this;
  }

  /**
   * The subtransaction ID.
   * @return subTransactionId
   **/
  @Schema(description = "The subtransaction ID.")
  
    public String getSubTransactionId() {
    return subTransactionId;
  }

  public void setSubTransactionId(String subTransactionId) {
    this.subTransactionId = subTransactionId;
  }

  public PaymentAuditDetailsType csrLoginId(String csrLoginId) {
    this.csrLoginId = csrLoginId;
    return this;
  }

  /**
   * The CSR's login ID.
   * @return csrLoginId
   **/
  @Schema(description = "The CSR's login ID.")
  
    public String getCsrLoginId() {
    return csrLoginId;
  }

  public void setCsrLoginId(String csrLoginId) {
    this.csrLoginId = csrLoginId;
  }

  public PaymentAuditDetailsType domainId(Integer domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * The domain ID. 14 is for payment suspense management. 15 is for payment suspense action owners. 16 is for payment suspense reversals.
   * @return domainId
   **/
  @Schema(description = "The domain ID. 14 is for payment suspense management. 15 is for payment suspense action owners. 16 is for payment suspense reversals.")
  
    public Integer getDomainId() {
    return domainId;
  }

  public void setDomainId(Integer domainId) {
    this.domainId = domainId;
  }

  public PaymentAuditDetailsType reasonId(Integer reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  /**
   * The ID of the reason code.
   * @return reasonId
   **/
  @Schema(description = "The ID of the reason code.")
  
    public Integer getReasonId() {
    return reasonId;
  }

  public void setReasonId(Integer reasonId) {
    this.reasonId = reasonId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAuditDetailsType paymentAuditDetailsType = (PaymentAuditDetailsType) o;
    return Objects.equals(this.extension, paymentAuditDetailsType.extension) &&
        Objects.equals(this.paymentTypeEventRef, paymentAuditDetailsType.paymentTypeEventRef) &&
        Objects.equals(this.activityDate, paymentAuditDetailsType.activityDate) &&
        Objects.equals(this.accountRef, paymentAuditDetailsType.accountRef) &&
        Objects.equals(this.paymentItemRef, paymentAuditDetailsType.paymentItemRef) &&
        Objects.equals(this.accountNumber, paymentAuditDetailsType.accountNumber) &&
        Objects.equals(this.firstName, paymentAuditDetailsType.firstName) &&
        Objects.equals(this.lastName, paymentAuditDetailsType.lastName) &&
        Objects.equals(this.amount, paymentAuditDetailsType.amount) &&
        Objects.equals(this.status, paymentAuditDetailsType.status) &&
        Objects.equals(this.transactionId, paymentAuditDetailsType.transactionId) &&
        Objects.equals(this.subTransactionId, paymentAuditDetailsType.subTransactionId) &&
        Objects.equals(this.csrLoginId, paymentAuditDetailsType.csrLoginId) &&
        Objects.equals(this.domainId, paymentAuditDetailsType.domainId) &&
        Objects.equals(this.reasonId, paymentAuditDetailsType.reasonId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, paymentTypeEventRef, activityDate, accountRef, paymentItemRef, accountNumber, firstName, lastName, amount, status, transactionId, subTransactionId, csrLoginId, domainId, reasonId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAuditDetailsType {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    paymentTypeEventRef: ").append(toIndentedString(paymentTypeEventRef)).append("\n");
    sb.append("    activityDate: ").append(toIndentedString(activityDate)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    paymentItemRef: ").append(toIndentedString(paymentItemRef)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    subTransactionId: ").append(toIndentedString(subTransactionId)).append("\n");
    sb.append("    csrLoginId: ").append(toIndentedString(csrLoginId)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
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
