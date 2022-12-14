package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A purchased bundle.
 */
@Schema(description = "A purchased bundle.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PurchasedBundle   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("bundleID")
  private String bundleID = null;

  @JsonProperty("bundleName")
  private String bundleName = null;

  @JsonProperty("bundleType")
  private Integer bundleType = null;

  @JsonProperty("packageId")
  private String packageId = null;

  public PurchasedBundle extension(Object extension) {
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

  public PurchasedBundle bundleID(String bundleID) {
    this.bundleID = bundleID;
    return this;
  }

  /**
   * The bundle's ID.
   * @return bundleID
   **/
  @Schema(description = "The bundle's ID.")
  
    public String getBundleID() {
    return bundleID;
  }

  public void setBundleID(String bundleID) {
    this.bundleID = bundleID;
  }

  public PurchasedBundle bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

  /**
   * The bundle's name.
   * @return bundleName
   **/
  @Schema(description = "The bundle's name.")
  
    public String getBundleName() {
    return bundleName;
  }

  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  public PurchasedBundle bundleType(Integer bundleType) {
    this.bundleType = bundleType;
    return this;
  }

  /**
   * The type of bundle. Can be one of the following: <ul><li><b>0</b>: Optional</li><li><b>1</b>: Required</li><li><b>2</b>: Add-on</li></ul>
   * @return bundleType
   **/
  @Schema(description = "The type of bundle. Can be one of the following: <ul><li><b>0</b>: Optional</li><li><b>1</b>: Required</li><li><b>2</b>: Add-on</li></ul>")
  
    public Integer getBundleType() {
    return bundleType;
  }

  public void setBundleType(Integer bundleType) {
    this.bundleType = bundleType;
  }

  public PurchasedBundle packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * The ID of the package that contains the bundle.
   * @return packageId
   **/
  @Schema(description = "The ID of the package that contains the bundle.")
  
    public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchasedBundle purchasedBundle = (PurchasedBundle) o;
    return Objects.equals(this.extension, purchasedBundle.extension) &&
        Objects.equals(this.bundleID, purchasedBundle.bundleID) &&
        Objects.equals(this.bundleName, purchasedBundle.bundleName) &&
        Objects.equals(this.bundleType, purchasedBundle.bundleType) &&
        Objects.equals(this.packageId, purchasedBundle.packageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, bundleID, bundleName, bundleType, packageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchasedBundle {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    bundleID: ").append(toIndentedString(bundleID)).append("\n");
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    bundleType: ").append(toIndentedString(bundleType)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
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
