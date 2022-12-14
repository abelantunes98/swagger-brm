package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ResourceDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  @JsonProperty("resourceName")
  private String resourceName = null;

  @JsonProperty("resourceCode")
  private String resourceCode = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("numberOfDecimalPlaces")
  private Integer numberOfDecimalPlaces = null;

  @JsonProperty("currencyResource")
  private Boolean currencyResource = false;

  public ResourceDetails extension(Object extension) {
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

  public ResourceDetails resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The resource's ID.
   * @return resourceId
   **/
  @Schema(description = "The resource's ID.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public ResourceDetails resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The resource's name.
   * @return resourceName
   **/
  @Schema(description = "The resource's name.")
  
    public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public ResourceDetails resourceCode(String resourceCode) {
    this.resourceCode = resourceCode;
    return this;
  }

  /**
   * The resource's code.
   * @return resourceCode
   **/
  @Schema(description = "The resource's code.")
  
    public String getResourceCode() {
    return resourceCode;
  }

  public void setResourceCode(String resourceCode) {
    this.resourceCode = resourceCode;
  }

  public ResourceDetails symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * The resource's symbol.
   * @return symbol
   **/
  @Schema(description = "The resource's symbol.")
  
    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ResourceDetails numberOfDecimalPlaces(Integer numberOfDecimalPlaces) {
    this.numberOfDecimalPlaces = numberOfDecimalPlaces;
    return this;
  }

  /**
   * The number of decimal places for the resource.
   * @return numberOfDecimalPlaces
   **/
  @Schema(description = "The number of decimal places for the resource.")
  
    public Integer getNumberOfDecimalPlaces() {
    return numberOfDecimalPlaces;
  }

  public void setNumberOfDecimalPlaces(Integer numberOfDecimalPlaces) {
    this.numberOfDecimalPlaces = numberOfDecimalPlaces;
  }

  public ResourceDetails currencyResource(Boolean currencyResource) {
    this.currencyResource = currencyResource;
    return this;
  }

  /**
   * Whether this is a currency resource (<b>true</b>) or not (<b>false</b>). The default is <b>false</b>.
   * @return currencyResource
   **/
  @Schema(description = "Whether this is a currency resource (<b>true</b>) or not (<b>false</b>). The default is <b>false</b>.")
  
    public Boolean isCurrencyResource() {
    return currencyResource;
  }

  public void setCurrencyResource(Boolean currencyResource) {
    this.currencyResource = currencyResource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceDetails resourceDetails = (ResourceDetails) o;
    return Objects.equals(this.extension, resourceDetails.extension) &&
        Objects.equals(this.resourceId, resourceDetails.resourceId) &&
        Objects.equals(this.resourceName, resourceDetails.resourceName) &&
        Objects.equals(this.resourceCode, resourceDetails.resourceCode) &&
        Objects.equals(this.symbol, resourceDetails.symbol) &&
        Objects.equals(this.numberOfDecimalPlaces, resourceDetails.numberOfDecimalPlaces) &&
        Objects.equals(this.currencyResource, resourceDetails.currencyResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, resourceId, resourceName, resourceCode, symbol, numberOfDecimalPlaces, currencyResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceCode: ").append(toIndentedString(resourceCode)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    numberOfDecimalPlaces: ").append(toIndentedString(numberOfDecimalPlaces)).append("\n");
    sb.append("    currencyResource: ").append(toIndentedString(currencyResource)).append("\n");
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
