package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The deposit validity rule.
 */
@Schema(description = "The deposit validity rule.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositValidityRule   {
  @JsonProperty("id")
  private Long id = null;

  /**
   * The offset period start unit.
   */
  public enum StartOffsetPeriodUnitEnum {
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    StartOffsetPeriodUnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StartOffsetPeriodUnitEnum fromValue(String text) {
      for (StartOffsetPeriodUnitEnum b : StartOffsetPeriodUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("startOffsetPeriodUnit")
  private StartOffsetPeriodUnitEnum startOffsetPeriodUnit = null;

  @JsonProperty("startOffsetPeriodValue")
  private Integer startOffsetPeriodValue = null;

  /**
   * The offset period end unit.
   */
  public enum EndOffsetPeriodUnitEnum {
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    EndOffsetPeriodUnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EndOffsetPeriodUnitEnum fromValue(String text) {
      for (EndOffsetPeriodUnitEnum b : EndOffsetPeriodUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("endOffsetPeriodUnit")
  private EndOffsetPeriodUnitEnum endOffsetPeriodUnit = null;

  @JsonProperty("endOffsetPeriodValue")
  private Integer endOffsetPeriodValue = null;

  public DepositValidityRule id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit ID.
   * @return id
   **/
  @Schema(description = "The deposit ID.")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DepositValidityRule startOffsetPeriodUnit(StartOffsetPeriodUnitEnum startOffsetPeriodUnit) {
    this.startOffsetPeriodUnit = startOffsetPeriodUnit;
    return this;
  }

  /**
   * The offset period start unit.
   * @return startOffsetPeriodUnit
   **/
  @Schema(description = "The offset period start unit.")
  
    public StartOffsetPeriodUnitEnum getStartOffsetPeriodUnit() {
    return startOffsetPeriodUnit;
  }

  public void setStartOffsetPeriodUnit(StartOffsetPeriodUnitEnum startOffsetPeriodUnit) {
    this.startOffsetPeriodUnit = startOffsetPeriodUnit;
  }

  public DepositValidityRule startOffsetPeriodValue(Integer startOffsetPeriodValue) {
    this.startOffsetPeriodValue = startOffsetPeriodValue;
    return this;
  }

  /**
   * The offset period start value.
   * @return startOffsetPeriodValue
   **/
  @Schema(description = "The offset period start value.")
  
    public Integer getStartOffsetPeriodValue() {
    return startOffsetPeriodValue;
  }

  public void setStartOffsetPeriodValue(Integer startOffsetPeriodValue) {
    this.startOffsetPeriodValue = startOffsetPeriodValue;
  }

  public DepositValidityRule endOffsetPeriodUnit(EndOffsetPeriodUnitEnum endOffsetPeriodUnit) {
    this.endOffsetPeriodUnit = endOffsetPeriodUnit;
    return this;
  }

  /**
   * The offset period end unit.
   * @return endOffsetPeriodUnit
   **/
  @Schema(required = true, description = "The offset period end unit.")
      @NotNull

    public EndOffsetPeriodUnitEnum getEndOffsetPeriodUnit() {
    return endOffsetPeriodUnit;
  }

  public void setEndOffsetPeriodUnit(EndOffsetPeriodUnitEnum endOffsetPeriodUnit) {
    this.endOffsetPeriodUnit = endOffsetPeriodUnit;
  }

  public DepositValidityRule endOffsetPeriodValue(Integer endOffsetPeriodValue) {
    this.endOffsetPeriodValue = endOffsetPeriodValue;
    return this;
  }

  /**
   * Get endOffsetPeriodValue
   * @return endOffsetPeriodValue
   **/
  @Schema(required = true, description = "")
      @NotNull

    public Integer getEndOffsetPeriodValue() {
    return endOffsetPeriodValue;
  }

  public void setEndOffsetPeriodValue(Integer endOffsetPeriodValue) {
    this.endOffsetPeriodValue = endOffsetPeriodValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositValidityRule depositValidityRule = (DepositValidityRule) o;
    return Objects.equals(this.id, depositValidityRule.id) &&
        Objects.equals(this.startOffsetPeriodUnit, depositValidityRule.startOffsetPeriodUnit) &&
        Objects.equals(this.startOffsetPeriodValue, depositValidityRule.startOffsetPeriodValue) &&
        Objects.equals(this.endOffsetPeriodUnit, depositValidityRule.endOffsetPeriodUnit) &&
        Objects.equals(this.endOffsetPeriodValue, depositValidityRule.endOffsetPeriodValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startOffsetPeriodUnit, startOffsetPeriodValue, endOffsetPeriodUnit, endOffsetPeriodValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositValidityRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startOffsetPeriodUnit: ").append(toIndentedString(startOffsetPeriodUnit)).append("\n");
    sb.append("    startOffsetPeriodValue: ").append(toIndentedString(startOffsetPeriodValue)).append("\n");
    sb.append("    endOffsetPeriodUnit: ").append(toIndentedString(endOffsetPeriodUnit)).append("\n");
    sb.append("    endOffsetPeriodValue: ").append(toIndentedString(endOffsetPeriodValue)).append("\n");
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
