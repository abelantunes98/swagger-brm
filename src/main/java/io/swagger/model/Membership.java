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
 * Details about a sharing group membership.
 */
@Schema(description = "Details about a sharing group membership.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Membership   {
  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("groupRef")
  private ResourceRef groupRef = null;

  public Membership serviceRef(ResourceRef serviceRef) {
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

  public Membership accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public Membership groupRef(ResourceRef groupRef) {
    this.groupRef = groupRef;
    return this;
  }

  /**
   * Get groupRef
   * @return groupRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getGroupRef() {
    return groupRef;
  }

  public void setGroupRef(ResourceRef groupRef) {
    this.groupRef = groupRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Membership membership = (Membership) o;
    return Objects.equals(this.serviceRef, membership.serviceRef) &&
        Objects.equals(this.accountRef, membership.accountRef) &&
        Objects.equals(this.groupRef, membership.groupRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRef, accountRef, groupRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Membership {\n");
    
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
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
