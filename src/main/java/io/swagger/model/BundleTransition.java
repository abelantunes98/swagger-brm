package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about the bundles to transition the account from and to.
 */
@Schema(description = "Details about the bundles to transition the account from and to.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BundleTransition   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("toBundle")
  private String toBundle = null;

  @JsonProperty("fromBundle")
  private String fromBundle = null;

  @JsonProperty("transitionType")
  private Integer transitionType = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public BundleTransition extension(Object extension) {
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

  public BundleTransition toBundle(String toBundle) {
    this.toBundle = toBundle;
    return this;
  }

  /**
   * The new bundle that the customer is transitioning to.
   * @return toBundle
   **/
  @Schema(required = true, description = "The new bundle that the customer is transitioning to.")
      @NotNull

    public String getToBundle() {
    return toBundle;
  }

  public void setToBundle(String toBundle) {
    this.toBundle = toBundle;
  }

  public BundleTransition fromBundle(String fromBundle) {
    this.fromBundle = fromBundle;
    return this;
  }

  /**
   * The old bundle that the customer is transitioning from.
   * @return fromBundle
   **/
  @Schema(required = true, description = "The old bundle that the customer is transitioning from.")
      @NotNull

    public String getFromBundle() {
    return fromBundle;
  }

  public void setFromBundle(String fromBundle) {
    this.fromBundle = fromBundle;
  }

  public BundleTransition transitionType(Integer transitionType) {
    this.transitionType = transitionType;
    return this;
  }

  /**
   * The transition type, such as an upgrade or downgrade. Use the keys returned by the Get Transition Types endpoint.
   * @return transitionType
   **/
  @Schema(description = "The transition type, such as an upgrade or downgrade. Use the keys returned by the Get Transition Types endpoint.")
  
    public Integer getTransitionType() {
    return transitionType;
  }

  public void setTransitionType(Integer transitionType) {
    this.transitionType = transitionType;
  }

  public BundleTransition notes(Notes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    @Valid
    public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleTransition bundleTransition = (BundleTransition) o;
    return Objects.equals(this.extension, bundleTransition.extension) &&
        Objects.equals(this.toBundle, bundleTransition.toBundle) &&
        Objects.equals(this.fromBundle, bundleTransition.fromBundle) &&
        Objects.equals(this.transitionType, bundleTransition.transitionType) &&
        Objects.equals(this.notes, bundleTransition.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, toBundle, fromBundle, transitionType, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleTransition {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    toBundle: ").append(toIndentedString(toBundle)).append("\n");
    sb.append("    fromBundle: ").append(toIndentedString(fromBundle)).append("\n");
    sb.append("    transitionType: ").append(toIndentedString(transitionType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
