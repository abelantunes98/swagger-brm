package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The geographic location of a transfer&#x27;s source or target.
 */
@Schema(description = "The geographic location of a transfer's source or target.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class LocationDetails   {
  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("zoneMapTarget")
  private String zoneMapTarget = null;

  @JsonProperty("zoneMapName")
  private String zoneMapName = null;

  public LocationDetails locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * A locale.
   * @return locale
   **/
  @Schema(required = true, description = "A locale.")
      @NotNull

    public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public LocationDetails zoneMapTarget(String zoneMapTarget) {
    this.zoneMapTarget = zoneMapTarget;
    return this;
  }

  /**
   * The target zonemap.
   * @return zoneMapTarget
   **/
  @Schema(required = true, description = "The target zonemap.")
      @NotNull

    public String getZoneMapTarget() {
    return zoneMapTarget;
  }

  public void setZoneMapTarget(String zoneMapTarget) {
    this.zoneMapTarget = zoneMapTarget;
  }

  public LocationDetails zoneMapName(String zoneMapName) {
    this.zoneMapName = zoneMapName;
    return this;
  }

  /**
   * The zonemap's name.
   * @return zoneMapName
   **/
  @Schema(required = true, description = "The zonemap's name.")
      @NotNull

    public String getZoneMapName() {
    return zoneMapName;
  }

  public void setZoneMapName(String zoneMapName) {
    this.zoneMapName = zoneMapName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationDetails locationDetails = (LocationDetails) o;
    return Objects.equals(this.locale, locationDetails.locale) &&
        Objects.equals(this.zoneMapTarget, locationDetails.zoneMapTarget) &&
        Objects.equals(this.zoneMapName, locationDetails.zoneMapName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, zoneMapTarget, zoneMapName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDetails {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    zoneMapTarget: ").append(toIndentedString(zoneMapTarget)).append("\n");
    sb.append("    zoneMapName: ").append(toIndentedString(zoneMapName)).append("\n");
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
