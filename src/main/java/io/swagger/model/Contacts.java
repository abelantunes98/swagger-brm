package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Phonenumbers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An account&#x27;s contact information.
 */
@Schema(description = "An account's contact information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Contacts   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("contactType")
  private String contactType = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("salutation")
  private String salutation = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("zip")
  private String zip = null;

  @JsonProperty("deleted")
  private Boolean deleted = false;

  @JsonProperty("newlyCreated")
  private Boolean newlyCreated = false;

  @JsonProperty("phonenumbers")
  @Valid
  private List<Phonenumbers> phonenumbers = null;

  @JsonProperty("elem")
  private Integer elem = null;

  public Contacts address(String address) {
    this.address = address;
    return this;
  }

  /**
   * The customer's address.
   * @return address
   **/
  @Schema(required = true, description = "The customer's address.")
      @NotNull

    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Contacts city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The customer's city.
   * @return city
   **/
  @Schema(required = true, description = "The customer's city.")
      @NotNull

    public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Contacts company(String company) {
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

  public Contacts contactType(String contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * The contact type.
   * @return contactType
   **/
  @Schema(description = "The contact type.")
  
    public String getContactType() {
    return contactType;
  }

  public void setContactType(String contactType) {
    this.contactType = contactType;
  }

  public Contacts country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The customer's country.
   * @return country
   **/
  @Schema(required = true, description = "The customer's country.")
      @NotNull

    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Contacts emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The customer's email address.
   * @return emailAddress
   **/
  @Schema(description = "The customer's email address.")
  
    public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Contacts firstName(String firstName) {
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

  public Contacts lastName(String lastName) {
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

  public Contacts middleName(String middleName) {
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

  public Contacts salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

  /**
   * The salutation to use use with the customer, such as Mr. or Miss.
   * @return salutation
   **/
  @Schema(description = "The salutation to use use with the customer, such as Mr. or Miss.")
  
    public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public Contacts state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The customer's state.
   * @return state
   **/
  @Schema(description = "The customer's state.")
  
    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Contacts title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The customer's job title.
   * @return title
   **/
  @Schema(description = "The customer's job title.")
  
    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Contacts zip(String zip) {
    this.zip = zip;
    return this;
  }

  /**
   * The ZIP code.
   * @return zip
   **/
  @Schema(description = "The ZIP code.")
  
    public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Contacts deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * Whether to delete the contact (<b>true</b>) or not (<b>false</b>). This must be set to <b>false</b> if you adding a contact.
   * @return deleted
   **/
  @Schema(description = "Whether to delete the contact (<b>true</b>) or not (<b>false</b>). This must be set to <b>false</b> if you adding a contact.")
  
    public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public Contacts newlyCreated(Boolean newlyCreated) {
    this.newlyCreated = newlyCreated;
    return this;
  }

  /**
   * Whether the contact information was newly created (<b>true</b>) or not (<b>false</b>).
   * @return newlyCreated
   **/
  @Schema(description = "Whether the contact information was newly created (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isNewlyCreated() {
    return newlyCreated;
  }

  public void setNewlyCreated(Boolean newlyCreated) {
    this.newlyCreated = newlyCreated;
  }

  public Contacts phonenumbers(List<Phonenumbers> phonenumbers) {
    this.phonenumbers = phonenumbers;
    return this;
  }

  public Contacts addPhonenumbersItem(Phonenumbers phonenumbersItem) {
    if (this.phonenumbers == null) {
      this.phonenumbers = new ArrayList<Phonenumbers>();
    }
    this.phonenumbers.add(phonenumbersItem);
    return this;
  }

  /**
   * The list of associated phone numbers.
   * @return phonenumbers
   **/
  @Schema(description = "The list of associated phone numbers.")
      @Valid
    public List<Phonenumbers> getPhonenumbers() {
    return phonenumbers;
  }

  public void setPhonenumbers(List<Phonenumbers> phonenumbers) {
    this.phonenumbers = phonenumbers;
  }

  public Contacts elem(Integer elem) {
    this.elem = elem;
    return this;
  }

  /**
   * The position of the entry in the array. For example, the first item in a list would have an <b>elem</b> value of <b>1</b>.
   * @return elem
   **/
  @Schema(description = "The position of the entry in the array. For example, the first item in a list would have an <b>elem</b> value of <b>1</b>.")
  
    public Integer getElem() {
    return elem;
  }

  public void setElem(Integer elem) {
    this.elem = elem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contacts contacts = (Contacts) o;
    return Objects.equals(this.address, contacts.address) &&
        Objects.equals(this.city, contacts.city) &&
        Objects.equals(this.company, contacts.company) &&
        Objects.equals(this.contactType, contacts.contactType) &&
        Objects.equals(this.country, contacts.country) &&
        Objects.equals(this.emailAddress, contacts.emailAddress) &&
        Objects.equals(this.firstName, contacts.firstName) &&
        Objects.equals(this.lastName, contacts.lastName) &&
        Objects.equals(this.middleName, contacts.middleName) &&
        Objects.equals(this.salutation, contacts.salutation) &&
        Objects.equals(this.state, contacts.state) &&
        Objects.equals(this.title, contacts.title) &&
        Objects.equals(this.zip, contacts.zip) &&
        Objects.equals(this.deleted, contacts.deleted) &&
        Objects.equals(this.newlyCreated, contacts.newlyCreated) &&
        Objects.equals(this.phonenumbers, contacts.phonenumbers) &&
        Objects.equals(this.elem, contacts.elem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, city, company, contactType, country, emailAddress, firstName, lastName, middleName, salutation, state, title, zip, deleted, newlyCreated, phonenumbers, elem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contacts {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    newlyCreated: ").append(toIndentedString(newlyCreated)).append("\n");
    sb.append("    phonenumbers: ").append(toIndentedString(phonenumbers)).append("\n");
    sb.append("    elem: ").append(toIndentedString(elem)).append("\n");
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
