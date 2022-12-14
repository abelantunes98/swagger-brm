package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ChargeOffers;
import io.swagger.model.DiscountOffers;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OfferStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class OfferStatus   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("chargeOffers")
  @Valid
  private List<ChargeOffers> chargeOffers = null;

  @JsonProperty("discountOffers")
  @Valid
  private List<DiscountOffers> discountOffers = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public OfferStatus extension(Object extension) {
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

  public OfferStatus effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the status takes effect.
   * @return effectiveDate
   **/
  @Schema(description = "The date and time the status takes effect.")
  
    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public OfferStatus statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The code associated with the offer's status. Can be one of the following: <ul><li><b>0</b>: Not set</li><li><b>1</b>: Active</li><li><b>2</b>: Inactive</li><li><b>3</b>: Canceled</li></ul>
   * @return statusCode
   **/
  @Schema(description = "The code associated with the offer's status. Can be one of the following: <ul><li><b>0</b>: Not set</li><li><b>1</b>: Active</li><li><b>2</b>: Inactive</li><li><b>3</b>: Canceled</li></ul>")
  
    public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public OfferStatus chargeOffers(List<ChargeOffers> chargeOffers) {
    this.chargeOffers = chargeOffers;
    return this;
  }

  public OfferStatus addChargeOffersItem(ChargeOffers chargeOffersItem) {
    if (this.chargeOffers == null) {
      this.chargeOffers = new ArrayList<ChargeOffers>();
    }
    this.chargeOffers.add(chargeOffersItem);
    return this;
  }

  /**
   * The list of charge offers.
   * @return chargeOffers
   **/
  @Schema(description = "The list of charge offers.")
      @Valid
    public List<ChargeOffers> getChargeOffers() {
    return chargeOffers;
  }

  public void setChargeOffers(List<ChargeOffers> chargeOffers) {
    this.chargeOffers = chargeOffers;
  }

  public OfferStatus discountOffers(List<DiscountOffers> discountOffers) {
    this.discountOffers = discountOffers;
    return this;
  }

  public OfferStatus addDiscountOffersItem(DiscountOffers discountOffersItem) {
    if (this.discountOffers == null) {
      this.discountOffers = new ArrayList<DiscountOffers>();
    }
    this.discountOffers.add(discountOffersItem);
    return this;
  }

  /**
   * The list of discount offers.
   * @return discountOffers
   **/
  @Schema(description = "The list of discount offers.")
      @Valid
    public List<DiscountOffers> getDiscountOffers() {
    return discountOffers;
  }

  public void setDiscountOffers(List<DiscountOffers> discountOffers) {
    this.discountOffers = discountOffers;
  }

  public OfferStatus notes(Notes notes) {
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
    OfferStatus offerStatus = (OfferStatus) o;
    return Objects.equals(this.extension, offerStatus.extension) &&
        Objects.equals(this.effectiveDate, offerStatus.effectiveDate) &&
        Objects.equals(this.statusCode, offerStatus.statusCode) &&
        Objects.equals(this.chargeOffers, offerStatus.chargeOffers) &&
        Objects.equals(this.discountOffers, offerStatus.discountOffers) &&
        Objects.equals(this.notes, offerStatus.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, effectiveDate, statusCode, chargeOffers, discountOffers, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferStatus {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    chargeOffers: ").append(toIndentedString(chargeOffers)).append("\n");
    sb.append("    discountOffers: ").append(toIndentedString(discountOffers)).append("\n");
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
