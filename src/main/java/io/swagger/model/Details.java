package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about a resource.
 */
@Schema(description = "Details about a resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Details   {
  @JsonProperty("balanceImpactResource")
  private String balanceImpactResource = null;

  @JsonProperty("fixedAmount")
  private Float fixedAmount = null;

  @JsonProperty("scaledAmount")
  private Float scaledAmount = null;

  @JsonProperty("fixedPriceTag")
  private String fixedPriceTag = null;

  @JsonProperty("scaledPriceTag")
  private String scaledPriceTag = null;

  public Details balanceImpactResource(String balanceImpactResource) {
    this.balanceImpactResource = balanceImpactResource;
    return this;
  }

  /**
   * The resource that represents the balance impact of the offer.
   * @return balanceImpactResource
   **/
  @Schema(required = true, description = "The resource that represents the balance impact of the offer.")
      @NotNull

    public String getBalanceImpactResource() {
    return balanceImpactResource;
  }

  public void setBalanceImpactResource(String balanceImpactResource) {
    this.balanceImpactResource = balanceImpactResource;
  }

  public Details fixedAmount(Float fixedAmount) {
    this.fixedAmount = fixedAmount;
    return this;
  }

  /**
   * The fixed amount of the offer.
   * @return fixedAmount
   **/
  @Schema(description = "The fixed amount of the offer.")
  
    public Float getFixedAmount() {
    return fixedAmount;
  }

  public void setFixedAmount(Float fixedAmount) {
    this.fixedAmount = fixedAmount;
  }

  public Details scaledAmount(Float scaledAmount) {
    this.scaledAmount = scaledAmount;
    return this;
  }

  /**
   * The scaled amount of the offer.
   * @return scaledAmount
   **/
  @Schema(description = "The scaled amount of the offer.")
  
    public Float getScaledAmount() {
    return scaledAmount;
  }

  public void setScaledAmount(Float scaledAmount) {
    this.scaledAmount = scaledAmount;
  }

  public Details fixedPriceTag(String fixedPriceTag) {
    this.fixedPriceTag = fixedPriceTag;
    return this;
  }

  /**
   * The fixed price tag of the offer.
   * @return fixedPriceTag
   **/
  @Schema(required = true, description = "The fixed price tag of the offer.")
      @NotNull

    public String getFixedPriceTag() {
    return fixedPriceTag;
  }

  public void setFixedPriceTag(String fixedPriceTag) {
    this.fixedPriceTag = fixedPriceTag;
  }

  public Details scaledPriceTag(String scaledPriceTag) {
    this.scaledPriceTag = scaledPriceTag;
    return this;
  }

  /**
   * The scaled price tag of the offer.
   * @return scaledPriceTag
   **/
  @Schema(required = true, description = "The scaled price tag of the offer.")
      @NotNull

    public String getScaledPriceTag() {
    return scaledPriceTag;
  }

  public void setScaledPriceTag(String scaledPriceTag) {
    this.scaledPriceTag = scaledPriceTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Details details = (Details) o;
    return Objects.equals(this.balanceImpactResource, details.balanceImpactResource) &&
        Objects.equals(this.fixedAmount, details.fixedAmount) &&
        Objects.equals(this.scaledAmount, details.scaledAmount) &&
        Objects.equals(this.fixedPriceTag, details.fixedPriceTag) &&
        Objects.equals(this.scaledPriceTag, details.scaledPriceTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceImpactResource, fixedAmount, scaledAmount, fixedPriceTag, scaledPriceTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Details {\n");
    
    sb.append("    balanceImpactResource: ").append(toIndentedString(balanceImpactResource)).append("\n");
    sb.append("    fixedAmount: ").append(toIndentedString(fixedAmount)).append("\n");
    sb.append("    scaledAmount: ").append(toIndentedString(scaledAmount)).append("\n");
    sb.append("    fixedPriceTag: ").append(toIndentedString(fixedPriceTag)).append("\n");
    sb.append("    scaledPriceTag: ").append(toIndentedString(scaledPriceTag)).append("\n");
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
