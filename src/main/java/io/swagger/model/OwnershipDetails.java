package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The  ownership details for the sharing group.
 */
@Schema(description = "The  ownership details for the sharing group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class OwnershipDetails   {
  @JsonProperty("sharingRef")
  private ResourceRef sharingRef = null;

  @JsonProperty("offeringRef")
  private ResourceRef offeringRef = null;

  @JsonProperty("quantity")
  private BigDecimal quantity = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  public OwnershipDetails sharingRef(ResourceRef sharingRef) {
    this.sharingRef = sharingRef;
    return this;
  }

  /**
   * Get sharingRef
   * @return sharingRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getSharingRef() {
    return sharingRef;
  }

  public void setSharingRef(ResourceRef sharingRef) {
    this.sharingRef = sharingRef;
  }

  public OwnershipDetails offeringRef(ResourceRef offeringRef) {
    this.offeringRef = offeringRef;
    return this;
  }

  /**
   * Get offeringRef
   * @return offeringRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getOfferingRef() {
    return offeringRef;
  }

  public void setOfferingRef(ResourceRef offeringRef) {
    this.offeringRef = offeringRef;
  }

  public OwnershipDetails quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity.
   * @return quantity
   **/
  @Schema(required = true, description = "The quantity.")
      @NotNull

    @Valid
    public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public OwnershipDetails index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The position of the entry in the index. For example, the first item in a list would have an (<b>index</b>) value of (<b>1</b>).
   * @return index
   **/
  @Schema(description = "The position of the entry in the index. For example, the first item in a list would have an (<b>index</b>) value of (<b>1</b>).")
  
    public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public OwnershipDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The sharing group name.
   * @return name
   **/
  @Schema(required = true, description = "The sharing group name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OwnershipDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The sharing group description.
   * @return description
   **/
  @Schema(required = true, description = "The sharing group description.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OwnershipDetails validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time the sharing group's validity starts.
   * @return validFrom
   **/
  @Schema(required = true, description = "The date and time the sharing group's validity starts.")
      @NotNull

    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public OwnershipDetails validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the sharing group's validity ends.
   * @return validTo
   **/
  @Schema(required = true, description = "The date and time the sharing group's validity ends.")
      @NotNull

    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipDetails ownershipDetails = (OwnershipDetails) o;
    return Objects.equals(this.sharingRef, ownershipDetails.sharingRef) &&
        Objects.equals(this.offeringRef, ownershipDetails.offeringRef) &&
        Objects.equals(this.quantity, ownershipDetails.quantity) &&
        Objects.equals(this.index, ownershipDetails.index) &&
        Objects.equals(this.name, ownershipDetails.name) &&
        Objects.equals(this.description, ownershipDetails.description) &&
        Objects.equals(this.validFrom, ownershipDetails.validFrom) &&
        Objects.equals(this.validTo, ownershipDetails.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharingRef, offeringRef, quantity, index, name, description, validFrom, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipDetails {\n");
    
    sb.append("    sharingRef: ").append(toIndentedString(sharingRef)).append("\n");
    sb.append("    offeringRef: ").append(toIndentedString(offeringRef)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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
