package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of groups the member belongs to.
 */
@Schema(description = "The list of groups the member belongs to.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class MembershipDetails   {
  @JsonProperty("groupRef")
  private ResourceRef groupRef = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("parentName")
  private String parentName = null;

  public MembershipDetails groupRef(ResourceRef groupRef) {
    this.groupRef = groupRef;
    return this;
  }

  /**
   * Get groupRef
   * @return groupRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getGroupRef() {
    return groupRef;
  }

  public void setGroupRef(ResourceRef groupRef) {
    this.groupRef = groupRef;
  }

  public MembershipDetails groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The sharing group's name.
   * @return groupName
   **/
  @Schema(required = true, description = "The sharing group's name.")
      @NotNull

    public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public MembershipDetails serviceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
    return this;
  }

  /**
   * Get serviceRef
   * @return serviceRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getServiceRef() {
    return serviceRef;
  }

  public void setServiceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
  }

  public MembershipDetails serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The name of the service being shared.
   * @return serviceName
   **/
  @Schema(required = true, description = "The name of the service being shared.")
      @NotNull

    public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public MembershipDetails priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority.
   * @return priority
   **/
  @Schema(description = "The priority.")
  
    public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public MembershipDetails accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public MembershipDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the sharing group.
   * @return accountNumber
   **/
  @Schema(required = true, description = "The account number associated with the sharing group.")
      @NotNull

    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public MembershipDetails parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

  /**
   * The sharing group parent's name.
   * @return parentName
   **/
  @Schema(description = "The sharing group parent's name.")
  
    public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipDetails membershipDetails = (MembershipDetails) o;
    return Objects.equals(this.groupRef, membershipDetails.groupRef) &&
        Objects.equals(this.groupName, membershipDetails.groupName) &&
        Objects.equals(this.serviceRef, membershipDetails.serviceRef) &&
        Objects.equals(this.serviceName, membershipDetails.serviceName) &&
        Objects.equals(this.priority, membershipDetails.priority) &&
        Objects.equals(this.accountRef, membershipDetails.accountRef) &&
        Objects.equals(this.accountNumber, membershipDetails.accountNumber) &&
        Objects.equals(this.parentName, membershipDetails.parentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, groupName, serviceRef, serviceName, priority, accountRef, accountNumber, parentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipDetails {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
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
