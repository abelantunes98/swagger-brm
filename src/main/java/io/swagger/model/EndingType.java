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
 * Details about the end of a purchase, cycle, or usage period.
 */
@Schema(description = "Details about the end of a purchase, cycle, or usage period.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class EndingType   {
  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("unitSettings")
  private RelativeSettings unitSettings = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  public EndingType mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The ending type mode. Can be one of the following: <ul><li><b>absolute</b>: The end date is a calendar day.</li><li><b>relativeToStart</b>: The end date is relative to the start date, such as a specified number of billing cycles, months, days, hours, minutes, or seconds after the start date.</li><li><b>never</b>: There is no set end date.</li></ul>
   * @return mode
   **/
  @Schema(required = true, description = "The ending type mode. Can be one of the following: <ul><li><b>absolute</b>: The end date is a calendar day.</li><li><b>relativeToStart</b>: The end date is relative to the start date, such as a specified number of billing cycles, months, days, hours, minutes, or seconds after the start date.</li><li><b>never</b>: There is no set end date.</li></ul>")
      @NotNull

    public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public EndingType unitSettings(RelativeSettings unitSettings) {
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

  public EndingType endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The date and time the cycle ends.
   * @return endDate
   **/
  @Schema(description = "The date and time the cycle ends.")
  
    @Valid
    public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndingType endingType = (EndingType) o;
    return Objects.equals(this.mode, endingType.mode) &&
        Objects.equals(this.unitSettings, endingType.unitSettings) &&
        Objects.equals(this.endDate, endingType.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, unitSettings, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndingType {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    unitSettings: ").append(toIndentedString(unitSettings)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
