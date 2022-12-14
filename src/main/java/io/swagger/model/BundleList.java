package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Bundle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BundleList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BundleList   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("bundle")
  @Valid
  private List<Bundle> bundle = new ArrayList<Bundle>();

  public BundleList extension(Object extension) {
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

  public BundleList bundle(List<Bundle> bundle) {
    this.bundle = bundle;
    return this;
  }

  public BundleList addBundleItem(Bundle bundleItem) {
    this.bundle.add(bundleItem);
    return this;
  }

  /**
   * A bundle.
   * @return bundle
   **/
  @Schema(required = true, description = "A bundle.")
      @NotNull
    @Valid
    public List<Bundle> getBundle() {
    return bundle;
  }

  public void setBundle(List<Bundle> bundle) {
    this.bundle = bundle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleList bundleList = (BundleList) o;
    return Objects.equals(this.extension, bundleList.extension) &&
        Objects.equals(this.bundle, bundleList.bundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, bundle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleList {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
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
