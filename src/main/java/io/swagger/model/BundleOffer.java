package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ChargeOffers;
import io.swagger.model.DiscountOffers;
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

  @JsonProperty("ChargeOffers")
  @Valid
  private List<ChargeOffers> ChargeOffers = null;

  @JsonProperty("DiscountOffers")
  @Valid
  private List<DiscountOffers> DiscountOffers = null;

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

  public BundleOffer ChargeOffers(List<ChargeOffers> ChargeOffers) {
    this.ChargeOffers = ChargeOffers;
    return this;
  }

  public BundleOffer addChargeOffersItem(ChargeOffers ChargeOffersItem) {
    if (this.ChargeOffers == null) {
      this.ChargeOffers = new ArrayList<ChargeOffers>();
    }
    this.ChargeOffers.add(ChargeOffersItem);
    return this;
  }

  /**
   * A list of charge offers.
   * @return ChargeOffers
   **/
  @Schema(description = "A list of charge offers.")
      @Valid
    public List<ChargeOffers> getChargeOffers() {
    return ChargeOffers;
  }

  public void setChargeOffers(List<ChargeOffers> ChargeOffers) {
    this.ChargeOffers = ChargeOffers;
  }

  public BundleOffer DiscountOffers(List<DiscountOffers> DiscountOffers) {
    this.DiscountOffers = DiscountOffers;
    return this;
  }

  public BundleOffer addDiscountOffersItem(DiscountOffers DiscountOffersItem) {
    if (this.DiscountOffers == null) {
      this.DiscountOffers = new ArrayList<DiscountOffers>();
    }
    this.DiscountOffers.add(DiscountOffersItem);
    return this;
  }

  /**
   * A list of discount offers.
   * @return DiscountOffers
   **/
  @Schema(description = "A list of discount offers.")
      @Valid
    public List<DiscountOffers> getDiscountOffers() {
    return DiscountOffers;
  }

  public void setDiscountOffers(List<DiscountOffers> DiscountOffers) {
    this.DiscountOffers = DiscountOffers;
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
        Objects.equals(this.ChargeOffers, bundleOffer.ChargeOffers) &&
        Objects.equals(this.DiscountOffers, bundleOffer.DiscountOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, name, packageId, ChargeOffers, DiscountOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleOffer {\n");
    
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    ChargeOffers: ").append(toIndentedString(ChargeOffers)).append("\n");
    sb.append("    DiscountOffers: ").append(toIndentedString(DiscountOffers)).append("\n");
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
