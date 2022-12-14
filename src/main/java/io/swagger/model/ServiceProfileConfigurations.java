package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceProfileDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceProfileConfigurations
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServiceProfileConfigurations   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("serviceProfileDefinitions")
  @Valid
  private List<ServiceProfileDefinition> serviceProfileDefinitions = new ArrayList<ServiceProfileDefinition>();

  public ServiceProfileConfigurations extension(Object extension) {
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

  public ServiceProfileConfigurations serviceProfileDefinitions(List<ServiceProfileDefinition> serviceProfileDefinitions) {
    this.serviceProfileDefinitions = serviceProfileDefinitions;
    return this;
  }

  public ServiceProfileConfigurations addServiceProfileDefinitionsItem(ServiceProfileDefinition serviceProfileDefinitionsItem) {
    this.serviceProfileDefinitions.add(serviceProfileDefinitionsItem);
    return this;
  }

  /**
   * The list of definitions for the service profile configurations.
   * @return serviceProfileDefinitions
   **/
  @Schema(required = true, description = "The list of definitions for the service profile configurations.")
      @NotNull
    @Valid
    public List<ServiceProfileDefinition> getServiceProfileDefinitions() {
    return serviceProfileDefinitions;
  }

  public void setServiceProfileDefinitions(List<ServiceProfileDefinition> serviceProfileDefinitions) {
    this.serviceProfileDefinitions = serviceProfileDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProfileConfigurations serviceProfileConfigurations = (ServiceProfileConfigurations) o;
    return Objects.equals(this.extension, serviceProfileConfigurations.extension) &&
        Objects.equals(this.serviceProfileDefinitions, serviceProfileConfigurations.serviceProfileDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, serviceProfileDefinitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileConfigurations {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    serviceProfileDefinitions: ").append(toIndentedString(serviceProfileDefinitions)).append("\n");
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
