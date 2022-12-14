package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The details associated with a tax exemption.
 */
@Schema(description = "The details associated with a tax exemption.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class TaxExemptDetails   {
  @JsonProperty("taxType")
  private Integer taxType = null;

  @JsonProperty("certificateNumber")
  private String certificateNumber = null;

  @JsonProperty("percent")
  private BigDecimal percent = null;

  @JsonProperty("starts")
  private OffsetDateTime starts = null;

  @JsonProperty("ends")
  private OffsetDateTime ends = null;

  public TaxExemptDetails taxType(Integer taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * The exemption jurisdiction type. Can be one of the following: <ul><li><b>0</b>: Federal</li><li><b>1</b>: State</li><li><b>2</b>: County</li><li><b>3</b>: City</li><li><b>4</b>: Secondary county</li><li><b>5</b>: Secondary city</li><li><b>6</b>: Territory</li><li><b>7</b>: Secondary state</li><li><b>8</b>: District</li><li><b>9</b>: Secondary federal</li><li><b>10</b>: County district</li><li><b>11</b>: City disctrict</li><li><b>12</b>: Other</li></ul>
   * @return taxType
   **/
  @Schema(description = "The exemption jurisdiction type. Can be one of the following: <ul><li><b>0</b>: Federal</li><li><b>1</b>: State</li><li><b>2</b>: County</li><li><b>3</b>: City</li><li><b>4</b>: Secondary county</li><li><b>5</b>: Secondary city</li><li><b>6</b>: Territory</li><li><b>7</b>: Secondary state</li><li><b>8</b>: District</li><li><b>9</b>: Secondary federal</li><li><b>10</b>: County district</li><li><b>11</b>: City disctrict</li><li><b>12</b>: Other</li></ul>")
  
    public Integer getTaxType() {
    return taxType;
  }

  public void setTaxType(Integer taxType) {
    this.taxType = taxType;
  }

  public TaxExemptDetails certificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
    return this;
  }

  /**
   * The tax exemption certificate number.
   * @return certificateNumber
   **/
  @Schema(required = true, description = "The tax exemption certificate number.")
      @NotNull

    public String getCertificateNumber() {
    return certificateNumber;
  }

  public void setCertificateNumber(String certificateNumber) {
    this.certificateNumber = certificateNumber;
  }

  public TaxExemptDetails percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * The percentage of the tax that is exempt, such as 50 or 100.
   * @return percent
   **/
  @Schema(required = true, description = "The percentage of the tax that is exempt, such as 50 or 100.")
      @NotNull

    @Valid
    public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public TaxExemptDetails starts(OffsetDateTime starts) {
    this.starts = starts;
    return this;
  }

  /**
   * The date and time the tax exemption starts.
   * @return starts
   **/
  @Schema(required = true, description = "The date and time the tax exemption starts.")
      @NotNull

    @Valid
    public OffsetDateTime getStarts() {
    return starts;
  }

  public void setStarts(OffsetDateTime starts) {
    this.starts = starts;
  }

  public TaxExemptDetails ends(OffsetDateTime ends) {
    this.ends = ends;
    return this;
  }

  /**
   * The date and time the tax exemption ends.
   * @return ends
   **/
  @Schema(description = "The date and time the tax exemption ends.")
  
    @Valid
    public OffsetDateTime getEnds() {
    return ends;
  }

  public void setEnds(OffsetDateTime ends) {
    this.ends = ends;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxExemptDetails taxExemptDetails = (TaxExemptDetails) o;
    return Objects.equals(this.taxType, taxExemptDetails.taxType) &&
        Objects.equals(this.certificateNumber, taxExemptDetails.certificateNumber) &&
        Objects.equals(this.percent, taxExemptDetails.percent) &&
        Objects.equals(this.starts, taxExemptDetails.starts) &&
        Objects.equals(this.ends, taxExemptDetails.ends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxType, certificateNumber, percent, starts, ends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxExemptDetails {\n");
    
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    certificateNumber: ").append(toIndentedString(certificateNumber)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    starts: ").append(toIndentedString(starts)).append("\n");
    sb.append("    ends: ").append(toIndentedString(ends)).append("\n");
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
