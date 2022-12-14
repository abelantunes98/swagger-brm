package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A set of key-value pairs.
 */
@Schema(description = "A set of key-value pairs.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Keyvals   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("version")
  private String version = null;

  public Keyvals key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key name.
   * @return key
   **/
  @Schema(required = true, description = "The key name.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Keyvals value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value.
   * @return value
   **/
  @Schema(required = true, description = "The value.")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Keyvals desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * The key-value pair's description.
   * @return desc
   **/
  @Schema(required = true, description = "The key-value pair's description.")
      @NotNull

    public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Keyvals version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the key-value pair.
   * @return version
   **/
  @Schema(description = "The version of the key-value pair.")
  
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
    Keyvals keyvals = (Keyvals) o;
    return Objects.equals(this.key, keyvals.key) &&
        Objects.equals(this.value, keyvals.value) &&
        Objects.equals(this.desc, keyvals.desc) &&
        Objects.equals(this.version, keyvals.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, desc, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keyvals {\n");
    
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
