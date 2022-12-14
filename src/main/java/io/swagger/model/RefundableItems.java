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
 * RefundableItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class RefundableItems   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("billUnitName")
  private String billUnitName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("arActionId")
  private String arActionId = null;

  @JsonProperty("billRef")
  private ResourceRef billRef = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  public RefundableItems extension(Object extension) {
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

  public RefundableItems billUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
    return this;
  }

  /**
   * The name of the bill unit associated with the refundable item.
   * @return billUnitName
   **/
  @Schema(description = "The name of the bill unit associated with the refundable item.")
  
    public String getBillUnitName() {
    return billUnitName;
  }

  public void setBillUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
  }

  public RefundableItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The refundable items's type.
   * @return type
   **/
  @Schema(description = "The refundable items's type.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RefundableItems arActionId(String arActionId) {
    this.arActionId = arActionId;
    return this;
  }

  /**
   * The ID of the A/R action associated with the refundable item.
   * @return arActionId
   **/
  @Schema(description = "The ID of the A/R action associated with the refundable item.")
  
    public String getArActionId() {
    return arActionId;
  }

  public void setArActionId(String arActionId) {
    this.arActionId = arActionId;
  }

  public RefundableItems billRef(ResourceRef billRef) {
    this.billRef = billRef;
    return this;
  }

  /**
   * Get billRef
   * @return billRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBillRef() {
    return billRef;
  }

  public void setBillRef(ResourceRef billRef) {
    this.billRef = billRef;
  }

  public RefundableItems amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the refund.
   * @return amount
   **/
  @Schema(description = "The amount of the refund.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundableItems refundableItems = (RefundableItems) o;
    return Objects.equals(this.extension, refundableItems.extension) &&
        Objects.equals(this.billUnitName, refundableItems.billUnitName) &&
        Objects.equals(this.type, refundableItems.type) &&
        Objects.equals(this.arActionId, refundableItems.arActionId) &&
        Objects.equals(this.billRef, refundableItems.billRef) &&
        Objects.equals(this.amount, refundableItems.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, billUnitName, type, arActionId, billRef, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundableItems {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    billUnitName: ").append(toIndentedString(billUnitName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    arActionId: ").append(toIndentedString(arActionId)).append("\n");
    sb.append("    billRef: ").append(toIndentedString(billRef)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
