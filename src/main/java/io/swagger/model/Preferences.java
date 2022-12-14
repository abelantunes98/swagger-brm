package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Preference;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Preferences
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Preferences   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("preference")
  @Valid
  private List<Preference> preference = null;

  public Preferences extension(Object extension) {
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

  public Preferences preference(List<Preference> preference) {
    this.preference = preference;
    return this;
  }

  public Preferences addPreferenceItem(Preference preferenceItem) {
    if (this.preference == null) {
      this.preference = new ArrayList<Preference>();
    }
    this.preference.add(preferenceItem);
    return this;
  }

  /**
   * The list of preferences.
   * @return preference
   **/
  @Schema(description = "The list of preferences.")
      @Valid
    public List<Preference> getPreference() {
    return preference;
  }

  public void setPreference(List<Preference> preference) {
    this.preference = preference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preferences preferences = (Preferences) o;
    return Objects.equals(this.extension, preferences.extension) &&
        Objects.equals(this.preference, preferences.preference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, preference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preferences {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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
