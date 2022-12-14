package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ModelPackage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A package list.
 */
@Schema(description = "A package list.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PackageList   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("package")
  @Valid
  private List<ModelPackage> _package = null;

  public PackageList extension(Object extension) {
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

  public PackageList _package(List<ModelPackage> _package) {
    this._package = _package;
    return this;
  }

  public PackageList addPackageItem(ModelPackage _packageItem) {
    if (this._package == null) {
      this._package = new ArrayList<ModelPackage>();
    }
    this._package.add(_packageItem);
    return this;
  }

  /**
   * The list of packages.
   * @return _package
   **/
  @Schema(description = "The list of packages.")
      @Valid
    public List<ModelPackage> getPackage() {
    return _package;
  }

  public void setPackage(List<ModelPackage> _package) {
    this._package = _package;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageList packageList = (PackageList) o;
    return Objects.equals(this.extension, packageList.extension) &&
        Objects.equals(this._package, packageList._package);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, _package);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageList {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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
