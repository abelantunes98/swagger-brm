package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An A/R action.
 */
@Schema(description = "An A/R action.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ArActionsList   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("arActionType")
  private Integer arActionType = null;

  @JsonProperty("arActionAmount")
  private BigDecimal arActionAmount = null;

  @JsonProperty("arUnallocatedAmount")
  private BigDecimal arUnallocatedAmount = null;

  @JsonProperty("arActionId")
  private String arActionId = null;

  @JsonProperty("arActionRef")
  private ResourceRef arActionRef = null;

  @JsonProperty("billUnitName")
  private String billUnitName = null;

  @JsonProperty("billID")
  private String billID = null;

  @JsonProperty("itemName")
  private String itemName = null;

  @JsonProperty("billingStatus")
  private Integer billingStatus = null;

  public ArActionsList extension(Object extension) {
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

  public ArActionsList accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number.
   * @return accountNumber
   **/
  @Schema(description = "The account number.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ArActionsList firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The customer's first name.
   * @return firstName
   **/
  @Schema(description = "The customer's first name.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ArActionsList lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The customer's last name.
   * @return lastName
   **/
  @Schema(description = "The customer's last name.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ArActionsList effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the A/R action takes effect.
   * @return effectiveDate
   **/
  @Schema(description = "The date and time the A/R action takes effect.")
  
    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ArActionsList createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date and time the A/R action was created.
   * @return createdDate
   **/
  @Schema(description = "The date and time the A/R action was created.")
  
    @Valid
    public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ArActionsList arActionType(Integer arActionType) {
    this.arActionType = arActionType;
    return this;
  }

  /**
   * The type of A/R action: item adjustment (<b>0</b>), event adjustment (<b>1</b>), bill adjustment (<b>2</b>), account adjustment (<b>3</b>), refund (<b>4</b>), open item dispute (<b>6</b>), settled item dispute (<b>7</b>), item payment (<b>8</b>), open event dispute (<b>9</b>), settled event dispute (<b>10</b>), open bill dispute (<b>11</b>), settled bill dispute (<b>12</b>), account writeoff (<b>13</b>), bill writeoff (<b>14</b>), or item writeoff (<b>15</b>).
   * @return arActionType
   **/
  @Schema(description = "The type of A/R action: item adjustment (<b>0</b>), event adjustment (<b>1</b>), bill adjustment (<b>2</b>), account adjustment (<b>3</b>), refund (<b>4</b>), open item dispute (<b>6</b>), settled item dispute (<b>7</b>), item payment (<b>8</b>), open event dispute (<b>9</b>), settled event dispute (<b>10</b>), open bill dispute (<b>11</b>), settled bill dispute (<b>12</b>), account writeoff (<b>13</b>), bill writeoff (<b>14</b>), or item writeoff (<b>15</b>).")
  
    public Integer getArActionType() {
    return arActionType;
  }

  public void setArActionType(Integer arActionType) {
    this.arActionType = arActionType;
  }

  public ArActionsList arActionAmount(BigDecimal arActionAmount) {
    this.arActionAmount = arActionAmount;
    return this;
  }

  /**
   * The amount associated with the A/R action.
   * @return arActionAmount
   **/
  @Schema(required = true, description = "The amount associated with the A/R action.")
      @NotNull

    @Valid
    public BigDecimal getArActionAmount() {
    return arActionAmount;
  }

  public void setArActionAmount(BigDecimal arActionAmount) {
    this.arActionAmount = arActionAmount;
  }

  public ArActionsList arUnallocatedAmount(BigDecimal arUnallocatedAmount) {
    this.arUnallocatedAmount = arUnallocatedAmount;
    return this;
  }

  /**
   * The amount that is still unallocated.
   * @return arUnallocatedAmount
   **/
  @Schema(description = "The amount that is still unallocated.")
  
    @Valid
    public BigDecimal getArUnallocatedAmount() {
    return arUnallocatedAmount;
  }

  public void setArUnallocatedAmount(BigDecimal arUnallocatedAmount) {
    this.arUnallocatedAmount = arUnallocatedAmount;
  }

  public ArActionsList arActionId(String arActionId) {
    this.arActionId = arActionId;
    return this;
  }

  /**
   * The ID of the A/R action.
   * @return arActionId
   **/
  @Schema(description = "The ID of the A/R action.")
  
    public String getArActionId() {
    return arActionId;
  }

  public void setArActionId(String arActionId) {
    this.arActionId = arActionId;
  }

  public ArActionsList arActionRef(ResourceRef arActionRef) {
    this.arActionRef = arActionRef;
    return this;
  }

  /**
   * Get arActionRef
   * @return arActionRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getArActionRef() {
    return arActionRef;
  }

  public void setArActionRef(ResourceRef arActionRef) {
    this.arActionRef = arActionRef;
  }

  public ArActionsList billUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
    return this;
  }

  /**
   * The name of the bill unit.
   * @return billUnitName
   **/
  @Schema(description = "The name of the bill unit.")
  
    public String getBillUnitName() {
    return billUnitName;
  }

  public void setBillUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
  }

  public ArActionsList billID(String billID) {
    this.billID = billID;
    return this;
  }

  /**
   * The ID of the bill.
   * @return billID
   **/
  @Schema(description = "The ID of the bill.")
  
    public String getBillID() {
    return billID;
  }

  public void setBillID(String billID) {
    this.billID = billID;
  }

  public ArActionsList itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * The item name.
   * @return itemName
   **/
  @Schema(description = "The item name.")
  
    public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public ArActionsList billingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
    return this;
  }

  /**
   * The billing status&colon; billed (<b>1</b>) or unbilled (<b>2</b>).
   * @return billingStatus
   **/
  @Schema(description = "The billing status&colon; billed (<b>1</b>) or unbilled (<b>2</b>).")
  
    public Integer getBillingStatus() {
    return billingStatus;
  }

  public void setBillingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArActionsList arActionsList = (ArActionsList) o;
    return Objects.equals(this.extension, arActionsList.extension) &&
        Objects.equals(this.accountNumber, arActionsList.accountNumber) &&
        Objects.equals(this.firstName, arActionsList.firstName) &&
        Objects.equals(this.lastName, arActionsList.lastName) &&
        Objects.equals(this.effectiveDate, arActionsList.effectiveDate) &&
        Objects.equals(this.createdDate, arActionsList.createdDate) &&
        Objects.equals(this.arActionType, arActionsList.arActionType) &&
        Objects.equals(this.arActionAmount, arActionsList.arActionAmount) &&
        Objects.equals(this.arUnallocatedAmount, arActionsList.arUnallocatedAmount) &&
        Objects.equals(this.arActionId, arActionsList.arActionId) &&
        Objects.equals(this.arActionRef, arActionsList.arActionRef) &&
        Objects.equals(this.billUnitName, arActionsList.billUnitName) &&
        Objects.equals(this.billID, arActionsList.billID) &&
        Objects.equals(this.itemName, arActionsList.itemName) &&
        Objects.equals(this.billingStatus, arActionsList.billingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountNumber, firstName, lastName, effectiveDate, createdDate, arActionType, arActionAmount, arUnallocatedAmount, arActionId, arActionRef, billUnitName, billID, itemName, billingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArActionsList {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    arActionType: ").append(toIndentedString(arActionType)).append("\n");
    sb.append("    arActionAmount: ").append(toIndentedString(arActionAmount)).append("\n");
    sb.append("    arUnallocatedAmount: ").append(toIndentedString(arUnallocatedAmount)).append("\n");
    sb.append("    arActionId: ").append(toIndentedString(arActionId)).append("\n");
    sb.append("    arActionRef: ").append(toIndentedString(arActionRef)).append("\n");
    sb.append("    billUnitName: ").append(toIndentedString(billUnitName)).append("\n");
    sb.append("    billID: ").append(toIndentedString(billID)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    billingStatus: ").append(toIndentedString(billingStatus)).append("\n");
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
