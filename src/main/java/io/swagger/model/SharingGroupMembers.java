package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.MemberDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharingGroupMembers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SharingGroupMembers   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("memberDetails")
  @Valid
  private List<MemberDetails> memberDetails = null;

  public SharingGroupMembers extension(Object extension) {
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

  public SharingGroupMembers memberDetails(List<MemberDetails> memberDetails) {
    this.memberDetails = memberDetails;
    return this;
  }

  public SharingGroupMembers addMemberDetailsItem(MemberDetails memberDetailsItem) {
    if (this.memberDetails == null) {
      this.memberDetails = new ArrayList<MemberDetails>();
    }
    this.memberDetails.add(memberDetailsItem);
    return this;
  }

  /**
   * The list of sharing group members.
   * @return memberDetails
   **/
  @Schema(description = "The list of sharing group members.")
      @Valid
    public List<MemberDetails> getMemberDetails() {
    return memberDetails;
  }

  public void setMemberDetails(List<MemberDetails> memberDetails) {
    this.memberDetails = memberDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingGroupMembers sharingGroupMembers = (SharingGroupMembers) o;
    return Objects.equals(this.extension, sharingGroupMembers.extension) &&
        Objects.equals(this.memberDetails, sharingGroupMembers.memberDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, memberDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingGroupMembers {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    memberDetails: ").append(toIndentedString(memberDetails)).append("\n");
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
