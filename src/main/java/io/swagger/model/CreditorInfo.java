package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CreditorsDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about a creditor.
 */
@Schema(description = "Information about a creditor.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CreditorInfo   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("creditorsDetails")
  @Valid
  private List<CreditorsDetails> creditorsDetails = null;

  public CreditorInfo extension(Object extension) {
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

  public CreditorInfo creditorsDetails(List<CreditorsDetails> creditorsDetails) {
    this.creditorsDetails = creditorsDetails;
    return this;
  }

  public CreditorInfo addCreditorsDetailsItem(CreditorsDetails creditorsDetailsItem) {
    if (this.creditorsDetails == null) {
      this.creditorsDetails = new ArrayList<CreditorsDetails>();
    }
    this.creditorsDetails.add(creditorsDetailsItem);
    return this;
  }

  /**
   * Details about a creditor.
   * @return creditorsDetails
   **/
  @Schema(description = "Details about a creditor.")
      @Valid
    public List<CreditorsDetails> getCreditorsDetails() {
    return creditorsDetails;
  }

  public void setCreditorsDetails(List<CreditorsDetails> creditorsDetails) {
    this.creditorsDetails = creditorsDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditorInfo creditorInfo = (CreditorInfo) o;
    return Objects.equals(this.extension, creditorInfo.extension) &&
        Objects.equals(this.creditorsDetails, creditorInfo.creditorsDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, creditorsDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditorInfo {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    creditorsDetails: ").append(toIndentedString(creditorsDetails)).append("\n");
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
