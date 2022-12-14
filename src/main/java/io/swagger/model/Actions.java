package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of collections actions.
 */
@Schema(description = "List of collections actions.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Actions   {
  @JsonProperty("actionId")
  private String actionId = null;

  @JsonProperty("action")
  private String action = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("completedDate")
  private OffsetDateTime completedDate = null;

  @JsonProperty("status")
  private Integer status = null;

  public Actions actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * The ID of the collections action.
   * @return actionId
   **/
  @Schema(required = true, description = "The ID of the collections action.")
      @NotNull

    public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public Actions action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The collections action's name.
   * @return action
   **/
  @Schema(required = true, description = "The collections action's name.")
      @NotNull

    public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Actions dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The date and time the collections action is due.
   * @return dueDate
   **/
  @Schema(required = true, description = "The date and time the collections action is due.")
      @NotNull

    @Valid
    public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Actions completedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * The date and time the collections action was completed.
   * @return completedDate
   **/
  @Schema(required = true, description = "The date and time the collections action was completed.")
      @NotNull

    @Valid
    public OffsetDateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }

  public Actions status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the collections action: pending (<b>0</b>), cancelled (<b>1</b>), completed (<b>2</b>), error (<b>3</b>), and no execute (<b>4</b>).
   * @return status
   **/
  @Schema(description = "The status of the collections action: pending (<b>0</b>), cancelled (<b>1</b>), completed (<b>2</b>), error (<b>3</b>), and no execute (<b>4</b>).")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Actions actions = (Actions) o;
    return Objects.equals(this.actionId, actions.actionId) &&
        Objects.equals(this.action, actions.action) &&
        Objects.equals(this.dueDate, actions.dueDate) &&
        Objects.equals(this.completedDate, actions.completedDate) &&
        Objects.equals(this.status, actions.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, action, dueDate, completedDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Actions {\n");
    
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
