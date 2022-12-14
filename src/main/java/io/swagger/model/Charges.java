package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Charge;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The charge details.
 */
@Schema(description = "The charge details.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Charges   {
  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("endDate")
  private OffsetDateTime endDate = null;

  @JsonProperty("charge")
  @Valid
  private List<Charge> charge = new ArrayList<Charge>();

  public Charges startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date and time the charge's validity starts.
   * @return startDate
   **/
  @Schema(required = true, description = "The date and time the charge's validity starts.")
      @NotNull

    @Valid
    public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Charges endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The date and time the charge's validity ends.
   * @return endDate
   **/
  @Schema(description = "The date and time the charge's validity ends.")
  
    @Valid
    public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Charges charge(List<Charge> charge) {
    this.charge = charge;
    return this;
  }

  public Charges addChargeItem(Charge chargeItem) {
    this.charge.add(chargeItem);
    return this;
  }

  /**
   * The list of charges.
   * @return charge
   **/
  @Schema(required = true, description = "The list of charges.")
      @NotNull
    @Valid
    public List<Charge> getCharge() {
    return charge;
  }

  public void setCharge(List<Charge> charge) {
    this.charge = charge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charges charges = (Charges) o;
    return Objects.equals(this.startDate, charges.startDate) &&
        Objects.equals(this.endDate, charges.endDate) &&
        Objects.equals(this.charge, charges.charge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, charge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charges {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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
