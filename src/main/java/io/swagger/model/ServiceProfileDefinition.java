package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ProfileFields;
import io.swagger.model.ServiceFields;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of definitions for the service profile configurations.
 */
@Schema(description = "The list of definitions for the service profile configurations.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServiceProfileDefinition   {
  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("serviceFields")
  private ServiceFields serviceFields = null;

  @JsonProperty("profileFields")
  private ProfileFields profileFields = null;

  public ServiceProfileDefinition serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * The service the definition is for.
   * @return serviceType
   **/
  @Schema(required = true, description = "The service the definition is for.")
      @NotNull

    public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public ServiceProfileDefinition serviceFields(ServiceFields serviceFields) {
    this.serviceFields = serviceFields;
    return this;
  }

  /**
   * Get serviceFields
   * @return serviceFields
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceFields getServiceFields() {
    return serviceFields;
  }

  public void setServiceFields(ServiceFields serviceFields) {
    this.serviceFields = serviceFields;
  }

  public ServiceProfileDefinition profileFields(ProfileFields profileFields) {
    this.profileFields = profileFields;
    return this;
  }

  /**
   * Get profileFields
   * @return profileFields
   **/
  @Schema(description = "")
  
    @Valid
    public ProfileFields getProfileFields() {
    return profileFields;
  }

  public void setProfileFields(ProfileFields profileFields) {
    this.profileFields = profileFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProfileDefinition serviceProfileDefinition = (ServiceProfileDefinition) o;
    return Objects.equals(this.serviceType, serviceProfileDefinition.serviceType) &&
        Objects.equals(this.serviceFields, serviceProfileDefinition.serviceFields) &&
        Objects.equals(this.profileFields, serviceProfileDefinition.profileFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceType, serviceFields, profileFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfileDefinition {\n");
    
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    serviceFields: ").append(toIndentedString(serviceFields)).append("\n");
    sb.append("    profileFields: ").append(toIndentedString(profileFields)).append("\n");
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
