package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Groups;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Criterias
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Criterias   {
  @JsonProperty("groups")
  @Valid
  private List<Groups> groups = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("name")
  private String name = null;

  public Criterias groups(List<Groups> groups) {
    this.groups = groups;
    return this;
  }

  public Criterias addGroupsItem(Groups groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<Groups>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   **/
  @Schema(description = "")
      @Valid
    public List<Groups> getGroups() {
    return groups;
  }

  public void setGroups(List<Groups> groups) {
    this.groups = groups;
  }

  public Criterias field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public Criterias value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Criterias operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public Criterias name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criterias criterias = (Criterias) o;
    return Objects.equals(this.groups, criterias.groups) &&
        Objects.equals(this.field, criterias.field) &&
        Objects.equals(this.value, criterias.value) &&
        Objects.equals(this.operator, criterias.operator) &&
        Objects.equals(this.name, criterias.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, field, value, operator, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criterias {\n");
    
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
