package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AliasList;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bill item.
 */
@Schema(description = "A bill item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillItem   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("arBillinfoRef")
  private ResourceRef arBillinfoRef = null;

  @JsonProperty("arBillRef")
  private ResourceRef arBillRef = null;

  @JsonProperty("billRef")
  private ResourceRef billRef = null;

  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("billinfoRef")
  private ResourceRef billinfoRef = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("closedDate")
  private OffsetDateTime closedDate = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("deltaDue")
  private BigDecimal deltaDue = null;

  @JsonProperty("disputed")
  private BigDecimal disputed = null;

  @JsonProperty("adjusted")
  private BigDecimal adjusted = null;

  @JsonProperty("due")
  private BigDecimal due = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("itemNo")
  private String itemNo = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("received")
  private BigDecimal received = null;

  @JsonProperty("transfered")
  private BigDecimal transfered = null;

  @JsonProperty("writeoff")
  private BigDecimal writeoff = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("discount")
  private BigDecimal discount = null;

  @JsonProperty("billNo")
  private String billNo = null;

  @JsonProperty("billInfoId")
  private String billInfoId = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("serviceTypeName")
  private String serviceTypeName = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("aliasList")
  @Valid
  private List<AliasList> aliasList = null;

  @JsonProperty("status")
  private String status = null;

  public BillItem extension(Object extension) {
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

  public BillItem id(String id) {
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

  public BillItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The bill item's name.
   * @return name
   **/
  @Schema(description = "The bill item's name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The bill item's type.
   * @return type
   **/
  @Schema(description = "The bill item's type.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BillItem accountRef(ResourceRef accountRef) {
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

  public BillItem arBillinfoRef(ResourceRef arBillinfoRef) {
    this.arBillinfoRef = arBillinfoRef;
    return this;
  }

  /**
   * Get arBillinfoRef
   * @return arBillinfoRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getArBillinfoRef() {
    return arBillinfoRef;
  }

  public void setArBillinfoRef(ResourceRef arBillinfoRef) {
    this.arBillinfoRef = arBillinfoRef;
  }

  public BillItem arBillRef(ResourceRef arBillRef) {
    this.arBillRef = arBillRef;
    return this;
  }

  /**
   * Get arBillRef
   * @return arBillRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getArBillRef() {
    return arBillRef;
  }

  public void setArBillRef(ResourceRef arBillRef) {
    this.arBillRef = arBillRef;
  }

  public BillItem billRef(ResourceRef billRef) {
    this.billRef = billRef;
    return this;
  }

  /**
   * Get billRef
   * @return billRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBillRef() {
    return billRef;
  }

  public void setBillRef(ResourceRef billRef) {
    this.billRef = billRef;
  }

  public BillItem serviceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
    return this;
  }

  /**
   * Get serviceRef
   * @return serviceRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getServiceRef() {
    return serviceRef;
  }

  public void setServiceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
  }

  public BillItem billinfoRef(ResourceRef billinfoRef) {
    this.billinfoRef = billinfoRef;
    return this;
  }

  /**
   * Get billinfoRef
   * @return billinfoRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBillinfoRef() {
    return billinfoRef;
  }

  public void setBillinfoRef(ResourceRef billinfoRef) {
    this.billinfoRef = billinfoRef;
  }

  public BillItem creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the bill item was created.
   * @return creationDate
   **/
  @Schema(description = "The date and time the bill item was created.")
  
    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public BillItem closedDate(OffsetDateTime closedDate) {
    this.closedDate = closedDate;
    return this;
  }

  /**
   * The date and time the bill item was closed. If the bill item is reopened for an adjustment, this is reset until the bill item is closed again.
   * @return closedDate
   **/
  @Schema(description = "The date and time the bill item was closed. If the bill item is reopened for an adjustment, this is reset until the bill item is closed again.")
  
    @Valid
    public OffsetDateTime getClosedDate() {
    return closedDate;
  }

  public void setClosedDate(OffsetDateTime closedDate) {
    this.closedDate = closedDate;
  }

  public BillItem currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency for the bill item, copied from the currency of the associated account.
   * @return currency
   **/
  @Schema(description = "The currency for the bill item, copied from the currency of the associated account.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public BillItem deltaDue(BigDecimal deltaDue) {
    this.deltaDue = deltaDue;
    return this;
  }

  /**
   * The delta amount due.
   * @return deltaDue
   **/
  @Schema(description = "The delta amount due.")
  
    @Valid
    public BigDecimal getDeltaDue() {
    return deltaDue;
  }

  public void setDeltaDue(BigDecimal deltaDue) {
    this.deltaDue = deltaDue;
  }

  public BillItem disputed(BigDecimal disputed) {
    this.disputed = disputed;
    return this;
  }

  /**
   * The total amount from disputes associated with the bill item.
   * @return disputed
   **/
  @Schema(description = "The total amount from disputes associated with the bill item.")
  
    @Valid
    public BigDecimal getDisputed() {
    return disputed;
  }

  public void setDisputed(BigDecimal disputed) {
    this.disputed = disputed;
  }

  public BillItem adjusted(BigDecimal adjusted) {
    this.adjusted = adjusted;
    return this;
  }

  /**
   * The total amount from debit and credit adjustments made to the bill item.
   * @return adjusted
   **/
  @Schema(description = "The total amount from debit and credit adjustments made to the bill item.")
  
    @Valid
    public BigDecimal getAdjusted() {
    return adjusted;
  }

  public void setAdjusted(BigDecimal adjusted) {
    this.adjusted = adjusted;
  }

  public BillItem due(BigDecimal due) {
    this.due = due;
    return this;
  }

  /**
   * The amount due for the bill item.
   * @return due
   **/
  @Schema(description = "The amount due for the bill item.")
  
    @Valid
    public BigDecimal getDue() {
    return due;
  }

  public void setDue(BigDecimal due) {
    this.due = due;
  }

  public BillItem dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The date when the amount in the bill item is due.
   * @return dueDate
   **/
  @Schema(description = "The date when the amount in the bill item is due.")
  
    @Valid
    public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public BillItem itemNo(String itemNo) {
    this.itemNo = itemNo;
    return this;
  }

  /**
   * The bill item's number.
   * @return itemNo
   **/
  @Schema(description = "The bill item's number.")
  
    public String getItemNo() {
    return itemNo;
  }

  public void setItemNo(String itemNo) {
    this.itemNo = itemNo;
  }

  public BillItem login(String login) {
    this.login = login;
    return this;
  }

  /**
   * The username associated with the bill item.
   * @return login
   **/
  @Schema(description = "The username associated with the bill item.")
  
    public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public BillItem received(BigDecimal received) {
    this.received = received;
    return this;
  }

  /**
   * The amount of payments or credits applied to the bill item.
   * @return received
   **/
  @Schema(description = "The amount of payments or credits applied to the bill item.")
  
    @Valid
    public BigDecimal getReceived() {
    return received;
  }

  public void setReceived(BigDecimal received) {
    this.received = received;
  }

  public BillItem transfered(BigDecimal transfered) {
    this.transfered = transfered;
    return this;
  }

  /**
   * The amount transferred out of the bill item.
   * @return transfered
   **/
  @Schema(description = "The amount transferred out of the bill item.")
  
    @Valid
    public BigDecimal getTransfered() {
    return transfered;
  }

  public void setTransfered(BigDecimal transfered) {
    this.transfered = transfered;
  }

  public BillItem writeoff(BigDecimal writeoff) {
    this.writeoff = writeoff;
    return this;
  }

  /**
   * The amount written off for the bill item.
   * @return writeoff
   **/
  @Schema(description = "The amount written off for the bill item.")
  
    @Valid
    public BigDecimal getWriteoff() {
    return writeoff;
  }

  public void setWriteoff(BigDecimal writeoff) {
    this.writeoff = writeoff;
  }

  public BillItem amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the bill item.
   * @return amount
   **/
  @Schema(required = true, description = "The amount of the bill item.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BillItem discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

  /**
   * The amount discounted for the bill item.
   * @return discount
   **/
  @Schema(description = "The amount discounted for the bill item.")
  
    @Valid
    public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public BillItem billNo(String billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * The bill number.
   * @return billNo
   **/
  @Schema(description = "The bill number.")
  
    public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  public BillItem billInfoId(String billInfoId) {
    this.billInfoId = billInfoId;
    return this;
  }

  /**
   * The ID of the /billinfo object.
   * @return billInfoId
   **/
  @Schema(description = "The ID of the /billinfo object.")
  
    public String getBillInfoId() {
    return billInfoId;
  }

  public void setBillInfoId(String billInfoId) {
    this.billInfoId = billInfoId;
  }

  public BillItem accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * The name of the account.
   * @return accountName
   **/
  @Schema(description = "The name of the account.")
  
    public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public BillItem firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the account holder.
   * @return firstName
   **/
  @Schema(description = "The first name of the account holder.")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public BillItem lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the account holder.
   * @return lastName
   **/
  @Schema(description = "The last name of the account holder.")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public BillItem serviceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
    return this;
  }

  /**
   * The name of the service type.
   * @return serviceTypeName
   **/
  @Schema(description = "The name of the service type.")
  
    public String getServiceTypeName() {
    return serviceTypeName;
  }

  public void setServiceTypeName(String serviceTypeName) {
    this.serviceTypeName = serviceTypeName;
  }

  public BillItem accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the bill item.
   * @return accountNumber
   **/
  @Schema(description = "The account number associated with the bill item.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BillItem aliasList(List<AliasList> aliasList) {
    this.aliasList = aliasList;
    return this;
  }

  public BillItem addAliasListItem(AliasList aliasListItem) {
    if (this.aliasList == null) {
      this.aliasList = new ArrayList<AliasList>();
    }
    this.aliasList.add(aliasListItem);
    return this;
  }

  /**
   * The list of aliases in the bill item.
   * @return aliasList
   **/
  @Schema(description = "The list of aliases in the bill item.")
      @Valid
    public List<AliasList> getAliasList() {
    return aliasList;
  }

  public void setAliasList(List<AliasList> aliasList) {
    this.aliasList = aliasList;
  }

  public BillItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the bill item: active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>)
   * @return status
   **/
  @Schema(description = "The status of the bill item: active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>)")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillItem billItem = (BillItem) o;
    return Objects.equals(this.extension, billItem.extension) &&
        Objects.equals(this.id, billItem.id) &&
        Objects.equals(this.name, billItem.name) &&
        Objects.equals(this.type, billItem.type) &&
        Objects.equals(this.accountRef, billItem.accountRef) &&
        Objects.equals(this.arBillinfoRef, billItem.arBillinfoRef) &&
        Objects.equals(this.arBillRef, billItem.arBillRef) &&
        Objects.equals(this.billRef, billItem.billRef) &&
        Objects.equals(this.serviceRef, billItem.serviceRef) &&
        Objects.equals(this.billinfoRef, billItem.billinfoRef) &&
        Objects.equals(this.creationDate, billItem.creationDate) &&
        Objects.equals(this.closedDate, billItem.closedDate) &&
        Objects.equals(this.currency, billItem.currency) &&
        Objects.equals(this.deltaDue, billItem.deltaDue) &&
        Objects.equals(this.disputed, billItem.disputed) &&
        Objects.equals(this.adjusted, billItem.adjusted) &&
        Objects.equals(this.due, billItem.due) &&
        Objects.equals(this.dueDate, billItem.dueDate) &&
        Objects.equals(this.itemNo, billItem.itemNo) &&
        Objects.equals(this.login, billItem.login) &&
        Objects.equals(this.received, billItem.received) &&
        Objects.equals(this.transfered, billItem.transfered) &&
        Objects.equals(this.writeoff, billItem.writeoff) &&
        Objects.equals(this.amount, billItem.amount) &&
        Objects.equals(this.discount, billItem.discount) &&
        Objects.equals(this.billNo, billItem.billNo) &&
        Objects.equals(this.billInfoId, billItem.billInfoId) &&
        Objects.equals(this.accountName, billItem.accountName) &&
        Objects.equals(this.firstName, billItem.firstName) &&
        Objects.equals(this.lastName, billItem.lastName) &&
        Objects.equals(this.serviceTypeName, billItem.serviceTypeName) &&
        Objects.equals(this.accountNumber, billItem.accountNumber) &&
        Objects.equals(this.aliasList, billItem.aliasList) &&
        Objects.equals(this.status, billItem.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, name, type, accountRef, arBillinfoRef, arBillRef, billRef, serviceRef, billinfoRef, creationDate, closedDate, currency, deltaDue, disputed, adjusted, due, dueDate, itemNo, login, received, transfered, writeoff, amount, discount, billNo, billInfoId, accountName, firstName, lastName, serviceTypeName, accountNumber, aliasList, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillItem {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    arBillinfoRef: ").append(toIndentedString(arBillinfoRef)).append("\n");
    sb.append("    arBillRef: ").append(toIndentedString(arBillRef)).append("\n");
    sb.append("    billRef: ").append(toIndentedString(billRef)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    billinfoRef: ").append(toIndentedString(billinfoRef)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    deltaDue: ").append(toIndentedString(deltaDue)).append("\n");
    sb.append("    disputed: ").append(toIndentedString(disputed)).append("\n");
    sb.append("    adjusted: ").append(toIndentedString(adjusted)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    itemNo: ").append(toIndentedString(itemNo)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    transfered: ").append(toIndentedString(transfered)).append("\n");
    sb.append("    writeoff: ").append(toIndentedString(writeoff)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    billInfoId: ").append(toIndentedString(billInfoId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    aliasList: ").append(toIndentedString(aliasList)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
