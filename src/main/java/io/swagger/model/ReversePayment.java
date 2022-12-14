package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReversePayment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ReversePayment   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("eventRef")
  private ResourceRef eventRef = null;

  public ReversePayment extension(Object extension) {
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

  public ReversePayment effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the payment reversal takes effect.
   * @return effectiveDate
   **/
  @Schema(description = "The date and time the payment reversal takes effect.")
  
    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ReversePayment notes(Notes notes) {
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

  public ReversePayment eventRef(ResourceRef eventRef) {
    this.eventRef = eventRef;
    return this;
  }

  /**
   * Get eventRef
   * @return eventRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getEventRef() {
    return eventRef;
  }

  public void setEventRef(ResourceRef eventRef) {
    this.eventRef = eventRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReversePayment reversePayment = (ReversePayment) o;
    return Objects.equals(this.extension, reversePayment.extension) &&
        Objects.equals(this.effectiveDate, reversePayment.effectiveDate) &&
        Objects.equals(this.notes, reversePayment.notes) &&
        Objects.equals(this.eventRef, reversePayment.eventRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, effectiveDate, notes, eventRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReversePayment {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    eventRef: ").append(toIndentedString(eventRef)).append("\n");
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
