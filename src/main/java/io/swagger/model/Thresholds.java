package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A threshold. The minimum required parameters are&amp;colon; &lt;b&gt;key&lt;/b&gt; and &lt;b&gt;value&lt;/b&gt;.
 */
@Schema(description = "A threshold. The minimum required parameters are&colon; <b>key</b> and <b>value</b>.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Thresholds   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("version")
  private String version = null;

  public Thresholds key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Unique name for configuration acting as an upper limit for pagination size, number of records to fetch, timeouts, etc.
   * @return key
   **/
  @Schema(required = true, description = "Unique name for configuration acting as an upper limit for pagination size, number of records to fetch, timeouts, etc.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Thresholds value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * The threshold value.
   * @return value
   **/
  @Schema(description = "The threshold value.")
  
    public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public Thresholds desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * The description of the threshold.
   * @return desc
   **/
  @Schema(required = true, description = "The description of the threshold.")
      @NotNull

    public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Thresholds version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the threshold.
   * @return version
   **/
  @Schema(description = "The version of the threshold.")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thresholds thresholds = (Thresholds) o;
    return Objects.equals(this.key, thresholds.key) &&
        Objects.equals(this.value, thresholds.value) &&
        Objects.equals(this.desc, thresholds.desc) &&
        Objects.equals(this.version, thresholds.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, desc, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thresholds {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
