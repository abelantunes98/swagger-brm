package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MembershipDetails;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharingMemberDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SharingMemberDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("groupref")
  private ResourceRef groupref = null;

  @JsonProperty("orderedBalGroupref")
  private ResourceRef orderedBalGroupref = null;

  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("membershipDetails")
  @Valid
  private List<MembershipDetails> membershipDetails = null;

  public SharingMemberDetails extension(Object extension) {
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

  public SharingMemberDetails groupref(ResourceRef groupref) {
    this.groupref = groupref;
    return this;
  }

  /**
   * Get groupref
   * @return groupref
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getGroupref() {
    return groupref;
  }

  public void setGroupref(ResourceRef groupref) {
    this.groupref = groupref;
  }

  public SharingMemberDetails orderedBalGroupref(ResourceRef orderedBalGroupref) {
    this.orderedBalGroupref = orderedBalGroupref;
    return this;
  }

  /**
   * Get orderedBalGroupref
   * @return orderedBalGroupref
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getOrderedBalGroupref() {
    return orderedBalGroupref;
  }

  public void setOrderedBalGroupref(ResourceRef orderedBalGroupref) {
    this.orderedBalGroupref = orderedBalGroupref;
  }

  public SharingMemberDetails serviceRef(ResourceRef serviceRef) {
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

  public SharingMemberDetails membershipDetails(List<MembershipDetails> membershipDetails) {
    this.membershipDetails = membershipDetails;
    return this;
  }

  public SharingMemberDetails addMembershipDetailsItem(MembershipDetails membershipDetailsItem) {
    if (this.membershipDetails == null) {
      this.membershipDetails = new ArrayList<MembershipDetails>();
    }
    this.membershipDetails.add(membershipDetailsItem);
    return this;
  }

  /**
   * The list of groups the member belongs to.
   * @return membershipDetails
   **/
  @Schema(description = "The list of groups the member belongs to.")
      @Valid
    public List<MembershipDetails> getMembershipDetails() {
    return membershipDetails;
  }

  public void setMembershipDetails(List<MembershipDetails> membershipDetails) {
    this.membershipDetails = membershipDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingMemberDetails sharingMemberDetails = (SharingMemberDetails) o;
    return Objects.equals(this.extension, sharingMemberDetails.extension) &&
        Objects.equals(this.groupref, sharingMemberDetails.groupref) &&
        Objects.equals(this.orderedBalGroupref, sharingMemberDetails.orderedBalGroupref) &&
        Objects.equals(this.serviceRef, sharingMemberDetails.serviceRef) &&
        Objects.equals(this.membershipDetails, sharingMemberDetails.membershipDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, groupref, orderedBalGroupref, serviceRef, membershipDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingMemberDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    groupref: ").append(toIndentedString(groupref)).append("\n");
    sb.append("    orderedBalGroupref: ").append(toIndentedString(orderedBalGroupref)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    membershipDetails: ").append(toIndentedString(membershipDetails)).append("\n");
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
