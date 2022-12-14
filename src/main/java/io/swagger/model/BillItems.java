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
 * The list of bill items associated with the recycled payment.
 */
@Schema(description = "The list of bill items associated with the recycled payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillItems   {
  @JsonProperty("itemRef")
  private ResourceRef itemRef = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  public BillItems itemRef(ResourceRef itemRef) {
    this.itemRef = itemRef;
    return this;
  }

  /**
   * Get itemRef
   * @return itemRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getItemRef() {
    return itemRef;
  }

  public void setItemRef(ResourceRef itemRef) {
    this.itemRef = itemRef;
  }

  public BillItems amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The number of bill items.
   * @return amount
   **/
  @Schema(description = "The number of bill items.")
  
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
    BillItems billItems = (BillItems) o;
    return Objects.equals(this.itemRef, billItems.itemRef) &&
        Objects.equals(this.amount, billItems.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemRef, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillItems {\n");
    
    sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");
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
