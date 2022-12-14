package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of loans.
 */
@Schema(description = "The list of loans.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class LoanDetails   {
  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("loanAmount")
  private BigDecimal loanAmount = null;

  @JsonProperty("loanFee")
  private BigDecimal loanFee = null;

  @JsonProperty("tax")
  private BigDecimal tax = null;

  @JsonProperty("outstandingAmount")
  private BigDecimal outstandingAmount = null;

  @JsonProperty("loanFeeRef")
  private ResourceRef loanFeeRef = null;

  @JsonProperty("loanDebitRef")
  private ResourceRef loanDebitRef = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("channel")
  private String channel = null;

  public LoanDetails serviceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
    return this;
  }

  /**
   * Get serviceRef
   * @return serviceRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getServiceRef() {
    return serviceRef;
  }

  public void setServiceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
  }

  public LoanDetails loanAmount(BigDecimal loanAmount) {
    this.loanAmount = loanAmount;
    return this;
  }

  /**
   * The loan amount.
   * @return loanAmount
   **/
  @Schema(description = "The loan amount.")
  
    @Valid
    public BigDecimal getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(BigDecimal loanAmount) {
    this.loanAmount = loanAmount;
  }

  public LoanDetails loanFee(BigDecimal loanFee) {
    this.loanFee = loanFee;
    return this;
  }

  /**
   * The loan's fee.
   * @return loanFee
   **/
  @Schema(description = "The loan's fee.")
  
    @Valid
    public BigDecimal getLoanFee() {
    return loanFee;
  }

  public void setLoanFee(BigDecimal loanFee) {
    this.loanFee = loanFee;
  }

  public LoanDetails tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

  /**
   * The tax to apply on the loan.
   * @return tax
   **/
  @Schema(description = "The tax to apply on the loan.")
  
    @Valid
    public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

  public LoanDetails outstandingAmount(BigDecimal outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
    return this;
  }

  /**
   * The amount of the loan that is still owed.
   * @return outstandingAmount
   **/
  @Schema(description = "The amount of the loan that is still owed.")
  
    @Valid
    public BigDecimal getOutstandingAmount() {
    return outstandingAmount;
  }

  public void setOutstandingAmount(BigDecimal outstandingAmount) {
    this.outstandingAmount = outstandingAmount;
  }

  public LoanDetails loanFeeRef(ResourceRef loanFeeRef) {
    this.loanFeeRef = loanFeeRef;
    return this;
  }

  /**
   * Get loanFeeRef
   * @return loanFeeRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getLoanFeeRef() {
    return loanFeeRef;
  }

  public void setLoanFeeRef(ResourceRef loanFeeRef) {
    this.loanFeeRef = loanFeeRef;
  }

  public LoanDetails loanDebitRef(ResourceRef loanDebitRef) {
    this.loanDebitRef = loanDebitRef;
    return this;
  }

  /**
   * Get loanDebitRef
   * @return loanDebitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getLoanDebitRef() {
    return loanDebitRef;
  }

  public void setLoanDebitRef(ResourceRef loanDebitRef) {
    this.loanDebitRef = loanDebitRef;
  }

  public LoanDetails type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * The type of loan. Can be one of the following: <ul><li><b>0</b>: Currency or emergency loan</li><li><b>1</b>: Data loan</li><li><b>2</b>: Hybrid loan</li><ul>
   * @return type
   **/
  @Schema(description = "The type of loan. Can be one of the following: <ul><li><b>0</b>: Currency or emergency loan</li><li><b>1</b>: Data loan</li><li><b>2</b>: Hybrid loan</li><ul>")
  
    public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public LoanDetails channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * The channel that requested the loan. For example, USSD or IVR.
   * @return channel
   **/
  @Schema(description = "The channel that requested the loan. For example, USSD or IVR.")
  
    public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanDetails loanDetails = (LoanDetails) o;
    return Objects.equals(this.serviceRef, loanDetails.serviceRef) &&
        Objects.equals(this.loanAmount, loanDetails.loanAmount) &&
        Objects.equals(this.loanFee, loanDetails.loanFee) &&
        Objects.equals(this.tax, loanDetails.tax) &&
        Objects.equals(this.outstandingAmount, loanDetails.outstandingAmount) &&
        Objects.equals(this.loanFeeRef, loanDetails.loanFeeRef) &&
        Objects.equals(this.loanDebitRef, loanDetails.loanDebitRef) &&
        Objects.equals(this.type, loanDetails.type) &&
        Objects.equals(this.channel, loanDetails.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRef, loanAmount, loanFee, tax, outstandingAmount, loanFeeRef, loanDebitRef, type, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanDetails {\n");
    
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    loanFee: ").append(toIndentedString(loanFee)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    outstandingAmount: ").append(toIndentedString(outstandingAmount)).append("\n");
    sb.append("    loanFeeRef: ").append(toIndentedString(loanFeeRef)).append("\n");
    sb.append("    loanDebitRef: ").append(toIndentedString(loanDebitRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
