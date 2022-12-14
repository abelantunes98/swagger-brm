package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CustomizedChargeOffers;
import io.swagger.model.CustomizedDiscountOffers;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bundle being purchased or updated.
 */
@Schema(description = "A bundle being purchased or updated.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomizedBundleForPurchase   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("customizedChargeOffers")
  @Valid
  private List<CustomizedChargeOffers> customizedChargeOffers = null;

  @JsonProperty("customizedDiscountOffers")
  @Valid
  private List<CustomizedDiscountOffers> customizedDiscountOffers = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public CustomizedBundleForPurchase id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID.
   * @return id
   **/
  @Schema(required = true, description = "The ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomizedBundleForPurchase name(String name) {
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

  public CustomizedBundleForPurchase effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the bundle takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the bundle takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public CustomizedBundleForPurchase customizedChargeOffers(List<CustomizedChargeOffers> customizedChargeOffers) {
    this.customizedChargeOffers = customizedChargeOffers;
    return this;
  }

  public CustomizedBundleForPurchase addCustomizedChargeOffersItem(CustomizedChargeOffers customizedChargeOffersItem) {
    if (this.customizedChargeOffers == null) {
      this.customizedChargeOffers = new ArrayList<CustomizedChargeOffers>();
    }
    this.customizedChargeOffers.add(customizedChargeOffersItem);
    return this;
  }

  /**
   * The list of customized charge offers in the bundle.
   * @return customizedChargeOffers
   **/
  @Schema(description = "The list of customized charge offers in the bundle.")
      @Valid
    public List<CustomizedChargeOffers> getCustomizedChargeOffers() {
    return customizedChargeOffers;
  }

  public void setCustomizedChargeOffers(List<CustomizedChargeOffers> customizedChargeOffers) {
    this.customizedChargeOffers = customizedChargeOffers;
  }

  public CustomizedBundleForPurchase customizedDiscountOffers(List<CustomizedDiscountOffers> customizedDiscountOffers) {
    this.customizedDiscountOffers = customizedDiscountOffers;
    return this;
  }

  public CustomizedBundleForPurchase addCustomizedDiscountOffersItem(CustomizedDiscountOffers customizedDiscountOffersItem) {
    if (this.customizedDiscountOffers == null) {
      this.customizedDiscountOffers = new ArrayList<CustomizedDiscountOffers>();
    }
    this.customizedDiscountOffers.add(customizedDiscountOffersItem);
    return this;
  }

  /**
   * The list of customized discount offers.
   * @return customizedDiscountOffers
   **/
  @Schema(description = "The list of customized discount offers.")
      @Valid
    public List<CustomizedDiscountOffers> getCustomizedDiscountOffers() {
    return customizedDiscountOffers;
  }

  public void setCustomizedDiscountOffers(List<CustomizedDiscountOffers> customizedDiscountOffers) {
    this.customizedDiscountOffers = customizedDiscountOffers;
  }

  public CustomizedBundleForPurchase notes(Notes notes) {
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
    CustomizedBundleForPurchase customizedBundleForPurchase = (CustomizedBundleForPurchase) o;
    return Objects.equals(this.id, customizedBundleForPurchase.id) &&
        Objects.equals(this.name, customizedBundleForPurchase.name) &&
        Objects.equals(this.effective, customizedBundleForPurchase.effective) &&
        Objects.equals(this.customizedChargeOffers, customizedBundleForPurchase.customizedChargeOffers) &&
        Objects.equals(this.customizedDiscountOffers, customizedBundleForPurchase.customizedDiscountOffers) &&
        Objects.equals(this.notes, customizedBundleForPurchase.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, effective, customizedChargeOffers, customizedDiscountOffers, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomizedBundleForPurchase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    customizedChargeOffers: ").append(toIndentedString(customizedChargeOffers)).append("\n");
    sb.append("    customizedDiscountOffers: ").append(toIndentedString(customizedDiscountOffers)).append("\n");
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
