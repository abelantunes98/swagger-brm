package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Devices;
import io.swagger.model.ProfileBase;
import io.swagger.model.ServiceBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateServiceProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class UpdateServiceProfile   {
  @JsonProperty("service")
  private ServiceBase service = null;

  @JsonProperty("devices")
  @Valid
  private List<Devices> devices = null;

  @JsonProperty("profile")
  private ProfileBase profile = null;

  public UpdateServiceProfile service(ServiceBase service) {
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

  public UpdateServiceProfile devices(List<Devices> devices) {
    this.devices = devices;
    return this;
  }

  public UpdateServiceProfile addDevicesItem(Devices devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<Devices>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * The list of devices associated with the service profile.
   * @return devices
   **/
  @Schema(description = "The list of devices associated with the service profile.")
      @Valid
    public List<Devices> getDevices() {
    return devices;
  }

  public void setDevices(List<Devices> devices) {
    this.devices = devices;
  }

  public UpdateServiceProfile profile(ProfileBase profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   **/
  @Schema(description = "")
  
    @Valid
    public ProfileBase getProfile() {
    return profile;
  }

  public void setProfile(ProfileBase profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceProfile updateServiceProfile = (UpdateServiceProfile) o;
    return Objects.equals(this.service, updateServiceProfile.service) &&
        Objects.equals(this.devices, updateServiceProfile.devices) &&
        Objects.equals(this.profile, updateServiceProfile.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, devices, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceProfile {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
