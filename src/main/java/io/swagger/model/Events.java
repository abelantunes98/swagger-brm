package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The events.
 */
@Schema(description = "The events.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Events   {
  @JsonProperty("eventRef")
  @Valid
  private List<ResourceRef> eventRef = new ArrayList<ResourceRef>();

  public Events eventRef(List<ResourceRef> eventRef) {
    this.eventRef = eventRef;
    return this;
  }

  public Events addEventRefItem(ResourceRef eventRefItem) {
    this.eventRef.add(eventRefItem);
    return this;
  }

  /**
   * The list of event resources.
   * @return eventRef
   **/
  @Schema(required = true, description = "The list of event resources.")
      @NotNull
    @Valid
    public List<ResourceRef> getEventRef() {
    return eventRef;
  }

  public void setEventRef(List<ResourceRef> eventRef) {
    this.eventRef = eventRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events events = (Events) o;
    return Objects.equals(this.eventRef, events.eventRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events {\n");
    
    sb.append("    eventRef: ").append(toIndentedString(eventRef)).append("\n");
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
