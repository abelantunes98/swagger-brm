package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Details;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecyclePayment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class RecyclePayment   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("eventRef")
  private ResourceRef eventRef = null;

  @JsonProperty("unallocatedSuspendedAmount")
  private BigDecimal unallocatedSuspendedAmount = null;

  @JsonProperty("details")
  @Valid
  private List<Details> details = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public RecyclePayment extension(Object extension) {
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

  public RecyclePayment effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the recycled payment took effect.
   * @return effectiveDate
   **/
  @Schema(required = true, description = "The date and time the recycled payment took effect.")
      @NotNull

    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public RecyclePayment eventRef(ResourceRef eventRef) {
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

  public RecyclePayment unallocatedSuspendedAmount(BigDecimal unallocatedSuspendedAmount) {
    this.unallocatedSuspendedAmount = unallocatedSuspendedAmount;
    return this;
  }

  /**
   * The amount of the original payment that hasn't been allocated.
   * @return unallocatedSuspendedAmount
   **/
  @Schema(required = true, description = "The amount of the original payment that hasn't been allocated.")
      @NotNull

    @Valid
    public BigDecimal getUnallocatedSuspendedAmount() {
    return unallocatedSuspendedAmount;
  }

  public void setUnallocatedSuspendedAmount(BigDecimal unallocatedSuspendedAmount) {
    this.unallocatedSuspendedAmount = unallocatedSuspendedAmount;
  }

  public RecyclePayment details(List<Details> details) {
    this.details = details;
    return this;
  }

  public RecyclePayment addDetailsItem(Details detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Details>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * The list of details associated with the recycled payment.
   * @return details
   **/
  @Schema(description = "The list of details associated with the recycled payment.")
      @Valid
    public List<Details> getDetails() {
    return details;
  }

  public void setDetails(List<Details> details) {
    this.details = details;
  }

  public RecyclePayment notes(Notes notes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecyclePayment recyclePayment = (RecyclePayment) o;
    return Objects.equals(this.extension, recyclePayment.extension) &&
        Objects.equals(this.effectiveDate, recyclePayment.effectiveDate) &&
        Objects.equals(this.eventRef, recyclePayment.eventRef) &&
        Objects.equals(this.unallocatedSuspendedAmount, recyclePayment.unallocatedSuspendedAmount) &&
        Objects.equals(this.details, recyclePayment.details) &&
        Objects.equals(this.notes, recyclePayment.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, effectiveDate, eventRef, unallocatedSuspendedAmount, details, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecyclePayment {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    eventRef: ").append(toIndentedString(eventRef)).append("\n");
    sb.append("    unallocatedSuspendedAmount: ").append(toIndentedString(unallocatedSuspendedAmount)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
