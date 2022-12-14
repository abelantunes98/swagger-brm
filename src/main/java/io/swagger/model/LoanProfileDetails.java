package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LoanInfo;
import io.swagger.model.Location;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoanProfileDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class LoanProfileDetails   {
  @JsonProperty("id")
  private String id = "configLoanId";

  @JsonProperty("name")
  private String name = "name";

  @JsonProperty("loanInfo")
  private LoanInfo loanInfo = null;

  @JsonProperty("locations")
  @Valid
  private List<Location> locations = null;

  public LoanProfileDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The loan profile's ID.
   * @return id
   **/
  @Schema(required = true, description = "The loan profile's ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoanProfileDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The loan profile's name.
   * @return name
   **/
  @Schema(required = true, description = "The loan profile's name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LoanProfileDetails loanInfo(LoanInfo loanInfo) {
    this.loanInfo = loanInfo;
    return this;
  }

  /**
   * Get loanInfo
   * @return loanInfo
   **/
  @Schema(description = "")
  
    @Valid
    public LoanInfo getLoanInfo() {
    return loanInfo;
  }

  public void setLoanInfo(LoanInfo loanInfo) {
    this.loanInfo = loanInfo;
  }

  public LoanProfileDetails locations(List<Location> locations) {
    this.locations = locations;
    return this;
  }

  public LoanProfileDetails addLocationsItem(Location locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<Location>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * The list of locations where the loan is allowed or not, depending on the value of <b>locationMode</b>.
   * @return locations
   **/
  @Schema(description = "The list of locations where the loan is allowed or not, depending on the value of <b>locationMode</b>.")
      @Valid
    public List<Location> getLocations() {
    return locations;
  }

  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanProfileDetails loanProfileDetails = (LoanProfileDetails) o;
    return Objects.equals(this.id, loanProfileDetails.id) &&
        Objects.equals(this.name, loanProfileDetails.name) &&
        Objects.equals(this.loanInfo, loanProfileDetails.loanInfo) &&
        Objects.equals(this.locations, loanProfileDetails.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, loanInfo, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanProfileDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    loanInfo: ").append(toIndentedString(loanInfo)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
