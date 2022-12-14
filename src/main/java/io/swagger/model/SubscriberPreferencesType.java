package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Values;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriberPreferencesType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SubscriberPreferencesType   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("subscriberPreferenceId")
  private Integer subscriberPreferenceId = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("stringId")
  private Integer stringId = null;

  @JsonProperty("stringVersion")
  private Integer stringVersion = null;

  @JsonProperty("values")
  @Valid
  private List<Values> values = null;

  @JsonProperty("default")
  private String _default = null;

  public SubscriberPreferencesType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriberPreferencesType subscriberPreferenceId(Integer subscriberPreferenceId) {
    this.subscriberPreferenceId = subscriberPreferenceId;
    return this;
  }

  /**
   * Get subscriberPreferenceId
   * @return subscriberPreferenceId
   **/
  @Schema(description = "")
  
    public Integer getSubscriberPreferenceId() {
    return subscriberPreferenceId;
  }

  public void setSubscriberPreferenceId(Integer subscriberPreferenceId) {
    this.subscriberPreferenceId = subscriberPreferenceId;
  }

  public SubscriberPreferencesType type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public SubscriberPreferencesType stringId(Integer stringId) {
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

  public SubscriberPreferencesType stringVersion(Integer stringVersion) {
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

  public SubscriberPreferencesType values(List<Values> values) {
    this.values = values;
    return this;
  }

  public SubscriberPreferencesType addValuesItem(Values valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<Values>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @Schema(description = "")
      @Valid
    public List<Values> getValues() {
    return values;
  }

  public void setValues(List<Values> values) {
    this.values = values;
  }

  public SubscriberPreferencesType _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   **/
  @Schema(description = "")
  
    public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriberPreferencesType subscriberPreferencesType = (SubscriberPreferencesType) o;
    return Objects.equals(this.name, subscriberPreferencesType.name) &&
        Objects.equals(this.subscriberPreferenceId, subscriberPreferencesType.subscriberPreferenceId) &&
        Objects.equals(this.type, subscriberPreferencesType.type) &&
        Objects.equals(this.stringId, subscriberPreferencesType.stringId) &&
        Objects.equals(this.stringVersion, subscriberPreferencesType.stringVersion) &&
        Objects.equals(this.values, subscriberPreferencesType.values) &&
        Objects.equals(this._default, subscriberPreferencesType._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subscriberPreferenceId, type, stringId, stringVersion, values, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriberPreferencesType {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriberPreferenceId: ").append(toIndentedString(subscriberPreferenceId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    stringId: ").append(toIndentedString(stringId)).append("\n");
    sb.append("    stringVersion: ").append(toIndentedString(stringVersion)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
