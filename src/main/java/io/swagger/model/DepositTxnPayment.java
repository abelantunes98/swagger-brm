package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositTxnPayment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositTxnPayment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("completedAt")
  private String completedAt = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("paymentAmount")
  private Money paymentAmount = null;

  @JsonProperty("customerRef")
  private Integer customerRef = null;

  @JsonProperty("customerDepositRef")
  private String customerDepositRef = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("paymentMethodType")
  private String paymentMethodType = null;

  @JsonProperty("paymentRef")
  private String paymentRef = null;

  @JsonProperty("glCode")
  private String glCode = null;

  public DepositTxnPayment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit payment ID.
   * @return id
   **/
  @Schema(required = true, description = "The deposit payment ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositTxnPayment href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL, used to get the deposit payment
   * @return href
   **/
  @Schema(required = true, description = "The unique resource URL, used to get the deposit payment")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public DepositTxnPayment createdAt(String createdAt) {
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

  public DepositTxnPayment completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The date when the deposit payment is completed.
   * @return completedAt
   **/
  @Schema(required = true, description = "The date when the deposit payment is completed.")
      @NotNull

    public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public DepositTxnPayment status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the deposit payment.
   * @return status
   **/
  @Schema(required = true, description = "The status of the deposit payment.")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DepositTxnPayment paymentAmount(Money paymentAmount) {
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

  public DepositTxnPayment customerRef(Integer customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * The customer reference.
   * @return customerRef
   **/
  @Schema(required = true, description = "The customer reference.")
      @NotNull

    public Integer getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(Integer customerRef) {
    this.customerRef = customerRef;
  }

  public DepositTxnPayment customerDepositRef(String customerDepositRef) {
    this.customerDepositRef = customerDepositRef;
    return this;
  }

  /**
   * The deposit reference
   * @return customerDepositRef
   **/
  @Schema(required = true, description = "The deposit reference")
      @NotNull

    public String getCustomerDepositRef() {
    return customerDepositRef;
  }

  public void setCustomerDepositRef(String customerDepositRef) {
    this.customerDepositRef = customerDepositRef;
  }

  public DepositTxnPayment notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * The notes for the deposit payment.
   * @return notes
   **/
  @Schema(required = true, description = "The notes for the deposit payment.")
      @NotNull

    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DepositTxnPayment paymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

  /**
   * The payment method type for deposit payment.
   * @return paymentMethodType
   **/
  @Schema(required = true, description = "The payment method type for deposit payment.")
      @NotNull

    public String getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public DepositTxnPayment paymentRef(String paymentRef) {
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

  public DepositTxnPayment glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

  /**
   * The glcode for deposit payment.
   * @return glCode
   **/
  @Schema(required = true, description = "The glcode for deposit payment.")
      @NotNull

    public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTxnPayment depositTxnPayment = (DepositTxnPayment) o;
    return Objects.equals(this.id, depositTxnPayment.id) &&
        Objects.equals(this.href, depositTxnPayment.href) &&
        Objects.equals(this.createdAt, depositTxnPayment.createdAt) &&
        Objects.equals(this.completedAt, depositTxnPayment.completedAt) &&
        Objects.equals(this.status, depositTxnPayment.status) &&
        Objects.equals(this.paymentAmount, depositTxnPayment.paymentAmount) &&
        Objects.equals(this.customerRef, depositTxnPayment.customerRef) &&
        Objects.equals(this.customerDepositRef, depositTxnPayment.customerDepositRef) &&
        Objects.equals(this.notes, depositTxnPayment.notes) &&
        Objects.equals(this.paymentMethodType, depositTxnPayment.paymentMethodType) &&
        Objects.equals(this.paymentRef, depositTxnPayment.paymentRef) &&
        Objects.equals(this.glCode, depositTxnPayment.glCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, completedAt, status, paymentAmount, customerRef, customerDepositRef, notes, paymentMethodType, paymentRef, glCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTxnPayment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    customerDepositRef: ").append(toIndentedString(customerDepositRef)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentRef: ").append(toIndentedString(paymentRef)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
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
