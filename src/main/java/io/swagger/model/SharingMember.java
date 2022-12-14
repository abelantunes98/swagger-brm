package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Membership;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharingMember
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SharingMember   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("orderedBalGroupRef")
  private ResourceRef orderedBalGroupRef = null;

  @JsonProperty("membership")
  @Valid
  private List<Membership> membership = new ArrayList<Membership>();

  public SharingMember extension(Object extension) {
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

  public SharingMember orderedBalGroupRef(ResourceRef orderedBalGroupRef) {
    this.orderedBalGroupRef = orderedBalGroupRef;
    return this;
  }

  /**
   * Get orderedBalGroupRef
   * @return orderedBalGroupRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getOrderedBalGroupRef() {
    return orderedBalGroupRef;
  }

  public void setOrderedBalGroupRef(ResourceRef orderedBalGroupRef) {
    this.orderedBalGroupRef = orderedBalGroupRef;
  }

  public SharingMember membership(List<Membership> membership) {
    this.membership = membership;
    return this;
  }

  public SharingMember addMembershipItem(Membership membershipItem) {
    this.membership.add(membershipItem);
    return this;
  }

  /**
   * The list of sharing groups that the member belongs to.
   * @return membership
   **/
  @Schema(required = true, description = "The list of sharing groups that the member belongs to.")
      @NotNull
    @Valid
    public List<Membership> getMembership() {
    return membership;
  }

  public void setMembership(List<Membership> membership) {
    this.membership = membership;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharingMember sharingMember = (SharingMember) o;
    return Objects.equals(this.extension, sharingMember.extension) &&
        Objects.equals(this.orderedBalGroupRef, sharingMember.orderedBalGroupRef) &&
        Objects.equals(this.membership, sharingMember.membership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, orderedBalGroupRef, membership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharingMember {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    orderedBalGroupRef: ").append(toIndentedString(orderedBalGroupRef)).append("\n");
    sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
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
