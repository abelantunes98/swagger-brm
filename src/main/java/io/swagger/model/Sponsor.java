package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sponsor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Sponsor   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("sponsorshipRef")
  private ResourceRef sponsorshipRef = null;

  @JsonProperty("offeringRef")
  private ResourceRef offeringRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("quantity")
  private String quantity = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("eventDescription")
  private String eventDescription = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  public Sponsor extension(Object extension) {
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

  public Sponsor sponsorshipRef(ResourceRef sponsorshipRef) {
    this.sponsorshipRef = sponsorshipRef;
    return this;
  }

  /**
   * Get sponsorshipRef
   * @return sponsorshipRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getSponsorshipRef() {
    return sponsorshipRef;
  }

  public void setSponsorshipRef(ResourceRef sponsorshipRef) {
    this.sponsorshipRef = sponsorshipRef;
  }

  public Sponsor offeringRef(ResourceRef offeringRef) {
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

  public Sponsor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the sharing group.
   * @return name
   **/
  @Schema(required = true, description = "The name of the sharing group.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Sponsor quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of the sponsored offer in the sharing group.
   * @return quantity
   **/
  @Schema(description = "The quantity of the sponsored offer in the sharing group.")
  
    public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public Sponsor description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The sponsored offer's description.
   * @return description
   **/
  @Schema(required = true, description = "The sponsored offer's description.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Sponsor eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The event type associated with the sponsored offer.
   * @return eventType
   **/
  @Schema(required = true, description = "The event type associated with the sponsored offer.")
      @NotNull

    public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Sponsor eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

  /**
   * The description of the event associated with the sponsored offer.
   * @return eventDescription
   **/
  @Schema(required = true, description = "The description of the event associated with the sponsored offer.")
      @NotNull

    public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public Sponsor validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time the sponsored offer's validity starts.
   * @return validFrom
   **/
  @Schema(required = true, description = "The date and time the sponsored offer's validity starts.")
      @NotNull

    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public Sponsor validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the sponsored offer's validity ends.
   * @return validTo
   **/
  @Schema(required = true, description = "The date and time the sponsored offer's validity ends.")
      @NotNull

    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public Sponsor selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Whether the sponsored offer is selected (<b>true</b>) or not (<b>false</b>).
   * @return selected
   **/
  @Schema(description = "Whether the sponsored offer is selected (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sponsor sponsor = (Sponsor) o;
    return Objects.equals(this.extension, sponsor.extension) &&
        Objects.equals(this.sponsorshipRef, sponsor.sponsorshipRef) &&
        Objects.equals(this.offeringRef, sponsor.offeringRef) &&
        Objects.equals(this.name, sponsor.name) &&
        Objects.equals(this.quantity, sponsor.quantity) &&
        Objects.equals(this.description, sponsor.description) &&
        Objects.equals(this.eventType, sponsor.eventType) &&
        Objects.equals(this.eventDescription, sponsor.eventDescription) &&
        Objects.equals(this.validFrom, sponsor.validFrom) &&
        Objects.equals(this.validTo, sponsor.validTo) &&
        Objects.equals(this.selected, sponsor.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, sponsorshipRef, offeringRef, name, quantity, description, eventType, eventDescription, validFrom, validTo, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sponsor {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    sponsorshipRef: ").append(toIndentedString(sponsorshipRef)).append("\n");
    sb.append("    offeringRef: ").append(toIndentedString(offeringRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
