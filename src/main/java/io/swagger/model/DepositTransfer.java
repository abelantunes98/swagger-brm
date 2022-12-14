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
 * The deposit transfer.
 */
@Schema(description = "The deposit transfer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositTransfer   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("completedAt")
  private String completedAt = null;

  /**
   * The deposit transfer status.
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

  @JsonProperty("destCustomerRef")
  private String destCustomerRef = null;

  @JsonProperty("destServiceRef")
  private String destServiceRef = null;

  @JsonProperty("destBillProfileRef")
  private String destBillProfileRef = null;

  @JsonProperty("transferAmount")
  private Money transferAmount = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("glCode")
  private String glCode = null;

  @JsonProperty("transferRef")
  private String transferRef = null;

  @JsonProperty("error")
  private String error = null;

  public DepositTransfer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit transfer ID.
   * @return id
   **/
  @Schema(description = "The deposit transfer ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositTransfer href(String href) {
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

  public DepositTransfer createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit transfer is initiated.
   * @return createdAt
   **/
  @Schema(description = "The date when the deposit transfer is initiated.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositTransfer completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The deposit transfer completion date.
   * @return completedAt
   **/
  @Schema(description = "The deposit transfer completion date.")
  
    public String getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  public DepositTransfer status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The deposit transfer status.
   * @return status
   **/
  @Schema(description = "The deposit transfer status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DepositTransfer customerRef(String customerRef) {
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

  public DepositTransfer customerDepositRef(String customerDepositRef) {
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

  public DepositTransfer destCustomerRef(String destCustomerRef) {
    this.destCustomerRef = destCustomerRef;
    return this;
  }

  /**
   * The customer deposit transfer reference.
   * @return destCustomerRef
   **/
  @Schema(required = true, description = "The customer deposit transfer reference.")
      @NotNull

    public String getDestCustomerRef() {
    return destCustomerRef;
  }

  public void setDestCustomerRef(String destCustomerRef) {
    this.destCustomerRef = destCustomerRef;
  }

  public DepositTransfer destServiceRef(String destServiceRef) {
    this.destServiceRef = destServiceRef;
    return this;
  }

  /**
   * The customer deposit transfer service reference.
   * @return destServiceRef
   **/
  @Schema(description = "The customer deposit transfer service reference.")
  
    public String getDestServiceRef() {
    return destServiceRef;
  }

  public void setDestServiceRef(String destServiceRef) {
    this.destServiceRef = destServiceRef;
  }

  public DepositTransfer destBillProfileRef(String destBillProfileRef) {
    this.destBillProfileRef = destBillProfileRef;
    return this;
  }

  /**
   * The customer deposit transfer bill profile reference.
   * @return destBillProfileRef
   **/
  @Schema(description = "The customer deposit transfer bill profile reference.")
  
    public String getDestBillProfileRef() {
    return destBillProfileRef;
  }

  public void setDestBillProfileRef(String destBillProfileRef) {
    this.destBillProfileRef = destBillProfileRef;
  }

  public DepositTransfer transferAmount(Money transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  /**
   * Get transferAmount
   * @return transferAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Money transferAmount) {
    this.transferAmount = transferAmount;
  }

  public DepositTransfer notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Notes for the deposit transfer.
   * @return notes
   **/
  @Schema(description = "Notes for the deposit transfer.")
  
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DepositTransfer reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for the deposit transfer.
   * @return reason
   **/
  @Schema(description = "Reason for the deposit transfer.")
  
    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DepositTransfer glCode(String glCode) {
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

  public DepositTransfer transferRef(String transferRef) {
    this.transferRef = transferRef;
    return this;
  }

  /**
   * The deposit transfer reference.
   * @return transferRef
   **/
  @Schema(description = "The deposit transfer reference.")
  
    public String getTransferRef() {
    return transferRef;
  }

  public void setTransferRef(String transferRef) {
    this.transferRef = transferRef;
  }

  public DepositTransfer error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error message for the deposit transfer.
   * @return error
   **/
  @Schema(description = "Error message for the deposit transfer.")
  
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
    DepositTransfer depositTransfer = (DepositTransfer) o;
    return Objects.equals(this.id, depositTransfer.id) &&
        Objects.equals(this.href, depositTransfer.href) &&
        Objects.equals(this.createdAt, depositTransfer.createdAt) &&
        Objects.equals(this.completedAt, depositTransfer.completedAt) &&
        Objects.equals(this.status, depositTransfer.status) &&
        Objects.equals(this.customerRef, depositTransfer.customerRef) &&
        Objects.equals(this.customerDepositRef, depositTransfer.customerDepositRef) &&
        Objects.equals(this.destCustomerRef, depositTransfer.destCustomerRef) &&
        Objects.equals(this.destServiceRef, depositTransfer.destServiceRef) &&
        Objects.equals(this.destBillProfileRef, depositTransfer.destBillProfileRef) &&
        Objects.equals(this.transferAmount, depositTransfer.transferAmount) &&
        Objects.equals(this.notes, depositTransfer.notes) &&
        Objects.equals(this.reason, depositTransfer.reason) &&
        Objects.equals(this.glCode, depositTransfer.glCode) &&
        Objects.equals(this.transferRef, depositTransfer.transferRef) &&
        Objects.equals(this.error, depositTransfer.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, completedAt, status, customerRef, customerDepositRef, destCustomerRef, destServiceRef, destBillProfileRef, transferAmount, notes, reason, glCode, transferRef, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTransfer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    customerDepositRef: ").append(toIndentedString(customerDepositRef)).append("\n");
    sb.append("    destCustomerRef: ").append(toIndentedString(destCustomerRef)).append("\n");
    sb.append("    destServiceRef: ").append(toIndentedString(destServiceRef)).append("\n");
    sb.append("    destBillProfileRef: ").append(toIndentedString(destBillProfileRef)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    transferRef: ").append(toIndentedString(transferRef)).append("\n");
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
