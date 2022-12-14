package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Contacts;
import io.swagger.model.CustomizedBundleForPurchase;
import io.swagger.model.NewBillUnits;
import io.swagger.model.Notes;
import io.swagger.model.PaymentMethod;
import io.swagger.model.ProfileBase;
import io.swagger.model.PurchasingService;
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
 * RegistrationAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class RegistrationAccount   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("contacts")
  @Valid
  private List<Contacts> contacts = new ArrayList<Contacts>();

  @JsonProperty("securityCode1")
  private String securityCode1 = null;

  @JsonProperty("securityCode2")
  private String securityCode2 = null;

  @JsonProperty("parentRef")
  private ResourceRef parentRef = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("timezoneId")
  private String timezoneId = null;

  @JsonProperty("purchasingPlanRef")
  private String purchasingPlanRef = null;

  @JsonProperty("services")
  @Valid
  private List<PurchasingService> services = new ArrayList<PurchasingService>();

  @JsonProperty("genericBundle")
  private CustomizedBundleForPurchase genericBundle = null;

  @JsonProperty("customerTypeCode")
  private Integer customerTypeCode = null;

  @JsonProperty("organizationHierarchyTypeCode")
  private Integer organizationHierarchyTypeCode = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("businessType")
  private Integer businessType = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("wallet")
  private Wallet wallet = null;

  @JsonProperty("billUnits")
  @Valid
  private List<NewBillUnits> billUnits = null;

  @JsonProperty("profiles")
  @Valid
  private List<ProfileBase> profiles = null;

  @JsonProperty("paymentType")
  private Integer paymentType = null;

  @JsonProperty("paymentMethod")
  @Valid
  private List<PaymentMethod> paymentMethod = null;

  public RegistrationAccount extension(Object extension) {
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

  public RegistrationAccount contacts(List<Contacts> contacts) {
    this.contacts = contacts;
    return this;
  }

  public RegistrationAccount addContactsItem(Contacts contactsItem) {
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

  public RegistrationAccount securityCode1(String securityCode1) {
    this.securityCode1 = securityCode1;
    return this;
  }

  /**
   * A security code used to verify account access. This provides an authentication test for customer service requests.
   * @return securityCode1
   **/
  @Schema(description = "A security code used to verify account access. This provides an authentication test for customer service requests.")
  
    public String getSecurityCode1() {
    return securityCode1;
  }

  public void setSecurityCode1(String securityCode1) {
    this.securityCode1 = securityCode1;
  }

  public RegistrationAccount securityCode2(String securityCode2) {
    this.securityCode2 = securityCode2;
    return this;
  }

  /**
   * A security code used to verify account access. This provides an authentication test for customer service requests.
   * @return securityCode2
   **/
  @Schema(description = "A security code used to verify account access. This provides an authentication test for customer service requests.")
  
    public String getSecurityCode2() {
    return securityCode2;
  }

  public void setSecurityCode2(String securityCode2) {
    this.securityCode2 = securityCode2;
  }

  public RegistrationAccount parentRef(ResourceRef parentRef) {
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

  public RegistrationAccount locale(String locale) {
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

  public RegistrationAccount timezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  /**
   * The ID for the customer's timezone.
   * @return timezoneId
   **/
  @Schema(description = "The ID for the customer's timezone.")
  
    public String getTimezoneId() {
    return timezoneId;
  }

  public void setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
  }

  public RegistrationAccount purchasingPlanRef(String purchasingPlanRef) {
    this.purchasingPlanRef = purchasingPlanRef;
    return this;
  }

  /**
   * The resource for the purchased package, such as 0.0.0.1+-plan+49587.
   * @return purchasingPlanRef
   **/
  @Schema(description = "The resource for the purchased package, such as 0.0.0.1+-plan+49587.")
  
    public String getPurchasingPlanRef() {
    return purchasingPlanRef;
  }

  public void setPurchasingPlanRef(String purchasingPlanRef) {
    this.purchasingPlanRef = purchasingPlanRef;
  }

  public RegistrationAccount services(List<PurchasingService> services) {
    this.services = services;
    return this;
  }

  public RegistrationAccount addServicesItem(PurchasingService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The list of services associated with the account.
   * @return services
   **/
  @Schema(required = true, description = "The list of services associated with the account.")
      @NotNull
    @Valid
    public List<PurchasingService> getServices() {
    return services;
  }

  public void setServices(List<PurchasingService> services) {
    this.services = services;
  }

  public RegistrationAccount genericBundle(CustomizedBundleForPurchase genericBundle) {
    this.genericBundle = genericBundle;
    return this;
  }

  /**
   * Get genericBundle
   * @return genericBundle
   **/
  @Schema(description = "")
  
    @Valid
    public CustomizedBundleForPurchase getGenericBundle() {
    return genericBundle;
  }

  public void setGenericBundle(CustomizedBundleForPurchase genericBundle) {
    this.genericBundle = genericBundle;
  }

  public RegistrationAccount customerTypeCode(Integer customerTypeCode) {
    this.customerTypeCode = customerTypeCode;
    return this;
  }

  /**
   * The customer type: standard (<b>1</b>), brand (<b>2</b>), or subscription (<b>3</b>).
   * @return customerTypeCode
   **/
  @Schema(description = "The customer type: standard (<b>1</b>), brand (<b>2</b>), or subscription (<b>3</b>).")
  
    public Integer getCustomerTypeCode() {
    return customerTypeCode;
  }

  public void setCustomerTypeCode(Integer customerTypeCode) {
    this.customerTypeCode = customerTypeCode;
  }

  public RegistrationAccount organizationHierarchyTypeCode(Integer organizationHierarchyTypeCode) {
    this.organizationHierarchyTypeCode = organizationHierarchyTypeCode;
    return this;
  }

  /**
   * The code for the account organization hierarchy type, such as site or legal entity.
   * @return organizationHierarchyTypeCode
   **/
  @Schema(description = "The code for the account organization hierarchy type, such as site or legal entity.")
  
    public Integer getOrganizationHierarchyTypeCode() {
    return organizationHierarchyTypeCode;
  }

  public void setOrganizationHierarchyTypeCode(Integer organizationHierarchyTypeCode) {
    this.organizationHierarchyTypeCode = organizationHierarchyTypeCode;
  }

  public RegistrationAccount effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the account takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the account takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public RegistrationAccount notes(Notes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    @Valid
    public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }

  public RegistrationAccount businessType(Integer businessType) {
    this.businessType = businessType;
    return this;
  }

  /**
   * The business type: consumer (<b>1</b>) or business (<b>2</b>).
   * @return businessType
   **/
  @Schema(description = "The business type: consumer (<b>1</b>) or business (<b>2</b>).")
  
    public Integer getBusinessType() {
    return businessType;
  }

  public void setBusinessType(Integer businessType) {
    this.businessType = businessType;
  }

  public RegistrationAccount status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The account's status: active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>).
   * @return status
   **/
  @Schema(description = "The account's status: active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>).")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RegistrationAccount currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The account's primary currency.
   * @return currency
   **/
  @Schema(description = "The account's primary currency.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public RegistrationAccount wallet(Wallet wallet) {
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

  public RegistrationAccount billUnits(List<NewBillUnits> billUnits) {
    this.billUnits = billUnits;
    return this;
  }

  public RegistrationAccount addBillUnitsItem(NewBillUnits billUnitsItem) {
    if (this.billUnits == null) {
      this.billUnits = new ArrayList<NewBillUnits>();
    }
    this.billUnits.add(billUnitsItem);
    return this;
  }

  /**
   * The list of bill units associated with the new account.
   * @return billUnits
   **/
  @Schema(description = "The list of bill units associated with the new account.")
      @Valid
    public List<NewBillUnits> getBillUnits() {
    return billUnits;
  }

  public void setBillUnits(List<NewBillUnits> billUnits) {
    this.billUnits = billUnits;
  }

  public RegistrationAccount profiles(List<ProfileBase> profiles) {
    this.profiles = profiles;
    return this;
  }

  public RegistrationAccount addProfilesItem(ProfileBase profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<ProfileBase>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

  /**
   * The list of profiles associated with the account.
   * @return profiles
   **/
  @Schema(description = "The list of profiles associated with the account.")
      @Valid
    public List<ProfileBase> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<ProfileBase> profiles) {
    this.profiles = profiles;
  }

  public RegistrationAccount paymentType(Integer paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The payment type. Can be one of the following: <ul><li><b>10000</b>:Prepaid</li><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>
   * @return paymentType
   **/
  @Schema(description = "The payment type. Can be one of the following: <ul><li><b>10000</b>:Prepaid</li><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>")
  
    public Integer getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Integer paymentType) {
    this.paymentType = paymentType;
  }

  public RegistrationAccount paymentMethod(List<PaymentMethod> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public RegistrationAccount addPaymentMethodItem(PaymentMethod paymentMethodItem) {
    if (this.paymentMethod == null) {
      this.paymentMethod = new ArrayList<PaymentMethod>();
    }
    this.paymentMethod.add(paymentMethodItem);
    return this;
  }

  /**
   * The list of payment methods associated with the account.
   * @return paymentMethod
   **/
  @Schema(description = "The list of payment methods associated with the account.")
      @Valid
    public List<PaymentMethod> getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(List<PaymentMethod> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationAccount registrationAccount = (RegistrationAccount) o;
    return Objects.equals(this.extension, registrationAccount.extension) &&
        Objects.equals(this.contacts, registrationAccount.contacts) &&
        Objects.equals(this.securityCode1, registrationAccount.securityCode1) &&
        Objects.equals(this.securityCode2, registrationAccount.securityCode2) &&
        Objects.equals(this.parentRef, registrationAccount.parentRef) &&
        Objects.equals(this.locale, registrationAccount.locale) &&
        Objects.equals(this.timezoneId, registrationAccount.timezoneId) &&
        Objects.equals(this.purchasingPlanRef, registrationAccount.purchasingPlanRef) &&
        Objects.equals(this.services, registrationAccount.services) &&
        Objects.equals(this.genericBundle, registrationAccount.genericBundle) &&
        Objects.equals(this.customerTypeCode, registrationAccount.customerTypeCode) &&
        Objects.equals(this.organizationHierarchyTypeCode, registrationAccount.organizationHierarchyTypeCode) &&
        Objects.equals(this.effective, registrationAccount.effective) &&
        Objects.equals(this.notes, registrationAccount.notes) &&
        Objects.equals(this.businessType, registrationAccount.businessType) &&
        Objects.equals(this.status, registrationAccount.status) &&
        Objects.equals(this.currency, registrationAccount.currency) &&
        Objects.equals(this.wallet, registrationAccount.wallet) &&
        Objects.equals(this.billUnits, registrationAccount.billUnits) &&
        Objects.equals(this.profiles, registrationAccount.profiles) &&
        Objects.equals(this.paymentType, registrationAccount.paymentType) &&
        Objects.equals(this.paymentMethod, registrationAccount.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, contacts, securityCode1, securityCode2, parentRef, locale, timezoneId, purchasingPlanRef, services, genericBundle, customerTypeCode, organizationHierarchyTypeCode, effective, notes, businessType, status, currency, wallet, billUnits, profiles, paymentType, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationAccount {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    securityCode1: ").append(toIndentedString(securityCode1)).append("\n");
    sb.append("    securityCode2: ").append(toIndentedString(securityCode2)).append("\n");
    sb.append("    parentRef: ").append(toIndentedString(parentRef)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timezoneId: ").append(toIndentedString(timezoneId)).append("\n");
    sb.append("    purchasingPlanRef: ").append(toIndentedString(purchasingPlanRef)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    genericBundle: ").append(toIndentedString(genericBundle)).append("\n");
    sb.append("    customerTypeCode: ").append(toIndentedString(customerTypeCode)).append("\n");
    sb.append("    organizationHierarchyTypeCode: ").append(toIndentedString(organizationHierarchyTypeCode)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
    sb.append("    billUnits: ").append(toIndentedString(billUnits)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
