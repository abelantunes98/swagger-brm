package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.RelativeSettings;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the start of a purchase, cycle, or usage period.
 */
@Schema(description = "Details about the start of a purchase, cycle, or usage period.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class StartingType   {
  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("unitSettings")
  private RelativeSettings unitSettings = null;

  public StartingType mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The starting type mode. Can be one of the following:<ul><li><b>immediately</b>: The start date is set to today. This mode can be used with the <b>purchaseStart</b>, <b>cycleStart</b>, and <b>usageStart</b> parameters.</li><li><b>absolute</b>: The start date is a calendar date. This mode can be used with the <b>purchaseStart</b>, <b>cycleStart</b>, and <b>usageStart</b> parameters.</li><li><b>relativeToPurchase</b>: The start date is relative to the purchase date, such as a specified number of billing cycles, months, days, hours, minutes, or seconds after activation. This mode can be used with the <b>cycleStart</b> and <b>usageStart</b> parameters.</li><li><b>firstUsage</b>: The start day is the day of the first recorded usage.</li></ul>
   * @return mode
   **/
  @Schema(required = true, description = "The starting type mode. Can be one of the following:<ul><li><b>immediately</b>: The start date is set to today. This mode can be used with the <b>purchaseStart</b>, <b>cycleStart</b>, and <b>usageStart</b> parameters.</li><li><b>absolute</b>: The start date is a calendar date. This mode can be used with the <b>purchaseStart</b>, <b>cycleStart</b>, and <b>usageStart</b> parameters.</li><li><b>relativeToPurchase</b>: The start date is relative to the purchase date, such as a specified number of billing cycles, months, days, hours, minutes, or seconds after activation. This mode can be used with the <b>cycleStart</b> and <b>usageStart</b> parameters.</li><li><b>firstUsage</b>: The start day is the day of the first recorded usage.</li></ul>")
      @NotNull

    public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public StartingType startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date and time the cycle starts.
   * @return startDate
   **/
  @Schema(description = "The date and time the cycle starts.")
  
    @Valid
    public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public StartingType unitSettings(RelativeSettings unitSettings) {
    this.unitSettings = unitSettings;
    return this;
  }

  /**
   * Get unitSettings
   * @return unitSettings
   **/
  @Schema(description = "")
  
    @Valid
    public RelativeSettings getUnitSettings() {
    return unitSettings;
  }

  public void setUnitSettings(RelativeSettings unitSettings) {
    this.unitSettings = unitSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartingType startingType = (StartingType) o;
    return Objects.equals(this.mode, startingType.mode) &&
        Objects.equals(this.startDate, startingType.startDate) &&
        Objects.equals(this.unitSettings, startingType.unitSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, startDate, unitSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartingType {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    unitSettings: ").append(toIndentedString(unitSettings)).append("\n");
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
