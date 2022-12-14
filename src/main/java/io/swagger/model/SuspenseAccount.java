package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A suspense account.
 */
@Schema(description = "A suspense account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SuspenseAccount   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public SuspenseAccount extension(Object extension) {
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

  public SuspenseAccount accountId(String accountId) {
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

  public SuspenseAccount accountNumber(String accountNumber) {
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

  public SuspenseAccount firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the suspense account..
   * @return firstName
   **/
  @Schema(required = true, description = "The first name of the suspense account..")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SuspenseAccount lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the suspense account.
   * @return lastName
   **/
  @Schema(required = true, description = "The last name of the suspense account.")
      @NotNull

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
    SuspenseAccount suspenseAccount = (SuspenseAccount) o;
    return Objects.equals(this.extension, suspenseAccount.extension) &&
        Objects.equals(this.accountId, suspenseAccount.accountId) &&
        Objects.equals(this.accountNumber, suspenseAccount.accountNumber) &&
        Objects.equals(this.firstName, suspenseAccount.firstName) &&
        Objects.equals(this.lastName, suspenseAccount.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountId, accountNumber, firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspenseAccount {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
