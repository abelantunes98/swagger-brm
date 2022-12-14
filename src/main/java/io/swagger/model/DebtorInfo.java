package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the debtor.
 */
@Schema(description = "Information about the debtor.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DebtorInfo   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("identificationCode")
  private String identificationCode = null;

  @JsonProperty("referencePartyName")
  private String referencePartyName = null;

  @JsonProperty("partyIdCode")
  private String partyIdCode = null;

  public DebtorInfo address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The debtor's address.
   * @return address
   **/
  @Schema(required = true, description = "The debtor's address.")
      @NotNull

    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DebtorInfo city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The debtor's city.
   * @return city
   **/
  @Schema(required = true, description = "The debtor's city.")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public DebtorInfo country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The debtor's country.
   * @return country
   **/
  @Schema(required = true, description = "The debtor's country.")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public DebtorInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The debtor's name.
   * @return name
   **/
  @Schema(required = true, description = "The debtor's name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DebtorInfo zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The debtor's ZIP code.
   * @return zip
   **/
  @Schema(required = true, description = "The debtor's ZIP code.")
      @NotNull

    public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public DebtorInfo identificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
    return this;
  }

  /**
   * The debtor's bank identifier code.
   * @return identificationCode
   **/
  @Schema(description = "The debtor's bank identifier code.")
  
    public String getIdentificationCode() {
    return identificationCode;
  }

  public void setIdentificationCode(String identificationCode) {
    this.identificationCode = identificationCode;
  }

  public DebtorInfo referencePartyName(String referencePartyName) {
    this.referencePartyName = referencePartyName;
    return this;
  }

  /**
   * The debtor's party name.
   * @return referencePartyName
   **/
  @Schema(description = "The debtor's party name.")
  
    public String getReferencePartyName() {
    return referencePartyName;
  }

  public void setReferencePartyName(String referencePartyName) {
    this.referencePartyName = referencePartyName;
  }

  public DebtorInfo partyIdCode(String partyIdCode) {
    this.partyIdCode = partyIdCode;
    return this;
  }

  /**
   * The debtor's party ID code.
   * @return partyIdCode
   **/
  @Schema(description = "The debtor's party ID code.")
  
    public String getPartyIdCode() {
    return partyIdCode;
  }

  public void setPartyIdCode(String partyIdCode) {
    this.partyIdCode = partyIdCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtorInfo debtorInfo = (DebtorInfo) o;
    return Objects.equals(this.address, debtorInfo.address) &&
        Objects.equals(this.city, debtorInfo.city) &&
        Objects.equals(this.country, debtorInfo.country) &&
        Objects.equals(this.name, debtorInfo.name) &&
        Objects.equals(this.zip, debtorInfo.zip) &&
        Objects.equals(this.identificationCode, debtorInfo.identificationCode) &&
        Objects.equals(this.referencePartyName, debtorInfo.referencePartyName) &&
        Objects.equals(this.partyIdCode, debtorInfo.partyIdCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, country, name, zip, identificationCode, referencePartyName, partyIdCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtorInfo {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    identificationCode: ").append(toIndentedString(identificationCode)).append("\n");
    sb.append("    referencePartyName: ").append(toIndentedString(referencePartyName)).append("\n");
    sb.append("    partyIdCode: ").append(toIndentedString(partyIdCode)).append("\n");
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
