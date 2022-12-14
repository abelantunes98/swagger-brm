package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DataArray;
import io.swagger.model.Extrating;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProfileServExtratingType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ProfileServExtratingType   {
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

  @JsonProperty("dataArray")
  @Valid
  private List<DataArray> dataArray = null;

  @JsonProperty("extrating")
  private Extrating extrating = null;

  public ProfileServExtratingType extension(Object extension) {
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

  public ProfileServExtratingType id(ResourceRef id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getId() {
    return id;
  }

  public void setId(ResourceRef id) {
    this.id = id;
  }

  public ProfileServExtratingType creationDate(OffsetDateTime creationDate) {
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

  public ProfileServExtratingType accountObj(ResourceRef accountObj) {
    this.accountObj = accountObj;
    return this;
  }

  /**
   * Get accountObj
   * @return accountObj
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getAccountObj() {
    return accountObj;
  }

  public void setAccountObj(ResourceRef accountObj) {
    this.accountObj = accountObj;
  }

  public ProfileServExtratingType serviceObj(ResourceRef serviceObj) {
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

  public ProfileServExtratingType name(String name) {
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

  public ProfileServExtratingType selected(Boolean selected) {
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

  public ProfileServExtratingType parentName(String parentName) {
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

  public ProfileServExtratingType multiValued(Boolean multiValued) {
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

  public ProfileServExtratingType dataArray(List<DataArray> dataArray) {
    this.dataArray = dataArray;
    return this;
  }

  public ProfileServExtratingType addDataArrayItem(DataArray dataArrayItem) {
    if (this.dataArray == null) {
      this.dataArray = new ArrayList<DataArray>();
    }
    this.dataArray.add(dataArrayItem);
    return this;
  }

  /**
   * A list of extended rating attributes (ERAs).
   * @return dataArray
   **/
  @Schema(description = "A list of extended rating attributes (ERAs).")
      @Valid
    public List<DataArray> getDataArray() {
    return dataArray;
  }

  public void setDataArray(List<DataArray> dataArray) {
    this.dataArray = dataArray;
  }

  public ProfileServExtratingType extrating(Extrating extrating) {
    this.extrating = extrating;
    return this;
  }

  /**
   * Get extrating
   * @return extrating
   **/
  @Schema(description = "")
  
    @Valid
    public Extrating getExtrating() {
    return extrating;
  }

  public void setExtrating(Extrating extrating) {
    this.extrating = extrating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileServExtratingType profileServExtratingType = (ProfileServExtratingType) o;
    return Objects.equals(this.extension, profileServExtratingType.extension) &&
        Objects.equals(this.id, profileServExtratingType.id) &&
        Objects.equals(this.creationDate, profileServExtratingType.creationDate) &&
        Objects.equals(this.accountObj, profileServExtratingType.accountObj) &&
        Objects.equals(this.serviceObj, profileServExtratingType.serviceObj) &&
        Objects.equals(this.name, profileServExtratingType.name) &&
        Objects.equals(this.selected, profileServExtratingType.selected) &&
        Objects.equals(this.parentName, profileServExtratingType.parentName) &&
        Objects.equals(this.multiValued, profileServExtratingType.multiValued) &&
        Objects.equals(this.dataArray, profileServExtratingType.dataArray) &&
        Objects.equals(this.extrating, profileServExtratingType.extrating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, creationDate, accountObj, serviceObj, name, selected, parentName, multiValued, dataArray, extrating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileServExtratingType {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    accountObj: ").append(toIndentedString(accountObj)).append("\n");
    sb.append("    serviceObj: ").append(toIndentedString(serviceObj)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    multiValued: ").append(toIndentedString(multiValued)).append("\n");
    sb.append("    dataArray: ").append(toIndentedString(dataArray)).append("\n");
    sb.append("    extrating: ").append(toIndentedString(extrating)).append("\n");
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
