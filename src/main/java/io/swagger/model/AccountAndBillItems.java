package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillItem;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The account and bill items in the bill charge group.
 */
@Schema(description = "The account and bill items in the bill charge group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AccountAndBillItems   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("billItem")
  @Valid
  private List<BillItem> billItem = new ArrayList<BillItem>();

  public AccountAndBillItems extension(Object extension) {
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

  public AccountAndBillItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID.
   * @return id
   **/
  @Schema(required = true, description = "The ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountAndBillItems accountRef(ResourceRef accountRef) {
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

  public AccountAndBillItems firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the customer owning the account.
   * @return firstName
   **/
  @Schema(description = "The first name of the customer owning the account.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public AccountAndBillItems lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the customer owning the account.
   * @return lastName
   **/
  @Schema(description = "The last name of the customer owning the account.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public AccountAndBillItems billItem(List<BillItem> billItem) {
    this.billItem = billItem;
    return this;
  }

  public AccountAndBillItems addBillItemItem(BillItem billItemItem) {
    this.billItem.add(billItemItem);
    return this;
  }

  /**
   * A bill item.
   * @return billItem
   **/
  @Schema(required = true, description = "A bill item.")
      @NotNull
    @Valid
    public List<BillItem> getBillItem() {
    return billItem;
  }

  public void setBillItem(List<BillItem> billItem) {
    this.billItem = billItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAndBillItems accountAndBillItems = (AccountAndBillItems) o;
    return Objects.equals(this.extension, accountAndBillItems.extension) &&
        Objects.equals(this.id, accountAndBillItems.id) &&
        Objects.equals(this.accountRef, accountAndBillItems.accountRef) &&
        Objects.equals(this.firstName, accountAndBillItems.firstName) &&
        Objects.equals(this.lastName, accountAndBillItems.lastName) &&
        Objects.equals(this.billItem, accountAndBillItems.billItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, accountRef, firstName, lastName, billItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAndBillItems {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    billItem: ").append(toIndentedString(billItem)).append("\n");
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
