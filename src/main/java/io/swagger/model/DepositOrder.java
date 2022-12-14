package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CustomerDeposit;
import io.swagger.model.DepositPayment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The customer deposit.
 */
@Schema(description = "The customer deposit.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositOrder   {
  @JsonProperty("customerDeposit")
  private CustomerDeposit customerDeposit = null;

  @JsonProperty("payments")
  @Valid
  private List<DepositPayment> payments = null;

  public DepositOrder customerDeposit(CustomerDeposit customerDeposit) {
    this.customerDeposit = customerDeposit;
    return this;
  }

  /**
   * Get customerDeposit
   * @return customerDeposit
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public CustomerDeposit getCustomerDeposit() {
    return customerDeposit;
  }

  public void setCustomerDeposit(CustomerDeposit customerDeposit) {
    this.customerDeposit = customerDeposit;
  }

  public DepositOrder payments(List<DepositPayment> payments) {
    this.payments = payments;
    return this;
  }

  public DepositOrder addPaymentsItem(DepositPayment paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<DepositPayment>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Get payments
   * @return payments
   **/
  @Schema(description = "")
      @Valid
    public List<DepositPayment> getPayments() {
    return payments;
  }

  public void setPayments(List<DepositPayment> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositOrder depositOrder = (DepositOrder) o;
    return Objects.equals(this.customerDeposit, depositOrder.customerDeposit) &&
        Objects.equals(this.payments, depositOrder.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerDeposit, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositOrder {\n");
    
    sb.append("    customerDeposit: ").append(toIndentedString(customerDeposit)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
