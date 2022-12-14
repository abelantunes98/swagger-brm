package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Members;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharingMemberServiceDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SharingMemberServiceDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("members")
  @Valid
  private List<Members> members = null;

  public SharingMemberServiceDetails extension(Object extension) {
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

  public SharingMemberServiceDetails accountRef(ResourceRef accountRef) {
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

  public SharingMemberServiceDetails members(List<Members> members) {
    this.members = members;
    return this;
  }

  public SharingMemberServiceDetails addMembersItem(Members membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<Members>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * The list of members in the sharing group.
   * @return members
   **/
  @Schema(description = "The list of members in the sharing group.")
      @Valid
    public List<Members> getMembers() {
    return members;
  }

  public void setMembers(List<Members> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingMemberServiceDetails sharingMemberServiceDetails = (SharingMemberServiceDetails) o;
    return Objects.equals(this.extension, sharingMemberServiceDetails.extension) &&
        Objects.equals(this.accountRef, sharingMemberServiceDetails.accountRef) &&
        Objects.equals(this.members, sharingMemberServiceDetails.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountRef, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingMemberServiceDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
