package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The profile.
 */
@Schema(description = "The profile.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ProfileType   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private ResourceRef id = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("accountObj")
  private ResourceRef accountObj = null;

  @JsonProperty("serviceObj")
  private ResourceRef serviceObj = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  @JsonProperty("parentName")
  private String parentName = null;

  @JsonProperty("multiValued")
  private Boolean multiValued = null;

  public ProfileType extension(Object extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extended attributes.
   * @return extension
   **/
  @Schema(description = "The extended attributes.")
  
    public Object getExtension() {
    return extension;
  }

  public void setExtension(Object extension) {
    this.extension = extension;
  }

  public ProfileType id(ResourceRef id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getId() {
    return id;
  }

  public void setId(ResourceRef id) {
    this.id = id;
  }

  public ProfileType creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the profile was created.
   * @return creationDate
   **/
  @Schema(description = "The date and time the profile was created.")
  
    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ProfileType accountObj(ResourceRef accountObj) {
    this.accountObj = accountObj;
    return this;
  }

  /**
   * Get accountObj
   * @return accountObj
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountObj() {
    return accountObj;
  }

  public void setAccountObj(ResourceRef accountObj) {
    this.accountObj = accountObj;
  }

  public ProfileType serviceObj(ResourceRef serviceObj) {
    this.serviceObj = serviceObj;
    return this;
  }

  /**
   * Get serviceObj
   * @return serviceObj
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getServiceObj() {
    return serviceObj;
  }

  public void setServiceObj(ResourceRef serviceObj) {
    this.serviceObj = serviceObj;
  }

  public ProfileType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the profile.
   * @return name
   **/
  @Schema(description = "The name of the profile.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfileType selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Whether the profile is selected (<b>true</b>) or not (<b>false</b>).
   * @return selected
   **/
  @Schema(description = "Whether the profile is selected (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public ProfileType parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

  /**
   * The name of the parent profile.
   * @return parentName
   **/
  @Schema(description = "The name of the parent profile.")
  
    public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public ProfileType multiValued(Boolean multiValued) {
    this.multiValued = multiValued;
    return this;
  }

  /**
   * Whether the profile has multiple values (<b>true</b>) or not (<b>false</b>).
   * @return multiValued
   **/
  @Schema(description = "Whether the profile has multiple values (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isMultiValued() {
    return multiValued;
  }

  public void setMultiValued(Boolean multiValued) {
    this.multiValued = multiValued;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileType profileType = (ProfileType) o;
    return Objects.equals(this.extension, profileType.extension) &&
        Objects.equals(this.id, profileType.id) &&
        Objects.equals(this.creationDate, profileType.creationDate) &&
        Objects.equals(this.accountObj, profileType.accountObj) &&
        Objects.equals(this.serviceObj, profileType.serviceObj) &&
        Objects.equals(this.name, profileType.name) &&
        Objects.equals(this.selected, profileType.selected) &&
        Objects.equals(this.parentName, profileType.parentName) &&
        Objects.equals(this.multiValued, profileType.multiValued);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, creationDate, accountObj, serviceObj, name, selected, parentName, multiValued);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileType {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    accountObj: ").append(toIndentedString(accountObj)).append("\n");
    sb.append("    serviceObj: ").append(toIndentedString(serviceObj)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
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
