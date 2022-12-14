package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SubscriberPreferencesType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConfigSubscriberPreferencesType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ConfigSubscriberPreferencesType   {
  @JsonProperty("subscriberPreferencesType")
  private SubscriberPreferencesType subscriberPreferencesType = null;

  public ConfigSubscriberPreferencesType subscriberPreferencesType(SubscriberPreferencesType subscriberPreferencesType) {
    this.subscriberPreferencesType = subscriberPreferencesType;
    return this;
  }

  /**
   * Get subscriberPreferencesType
   * @return subscriberPreferencesType
   **/
  @Schema(description = "")
  
    @Valid
    public SubscriberPreferencesType getSubscriberPreferencesType() {
    return subscriberPreferencesType;
  }

  public void setSubscriberPreferencesType(SubscriberPreferencesType subscriberPreferencesType) {
    this.subscriberPreferencesType = subscriberPreferencesType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigSubscriberPreferencesType configSubscriberPreferencesType = (ConfigSubscriberPreferencesType) o;
    return Objects.equals(this.subscriberPreferencesType, configSubscriberPreferencesType.subscriberPreferencesType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriberPreferencesType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigSubscriberPreferencesType {\n");
    
    sb.append("    subscriberPreferencesType: ").append(toIndentedString(subscriberPreferencesType)).append("\n");
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
