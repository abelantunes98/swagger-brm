package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillUnitCollectionsDetails;
import io.swagger.model.Phonenumbers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountCollectionDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AccountCollectionDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("billUnitCollectionsDetails")
  @Valid
  private List<BillUnitCollectionsDetails> billUnitCollectionsDetails = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("numberOfBillUnitsInCollections")
  private Integer numberOfBillUnitsInCollections = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("phonenumbers")
  @Valid
  private List<Phonenumbers> phonenumbers = null;

  public AccountCollectionDetails extension(Object extension) {
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

  public AccountCollectionDetails billUnitCollectionsDetails(List<BillUnitCollectionsDetails> billUnitCollectionsDetails) {
    this.billUnitCollectionsDetails = billUnitCollectionsDetails;
    return this;
  }

  public AccountCollectionDetails addBillUnitCollectionsDetailsItem(BillUnitCollectionsDetails billUnitCollectionsDetailsItem) {
    if (this.billUnitCollectionsDetails == null) {
      this.billUnitCollectionsDetails = new ArrayList<BillUnitCollectionsDetails>();
    }
    this.billUnitCollectionsDetails.add(billUnitCollectionsDetailsItem);
    return this;
  }

  /**
   * The details for a bill unit in collections.
   * @return billUnitCollectionsDetails
   **/
  @Schema(description = "The details for a bill unit in collections.")
      @Valid
    public List<BillUnitCollectionsDetails> getBillUnitCollectionsDetails() {
    return billUnitCollectionsDetails;
  }

  public void setBillUnitCollectionsDetails(List<BillUnitCollectionsDetails> billUnitCollectionsDetails) {
    this.billUnitCollectionsDetails = billUnitCollectionsDetails;
  }

  public AccountCollectionDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account's number.
   * @return accountNumber
   **/
  @Schema(required = true, description = "The account's number.")
      @NotNull

    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountCollectionDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The account's ID.
   * @return accountId
   **/
  @Schema(required = true, description = "The account's ID.")
      @NotNull

    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountCollectionDetails numberOfBillUnitsInCollections(Integer numberOfBillUnitsInCollections) {
    this.numberOfBillUnitsInCollections = numberOfBillUnitsInCollections;
    return this;
  }

  /**
   * The number of bill units that are in collections.
   * @return numberOfBillUnitsInCollections
   **/
  @Schema(description = "The number of bill units that are in collections.")
  
    public Integer getNumberOfBillUnitsInCollections() {
    return numberOfBillUnitsInCollections;
  }

  public void setNumberOfBillUnitsInCollections(Integer numberOfBillUnitsInCollections) {
    this.numberOfBillUnitsInCollections = numberOfBillUnitsInCollections;
  }

  public AccountCollectionDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The account owner's first name.
   * @return firstName
   **/
  @Schema(required = true, description = "The account owner's first name.")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountCollectionDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The account owner's last name.
   * @return lastName
   **/
  @Schema(required = true, description = "The account owner's last name.")
      @NotNull

    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AccountCollectionDetails address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The account's address.
   * @return address
   **/
  @Schema(required = true, description = "The account's address.")
      @NotNull

    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public AccountCollectionDetails city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The account's city.
   * @return city
   **/
  @Schema(required = true, description = "The account's city.")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AccountCollectionDetails company(String company) {
    this.company = company;
    return this;
  }

  /**
   * The account's company name.
   * @return company
   **/
  @Schema(description = "The account's company name.")
  
    public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public AccountCollectionDetails country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The account's country.
   * @return country
   **/
  @Schema(required = true, description = "The account's country.")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public AccountCollectionDetails emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The account's email address.
   * @return emailAddress
   **/
  @Schema(description = "The account's email address.")
  
    public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public AccountCollectionDetails state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The account's state or province.
   * @return state
   **/
  @Schema(description = "The account's state or province.")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AccountCollectionDetails zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The account's ZIP or postal code.
   * @return zip
   **/
  @Schema(description = "The account's ZIP or postal code.")
  
    public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public AccountCollectionDetails phonenumbers(List<Phonenumbers> phonenumbers) {
    this.phonenumbers = phonenumbers;
    return this;
  }

  public AccountCollectionDetails addPhonenumbersItem(Phonenumbers phonenumbersItem) {
    if (this.phonenumbers == null) {
      this.phonenumbers = new ArrayList<Phonenumbers>();
    }
    this.phonenumbers.add(phonenumbersItem);
    return this;
  }

  /**
   * The list of the account's phone numbers.
   * @return phonenumbers
   **/
  @Schema(description = "The list of the account's phone numbers.")
      @Valid
    public List<Phonenumbers> getPhonenumbers() {
    return phonenumbers;
  }

  public void setPhonenumbers(List<Phonenumbers> phonenumbers) {
    this.phonenumbers = phonenumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCollectionDetails accountCollectionDetails = (AccountCollectionDetails) o;
    return Objects.equals(this.extension, accountCollectionDetails.extension) &&
        Objects.equals(this.billUnitCollectionsDetails, accountCollectionDetails.billUnitCollectionsDetails) &&
        Objects.equals(this.accountNumber, accountCollectionDetails.accountNumber) &&
        Objects.equals(this.accountId, accountCollectionDetails.accountId) &&
        Objects.equals(this.numberOfBillUnitsInCollections, accountCollectionDetails.numberOfBillUnitsInCollections) &&
        Objects.equals(this.firstName, accountCollectionDetails.firstName) &&
        Objects.equals(this.lastName, accountCollectionDetails.lastName) &&
        Objects.equals(this.address, accountCollectionDetails.address) &&
        Objects.equals(this.city, accountCollectionDetails.city) &&
        Objects.equals(this.company, accountCollectionDetails.company) &&
        Objects.equals(this.country, accountCollectionDetails.country) &&
        Objects.equals(this.emailAddress, accountCollectionDetails.emailAddress) &&
        Objects.equals(this.state, accountCollectionDetails.state) &&
        Objects.equals(this.zip, accountCollectionDetails.zip) &&
        Objects.equals(this.phonenumbers, accountCollectionDetails.phonenumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, billUnitCollectionsDetails, accountNumber, accountId, numberOfBillUnitsInCollections, firstName, lastName, address, city, company, country, emailAddress, state, zip, phonenumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCollectionDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    billUnitCollectionsDetails: ").append(toIndentedString(billUnitCollectionsDetails)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    numberOfBillUnitsInCollections: ").append(toIndentedString(numberOfBillUnitsInCollections)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    phonenumbers: ").append(toIndentedString(phonenumbers)).append("\n");
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
