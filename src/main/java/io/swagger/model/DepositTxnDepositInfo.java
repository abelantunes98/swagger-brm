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
 * The deposit transaction Info
 */
@Schema(description = "The deposit transaction Info")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositTxnDepositInfo   {
  @JsonProperty("customerRef")
  private String customerRef = null;

  @JsonProperty("dayOfWeek")
  private Integer dayOfWeek = null;

  @JsonProperty("amount")
  private Money amount = null;

  @JsonProperty("serviceRef")
  private String serviceRef = null;

  @JsonProperty("billInfoRef")
  private String billInfoRef = null;

  @JsonProperty("toServiceRef")
  private String toServiceRef = null;

  @JsonProperty("toBillInfoRef")
  private String toBillInfoRef = null;

  public DepositTxnDepositInfo customerRef(String customerRef) {
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

  public DepositTxnDepositInfo dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * The day of the week
   * @return dayOfWeek
   **/
  @Schema(description = "The day of the week")
  
    public Integer getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public DepositTxnDepositInfo amount(Money amount) {
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

  public DepositTxnDepositInfo serviceRef(String serviceRef) {
    this.serviceRef = serviceRef;
    return this;
  }

  /**
   * The service reference.
   * @return serviceRef
   **/
  @Schema(required = true, description = "The service reference.")
      @NotNull

    public String getServiceRef() {
    return serviceRef;
  }

  public void setServiceRef(String serviceRef) {
    this.serviceRef = serviceRef;
  }

  public DepositTxnDepositInfo billInfoRef(String billInfoRef) {
    this.billInfoRef = billInfoRef;
    return this;
  }

  /**
   * The bill reference.
   * @return billInfoRef
   **/
  @Schema(required = true, description = "The bill reference.")
      @NotNull

    public String getBillInfoRef() {
    return billInfoRef;
  }

  public void setBillInfoRef(String billInfoRef) {
    this.billInfoRef = billInfoRef;
  }

  public DepositTxnDepositInfo toServiceRef(String toServiceRef) {
    this.toServiceRef = toServiceRef;
    return this;
  }

  /**
   * The service reference to which transaction is made.
   * @return toServiceRef
   **/
  @Schema(required = true, description = "The service reference to which transaction is made.")
      @NotNull

    public String getToServiceRef() {
    return toServiceRef;
  }

  public void setToServiceRef(String toServiceRef) {
    this.toServiceRef = toServiceRef;
  }

  public DepositTxnDepositInfo toBillInfoRef(String toBillInfoRef) {
    this.toBillInfoRef = toBillInfoRef;
    return this;
  }

  /**
   * The bill reference to which transaction is made.
   * @return toBillInfoRef
   **/
  @Schema(required = true, description = "The bill reference to which transaction is made.")
      @NotNull

    public String getToBillInfoRef() {
    return toBillInfoRef;
  }

  public void setToBillInfoRef(String toBillInfoRef) {
    this.toBillInfoRef = toBillInfoRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTxnDepositInfo depositTxnDepositInfo = (DepositTxnDepositInfo) o;
    return Objects.equals(this.customerRef, depositTxnDepositInfo.customerRef) &&
        Objects.equals(this.dayOfWeek, depositTxnDepositInfo.dayOfWeek) &&
        Objects.equals(this.amount, depositTxnDepositInfo.amount) &&
        Objects.equals(this.serviceRef, depositTxnDepositInfo.serviceRef) &&
        Objects.equals(this.billInfoRef, depositTxnDepositInfo.billInfoRef) &&
        Objects.equals(this.toServiceRef, depositTxnDepositInfo.toServiceRef) &&
        Objects.equals(this.toBillInfoRef, depositTxnDepositInfo.toBillInfoRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerRef, dayOfWeek, amount, serviceRef, billInfoRef, toServiceRef, toBillInfoRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTxnDepositInfo {\n");
    
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    billInfoRef: ").append(toIndentedString(billInfoRef)).append("\n");
    sb.append("    toServiceRef: ").append(toIndentedString(toServiceRef)).append("\n");
    sb.append("    toBillInfoRef: ").append(toIndentedString(toBillInfoRef)).append("\n");
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
