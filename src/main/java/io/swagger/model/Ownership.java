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
 * The list of owners for the sharing group.
 */
@Schema(description = "The list of owners for the sharing group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Ownership   {
  @JsonProperty("sharingRef")
  private ResourceRef sharingRef = null;

  @JsonProperty("offeringRef")
  private ResourceRef offeringRef = null;

  @JsonProperty("markAsDelete")
  private Boolean markAsDelete = null;

  @JsonProperty("index")
  private Integer index = null;

  public Ownership sharingRef(ResourceRef sharingRef) {
    this.sharingRef = sharingRef;
    return this;
  }

  /**
   * Get sharingRef
   * @return sharingRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getSharingRef() {
    return sharingRef;
  }

  public void setSharingRef(ResourceRef sharingRef) {
    this.sharingRef = sharingRef;
  }

  public Ownership offeringRef(ResourceRef offeringRef) {
    this.offeringRef = offeringRef;
    return this;
  }

  /**
   * Get offeringRef
   * @return offeringRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getOfferingRef() {
    return offeringRef;
  }

  public void setOfferingRef(ResourceRef offeringRef) {
    this.offeringRef = offeringRef;
  }

  public Ownership markAsDelete(Boolean markAsDelete) {
    this.markAsDelete = markAsDelete;
    return this;
  }

  /**
   * Whether to delete the ownership (<b>true</b>) or not (<b>false</b>).
   * @return markAsDelete
   **/
  @Schema(description = "Whether to delete the ownership (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isMarkAsDelete() {
    return markAsDelete;
  }

  public void setMarkAsDelete(Boolean markAsDelete) {
    this.markAsDelete = markAsDelete;
  }

  public Ownership index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The position of the entry in the index. For example, the first item in a list would have an <b>index</b> value of <b>1</b>.
   * @return index
   **/
  @Schema(description = "The position of the entry in the index. For example, the first item in a list would have an <b>index</b> value of <b>1</b>.")
  
    public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ownership ownership = (Ownership) o;
    return Objects.equals(this.sharingRef, ownership.sharingRef) &&
        Objects.equals(this.offeringRef, ownership.offeringRef) &&
        Objects.equals(this.markAsDelete, ownership.markAsDelete) &&
        Objects.equals(this.index, ownership.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharingRef, offeringRef, markAsDelete, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ownership {\n");
    
    sb.append("    sharingRef: ").append(toIndentedString(sharingRef)).append("\n");
    sb.append("    offeringRef: ").append(toIndentedString(offeringRef)).append("\n");
    sb.append("    markAsDelete: ").append(toIndentedString(markAsDelete)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
