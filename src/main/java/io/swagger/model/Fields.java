package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of profile fields.
 */
@Schema(description = "The list of profile fields.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Fields   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("attribute")
  private String attribute = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("desc")
  private String desc = null;

  public Fields label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The field's label.
   * @return label
   **/
  @Schema(required = true, description = "The field's label.")
      @NotNull

    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Fields type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The field type. Can be one of the following: <ul><li>integer</li><li>decimal</li><li>string</li><li>date</li></ul>
   * @return type
   **/
  @Schema(required = true, description = "The field type. Can be one of the following: <ul><li>integer</li><li>decimal</li><li>string</li><li>date</li></ul>")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Fields attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * The field's attribute.
   * @return attribute
   **/
  @Schema(required = true, description = "The field's attribute.")
      @NotNull

    public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public Fields index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The position of the entry in the index. For example, the first service in a list would have an <b>index</b> value of <b>1</b>.
   * @return index
   **/
  @Schema(description = "The position of the entry in the index. For example, the first service in a list would have an <b>index</b> value of <b>1</b>.")
  
    public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Fields desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * The field's description.
   * @return desc
   **/
  @Schema(required = true, description = "The field's description.")
      @NotNull

    public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fields fields = (Fields) o;
    return Objects.equals(this.label, fields.label) &&
        Objects.equals(this.type, fields.type) &&
        Objects.equals(this.attribute, fields.attribute) &&
        Objects.equals(this.index, fields.index) &&
        Objects.equals(this.desc, fields.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, type, attribute, index, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fields {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
