package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DDObjectSpecFields;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A data dictionary object, or storable class.
 */
@Schema(description = "A data dictionary object, or storable class.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DDObjectSpec   {
  @JsonProperty("className")
  private String className = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("descr")
  private String descr = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("fields")
  @Valid
  private List<DDObjectSpecFields> fields = null;

  public DDObjectSpec className(String className) {
    this.className = className;
    return this;
  }

  /**
   * The storable class name.
   * @return className
   **/
  @Schema(required = true, description = "The storable class name.")
      @NotNull

    public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public DDObjectSpec status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the storable class.
   * @return status
   **/
  @Schema(description = "The status of the storable class.")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public DDObjectSpec descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The storable class description.
   * @return descr
   **/
  @Schema(description = "The storable class description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public DDObjectSpec label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The storable class label.
   * @return label
   **/
  @Schema(description = "The storable class label.")
  
    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DDObjectSpec fields(List<DDObjectSpecFields> fields) {
    this.fields = fields;
    return this;
  }

  public DDObjectSpec addFieldsItem(DDObjectSpecFields fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<DDObjectSpecFields>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   **/
  @Schema(description = "")
      @Valid
    public List<DDObjectSpecFields> getFields() {
    return fields;
  }

  public void setFields(List<DDObjectSpecFields> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DDObjectSpec ddObjectSpec = (DDObjectSpec) o;
    return Objects.equals(this.className, ddObjectSpec.className) &&
        Objects.equals(this.status, ddObjectSpec.status) &&
        Objects.equals(this.descr, ddObjectSpec.descr) &&
        Objects.equals(this.label, ddObjectSpec.label) &&
        Objects.equals(this.fields, ddObjectSpec.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, status, descr, label, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DDObjectSpec {\n");
    
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
