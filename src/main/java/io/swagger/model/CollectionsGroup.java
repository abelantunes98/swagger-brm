package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Members;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A collections sharing group.
 */
@Schema(description = "A collections sharing group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CollectionsGroup   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("parentBillUnitRef")
  private ResourceRef parentBillUnitRef = null;

  @JsonProperty("newParentBillUnitRef")
  private ResourceRef newParentBillUnitRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parentBillUnitDue")
  private BigDecimal parentBillUnitDue = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("members")
  @Valid
  private List<Members> members = null;

  public CollectionsGroup extension(Object extension) {
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

  public CollectionsGroup parentBillUnitRef(ResourceRef parentBillUnitRef) {
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

  public CollectionsGroup newParentBillUnitRef(ResourceRef newParentBillUnitRef) {
    this.newParentBillUnitRef = newParentBillUnitRef;
    return this;
  }

  /**
   * Get newParentBillUnitRef
   * @return newParentBillUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getNewParentBillUnitRef() {
    return newParentBillUnitRef;
  }

  public void setNewParentBillUnitRef(ResourceRef newParentBillUnitRef) {
    this.newParentBillUnitRef = newParentBillUnitRef;
  }

  public CollectionsGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the collections sharing group.
   * @return name
   **/
  @Schema(description = "The name of the collections sharing group.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CollectionsGroup parentBillUnitDue(BigDecimal parentBillUnitDue) {
    this.parentBillUnitDue = parentBillUnitDue;
    return this;
  }

  /**
   * The amount owed by the collections sharing group owner.
   * @return parentBillUnitDue
   **/
  @Schema(description = "The amount owed by the collections sharing group owner.")
  
    @Valid
    public BigDecimal getParentBillUnitDue() {
    return parentBillUnitDue;
  }

  public void setParentBillUnitDue(BigDecimal parentBillUnitDue) {
    this.parentBillUnitDue = parentBillUnitDue;
  }

  public CollectionsGroup notes(Notes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    @Valid
    public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }

  public CollectionsGroup members(List<Members> members) {
    this.members = members;
    return this;
  }

  public CollectionsGroup addMembersItem(Members membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<Members>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * The list of members in the collections sharing group.
   * @return members
   **/
  @Schema(description = "The list of members in the collections sharing group.")
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
    CollectionsGroup collectionsGroup = (CollectionsGroup) o;
    return Objects.equals(this.extension, collectionsGroup.extension) &&
        Objects.equals(this.parentBillUnitRef, collectionsGroup.parentBillUnitRef) &&
        Objects.equals(this.newParentBillUnitRef, collectionsGroup.newParentBillUnitRef) &&
        Objects.equals(this.name, collectionsGroup.name) &&
        Objects.equals(this.parentBillUnitDue, collectionsGroup.parentBillUnitDue) &&
        Objects.equals(this.notes, collectionsGroup.notes) &&
        Objects.equals(this.members, collectionsGroup.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, parentBillUnitRef, newParentBillUnitRef, name, parentBillUnitDue, notes, members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsGroup {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    parentBillUnitRef: ").append(toIndentedString(parentBillUnitRef)).append("\n");
    sb.append("    newParentBillUnitRef: ").append(toIndentedString(newParentBillUnitRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentBillUnitDue: ").append(toIndentedString(parentBillUnitDue)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
