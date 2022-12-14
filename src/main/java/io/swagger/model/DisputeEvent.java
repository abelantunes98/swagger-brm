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
 * DisputeEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DisputeEvent   {
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

  public DisputeEvent extension(Object extension) {
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

  public DisputeEvent actionAffectsRef(ResourceRef actionAffectsRef) {
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

  public DisputeEvent effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the dispute takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the dispute takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public DisputeEvent notes(Notes notes) {
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

  public DisputeEvent amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the dispute.
   * @return amount
   **/
  @Schema(required = true, description = "The amount of the dispute.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public DisputeEvent amountIsCredit(Boolean amountIsCredit) {
    this.amountIsCredit = amountIsCredit;
    return this;
  }

  /**
   * Whether the dispute is a credit (<b>true</b>) or a debit (<b>false</b>). The default is <b>true</b>.
   * @return amountIsCredit
   **/
  @Schema(description = "Whether the dispute is a credit (<b>true</b>) or a debit (<b>false</b>). The default is <b>true</b>.")
  
    public Boolean isAmountIsCredit() {
    return amountIsCredit;
  }

  public void setAmountIsCredit(Boolean amountIsCredit) {
    this.amountIsCredit = amountIsCredit;
  }

  public DisputeEvent resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The ID of the resource to dispute.
   * @return resourceId
   **/
  @Schema(description = "The ID of the resource to dispute.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public DisputeEvent includeTax(Boolean includeTax) {
    this.includeTax = includeTax;
    return this;
  }

  /**
   * Whether to include the tax in the dispute (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.
   * @return includeTax
   **/
  @Schema(description = "Whether to include the tax in the dispute (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.")
  
    public Boolean isIncludeTax() {
    return includeTax;
  }

  public void setIncludeTax(Boolean includeTax) {
    this.includeTax = includeTax;
  }

  public DisputeEvent percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * The amount of the dispute, as a percentage. For example, enter <b>5</b> for 5%.
   * @return percent
   **/
  @Schema(description = "The amount of the dispute, as a percentage. For example, enter <b>5</b> for 5%.")
  
    @Valid
    public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public DisputeEvent billItem(List<BillItem> billItem) {
    this.billItem = billItem;
    return this;
  }

  public DisputeEvent addBillItemItem(BillItem billItemItem) {
    if (this.billItem == null) {
      this.billItem = new ArrayList<BillItem>();
    }
    this.billItem.add(billItemItem);
    return this;
  }

  /**
   * A list of bill items.
   * @return billItem
   **/
  @Schema(description = "A list of bill items.")
      @Valid
    public List<BillItem> getBillItem() {
    return billItem;
  }

  public void setBillItem(List<BillItem> billItem) {
    this.billItem = billItem;
  }

  public DisputeEvent appliesToTotalOfAllEvents(Boolean appliesToTotalOfAllEvents) {
    this.appliesToTotalOfAllEvents = appliesToTotalOfAllEvents;
    return this;
  }

  /**
   * Whether the dispute applies to the total from all events (<b>true</b>) or not (<b>false</b>).
   * @return appliesToTotalOfAllEvents
   **/
  @Schema(description = "Whether the dispute applies to the total from all events (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isAppliesToTotalOfAllEvents() {
    return appliesToTotalOfAllEvents;
  }

  public void setAppliesToTotalOfAllEvents(Boolean appliesToTotalOfAllEvents) {
    this.appliesToTotalOfAllEvents = appliesToTotalOfAllEvents;
  }

  public DisputeEvent taxType(Integer taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * Whether to include tax in the dispute (<b>8</b>), exclude the tax and dispute only the amount (<b>9</b>), or dispute only the tax (<b>10</b>).
   * @return taxType
   **/
  @Schema(description = "Whether to include tax in the dispute (<b>8</b>), exclude the tax and dispute only the amount (<b>9</b>), or dispute only the tax (<b>10</b>).")
  
    public Integer getTaxType() {
    return taxType;
  }

  public void setTaxType(Integer taxType) {
    this.taxType = taxType;
  }

  public DisputeEvent accountRef(ResourceRef accountRef) {
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

  public DisputeEvent events(Events events) {
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
    DisputeEvent disputeEvent = (DisputeEvent) o;
    return Objects.equals(this.extension, disputeEvent.extension) &&
        Objects.equals(this.actionAffectsRef, disputeEvent.actionAffectsRef) &&
        Objects.equals(this.effective, disputeEvent.effective) &&
        Objects.equals(this.notes, disputeEvent.notes) &&
        Objects.equals(this.amount, disputeEvent.amount) &&
        Objects.equals(this.amountIsCredit, disputeEvent.amountIsCredit) &&
        Objects.equals(this.resourceId, disputeEvent.resourceId) &&
        Objects.equals(this.includeTax, disputeEvent.includeTax) &&
        Objects.equals(this.percent, disputeEvent.percent) &&
        Objects.equals(this.billItem, disputeEvent.billItem) &&
        Objects.equals(this.appliesToTotalOfAllEvents, disputeEvent.appliesToTotalOfAllEvents) &&
        Objects.equals(this.taxType, disputeEvent.taxType) &&
        Objects.equals(this.accountRef, disputeEvent.accountRef) &&
        Objects.equals(this.events, disputeEvent.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effective, notes, amount, amountIsCredit, resourceId, includeTax, percent, billItem, appliesToTotalOfAllEvents, taxType, accountRef, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeEvent {\n");
    
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
