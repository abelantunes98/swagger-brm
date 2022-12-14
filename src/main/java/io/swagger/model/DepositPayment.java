package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The customer deposit payment reference.
 */
@Schema(description = "The customer deposit payment reference.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositPayment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("completedAt")
  private String completedAt = null;

  /**
   * The deposit payment status.
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    PENDING("PENDING");

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

  @JsonProperty("customerDepositRef")
  private String customerDepositRef = null;

  @JsonProperty("paymentAmount")
  private Money paymentAmount = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("glCode")
  private String glCode = null;

  /**
   * The payment method type.
   */
  public enum PaymentMethodTypeEnum {
    CASH("CASH"),
    
    CREDITCARD("CREDITCARD"),
    
    CHECK("CHECK"),
    
    PREPAYMENT("PREPAYMENT"),
    
    OTHER("OTHER");

    private String value;

    PaymentMethodTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodTypeEnum fromValue(String text) {
      for (PaymentMethodTypeEnum b : PaymentMethodTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("paymentMethodType")
  private PaymentMethodTypeEnum paymentMethodType = null;

  @JsonProperty("paymentRef")
  private String paymentRef = null;

  public DepositPayment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit payment ID.
   * @return id
   **/
  @Schema(description = "The deposit payment ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositPayment href(String href) {
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

  public DepositPayment createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit payment is created.
   * @return createdAt
   **/
  @Schema(description = "The date when the deposit payment is created.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositPayment completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The deposit payment completion date.
   * @return completedAt
   **/
  @Schema(description = "The deposit payment completion date.")
  
    public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public DepositPayment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The deposit payment status.
   * @return status
   **/
  @Schema(description = "The deposit payment status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DepositPayment customerRef(String customerRef) {
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

  public DepositPayment customerDepositRef(String customerDepositRef) {
    this.customerDepositRef = customerDepositRef;
    return this;
  }

  /**
   * The customer deposit reference.
   * @return customerDepositRef
   **/
  @Schema(required = true, description = "The customer deposit reference.")
      @NotNull

    public String getCustomerDepositRef() {
    return customerDepositRef;
  }

  public void setCustomerDepositRef(String customerDepositRef) {
    this.customerDepositRef = customerDepositRef;
  }

  public DepositPayment paymentAmount(Money paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * Get paymentAmount
   * @return paymentAmount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Money getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(Money paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public DepositPayment notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes about the deposit payment.
   * @return notes
   **/
  @Schema(description = "Notes about the deposit payment.")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DepositPayment glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

  /**
   * The general ledger ID.
   * @return glCode
   **/
  @Schema(description = "The general ledger ID.")
  
    public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }

  public DepositPayment paymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * The payment method type.
   * @return paymentMethodType
   **/
  @Schema(description = "The payment method type.")
  
    public PaymentMethodTypeEnum getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public DepositPayment paymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

  /**
   * The payment reference.
   * @return paymentRef
   **/
  @Schema(required = true, description = "The payment reference.")
      @NotNull

    public String getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(String paymentRef) {
    this.paymentRef = paymentRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositPayment depositPayment = (DepositPayment) o;
    return Objects.equals(this.id, depositPayment.id) &&
        Objects.equals(this.href, depositPayment.href) &&
        Objects.equals(this.createdAt, depositPayment.createdAt) &&
        Objects.equals(this.completedAt, depositPayment.completedAt) &&
        Objects.equals(this.status, depositPayment.status) &&
        Objects.equals(this.customerRef, depositPayment.customerRef) &&
        Objects.equals(this.customerDepositRef, depositPayment.customerDepositRef) &&
        Objects.equals(this.paymentAmount, depositPayment.paymentAmount) &&
        Objects.equals(this.notes, depositPayment.notes) &&
        Objects.equals(this.glCode, depositPayment.glCode) &&
        Objects.equals(this.paymentMethodType, depositPayment.paymentMethodType) &&
        Objects.equals(this.paymentRef, depositPayment.paymentRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, completedAt, status, customerRef, customerDepositRef, paymentAmount, notes, glCode, paymentMethodType, paymentRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositPayment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    customerDepositRef: ").append(toIndentedString(customerDepositRef)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentRef: ").append(toIndentedString(paymentRef)).append("\n");
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
