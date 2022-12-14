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
 * The list of bills associated with the recycled payment.
 */
@Schema(description = "The list of bills associated with the recycled payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Bills   {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("billNo")
  private String billNo = null;

  public Bills amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount due for this bill.
   * @return amount
   **/
  @Schema(required = true, description = "The amount due for this bill.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Bills billNo(String billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * The bill number.
   * @return billNo
   **/
  @Schema(required = true, description = "The bill number.")
      @NotNull

    public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bills bills = (Bills) o;
    return Objects.equals(this.amount, bills.amount) &&
        Objects.equals(this.billNo, bills.billNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, billNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bills {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
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
