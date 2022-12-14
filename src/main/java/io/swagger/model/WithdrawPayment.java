package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A payment withdrawal.
 */
@Schema(description = "A payment withdrawal.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class WithdrawPayment   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("suspenseAccountId")
  private String suspenseAccountId = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("paymentEventRef")
  private ResourceRef paymentEventRef = null;

  @JsonProperty("domainId")
  private Integer domainId = null;

  @JsonProperty("reasonId")
  private Integer reasonId = null;

  public WithdrawPayment extension(Object extension) {
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

  public WithdrawPayment suspenseAccountId(String suspenseAccountId) {
    this.suspenseAccountId = suspenseAccountId;
    return this;
  }

  /**
   * The ID of the suspended account associated with the withdrawal.
   * @return suspenseAccountId
   **/
  @Schema(required = true, description = "The ID of the suspended account associated with the withdrawal.")
      @NotNull

    public String getSuspenseAccountId() {
    return suspenseAccountId;
  }

  public void setSuspenseAccountId(String suspenseAccountId) {
    this.suspenseAccountId = suspenseAccountId;
  }

  public WithdrawPayment effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the payment withdrawal took effect.
   * @return effectiveDate
   **/
  @Schema(required = true, description = "The date and time the payment withdrawal took effect.")
      @NotNull

    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public WithdrawPayment paymentEventRef(ResourceRef paymentEventRef) {
    this.paymentEventRef = paymentEventRef;
    return this;
  }

  /**
   * Get paymentEventRef
   * @return paymentEventRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentEventRef() {
    return paymentEventRef;
  }

  public void setPaymentEventRef(ResourceRef paymentEventRef) {
    this.paymentEventRef = paymentEventRef;
  }

  public WithdrawPayment domainId(Integer domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * The reason's domain ID
   * @return domainId
   **/
  @Schema(description = "The reason's domain ID")
  
    public Integer getDomainId() {
    return domainId;
  }

  public void setDomainId(Integer domainId) {
    this.domainId = domainId;
  }

  public WithdrawPayment reasonId(Integer reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  /**
   * The reason ID for the payment withdrawal.
   * @return reasonId
   **/
  @Schema(description = "The reason ID for the payment withdrawal.")
  
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
    WithdrawPayment withdrawPayment = (WithdrawPayment) o;
    return Objects.equals(this.extension, withdrawPayment.extension) &&
        Objects.equals(this.suspenseAccountId, withdrawPayment.suspenseAccountId) &&
        Objects.equals(this.effectiveDate, withdrawPayment.effectiveDate) &&
        Objects.equals(this.paymentEventRef, withdrawPayment.paymentEventRef) &&
        Objects.equals(this.domainId, withdrawPayment.domainId) &&
        Objects.equals(this.reasonId, withdrawPayment.reasonId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, suspenseAccountId, effectiveDate, paymentEventRef, domainId, reasonId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawPayment {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    suspenseAccountId: ").append(toIndentedString(suspenseAccountId)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    paymentEventRef: ").append(toIndentedString(paymentEventRef)).append("\n");
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
