package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about replacing a collections scenario.
 */
@Schema(description = "Details about replacing a collections scenario.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ReplaceScenarioDetails   {
  @JsonProperty("scenarioFromID")
  private String scenarioFromID = null;

  @JsonProperty("scenarioToID")
  private String scenarioToID = null;

  @JsonProperty("scheduleMode")
  private Integer scheduleMode = null;

  @JsonProperty("scheduleDate")
  private OffsetDateTime scheduleDate = null;

  @JsonProperty("considerEntryDays")
  private Integer considerEntryDays = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public ReplaceScenarioDetails scenarioFromID(String scenarioFromID) {
    this.scenarioFromID = scenarioFromID;
    return this;
  }

  /**
   * The ID of the old collections scenario that is being replaced.
   * @return scenarioFromID
   **/
  @Schema(description = "The ID of the old collections scenario that is being replaced.")
  
    public String getScenarioFromID() {
    return scenarioFromID;
  }

  public void setScenarioFromID(String scenarioFromID) {
    this.scenarioFromID = scenarioFromID;
  }

  public ReplaceScenarioDetails scenarioToID(String scenarioToID) {
    this.scenarioToID = scenarioToID;
    return this;
  }

  /**
   * The ID of the new collections scenario.
   * @return scenarioToID
   **/
  @Schema(description = "The ID of the new collections scenario.")
  
    public String getScenarioToID() {
    return scenarioToID;
  }

  public void setScenarioToID(String scenarioToID) {
    this.scenarioToID = scenarioToID;
  }

  public ReplaceScenarioDetails scheduleMode(Integer scheduleMode) {
    this.scheduleMode = scheduleMode;
    return this;
  }

  /**
   * The collections scheduling mode, such as billing due date or user billing date.
   * @return scheduleMode
   **/
  @Schema(description = "The collections scheduling mode, such as billing due date or user billing date.")
  
    public Integer getScheduleMode() {
    return scheduleMode;
  }

  public void setScheduleMode(Integer scheduleMode) {
    this.scheduleMode = scheduleMode;
  }

  public ReplaceScenarioDetails scheduleDate(OffsetDateTime scheduleDate) {
    this.scheduleDate = scheduleDate;
    return this;
  }

  /**
   * The date and time the new scenario actions are to be scheduled. This field is relevant only if the schedule mode is set to the user billing date. If no date is passed in and the schedule mode is user billing date, the scenario actions are scheduled for the current date.
   * @return scheduleDate
   **/
  @Schema(description = "The date and time the new scenario actions are to be scheduled. This field is relevant only if the schedule mode is set to the user billing date. If no date is passed in and the schedule mode is user billing date, the scenario actions are scheduled for the current date.")
  
    @Valid
    public OffsetDateTime getScheduleDate() {
    return scheduleDate;
  }

  public void setScheduleDate(OffsetDateTime scheduleDate) {
    this.scheduleDate = scheduleDate;
  }

  public ReplaceScenarioDetails considerEntryDays(Integer considerEntryDays) {
    this.considerEntryDays = considerEntryDays;
    return this;
  }

  /**
   * When calculating the due date for new scenario actions, whether to ignore the new collections scenario entry days (<b>0</b>) or to use the new entry days (<b>1</b>).
   * @return considerEntryDays
   **/
  @Schema(description = "When calculating the due date for new scenario actions, whether to ignore the new collections scenario entry days (<b>0</b>) or to use the new entry days (<b>1</b>).")
  
    public Integer getConsiderEntryDays() {
    return considerEntryDays;
  }

  public void setConsiderEntryDays(Integer considerEntryDays) {
    this.considerEntryDays = considerEntryDays;
  }

  public ReplaceScenarioDetails notes(Notes notes) {
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
    ReplaceScenarioDetails replaceScenarioDetails = (ReplaceScenarioDetails) o;
    return Objects.equals(this.scenarioFromID, replaceScenarioDetails.scenarioFromID) &&
        Objects.equals(this.scenarioToID, replaceScenarioDetails.scenarioToID) &&
        Objects.equals(this.scheduleMode, replaceScenarioDetails.scheduleMode) &&
        Objects.equals(this.scheduleDate, replaceScenarioDetails.scheduleDate) &&
        Objects.equals(this.considerEntryDays, replaceScenarioDetails.considerEntryDays) &&
        Objects.equals(this.notes, replaceScenarioDetails.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioFromID, scenarioToID, scheduleMode, scheduleDate, considerEntryDays, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceScenarioDetails {\n");
    
    sb.append("    scenarioFromID: ").append(toIndentedString(scenarioFromID)).append("\n");
    sb.append("    scenarioToID: ").append(toIndentedString(scenarioToID)).append("\n");
    sb.append("    scheduleMode: ").append(toIndentedString(scheduleMode)).append("\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    considerEntryDays: ").append(toIndentedString(considerEntryDays)).append("\n");
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
