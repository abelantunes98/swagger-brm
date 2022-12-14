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
 * The services and bill items in the bill charge group.
 */
@Schema(description = "The services and bill items in the bill charge group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServicesAndBillItems   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("deviceID")
  private String deviceID = null;

  @JsonProperty("serviceID")
  private String serviceID = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("billItem")
  @Valid
  private List<BillItem> billItem = new ArrayList<BillItem>();

  public ServicesAndBillItems extension(Object extension) {
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

  public ServicesAndBillItems id(String id) {
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

  public ServicesAndBillItems accountRef(ResourceRef accountRef) {
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

  public ServicesAndBillItems deviceID(String deviceID) {
    this.deviceID = deviceID;
    return this;
  }

  /**
   * The ID of the device related to the service.
   * @return deviceID
   **/
  @Schema(description = "The ID of the device related to the service.")
  
    public String getDeviceID() {
    return deviceID;
  }

  public void setDeviceID(String deviceID) {
    this.deviceID = deviceID;
  }

  public ServicesAndBillItems serviceID(String serviceID) {
    this.serviceID = serviceID;
    return this;
  }

  /**
   * The service's ID.
   * @return serviceID
   **/
  @Schema(description = "The service's ID.")
  
    public String getServiceID() {
    return serviceID;
  }

  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  public ServicesAndBillItems serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * The service's type.
   * @return serviceType
   **/
  @Schema(description = "The service's type.")
  
    public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public ServicesAndBillItems firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the customer owning the service.
   * @return firstName
   **/
  @Schema(description = "The first name of the customer owning the service.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ServicesAndBillItems lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the customer owning the service.
   * @return lastName
   **/
  @Schema(description = "The last name of the customer owning the service.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ServicesAndBillItems accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the service.
   * @return accountNumber
   **/
  @Schema(description = "The account number associated with the service.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ServicesAndBillItems billItem(List<BillItem> billItem) {
    this.billItem = billItem;
    return this;
  }

  public ServicesAndBillItems addBillItemItem(BillItem billItemItem) {
    this.billItem.add(billItemItem);
    return this;
  }

  /**
   * The list of bill items.
   * @return billItem
   **/
  @Schema(required = true, description = "The list of bill items.")
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
    ServicesAndBillItems servicesAndBillItems = (ServicesAndBillItems) o;
    return Objects.equals(this.extension, servicesAndBillItems.extension) &&
        Objects.equals(this.id, servicesAndBillItems.id) &&
        Objects.equals(this.accountRef, servicesAndBillItems.accountRef) &&
        Objects.equals(this.deviceID, servicesAndBillItems.deviceID) &&
        Objects.equals(this.serviceID, servicesAndBillItems.serviceID) &&
        Objects.equals(this.serviceType, servicesAndBillItems.serviceType) &&
        Objects.equals(this.firstName, servicesAndBillItems.firstName) &&
        Objects.equals(this.lastName, servicesAndBillItems.lastName) &&
        Objects.equals(this.accountNumber, servicesAndBillItems.accountNumber) &&
        Objects.equals(this.billItem, servicesAndBillItems.billItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, accountRef, deviceID, serviceID, serviceType, firstName, lastName, accountNumber, billItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesAndBillItems {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    deviceID: ").append(toIndentedString(deviceID)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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
