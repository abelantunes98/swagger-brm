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
 * The customer deposit refund.
 */
@Schema(description = "The customer deposit refund.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositRefund   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("completedAt")
  private String completedAt = null;

  /**
   * The deposit refund status.
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED"),
    
    PENDING("PENDING"),
    
    ACCEPTED("ACCEPTED"),
    
    REJECTED("REJECTED");

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

  @JsonProperty("refundAmount")
  private Money refundAmount = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("glCode")
  private String glCode = null;

  @JsonProperty("refundRef")
  private String refundRef = null;

  @JsonProperty("error")
  private String error = null;

  public DepositRefund id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit refund ID.
   * @return id
   **/
  @Schema(description = "The deposit refund ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositRefund href(String href) {
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

  public DepositRefund createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit refund is initiated.
   * @return createdAt
   **/
  @Schema(description = "The date when the deposit refund is initiated.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositRefund completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The deposit refund completion date.
   * @return completedAt
   **/
  @Schema(description = "The deposit refund completion date.")
  
    public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public DepositRefund status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The deposit refund status.
   * @return status
   **/
  @Schema(description = "The deposit refund status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DepositRefund customerRef(String customerRef) {
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

  public DepositRefund customerDepositRef(String customerDepositRef) {
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

  public DepositRefund refundAmount(Money refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  /**
   * Get refundAmount
   * @return refundAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Money refundAmount) {
    this.refundAmount = refundAmount;
  }

  public DepositRefund notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes about the deposit refund.
   * @return notes
   **/
  @Schema(description = "Notes about the deposit refund.")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DepositRefund reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the deposit refund.
   * @return reason
   **/
  @Schema(description = "Reason for the deposit refund.")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DepositRefund glCode(String glCode) {
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

  public DepositRefund refundRef(String refundRef) {
    this.refundRef = refundRef;
    return this;
  }

  /**
   * The deposit refund reference.
   * @return refundRef
   **/
  @Schema(description = "The deposit refund reference.")
  
    public String getRefundRef() {
    return refundRef;
  }

  public void setRefundRef(String refundRef) {
    this.refundRef = refundRef;
  }

  public DepositRefund error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message for the deposit refund.
   * @return error
   **/
  @Schema(description = "Error message for the deposit refund.")
  
    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositRefund depositRefund = (DepositRefund) o;
    return Objects.equals(this.id, depositRefund.id) &&
        Objects.equals(this.href, depositRefund.href) &&
        Objects.equals(this.createdAt, depositRefund.createdAt) &&
        Objects.equals(this.completedAt, depositRefund.completedAt) &&
        Objects.equals(this.status, depositRefund.status) &&
        Objects.equals(this.customerRef, depositRefund.customerRef) &&
        Objects.equals(this.customerDepositRef, depositRefund.customerDepositRef) &&
        Objects.equals(this.refundAmount, depositRefund.refundAmount) &&
        Objects.equals(this.notes, depositRefund.notes) &&
        Objects.equals(this.reason, depositRefund.reason) &&
        Objects.equals(this.glCode, depositRefund.glCode) &&
        Objects.equals(this.refundRef, depositRefund.refundRef) &&
        Objects.equals(this.error, depositRefund.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, completedAt, status, customerRef, customerDepositRef, refundAmount, notes, reason, glCode, refundRef, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositRefund {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    customerDepositRef: ").append(toIndentedString(customerDepositRef)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    refundRef: ").append(toIndentedString(refundRef)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
