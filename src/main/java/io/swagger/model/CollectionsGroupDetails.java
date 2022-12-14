package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.GroupMembers;
import io.swagger.model.GroupOwners;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CollectionsGroupDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CollectionsGroupDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("groupOwners")
  @Valid
  private List<GroupOwners> groupOwners = null;

  @JsonProperty("groupMembers")
  @Valid
  private List<GroupMembers> groupMembers = null;

  public CollectionsGroupDetails extension(Object extension) {
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

  public CollectionsGroupDetails groupOwners(List<GroupOwners> groupOwners) {
    this.groupOwners = groupOwners;
    return this;
  }

  public CollectionsGroupDetails addGroupOwnersItem(GroupOwners groupOwnersItem) {
    if (this.groupOwners == null) {
      this.groupOwners = new ArrayList<GroupOwners>();
    }
    this.groupOwners.add(groupOwnersItem);
    return this;
  }

  /**
   * A collections sharing group owner.
   * @return groupOwners
   **/
  @Schema(description = "A collections sharing group owner.")
      @Valid
    public List<GroupOwners> getGroupOwners() {
    return groupOwners;
  }

  public void setGroupOwners(List<GroupOwners> groupOwners) {
    this.groupOwners = groupOwners;
  }

  public CollectionsGroupDetails groupMembers(List<GroupMembers> groupMembers) {
    this.groupMembers = groupMembers;
    return this;
  }

  public CollectionsGroupDetails addGroupMembersItem(GroupMembers groupMembersItem) {
    if (this.groupMembers == null) {
      this.groupMembers = new ArrayList<GroupMembers>();
    }
    this.groupMembers.add(groupMembersItem);
    return this;
  }

  /**
   * Details about the members of a collections sharing group.
   * @return groupMembers
   **/
  @Schema(description = "Details about the members of a collections sharing group.")
      @Valid
    public List<GroupMembers> getGroupMembers() {
    return groupMembers;
  }

  public void setGroupMembers(List<GroupMembers> groupMembers) {
    this.groupMembers = groupMembers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionsGroupDetails collectionsGroupDetails = (CollectionsGroupDetails) o;
    return Objects.equals(this.extension, collectionsGroupDetails.extension) &&
        Objects.equals(this.groupOwners, collectionsGroupDetails.groupOwners) &&
        Objects.equals(this.groupMembers, collectionsGroupDetails.groupMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, groupOwners, groupMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsGroupDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    groupOwners: ").append(toIndentedString(groupOwners)).append("\n");
    sb.append("    groupMembers: ").append(toIndentedString(groupMembers)).append("\n");
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
