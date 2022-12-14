package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FieldGroups
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class FieldGroups   {
  @JsonProperty("groupLabel")
  private String groupLabel = null;

  @JsonProperty("groupOperator")
  private String groupOperator = null;

  public FieldGroups groupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
    return this;
  }

  /**
   * Get groupLabel
   * @return groupLabel
   **/
  @Schema(description = "")
  
    public String getGroupLabel() {
    return groupLabel;
  }

  public void setGroupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
  }

  public FieldGroups groupOperator(String groupOperator) {
    this.groupOperator = groupOperator;
    return this;
  }

  /**
   * Get groupOperator
   * @return groupOperator
   **/
  @Schema(description = "")
  
    public String getGroupOperator() {
    return groupOperator;
  }

  public void setGroupOperator(String groupOperator) {
    this.groupOperator = groupOperator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldGroups fieldGroups = (FieldGroups) o;
    return Objects.equals(this.groupLabel, fieldGroups.groupLabel) &&
        Objects.equals(this.groupOperator, fieldGroups.groupOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupLabel, groupOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldGroups {\n");
    
    sb.append("    groupLabel: ").append(toIndentedString(groupLabel)).append("\n");
    sb.append("    groupOperator: ").append(toIndentedString(groupOperator)).append("\n");
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
