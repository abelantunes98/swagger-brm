package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A mapping.
 */
@Schema(description = "A mapping.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Mapping   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("map")
  @Valid
  private List<Map> map = new ArrayList<Map>();

  @JsonProperty("desc")
  private String desc = null;

  @JsonProperty("version")
  private String version = null;

  public Mapping key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The mapping's key.
   * @return key
   **/
  @Schema(required = true, description = "The mapping's key.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Mapping map(List<Map> map) {
    this.map = map;
    return this;
  }

  public Mapping addMapItem(Map mapItem) {
    this.map.add(mapItem);
    return this;
  }

  /**
   * A list of maps.
   * @return map
   **/
  @Schema(required = true, description = "A list of maps.")
      @NotNull
    @Valid
    public List<Map> getMap() {
    return map;
  }

  public void setMap(List<Map> map) {
    this.map = map;
  }

  public Mapping desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * The mapping's description.
   * @return desc
   **/
  @Schema(required = true, description = "The mapping's description.")
      @NotNull

    public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public Mapping version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the mapping.
   * @return version
   **/
  @Schema(description = "The version of the mapping.")
  
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
    Mapping mapping = (Mapping) o;
    return Objects.equals(this.key, mapping.key) &&
        Objects.equals(this.map, mapping.map) &&
        Objects.equals(this.desc, mapping.desc) &&
        Objects.equals(this.version, mapping.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, map, desc, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mapping {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
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
