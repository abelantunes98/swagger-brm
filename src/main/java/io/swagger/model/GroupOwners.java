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
 * A collections sharing group owner.
 */
@Schema(description = "A collections sharing group owner.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class GroupOwners   {
  @JsonProperty("groupRef")
  private ResourceRef groupRef = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("billUnitRef")
  private ResourceRef billUnitRef = null;

  @JsonProperty("billUnitName")
  private String billUnitName = null;

  @JsonProperty("memberCount")
  private Integer memberCount = null;

  public GroupOwners groupRef(ResourceRef groupRef) {
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

  public GroupOwners groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The name of the collections sharing group.
   * @return groupName
   **/
  @Schema(description = "The name of the collections sharing group.")
  
    public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public GroupOwners billUnitRef(ResourceRef billUnitRef) {
    this.billUnitRef = billUnitRef;
    return this;
  }

  /**
   * Get billUnitRef
   * @return billUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBillUnitRef() {
    return billUnitRef;
  }

  public void setBillUnitRef(ResourceRef billUnitRef) {
    this.billUnitRef = billUnitRef;
  }

  public GroupOwners billUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
    return this;
  }

  /**
   * The name of the bill unit associated with the collections sharing group.
   * @return billUnitName
   **/
  @Schema(description = "The name of the bill unit associated with the collections sharing group.")
  
    public String getBillUnitName() {
    return billUnitName;
  }

  public void setBillUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
  }

  public GroupOwners memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

  /**
   * The number of members in the collections sharing group.
   * @return memberCount
   **/
  @Schema(description = "The number of members in the collections sharing group.")
  
    public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupOwners groupOwners = (GroupOwners) o;
    return Objects.equals(this.groupRef, groupOwners.groupRef) &&
        Objects.equals(this.groupName, groupOwners.groupName) &&
        Objects.equals(this.billUnitRef, groupOwners.billUnitRef) &&
        Objects.equals(this.billUnitName, groupOwners.billUnitName) &&
        Objects.equals(this.memberCount, groupOwners.memberCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupRef, groupName, billUnitRef, billUnitName, memberCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupOwners {\n");
    
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    billUnitRef: ").append(toIndentedString(billUnitRef)).append("\n");
    sb.append("    billUnitName: ").append(toIndentedString(billUnitName)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
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
