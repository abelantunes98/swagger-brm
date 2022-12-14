package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Item
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Item   {
  @JsonProperty("labelKey")
  private String labelKey = null;

  @JsonProperty("descriptionKey")
  private String descriptionKey = null;

  @JsonProperty("permissionKey")
  private String permissionKey = null;

  @JsonProperty("actionKey")
  private String actionKey = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("separator")
  private Boolean separator = null;

  public Item labelKey(String labelKey) {
    this.labelKey = labelKey;
    return this;
  }

  /**
   * Get labelKey
   * @return labelKey
   **/
  @Schema(description = "")
  
    public String getLabelKey() {
    return labelKey;
  }

  public void setLabelKey(String labelKey) {
    this.labelKey = labelKey;
  }

  public Item descriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
    return this;
  }

  /**
   * Get descriptionKey
   * @return descriptionKey
   **/
  @Schema(description = "")
  
    public String getDescriptionKey() {
    return descriptionKey;
  }

  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  public Item permissionKey(String permissionKey) {
    this.permissionKey = permissionKey;
    return this;
  }

  /**
   * Get permissionKey
   * @return permissionKey
   **/
  @Schema(description = "")
  
    public String getPermissionKey() {
    return permissionKey;
  }

  public void setPermissionKey(String permissionKey) {
    this.permissionKey = permissionKey;
  }

  public Item actionKey(String actionKey) {
    this.actionKey = actionKey;
    return this;
  }

  /**
   * Get actionKey
   * @return actionKey
   **/
  @Schema(description = "")
  
    public String getActionKey() {
    return actionKey;
  }

  public void setActionKey(String actionKey) {
    this.actionKey = actionKey;
  }

  public Item version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Item id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item separator(Boolean separator) {
    this.separator = separator;
    return this;
  }

  /**
   * Get separator
   * @return separator
   **/
  @Schema(description = "")
  
    public Boolean isSeparator() {
    return separator;
  }

  public void setSeparator(Boolean separator) {
    this.separator = separator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.labelKey, item.labelKey) &&
        Objects.equals(this.descriptionKey, item.descriptionKey) &&
        Objects.equals(this.permissionKey, item.permissionKey) &&
        Objects.equals(this.actionKey, item.actionKey) &&
        Objects.equals(this.version, item.version) &&
        Objects.equals(this.id, item.id) &&
        Objects.equals(this.separator, item.separator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelKey, descriptionKey, permissionKey, actionKey, version, id, separator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    
    sb.append("    labelKey: ").append(toIndentedString(labelKey)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    permissionKey: ").append(toIndentedString(permissionKey)).append("\n");
    sb.append("    actionKey: ").append(toIndentedString(actionKey)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
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
