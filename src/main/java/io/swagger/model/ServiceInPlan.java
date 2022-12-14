package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Bundles;
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


public class ServiceInPlan   {
  @JsonProperty("serviceKey")
  private String serviceKey = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("balGrpIndex")
  private Integer balGrpIndex = null;

  @JsonProperty("groupParent")
  private Boolean groupParent = null;

  @JsonProperty("subscriptionIndex")
  private Integer subscriptionIndex = null;

  @JsonProperty("bundles")
  @Valid
  private List<Bundles> bundles = null;

  public ServiceInPlan serviceKey(String serviceKey) {
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

  public ServiceInPlan serviceType(String serviceType) {
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

  public ServiceInPlan balGrpIndex(Integer balGrpIndex) {
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

  public ServiceInPlan groupParent(Boolean groupParent) {
    this.groupParent = groupParent;
    return this;
  }

  /**
   * Whether this is a parent in the service group (<b>true</b>) or not (<b>false</b>).
   * @return groupParent
   **/
  @Schema(description = "Whether this is a parent in the service group (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isGroupParent() {
    return groupParent;
  }

  public void setGroupParent(Boolean groupParent) {
    this.groupParent = groupParent;
  }

  public ServiceInPlan subscriptionIndex(Integer subscriptionIndex) {
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

  public ServiceInPlan bundles(List<Bundles> bundles) {
    this.bundles = bundles;
    return this;
  }

  public ServiceInPlan addBundlesItem(Bundles bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<Bundles>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

  /**
   * The list of bundles in the service.
   * @return bundles
   **/
  @Schema(description = "The list of bundles in the service.")
      @Valid
    public List<Bundles> getBundles() {
    return bundles;
  }

  public void setBundles(List<Bundles> bundles) {
    this.bundles = bundles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInPlan serviceInPlan = (ServiceInPlan) o;
    return Objects.equals(this.serviceKey, serviceInPlan.serviceKey) &&
        Objects.equals(this.serviceType, serviceInPlan.serviceType) &&
        Objects.equals(this.balGrpIndex, serviceInPlan.balGrpIndex) &&
        Objects.equals(this.groupParent, serviceInPlan.groupParent) &&
        Objects.equals(this.subscriptionIndex, serviceInPlan.subscriptionIndex) &&
        Objects.equals(this.bundles, serviceInPlan.bundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceKey, serviceType, balGrpIndex, groupParent, subscriptionIndex, bundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInPlan {\n");
    
    sb.append("    serviceKey: ").append(toIndentedString(serviceKey)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    balGrpIndex: ").append(toIndentedString(balGrpIndex)).append("\n");
    sb.append("    groupParent: ").append(toIndentedString(groupParent)).append("\n");
    sb.append("    subscriptionIndex: ").append(toIndentedString(subscriptionIndex)).append("\n");
    sb.append("    bundles: ").append(toIndentedString(bundles)).append("\n");
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
