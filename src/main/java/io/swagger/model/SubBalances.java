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
 * The list of sub-balances associated with the balance.
 */
@Schema(description = "The list of sub-balances associated with the balance.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SubBalances   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("currentBalance")
  private BigDecimal currentBalance = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("rolloverData")
  private Integer rolloverData = null;

  @JsonProperty("expiredBeforeUsing")
  private BigDecimal expiredBeforeUsing = null;

  @JsonProperty("elementId")
  private Integer elementId = null;

  public SubBalances extension(Object extension) {
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

  public SubBalances currentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * The current amount of the sub-balance.
   * @return currentBalance
   **/
  @Schema(description = "The current amount of the sub-balance.")
  
    @Valid
    public BigDecimal getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(BigDecimal currentBalance) {
    this.currentBalance = currentBalance;
  }

  public SubBalances validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time the validity period starts.
   * @return validFrom
   **/
  @Schema(description = "The date and time the validity period starts.")
  
    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public SubBalances validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the validity period ends.
   * @return validTo
   **/
  @Schema(description = "The date and time the validity period ends.")
  
    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public SubBalances rolloverData(Integer rolloverData) {
    this.rolloverData = rolloverData;
    return this;
  }

  /**
   * Details about a rollover subbalance.
   * @return rolloverData
   **/
  @Schema(description = "Details about a rollover subbalance.")
  
    public Integer getRolloverData() {
    return rolloverData;
  }

  public void setRolloverData(Integer rolloverData) {
    this.rolloverData = rolloverData;
  }

  public SubBalances expiredBeforeUsing(BigDecimal expiredBeforeUsing) {
    this.expiredBeforeUsing = expiredBeforeUsing;
    return this;
  }

  /**
   * The number of days until the sub-balance expires.
   * @return expiredBeforeUsing
   **/
  @Schema(description = "The number of days until the sub-balance expires.")
  
    @Valid
    public BigDecimal getExpiredBeforeUsing() {
    return expiredBeforeUsing;
  }

  public void setExpiredBeforeUsing(BigDecimal expiredBeforeUsing) {
    this.expiredBeforeUsing = expiredBeforeUsing;
  }

  public SubBalances elementId(Integer elementId) {
    this.elementId = elementId;
    return this;
  }

  /**
   * The ID of the element.
   * @return elementId
   **/
  @Schema(description = "The ID of the element.")
  
    public Integer getElementId() {
    return elementId;
  }

  public void setElementId(Integer elementId) {
    this.elementId = elementId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubBalances subBalances = (SubBalances) o;
    return Objects.equals(this.extension, subBalances.extension) &&
        Objects.equals(this.currentBalance, subBalances.currentBalance) &&
        Objects.equals(this.validFrom, subBalances.validFrom) &&
        Objects.equals(this.validTo, subBalances.validTo) &&
        Objects.equals(this.rolloverData, subBalances.rolloverData) &&
        Objects.equals(this.expiredBeforeUsing, subBalances.expiredBeforeUsing) &&
        Objects.equals(this.elementId, subBalances.elementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, currentBalance, validFrom, validTo, rolloverData, expiredBeforeUsing, elementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubBalances {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    rolloverData: ").append(toIndentedString(rolloverData)).append("\n");
    sb.append("    expiredBeforeUsing: ").append(toIndentedString(expiredBeforeUsing)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
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
