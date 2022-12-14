package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositReversal
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositReversal   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("completedAt")
  private String completedAt = null;

  /**
   * The status.
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

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("error")
  private String error = null;

  public DepositReversal id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit reversal ID.
   * @return id
   **/
  @Schema(description = "The deposit reversal ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositReversal href(String href) {
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

  public DepositReversal createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit reversal is initiated.
   * @return createdAt
   **/
  @Schema(description = "The date when the deposit reversal is initiated.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositReversal completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The deposit reversal completion date.
   * @return completedAt
   **/
  @Schema(description = "The deposit reversal completion date.")
  
    public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public DepositReversal status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status.
   * @return status
   **/
  @Schema(description = "The status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DepositReversal customerRef(String customerRef) {
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

  public DepositReversal customerDepositRef(String customerDepositRef) {
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

  public DepositReversal notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes about the deposit reversal.
   * @return notes
   **/
  @Schema(description = "Notes about the deposit reversal.")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DepositReversal reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the deposit reversal.
   * @return reason
   **/
  @Schema(description = "Reason for the deposit reversal.")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DepositReversal error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message for the deposit reversal.
   * @return error
   **/
  @Schema(description = "Error message for the deposit reversal.")
  
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
    DepositReversal depositReversal = (DepositReversal) o;
    return Objects.equals(this.id, depositReversal.id) &&
        Objects.equals(this.href, depositReversal.href) &&
        Objects.equals(this.createdAt, depositReversal.createdAt) &&
        Objects.equals(this.completedAt, depositReversal.completedAt) &&
        Objects.equals(this.status, depositReversal.status) &&
        Objects.equals(this.customerRef, depositReversal.customerRef) &&
        Objects.equals(this.customerDepositRef, depositReversal.customerDepositRef) &&
        Objects.equals(this.notes, depositReversal.notes) &&
        Objects.equals(this.reason, depositReversal.reason) &&
        Objects.equals(this.error, depositReversal.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, completedAt, status, customerRef, customerDepositRef, notes, reason, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositReversal {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    customerDepositRef: ").append(toIndentedString(customerDepositRef)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
