package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ChargeOffers;
import io.swagger.model.DiscountOffers;
import io.swagger.model.ResourceRef;
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


public class Bundles   {
  @JsonProperty("ref")
  private ResourceRef ref = null;

  @JsonProperty("required")
  private Boolean required = false;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("chargeoffers")
  @Valid
  private List<ChargeOffers> chargeoffers = null;

  @JsonProperty("discountoffers")
  @Valid
  private List<DiscountOffers> discountoffers = null;

  @JsonProperty("elem")
  private Integer elem = null;

  public Bundles ref(ResourceRef ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getRef() {
    return ref;
  }

  public void setRef(ResourceRef ref) {
    this.ref = ref;
  }

  public Bundles required(Boolean required) {
    this.required = required;
    return this;
  }

  /**
   * Whether the bundle is required (<b>true</b>) or optional (<b>false</b>).
   * @return required
   **/
  @Schema(description = "Whether the bundle is required (<b>true</b>) or optional (<b>false</b>).")
  
    public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public Bundles name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The bundle's name.
   * @return name
   **/
  @Schema(required = true, description = "The bundle's name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bundles description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The bundle's description.
   * @return description
   **/
  @Schema(required = true, description = "The bundle's description.")
      @NotNull

    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bundles chargeoffers(List<ChargeOffers> chargeoffers) {
    this.chargeoffers = chargeoffers;
    return this;
  }

  public Bundles addChargeoffersItem(ChargeOffers chargeoffersItem) {
    if (this.chargeoffers == null) {
      this.chargeoffers = new ArrayList<ChargeOffers>();
    }
    this.chargeoffers.add(chargeoffersItem);
    return this;
  }

  /**
   * The list of charge offers in the bundle.
   * @return chargeoffers
   **/
  @Schema(description = "The list of charge offers in the bundle.")
      @Valid
    public List<ChargeOffers> getChargeoffers() {
    return chargeoffers;
  }

  public void setChargeoffers(List<ChargeOffers> chargeoffers) {
    this.chargeoffers = chargeoffers;
  }

  public Bundles discountoffers(List<DiscountOffers> discountoffers) {
    this.discountoffers = discountoffers;
    return this;
  }

  public Bundles addDiscountoffersItem(DiscountOffers discountoffersItem) {
    if (this.discountoffers == null) {
      this.discountoffers = new ArrayList<DiscountOffers>();
    }
    this.discountoffers.add(discountoffersItem);
    return this;
  }

  /**
   * The list of discount offers in the bundle.
   * @return discountoffers
   **/
  @Schema(description = "The list of discount offers in the bundle.")
      @Valid
    public List<DiscountOffers> getDiscountoffers() {
    return discountoffers;
  }

  public void setDiscountoffers(List<DiscountOffers> discountoffers) {
    this.discountoffers = discountoffers;
  }

  public Bundles elem(Integer elem) {
    this.elem = elem;
    return this;
  }

  /**
   * The position of the entry in the array. For example, the first item in a list would have an <b>elem</b> value of <b>1</b>.
   * @return elem
   **/
  @Schema(description = "The position of the entry in the array. For example, the first item in a list would have an <b>elem</b> value of <b>1</b>.")
  
    public Integer getElem() {
    return elem;
  }

  public void setElem(Integer elem) {
    this.elem = elem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bundles bundles = (Bundles) o;
    return Objects.equals(this.ref, bundles.ref) &&
        Objects.equals(this.required, bundles.required) &&
        Objects.equals(this.name, bundles.name) &&
        Objects.equals(this.description, bundles.description) &&
        Objects.equals(this.chargeoffers, bundles.chargeoffers) &&
        Objects.equals(this.discountoffers, bundles.discountoffers) &&
        Objects.equals(this.elem, bundles.elem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, required, name, description, chargeoffers, discountoffers, elem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bundles {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    chargeoffers: ").append(toIndentedString(chargeoffers)).append("\n");
    sb.append("    discountoffers: ").append(toIndentedString(discountoffers)).append("\n");
    sb.append("    elem: ").append(toIndentedString(elem)).append("\n");
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
