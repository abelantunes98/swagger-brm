package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The loan information.
 */
@Schema(description = "The loan information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class LoanInfo   {
  @JsonProperty("age")
  private Integer age = 0;

  @JsonProperty("serviceFee")
  private BigDecimal serviceFee = new BigDecimal(0);

  @JsonProperty("ageOffsetUnit")
  private String ageOffsetUnit = null;

  @JsonProperty("minimum")
  private BigDecimal minimum = new BigDecimal(0);

  @JsonProperty("maximum")
  private BigDecimal maximum = new BigDecimal(0);

  @JsonProperty("resourceId")
  private Integer resourceId = 0;

  @JsonProperty("maxQuantity")
  private Integer maxQuantity = 0;

  @JsonProperty("taxCode")
  private String taxCode = null;

  @JsonProperty("loanTaxCode")
  private String loanTaxCode = null;

  @JsonProperty("percentFee")
  private BigDecimal percentFee = new BigDecimal(0);

  @JsonProperty("scaledMaximum")
  private BigDecimal scaledMaximum = new BigDecimal(0);

  @JsonProperty("reasonId")
  private Integer reasonId = 0;

  @JsonProperty("reasonDomainId")
  private Integer reasonDomainId = 0;

  @JsonProperty("locationMode")
  private Integer locationMode = null;

  public LoanInfo age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * The minimum number of days, months, or years the account must be active to be eligible for a loan.
   * @return age
   **/
  @Schema(description = "The minimum number of days, months, or years the account must be active to be eligible for a loan.")
  
    public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public LoanInfo serviceFee(BigDecimal serviceFee) {
    this.serviceFee = serviceFee;
    return this;
  }

  /**
   * The fixed amount to charge as service fee. If you specify this, you cannot specify percentFee.
   * @return serviceFee
   **/
  @Schema(required = true, description = "The fixed amount to charge as service fee. If you specify this, you cannot specify percentFee.")
      @NotNull

    @Valid
    public BigDecimal getServiceFee() {
    return serviceFee;
  }

  public void setServiceFee(BigDecimal serviceFee) {
    this.serviceFee = serviceFee;
  }

  public LoanInfo ageOffsetUnit(String ageOffsetUnit) {
    this.ageOffsetUnit = ageOffsetUnit;
    return this;
  }

  /**
   * The unit (days, months, or years) for the account age eligibility number.
   * @return ageOffsetUnit
   **/
  @Schema(required = true, description = "The unit (days, months, or years) for the account age eligibility number.")
      @NotNull

    public String getAgeOffsetUnit() {
    return ageOffsetUnit;
  }

  public void setAgeOffsetUnit(String ageOffsetUnit) {
    this.ageOffsetUnit = ageOffsetUnit;
  }

  public LoanInfo minimum(BigDecimal minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * The minimum amount for the loan.
   * @return minimum
   **/
  @Schema(required = true, description = "The minimum amount for the loan.")
      @NotNull

    @Valid
    public BigDecimal getMinimum() {
    return minimum;
  }

  public void setMinimum(BigDecimal minimum) {
    this.minimum = minimum;
  }

  public LoanInfo maximum(BigDecimal maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * The fixed maximum amount for the loan. If you specify this, you cannot specify scaledMaximum.
   * @return maximum
   **/
  @Schema(required = true, description = "The fixed maximum amount for the loan. If you specify this, you cannot specify scaledMaximum.")
      @NotNull

    @Valid
    public BigDecimal getMaximum() {
    return maximum;
  }

  public void setMaximum(BigDecimal maximum) {
    this.maximum = maximum;
  }

  public LoanInfo resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The ID of a noncurrency resource to use when calculating the loan when scaledMaximum is specified.
   * @return resourceId
   **/
  @Schema(description = "The ID of a noncurrency resource to use when calculating the loan when scaledMaximum is specified.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public LoanInfo maxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }

  /**
   * The maximum number of times the loan can be granted in each loan cycle.
   * @return maxQuantity
   **/
  @Schema(description = "The maximum number of times the loan can be granted in each loan cycle.")
  
    public Integer getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public LoanInfo taxCode(String taxCode) {
    this.taxCode = taxCode;
    return this;
  }

  /**
   * The tax code for the loan service fee.
   * @return taxCode
   **/
  @Schema(required = true, description = "The tax code for the loan service fee.")
      @NotNull

    public String getTaxCode() {
    return taxCode;
  }

  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }

  public LoanInfo loanTaxCode(String loanTaxCode) {
    this.loanTaxCode = loanTaxCode;
    return this;
  }

  /**
   * The tax code for the loan.
   * @return loanTaxCode
   **/
  @Schema(required = true, description = "The tax code for the loan.")
      @NotNull

    public String getLoanTaxCode() {
    return loanTaxCode;
  }

  public void setLoanTaxCode(String loanTaxCode) {
    this.loanTaxCode = loanTaxCode;
  }

  public LoanInfo percentFee(BigDecimal percentFee) {
    this.percentFee = percentFee;
    return this;
  }

  /**
   * The percent of the loan to charge as a service fee. If you specify this, you cannot specify serviceFee.
   * @return percentFee
   **/
  @Schema(required = true, description = "The percent of the loan to charge as a service fee. If you specify this, you cannot specify serviceFee.")
      @NotNull

    @Valid
    public BigDecimal getPercentFee() {
    return percentFee;
  }

  public void setPercentFee(BigDecimal percentFee) {
    this.percentFee = percentFee;
  }

  public LoanInfo scaledMaximum(BigDecimal scaledMaximum) {
    this.scaledMaximum = scaledMaximum;
    return this;
  }

  /**
   * The maximum scaled amount to grant. This is a percent of the resource specified in resourceId, which represents consumption of a noncurrency resource in the previous calendar month. If you specify this, you cannot specify the maximum element.
   * @return scaledMaximum
   **/
  @Schema(required = true, description = "The maximum scaled amount to grant. This is a percent of the resource specified in resourceId, which represents consumption of a noncurrency resource in the previous calendar month. If you specify this, you cannot specify the maximum element.")
      @NotNull

    @Valid
    public BigDecimal getScaledMaximum() {
    return scaledMaximum;
  }

  public void setScaledMaximum(BigDecimal scaledMaximum) {
    this.scaledMaximum = scaledMaximum;
  }

  public LoanInfo reasonId(Integer reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  /**
   * The A/R reason code to map to the G/L ID.
   * @return reasonId
   **/
  @Schema(description = "The A/R reason code to map to the G/L ID.")
  
    public Integer getReasonId() {
    return reasonId;
  }

  public void setReasonId(Integer reasonId) {
    this.reasonId = reasonId;
  }

  public LoanInfo reasonDomainId(Integer reasonDomainId) {
    this.reasonDomainId = reasonDomainId;
    return this;
  }

  /**
   * The A/R reason domain to map to the G/L ID.
   * @return reasonDomainId
   **/
  @Schema(description = "The A/R reason domain to map to the G/L ID.")
  
    public Integer getReasonDomainId() {
    return reasonDomainId;
  }

  public void setReasonDomainId(Integer reasonDomainId) {
    this.reasonDomainId = reasonDomainId;
  }

  public LoanInfo locationMode(Integer locationMode) {
    this.locationMode = locationMode;
    return this;
  }

  /**
   * Whether the locations specified are where the loan is allowed (<b>0</b>) or not (<b>1</b>).
   * @return locationMode
   **/
  @Schema(description = "Whether the locations specified are where the loan is allowed (<b>0</b>) or not (<b>1</b>).")
  
    public Integer getLocationMode() {
    return locationMode;
  }

  public void setLocationMode(Integer locationMode) {
    this.locationMode = locationMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanInfo loanInfo = (LoanInfo) o;
    return Objects.equals(this.age, loanInfo.age) &&
        Objects.equals(this.serviceFee, loanInfo.serviceFee) &&
        Objects.equals(this.ageOffsetUnit, loanInfo.ageOffsetUnit) &&
        Objects.equals(this.minimum, loanInfo.minimum) &&
        Objects.equals(this.maximum, loanInfo.maximum) &&
        Objects.equals(this.resourceId, loanInfo.resourceId) &&
        Objects.equals(this.maxQuantity, loanInfo.maxQuantity) &&
        Objects.equals(this.taxCode, loanInfo.taxCode) &&
        Objects.equals(this.loanTaxCode, loanInfo.loanTaxCode) &&
        Objects.equals(this.percentFee, loanInfo.percentFee) &&
        Objects.equals(this.scaledMaximum, loanInfo.scaledMaximum) &&
        Objects.equals(this.reasonId, loanInfo.reasonId) &&
        Objects.equals(this.reasonDomainId, loanInfo.reasonDomainId) &&
        Objects.equals(this.locationMode, loanInfo.locationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, serviceFee, ageOffsetUnit, minimum, maximum, resourceId, maxQuantity, taxCode, loanTaxCode, percentFee, scaledMaximum, reasonId, reasonDomainId, locationMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanInfo {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    serviceFee: ").append(toIndentedString(serviceFee)).append("\n");
    sb.append("    ageOffsetUnit: ").append(toIndentedString(ageOffsetUnit)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    loanTaxCode: ").append(toIndentedString(loanTaxCode)).append("\n");
    sb.append("    percentFee: ").append(toIndentedString(percentFee)).append("\n");
    sb.append("    scaledMaximum: ").append(toIndentedString(scaledMaximum)).append("\n");
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
    sb.append("    reasonDomainId: ").append(toIndentedString(reasonDomainId)).append("\n");
    sb.append("    locationMode: ").append(toIndentedString(locationMode)).append("\n");
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
