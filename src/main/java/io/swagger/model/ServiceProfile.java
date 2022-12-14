package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DeviceType;
import io.swagger.model.ProfileType;
import io.swagger.model.ServiceType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A service profile.
 */
@Schema(description = "A service profile.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServiceProfile   {
  @JsonProperty("service")
  private ServiceType service = null;

  @JsonProperty("profile")
  private ProfileType profile = null;

  @JsonProperty("devices")
  @Valid
  private List<DeviceType> devices = null;

  public ServiceProfile service(ServiceType service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   **/
  @Schema(description = "")
  
    @Valid
    public ServiceType getService() {
    return service;
  }

  public void setService(ServiceType service) {
    this.service = service;
  }

  public ServiceProfile profile(ProfileType profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   **/
  @Schema(description = "")
  
    @Valid
    public ProfileType getProfile() {
    return profile;
  }

  public void setProfile(ProfileType profile) {
    this.profile = profile;
  }

  public ServiceProfile devices(List<DeviceType> devices) {
    this.devices = devices;
    return this;
  }

  public ServiceProfile addDevicesItem(DeviceType devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<DeviceType>();
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
    public List<DeviceType> getDevices() {
    return devices;
  }

  public void setDevices(List<DeviceType> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceProfile serviceProfile = (ServiceProfile) o;
    return Objects.equals(this.service, serviceProfile.service) &&
        Objects.equals(this.profile, serviceProfile.profile) &&
        Objects.equals(this.devices, serviceProfile.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, profile, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceProfile {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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
