package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Details;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about an offer.
 */
@Schema(description = "Details about an offer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class OfferDetail   {
  @JsonProperty("event")
  private String event = null;

  @JsonProperty("details")
  @Valid
  private List<Details> details = new ArrayList<Details>();

  public OfferDetail event(String event) {
    this.event = event;
    return this;
  }

  /**
   * The event associated with the offer.
   * @return event
   **/
  @Schema(required = true, description = "The event associated with the offer.")
      @NotNull

    public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public OfferDetail details(List<Details> details) {
    this.details = details;
    return this;
  }

  public OfferDetail addDetailsItem(Details detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

  /**
   * The offer details.
   * @return details
   **/
  @Schema(required = true, description = "The offer details.")
      @NotNull
    @Valid
    public List<Details> getDetails() {
    return details;
  }

  public void setDetails(List<Details> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferDetail offerDetail = (OfferDetail) o;
    return Objects.equals(this.event, offerDetail.event) &&
        Objects.equals(this.details, offerDetail.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferDetail {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
