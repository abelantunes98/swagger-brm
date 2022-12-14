package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Actions;
import io.swagger.model.AgingBuckets;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CollectionDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CollectionDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("scenarioId")
  private String scenarioId = null;

  @JsonProperty("billUnitId")
  private String billUnitId = null;

  @JsonProperty("overdueAmount")
  private BigDecimal overdueAmount = null;

  @JsonProperty("overdueDays")
  private Integer overdueDays = null;

  @JsonProperty("minimumDue")
  private BigDecimal minimumDue = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("agingBuckets")
  @Valid
  private List<AgingBuckets> agingBuckets = null;

  @JsonProperty("actions")
  @Valid
  private List<Actions> actions = null;

  public CollectionDetails extension(Object extension) {
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

  public CollectionDetails scenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

  /**
   * The ID of the collections scenario.
   * @return scenarioId
   **/
  @Schema(required = true, description = "The ID of the collections scenario.")
      @NotNull

    public String getScenarioId() {
    return scenarioId;
  }

  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }

  public CollectionDetails billUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
    return this;
  }

  /**
   * The ID of the bill unit.
   * @return billUnitId
   **/
  @Schema(required = true, description = "The ID of the bill unit.")
      @NotNull

    public String getBillUnitId() {
    return billUnitId;
  }

  public void setBillUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
  }

  public CollectionDetails overdueAmount(BigDecimal overdueAmount) {
    this.overdueAmount = overdueAmount;
    return this;
  }

  /**
   * The amount that is past due.
   * @return overdueAmount
   **/
  @Schema(required = true, description = "The amount that is past due.")
      @NotNull

    @Valid
    public BigDecimal getOverdueAmount() {
    return overdueAmount;
  }

  public void setOverdueAmount(BigDecimal overdueAmount) {
    this.overdueAmount = overdueAmount;
  }

  public CollectionDetails overdueDays(Integer overdueDays) {
    this.overdueDays = overdueDays;
    return this;
  }

  /**
   * The number of days that the payment is past due.
   * @return overdueDays
   **/
  @Schema(description = "The number of days that the payment is past due.")
  
    public Integer getOverdueDays() {
    return overdueDays;
  }

  public void setOverdueDays(Integer overdueDays) {
    this.overdueDays = overdueDays;
  }

  public CollectionDetails minimumDue(BigDecimal minimumDue) {
    this.minimumDue = minimumDue;
    return this;
  }

  /**
   * The minimum payment amount.
   * @return minimumDue
   **/
  @Schema(required = true, description = "The minimum payment amount.")
      @NotNull

    @Valid
    public BigDecimal getMinimumDue() {
    return minimumDue;
  }

  public void setMinimumDue(BigDecimal minimumDue) {
    this.minimumDue = minimumDue;
  }

  public CollectionDetails notes(Notes notes) {
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

  public CollectionDetails agingBuckets(List<AgingBuckets> agingBuckets) {
    this.agingBuckets = agingBuckets;
    return this;
  }

  public CollectionDetails addAgingBucketsItem(AgingBuckets agingBucketsItem) {
    if (this.agingBuckets == null) {
      this.agingBuckets = new ArrayList<AgingBuckets>();
    }
    this.agingBuckets.add(agingBucketsItem);
    return this;
  }

  /**
   * A list of aging buckets.
   * @return agingBuckets
   **/
  @Schema(description = "A list of aging buckets.")
      @Valid
    public List<AgingBuckets> getAgingBuckets() {
    return agingBuckets;
  }

  public void setAgingBuckets(List<AgingBuckets> agingBuckets) {
    this.agingBuckets = agingBuckets;
  }

  public CollectionDetails actions(List<Actions> actions) {
    this.actions = actions;
    return this;
  }

  public CollectionDetails addActionsItem(Actions actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<Actions>();
    }
    this.actions.add(actionsItem);
    return this;
  }

  /**
   * A list of collections actions.
   * @return actions
   **/
  @Schema(description = "A list of collections actions.")
      @Valid
    public List<Actions> getActions() {
    return actions;
  }

  public void setActions(List<Actions> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionDetails collectionDetails = (CollectionDetails) o;
    return Objects.equals(this.extension, collectionDetails.extension) &&
        Objects.equals(this.scenarioId, collectionDetails.scenarioId) &&
        Objects.equals(this.billUnitId, collectionDetails.billUnitId) &&
        Objects.equals(this.overdueAmount, collectionDetails.overdueAmount) &&
        Objects.equals(this.overdueDays, collectionDetails.overdueDays) &&
        Objects.equals(this.minimumDue, collectionDetails.minimumDue) &&
        Objects.equals(this.notes, collectionDetails.notes) &&
        Objects.equals(this.agingBuckets, collectionDetails.agingBuckets) &&
        Objects.equals(this.actions, collectionDetails.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, scenarioId, billUnitId, overdueAmount, overdueDays, minimumDue, notes, agingBuckets, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    billUnitId: ").append(toIndentedString(billUnitId)).append("\n");
    sb.append("    overdueAmount: ").append(toIndentedString(overdueAmount)).append("\n");
    sb.append("    overdueDays: ").append(toIndentedString(overdueDays)).append("\n");
    sb.append("    minimumDue: ").append(toIndentedString(minimumDue)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    agingBuckets: ").append(toIndentedString(agingBuckets)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
