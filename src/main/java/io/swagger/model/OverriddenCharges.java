package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Charges;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of dynamic charges.
 */
@Schema(description = "A list of dynamic charges.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class OverriddenCharges   {
  @JsonProperty("event")
  private String event = null;

  @JsonProperty("charges")
  @Valid
  private List<Charges> charges = new ArrayList<Charges>();

  public OverriddenCharges event(String event) {
    this.event = event;
    return this;
  }

  /**
   * The event associated with the dynamic charges.
   * @return event
   **/
  @Schema(required = true, description = "The event associated with the dynamic charges.")
      @NotNull

    public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public OverriddenCharges charges(List<Charges> charges) {
    this.charges = charges;
    return this;
  }

  public OverriddenCharges addChargesItem(Charges chargesItem) {
    this.charges.add(chargesItem);
    return this;
  }

  /**
   * The charge details.
   * @return charges
   **/
  @Schema(required = true, description = "The charge details.")
      @NotNull
    @Valid
    public List<Charges> getCharges() {
    return charges;
  }

  public void setCharges(List<Charges> charges) {
    this.charges = charges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverriddenCharges overriddenCharges = (OverriddenCharges) o;
    return Objects.equals(this.event, overriddenCharges.event) &&
        Objects.equals(this.charges, overriddenCharges.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, charges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverriddenCharges {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
