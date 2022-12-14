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
 * The list of collections action activities.
 */
@Schema(description = "The list of collections action activities.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ActionHistory   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("agentName")
  private String agentName = null;

  @JsonProperty("status")
  private Integer status = null;

  public ActionHistory description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the collections action.
   * @return description
   **/
  @Schema(required = true, description = "The description of the collections action.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ActionHistory dueDate(OffsetDateTime dueDate) {
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

  public ActionHistory changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

  /**
   * The date and time there was a change to the collections action.
   * @return changeDate
   **/
  @Schema(required = true, description = "The date and time there was a change to the collections action.")
      @NotNull

    @Valid
    public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public ActionHistory agentName(String agentName) {
    this.agentName = agentName;
    return this;
  }

  /**
   * The name of the agent that performed the collections action.
   * @return agentName
   **/
  @Schema(required = true, description = "The name of the agent that performed the collections action.")
      @NotNull

    public String getAgentName() {
    return agentName;
  }

  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }

  public ActionHistory status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the collections action&colon; action pending (<b>0</b>), action cancelled (<b>1</b>), action completed (<b>2</b>), or action error (<b>3</b>).
   * @return status
   **/
  @Schema(description = "The status of the collections action&colon; action pending (<b>0</b>), action cancelled (<b>1</b>), action completed (<b>2</b>), or action error (<b>3</b>).")
  
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
    ActionHistory actionHistory = (ActionHistory) o;
    return Objects.equals(this.description, actionHistory.description) &&
        Objects.equals(this.dueDate, actionHistory.dueDate) &&
        Objects.equals(this.changeDate, actionHistory.changeDate) &&
        Objects.equals(this.agentName, actionHistory.agentName) &&
        Objects.equals(this.status, actionHistory.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dueDate, changeDate, agentName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionHistory {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
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
