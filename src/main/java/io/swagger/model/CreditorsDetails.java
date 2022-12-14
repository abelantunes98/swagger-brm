package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about a creditor.
 */
@Schema(description = "Details about a creditor.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CreditorsDetails   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("creditorID")
  private String creditorID = null;

  public CreditorsDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The creditor's name.
   * @return name
   **/
  @Schema(required = true, description = "The creditor's name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreditorsDetails country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The creditor's country.
   * @return country
   **/
  @Schema(required = true, description = "The creditor's country.")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CreditorsDetails address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The creditor's address.
   * @return address
   **/
  @Schema(required = true, description = "The creditor's address.")
      @NotNull

    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CreditorsDetails creditorID(String creditorID) {
    this.creditorID = creditorID;
    return this;
  }

  /**
   * The ID for the creditor.
   * @return creditorID
   **/
  @Schema(required = true, description = "The ID for the creditor.")
      @NotNull

    public String getCreditorID() {
    return creditorID;
  }

  public void setCreditorID(String creditorID) {
    this.creditorID = creditorID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditorsDetails creditorsDetails = (CreditorsDetails) o;
    return Objects.equals(this.name, creditorsDetails.name) &&
        Objects.equals(this.country, creditorsDetails.country) &&
        Objects.equals(this.address, creditorsDetails.address) &&
        Objects.equals(this.creditorID, creditorsDetails.creditorID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, country, address, creditorID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditorsDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    creditorID: ").append(toIndentedString(creditorID)).append("\n");
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
