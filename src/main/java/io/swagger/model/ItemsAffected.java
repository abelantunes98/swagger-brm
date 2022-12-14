package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Affected bill items.
 */
@Schema(description = "Affected bill items.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ItemsAffected   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("billNumber")
  private String billNumber = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("item")
  private String item = null;

  @JsonProperty("billUnitId")
  private String billUnitId = null;

  @JsonProperty("cycleStarts")
  private OffsetDateTime cycleStarts = null;

  @JsonProperty("cycleEnds")
  private OffsetDateTime cycleEnds = null;

  @JsonProperty("settledTaxAmount")
  private BigDecimal settledTaxAmount = null;

  @JsonProperty("settledTaxedAmount")
  private BigDecimal settledTaxedAmount = null;

  @JsonProperty("settledNonTaxedAmount")
  private BigDecimal settledNonTaxedAmount = null;

  public ItemsAffected accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the bill item.
   * @return accountNumber
   **/
  @Schema(required = true, description = "The account number associated with the bill item.")
      @NotNull

    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ItemsAffected billNumber(String billNumber) {
    this.billNumber = billNumber;
    return this;
  }

  /**
   * The bill number associated with the bill item.
   * @return billNumber
   **/
  @Schema(required = true, description = "The bill number associated with the bill item.")
      @NotNull

    public String getBillNumber() {
    return billNumber;
  }

  public void setBillNumber(String billNumber) {
    this.billNumber = billNumber;
  }

  public ItemsAffected amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The bill item amount.
   * @return amount
   **/
  @Schema(required = true, description = "The bill item amount.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ItemsAffected item(String item) {
    this.item = item;
    return this;
  }

  /**
   * The bill item.
   * @return item
   **/
  @Schema(required = true, description = "The bill item.")
      @NotNull

    public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public ItemsAffected billUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
    return this;
  }

  /**
   * The ID of the bill unit associated with the bill item.
   * @return billUnitId
   **/
  @Schema(required = true, description = "The ID of the bill unit associated with the bill item.")
      @NotNull

    public String getBillUnitId() {
    return billUnitId;
  }

  public void setBillUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
  }

  public ItemsAffected cycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
    return this;
  }

  /**
   * The date and time the billing cycle starts.
   * @return cycleStarts
   **/
  @Schema(description = "The date and time the billing cycle starts.")
  
    @Valid
    public OffsetDateTime getCycleStarts() {
    return cycleStarts;
  }

  public void setCycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
  }

  public ItemsAffected cycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
    return this;
  }

  /**
   * The date and time the billing cycle ends.
   * @return cycleEnds
   **/
  @Schema(description = "The date and time the billing cycle ends.")
  
    @Valid
    public OffsetDateTime getCycleEnds() {
    return cycleEnds;
  }

  public void setCycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
  }

  public ItemsAffected settledTaxAmount(BigDecimal settledTaxAmount) {
    this.settledTaxAmount = settledTaxAmount;
    return this;
  }

  /**
   * The amount of tax for the bill item settled by the payment.
   * @return settledTaxAmount
   **/
  @Schema(required = true, description = "The amount of tax for the bill item settled by the payment.")
      @NotNull

    @Valid
    public BigDecimal getSettledTaxAmount() {
    return settledTaxAmount;
  }

  public void setSettledTaxAmount(BigDecimal settledTaxAmount) {
    this.settledTaxAmount = settledTaxAmount;
  }

  public ItemsAffected settledTaxedAmount(BigDecimal settledTaxedAmount) {
    this.settledTaxedAmount = settledTaxedAmount;
    return this;
  }

  /**
   * The taxable amount for the bill item settled by the payment.
   * @return settledTaxedAmount
   **/
  @Schema(required = true, description = "The taxable amount for the bill item settled by the payment.")
      @NotNull

    @Valid
    public BigDecimal getSettledTaxedAmount() {
    return settledTaxedAmount;
  }

  public void setSettledTaxedAmount(BigDecimal settledTaxedAmount) {
    this.settledTaxedAmount = settledTaxedAmount;
  }

  public ItemsAffected settledNonTaxedAmount(BigDecimal settledNonTaxedAmount) {
    this.settledNonTaxedAmount = settledNonTaxedAmount;
    return this;
  }

  /**
   * The nontaxable amount for the bill item settled by the payment.
   * @return settledNonTaxedAmount
   **/
  @Schema(required = true, description = "The nontaxable amount for the bill item settled by the payment.")
      @NotNull

    @Valid
    public BigDecimal getSettledNonTaxedAmount() {
    return settledNonTaxedAmount;
  }

  public void setSettledNonTaxedAmount(BigDecimal settledNonTaxedAmount) {
    this.settledNonTaxedAmount = settledNonTaxedAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemsAffected itemsAffected = (ItemsAffected) o;
    return Objects.equals(this.accountNumber, itemsAffected.accountNumber) &&
        Objects.equals(this.billNumber, itemsAffected.billNumber) &&
        Objects.equals(this.amount, itemsAffected.amount) &&
        Objects.equals(this.item, itemsAffected.item) &&
        Objects.equals(this.billUnitId, itemsAffected.billUnitId) &&
        Objects.equals(this.cycleStarts, itemsAffected.cycleStarts) &&
        Objects.equals(this.cycleEnds, itemsAffected.cycleEnds) &&
        Objects.equals(this.settledTaxAmount, itemsAffected.settledTaxAmount) &&
        Objects.equals(this.settledTaxedAmount, itemsAffected.settledTaxedAmount) &&
        Objects.equals(this.settledNonTaxedAmount, itemsAffected.settledNonTaxedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, billNumber, amount, item, billUnitId, cycleStarts, cycleEnds, settledTaxAmount, settledTaxedAmount, settledNonTaxedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsAffected {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    billNumber: ").append(toIndentedString(billNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    billUnitId: ").append(toIndentedString(billUnitId)).append("\n");
    sb.append("    cycleStarts: ").append(toIndentedString(cycleStarts)).append("\n");
    sb.append("    cycleEnds: ").append(toIndentedString(cycleEnds)).append("\n");
    sb.append("    settledTaxAmount: ").append(toIndentedString(settledTaxAmount)).append("\n");
    sb.append("    settledTaxedAmount: ").append(toIndentedString(settledTaxedAmount)).append("\n");
    sb.append("    settledNonTaxedAmount: ").append(toIndentedString(settledNonTaxedAmount)).append("\n");
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
