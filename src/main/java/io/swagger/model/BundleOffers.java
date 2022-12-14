package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BundleOffer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BundleOffers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BundleOffers   {
  @JsonProperty("bundleOffer")
  @Valid
  private List<BundleOffer> bundleOffer = null;

  public BundleOffers bundleOffer(List<BundleOffer> bundleOffer) {
    this.bundleOffer = bundleOffer;
    return this;
  }

  public BundleOffers addBundleOfferItem(BundleOffer bundleOfferItem) {
    if (this.bundleOffer == null) {
      this.bundleOffer = new ArrayList<BundleOffer>();
    }
    this.bundleOffer.add(bundleOfferItem);
    return this;
  }

  /**
   * A list of bundles.
   * @return bundleOffer
   **/
  @Schema(description = "A list of bundles.")
      @Valid
    public List<BundleOffer> getBundleOffer() {
    return bundleOffer;
  }

  public void setBundleOffer(List<BundleOffer> bundleOffer) {
    this.bundleOffer = bundleOffer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleOffers bundleOffers = (BundleOffers) o;
    return Objects.equals(this.bundleOffer, bundleOffers.bundleOffer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleOffer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleOffers {\n");
    
    sb.append("    bundleOffer: ").append(toIndentedString(bundleOffer)).append("\n");
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
