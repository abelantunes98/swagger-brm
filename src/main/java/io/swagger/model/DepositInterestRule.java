package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The deposit interest rule.
 */
@Schema(description = "The deposit interest rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositInterestRule   {
  /**
   * The deposit interest type.
   */
  public enum InterestTypeEnum {
    FLAT("FLAT"),
    
    COMPOUND("COMPOUND");

    private String value;

    InterestTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InterestTypeEnum fromValue(String text) {
      for (InterestTypeEnum b : InterestTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("interestType")
  private InterestTypeEnum interestType = null;

  @JsonProperty("interestRate")
  private BigDecimal interestRate = null;

  /**
   * The date when interest starts on the deposit.
   */
  public enum StartInterestFromEnum {
    DEPOSIT_DATE("DEPOSIT_DATE"),
    
    FULLPAYMENT_RECEIVED_DATE("FULLPAYMENT_RECEIVED_DATE");

    private String value;

    StartInterestFromEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StartInterestFromEnum fromValue(String text) {
      for (StartInterestFromEnum b : StartInterestFromEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("startInterestFrom")
  private StartInterestFromEnum startInterestFrom = null;

  @JsonProperty("glCode")
  private String glCode = null;

  @JsonProperty("interestFrequencyValue")
  private Integer interestFrequencyValue = null;

  /**
   * The interest frequency unit.
   */
  public enum InterestFrequencyUnitEnum {
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH");

    private String value;

    InterestFrequencyUnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InterestFrequencyUnitEnum fromValue(String text) {
      for (InterestFrequencyUnitEnum b : InterestFrequencyUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("interestFrequencyUnit")
  private InterestFrequencyUnitEnum interestFrequencyUnit = InterestFrequencyUnitEnum.MONTH;

  public DepositInterestRule interestType(InterestTypeEnum interestType) {
    this.interestType = interestType;
    return this;
  }

  /**
   * The deposit interest type.
   * @return interestType
   **/
  @Schema(required = true, description = "The deposit interest type.")
      @NotNull

    public InterestTypeEnum getInterestType() {
    return interestType;
  }

  public void setInterestType(InterestTypeEnum interestType) {
    this.interestType = interestType;
  }

  public DepositInterestRule interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * The deposit interest rate.
   * @return interestRate
   **/
  @Schema(required = true, description = "The deposit interest rate.")
      @NotNull

    @Valid
    public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }

  public DepositInterestRule startInterestFrom(StartInterestFromEnum startInterestFrom) {
    this.startInterestFrom = startInterestFrom;
    return this;
  }

  /**
   * The date when interest starts on the deposit.
   * @return startInterestFrom
   **/
  @Schema(description = "The date when interest starts on the deposit.")
  
    public StartInterestFromEnum getStartInterestFrom() {
    return startInterestFrom;
  }

  public void setStartInterestFrom(StartInterestFromEnum startInterestFrom) {
    this.startInterestFrom = startInterestFrom;
  }

  public DepositInterestRule glCode(String glCode) {
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

  public DepositInterestRule interestFrequencyValue(Integer interestFrequencyValue) {
    this.interestFrequencyValue = interestFrequencyValue;
    return this;
  }

  /**
   * The interest frequency.
   * @return interestFrequencyValue
   **/
  @Schema(description = "The interest frequency.")
  
    public Integer getInterestFrequencyValue() {
    return interestFrequencyValue;
  }

  public void setInterestFrequencyValue(Integer interestFrequencyValue) {
    this.interestFrequencyValue = interestFrequencyValue;
  }

  public DepositInterestRule interestFrequencyUnit(InterestFrequencyUnitEnum interestFrequencyUnit) {
    this.interestFrequencyUnit = interestFrequencyUnit;
    return this;
  }

  /**
   * The interest frequency unit.
   * @return interestFrequencyUnit
   **/
  @Schema(description = "The interest frequency unit.")
  
    public InterestFrequencyUnitEnum getInterestFrequencyUnit() {
    return interestFrequencyUnit;
  }

  public void setInterestFrequencyUnit(InterestFrequencyUnitEnum interestFrequencyUnit) {
    this.interestFrequencyUnit = interestFrequencyUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositInterestRule depositInterestRule = (DepositInterestRule) o;
    return Objects.equals(this.interestType, depositInterestRule.interestType) &&
        Objects.equals(this.interestRate, depositInterestRule.interestRate) &&
        Objects.equals(this.startInterestFrom, depositInterestRule.startInterestFrom) &&
        Objects.equals(this.glCode, depositInterestRule.glCode) &&
        Objects.equals(this.interestFrequencyValue, depositInterestRule.interestFrequencyValue) &&
        Objects.equals(this.interestFrequencyUnit, depositInterestRule.interestFrequencyUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestType, interestRate, startInterestFrom, glCode, interestFrequencyValue, interestFrequencyUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositInterestRule {\n");
    
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    startInterestFrom: ").append(toIndentedString(startInterestFrom)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    interestFrequencyValue: ").append(toIndentedString(interestFrequencyValue)).append("\n");
    sb.append("    interestFrequencyUnit: ").append(toIndentedString(interestFrequencyUnit)).append("\n");
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
