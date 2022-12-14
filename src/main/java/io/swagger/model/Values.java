package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Values
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Values   {
  @JsonProperty("stringId")
  private Integer stringId = null;

  @JsonProperty("stringVersion")
  private Integer stringVersion = null;

  @JsonProperty("value")
  private String value = null;

  public Values stringId(Integer stringId) {
    this.stringId = stringId;
    return this;
  }

  /**
   * Get stringId
   * @return stringId
   **/
  @Schema(description = "")
  
    public Integer getStringId() {
    return stringId;
  }

  public void setStringId(Integer stringId) {
    this.stringId = stringId;
  }

  public Values stringVersion(Integer stringVersion) {
    this.stringVersion = stringVersion;
    return this;
  }

  /**
   * Get stringVersion
   * @return stringVersion
   **/
  @Schema(description = "")
  
    public Integer getStringVersion() {
    return stringVersion;
  }

  public void setStringVersion(Integer stringVersion) {
    this.stringVersion = stringVersion;
  }

  public Values value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Values values = (Values) o;
    return Objects.equals(this.stringId, values.stringId) &&
        Objects.equals(this.stringVersion, values.stringVersion) &&
        Objects.equals(this.value, values.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringId, stringVersion, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Values {\n");
    
    sb.append("    stringId: ").append(toIndentedString(stringId)).append("\n");
    sb.append("    stringVersion: ").append(toIndentedString(stringVersion)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
