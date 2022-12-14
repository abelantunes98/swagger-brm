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
 * NotificationDeliverySchedule
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class NotificationDeliverySchedule   {
  /**
   * The notification delivery schedule offset.
   */
  public enum OffsetUnitEnum {
    SECOND("SECOND"),
    
    MINUTE("MINUTE"),
    
    HOUR("HOUR"),
    
    DAY("DAY"),
    
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    YEAR("YEAR");

    private String value;

    OffsetUnitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OffsetUnitEnum fromValue(String text) {
      for (OffsetUnitEnum b : OffsetUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("offsetUnit")
  private OffsetUnitEnum offsetUnit = null;

  @JsonProperty("offsetValue")
  private String offsetValue = null;

  public NotificationDeliverySchedule offsetUnit(OffsetUnitEnum offsetUnit) {
    this.offsetUnit = offsetUnit;
    return this;
  }

  /**
   * The notification delivery schedule offset.
   * @return offsetUnit
   **/
  @Schema(required = true, description = "The notification delivery schedule offset.")
      @NotNull

    public OffsetUnitEnum getOffsetUnit() {
    return offsetUnit;
  }

  public void setOffsetUnit(OffsetUnitEnum offsetUnit) {
    this.offsetUnit = offsetUnit;
  }

  public NotificationDeliverySchedule offsetValue(String offsetValue) {
    this.offsetValue = offsetValue;
    return this;
  }

  /**
   * The notification delivery schedule offset value.
   * @return offsetValue
   **/
  @Schema(required = true, description = "The notification delivery schedule offset value.")
      @NotNull

    public String getOffsetValue() {
    return offsetValue;
  }

  public void setOffsetValue(String offsetValue) {
    this.offsetValue = offsetValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDeliverySchedule notificationDeliverySchedule = (NotificationDeliverySchedule) o;
    return Objects.equals(this.offsetUnit, notificationDeliverySchedule.offsetUnit) &&
        Objects.equals(this.offsetValue, notificationDeliverySchedule.offsetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offsetUnit, offsetValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDeliverySchedule {\n");
    
    sb.append("    offsetUnit: ").append(toIndentedString(offsetUnit)).append("\n");
    sb.append("    offsetValue: ").append(toIndentedString(offsetValue)).append("\n");
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
