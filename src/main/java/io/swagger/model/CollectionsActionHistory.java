package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ActionHistory;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about a collections action&#x27;s history.
 */
@Schema(description = "Details about a collections action's history.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CollectionsActionHistory   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionId")
  private String actionId = null;

  @JsonProperty("actionHistory")
  @Valid
  private List<ActionHistory> actionHistory = new ArrayList<ActionHistory>();

  public CollectionsActionHistory extension(Object extension) {
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

  public CollectionsActionHistory actionId(String actionId) {
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

  public CollectionsActionHistory actionHistory(List<ActionHistory> actionHistory) {
    this.actionHistory = actionHistory;
    return this;
  }

  public CollectionsActionHistory addActionHistoryItem(ActionHistory actionHistoryItem) {
    this.actionHistory.add(actionHistoryItem);
    return this;
  }

  /**
   * The list of collections action activities.
   * @return actionHistory
   **/
  @Schema(required = true, description = "The list of collections action activities.")
      @NotNull
    @Valid
    public List<ActionHistory> getActionHistory() {
    return actionHistory;
  }

  public void setActionHistory(List<ActionHistory> actionHistory) {
    this.actionHistory = actionHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionsActionHistory collectionsActionHistory = (CollectionsActionHistory) o;
    return Objects.equals(this.extension, collectionsActionHistory.extension) &&
        Objects.equals(this.actionId, collectionsActionHistory.actionId) &&
        Objects.equals(this.actionHistory, collectionsActionHistory.actionHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionId, actionHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsActionHistory {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionHistory: ").append(toIndentedString(actionHistory)).append("\n");
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
