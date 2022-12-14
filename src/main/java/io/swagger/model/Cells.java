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
 * Cells
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Cells   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("args")
  @Valid
  private List<String> args = null;

  @JsonProperty("format")
  @Valid
  private List<String> format = null;

  @JsonProperty("styles")
  @Valid
  private List<String> styles = null;

  @JsonProperty("types")
  @Valid
  private List<String> types = null;

  @JsonProperty("name")
  private String name = null;

  public Cells type(String type) {
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

  public Cells args(List<String> args) {
    this.args = args;
    return this;
  }

  public Cells addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
   **/
  @Schema(description = "")
  
    public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public Cells format(List<String> format) {
    this.format = format;
    return this;
  }

  public Cells addFormatItem(String formatItem) {
    if (this.format == null) {
      this.format = new ArrayList<String>();
    }
    this.format.add(formatItem);
    return this;
  }

  /**
   * Get format
   * @return format
   **/
  @Schema(description = "")
  
    public List<String> getFormat() {
    return format;
  }

  public void setFormat(List<String> format) {
    this.format = format;
  }

  public Cells styles(List<String> styles) {
    this.styles = styles;
    return this;
  }

  public Cells addStylesItem(String stylesItem) {
    if (this.styles == null) {
      this.styles = new ArrayList<String>();
    }
    this.styles.add(stylesItem);
    return this;
  }

  /**
   * Get styles
   * @return styles
   **/
  @Schema(description = "")
  
    public List<String> getStyles() {
    return styles;
  }

  public void setStyles(List<String> styles) {
    this.styles = styles;
  }

  public Cells types(List<String> types) {
    this.types = types;
    return this;
  }

  public Cells addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
   **/
  @Schema(description = "")
  
    public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public Cells name(String name) {
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
    Cells cells = (Cells) o;
    return Objects.equals(this.type, cells.type) &&
        Objects.equals(this.args, cells.args) &&
        Objects.equals(this.format, cells.format) &&
        Objects.equals(this.styles, cells.styles) &&
        Objects.equals(this.types, cells.types) &&
        Objects.equals(this.name, cells.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, args, format, styles, types, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cells {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
