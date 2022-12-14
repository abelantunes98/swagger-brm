package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Flags;
import io.swagger.model.Keyvals;
import io.swagger.model.Mapping;
import io.swagger.model.Thresholds;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Configurations
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Configurations   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("keyvals")
  @Valid
  private List<Keyvals> keyvals = new ArrayList<Keyvals>();

  @JsonProperty("flags")
  @Valid
  private List<Flags> flags = new ArrayList<Flags>();

  @JsonProperty("thresholds")
  @Valid
  private List<Thresholds> thresholds = new ArrayList<Thresholds>();

  @JsonProperty("mapping")
  @Valid
  private List<Mapping> mapping = new ArrayList<Mapping>();

  public Configurations extension(Object extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extended attributes.
   * @return extension
   **/
  @Schema(description = "The extended attributes.")
  
    public Object getExtension() {
    return extension;
  }

  public void setExtension(Object extension) {
    this.extension = extension;
  }

  public Configurations keyvals(List<Keyvals> keyvals) {
    this.keyvals = keyvals;
    return this;
  }

  public Configurations addKeyvalsItem(Keyvals keyvalsItem) {
    this.keyvals.add(keyvalsItem);
    return this;
  }

  /**
   * A set of key-value pairs.
   * @return keyvals
   **/
  @Schema(required = true, description = "A set of key-value pairs.")
      @NotNull
    @Valid
    public List<Keyvals> getKeyvals() {
    return keyvals;
  }

  public void setKeyvals(List<Keyvals> keyvals) {
    this.keyvals = keyvals;
  }

  public Configurations flags(List<Flags> flags) {
    this.flags = flags;
    return this;
  }

  public Configurations addFlagsItem(Flags flagsItem) {
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * A flag.
   * @return flags
   **/
  @Schema(required = true, description = "A flag.")
      @NotNull
    @Valid
    public List<Flags> getFlags() {
    return flags;
  }

  public void setFlags(List<Flags> flags) {
    this.flags = flags;
  }

  public Configurations thresholds(List<Thresholds> thresholds) {
    this.thresholds = thresholds;
    return this;
  }

  public Configurations addThresholdsItem(Thresholds thresholdsItem) {
    this.thresholds.add(thresholdsItem);
    return this;
  }

  /**
   * A threshold. The minimum required parameters are&colon; <b>key</b> and <b>value</b>.
   * @return thresholds
   **/
  @Schema(required = true, description = "A threshold. The minimum required parameters are&colon; <b>key</b> and <b>value</b>.")
      @NotNull
    @Valid
    public List<Thresholds> getThresholds() {
    return thresholds;
  }

  public void setThresholds(List<Thresholds> thresholds) {
    this.thresholds = thresholds;
  }

  public Configurations mapping(List<Mapping> mapping) {
    this.mapping = mapping;
    return this;
  }

  public Configurations addMappingItem(Mapping mappingItem) {
    this.mapping.add(mappingItem);
    return this;
  }

  /**
   * A mapping.
   * @return mapping
   **/
  @Schema(required = true, description = "A mapping.")
      @NotNull
    @Valid
    public List<Mapping> getMapping() {
    return mapping;
  }

  public void setMapping(List<Mapping> mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Configurations configurations = (Configurations) o;
    return Objects.equals(this.extension, configurations.extension) &&
        Objects.equals(this.keyvals, configurations.keyvals) &&
        Objects.equals(this.flags, configurations.flags) &&
        Objects.equals(this.thresholds, configurations.thresholds) &&
        Objects.equals(this.mapping, configurations.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, keyvals, flags, thresholds, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Configurations {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    keyvals: ").append(toIndentedString(keyvals)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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
