package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositTxnBalanceImpacts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositTxnBalanceImpacts   {
  @JsonProperty("resourceId")
  private String resourceId = null;

  @JsonProperty("tax")
  private Money tax = null;

  @JsonProperty("amount")
  private Money amount = null;

  @JsonProperty("discountAmount")
  private Money discountAmount = null;

  public DepositTxnBalanceImpacts resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The balnace impact's resource ID.
   * @return resourceId
   **/
  @Schema(required = true, description = "The balnace impact's resource ID.")
      @NotNull

    public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public DepositTxnBalanceImpacts tax(Money tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
   **/
  @Schema(description = "")
  
    @Valid
    public Money getTax() {
    return tax;
  }

  public void setTax(Money tax) {
    this.tax = tax;
  }

  public DepositTxnBalanceImpacts amount(Money amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public DepositTxnBalanceImpacts discountAmount(Money discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

  /**
   * Get discountAmount
   * @return discountAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Money discountAmount) {
    this.discountAmount = discountAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTxnBalanceImpacts depositTxnBalanceImpacts = (DepositTxnBalanceImpacts) o;
    return Objects.equals(this.resourceId, depositTxnBalanceImpacts.resourceId) &&
        Objects.equals(this.tax, depositTxnBalanceImpacts.tax) &&
        Objects.equals(this.amount, depositTxnBalanceImpacts.amount) &&
        Objects.equals(this.discountAmount, depositTxnBalanceImpacts.discountAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, tax, amount, discountAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTxnBalanceImpacts {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
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
