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
 * Writeoff
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Writeoff   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionAffectsRef")
  private ResourceRef actionAffectsRef = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("writeoffTax")
  private Boolean writeoffTax = true;

  @JsonProperty("inactivateAccount")
  private Boolean inactivateAccount = false;

  @JsonProperty("notes")
  private Notes notes = null;

  public Writeoff extension(Object extension) {
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

  public Writeoff actionAffectsRef(ResourceRef actionAffectsRef) {
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

  public Writeoff effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the write-off takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the write-off takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public Writeoff writeoffTax(Boolean writeoffTax) {
    this.writeoffTax = writeoffTax;
    return this;
  }

  /**
   * Whether to write off the tax amount (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.
   * @return writeoffTax
   **/
  @Schema(description = "Whether to write off the tax amount (<b>true</b>) or not (<b>false</b>). The default is <b>true</b>.")
  
    public Boolean isWriteoffTax() {
    return writeoffTax;
  }

  public void setWriteoffTax(Boolean writeoffTax) {
    this.writeoffTax = writeoffTax;
  }

  public Writeoff inactivateAccount(Boolean inactivateAccount) {
    this.inactivateAccount = inactivateAccount;
    return this;
  }

  /**
   * Whether to inactivate the account (<b>true</b>) or not (<b>false</b>). The default is <b>false</b>.
   * @return inactivateAccount
   **/
  @Schema(description = "Whether to inactivate the account (<b>true</b>) or not (<b>false</b>). The default is <b>false</b>.")
  
    public Boolean isInactivateAccount() {
    return inactivateAccount;
  }

  public void setInactivateAccount(Boolean inactivateAccount) {
    this.inactivateAccount = inactivateAccount;
  }

  public Writeoff notes(Notes notes) {
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
    Writeoff writeoff = (Writeoff) o;
    return Objects.equals(this.extension, writeoff.extension) &&
        Objects.equals(this.actionAffectsRef, writeoff.actionAffectsRef) &&
        Objects.equals(this.effective, writeoff.effective) &&
        Objects.equals(this.writeoffTax, writeoff.writeoffTax) &&
        Objects.equals(this.inactivateAccount, writeoff.inactivateAccount) &&
        Objects.equals(this.notes, writeoff.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effective, writeoffTax, inactivateAccount, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Writeoff {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionAffectsRef: ").append(toIndentedString(actionAffectsRef)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    writeoffTax: ").append(toIndentedString(writeoffTax)).append("\n");
    sb.append("    inactivateAccount: ").append(toIndentedString(inactivateAccount)).append("\n");
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
