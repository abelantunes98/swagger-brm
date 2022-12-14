package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OfferDetail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An offer.
 */
@Schema(description = "An offer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Offer   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("offerDetail")
  @Valid
  private List<OfferDetail> offerDetail = new ArrayList<OfferDetail>();

  public Offer extension(Object extension) {
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

  public Offer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The offer's ID.
   * @return id
   **/
  @Schema(required = true, description = "The offer's ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Offer offerDetail(List<OfferDetail> offerDetail) {
    this.offerDetail = offerDetail;
    return this;
  }

  public Offer addOfferDetailItem(OfferDetail offerDetailItem) {
    this.offerDetail.add(offerDetailItem);
    return this;
  }

  /**
   * The offer details.
   * @return offerDetail
   **/
  @Schema(required = true, description = "The offer details.")
      @NotNull
    @Valid
    public List<OfferDetail> getOfferDetail() {
    return offerDetail;
  }

  public void setOfferDetail(List<OfferDetail> offerDetail) {
    this.offerDetail = offerDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Offer offer = (Offer) o;
    return Objects.equals(this.extension, offer.extension) &&
        Objects.equals(this.id, offer.id) &&
        Objects.equals(this.offerDetail, offer.offerDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, offerDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Offer {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerDetail: ").append(toIndentedString(offerDetail)).append("\n");
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
