package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CustomizedOffer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomizedOffers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomizedOffers   {
  @JsonProperty("customizedOffer")
  @Valid
  private List<CustomizedOffer> customizedOffer = null;

  public CustomizedOffers customizedOffer(List<CustomizedOffer> customizedOffer) {
    this.customizedOffer = customizedOffer;
    return this;
  }

  public CustomizedOffers addCustomizedOfferItem(CustomizedOffer customizedOfferItem) {
    if (this.customizedOffer == null) {
      this.customizedOffer = new ArrayList<CustomizedOffer>();
    }
    this.customizedOffer.add(customizedOfferItem);
    return this;
  }

  /**
   * A list of customized offers.
   * @return customizedOffer
   **/
  @Schema(description = "A list of customized offers.")
      @Valid
    public List<CustomizedOffer> getCustomizedOffer() {
    return customizedOffer;
  }

  public void setCustomizedOffer(List<CustomizedOffer> customizedOffer) {
    this.customizedOffer = customizedOffer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomizedOffers customizedOffers = (CustomizedOffers) o;
    return Objects.equals(this.customizedOffer, customizedOffers.customizedOffer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customizedOffer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizedOffers {\n");
    
    sb.append("    customizedOffer: ").append(toIndentedString(customizedOffer)).append("\n");
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
