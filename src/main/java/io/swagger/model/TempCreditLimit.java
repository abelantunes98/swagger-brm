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
 * The temporary credit limit, used when a loan has been granted or credit limit breach has been allowed.
 */
@Schema(description = "The temporary credit limit, used when a loan has been granted or credit limit breach has been allowed.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class TempCreditLimit   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("limit")
  private BigDecimal limit = null;

  @JsonProperty("resourceId")
  private Integer resourceId = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validToUnit")
  private Integer validToUnit = null;

  @JsonProperty("validToOffset")
  private Integer validToOffset = null;

  @JsonProperty("validFromUnit")
  private Integer validFromUnit = null;

  @JsonProperty("validFromOffset")
  private Integer validFromOffset = null;

  public TempCreditLimit extension(Object extension) {
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

  public TempCreditLimit limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The temporary credit limit amount.
   * @return limit
   **/
  @Schema(description = "The temporary credit limit amount.")
  
    @Valid
    public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public TempCreditLimit resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The resource ID associated with the temporary credit limit.
   * @return resourceId
   **/
  @Schema(description = "The resource ID associated with the temporary credit limit.")
  
    public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public TempCreditLimit validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time temporary credit limit's validity ends.
   * @return validTo
   **/
  @Schema(required = true, description = "The date and time temporary credit limit's validity ends.")
      @NotNull

    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public TempCreditLimit validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time temporary credit limit's validity starts.
   * @return validFrom
   **/
  @Schema(required = true, description = "The date and time temporary credit limit's validity starts.")
      @NotNull

    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public TempCreditLimit validToUnit(Integer validToUnit) {
    this.validToUnit = validToUnit;
    return this;
  }

  /**
   * The unit for the temporary credit limit's validity period end.
   * @return validToUnit
   **/
  @Schema(description = "The unit for the temporary credit limit's validity period end.")
  
    public Integer getValidToUnit() {
    return validToUnit;
  }

  public void setValidToUnit(Integer validToUnit) {
    this.validToUnit = validToUnit;
  }

  public TempCreditLimit validToOffset(Integer validToOffset) {
    this.validToOffset = validToOffset;
    return this;
  }

  /**
   * The offset for the temporary credit limit's validity period end.
   * @return validToOffset
   **/
  @Schema(description = "The offset for the temporary credit limit's validity period end.")
  
    public Integer getValidToOffset() {
    return validToOffset;
  }

  public void setValidToOffset(Integer validToOffset) {
    this.validToOffset = validToOffset;
  }

  public TempCreditLimit validFromUnit(Integer validFromUnit) {
    this.validFromUnit = validFromUnit;
    return this;
  }

  /**
   * The unit for the temporary credit limit's validity period start.
   * @return validFromUnit
   **/
  @Schema(description = "The unit for the temporary credit limit's validity period start.")
  
    public Integer getValidFromUnit() {
    return validFromUnit;
  }

  public void setValidFromUnit(Integer validFromUnit) {
    this.validFromUnit = validFromUnit;
  }

  public TempCreditLimit validFromOffset(Integer validFromOffset) {
    this.validFromOffset = validFromOffset;
    return this;
  }

  /**
   * The offset for the temporary credit limit's validity period start.
   * @return validFromOffset
   **/
  @Schema(description = "The offset for the temporary credit limit's validity period start.")
  
    public Integer getValidFromOffset() {
    return validFromOffset;
  }

  public void setValidFromOffset(Integer validFromOffset) {
    this.validFromOffset = validFromOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TempCreditLimit tempCreditLimit = (TempCreditLimit) o;
    return Objects.equals(this.extension, tempCreditLimit.extension) &&
        Objects.equals(this.limit, tempCreditLimit.limit) &&
        Objects.equals(this.resourceId, tempCreditLimit.resourceId) &&
        Objects.equals(this.validTo, tempCreditLimit.validTo) &&
        Objects.equals(this.validFrom, tempCreditLimit.validFrom) &&
        Objects.equals(this.validToUnit, tempCreditLimit.validToUnit) &&
        Objects.equals(this.validToOffset, tempCreditLimit.validToOffset) &&
        Objects.equals(this.validFromUnit, tempCreditLimit.validFromUnit) &&
        Objects.equals(this.validFromOffset, tempCreditLimit.validFromOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, limit, resourceId, validTo, validFrom, validToUnit, validToOffset, validFromUnit, validFromOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TempCreditLimit {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validToUnit: ").append(toIndentedString(validToUnit)).append("\n");
    sb.append("    validToOffset: ").append(toIndentedString(validToOffset)).append("\n");
    sb.append("    validFromUnit: ").append(toIndentedString(validFromUnit)).append("\n");
    sb.append("    validFromOffset: ").append(toIndentedString(validFromOffset)).append("\n");
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
