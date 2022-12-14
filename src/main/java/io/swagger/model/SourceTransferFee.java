package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The transfer fee to charge the source.
 */
@Schema(description = "The transfer fee to charge the source.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SourceTransferFee   {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("feeTax")
  private BigDecimal feeTax = null;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  public SourceTransferFee amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the fee.
   * @return amount
   **/
  @Schema(description = "The amount of the fee.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public SourceTransferFee feeTax(BigDecimal feeTax) {
    this.feeTax = feeTax;
    return this;
  }

  /**
   * The tax on the fee.
   * @return feeTax
   **/
  @Schema(description = "The tax on the fee.")
  
    @Valid
    public BigDecimal getFeeTax() {
    return feeTax;
  }

  public void setFeeTax(BigDecimal feeTax) {
    this.feeTax = feeTax;
  }

  public SourceTransferFee resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The ID of the resource associated with the fee.
   * @return resourceId
   **/
  @Schema(description = "The ID of the resource associated with the fee.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceTransferFee sourceTransferFee = (SourceTransferFee) o;
    return Objects.equals(this.amount, sourceTransferFee.amount) &&
        Objects.equals(this.feeTax, sourceTransferFee.feeTax) &&
        Objects.equals(this.resourceId, sourceTransferFee.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, feeTax, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceTransferFee {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    feeTax: ").append(toIndentedString(feeTax)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
