package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillItem;
import io.swagger.model.Events;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A settlement event.
 */
@Schema(description = "A settlement event.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SettlementEvent   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionAffectsRef")
  private ResourceRef actionAffectsRef = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("amountIsCredit")
  private Boolean amountIsCredit = true;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  @JsonProperty("includeTax")
  private Boolean includeTax = true;

  @JsonProperty("percent")
  private BigDecimal percent = null;

  @JsonProperty("billItem")
  @Valid
  private List<BillItem> billItem = null;

  @JsonProperty("appliesToTotalOfAllEvents")
  private Boolean appliesToTotalOfAllEvents = true;

  @JsonProperty("taxType")
  private Integer taxType = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("events")
  private Events events = null;

  public SettlementEvent extension(Object extension) {
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

  public SettlementEvent actionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
    return this;
  }

  /**
   * Get actionAffectsRef
   * @return actionAffectsRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getActionAffectsRef() {
    return actionAffectsRef;
  }

  public void setActionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
  }

  public SettlementEvent effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the settlement takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the settlement takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public SettlementEvent notes(Notes notes) {
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

  public SettlementEvent amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the settlement.
   * @return amount
   **/
  @Schema(required = true, description = "The amount of the settlement.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public SettlementEvent amountIsCredit(Boolean amountIsCredit) {
    this.amountIsCredit = amountIsCredit;
    return this;
  }

  /**
   * Whether the settlement is a credit (<b>true</b>) or a debit (<b>false</b>). The default is <b>true</b>.
   * @return amountIsCredit
   **/
  @Schema(description = "Whether the settlement is a credit (<b>true</b>) or a debit (<b>false</b>). The default is <b>true</b>.")
  
    public Boolean isAmountIsCredit() {
    return amountIsCredit;
  }

  public void setAmountIsCredit(Boolean amountIsCredit) {
    this.amountIsCredit = amountIsCredit;
  }

  public SettlementEvent resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The ID of the resource to settle.
   * @return resourceId
   **/
  @Schema(description = "The ID of the resource to settle.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public SettlementEvent includeTax(Boolean includeTax) {
    this.includeTax = includeTax;
    return this;
  }

  /**
   * Whether to include the tax in the settlement (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.
   * @return includeTax
   **/
  @Schema(description = "Whether to include the tax in the settlement (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.")
  
    public Boolean isIncludeTax() {
    return includeTax;
  }

  public void setIncludeTax(Boolean includeTax) {
    this.includeTax = includeTax;
  }

  public SettlementEvent percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * The amount of the settlement, as a percentage. For example, enter <b>5</b> for 5%.
   * @return percent
   **/
  @Schema(description = "The amount of the settlement, as a percentage. For example, enter <b>5</b> for 5%.")
  
    @Valid
    public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public SettlementEvent billItem(List<BillItem> billItem) {
    this.billItem = billItem;
    return this;
  }

  public SettlementEvent addBillItemItem(BillItem billItemItem) {
    if (this.billItem == null) {
      this.billItem = new ArrayList<BillItem>();
    }
    this.billItem.add(billItemItem);
    return this;
  }

  /**
   * The list of bill items associated with the settlement.
   * @return billItem
   **/
  @Schema(description = "The list of bill items associated with the settlement.")
      @Valid
    public List<BillItem> getBillItem() {
    return billItem;
  }

  public void setBillItem(List<BillItem> billItem) {
    this.billItem = billItem;
  }

  public SettlementEvent appliesToTotalOfAllEvents(Boolean appliesToTotalOfAllEvents) {
    this.appliesToTotalOfAllEvents = appliesToTotalOfAllEvents;
    return this;
  }

  /**
   * Whether the settlement applies to the total from all events (<b>true</b>) or not (<b>false</b>).
   * @return appliesToTotalOfAllEvents
   **/
  @Schema(description = "Whether the settlement applies to the total from all events (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isAppliesToTotalOfAllEvents() {
    return appliesToTotalOfAllEvents;
  }

  public void setAppliesToTotalOfAllEvents(Boolean appliesToTotalOfAllEvents) {
    this.appliesToTotalOfAllEvents = appliesToTotalOfAllEvents;
  }

  public SettlementEvent taxType(Integer taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Whether to include tax in the settlement (<b>8</b>), exclude the tax and settle only the amount (<b>9</b>), or settle only the tax (<b>10</b>).
   * @return taxType
   **/
  @Schema(description = "Whether to include tax in the settlement (<b>8</b>), exclude the tax and settle only the amount (<b>9</b>), or settle only the tax (<b>10</b>).")
  
    public Integer getTaxType() {
    return taxType;
  }

  public void setTaxType(Integer taxType) {
    this.taxType = taxType;
  }

  public SettlementEvent accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public SettlementEvent events(Events events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   * @return events
   **/
  @Schema(description = "")
  
    @Valid
    public Events getEvents() {
    return events;
  }

  public void setEvents(Events events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementEvent settlementEvent = (SettlementEvent) o;
    return Objects.equals(this.extension, settlementEvent.extension) &&
        Objects.equals(this.actionAffectsRef, settlementEvent.actionAffectsRef) &&
        Objects.equals(this.effective, settlementEvent.effective) &&
        Objects.equals(this.notes, settlementEvent.notes) &&
        Objects.equals(this.amount, settlementEvent.amount) &&
        Objects.equals(this.amountIsCredit, settlementEvent.amountIsCredit) &&
        Objects.equals(this.resourceId, settlementEvent.resourceId) &&
        Objects.equals(this.includeTax, settlementEvent.includeTax) &&
        Objects.equals(this.percent, settlementEvent.percent) &&
        Objects.equals(this.billItem, settlementEvent.billItem) &&
        Objects.equals(this.appliesToTotalOfAllEvents, settlementEvent.appliesToTotalOfAllEvents) &&
        Objects.equals(this.taxType, settlementEvent.taxType) &&
        Objects.equals(this.accountRef, settlementEvent.accountRef) &&
        Objects.equals(this.events, settlementEvent.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effective, notes, amount, amountIsCredit, resourceId, includeTax, percent, billItem, appliesToTotalOfAllEvents, taxType, accountRef, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementEvent {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionAffectsRef: ").append(toIndentedString(actionAffectsRef)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    amountIsCredit: ").append(toIndentedString(amountIsCredit)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    includeTax: ").append(toIndentedString(includeTax)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    billItem: ").append(toIndentedString(billItem)).append("\n");
    sb.append("    appliesToTotalOfAllEvents: ").append(toIndentedString(appliesToTotalOfAllEvents)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
