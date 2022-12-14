package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The children in the organization hierarchy.
 */
@Schema(description = "The children in the organization hierarchy.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Children   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  public Children extension(Object extension) {
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

  public Children accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The ID of the account.
   * @return accountId
   **/
  @Schema(required = true, description = "The ID of the account.")
      @NotNull

    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Children address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The address for the account.
   * @return address
   **/
  @Schema(required = true, description = "The address for the account.")
      @NotNull

    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Children city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city for the account.
   * @return city
   **/
  @Schema(required = true, description = "The city for the account.")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Children company(String company) {
    this.company = company;
    return this;
  }

  /**
   * The company name.
   * @return company
   **/
  @Schema(description = "The company name.")
  
    public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Children country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The country.
   * @return country
   **/
  @Schema(required = true, description = "The country.")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Children firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The customer's first name.
   * @return firstName
   **/
  @Schema(required = true, description = "The customer's first name.")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Children lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The customer's last name.
   * @return lastName
   **/
  @Schema(required = true, description = "The customer's last name.")
      @NotNull

    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Children middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * The customer's middle name.
   * @return middleName
   **/
  @Schema(description = "The customer's middle name.")
  
    public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Children state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state.
   * @return state
   **/
  @Schema(description = "The state.")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Children zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The zip code.
   * @return zip
   **/
  @Schema(description = "The zip code.")
  
    public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Children accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number.
   * @return accountNumber
   **/
  @Schema(required = true, description = "The account number.")
      @NotNull

    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Children children = (Children) o;
    return Objects.equals(this.extension, children.extension) &&
        Objects.equals(this.accountId, children.accountId) &&
        Objects.equals(this.address, children.address) &&
        Objects.equals(this.city, children.city) &&
        Objects.equals(this.company, children.company) &&
        Objects.equals(this.country, children.country) &&
        Objects.equals(this.firstName, children.firstName) &&
        Objects.equals(this.lastName, children.lastName) &&
        Objects.equals(this.middleName, children.middleName) &&
        Objects.equals(this.state, children.state) &&
        Objects.equals(this.zip, children.zip) &&
        Objects.equals(this.accountNumber, children.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountId, address, city, company, country, firstName, lastName, middleName, state, zip, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Children {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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
