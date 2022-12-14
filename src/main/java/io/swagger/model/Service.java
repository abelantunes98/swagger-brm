package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A service.
 */
@Schema(description = "A service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Service   {
  @JsonProperty("serviceKey")
  private String serviceKey = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  public Service serviceKey(String serviceKey) {
    this.serviceKey = serviceKey;
    return this;
  }

  /**
   * The service key.
   * @return serviceKey
   **/
  @Schema(description = "The service key.")
  
    public String getServiceKey() {
    return serviceKey;
  }

  public void setServiceKey(String serviceKey) {
    this.serviceKey = serviceKey;
  }

  public Service serviceType(String serviceType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.serviceKey, service.serviceKey) &&
        Objects.equals(this.serviceType, service.serviceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceKey, serviceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    serviceKey: ").append(toIndentedString(serviceKey)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
