package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.State;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LifeCycleStates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class LifeCycleStates   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("servicesWithLifecycleStates")
  @Valid
  private List<String> servicesWithLifecycleStates = null;

  @JsonProperty("states")
  @Valid
  private List<State> states = null;

  public LifeCycleStates extension(Object extension) {
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

  public LifeCycleStates servicesWithLifecycleStates(List<String> servicesWithLifecycleStates) {
    this.servicesWithLifecycleStates = servicesWithLifecycleStates;
    return this;
  }

  public LifeCycleStates addServicesWithLifecycleStatesItem(String servicesWithLifecycleStatesItem) {
    if (this.servicesWithLifecycleStates == null) {
      this.servicesWithLifecycleStates = new ArrayList<String>();
    }
    this.servicesWithLifecycleStates.add(servicesWithLifecycleStatesItem);
    return this;
  }

  /**
   * The list of services associated with life cycle states.
   * @return servicesWithLifecycleStates
   **/
  @Schema(description = "The list of services associated with life cycle states.")
  
    public List<String> getServicesWithLifecycleStates() {
    return servicesWithLifecycleStates;
  }

  public void setServicesWithLifecycleStates(List<String> servicesWithLifecycleStates) {
    this.servicesWithLifecycleStates = servicesWithLifecycleStates;
  }

  public LifeCycleStates states(List<State> states) {
    this.states = states;
    return this;
  }

  public LifeCycleStates addStatesItem(State statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<State>();
    }
    this.states.add(statesItem);
    return this;
  }

  /**
   * The list of supported states.
   * @return states
   **/
  @Schema(description = "The list of supported states.")
      @Valid
    public List<State> getStates() {
    return states;
  }

  public void setStates(List<State> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifeCycleStates lifeCycleStates = (LifeCycleStates) o;
    return Objects.equals(this.extension, lifeCycleStates.extension) &&
        Objects.equals(this.servicesWithLifecycleStates, lifeCycleStates.servicesWithLifecycleStates) &&
        Objects.equals(this.states, lifeCycleStates.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, servicesWithLifecycleStates, states);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifeCycleStates {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    servicesWithLifecycleStates: ").append(toIndentedString(servicesWithLifecycleStates)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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
