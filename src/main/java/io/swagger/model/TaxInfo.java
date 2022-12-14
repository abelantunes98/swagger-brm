package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.TaxExemptDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tax information.
 */
@Schema(description = "Tax information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class TaxInfo   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("businessAccount")
  private Boolean businessAccount = null;

  @JsonProperty("insideIncorporatedArea")
  private Boolean insideIncorporatedArea = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("taxExemptDetails")
  @Valid
  private List<TaxExemptDetails> taxExemptDetails = null;

  public TaxInfo extension(Object extension) {
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

  public TaxInfo businessAccount(Boolean businessAccount) {
    this.businessAccount = businessAccount;
    return this;
  }

  /**
   * Whether this is a business account (<b>true</b>) or not (<b>false</b>).
   * @return businessAccount
   **/
  @Schema(description = "Whether this is a business account (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isBusinessAccount() {
    return businessAccount;
  }

  public void setBusinessAccount(Boolean businessAccount) {
    this.businessAccount = businessAccount;
  }

  public TaxInfo insideIncorporatedArea(Boolean insideIncorporatedArea) {
    this.insideIncorporatedArea = insideIncorporatedArea;
    return this;
  }

  /**
   * Whether the customer is located inside the incorporated area of a city (<b>true</b>) or not (<b>false</b>).
   * @return insideIncorporatedArea
   **/
  @Schema(description = "Whether the customer is located inside the incorporated area of a city (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isInsideIncorporatedArea() {
    return insideIncorporatedArea;
  }

  public void setInsideIncorporatedArea(Boolean insideIncorporatedArea) {
    this.insideIncorporatedArea = insideIncorporatedArea;
  }

  public TaxInfo notes(Notes notes) {
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

  public TaxInfo taxExemptDetails(List<TaxExemptDetails> taxExemptDetails) {
    this.taxExemptDetails = taxExemptDetails;
    return this;
  }

  public TaxInfo addTaxExemptDetailsItem(TaxExemptDetails taxExemptDetailsItem) {
    if (this.taxExemptDetails == null) {
      this.taxExemptDetails = new ArrayList<TaxExemptDetails>();
    }
    this.taxExemptDetails.add(taxExemptDetailsItem);
    return this;
  }

  /**
   * The list of details associated with a tax exemption.
   * @return taxExemptDetails
   **/
  @Schema(description = "The list of details associated with a tax exemption.")
      @Valid
    public List<TaxExemptDetails> getTaxExemptDetails() {
    return taxExemptDetails;
  }

  public void setTaxExemptDetails(List<TaxExemptDetails> taxExemptDetails) {
    this.taxExemptDetails = taxExemptDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxInfo taxInfo = (TaxInfo) o;
    return Objects.equals(this.extension, taxInfo.extension) &&
        Objects.equals(this.businessAccount, taxInfo.businessAccount) &&
        Objects.equals(this.insideIncorporatedArea, taxInfo.insideIncorporatedArea) &&
        Objects.equals(this.notes, taxInfo.notes) &&
        Objects.equals(this.taxExemptDetails, taxInfo.taxExemptDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, businessAccount, insideIncorporatedArea, notes, taxExemptDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxInfo {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    businessAccount: ").append(toIndentedString(businessAccount)).append("\n");
    sb.append("    insideIncorporatedArea: ").append(toIndentedString(insideIncorporatedArea)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    taxExemptDetails: ").append(toIndentedString(taxExemptDetails)).append("\n");
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
