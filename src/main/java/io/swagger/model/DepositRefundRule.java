package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The deposit refund rule.
 */
@Schema(description = "The deposit refund rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositRefundRule   {
  @JsonProperty("id")
  private Long id = null;

  /**
   * Gets or Sets offsetPeriodUnit
   */
  public enum OffsetPeriodUnitEnum {
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    OffsetPeriodUnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OffsetPeriodUnitEnum fromValue(String text) {
      for (OffsetPeriodUnitEnum b : OffsetPeriodUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("offsetPeriodUnit")
  private OffsetPeriodUnitEnum offsetPeriodUnit = null;

  @JsonProperty("offsetPeriodValue")
  private Integer offsetPeriodValue = null;

  @JsonProperty("minRefundAmount")
  private Money minRefundAmount = null;

  @JsonProperty("hasWorkFlow")
  private Boolean hasWorkFlow = true;

  /**
   * The handling fee type.
   */
  public enum HandlingFeeTypeEnum {
    PERCENTAGE("PERCENTAGE"),
    
    ABSOLUTE("ABSOLUTE");

    private String value;

    HandlingFeeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HandlingFeeTypeEnum fromValue(String text) {
      for (HandlingFeeTypeEnum b : HandlingFeeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("handlingFeeType")
  private HandlingFeeTypeEnum handlingFeeType = null;

  @JsonProperty("handlingFee")
  private Money handlingFee = null;

  @JsonProperty("glCode")
  private String glCode = null;

  public DepositRefundRule id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DepositRefundRule offsetPeriodUnit(OffsetPeriodUnitEnum offsetPeriodUnit) {
    this.offsetPeriodUnit = offsetPeriodUnit;
    return this;
  }

  /**
   * Get offsetPeriodUnit
   * @return offsetPeriodUnit
   **/
  @Schema(description = "")
  
    public OffsetPeriodUnitEnum getOffsetPeriodUnit() {
    return offsetPeriodUnit;
  }

  public void setOffsetPeriodUnit(OffsetPeriodUnitEnum offsetPeriodUnit) {
    this.offsetPeriodUnit = offsetPeriodUnit;
  }

  public DepositRefundRule offsetPeriodValue(Integer offsetPeriodValue) {
    this.offsetPeriodValue = offsetPeriodValue;
    return this;
  }

  /**
   * The offer period value.
   * @return offsetPeriodValue
   **/
  @Schema(description = "The offer period value.")
  
    public Integer getOffsetPeriodValue() {
    return offsetPeriodValue;
  }

  public void setOffsetPeriodValue(Integer offsetPeriodValue) {
    this.offsetPeriodValue = offsetPeriodValue;
  }

  public DepositRefundRule minRefundAmount(Money minRefundAmount) {
    this.minRefundAmount = minRefundAmount;
    return this;
  }

  /**
   * Get minRefundAmount
   * @return minRefundAmount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Money getMinRefundAmount() {
    return minRefundAmount;
  }

  public void setMinRefundAmount(Money minRefundAmount) {
    this.minRefundAmount = minRefundAmount;
  }

  public DepositRefundRule hasWorkFlow(Boolean hasWorkFlow) {
    this.hasWorkFlow = hasWorkFlow;
    return this;
  }

  /**
   * If the deposit refund has a workflow (<b>true</b>) or not(<b>false</b>).
   * @return hasWorkFlow
   **/
  @Schema(description = "If the deposit refund has a workflow (<b>true</b>) or not(<b>false</b>).")
  
    public Boolean isHasWorkFlow() {
    return hasWorkFlow;
  }

  public void setHasWorkFlow(Boolean hasWorkFlow) {
    this.hasWorkFlow = hasWorkFlow;
  }

  public DepositRefundRule handlingFeeType(HandlingFeeTypeEnum handlingFeeType) {
    this.handlingFeeType = handlingFeeType;
    return this;
  }

  /**
   * The handling fee type.
   * @return handlingFeeType
   **/
  @Schema(required = true, description = "The handling fee type.")
      @NotNull

    public HandlingFeeTypeEnum getHandlingFeeType() {
    return handlingFeeType;
  }

  public void setHandlingFeeType(HandlingFeeTypeEnum handlingFeeType) {
    this.handlingFeeType = handlingFeeType;
  }

  public DepositRefundRule handlingFee(Money handlingFee) {
    this.handlingFee = handlingFee;
    return this;
  }

  /**
   * Get handlingFee
   * @return handlingFee
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Money getHandlingFee() {
    return handlingFee;
  }

  public void setHandlingFee(Money handlingFee) {
    this.handlingFee = handlingFee;
  }

  public DepositRefundRule glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

  /**
   * The general ledger ID.
   * @return glCode
   **/
  @Schema(description = "The general ledger ID.")
  
    public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositRefundRule depositRefundRule = (DepositRefundRule) o;
    return Objects.equals(this.id, depositRefundRule.id) &&
        Objects.equals(this.offsetPeriodUnit, depositRefundRule.offsetPeriodUnit) &&
        Objects.equals(this.offsetPeriodValue, depositRefundRule.offsetPeriodValue) &&
        Objects.equals(this.minRefundAmount, depositRefundRule.minRefundAmount) &&
        Objects.equals(this.hasWorkFlow, depositRefundRule.hasWorkFlow) &&
        Objects.equals(this.handlingFeeType, depositRefundRule.handlingFeeType) &&
        Objects.equals(this.handlingFee, depositRefundRule.handlingFee) &&
        Objects.equals(this.glCode, depositRefundRule.glCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offsetPeriodUnit, offsetPeriodValue, minRefundAmount, hasWorkFlow, handlingFeeType, handlingFee, glCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositRefundRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offsetPeriodUnit: ").append(toIndentedString(offsetPeriodUnit)).append("\n");
    sb.append("    offsetPeriodValue: ").append(toIndentedString(offsetPeriodValue)).append("\n");
    sb.append("    minRefundAmount: ").append(toIndentedString(minRefundAmount)).append("\n");
    sb.append("    hasWorkFlow: ").append(toIndentedString(hasWorkFlow)).append("\n");
    sb.append("    handlingFeeType: ").append(toIndentedString(handlingFeeType)).append("\n");
    sb.append("    handlingFee: ").append(toIndentedString(handlingFee)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
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
