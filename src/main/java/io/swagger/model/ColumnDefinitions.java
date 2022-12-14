package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ColumnDefinitions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ColumnDefinitions   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("icon")
  private Boolean icon = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("visible")
  private Boolean visible = null;

  @JsonProperty("sortable")
  private Boolean sortable = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("resizable")
  private Boolean resizable = null;

  @JsonProperty("alignment")
  private String alignment = null;

  @JsonProperty("name")
  private String name = null;

  public ColumnDefinitions label(String label) {
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

  public ColumnDefinitions icon(Boolean icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
   **/
  @Schema(description = "")
  
    public Boolean isIcon() {
    return icon;
  }

  public void setIcon(Boolean icon) {
    this.icon = icon;
  }

  public ColumnDefinitions width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
   **/
  @Schema(description = "")
  
    public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public ColumnDefinitions visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
   **/
  @Schema(description = "")
  
    public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public ColumnDefinitions sortable(Boolean sortable) {
    this.sortable = sortable;
    return this;
  }

  /**
   * Get sortable
   * @return sortable
   **/
  @Schema(description = "")
  
    public Boolean isSortable() {
    return sortable;
  }

  public void setSortable(Boolean sortable) {
    this.sortable = sortable;
  }

  public ColumnDefinitions tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * Get tooltip
   * @return tooltip
   **/
  @Schema(description = "")
  
    public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public ColumnDefinitions resizable(Boolean resizable) {
    this.resizable = resizable;
    return this;
  }

  /**
   * Get resizable
   * @return resizable
   **/
  @Schema(description = "")
  
    public Boolean isResizable() {
    return resizable;
  }

  public void setResizable(Boolean resizable) {
    this.resizable = resizable;
  }

  public ColumnDefinitions alignment(String alignment) {
    this.alignment = alignment;
    return this;
  }

  /**
   * Get alignment
   * @return alignment
   **/
  @Schema(description = "")
  
    public String getAlignment() {
    return alignment;
  }

  public void setAlignment(String alignment) {
    this.alignment = alignment;
  }

  public ColumnDefinitions name(String name) {
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
    ColumnDefinitions columnDefinitions = (ColumnDefinitions) o;
    return Objects.equals(this.label, columnDefinitions.label) &&
        Objects.equals(this.icon, columnDefinitions.icon) &&
        Objects.equals(this.width, columnDefinitions.width) &&
        Objects.equals(this.visible, columnDefinitions.visible) &&
        Objects.equals(this.sortable, columnDefinitions.sortable) &&
        Objects.equals(this.tooltip, columnDefinitions.tooltip) &&
        Objects.equals(this.resizable, columnDefinitions.resizable) &&
        Objects.equals(this.alignment, columnDefinitions.alignment) &&
        Objects.equals(this.name, columnDefinitions.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, icon, width, visible, sortable, tooltip, resizable, alignment, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnDefinitions {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    sortable: ").append(toIndentedString(sortable)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    resizable: ").append(toIndentedString(resizable)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
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
