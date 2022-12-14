package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CollectionsActions;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The details for a bill unit in collections.
 */
@Schema(description = "The details for a bill unit in collections.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillUnitCollectionsDetails   {
  @JsonProperty("scenarioId")
  private String scenarioId = null;

  @JsonProperty("billUnitId")
  private String billUnitId = null;

  @JsonProperty("billUnitName")
  private String billUnitName = null;

  @JsonProperty("overdueAmount")
  private BigDecimal overdueAmount = null;

  @JsonProperty("minimumPayment")
  private BigDecimal minimumPayment = null;

  @JsonProperty("overdueDays")
  private Integer overdueDays = null;

  @JsonProperty("entryDate")
  private OffsetDateTime entryDate = null;

  @JsonProperty("lastPaymentId")
  private String lastPaymentId = null;

  @JsonProperty("lastPaymentAmount")
  private BigDecimal lastPaymentAmount = null;

  @JsonProperty("lastPaymentEffectiveDate")
  private OffsetDateTime lastPaymentEffectiveDate = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("collectionAgent")
  private String collectionAgent = null;

  @JsonProperty("scenarioName")
  private String scenarioName = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("numberOfTimesInCollections")
  private Integer numberOfTimesInCollections = null;

  @JsonProperty("collectionsGroupId")
  private String collectionsGroupId = null;

  @JsonProperty("collectionsActions")
  @Valid
  private List<CollectionsActions> collectionsActions = null;

  public BillUnitCollectionsDetails scenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

  /**
   * The ID of the account's collections scenario.
   * @return scenarioId
   **/
  @Schema(required = true, description = "The ID of the account's collections scenario.")
      @NotNull

    public String getScenarioId() {
    return scenarioId;
  }

  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }

  public BillUnitCollectionsDetails billUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
    return this;
  }

  /**
   * The ID of the bill unit in collections.
   * @return billUnitId
   **/
  @Schema(required = true, description = "The ID of the bill unit in collections.")
      @NotNull

    public String getBillUnitId() {
    return billUnitId;
  }

  public void setBillUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
  }

  public BillUnitCollectionsDetails billUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
    return this;
  }

  /**
   * The name of the bill unit in collections.
   * @return billUnitName
   **/
  @Schema(required = true, description = "The name of the bill unit in collections.")
      @NotNull

    public String getBillUnitName() {
    return billUnitName;
  }

  public void setBillUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
  }

  public BillUnitCollectionsDetails overdueAmount(BigDecimal overdueAmount) {
    this.overdueAmount = overdueAmount;
    return this;
  }

  /**
   * The amount that is overdue.
   * @return overdueAmount
   **/
  @Schema(required = true, description = "The amount that is overdue.")
      @NotNull

    @Valid
    public BigDecimal getOverdueAmount() {
    return overdueAmount;
  }

  public void setOverdueAmount(BigDecimal overdueAmount) {
    this.overdueAmount = overdueAmount;
  }

  public BillUnitCollectionsDetails minimumPayment(BigDecimal minimumPayment) {
    this.minimumPayment = minimumPayment;
    return this;
  }

  /**
   * The minimum required payment.
   * @return minimumPayment
   **/
  @Schema(required = true, description = "The minimum required payment.")
      @NotNull

    @Valid
    public BigDecimal getMinimumPayment() {
    return minimumPayment;
  }

  public void setMinimumPayment(BigDecimal minimumPayment) {
    this.minimumPayment = minimumPayment;
  }

  public BillUnitCollectionsDetails overdueDays(Integer overdueDays) {
    this.overdueDays = overdueDays;
    return this;
  }

  /**
   * The number of days the payment is overdue.
   * @return overdueDays
   **/
  @Schema(description = "The number of days the payment is overdue.")
  
    public Integer getOverdueDays() {
    return overdueDays;
  }

  public void setOverdueDays(Integer overdueDays) {
    this.overdueDays = overdueDays;
  }

  public BillUnitCollectionsDetails entryDate(OffsetDateTime entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * The date and time the account entered collections.
   * @return entryDate
   **/
  @Schema(required = true, description = "The date and time the account entered collections.")
      @NotNull

    @Valid
    public OffsetDateTime getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(OffsetDateTime entryDate) {
    this.entryDate = entryDate;
  }

  public BillUnitCollectionsDetails lastPaymentId(String lastPaymentId) {
    this.lastPaymentId = lastPaymentId;
    return this;
  }

  /**
   * The ID of the account's last payment.
   * @return lastPaymentId
   **/
  @Schema(required = true, description = "The ID of the account's last payment.")
      @NotNull

    public String getLastPaymentId() {
    return lastPaymentId;
  }

  public void setLastPaymentId(String lastPaymentId) {
    this.lastPaymentId = lastPaymentId;
  }

  public BillUnitCollectionsDetails lastPaymentAmount(BigDecimal lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

  /**
   * The amount of the account's last payment.
   * @return lastPaymentAmount
   **/
  @Schema(required = true, description = "The amount of the account's last payment.")
      @NotNull

    @Valid
    public BigDecimal getLastPaymentAmount() {
    return lastPaymentAmount;
  }

  public void setLastPaymentAmount(BigDecimal lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }

  public BillUnitCollectionsDetails lastPaymentEffectiveDate(OffsetDateTime lastPaymentEffectiveDate) {
    this.lastPaymentEffectiveDate = lastPaymentEffectiveDate;
    return this;
  }

  /**
   * The effective date and time of the account's last payment.
   * @return lastPaymentEffectiveDate
   **/
  @Schema(required = true, description = "The effective date and time of the account's last payment.")
      @NotNull

    @Valid
    public OffsetDateTime getLastPaymentEffectiveDate() {
    return lastPaymentEffectiveDate;
  }

  public void setLastPaymentEffectiveDate(OffsetDateTime lastPaymentEffectiveDate) {
    this.lastPaymentEffectiveDate = lastPaymentEffectiveDate;
  }

  public BillUnitCollectionsDetails currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The code for the account's primary currency.
   * @return currency
   **/
  @Schema(description = "The code for the account's primary currency.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public BillUnitCollectionsDetails collectionAgent(String collectionAgent) {
    this.collectionAgent = collectionAgent;
    return this;
  }

  /**
   * The collections agent assigned to the account.
   * @return collectionAgent
   **/
  @Schema(required = true, description = "The collections agent assigned to the account.")
      @NotNull

    public String getCollectionAgent() {
    return collectionAgent;
  }

  public void setCollectionAgent(String collectionAgent) {
    this.collectionAgent = collectionAgent;
  }

  public BillUnitCollectionsDetails scenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
    return this;
  }

  /**
   * The name of the account's collections scenario.
   * @return scenarioName
   **/
  @Schema(required = true, description = "The name of the account's collections scenario.")
      @NotNull

    public String getScenarioName() {
    return scenarioName;
  }

  public void setScenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
  }

  public BillUnitCollectionsDetails notes(Notes notes) {
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

  public BillUnitCollectionsDetails numberOfTimesInCollections(Integer numberOfTimesInCollections) {
    this.numberOfTimesInCollections = numberOfTimesInCollections;
    return this;
  }

  /**
   * The number of times the account has been in collections.
   * @return numberOfTimesInCollections
   **/
  @Schema(description = "The number of times the account has been in collections.")
  
    public Integer getNumberOfTimesInCollections() {
    return numberOfTimesInCollections;
  }

  public void setNumberOfTimesInCollections(Integer numberOfTimesInCollections) {
    this.numberOfTimesInCollections = numberOfTimesInCollections;
  }

  public BillUnitCollectionsDetails collectionsGroupId(String collectionsGroupId) {
    this.collectionsGroupId = collectionsGroupId;
    return this;
  }

  /**
   * The ID of the account's collections group.
   * @return collectionsGroupId
   **/
  @Schema(required = true, description = "The ID of the account's collections group.")
      @NotNull

    public String getCollectionsGroupId() {
    return collectionsGroupId;
  }

  public void setCollectionsGroupId(String collectionsGroupId) {
    this.collectionsGroupId = collectionsGroupId;
  }

  public BillUnitCollectionsDetails collectionsActions(List<CollectionsActions> collectionsActions) {
    this.collectionsActions = collectionsActions;
    return this;
  }

  public BillUnitCollectionsDetails addCollectionsActionsItem(CollectionsActions collectionsActionsItem) {
    if (this.collectionsActions == null) {
      this.collectionsActions = new ArrayList<CollectionsActions>();
    }
    this.collectionsActions.add(collectionsActionsItem);
    return this;
  }

  /**
   * The list of collections actions for the account.
   * @return collectionsActions
   **/
  @Schema(description = "The list of collections actions for the account.")
      @Valid
    public List<CollectionsActions> getCollectionsActions() {
    return collectionsActions;
  }

  public void setCollectionsActions(List<CollectionsActions> collectionsActions) {
    this.collectionsActions = collectionsActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillUnitCollectionsDetails billUnitCollectionsDetails = (BillUnitCollectionsDetails) o;
    return Objects.equals(this.scenarioId, billUnitCollectionsDetails.scenarioId) &&
        Objects.equals(this.billUnitId, billUnitCollectionsDetails.billUnitId) &&
        Objects.equals(this.billUnitName, billUnitCollectionsDetails.billUnitName) &&
        Objects.equals(this.overdueAmount, billUnitCollectionsDetails.overdueAmount) &&
        Objects.equals(this.minimumPayment, billUnitCollectionsDetails.minimumPayment) &&
        Objects.equals(this.overdueDays, billUnitCollectionsDetails.overdueDays) &&
        Objects.equals(this.entryDate, billUnitCollectionsDetails.entryDate) &&
        Objects.equals(this.lastPaymentId, billUnitCollectionsDetails.lastPaymentId) &&
        Objects.equals(this.lastPaymentAmount, billUnitCollectionsDetails.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentEffectiveDate, billUnitCollectionsDetails.lastPaymentEffectiveDate) &&
        Objects.equals(this.currency, billUnitCollectionsDetails.currency) &&
        Objects.equals(this.collectionAgent, billUnitCollectionsDetails.collectionAgent) &&
        Objects.equals(this.scenarioName, billUnitCollectionsDetails.scenarioName) &&
        Objects.equals(this.notes, billUnitCollectionsDetails.notes) &&
        Objects.equals(this.numberOfTimesInCollections, billUnitCollectionsDetails.numberOfTimesInCollections) &&
        Objects.equals(this.collectionsGroupId, billUnitCollectionsDetails.collectionsGroupId) &&
        Objects.equals(this.collectionsActions, billUnitCollectionsDetails.collectionsActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioId, billUnitId, billUnitName, overdueAmount, minimumPayment, overdueDays, entryDate, lastPaymentId, lastPaymentAmount, lastPaymentEffectiveDate, currency, collectionAgent, scenarioName, notes, numberOfTimesInCollections, collectionsGroupId, collectionsActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillUnitCollectionsDetails {\n");
    
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    billUnitId: ").append(toIndentedString(billUnitId)).append("\n");
    sb.append("    billUnitName: ").append(toIndentedString(billUnitName)).append("\n");
    sb.append("    overdueAmount: ").append(toIndentedString(overdueAmount)).append("\n");
    sb.append("    minimumPayment: ").append(toIndentedString(minimumPayment)).append("\n");
    sb.append("    overdueDays: ").append(toIndentedString(overdueDays)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
    sb.append("    lastPaymentId: ").append(toIndentedString(lastPaymentId)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentEffectiveDate: ").append(toIndentedString(lastPaymentEffectiveDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    collectionAgent: ").append(toIndentedString(collectionAgent)).append("\n");
    sb.append("    scenarioName: ").append(toIndentedString(scenarioName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    numberOfTimesInCollections: ").append(toIndentedString(numberOfTimesInCollections)).append("\n");
    sb.append("    collectionsGroupId: ").append(toIndentedString(collectionsGroupId)).append("\n");
    sb.append("    collectionsActions: ").append(toIndentedString(collectionsActions)).append("\n");
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
