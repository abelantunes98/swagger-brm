package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Parent;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The parent of the organization hierarchy.
 */
@Schema(description = "The parent of the organization hierarchy.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Parent   {
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

  @JsonProperty("parent")
  private Parent parent = null;

  @JsonProperty("organizationHierarchyType")
  private Integer organizationHierarchyType = null;

  public Parent extension(Object extension) {
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

  public Parent accountId(String accountId) {
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

  public Parent address(String address) {
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

  public Parent city(String city) {
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

  public Parent company(String company) {
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

  public Parent country(String country) {
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

  public Parent firstName(String firstName) {
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

  public Parent lastName(String lastName) {
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

  public Parent middleName(String middleName) {
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

  public Parent state(String state) {
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

  public Parent zip(String zip) {
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

  public Parent accountNumber(String accountNumber) {
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

  public Parent parent(Parent parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   **/
  @Schema(description = "")
  
    @Valid
    public Parent getParent() {
    return parent;
  }

  public void setParent(Parent parent) {
    this.parent = parent;
  }

  public Parent organizationHierarchyType(Integer organizationHierarchyType) {
    this.organizationHierarchyType = organizationHierarchyType;
    return this;
  }

  /**
   * The type of organization hierarchy, such as <b>not set</b>, <b>site</b>, <b>legal entity</b>, <b>billing account</b>, or <b>service account</b>.
   * @return organizationHierarchyType
   **/
  @Schema(description = "The type of organization hierarchy, such as <b>not set</b>, <b>site</b>, <b>legal entity</b>, <b>billing account</b>, or <b>service account</b>.")
  
    public Integer getOrganizationHierarchyType() {
    return organizationHierarchyType;
  }

  public void setOrganizationHierarchyType(Integer organizationHierarchyType) {
    this.organizationHierarchyType = organizationHierarchyType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parent parent = (Parent) o;
    return Objects.equals(this.extension, parent.extension) &&
        Objects.equals(this.accountId, parent.accountId) &&
        Objects.equals(this.address, parent.address) &&
        Objects.equals(this.city, parent.city) &&
        Objects.equals(this.company, parent.company) &&
        Objects.equals(this.country, parent.country) &&
        Objects.equals(this.firstName, parent.firstName) &&
        Objects.equals(this.lastName, parent.lastName) &&
        Objects.equals(this.middleName, parent.middleName) &&
        Objects.equals(this.state, parent.state) &&
        Objects.equals(this.zip, parent.zip) &&
        Objects.equals(this.accountNumber, parent.accountNumber) &&
        Objects.equals(this.parent, parent.parent) &&
        Objects.equals(this.organizationHierarchyType, parent.organizationHierarchyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountId, address, city, company, country, firstName, lastName, middleName, state, zip, accountNumber, parent, organizationHierarchyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parent {\n");
    
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
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    organizationHierarchyType: ").append(toIndentedString(organizationHierarchyType)).append("\n");
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
