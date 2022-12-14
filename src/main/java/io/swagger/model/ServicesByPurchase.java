package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServicesByPurchase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServicesByPurchase   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("count")
  private Integer count = null;

  public ServicesByPurchase extension(Object extension) {
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

  public ServicesByPurchase serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * The service type.
   * @return serviceType
   **/
  @Schema(description = "The service type.")
  
    public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public ServicesByPurchase count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of services.
   * @return count
   **/
  @Schema(description = "The number of services.")
  
    public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesByPurchase servicesByPurchase = (ServicesByPurchase) o;
    return Objects.equals(this.extension, servicesByPurchase.extension) &&
        Objects.equals(this.serviceType, servicesByPurchase.serviceType) &&
        Objects.equals(this.count, servicesByPurchase.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, serviceType, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesByPurchase {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
