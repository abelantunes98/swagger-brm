package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of collections actions for the account.
 */
@Schema(description = "The list of collections actions for the account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CollectionsActions   {
  @JsonProperty("action")
  private String action = null;

  @JsonProperty("actionId")
  private String actionId = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("completedDate")
  private OffsetDateTime completedDate = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("configCollectionsId")
  private String configCollectionsId = null;

  @JsonProperty("status")
  private Integer status = null;

  public CollectionsActions action(String action) {
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

  public CollectionsActions actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * The collections action's ID.
   * @return actionId
   **/
  @Schema(required = true, description = "The collections action's ID.")
      @NotNull

    public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public CollectionsActions dueDate(OffsetDateTime dueDate) {
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

  public CollectionsActions completedDate(OffsetDateTime completedDate) {
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

  public CollectionsActions amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The collections action amount.
   * @return amount
   **/
  @Schema(description = "The collections action amount.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public CollectionsActions configCollectionsId(String configCollectionsId) {
    this.configCollectionsId = configCollectionsId;
    return this;
  }

  /**
   * The collections action's configuration ID.
   * @return configCollectionsId
   **/
  @Schema(required = true, description = "The collections action's configuration ID.")
      @NotNull

    public String getConfigCollectionsId() {
    return configCollectionsId;
  }

  public void setConfigCollectionsId(String configCollectionsId) {
    this.configCollectionsId = configCollectionsId;
  }

  public CollectionsActions status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The collections action's status. Can be one of the following:<ul><li><b>0</b>: Pending</li><li><b>1</b>: Canceled</li><li><b>2</b>: Completed</li><li><b>3</b>: Error</li><li><b>4</b>: Did not run.<li><b>5</b>: Waiting for a dependent</li></ul>
   * @return status
   **/
  @Schema(description = "The collections action's status. Can be one of the following:<ul><li><b>0</b>: Pending</li><li><b>1</b>: Canceled</li><li><b>2</b>: Completed</li><li><b>3</b>: Error</li><li><b>4</b>: Did not run.<li><b>5</b>: Waiting for a dependent</li></ul>")
  
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
    CollectionsActions collectionsActions = (CollectionsActions) o;
    return Objects.equals(this.action, collectionsActions.action) &&
        Objects.equals(this.actionId, collectionsActions.actionId) &&
        Objects.equals(this.dueDate, collectionsActions.dueDate) &&
        Objects.equals(this.completedDate, collectionsActions.completedDate) &&
        Objects.equals(this.amount, collectionsActions.amount) &&
        Objects.equals(this.configCollectionsId, collectionsActions.configCollectionsId) &&
        Objects.equals(this.status, collectionsActions.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionId, dueDate, completedDate, amount, configCollectionsId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsActions {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    configCollectionsId: ").append(toIndentedString(configCollectionsId)).append("\n");
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
