package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A flag.
 */
@Schema(description = "A flag.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Flags   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private Boolean value = null;

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("version")
  private String version = null;

  public Flags key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The name of the flag.
   * @return key
   **/
  @Schema(required = true, description = "The name of the flag.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Flags value(Boolean value) {
    this.value = value;
    return this;
  }

  /**
   * The value associated with the flag, which can be <b>true</b> or <b>false</b>.
   * @return value
   **/
  @Schema(description = "The value associated with the flag, which can be <b>true</b> or <b>false</b>.")
  
    public Boolean isValue() {
    return value;
  }

  public void setValue(Boolean value) {
    this.value = value;
  }

  public Flags desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * A description of the flag.
   * @return desc
   **/
  @Schema(required = true, description = "A description of the flag.")
      @NotNull

    public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Flags version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the flag.
   * @return version
   **/
  @Schema(description = "The version of the flag.")
  
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
    Flags flags = (Flags) o;
    return Objects.equals(this.key, flags.key) &&
        Objects.equals(this.value, flags.value) &&
        Objects.equals(this.desc, flags.desc) &&
        Objects.equals(this.version, flags.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, desc, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flags {\n");
    
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
