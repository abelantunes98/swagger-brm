package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChargeOffer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ChargeOffer   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("startsAt")
  private String startsAt = null;

  @JsonProperty("expiresAt")
  private String expiresAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("descr")
  private String descr = null;

  /**
   * The charge offer type.
   */
  public enum OfferTypeEnum {
    SYSTEM("SYSTEM"),
    
    ITEM("ITEM"),
    
    SUBSCRIPTION("SUBSCRIPTION");

    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OfferTypeEnum fromValue(String text) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("offerType")
  private OfferTypeEnum offerType = null;

  @JsonProperty("permitted")
  private String permitted = null;

  public ChargeOffer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The charge offer ID.
   * @return id
   **/
  @Schema(description = "The charge offer ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChargeOffer createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the charge offer is initiated.
   * @return createdAt
   **/
  @Schema(description = "The date when the charge offer is initiated.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ChargeOffer startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * The start date of the charge offer.
   * @return startsAt
   **/
  @Schema(description = "The start date of the charge offer.")
  
    public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public ChargeOffer expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The expiry date of charge offer.
   * @return expiresAt
   **/
  @Schema(description = "The expiry date of charge offer.")
  
    public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public ChargeOffer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The charge offer name.
   * @return name
   **/
  @Schema(required = true, description = "The charge offer name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChargeOffer code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The external identifier.
   * @return code
   **/
  @Schema(description = "The external identifier.")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ChargeOffer descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The charge offer description.
   * @return descr
   **/
  @Schema(description = "The charge offer description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public ChargeOffer offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  /**
   * The charge offer type.
   * @return offerType
   **/
  @Schema(description = "The charge offer type.")
  
    public OfferTypeEnum getOfferType() {
    return offerType;
  }

  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }

  public ChargeOffer permitted(String permitted) {
    this.permitted = permitted;
    return this;
  }

  /**
   * Get permitted
   * @return permitted
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPermitted() {
    return permitted;
  }

  public void setPermitted(String permitted) {
    this.permitted = permitted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeOffer chargeOffer = (ChargeOffer) o;
    return Objects.equals(this.id, chargeOffer.id) &&
        Objects.equals(this.createdAt, chargeOffer.createdAt) &&
        Objects.equals(this.startsAt, chargeOffer.startsAt) &&
        Objects.equals(this.expiresAt, chargeOffer.expiresAt) &&
        Objects.equals(this.name, chargeOffer.name) &&
        Objects.equals(this.code, chargeOffer.code) &&
        Objects.equals(this.descr, chargeOffer.descr) &&
        Objects.equals(this.offerType, chargeOffer.offerType) &&
        Objects.equals(this.permitted, chargeOffer.permitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, startsAt, expiresAt, name, code, descr, offerType, permitted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeOffer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    permitted: ").append(toIndentedString(permitted)).append("\n");
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
