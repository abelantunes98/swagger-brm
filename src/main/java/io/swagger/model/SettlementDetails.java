package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SettlementDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SettlementDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("billId")
  private String billId = null;

  @JsonProperty("itemId")
  private String itemId = null;

  @JsonProperty("disputedDate")
  private OffsetDateTime disputedDate = null;

  @JsonProperty("settledDate")
  private OffsetDateTime settledDate = null;

  @JsonProperty("disputeId")
  private String disputeId = null;

  @JsonProperty("disputeRef")
  private ResourceRef disputeRef = null;

  @JsonProperty("settlementId")
  private String settlementId = null;

  @JsonProperty("itemName")
  private String itemName = null;

  @JsonProperty("itemNumber")
  private String itemNumber = null;

  @JsonProperty("eventsCount")
  private String eventsCount = null;

  @JsonProperty("disputedAmount")
  private BigDecimal disputedAmount = null;

  @JsonProperty("settlementAmount")
  private BigDecimal settlementAmount = null;

  @JsonProperty("settlementRef")
  private ResourceRef settlementRef = null;

  @JsonProperty("billNumber")
  private String billNumber = null;

  @JsonProperty("due")
  private BigDecimal due = null;

  @JsonProperty("billingStart")
  private OffsetDateTime billingStart = null;

  @JsonProperty("billingEnd")
  private OffsetDateTime billingEnd = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public SettlementDetails extension(Object extension) {
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

  public SettlementDetails billId(String billId) {
    this.billId = billId;
    return this;
  }

  /**
   * The ID of the bill associated with the settlement.
   * @return billId
   **/
  @Schema(required = true, description = "The ID of the bill associated with the settlement.")
      @NotNull

    public String getBillId() {
    return billId;
  }

  public void setBillId(String billId) {
    this.billId = billId;
  }

  public SettlementDetails itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the item associated with the settlement.
   * @return itemId
   **/
  @Schema(required = true, description = "The ID of the item associated with the settlement.")
      @NotNull

    public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public SettlementDetails disputedDate(OffsetDateTime disputedDate) {
    this.disputedDate = disputedDate;
    return this;
  }

  /**
   * The date and time the bill, item, or event was disputed.
   * @return disputedDate
   **/
  @Schema(required = true, description = "The date and time the bill, item, or event was disputed.")
      @NotNull

    @Valid
    public OffsetDateTime getDisputedDate() {
    return disputedDate;
  }

  public void setDisputedDate(OffsetDateTime disputedDate) {
    this.disputedDate = disputedDate;
  }

  public SettlementDetails settledDate(OffsetDateTime settledDate) {
    this.settledDate = settledDate;
    return this;
  }

  /**
   * The date and time the dispute was settled.
   * @return settledDate
   **/
  @Schema(required = true, description = "The date and time the dispute was settled.")
      @NotNull

    @Valid
    public OffsetDateTime getSettledDate() {
    return settledDate;
  }

  public void setSettledDate(OffsetDateTime settledDate) {
    this.settledDate = settledDate;
  }

  public SettlementDetails disputeId(String disputeId) {
    this.disputeId = disputeId;
    return this;
  }

  /**
   * The ID of the dispute.
   * @return disputeId
   **/
  @Schema(required = true, description = "The ID of the dispute.")
      @NotNull

    public String getDisputeId() {
    return disputeId;
  }

  public void setDisputeId(String disputeId) {
    this.disputeId = disputeId;
  }

  public SettlementDetails disputeRef(ResourceRef disputeRef) {
    this.disputeRef = disputeRef;
    return this;
  }

  /**
   * Get disputeRef
   * @return disputeRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getDisputeRef() {
    return disputeRef;
  }

  public void setDisputeRef(ResourceRef disputeRef) {
    this.disputeRef = disputeRef;
  }

  public SettlementDetails settlementId(String settlementId) {
    this.settlementId = settlementId;
    return this;
  }

  /**
   * The ID of the settlement.
   * @return settlementId
   **/
  @Schema(required = true, description = "The ID of the settlement.")
      @NotNull

    public String getSettlementId() {
    return settlementId;
  }

  public void setSettlementId(String settlementId) {
    this.settlementId = settlementId;
  }

  public SettlementDetails itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * The name of the item associated with the settlement.
   * @return itemName
   **/
  @Schema(required = true, description = "The name of the item associated with the settlement.")
      @NotNull

    public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public SettlementDetails itemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

  /**
   * The item number associated with the settlement.
   * @return itemNumber
   **/
  @Schema(required = true, description = "The item number associated with the settlement.")
      @NotNull

    public String getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }

  public SettlementDetails eventsCount(String eventsCount) {
    this.eventsCount = eventsCount;
    return this;
  }

  /**
   * The number of events associated with the settlement.
   * @return eventsCount
   **/
  @Schema(required = true, description = "The number of events associated with the settlement.")
      @NotNull

    public String getEventsCount() {
    return eventsCount;
  }

  public void setEventsCount(String eventsCount) {
    this.eventsCount = eventsCount;
  }

  public SettlementDetails disputedAmount(BigDecimal disputedAmount) {
    this.disputedAmount = disputedAmount;
    return this;
  }

  /**
   * The amount of the dispute.
   * @return disputedAmount
   **/
  @Schema(required = true, description = "The amount of the dispute.")
      @NotNull

    @Valid
    public BigDecimal getDisputedAmount() {
    return disputedAmount;
  }

  public void setDisputedAmount(BigDecimal disputedAmount) {
    this.disputedAmount = disputedAmount;
  }

  public SettlementDetails settlementAmount(BigDecimal settlementAmount) {
    this.settlementAmount = settlementAmount;
    return this;
  }

  /**
   * The settlement amount. The amount you enter can be all, a portion, or none of the disputed amount.
   * @return settlementAmount
   **/
  @Schema(required = true, description = "The settlement amount. The amount you enter can be all, a portion, or none of the disputed amount.")
      @NotNull

    @Valid
    public BigDecimal getSettlementAmount() {
    return settlementAmount;
  }

  public void setSettlementAmount(BigDecimal settlementAmount) {
    this.settlementAmount = settlementAmount;
  }

  public SettlementDetails settlementRef(ResourceRef settlementRef) {
    this.settlementRef = settlementRef;
    return this;
  }

  /**
   * Get settlementRef
   * @return settlementRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getSettlementRef() {
    return settlementRef;
  }

  public void setSettlementRef(ResourceRef settlementRef) {
    this.settlementRef = settlementRef;
  }

  public SettlementDetails billNumber(String billNumber) {
    this.billNumber = billNumber;
    return this;
  }

  /**
   * The bill number associated with the settlement.
   * @return billNumber
   **/
  @Schema(description = "The bill number associated with the settlement.")
  
    public String getBillNumber() {
    return billNumber;
  }

  public void setBillNumber(String billNumber) {
    this.billNumber = billNumber;
  }

  public SettlementDetails due(BigDecimal due) {
    this.due = due;
    return this;
  }

  /**
   * The amount due after the settlement.
   * @return due
   **/
  @Schema(description = "The amount due after the settlement.")
  
    @Valid
    public BigDecimal getDue() {
    return due;
  }

  public void setDue(BigDecimal due) {
    this.due = due;
  }

  public SettlementDetails billingStart(OffsetDateTime billingStart) {
    this.billingStart = billingStart;
    return this;
  }

  /**
   * The date and time the billing cycle starts.
   * @return billingStart
   **/
  @Schema(description = "The date and time the billing cycle starts.")
  
    @Valid
    public OffsetDateTime getBillingStart() {
    return billingStart;
  }

  public void setBillingStart(OffsetDateTime billingStart) {
    this.billingStart = billingStart;
  }

  public SettlementDetails billingEnd(OffsetDateTime billingEnd) {
    this.billingEnd = billingEnd;
    return this;
  }

  /**
   * The date and time the billing cycle ends.
   * @return billingEnd
   **/
  @Schema(description = "The date and time the billing cycle ends.")
  
    @Valid
    public OffsetDateTime getBillingEnd() {
    return billingEnd;
  }

  public void setBillingEnd(OffsetDateTime billingEnd) {
    this.billingEnd = billingEnd;
  }

  public SettlementDetails notes(Notes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    @Valid
    public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementDetails settlementDetails = (SettlementDetails) o;
    return Objects.equals(this.extension, settlementDetails.extension) &&
        Objects.equals(this.billId, settlementDetails.billId) &&
        Objects.equals(this.itemId, settlementDetails.itemId) &&
        Objects.equals(this.disputedDate, settlementDetails.disputedDate) &&
        Objects.equals(this.settledDate, settlementDetails.settledDate) &&
        Objects.equals(this.disputeId, settlementDetails.disputeId) &&
        Objects.equals(this.disputeRef, settlementDetails.disputeRef) &&
        Objects.equals(this.settlementId, settlementDetails.settlementId) &&
        Objects.equals(this.itemName, settlementDetails.itemName) &&
        Objects.equals(this.itemNumber, settlementDetails.itemNumber) &&
        Objects.equals(this.eventsCount, settlementDetails.eventsCount) &&
        Objects.equals(this.disputedAmount, settlementDetails.disputedAmount) &&
        Objects.equals(this.settlementAmount, settlementDetails.settlementAmount) &&
        Objects.equals(this.settlementRef, settlementDetails.settlementRef) &&
        Objects.equals(this.billNumber, settlementDetails.billNumber) &&
        Objects.equals(this.due, settlementDetails.due) &&
        Objects.equals(this.billingStart, settlementDetails.billingStart) &&
        Objects.equals(this.billingEnd, settlementDetails.billingEnd) &&
        Objects.equals(this.notes, settlementDetails.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, billId, itemId, disputedDate, settledDate, disputeId, disputeRef, settlementId, itemName, itemNumber, eventsCount, disputedAmount, settlementAmount, settlementRef, billNumber, due, billingStart, billingEnd, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    disputedDate: ").append(toIndentedString(disputedDate)).append("\n");
    sb.append("    settledDate: ").append(toIndentedString(settledDate)).append("\n");
    sb.append("    disputeId: ").append(toIndentedString(disputeId)).append("\n");
    sb.append("    disputeRef: ").append(toIndentedString(disputeRef)).append("\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    eventsCount: ").append(toIndentedString(eventsCount)).append("\n");
    sb.append("    disputedAmount: ").append(toIndentedString(disputedAmount)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    settlementRef: ").append(toIndentedString(settlementRef)).append("\n");
    sb.append("    billNumber: ").append(toIndentedString(billNumber)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    billingStart: ").append(toIndentedString(billingStart)).append("\n");
    sb.append("    billingEnd: ").append(toIndentedString(billingEnd)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
