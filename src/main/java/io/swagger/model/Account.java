package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillUnit;
import io.swagger.model.Contacts;
import io.swagger.model.ResourceRef;
import io.swagger.model.Wallet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An account.
 */
@Schema(description = "An account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Account   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("pendingDeferredActionsCount")
  private Integer pendingDeferredActionsCount = null;

  @JsonProperty("customerDurationDays")
  private Integer customerDurationDays = null;

  @JsonProperty("customerDurationYears")
  private Integer customerDurationYears = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("accountFirstName")
  private String accountFirstName = null;

  @JsonProperty("accountLastName")
  private String accountLastName = null;

  @JsonProperty("securityCode1")
  private String securityCode1 = null;

  @JsonProperty("securityCode2")
  private String securityCode2 = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("currencySecondary")
  private Integer currencySecondary = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("balanceGroupRef")
  private ResourceRef balanceGroupRef = null;

  @JsonProperty("customerTypeCode")
  private Integer customerTypeCode = null;

  @JsonProperty("organizationHierarchyTypeCode")
  private Integer organizationHierarchyTypeCode = null;

  @JsonProperty("businessType")
  private String businessType = null;

  @JsonProperty("parentRef")
  private ResourceRef parentRef = null;

  @JsonProperty("contacts")
  @Valid
  private List<Contacts> contacts = new ArrayList<Contacts>();

  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("timezoneId")
  private String timezoneId = null;

  @JsonProperty("wallet")
  private Wallet wallet = null;

  @JsonProperty("billUnit")
  @Valid
  private List<BillUnit> billUnit = new ArrayList<BillUnit>();

  public Account extension(Object extension) {
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

  public Account id(String id) {
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

  public Account creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the account was created.
   * @return creationDate
   **/
  @Schema(required = true, description = "The date and time the account was created.")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Account pendingDeferredActionsCount(Integer pendingDeferredActionsCount) {
    this.pendingDeferredActionsCount = pendingDeferredActionsCount;
    return this;
  }

  /**
   * The number of deferred actions in pending state.
   * @return pendingDeferredActionsCount
   **/
  @Schema(description = "The number of deferred actions in pending state.")
  
    public Integer getPendingDeferredActionsCount() {
    return pendingDeferredActionsCount;
  }

  public void setPendingDeferredActionsCount(Integer pendingDeferredActionsCount) {
    this.pendingDeferredActionsCount = pendingDeferredActionsCount;
  }

  public Account customerDurationDays(Integer customerDurationDays) {
    this.customerDurationDays = customerDurationDays;
    return this;
  }

  /**
   * The number of days that the account has been a customer.
   * @return customerDurationDays
   **/
  @Schema(description = "The number of days that the account has been a customer.")
  
    public Integer getCustomerDurationDays() {
    return customerDurationDays;
  }

  public void setCustomerDurationDays(Integer customerDurationDays) {
    this.customerDurationDays = customerDurationDays;
  }

  public Account customerDurationYears(Integer customerDurationYears) {
    this.customerDurationYears = customerDurationYears;
    return this;
  }

  /**
   * The number of years that the account has been a customer.
   * @return customerDurationYears
   **/
  @Schema(description = "The number of years that the account has been a customer.")
  
    public Integer getCustomerDurationYears() {
    return customerDurationYears;
  }

  public void setCustomerDurationYears(Integer customerDurationYears) {
    this.customerDurationYears = customerDurationYears;
  }

  public Account accountNumber(String accountNumber) {
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

  public Account accountFirstName(String accountFirstName) {
    this.accountFirstName = accountFirstName;
    return this;
  }

  /**
   * The account owner's first name.
   * @return accountFirstName
   **/
  @Schema(description = "The account owner's first name.")
  
    public String getAccountFirstName() {
    return accountFirstName;
  }

  public void setAccountFirstName(String accountFirstName) {
    this.accountFirstName = accountFirstName;
  }

  public Account accountLastName(String accountLastName) {
    this.accountLastName = accountLastName;
    return this;
  }

  /**
   * The account owner's last name.
   * @return accountLastName
   **/
  @Schema(description = "The account owner's last name.")
  
    public String getAccountLastName() {
    return accountLastName;
  }

  public void setAccountLastName(String accountLastName) {
    this.accountLastName = accountLastName;
  }

  public Account securityCode1(String securityCode1) {
    this.securityCode1 = securityCode1;
    return this;
  }

  /**
   * The first access code for voice verification.
   * @return securityCode1
   **/
  @Schema(description = "The first access code for voice verification.")
  
    public String getSecurityCode1() {
    return securityCode1;
  }

  public void setSecurityCode1(String securityCode1) {
    this.securityCode1 = securityCode1;
  }

  public Account securityCode2(String securityCode2) {
    this.securityCode2 = securityCode2;
    return this;
  }

  /**
   * The second access code for voice verification.
   * @return securityCode2
   **/
  @Schema(description = "The second access code for voice verification.")
  
    public String getSecurityCode2() {
    return securityCode2;
  }

  public void setSecurityCode2(String securityCode2) {
    this.securityCode2 = securityCode2;
  }

  public Account currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The code for the account's primary currency.
   * @return currency
   **/
  @Schema(description = "The code for the account's primary currency.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public Account currencySecondary(Integer currencySecondary) {
    this.currencySecondary = currencySecondary;
    return this;
  }

  /**
   * The account's secondary currency.
   * @return currencySecondary
   **/
  @Schema(description = "The account's secondary currency.")
  
    public Integer getCurrencySecondary() {
    return currencySecondary;
  }

  public void setCurrencySecondary(Integer currencySecondary) {
    this.currencySecondary = currencySecondary;
  }

  public Account locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The customer's locale, such as <b>en_US</b> or <b>fr_FR</b>. For a list of valid values, see \"Locale Names\" in <i>BRM Developer's Guide</i>.
   * @return locale
   **/
  @Schema(description = "The customer's locale, such as <b>en_US</b> or <b>fr_FR</b>. For a list of valid values, see \"Locale Names\" in <i>BRM Developer's Guide</i>.")
  
    public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public Account balanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
    return this;
  }

  /**
   * Get balanceGroupRef
   * @return balanceGroupRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBalanceGroupRef() {
    return balanceGroupRef;
  }

  public void setBalanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
  }

  public Account customerTypeCode(Integer customerTypeCode) {
    this.customerTypeCode = customerTypeCode;
    return this;
  }

  /**
   * The customer type: standard(<b>1</b>), brand (<b>2</b>), or subscription (<b>3</b>).
   * @return customerTypeCode
   **/
  @Schema(description = "The customer type: standard(<b>1</b>), brand (<b>2</b>), or subscription (<b>3</b>).")
  
    public Integer getCustomerTypeCode() {
    return customerTypeCode;
  }

  public void setCustomerTypeCode(Integer customerTypeCode) {
    this.customerTypeCode = customerTypeCode;
  }

  public Account organizationHierarchyTypeCode(Integer organizationHierarchyTypeCode) {
    this.organizationHierarchyTypeCode = organizationHierarchyTypeCode;
    return this;
  }

  /**
   * The internal code for the account's organization hierarchy type.
   * @return organizationHierarchyTypeCode
   **/
  @Schema(description = "The internal code for the account's organization hierarchy type.")
  
    public Integer getOrganizationHierarchyTypeCode() {
    return organizationHierarchyTypeCode;
  }

  public void setOrganizationHierarchyTypeCode(Integer organizationHierarchyTypeCode) {
    this.organizationHierarchyTypeCode = organizationHierarchyTypeCode;
  }

  public Account businessType(String businessType) {
    this.businessType = businessType;
    return this;
  }

  /**
   * The account's business type: consumer (<b>1</b>) or business (<b>2</b>).
   * @return businessType
   **/
  @Schema(description = "The account's business type: consumer (<b>1</b>) or business (<b>2</b>).")
  
    public String getBusinessType() {
    return businessType;
  }

  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }

  public Account parentRef(ResourceRef parentRef) {
    this.parentRef = parentRef;
    return this;
  }

  /**
   * Get parentRef
   * @return parentRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getParentRef() {
    return parentRef;
  }

  public void setParentRef(ResourceRef parentRef) {
    this.parentRef = parentRef;
  }

  public Account contacts(List<Contacts> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Account addContactsItem(Contacts contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * An account's contact information.
   * @return contacts
   **/
  @Schema(required = true, description = "An account's contact information.")
      @NotNull
    @Valid
    public List<Contacts> getContacts() {
    return contacts;
  }

  public void setContacts(List<Contacts> contacts) {
    this.contacts = contacts;
  }

  public Account statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The code for the account's status: defunct (<b>0</b>), active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>).
   * @return statusCode
   **/
  @Schema(description = "The code for the account's status: defunct (<b>0</b>), active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>).")
  
    public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public Account timezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  /**
   * The ID of the account's time zone.
   * @return timezoneId
   **/
  @Schema(description = "The ID of the account's time zone.")
  
    public String getTimezoneId() {
    return timezoneId;
  }

  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }

  public Account wallet(Wallet wallet) {
    this.wallet = wallet;
    return this;
  }

  /**
   * Get wallet
   * @return wallet
   **/
  @Schema(description = "")
  
    @Valid
    public Wallet getWallet() {
    return wallet;
  }

  public void setWallet(Wallet wallet) {
    this.wallet = wallet;
  }

  public Account billUnit(List<BillUnit> billUnit) {
    this.billUnit = billUnit;
    return this;
  }

  public Account addBillUnitItem(BillUnit billUnitItem) {
    this.billUnit.add(billUnitItem);
    return this;
  }

  /**
   * The list of bill units associated with the account.
   * @return billUnit
   **/
  @Schema(required = true, description = "The list of bill units associated with the account.")
      @NotNull
    @Valid
    public List<BillUnit> getBillUnit() {
    return billUnit;
  }

  public void setBillUnit(List<BillUnit> billUnit) {
    this.billUnit = billUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.extension, account.extension) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.creationDate, account.creationDate) &&
        Objects.equals(this.pendingDeferredActionsCount, account.pendingDeferredActionsCount) &&
        Objects.equals(this.customerDurationDays, account.customerDurationDays) &&
        Objects.equals(this.customerDurationYears, account.customerDurationYears) &&
        Objects.equals(this.accountNumber, account.accountNumber) &&
        Objects.equals(this.accountFirstName, account.accountFirstName) &&
        Objects.equals(this.accountLastName, account.accountLastName) &&
        Objects.equals(this.securityCode1, account.securityCode1) &&
        Objects.equals(this.securityCode2, account.securityCode2) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.currencySecondary, account.currencySecondary) &&
        Objects.equals(this.locale, account.locale) &&
        Objects.equals(this.balanceGroupRef, account.balanceGroupRef) &&
        Objects.equals(this.customerTypeCode, account.customerTypeCode) &&
        Objects.equals(this.organizationHierarchyTypeCode, account.organizationHierarchyTypeCode) &&
        Objects.equals(this.businessType, account.businessType) &&
        Objects.equals(this.parentRef, account.parentRef) &&
        Objects.equals(this.contacts, account.contacts) &&
        Objects.equals(this.statusCode, account.statusCode) &&
        Objects.equals(this.timezoneId, account.timezoneId) &&
        Objects.equals(this.wallet, account.wallet) &&
        Objects.equals(this.billUnit, account.billUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, creationDate, pendingDeferredActionsCount, customerDurationDays, customerDurationYears, accountNumber, accountFirstName, accountLastName, securityCode1, securityCode2, currency, currencySecondary, locale, balanceGroupRef, customerTypeCode, organizationHierarchyTypeCode, businessType, parentRef, contacts, statusCode, timezoneId, wallet, billUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    pendingDeferredActionsCount: ").append(toIndentedString(pendingDeferredActionsCount)).append("\n");
    sb.append("    customerDurationDays: ").append(toIndentedString(customerDurationDays)).append("\n");
    sb.append("    customerDurationYears: ").append(toIndentedString(customerDurationYears)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountFirstName: ").append(toIndentedString(accountFirstName)).append("\n");
    sb.append("    accountLastName: ").append(toIndentedString(accountLastName)).append("\n");
    sb.append("    securityCode1: ").append(toIndentedString(securityCode1)).append("\n");
    sb.append("    securityCode2: ").append(toIndentedString(securityCode2)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencySecondary: ").append(toIndentedString(currencySecondary)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    balanceGroupRef: ").append(toIndentedString(balanceGroupRef)).append("\n");
    sb.append("    customerTypeCode: ").append(toIndentedString(customerTypeCode)).append("\n");
    sb.append("    organizationHierarchyTypeCode: ").append(toIndentedString(organizationHierarchyTypeCode)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    billUnit: ").append(toIndentedString(billUnit)).append("\n");
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
