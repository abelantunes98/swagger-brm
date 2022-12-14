package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OwnershipDetails;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharingOwnerDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SharingOwnerDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("groupRef")
  private ResourceRef groupRef = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("groupOwnerBalGroupref")
  private ResourceRef groupOwnerBalGroupref = null;

  @JsonProperty("groupOwnerBalGroupName")
  private String groupOwnerBalGroupName = null;

  @JsonProperty("parentRef")
  private ResourceRef parentRef = null;

  @JsonProperty("parentName")
  private String parentName = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("billunitName")
  private String billunitName = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("memberCount")
  private Integer memberCount = null;

  @JsonProperty("globalChargeShareGroup")
  private Boolean globalChargeShareGroup = null;

  @JsonProperty("ownershipDetails")
  @Valid
  private List<OwnershipDetails> ownershipDetails = null;

  public SharingOwnerDetails extension(Object extension) {
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

  public SharingOwnerDetails groupRef(ResourceRef groupRef) {
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

  public SharingOwnerDetails groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The name of the sharing group.
   * @return groupName
   **/
  @Schema(required = true, description = "The name of the sharing group.")
      @NotNull

    public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public SharingOwnerDetails groupOwnerBalGroupref(ResourceRef groupOwnerBalGroupref) {
    this.groupOwnerBalGroupref = groupOwnerBalGroupref;
    return this;
  }

  /**
   * Get groupOwnerBalGroupref
   * @return groupOwnerBalGroupref
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getGroupOwnerBalGroupref() {
    return groupOwnerBalGroupref;
  }

  public void setGroupOwnerBalGroupref(ResourceRef groupOwnerBalGroupref) {
    this.groupOwnerBalGroupref = groupOwnerBalGroupref;
  }

  public SharingOwnerDetails groupOwnerBalGroupName(String groupOwnerBalGroupName) {
    this.groupOwnerBalGroupName = groupOwnerBalGroupName;
    return this;
  }

  /**
   * The name of the balance group owner.
   * @return groupOwnerBalGroupName
   **/
  @Schema(required = true, description = "The name of the balance group owner.")
      @NotNull

    public String getGroupOwnerBalGroupName() {
    return groupOwnerBalGroupName;
  }

  public void setGroupOwnerBalGroupName(String groupOwnerBalGroupName) {
    this.groupOwnerBalGroupName = groupOwnerBalGroupName;
  }

  public SharingOwnerDetails parentRef(ResourceRef parentRef) {
    this.parentRef = parentRef;
    return this;
  }

  /**
   * Get parentRef
   * @return parentRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getParentRef() {
    return parentRef;
  }

  public void setParentRef(ResourceRef parentRef) {
    this.parentRef = parentRef;
  }

  public SharingOwnerDetails parentName(String parentName) {
    this.parentName = parentName;
    return this;
  }

  /**
   * The parent's name.
   * @return parentName
   **/
  @Schema(description = "The parent's name.")
  
    public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public SharingOwnerDetails accountRef(ResourceRef accountRef) {
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

  public SharingOwnerDetails billunitName(String billunitName) {
    this.billunitName = billunitName;
    return this;
  }

  /**
   * The name of the bill unit associated with the sharing group.
   * @return billunitName
   **/
  @Schema(required = true, description = "The name of the bill unit associated with the sharing group.")
      @NotNull

    public String getBillunitName() {
    return billunitName;
  }

  public void setBillunitName(String billunitName) {
    this.billunitName = billunitName;
  }

  public SharingOwnerDetails paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * The payment method associated with the sharing group.
   * @return paymentMethod
   **/
  @Schema(required = true, description = "The payment method associated with the sharing group.")
      @NotNull

    public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public SharingOwnerDetails memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

  /**
   * The number of members in the sharing group.
   * @return memberCount
   **/
  @Schema(description = "The number of members in the sharing group.")
  
    public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public SharingOwnerDetails globalChargeShareGroup(Boolean globalChargeShareGroup) {
    this.globalChargeShareGroup = globalChargeShareGroup;
    return this;
  }

  /**
   * Whether this is a global charge sharing group (<b>true</b>) or not (<b>false</b>).
   * @return globalChargeShareGroup
   **/
  @Schema(description = "Whether this is a global charge sharing group (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isGlobalChargeShareGroup() {
    return globalChargeShareGroup;
  }

  public void setGlobalChargeShareGroup(Boolean globalChargeShareGroup) {
    this.globalChargeShareGroup = globalChargeShareGroup;
  }

  public SharingOwnerDetails ownershipDetails(List<OwnershipDetails> ownershipDetails) {
    this.ownershipDetails = ownershipDetails;
    return this;
  }

  public SharingOwnerDetails addOwnershipDetailsItem(OwnershipDetails ownershipDetailsItem) {
    if (this.ownershipDetails == null) {
      this.ownershipDetails = new ArrayList<OwnershipDetails>();
    }
    this.ownershipDetails.add(ownershipDetailsItem);
    return this;
  }

  /**
   * The  ownership details for the sharing group.
   * @return ownershipDetails
   **/
  @Schema(description = "The  ownership details for the sharing group.")
      @Valid
    public List<OwnershipDetails> getOwnershipDetails() {
    return ownershipDetails;
  }

  public void setOwnershipDetails(List<OwnershipDetails> ownershipDetails) {
    this.ownershipDetails = ownershipDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingOwnerDetails sharingOwnerDetails = (SharingOwnerDetails) o;
    return Objects.equals(this.extension, sharingOwnerDetails.extension) &&
        Objects.equals(this.groupRef, sharingOwnerDetails.groupRef) &&
        Objects.equals(this.groupName, sharingOwnerDetails.groupName) &&
        Objects.equals(this.groupOwnerBalGroupref, sharingOwnerDetails.groupOwnerBalGroupref) &&
        Objects.equals(this.groupOwnerBalGroupName, sharingOwnerDetails.groupOwnerBalGroupName) &&
        Objects.equals(this.parentRef, sharingOwnerDetails.parentRef) &&
        Objects.equals(this.parentName, sharingOwnerDetails.parentName) &&
        Objects.equals(this.accountRef, sharingOwnerDetails.accountRef) &&
        Objects.equals(this.billunitName, sharingOwnerDetails.billunitName) &&
        Objects.equals(this.paymentMethod, sharingOwnerDetails.paymentMethod) &&
        Objects.equals(this.memberCount, sharingOwnerDetails.memberCount) &&
        Objects.equals(this.globalChargeShareGroup, sharingOwnerDetails.globalChargeShareGroup) &&
        Objects.equals(this.ownershipDetails, sharingOwnerDetails.ownershipDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, groupRef, groupName, groupOwnerBalGroupref, groupOwnerBalGroupName, parentRef, parentName, accountRef, billunitName, paymentMethod, memberCount, globalChargeShareGroup, ownershipDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingOwnerDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    groupRef: ").append(toIndentedString(groupRef)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupOwnerBalGroupref: ").append(toIndentedString(groupOwnerBalGroupref)).append("\n");
    sb.append("    groupOwnerBalGroupName: ").append(toIndentedString(groupOwnerBalGroupName)).append("\n");
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    billunitName: ").append(toIndentedString(billunitName)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    globalChargeShareGroup: ").append(toIndentedString(globalChargeShareGroup)).append("\n");
    sb.append("    ownershipDetails: ").append(toIndentedString(ownershipDetails)).append("\n");
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
