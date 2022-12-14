package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LoanDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about loans.
 */
@Schema(description = "Details about loans.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class LoanDetail   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("availableLoanLimit")
  private BigDecimal availableLoanLimit = null;

  @JsonProperty("creditLimit")
  private BigDecimal creditLimit = null;

  @JsonProperty("loanDetails")
  @Valid
  private List<LoanDetails> loanDetails = null;

  public LoanDetail extension(Object extension) {
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

  public LoanDetail availableLoanLimit(BigDecimal availableLoanLimit) {
    this.availableLoanLimit = availableLoanLimit;
    return this;
  }

  /**
   * The amount that the customer can currently be loaned, based on the amount specified in <b>creditLimit</b> and the current total outstanding amount for all active loans.
   * @return availableLoanLimit
   **/
  @Schema(description = "The amount that the customer can currently be loaned, based on the amount specified in <b>creditLimit</b> and the current total outstanding amount for all active loans.")
  
    @Valid
    public BigDecimal getAvailableLoanLimit() {
    return availableLoanLimit;
  }

  public void setAvailableLoanLimit(BigDecimal availableLoanLimit) {
    this.availableLoanLimit = availableLoanLimit;
  }

  public LoanDetail creditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * The maximum total amount the customer can be loaned.
   * @return creditLimit
   **/
  @Schema(description = "The maximum total amount the customer can be loaned.")
  
    @Valid
    public BigDecimal getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public LoanDetail loanDetails(List<LoanDetails> loanDetails) {
    this.loanDetails = loanDetails;
    return this;
  }

  public LoanDetail addLoanDetailsItem(LoanDetails loanDetailsItem) {
    if (this.loanDetails == null) {
      this.loanDetails = new ArrayList<LoanDetails>();
    }
    this.loanDetails.add(loanDetailsItem);
    return this;
  }

  /**
   * The list of individual loans.
   * @return loanDetails
   **/
  @Schema(description = "The list of individual loans.")
      @Valid
    public List<LoanDetails> getLoanDetails() {
    return loanDetails;
  }

  public void setLoanDetails(List<LoanDetails> loanDetails) {
    this.loanDetails = loanDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanDetail loanDetail = (LoanDetail) o;
    return Objects.equals(this.extension, loanDetail.extension) &&
        Objects.equals(this.availableLoanLimit, loanDetail.availableLoanLimit) &&
        Objects.equals(this.creditLimit, loanDetail.creditLimit) &&
        Objects.equals(this.loanDetails, loanDetail.loanDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, availableLoanLimit, creditLimit, loanDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanDetail {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    availableLoanLimit: ").append(toIndentedString(availableLoanLimit)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    loanDetails: ").append(toIndentedString(loanDetails)).append("\n");
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
