package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An installment cancellation request.
 */
@Schema(description = "An installment cancellation request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CancelInstallment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("completedAt")
  private OffsetDateTime completedAt = null;

  /**
   * The status.
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    PENDING("PENDING"),
    
    FAILED("FAILED");

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

  @JsonProperty("installmentRef")
  private String installmentRef = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("error")
  private String error = null;

  public CancelInstallment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the installment schedule to cancel.
   * @return id
   **/
  @Schema(description = "The ID of the installment schedule to cancel.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CancelInstallment href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL. Used for getting the object.
   * @return href
   **/
  @Schema(description = "The unique resource URL. Used for getting the object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CancelInstallment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date of creation.
   * @return createdAt
   **/
  @Schema(description = "The date of creation.")
  
    @Valid
    public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CancelInstallment completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The completion date and time of the operation.
   * @return completedAt
   **/
  @Schema(description = "The completion date and time of the operation.")
  
    @Valid
    public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public CancelInstallment status(StatusEnum status) {
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

  public CancelInstallment customerRef(String customerRef) {
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

  public CancelInstallment installmentRef(String installmentRef) {
    this.installmentRef = installmentRef;
    return this;
  }

  /**
   * The installment schedule reference.
   * @return installmentRef
   **/
  @Schema(required = true, description = "The installment schedule reference.")
      @NotNull

    public String getInstallmentRef() {
    return installmentRef;
  }

  public void setInstallmentRef(String installmentRef) {
    this.installmentRef = installmentRef;
  }

  public CancelInstallment notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes.
   * @return notes
   **/
  @Schema(description = "Notes.")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CancelInstallment reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for cancellation.
   * @return reason
   **/
  @Schema(required = true, description = "The reason for cancellation.")
      @NotNull

    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CancelInstallment error(String error) {
    this.error = error;
    return this;
  }

  /**
   * The error message for any details or corrective actions.
   * @return error
   **/
  @Schema(description = "The error message for any details or corrective actions.")
  
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
    CancelInstallment cancelInstallment = (CancelInstallment) o;
    return Objects.equals(this.id, cancelInstallment.id) &&
        Objects.equals(this.href, cancelInstallment.href) &&
        Objects.equals(this.createdAt, cancelInstallment.createdAt) &&
        Objects.equals(this.completedAt, cancelInstallment.completedAt) &&
        Objects.equals(this.status, cancelInstallment.status) &&
        Objects.equals(this.customerRef, cancelInstallment.customerRef) &&
        Objects.equals(this.installmentRef, cancelInstallment.installmentRef) &&
        Objects.equals(this.notes, cancelInstallment.notes) &&
        Objects.equals(this.reason, cancelInstallment.reason) &&
        Objects.equals(this.error, cancelInstallment.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, completedAt, status, customerRef, installmentRef, notes, reason, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInstallment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    installmentRef: ").append(toIndentedString(installmentRef)).append("\n");
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
