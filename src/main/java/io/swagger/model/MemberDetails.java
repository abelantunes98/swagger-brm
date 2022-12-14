package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.model.Services;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of sharing group members.
 */
@Schema(description = "The list of sharing group members.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class MemberDetails   {
  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("services")
  @Valid
  private List<Services> services = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public MemberDetails accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public MemberDetails services(List<Services> services) {
    this.services = services;
    return this;
  }

  public MemberDetails addServicesItem(Services servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Services>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The list of services shared in the group.
   * @return services
   **/
  @Schema(description = "The list of services shared in the group.")
      @Valid
    public List<Services> getServices() {
    return services;
  }

  public void setServices(List<Services> services) {
    this.services = services;
  }

  public MemberDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The member's account number.
   * @return accountNumber
   **/
  @Schema(description = "The member's account number.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public MemberDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The member's first name.
   * @return firstName
   **/
  @Schema(description = "The member's first name.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public MemberDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The member's last name.
   * @return lastName
   **/
  @Schema(description = "The member's last name.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberDetails memberDetails = (MemberDetails) o;
    return Objects.equals(this.accountRef, memberDetails.accountRef) &&
        Objects.equals(this.services, memberDetails.services) &&
        Objects.equals(this.accountNumber, memberDetails.accountNumber) &&
        Objects.equals(this.firstName, memberDetails.firstName) &&
        Objects.equals(this.lastName, memberDetails.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountRef, services, accountNumber, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberDetails {\n");
    
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
