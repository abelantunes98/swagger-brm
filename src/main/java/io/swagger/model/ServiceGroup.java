package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PurchasedBundle;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A service.
 */
@Schema(description = "A service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServiceGroup   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("lastStatusChange")
  private OffsetDateTime lastStatusChange = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("bundles")
  @Valid
  private List<PurchasedBundle> bundles = null;

  public ServiceGroup extension(Object extension) {
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

  public ServiceGroup serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * The service's ID.
   * @return serviceId
   **/
  @Schema(description = "The service's ID.")
  
    public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public ServiceGroup serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The service's name.
   * @return serviceName
   **/
  @Schema(description = "The service's name.")
  
    public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public ServiceGroup serviceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
    return this;
  }

  /**
   * Get serviceRef
   * @return serviceRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getServiceRef() {
    return serviceRef;
  }

  public void setServiceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
  }

  public ServiceGroup lastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
    return this;
  }

  /**
   * The date and time the service's status was last modified.
   * @return lastStatusChange
   **/
  @Schema(description = "The date and time the service's status was last modified.")
  
    @Valid
    public OffsetDateTime getLastStatusChange() {
    return lastStatusChange;
  }

  public void setLastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
  }

  public ServiceGroup status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The service's status.
   * @return status
   **/
  @Schema(description = "The service's status.")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ServiceGroup bundles(List<PurchasedBundle> bundles) {
    this.bundles = bundles;
    return this;
  }

  public ServiceGroup addBundlesItem(PurchasedBundle bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<PurchasedBundle>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

  /**
   * A list of bundles associated with the service.
   * @return bundles
   **/
  @Schema(description = "A list of bundles associated with the service.")
      @Valid
    public List<PurchasedBundle> getBundles() {
    return bundles;
  }

  public void setBundles(List<PurchasedBundle> bundles) {
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
    ServiceGroup serviceGroup = (ServiceGroup) o;
    return Objects.equals(this.extension, serviceGroup.extension) &&
        Objects.equals(this.serviceId, serviceGroup.serviceId) &&
        Objects.equals(this.serviceName, serviceGroup.serviceName) &&
        Objects.equals(this.serviceRef, serviceGroup.serviceRef) &&
        Objects.equals(this.lastStatusChange, serviceGroup.lastStatusChange) &&
        Objects.equals(this.status, serviceGroup.status) &&
        Objects.equals(this.bundles, serviceGroup.bundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, serviceId, serviceName, serviceRef, lastStatusChange, status, bundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGroup {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    lastStatusChange: ").append(toIndentedString(lastStatusChange)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
