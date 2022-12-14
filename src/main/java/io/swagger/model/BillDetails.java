package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ItemsAffected;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details for a bill.
 */
@Schema(description = "Details for a bill.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillDetails   {
  @JsonProperty("billId")
  private String billId = null;

  @JsonProperty("cycleStarts")
  private OffsetDateTime cycleStarts = null;

  @JsonProperty("cycleEnds")
  private OffsetDateTime cycleEnds = null;

  @JsonProperty("dueAmount")
  private BigDecimal dueAmount = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("itemsAffectedCount")
  private Long itemsAffectedCount = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("billUnitId")
  private String billUnitId = null;

  @JsonProperty("itemsAffected")
  @Valid
  private List<ItemsAffected> itemsAffected = null;

  public BillDetails billId(String billId) {
    this.billId = billId;
    return this;
  }

  /**
   * The bill ID.
   * @return billId
   **/
  @Schema(required = true, description = "The bill ID.")
      @NotNull

    public String getBillId() {
    return billId;
  }

  public void setBillId(String billId) {
    this.billId = billId;
  }

  public BillDetails cycleStarts(OffsetDateTime cycleStarts) {
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

  public BillDetails cycleEnds(OffsetDateTime cycleEnds) {
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

  public BillDetails dueAmount(BigDecimal dueAmount) {
    this.dueAmount = dueAmount;
    return this;
  }

  /**
   * The total amount due.
   * @return dueAmount
   **/
  @Schema(required = true, description = "The total amount due.")
      @NotNull

    @Valid
    public BigDecimal getDueAmount() {
    return dueAmount;
  }

  public void setDueAmount(BigDecimal dueAmount) {
    this.dueAmount = dueAmount;
  }

  public BillDetails dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The due date for the bill.
   * @return dueDate
   **/
  @Schema(required = true, description = "The due date for the bill.")
      @NotNull

    @Valid
    public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public BillDetails itemsAffectedCount(Long itemsAffectedCount) {
    this.itemsAffectedCount = itemsAffectedCount;
    return this;
  }

  /**
   * The number of bill items affected by the bill.
   * @return itemsAffectedCount
   **/
  @Schema(description = "The number of bill items affected by the bill.")
  
    public Long getItemsAffectedCount() {
    return itemsAffectedCount;
  }

  public void setItemsAffectedCount(Long itemsAffectedCount) {
    this.itemsAffectedCount = itemsAffectedCount;
  }

  public BillDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the bill.
   * @return accountNumber
   **/
  @Schema(required = true, description = "The account number associated with the bill.")
      @NotNull

    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BillDetails billUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
    return this;
  }

  /**
   * The ID for the bill unit associated with the bill.
   * @return billUnitId
   **/
  @Schema(required = true, description = "The ID for the bill unit associated with the bill.")
      @NotNull

    public String getBillUnitId() {
    return billUnitId;
  }

  public void setBillUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
  }

  public BillDetails itemsAffected(List<ItemsAffected> itemsAffected) {
    this.itemsAffected = itemsAffected;
    return this;
  }

  public BillDetails addItemsAffectedItem(ItemsAffected itemsAffectedItem) {
    if (this.itemsAffected == null) {
      this.itemsAffected = new ArrayList<ItemsAffected>();
    }
    this.itemsAffected.add(itemsAffectedItem);
    return this;
  }

  /**
   * The list of affected bill items.
   * @return itemsAffected
   **/
  @Schema(description = "The list of affected bill items.")
      @Valid
    public List<ItemsAffected> getItemsAffected() {
    return itemsAffected;
  }

  public void setItemsAffected(List<ItemsAffected> itemsAffected) {
    this.itemsAffected = itemsAffected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillDetails billDetails = (BillDetails) o;
    return Objects.equals(this.billId, billDetails.billId) &&
        Objects.equals(this.cycleStarts, billDetails.cycleStarts) &&
        Objects.equals(this.cycleEnds, billDetails.cycleEnds) &&
        Objects.equals(this.dueAmount, billDetails.dueAmount) &&
        Objects.equals(this.dueDate, billDetails.dueDate) &&
        Objects.equals(this.itemsAffectedCount, billDetails.itemsAffectedCount) &&
        Objects.equals(this.accountNumber, billDetails.accountNumber) &&
        Objects.equals(this.billUnitId, billDetails.billUnitId) &&
        Objects.equals(this.itemsAffected, billDetails.itemsAffected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billId, cycleStarts, cycleEnds, dueAmount, dueDate, itemsAffectedCount, accountNumber, billUnitId, itemsAffected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillDetails {\n");
    
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    cycleStarts: ").append(toIndentedString(cycleStarts)).append("\n");
    sb.append("    cycleEnds: ").append(toIndentedString(cycleEnds)).append("\n");
    sb.append("    dueAmount: ").append(toIndentedString(dueAmount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    itemsAffectedCount: ").append(toIndentedString(itemsAffectedCount)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    billUnitId: ").append(toIndentedString(billUnitId)).append("\n");
    sb.append("    itemsAffected: ").append(toIndentedString(itemsAffected)).append("\n");
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
