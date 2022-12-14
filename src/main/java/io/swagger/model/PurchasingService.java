package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CustomizedBundleForPurchase;
import io.swagger.model.Devices;
import io.swagger.model.ProfileBase;
import io.swagger.model.ResourceRef;
import io.swagger.model.ServiceBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of services.
 */
@Schema(description = "The list of services.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PurchasingService   {
  @JsonProperty("service")
  private ServiceBase service = null;

  @JsonProperty("serviceKey")
  private String serviceKey = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("customizedBundles")
  @Valid
  private List<CustomizedBundleForPurchase> customizedBundles = null;

  @JsonProperty("balanceGroupRef")
  private ResourceRef balanceGroupRef = null;

  @JsonProperty("balGrpIndex")
  private Integer balGrpIndex = null;

  @JsonProperty("groupParent")
  private Boolean groupParent = null;

  @JsonProperty("subscriptionIndex")
  private Integer subscriptionIndex = null;

  @JsonProperty("devices")
  @Valid
  private List<Devices> devices = null;

  @JsonProperty("profiles")
  @Valid
  private List<ProfileBase> profiles = null;

  public PurchasingService service(ServiceBase service) {
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

  public PurchasingService serviceKey(String serviceKey) {
    this.serviceKey = serviceKey;
    return this;
  }

  /**
   * The service key.
   * @return serviceKey
   **/
  @Schema(required = true, description = "The service key.")
      @NotNull

    public String getServiceKey() {
    return serviceKey;
  }

  public void setServiceKey(String serviceKey) {
    this.serviceKey = serviceKey;
  }

  public PurchasingService serviceType(String serviceType) {
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

  public PurchasingService customizedBundles(List<CustomizedBundleForPurchase> customizedBundles) {
    this.customizedBundles = customizedBundles;
    return this;
  }

  public PurchasingService addCustomizedBundlesItem(CustomizedBundleForPurchase customizedBundlesItem) {
    if (this.customizedBundles == null) {
      this.customizedBundles = new ArrayList<CustomizedBundleForPurchase>();
    }
    this.customizedBundles.add(customizedBundlesItem);
    return this;
  }

  /**
   * The list customized bundles associated with the service.
   * @return customizedBundles
   **/
  @Schema(description = "The list customized bundles associated with the service.")
      @Valid
    public List<CustomizedBundleForPurchase> getCustomizedBundles() {
    return customizedBundles;
  }

  public void setCustomizedBundles(List<CustomizedBundleForPurchase> customizedBundles) {
    this.customizedBundles = customizedBundles;
  }

  public PurchasingService balanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
    return this;
  }

  /**
   * Get balanceGroupRef
   * @return balanceGroupRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBalanceGroupRef() {
    return balanceGroupRef;
  }

  public void setBalanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
  }

  public PurchasingService balGrpIndex(Integer balGrpIndex) {
    this.balGrpIndex = balGrpIndex;
    return this;
  }

  /**
   * The balance group index.
   * @return balGrpIndex
   **/
  @Schema(description = "The balance group index.")
  
    public Integer getBalGrpIndex() {
    return balGrpIndex;
  }

  public void setBalGrpIndex(Integer balGrpIndex) {
    this.balGrpIndex = balGrpIndex;
  }

  public PurchasingService groupParent(Boolean groupParent) {
    this.groupParent = groupParent;
    return this;
  }

  /**
   * Whether this is a parent in a service group (<b>true</b>) or not (<b>false</b>).
   * @return groupParent
   **/
  @Schema(description = "Whether this is a parent in a service group (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isGroupParent() {
    return groupParent;
  }

  public void setGroupParent(Boolean groupParent) {
    this.groupParent = groupParent;
  }

  public PurchasingService subscriptionIndex(Integer subscriptionIndex) {
    this.subscriptionIndex = subscriptionIndex;
    return this;
  }

  /**
   * The subscription index.
   * @return subscriptionIndex
   **/
  @Schema(description = "The subscription index.")
  
    public Integer getSubscriptionIndex() {
    return subscriptionIndex;
  }

  public void setSubscriptionIndex(Integer subscriptionIndex) {
    this.subscriptionIndex = subscriptionIndex;
  }

  public PurchasingService devices(List<Devices> devices) {
    this.devices = devices;
    return this;
  }

  public PurchasingService addDevicesItem(Devices devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<Devices>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * The list of devices associated with the service.
   * @return devices
   **/
  @Schema(description = "The list of devices associated with the service.")
      @Valid
    public List<Devices> getDevices() {
    return devices;
  }

  public void setDevices(List<Devices> devices) {
    this.devices = devices;
  }

  public PurchasingService profiles(List<ProfileBase> profiles) {
    this.profiles = profiles;
    return this;
  }

  public PurchasingService addProfilesItem(ProfileBase profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<ProfileBase>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * The list of profiles associated with the service.
   * @return profiles
   **/
  @Schema(description = "The list of profiles associated with the service.")
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
    PurchasingService purchasingService = (PurchasingService) o;
    return Objects.equals(this.service, purchasingService.service) &&
        Objects.equals(this.serviceKey, purchasingService.serviceKey) &&
        Objects.equals(this.serviceType, purchasingService.serviceType) &&
        Objects.equals(this.customizedBundles, purchasingService.customizedBundles) &&
        Objects.equals(this.balanceGroupRef, purchasingService.balanceGroupRef) &&
        Objects.equals(this.balGrpIndex, purchasingService.balGrpIndex) &&
        Objects.equals(this.groupParent, purchasingService.groupParent) &&
        Objects.equals(this.subscriptionIndex, purchasingService.subscriptionIndex) &&
        Objects.equals(this.devices, purchasingService.devices) &&
        Objects.equals(this.profiles, purchasingService.profiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, serviceKey, serviceType, customizedBundles, balanceGroupRef, balGrpIndex, groupParent, subscriptionIndex, devices, profiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchasingService {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    serviceKey: ").append(toIndentedString(serviceKey)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    customizedBundles: ").append(toIndentedString(customizedBundles)).append("\n");
    sb.append("    balanceGroupRef: ").append(toIndentedString(balanceGroupRef)).append("\n");
    sb.append("    balGrpIndex: ").append(toIndentedString(balGrpIndex)).append("\n");
    sb.append("    groupParent: ").append(toIndentedString(groupParent)).append("\n");
    sb.append("    subscriptionIndex: ").append(toIndentedString(subscriptionIndex)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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
