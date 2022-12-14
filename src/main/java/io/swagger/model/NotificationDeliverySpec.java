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
 * The notification delivery schedule specification.
 */
@Schema(description = "The notification delivery schedule specification.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class NotificationDeliverySpec   {
  /**
   * The notification delivery preference.
   */
  public enum DeliveryPreferenceEnum {
    IMMEDIATE("IMMEDIATE"),
    
    FIXEDTIME("FIXEDTIME"),
    
    DOM("DOM"),
    
    DOW("DOW");

    private String value;

    DeliveryPreferenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliveryPreferenceEnum fromValue(String text) {
      for (DeliveryPreferenceEnum b : DeliveryPreferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("deliveryPreference")
  private DeliveryPreferenceEnum deliveryPreference = null;

  @JsonProperty("deliveryPeriodStart")
  private String deliveryPeriodStart = null;

  @JsonProperty("deliveryPeriodEnd")
  private String deliveryPeriodEnd = null;

  @JsonProperty("silentPeriodStart")
  private String silentPeriodStart = null;

  @JsonProperty("silentPeriodEnd")
  private String silentPeriodEnd = null;

  @JsonProperty("dayOfMonth")
  private Integer dayOfMonth = null;

  @JsonProperty("dayOfWeek")
  private Integer dayOfWeek = null;

  public NotificationDeliverySpec deliveryPreference(DeliveryPreferenceEnum deliveryPreference) {
    this.deliveryPreference = deliveryPreference;
    return this;
  }

  /**
   * The notification delivery preference.
   * @return deliveryPreference
   **/
  @Schema(required = true, description = "The notification delivery preference.")
      @NotNull

    public DeliveryPreferenceEnum getDeliveryPreference() {
    return deliveryPreference;
  }

  public void setDeliveryPreference(DeliveryPreferenceEnum deliveryPreference) {
    this.deliveryPreference = deliveryPreference;
  }

  public NotificationDeliverySpec deliveryPeriodStart(String deliveryPeriodStart) {
    this.deliveryPeriodStart = deliveryPeriodStart;
    return this;
  }

  /**
   * The notification delivery start time.
   * @return deliveryPeriodStart
   **/
  @Schema(required = true, description = "The notification delivery start time.")
      @NotNull

  @Pattern(regexp="^([0-1]?\\d|2[0-3])(?::([0-5]?\\d))?(?::([0-5]?\\d))?$")   public String getDeliveryPeriodStart() {
    return deliveryPeriodStart;
  }

  public void setDeliveryPeriodStart(String deliveryPeriodStart) {
    this.deliveryPeriodStart = deliveryPeriodStart;
  }

  public NotificationDeliverySpec deliveryPeriodEnd(String deliveryPeriodEnd) {
    this.deliveryPeriodEnd = deliveryPeriodEnd;
    return this;
  }

  /**
   * The notification delivery end time.
   * @return deliveryPeriodEnd
   **/
  @Schema(required = true, description = "The notification delivery end time.")
      @NotNull

  @Pattern(regexp="^([0-1]?\\d|2[0-3])(?::([0-5]?\\d))?(?::([0-5]?\\d))?$")   public String getDeliveryPeriodEnd() {
    return deliveryPeriodEnd;
  }

  public void setDeliveryPeriodEnd(String deliveryPeriodEnd) {
    this.deliveryPeriodEnd = deliveryPeriodEnd;
  }

  public NotificationDeliverySpec silentPeriodStart(String silentPeriodStart) {
    this.silentPeriodStart = silentPeriodStart;
    return this;
  }

  /**
   * The notification silent start time.
   * @return silentPeriodStart
   **/
  @Schema(required = true, description = "The notification silent start time.")
      @NotNull

  @Pattern(regexp="^([0-1]?\\d|2[0-3])(?::([0-5]?\\d))?(?::([0-5]?\\d))?$")   public String getSilentPeriodStart() {
    return silentPeriodStart;
  }

  public void setSilentPeriodStart(String silentPeriodStart) {
    this.silentPeriodStart = silentPeriodStart;
  }

  public NotificationDeliverySpec silentPeriodEnd(String silentPeriodEnd) {
    this.silentPeriodEnd = silentPeriodEnd;
    return this;
  }

  /**
   * The notification silent end time.
   * @return silentPeriodEnd
   **/
  @Schema(required = true, description = "The notification silent end time.")
      @NotNull

  @Pattern(regexp="^([0-1]?\\d|2[0-3])(?::([0-5]?\\d))?(?::([0-5]?\\d))?$")   public String getSilentPeriodEnd() {
    return silentPeriodEnd;
  }

  public void setSilentPeriodEnd(String silentPeriodEnd) {
    this.silentPeriodEnd = silentPeriodEnd;
  }

  public NotificationDeliverySpec dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  /**
   * The day of the month.
   * minimum: 1
   * maximum: 31
   * @return dayOfMonth
   **/
  @Schema(description = "The day of the month.")
  
  @Min(1) @Max(31)   public Integer getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public NotificationDeliverySpec dayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * The day of the week.
   * minimum: 1
   * maximum: 6
   * @return dayOfWeek
   **/
  @Schema(description = "The day of the week.")
  
  @Min(1) @Max(6)   public Integer getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDeliverySpec notificationDeliverySpec = (NotificationDeliverySpec) o;
    return Objects.equals(this.deliveryPreference, notificationDeliverySpec.deliveryPreference) &&
        Objects.equals(this.deliveryPeriodStart, notificationDeliverySpec.deliveryPeriodStart) &&
        Objects.equals(this.deliveryPeriodEnd, notificationDeliverySpec.deliveryPeriodEnd) &&
        Objects.equals(this.silentPeriodStart, notificationDeliverySpec.silentPeriodStart) &&
        Objects.equals(this.silentPeriodEnd, notificationDeliverySpec.silentPeriodEnd) &&
        Objects.equals(this.dayOfMonth, notificationDeliverySpec.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, notificationDeliverySpec.dayOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryPreference, deliveryPeriodStart, deliveryPeriodEnd, silentPeriodStart, silentPeriodEnd, dayOfMonth, dayOfWeek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDeliverySpec {\n");
    
    sb.append("    deliveryPreference: ").append(toIndentedString(deliveryPreference)).append("\n");
    sb.append("    deliveryPeriodStart: ").append(toIndentedString(deliveryPeriodStart)).append("\n");
    sb.append("    deliveryPeriodEnd: ").append(toIndentedString(deliveryPeriodEnd)).append("\n");
    sb.append("    silentPeriodStart: ").append(toIndentedString(silentPeriodStart)).append("\n");
    sb.append("    silentPeriodEnd: ").append(toIndentedString(silentPeriodEnd)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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
