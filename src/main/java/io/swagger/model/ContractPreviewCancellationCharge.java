package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An itemized list of cancelation fees.
 */
@Schema(description = "An itemized list of cancelation fees.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ContractPreviewCancellationCharge   {
  @JsonProperty("subscriberContractRef")
  private ResourceRef subscriberContractRef = null;

  @JsonProperty("cancellationFee")
  private BigDecimal cancellationFee = null;

  @JsonProperty("cancellationChargeType")
  private Integer cancellationChargeType = null;

  public ContractPreviewCancellationCharge subscriberContractRef(ResourceRef subscriberContractRef) {
    this.subscriberContractRef = subscriberContractRef;
    return this;
  }

  /**
   * Get subscriberContractRef
   * @return subscriberContractRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getSubscriberContractRef() {
    return subscriberContractRef;
  }

  public void setSubscriberContractRef(ResourceRef subscriberContractRef) {
    this.subscriberContractRef = subscriberContractRef;
  }

  public ContractPreviewCancellationCharge cancellationFee(BigDecimal cancellationFee) {
    this.cancellationFee = cancellationFee;
    return this;
  }

  /**
   * The cancellation fee.
   * @return cancellationFee
   **/
  @Schema(required = true, description = "The cancellation fee.")
      @NotNull

    @Valid
    public BigDecimal getCancellationFee() {
    return cancellationFee;
  }

  public void setCancellationFee(BigDecimal cancellationFee) {
    this.cancellationFee = cancellationFee;
  }

  public ContractPreviewCancellationCharge cancellationChargeType(Integer cancellationChargeType) {
    this.cancellationChargeType = cancellationChargeType;
    return this;
  }

  /**
   * The type of cancelation fee. Can be one of the following: <ul><li><b>0</b>: Fixed</li><li><b>1</b>: Reducing</li></ul>
   * @return cancellationChargeType
   **/
  @Schema(description = "The type of cancelation fee. Can be one of the following: <ul><li><b>0</b>: Fixed</li><li><b>1</b>: Reducing</li></ul>")
  
    public Integer getCancellationChargeType() {
    return cancellationChargeType;
  }

  public void setCancellationChargeType(Integer cancellationChargeType) {
    this.cancellationChargeType = cancellationChargeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractPreviewCancellationCharge contractPreviewCancellationCharge = (ContractPreviewCancellationCharge) o;
    return Objects.equals(this.subscriberContractRef, contractPreviewCancellationCharge.subscriberContractRef) &&
        Objects.equals(this.cancellationFee, contractPreviewCancellationCharge.cancellationFee) &&
        Objects.equals(this.cancellationChargeType, contractPreviewCancellationCharge.cancellationChargeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberContractRef, cancellationFee, cancellationChargeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractPreviewCancellationCharge {\n");
    
    sb.append("    subscriberContractRef: ").append(toIndentedString(subscriberContractRef)).append("\n");
    sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
    sb.append("    cancellationChargeType: ").append(toIndentedString(cancellationChargeType)).append("\n");
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
