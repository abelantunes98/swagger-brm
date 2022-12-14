package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Ownership;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharingOwner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SharingOwner   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("groupOwnerBalGroupref")
  private ResourceRef groupOwnerBalGroupref = null;

  @JsonProperty("parentRef")
  private ResourceRef parentRef = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("ownership")
  @Valid
  private List<Ownership> ownership = null;

  public SharingOwner extension(Object extension) {
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

  public SharingOwner groupName(String groupName) {
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

  public SharingOwner groupOwnerBalGroupref(ResourceRef groupOwnerBalGroupref) {
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

  public SharingOwner parentRef(ResourceRef parentRef) {
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

  public SharingOwner accountRef(ResourceRef accountRef) {
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

  public SharingOwner ownership(List<Ownership> ownership) {
    this.ownership = ownership;
    return this;
  }

  public SharingOwner addOwnershipItem(Ownership ownershipItem) {
    if (this.ownership == null) {
      this.ownership = new ArrayList<Ownership>();
    }
    this.ownership.add(ownershipItem);
    return this;
  }

  /**
   * The list of owners for the sharing group.
   * @return ownership
   **/
  @Schema(description = "The list of owners for the sharing group.")
      @Valid
    public List<Ownership> getOwnership() {
    return ownership;
  }

  public void setOwnership(List<Ownership> ownership) {
    this.ownership = ownership;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingOwner sharingOwner = (SharingOwner) o;
    return Objects.equals(this.extension, sharingOwner.extension) &&
        Objects.equals(this.groupName, sharingOwner.groupName) &&
        Objects.equals(this.groupOwnerBalGroupref, sharingOwner.groupOwnerBalGroupref) &&
        Objects.equals(this.parentRef, sharingOwner.parentRef) &&
        Objects.equals(this.accountRef, sharingOwner.accountRef) &&
        Objects.equals(this.ownership, sharingOwner.ownership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, groupName, groupOwnerBalGroupref, parentRef, accountRef, ownership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingOwner {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupOwnerBalGroupref: ").append(toIndentedString(groupOwnerBalGroupref)).append("\n");
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
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
