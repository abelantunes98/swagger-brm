package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EditAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class EditAction   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("rescheduleDate")
  private OffsetDateTime rescheduleDate = null;

  @JsonProperty("rescheduleAction")
  private Boolean rescheduleAction = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("actionFlag")
  private Integer actionFlag = null;

  @JsonProperty("slipByDays")
  private Integer slipByDays = null;

  @JsonProperty("cancelFollowupActions")
  private Boolean cancelFollowupActions = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public EditAction extension(Object extension) {
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

  public EditAction rescheduleDate(OffsetDateTime rescheduleDate) {
    this.rescheduleDate = rescheduleDate;
    return this;
  }

  /**
   * The date and time to reschedule the collections action to. If <b>rescheduleAction</b> is set to <b>false</b>, specify an empty string here.
   * @return rescheduleDate
   **/
  @Schema(required = true, description = "The date and time to reschedule the collections action to. If <b>rescheduleAction</b> is set to <b>false</b>, specify an empty string here.")
      @NotNull

    @Valid
    public OffsetDateTime getRescheduleDate() {
    return rescheduleDate;
  }

  public void setRescheduleDate(OffsetDateTime rescheduleDate) {
    this.rescheduleDate = rescheduleDate;
  }

  public EditAction rescheduleAction(Boolean rescheduleAction) {
    this.rescheduleAction = rescheduleAction;
    return this;
  }

  /**
   * Whether to reschedule the collections action (<b>true</b>) or not (<b>false</b>).
   * @return rescheduleAction
   **/
  @Schema(description = "Whether to reschedule the collections action (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isRescheduleAction() {
    return rescheduleAction;
  }

  public void setRescheduleAction(Boolean rescheduleAction) {
    this.rescheduleAction = rescheduleAction;
  }

  public EditAction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount due to be collected.
   * @return amount
   **/
  @Schema(description = "The amount due to be collected.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public EditAction status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The collection action's status. Can be one of the following: <ul><li><b>0</b>: Pending</li><li><b>1</b>: Canceled</li><li><b>2</b>: Completed</li><li><b>3</b>: Error</li></ul>
   * @return status
   **/
  @Schema(description = "The collection action's status. Can be one of the following: <ul><li><b>0</b>: Pending</li><li><b>1</b>: Canceled</li><li><b>2</b>: Completed</li><li><b>3</b>: Error</li></ul>")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public EditAction actionFlag(Integer actionFlag) {
    this.actionFlag = actionFlag;
    return this;
  }

  /**
   * Which collections action to reschedule. Can be one of the following: <ul><li><b>0</b>: Only the selected action.</li><li><b>1</b>: All pending errored actions.</li><li><b>2</b>: Do not reschedule actions.</li></ul>
   * @return actionFlag
   **/
  @Schema(description = "Which collections action to reschedule. Can be one of the following: <ul><li><b>0</b>: Only the selected action.</li><li><b>1</b>: All pending errored actions.</li><li><b>2</b>: Do not reschedule actions.</li></ul>")
  
    public Integer getActionFlag() {
    return actionFlag;
  }

  public void setActionFlag(Integer actionFlag) {
    this.actionFlag = actionFlag;
  }

  public EditAction slipByDays(Integer slipByDays) {
    this.slipByDays = slipByDays;
    return this;
  }

  /**
   * The number of days to slip the schedule.
   * @return slipByDays
   **/
  @Schema(description = "The number of days to slip the schedule.")
  
    public Integer getSlipByDays() {
    return slipByDays;
  }

  public void setSlipByDays(Integer slipByDays) {
    this.slipByDays = slipByDays;
  }

  public EditAction cancelFollowupActions(Boolean cancelFollowupActions) {
    this.cancelFollowupActions = cancelFollowupActions;
    return this;
  }

  /**
   * Whether to cancel all follow-up actions (<b>true</b>) or keep the existing follow-up actions (<b>false</b>).
   * @return cancelFollowupActions
   **/
  @Schema(description = "Whether to cancel all follow-up actions (<b>true</b>) or keep the existing follow-up actions (<b>false</b>).")
  
    public Boolean isCancelFollowupActions() {
    return cancelFollowupActions;
  }

  public void setCancelFollowupActions(Boolean cancelFollowupActions) {
    this.cancelFollowupActions = cancelFollowupActions;
  }

  public EditAction notes(Notes notes) {
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
    EditAction editAction = (EditAction) o;
    return Objects.equals(this.extension, editAction.extension) &&
        Objects.equals(this.rescheduleDate, editAction.rescheduleDate) &&
        Objects.equals(this.rescheduleAction, editAction.rescheduleAction) &&
        Objects.equals(this.amount, editAction.amount) &&
        Objects.equals(this.status, editAction.status) &&
        Objects.equals(this.actionFlag, editAction.actionFlag) &&
        Objects.equals(this.slipByDays, editAction.slipByDays) &&
        Objects.equals(this.cancelFollowupActions, editAction.cancelFollowupActions) &&
        Objects.equals(this.notes, editAction.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, rescheduleDate, rescheduleAction, amount, status, actionFlag, slipByDays, cancelFollowupActions, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditAction {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    rescheduleDate: ").append(toIndentedString(rescheduleDate)).append("\n");
    sb.append("    rescheduleAction: ").append(toIndentedString(rescheduleAction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    actionFlag: ").append(toIndentedString(actionFlag)).append("\n");
    sb.append("    slipByDays: ").append(toIndentedString(slipByDays)).append("\n");
    sb.append("    cancelFollowupActions: ").append(toIndentedString(cancelFollowupActions)).append("\n");
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
