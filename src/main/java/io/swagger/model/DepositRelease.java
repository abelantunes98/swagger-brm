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
 * DepositRelease
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositRelease   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("completedAt")
  private String completedAt = null;

  /**
   * The deposit release status.
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

  @JsonProperty("ReleaseAmount")
  private Money releaseAmount = null;

  /**
   * The deposit release type.
   */
  public enum ReleaseTypeEnum {
    PREPAYMENT("PREPAYMENT"),
    
    REFUND("REFUND");

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
  private ReleaseTypeEnum releaseType = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("glCode")
  private String glCode = null;

  @JsonProperty("releaseRef")
  private String releaseRef = null;

  @JsonProperty("error")
  private String error = null;

  public DepositRelease id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit reference ID.
   * @return id
   **/
  @Schema(description = "The deposit reference ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositRelease href(String href) {
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

  public DepositRelease createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit release is initiated.
   * @return createdAt
   **/
  @Schema(description = "The date when the deposit release is initiated.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositRelease completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The deposit release completion date.
   * @return completedAt
   **/
  @Schema(description = "The deposit release completion date.")
  
    public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public DepositRelease status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The deposit release status.
   * @return status
   **/
  @Schema(description = "The deposit release status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DepositRelease customerRef(String customerRef) {
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

  public DepositRelease customerDepositRef(String customerDepositRef) {
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

  public DepositRelease releaseAmount(Money releaseAmount) {
    this.releaseAmount = releaseAmount;
    return this;
  }

  /**
   * Get releaseAmount
   * @return releaseAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getReleaseAmount() {
    return releaseAmount;
  }

  public void setReleaseAmount(Money releaseAmount) {
    this.releaseAmount = releaseAmount;
  }

  public DepositRelease releaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
    return this;
  }

  /**
   * The deposit release type.
   * @return releaseType
   **/
  @Schema(description = "The deposit release type.")
  
    public ReleaseTypeEnum getReleaseType() {
    return releaseType;
  }

  public void setReleaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
  }

  public DepositRelease notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes about the deposit release.
   * @return notes
   **/
  @Schema(description = "Notes about the deposit release.")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DepositRelease reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the deposit release.
   * @return reason
   **/
  @Schema(description = "Reason for the deposit release.")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DepositRelease glCode(String glCode) {
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

  public DepositRelease releaseRef(String releaseRef) {
    this.releaseRef = releaseRef;
    return this;
  }

  /**
   * The deposit release reference.
   * @return releaseRef
   **/
  @Schema(description = "The deposit release reference.")
  
    public String getReleaseRef() {
    return releaseRef;
  }

  public void setReleaseRef(String releaseRef) {
    this.releaseRef = releaseRef;
  }

  public DepositRelease error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message for the deposit release.
   * @return error
   **/
  @Schema(description = "Error message for the deposit release.")
  
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
    DepositRelease depositRelease = (DepositRelease) o;
    return Objects.equals(this.id, depositRelease.id) &&
        Objects.equals(this.href, depositRelease.href) &&
        Objects.equals(this.createdAt, depositRelease.createdAt) &&
        Objects.equals(this.completedAt, depositRelease.completedAt) &&
        Objects.equals(this.status, depositRelease.status) &&
        Objects.equals(this.customerRef, depositRelease.customerRef) &&
        Objects.equals(this.customerDepositRef, depositRelease.customerDepositRef) &&
        Objects.equals(this.releaseAmount, depositRelease.releaseAmount) &&
        Objects.equals(this.releaseType, depositRelease.releaseType) &&
        Objects.equals(this.notes, depositRelease.notes) &&
        Objects.equals(this.reason, depositRelease.reason) &&
        Objects.equals(this.glCode, depositRelease.glCode) &&
        Objects.equals(this.releaseRef, depositRelease.releaseRef) &&
        Objects.equals(this.error, depositRelease.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, completedAt, status, customerRef, customerDepositRef, releaseAmount, releaseType, notes, reason, glCode, releaseRef, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositRelease {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    customerDepositRef: ").append(toIndentedString(customerDepositRef)).append("\n");
    sb.append("    releaseAmount: ").append(toIndentedString(releaseAmount)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    releaseRef: ").append(toIndentedString(releaseRef)).append("\n");
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
