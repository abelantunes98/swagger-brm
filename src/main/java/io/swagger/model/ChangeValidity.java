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
 * ChangeValidity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ChangeValidity   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionAffectsRef")
  private ResourceRef actionAffectsRef = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("balanceGroupId")
  private String balanceGroupId = null;

  @JsonProperty("elementId")
  private Integer elementId = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  public ChangeValidity extension(Object extension) {
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

  public ChangeValidity actionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
    return this;
  }

  /**
   * Get actionAffectsRef
   * @return actionAffectsRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getActionAffectsRef() {
    return actionAffectsRef;
  }

  public void setActionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
  }

  public ChangeValidity effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the date change takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the date change takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public ChangeValidity notes(Notes notes) {
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

  public ChangeValidity balanceGroupId(String balanceGroupId) {
    this.balanceGroupId = balanceGroupId;
    return this;
  }

  /**
   * The ID of the balance group associated with the date change.
   * @return balanceGroupId
   **/
  @Schema(description = "The ID of the balance group associated with the date change.")
  
    public String getBalanceGroupId() {
    return balanceGroupId;
  }

  public void setBalanceGroupId(String balanceGroupId) {
    this.balanceGroupId = balanceGroupId;
  }

  public ChangeValidity elementId(Integer elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * The ID of the element associated with the date change.
   * @return elementId
   **/
  @Schema(description = "The ID of the element associated with the date change.")
  
    public Integer getElementId() {
    return elementId;
  }

  public void setElementId(Integer elementId) {
    this.elementId = elementId;
  }

  public ChangeValidity validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The new validity end date.
   * @return validTo
   **/
  @Schema(required = true, description = "The new validity end date.")
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
    ChangeValidity changeValidity = (ChangeValidity) o;
    return Objects.equals(this.extension, changeValidity.extension) &&
        Objects.equals(this.actionAffectsRef, changeValidity.actionAffectsRef) &&
        Objects.equals(this.effective, changeValidity.effective) &&
        Objects.equals(this.notes, changeValidity.notes) &&
        Objects.equals(this.balanceGroupId, changeValidity.balanceGroupId) &&
        Objects.equals(this.elementId, changeValidity.elementId) &&
        Objects.equals(this.validTo, changeValidity.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effective, notes, balanceGroupId, elementId, validTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeValidity {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionAffectsRef: ").append(toIndentedString(actionAffectsRef)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    balanceGroupId: ").append(toIndentedString(balanceGroupId)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
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
