package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The storable class fields.
 */
@Schema(description = "The storable class fields.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DDObjectSpecFields   {
  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("fieldType")
  private String fieldType = null;

  @JsonProperty("smItemName")
  private String smItemName = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("descr")
  private String descr = null;

  public DDObjectSpecFields fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * The field's name.
   * @return fieldName
   **/
  @Schema(description = "The field's name.")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public DDObjectSpecFields fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * The field's data type.
   * @return fieldType
   **/
  @Schema(description = "The field's data type.")
  
    public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public DDObjectSpecFields smItemName(String smItemName) {
    this.smItemName = smItemName;
    return this;
  }

  /**
   * The name of the table or collection.
   * @return smItemName
   **/
  @Schema(description = "The name of the table or collection.")
  
    public String getSmItemName() {
    return smItemName;
  }

  public void setSmItemName(String smItemName) {
    this.smItemName = smItemName;
  }

  public DDObjectSpecFields label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The field's label.
   * @return label
   **/
  @Schema(description = "The field's label.")
  
    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DDObjectSpecFields descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The field's description.
   * @return descr
   **/
  @Schema(description = "The field's description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DDObjectSpecFields ddObjectSpecFields = (DDObjectSpecFields) o;
    return Objects.equals(this.fieldName, ddObjectSpecFields.fieldName) &&
        Objects.equals(this.fieldType, ddObjectSpecFields.fieldType) &&
        Objects.equals(this.smItemName, ddObjectSpecFields.smItemName) &&
        Objects.equals(this.label, ddObjectSpecFields.label) &&
        Objects.equals(this.descr, ddObjectSpecFields.descr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldType, smItemName, label, descr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DDObjectSpecFields {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    smItemName: ").append(toIndentedString(smItemName)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
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
