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
 * A list of payments
 */
@Schema(description = "A list of payments")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PaymentList   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("paymentAmount")
  private BigDecimal paymentAmount = null;

  @JsonProperty("paymentDate")
  private OffsetDateTime paymentDate = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("paymentMethod")
  private Integer paymentMethod = null;

  @JsonProperty("unAllocatedAmount")
  private BigDecimal unAllocatedAmount = null;

  @JsonProperty("originalPaymentAmount")
  private BigDecimal originalPaymentAmount = null;

  @JsonProperty("paymentAction")
  private Integer paymentAction = null;

  @JsonProperty("billingStatus")
  private Integer billingStatus = null;

  @JsonProperty("paymentRef")
  private ResourceRef paymentRef = null;

  public PaymentList extension(Object extension) {
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

  public PaymentList paymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * The amount of the payment.
   * @return paymentAmount
   **/
  @Schema(required = true, description = "The amount of the payment.")
      @NotNull

    @Valid
    public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public PaymentList paymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The date and time the payment was made.
   * @return paymentDate
   **/
  @Schema(required = true, description = "The date and time the payment was made.")
      @NotNull

    @Valid
    public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(OffsetDateTime paymentDate) {
    this.paymentDate = paymentDate;
  }

  public PaymentList paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The ID of the payment
   * @return paymentId
   **/
  @Schema(required = true, description = "The ID of the payment")
      @NotNull

    public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentList paymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method. Can be one of the following&colon; <ul><li><b>10011</b>: Cash</li><li><b>10012</b>: Check</li><li><b>10013</b>: Wire transfer</li><li><b>10014</b>: Inter-bank payment order</li><li><b>10015</b>: Postal order</li></ul>
   * @return paymentMethod
   **/
  @Schema(description = "The payment method. Can be one of the following&colon; <ul><li><b>10011</b>: Cash</li><li><b>10012</b>: Check</li><li><b>10013</b>: Wire transfer</li><li><b>10014</b>: Inter-bank payment order</li><li><b>10015</b>: Postal order</li></ul>")
  
    public Integer getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentList unAllocatedAmount(BigDecimal unAllocatedAmount) {
    this.unAllocatedAmount = unAllocatedAmount;
    return this;
  }

  /**
   * The amount that is still unallocated.
   * @return unAllocatedAmount
   **/
  @Schema(required = true, description = "The amount that is still unallocated.")
      @NotNull

    @Valid
    public BigDecimal getUnAllocatedAmount() {
    return unAllocatedAmount;
  }

  public void setUnAllocatedAmount(BigDecimal unAllocatedAmount) {
    this.unAllocatedAmount = unAllocatedAmount;
  }

  public PaymentList originalPaymentAmount(BigDecimal originalPaymentAmount) {
    this.originalPaymentAmount = originalPaymentAmount;
    return this;
  }

  /**
   * The original payment amount.
   * @return originalPaymentAmount
   **/
  @Schema(required = true, description = "The original payment amount.")
      @NotNull

    @Valid
    public BigDecimal getOriginalPaymentAmount() {
    return originalPaymentAmount;
  }

  public void setOriginalPaymentAmount(BigDecimal originalPaymentAmount) {
    this.originalPaymentAmount = originalPaymentAmount;
  }

  public PaymentList paymentAction(Integer paymentAction) {
    this.paymentAction = paymentAction;
    return this;
  }

  /**
   * Whether the payment has been reversed or suspended. Can be one of the following: <ul><li><b>0</b>: Not reversed. </li><li><b>1</b>: Reversed. </li><li><b>2</b>: Suspended.</li></ul>
   * @return paymentAction
   **/
  @Schema(description = "Whether the payment has been reversed or suspended. Can be one of the following: <ul><li><b>0</b>: Not reversed. </li><li><b>1</b>: Reversed. </li><li><b>2</b>: Suspended.</li></ul>")
  
    public Integer getPaymentAction() {
    return paymentAction;
  }

  public void setPaymentAction(Integer paymentAction) {
    this.paymentAction = paymentAction;
  }

  public PaymentList billingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
    return this;
  }

  /**
   * The billing status. Can be one of the following&colon; <ul><li><b>1</b>: Billed</li><li><b>2</b>: Unbilled</li></ul>
   * @return billingStatus
   **/
  @Schema(description = "The billing status. Can be one of the following&colon; <ul><li><b>1</b>: Billed</li><li><b>2</b>: Unbilled</li></ul>")
  
    public Integer getBillingStatus() {
    return billingStatus;
  }

  public void setBillingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
  }

  public PaymentList paymentRef(ResourceRef paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

  /**
   * Get paymentRef
   * @return paymentRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(ResourceRef paymentRef) {
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
    PaymentList paymentList = (PaymentList) o;
    return Objects.equals(this.extension, paymentList.extension) &&
        Objects.equals(this.paymentAmount, paymentList.paymentAmount) &&
        Objects.equals(this.paymentDate, paymentList.paymentDate) &&
        Objects.equals(this.paymentId, paymentList.paymentId) &&
        Objects.equals(this.paymentMethod, paymentList.paymentMethod) &&
        Objects.equals(this.unAllocatedAmount, paymentList.unAllocatedAmount) &&
        Objects.equals(this.originalPaymentAmount, paymentList.originalPaymentAmount) &&
        Objects.equals(this.paymentAction, paymentList.paymentAction) &&
        Objects.equals(this.billingStatus, paymentList.billingStatus) &&
        Objects.equals(this.paymentRef, paymentList.paymentRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, paymentAmount, paymentDate, paymentId, paymentMethod, unAllocatedAmount, originalPaymentAmount, paymentAction, billingStatus, paymentRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentList {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    unAllocatedAmount: ").append(toIndentedString(unAllocatedAmount)).append("\n");
    sb.append("    originalPaymentAmount: ").append(toIndentedString(originalPaymentAmount)).append("\n");
    sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
    sb.append("    billingStatus: ").append(toIndentedString(billingStatus)).append("\n");
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
