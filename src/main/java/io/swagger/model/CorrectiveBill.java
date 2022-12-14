package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorrectiveBill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CorrectiveBill   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("invoiceFormat")
  private Integer invoiceFormat = null;

  @JsonProperty("invoiceType")
  private Integer invoiceType = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public CorrectiveBill extension(Object extension) {
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

  public CorrectiveBill invoiceFormat(Integer invoiceFormat) {
    this.invoiceFormat = invoiceFormat;
    return this;
  }

  /**
   * The invoice format. Can be one of the following: <ul><li><b>1</b>: Detail</li><li><b>2</b>: Summary</li></ul>
   * @return invoiceFormat
   **/
  @Schema(description = "The invoice format. Can be one of the following: <ul><li><b>1</b>: Detail</li><li><b>2</b>: Summary</li></ul>")
  
    public Integer getInvoiceFormat() {
    return invoiceFormat;
  }

  public void setInvoiceFormat(Integer invoiceFormat) {
    this.invoiceFormat = invoiceFormat;
  }

  public CorrectiveBill invoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

  /**
   * The invoice type. Can be one of the following: <ul><li><b>1</b>: Correction letter</li><li><b>2</b>: Replacement invoice</li></ul>
   * @return invoiceType
   **/
  @Schema(description = "The invoice type. Can be one of the following: <ul><li><b>1</b>: Correction letter</li><li><b>2</b>: Replacement invoice</li></ul>")
  
    public Integer getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(Integer invoiceType) {
    this.invoiceType = invoiceType;
  }

  public CorrectiveBill notes(Notes notes) {
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
    CorrectiveBill correctiveBill = (CorrectiveBill) o;
    return Objects.equals(this.extension, correctiveBill.extension) &&
        Objects.equals(this.invoiceFormat, correctiveBill.invoiceFormat) &&
        Objects.equals(this.invoiceType, correctiveBill.invoiceType) &&
        Objects.equals(this.notes, correctiveBill.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, invoiceFormat, invoiceType, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrectiveBill {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    invoiceFormat: ").append(toIndentedString(invoiceFormat)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
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
