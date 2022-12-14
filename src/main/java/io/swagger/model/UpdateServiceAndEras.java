package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ProfileBase;
import io.swagger.model.ServiceBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateServiceAndEras
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class UpdateServiceAndEras   {
  @JsonProperty("service")
  private ServiceBase service = null;

  @JsonProperty("profiles")
  @Valid
  private List<ProfileBase> profiles = null;

  public UpdateServiceAndEras service(ServiceBase service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceBase getService() {
    return service;
  }

  public void setService(ServiceBase service) {
    this.service = service;
  }

  public UpdateServiceAndEras profiles(List<ProfileBase> profiles) {
    this.profiles = profiles;
    return this;
  }

  public UpdateServiceAndEras addProfilesItem(ProfileBase profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<ProfileBase>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * A list of profiles.
   * @return profiles
   **/
  @Schema(description = "A list of profiles.")
      @Valid
    public List<ProfileBase> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<ProfileBase> profiles) {
    this.profiles = profiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceAndEras updateServiceAndEras = (UpdateServiceAndEras) o;
    return Objects.equals(this.service, updateServiceAndEras.service) &&
        Objects.equals(this.profiles, updateServiceAndEras.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceAndEras {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
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
