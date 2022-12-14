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
 * Details about the members of a collections sharing group.
 */
@Schema(description = "Details about the members of a collections sharing group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class GroupMembers   {
  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("billUnitRef")
  private ResourceRef billUnitRef = null;

  @JsonProperty("billUnitName")
  private String billUnitName = null;

  @JsonProperty("parentBillUnitRef")
  private ResourceRef parentBillUnitRef = null;

  @JsonProperty("parentBillUnitName")
  private String parentBillUnitName = null;

  @JsonProperty("parentAccountRef")
  private ResourceRef parentAccountRef = null;

  @JsonProperty("parentAccountNumber")
  private String parentAccountNumber = null;

  public GroupMembers groupName(String groupName) {
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

  public GroupMembers billUnitRef(ResourceRef billUnitRef) {
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

  public GroupMembers billUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
    return this;
  }

  /**
   * The name of the bill associated with the collections sharing group.
   * @return billUnitName
   **/
  @Schema(description = "The name of the bill associated with the collections sharing group.")
  
    public String getBillUnitName() {
    return billUnitName;
  }

  public void setBillUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
  }

  public GroupMembers parentBillUnitRef(ResourceRef parentBillUnitRef) {
    this.parentBillUnitRef = parentBillUnitRef;
    return this;
  }

  /**
   * Get parentBillUnitRef
   * @return parentBillUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getParentBillUnitRef() {
    return parentBillUnitRef;
  }

  public void setParentBillUnitRef(ResourceRef parentBillUnitRef) {
    this.parentBillUnitRef = parentBillUnitRef;
  }

  public GroupMembers parentBillUnitName(String parentBillUnitName) {
    this.parentBillUnitName = parentBillUnitName;
    return this;
  }

  /**
   * The name of the parent bill unit associated with the collections sharing group.
   * @return parentBillUnitName
   **/
  @Schema(description = "The name of the parent bill unit associated with the collections sharing group.")
  
    public String getParentBillUnitName() {
    return parentBillUnitName;
  }

  public void setParentBillUnitName(String parentBillUnitName) {
    this.parentBillUnitName = parentBillUnitName;
  }

  public GroupMembers parentAccountRef(ResourceRef parentAccountRef) {
    this.parentAccountRef = parentAccountRef;
    return this;
  }

  /**
   * Get parentAccountRef
   * @return parentAccountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getParentAccountRef() {
    return parentAccountRef;
  }

  public void setParentAccountRef(ResourceRef parentAccountRef) {
    this.parentAccountRef = parentAccountRef;
  }

  public GroupMembers parentAccountNumber(String parentAccountNumber) {
    this.parentAccountNumber = parentAccountNumber;
    return this;
  }

  /**
   * The account number associated with the parent bill unit of the collections sharing group.
   * @return parentAccountNumber
   **/
  @Schema(description = "The account number associated with the parent bill unit of the collections sharing group.")
  
    public String getParentAccountNumber() {
    return parentAccountNumber;
  }

  public void setParentAccountNumber(String parentAccountNumber) {
    this.parentAccountNumber = parentAccountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMembers groupMembers = (GroupMembers) o;
    return Objects.equals(this.groupName, groupMembers.groupName) &&
        Objects.equals(this.billUnitRef, groupMembers.billUnitRef) &&
        Objects.equals(this.billUnitName, groupMembers.billUnitName) &&
        Objects.equals(this.parentBillUnitRef, groupMembers.parentBillUnitRef) &&
        Objects.equals(this.parentBillUnitName, groupMembers.parentBillUnitName) &&
        Objects.equals(this.parentAccountRef, groupMembers.parentAccountRef) &&
        Objects.equals(this.parentAccountNumber, groupMembers.parentAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, billUnitRef, billUnitName, parentBillUnitRef, parentBillUnitName, parentAccountRef, parentAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMembers {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    billUnitRef: ").append(toIndentedString(billUnitRef)).append("\n");
    sb.append("    billUnitName: ").append(toIndentedString(billUnitName)).append("\n");
    sb.append("    parentBillUnitRef: ").append(toIndentedString(parentBillUnitRef)).append("\n");
    sb.append("    parentBillUnitName: ").append(toIndentedString(parentBillUnitName)).append("\n");
    sb.append("    parentAccountRef: ").append(toIndentedString(parentAccountRef)).append("\n");
    sb.append("    parentAccountNumber: ").append(toIndentedString(parentAccountNumber)).append("\n");
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
