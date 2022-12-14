package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FieldGroups;
import io.swagger.model.FixedValues;
import io.swagger.model.Properties;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Criteria
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Criteria   {
  @JsonProperty("fieldGroups")
  @Valid
  private List<FieldGroups> fieldGroups = null;

  @JsonProperty("fieldKey")
  private String fieldKey = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("visible")
  private String visible = "true";

  @JsonProperty("storableClass")
  private String storableClass = null;

  @JsonProperty("inputType")
  private String inputType = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("spacer")
  private Boolean spacer = null;

  @JsonProperty("join")
  private String join = null;

  @JsonProperty("fixedValues")
  @Valid
  private List<FixedValues> fixedValues = new ArrayList<FixedValues>();

  @JsonProperty("properties")
  @Valid
  private List<Properties> properties = new ArrayList<Properties>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("default")
  private String _default = null;

  public Criteria fieldGroups(List<FieldGroups> fieldGroups) {
    this.fieldGroups = fieldGroups;
    return this;
  }

  public Criteria addFieldGroupsItem(FieldGroups fieldGroupsItem) {
    if (this.fieldGroups == null) {
      this.fieldGroups = new ArrayList<FieldGroups>();
    }
    this.fieldGroups.add(fieldGroupsItem);
    return this;
  }

  /**
   * Get fieldGroups
   * @return fieldGroups
   **/
  @Schema(description = "")
      @Valid
    public List<FieldGroups> getFieldGroups() {
    return fieldGroups;
  }

  public void setFieldGroups(List<FieldGroups> fieldGroups) {
    this.fieldGroups = fieldGroups;
  }

  public Criteria fieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
    return this;
  }

  /**
   * Get fieldKey
   * @return fieldKey
   **/
  @Schema(description = "")
  
    public String getFieldKey() {
    return fieldKey;
  }

  public void setFieldKey(String fieldKey) {
    this.fieldKey = fieldKey;
  }

  public Criteria type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Criteria visible(String visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
   **/
  @Schema(description = "")
  
    public String getVisible() {
    return visible;
  }

  public void setVisible(String visible) {
    this.visible = visible;
  }

  public Criteria storableClass(String storableClass) {
    this.storableClass = storableClass;
    return this;
  }

  /**
   * Get storableClass
   * @return storableClass
   **/
  @Schema(description = "")
  
    public String getStorableClass() {
    return storableClass;
  }

  public void setStorableClass(String storableClass) {
    this.storableClass = storableClass;
  }

  public Criteria inputType(String inputType) {
    this.inputType = inputType;
    return this;
  }

  /**
   * Get inputType
   * @return inputType
   **/
  @Schema(description = "")
  
    public String getInputType() {
    return inputType;
  }

  public void setInputType(String inputType) {
    this.inputType = inputType;
  }

  public Criteria label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   **/
  @Schema(description = "")
  
    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Criteria width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   **/
  @Schema(description = "")
  
    public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Criteria spacer(Boolean spacer) {
    this.spacer = spacer;
    return this;
  }

  /**
   * Get spacer
   * @return spacer
   **/
  @Schema(description = "")
  
    public Boolean isSpacer() {
    return spacer;
  }

  public void setSpacer(Boolean spacer) {
    this.spacer = spacer;
  }

  public Criteria join(String join) {
    this.join = join;
    return this;
  }

  /**
   * Get join
   * @return join
   **/
  @Schema(description = "")
  
    public String getJoin() {
    return join;
  }

  public void setJoin(String join) {
    this.join = join;
  }

  public Criteria fixedValues(List<FixedValues> fixedValues) {
    this.fixedValues = fixedValues;
    return this;
  }

  public Criteria addFixedValuesItem(FixedValues fixedValuesItem) {
    this.fixedValues.add(fixedValuesItem);
    return this;
  }

  /**
   * Get fixedValues
   * @return fixedValues
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<FixedValues> getFixedValues() {
    return fixedValues;
  }

  public void setFixedValues(List<FixedValues> fixedValues) {
    this.fixedValues = fixedValues;
  }

  public Criteria properties(List<Properties> properties) {
    this.properties = properties;
    return this;
  }

  public Criteria addPropertiesItem(Properties propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<Properties> getProperties() {
    return properties;
  }

  public void setProperties(List<Properties> properties) {
    this.properties = properties;
  }

  public Criteria name(String name) {
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

  public Criteria _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   **/
  @Schema(description = "")
  
    public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criteria criteria = (Criteria) o;
    return Objects.equals(this.fieldGroups, criteria.fieldGroups) &&
        Objects.equals(this.fieldKey, criteria.fieldKey) &&
        Objects.equals(this.type, criteria.type) &&
        Objects.equals(this.visible, criteria.visible) &&
        Objects.equals(this.storableClass, criteria.storableClass) &&
        Objects.equals(this.inputType, criteria.inputType) &&
        Objects.equals(this.label, criteria.label) &&
        Objects.equals(this.width, criteria.width) &&
        Objects.equals(this.spacer, criteria.spacer) &&
        Objects.equals(this.join, criteria.join) &&
        Objects.equals(this.fixedValues, criteria.fixedValues) &&
        Objects.equals(this.properties, criteria.properties) &&
        Objects.equals(this.name, criteria.name) &&
        Objects.equals(this._default, criteria._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldGroups, fieldKey, type, visible, storableClass, inputType, label, width, spacer, join, fixedValues, properties, name, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criteria {\n");
    
    sb.append("    fieldGroups: ").append(toIndentedString(fieldGroups)).append("\n");
    sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    storableClass: ").append(toIndentedString(storableClass)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    spacer: ").append(toIndentedString(spacer)).append("\n");
    sb.append("    join: ").append(toIndentedString(join)).append("\n");
    sb.append("    fixedValues: ").append(toIndentedString(fixedValues)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
