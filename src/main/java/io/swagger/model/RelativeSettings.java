package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The settings for the unit.
 */
@Schema(description = "The settings for the unit.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class RelativeSettings   {
  @JsonProperty("offset")
  private Integer offset = null;

  @JsonProperty("units")
  private String units = null;

  public RelativeSettings offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The number of days, hours, minutes or so on after the cycle starts or ends.
   * @return offset
   **/
  @Schema(description = "The number of days, hours, minutes or so on after the cycle starts or ends.")
  
    public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public RelativeSettings units(String units) {
    this.units = units;
    return this;
  }

  /**
   * The offset unit. Can be one of the following: <ul><li>seconds</li><li>minutes</li><li>hours</li><li>days</li><li>months</li><li>cycles</li></ul>
   * @return units
   **/
  @Schema(required = true, description = "The offset unit. Can be one of the following: <ul><li>seconds</li><li>minutes</li><li>hours</li><li>days</li><li>months</li><li>cycles</li></ul>")
      @NotNull

    public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeSettings relativeSettings = (RelativeSettings) o;
    return Objects.equals(this.offset, relativeSettings.offset) &&
        Objects.equals(this.units, relativeSettings.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeSettings {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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
