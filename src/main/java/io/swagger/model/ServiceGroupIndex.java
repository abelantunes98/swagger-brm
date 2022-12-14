package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of service groups associated with the bill unit.
 */
@Schema(description = "The list of service groups associated with the bill unit.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServiceGroupIndex   {
  @JsonProperty("serviceGroupElem")
  private Integer serviceGroupElem = null;

  public ServiceGroupIndex serviceGroupElem(Integer serviceGroupElem) {
    this.serviceGroupElem = serviceGroupElem;
    return this;
  }

  /**
   * The service group element.
   * @return serviceGroupElem
   **/
  @Schema(description = "The service group element.")
  
    public Integer getServiceGroupElem() {
    return serviceGroupElem;
  }

  public void setServiceGroupElem(Integer serviceGroupElem) {
    this.serviceGroupElem = serviceGroupElem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceGroupIndex serviceGroupIndex = (ServiceGroupIndex) o;
    return Objects.equals(this.serviceGroupElem, serviceGroupIndex.serviceGroupElem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceGroupElem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGroupIndex {\n");
    
    sb.append("    serviceGroupElem: ").append(toIndentedString(serviceGroupElem)).append("\n");
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
