package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A state.
 */
@Schema(description = "A state.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class State   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("stateId")
  private Integer stateId = null;

  @JsonProperty("stateName")
  private String stateName = null;

  @JsonProperty("allowedTransitionStates")
  @Valid
  private List<Integer> allowedTransitionStates = null;

  public State extension(Object extension) {
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

  public State stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * The ID of the state.
   * @return stateId
   **/
  @Schema(description = "The ID of the state.")
  
    public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  public State stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

  /**
   * The name of the state.
   * @return stateName
   **/
  @Schema(required = true, description = "The name of the state.")
      @NotNull

    public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public State allowedTransitionStates(List<Integer> allowedTransitionStates) {
    this.allowedTransitionStates = allowedTransitionStates;
    return this;
  }

  public State addAllowedTransitionStatesItem(Integer allowedTransitionStatesItem) {
    if (this.allowedTransitionStates == null) {
      this.allowedTransitionStates = new ArrayList<Integer>();
    }
    this.allowedTransitionStates.add(allowedTransitionStatesItem);
    return this;
  }

  /**
   * The list of states that a resource can transition to.
   * @return allowedTransitionStates
   **/
  @Schema(description = "The list of states that a resource can transition to.")
  
    public List<Integer> getAllowedTransitionStates() {
    return allowedTransitionStates;
  }

  public void setAllowedTransitionStates(List<Integer> allowedTransitionStates) {
    this.allowedTransitionStates = allowedTransitionStates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.extension, state.extension) &&
        Objects.equals(this.stateId, state.stateId) &&
        Objects.equals(this.stateName, state.stateName) &&
        Objects.equals(this.allowedTransitionStates, state.allowedTransitionStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, stateId, stateName, allowedTransitionStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    allowedTransitionStates: ").append(toIndentedString(allowedTransitionStates)).append("\n");
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
