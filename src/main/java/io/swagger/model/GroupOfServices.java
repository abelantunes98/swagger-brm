package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ServiceInPlan;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of services associated with the package.
 */
@Schema(description = "The list of services associated with the package.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class GroupOfServices   {
  @JsonProperty("service")
  @Valid
  private List<ServiceInPlan> service = null;

  @JsonProperty("groupIndex")
  private Integer groupIndex = null;

  public GroupOfServices service(List<ServiceInPlan> service) {
    this.service = service;
    return this;
  }

  public GroupOfServices addServiceItem(ServiceInPlan serviceItem) {
    if (this.service == null) {
      this.service = new ArrayList<ServiceInPlan>();
    }
    this.service.add(serviceItem);
    return this;
  }

  /**
   * The list of services.
   * @return service
   **/
  @Schema(description = "The list of services.")
      @Valid
    public List<ServiceInPlan> getService() {
    return service;
  }

  public void setService(List<ServiceInPlan> service) {
    this.service = service;
  }

  public GroupOfServices groupIndex(Integer groupIndex) {
    this.groupIndex = groupIndex;
    return this;
  }

  /**
   * The group index.
   * @return groupIndex
   **/
  @Schema(description = "The group index.")
  
    public Integer getGroupIndex() {
    return groupIndex;
  }

  public void setGroupIndex(Integer groupIndex) {
    this.groupIndex = groupIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupOfServices groupOfServices = (GroupOfServices) o;
    return Objects.equals(this.service, groupOfServices.service) &&
        Objects.equals(this.groupIndex, groupOfServices.groupIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(service, groupIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupOfServices {\n");
    
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    groupIndex: ").append(toIndentedString(groupIndex)).append("\n");
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
