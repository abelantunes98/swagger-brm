package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Chargeoffers;
import io.swagger.model.Discountoffers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bundle.
 */
@Schema(description = "A bundle.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BundleOffer   {
  @JsonProperty("bundleId")
  private String bundleId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("packageId")
  private String packageId = null;

  @JsonProperty("chargeoffers")
  @Valid
  private List<Chargeoffers> chargeoffers = null;

  @JsonProperty("discountoffers")
  @Valid
  private List<Discountoffers> discountoffers = null;

  public BundleOffer bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * The ID of the bundle.
   * @return bundleId
   **/
  @Schema(description = "The ID of the bundle.")
  
    public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public BundleOffer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the bundle.
   * @return name
   **/
  @Schema(description = "The name of the bundle.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundleOffer packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * The ID of the package.
   * @return packageId
   **/
  @Schema(description = "The ID of the package.")
  
    public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public BundleOffer chargeoffers(List<Chargeoffers> chargeoffers) {
    this.chargeoffers = chargeoffers;
    return this;
  }

  public BundleOffer addChargeoffersItem(Chargeoffers chargeoffersItem) {
    if (this.chargeoffers == null) {
      this.chargeoffers = new ArrayList<Chargeoffers>();
    }
    this.chargeoffers.add(chargeoffersItem);
    return this;
  }

  /**
   * A list of charge offers.
   * @return chargeoffers
   **/
  @Schema(description = "A list of charge offers.")
      @Valid
    public List<Chargeoffers> getChargeoffers() {
    return chargeoffers;
  }

  public void setChargeoffers(List<Chargeoffers> chargeoffers) {
    this.chargeoffers = chargeoffers;
  }

  public BundleOffer discountoffers(List<Discountoffers> discountoffers) {
    this.discountoffers = discountoffers;
    return this;
  }

  public BundleOffer addDiscountoffersItem(Discountoffers discountoffersItem) {
    if (this.discountoffers == null) {
      this.discountoffers = new ArrayList<Discountoffers>();
    }
    this.discountoffers.add(discountoffersItem);
    return this;
  }

  /**
   * A list of discount offers.
   * @return discountoffers
   **/
  @Schema(description = "A list of discount offers.")
      @Valid
    public List<Discountoffers> getDiscountoffers() {
    return discountoffers;
  }

  public void setDiscountoffers(List<Discountoffers> discountoffers) {
    this.discountoffers = discountoffers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleOffer bundleOffer = (BundleOffer) o;
    return Objects.equals(this.bundleId, bundleOffer.bundleId) &&
        Objects.equals(this.name, bundleOffer.name) &&
        Objects.equals(this.packageId, bundleOffer.packageId) &&
        Objects.equals(this.chargeoffers, bundleOffer.chargeoffers) &&
        Objects.equals(this.discountoffers, bundleOffer.discountoffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, name, packageId, chargeoffers, discountoffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleOffer {\n");
    
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    chargeoffers: ").append(toIndentedString(chargeoffers)).append("\n");
    sb.append("    discountoffers: ").append(toIndentedString(discountoffers)).append("\n");
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
