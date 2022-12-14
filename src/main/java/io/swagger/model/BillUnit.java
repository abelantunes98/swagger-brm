package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BalanceGroup;
import io.swagger.model.PaymentMethod;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bill unit.
 */
@Schema(description = "A bill unit.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillUnit   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("accountingCycleDom")
  private Integer accountingCycleDom = null;

  @JsonProperty("accountingType")
  private Integer accountingType = null;

  @JsonProperty("balanceGroups")
  @Valid
  private List<BalanceGroup> balanceGroups = new ArrayList<BalanceGroup>();

  @JsonProperty("paymentInstrumentRef")
  private ResourceRef paymentInstrumentRef = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("currencySecondary")
  private Integer currencySecondary = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("arBillUnitRef")
  private ResourceRef arBillUnitRef = null;

  @JsonProperty("parentBillUnitName")
  private String parentBillUnitName = null;

  @JsonProperty("parentAccountId")
  private String parentAccountId = null;

  @JsonProperty("parentFirstName")
  private String parentFirstName = null;

  @JsonProperty("parentLastName")
  private String parentLastName = null;

  @JsonProperty("parentCompanyName")
  private String parentCompanyName = null;

  @JsonProperty("parentSalutation")
  private String parentSalutation = null;

  @JsonProperty("parentAccountNumber")
  private String parentAccountNumber = null;

  @JsonProperty("invoiceTemplate")
  private String invoiceTemplate = null;

  @JsonProperty("businessProfile")
  private String businessProfile = null;

  @JsonProperty("wholesaleBilling")
  private String wholesaleBilling = null;

  @JsonProperty("correctiveInvoiceType")
  private Integer correctiveInvoiceType = null;

  @JsonProperty("lastModified")
  private OffsetDateTime lastModified = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("accountingCyclesUntilBillCycleEnds")
  private Integer accountingCyclesUntilBillCycleEnds = null;

  @JsonProperty("billForCurrentCycleRef")
  private ResourceRef billForCurrentCycleRef = null;

  @JsonProperty("defaultBillUnit")
  private Boolean defaultBillUnit = null;

  @JsonProperty("parentBillUnit")
  private Boolean parentBillUnit = null;

  @JsonProperty("billingFrequencyInMonths")
  private Integer billingFrequencyInMonths = null;

  @JsonProperty("accountingCycleStart")
  private OffsetDateTime accountingCycleStart = null;

  @JsonProperty("accountingCycleEnd")
  private OffsetDateTime accountingCycleEnd = null;

  @JsonProperty("lastActualBillRef")
  private ResourceRef lastActualBillRef = null;

  @JsonProperty("lastActualBillDate")
  private OffsetDateTime lastActualBillDate = null;

  @JsonProperty("lastBillFromBillingRef")
  private ResourceRef lastBillFromBillingRef = null;

  @JsonProperty("billingCycleStart")
  private OffsetDateTime billingCycleStart = null;

  @JsonProperty("billingCycleEnd")
  private OffsetDateTime billingCycleEnd = null;

  @JsonProperty("segment")
  private String segment = null;

  @JsonProperty("daysInBillCycle")
  private Integer daysInBillCycle = null;

  @JsonProperty("daysRemainingInBillCycle")
  private Integer daysRemainingInBillCycle = null;

  @JsonProperty("exemptFromCollections")
  private Integer exemptFromCollections = null;

  @JsonProperty("scenarioRef")
  private ResourceRef scenarioRef = null;

  @JsonProperty("numSuppressedCycles")
  private Integer numSuppressedCycles = null;

  @JsonProperty("suppressed")
  private Integer suppressed = null;

  @JsonProperty("suppressionCyclesLeft")
  private Integer suppressionCyclesLeft = null;

  @JsonProperty("collectionDate")
  private OffsetDateTime collectionDate = null;

  @JsonProperty("paymentInstrumentName")
  private String paymentInstrumentName = null;

  @JsonProperty("collectionDetailsRef")
  private ResourceRef collectionDetailsRef = null;

  @JsonProperty("inCollections")
  private Boolean inCollections = null;

  @JsonProperty("paymentMethod")
  private PaymentMethod paymentMethod = null;

  @JsonProperty("paymentType")
  private Integer paymentType = null;

  @JsonProperty("totalChildAccounts")
  private Integer totalChildAccounts = null;

  public BillUnit extension(Object extension) {
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

  public BillUnit id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The bill unit's ID.
   * @return id
   **/
  @Schema(required = true, description = "The bill unit's ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillUnit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The bill unit's name.
   * @return name
   **/
  @Schema(required = true, description = "The bill unit's name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillUnit accountRef(ResourceRef accountRef) {
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

  public BillUnit accountingCycleDom(Integer accountingCycleDom) {
    this.accountingCycleDom = accountingCycleDom;
    return this;
  }

  /**
   * The bill unit's accounting cycle day of month (DOM).
   * @return accountingCycleDom
   **/
  @Schema(description = "The bill unit's accounting cycle day of month (DOM).")
  
    public Integer getAccountingCycleDom() {
    return accountingCycleDom;
  }

  public void setAccountingCycleDom(Integer accountingCycleDom) {
    this.accountingCycleDom = accountingCycleDom;
  }

  public BillUnit accountingType(Integer accountingType) {
    this.accountingType = accountingType;
    return this;
  }

  /**
   * The bill unit's accounting type: open item (<b>1</b>) or balance forward (<b>2</b>).
   * @return accountingType
   **/
  @Schema(description = "The bill unit's accounting type: open item (<b>1</b>) or balance forward (<b>2</b>).")
  
    public Integer getAccountingType() {
    return accountingType;
  }

  public void setAccountingType(Integer accountingType) {
    this.accountingType = accountingType;
  }

  public BillUnit balanceGroups(List<BalanceGroup> balanceGroups) {
    this.balanceGroups = balanceGroups;
    return this;
  }

  public BillUnit addBalanceGroupsItem(BalanceGroup balanceGroupsItem) {
    this.balanceGroups.add(balanceGroupsItem);
    return this;
  }

  /**
   * The list of balance groups associated with the bill unit.
   * @return balanceGroups
   **/
  @Schema(required = true, description = "The list of balance groups associated with the bill unit.")
      @NotNull
    @Valid
    public List<BalanceGroup> getBalanceGroups() {
    return balanceGroups;
  }

  public void setBalanceGroups(List<BalanceGroup> balanceGroups) {
    this.balanceGroups = balanceGroups;
  }

  public BillUnit paymentInstrumentRef(ResourceRef paymentInstrumentRef) {
    this.paymentInstrumentRef = paymentInstrumentRef;
    return this;
  }

  /**
   * Get paymentInstrumentRef
   * @return paymentInstrumentRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentInstrumentRef() {
    return paymentInstrumentRef;
  }

  public void setPaymentInstrumentRef(ResourceRef paymentInstrumentRef) {
    this.paymentInstrumentRef = paymentInstrumentRef;
  }

  public BillUnit currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The bill unit's primary currency.
   * @return currency
   **/
  @Schema(description = "The bill unit's primary currency.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public BillUnit currencySecondary(Integer currencySecondary) {
    this.currencySecondary = currencySecondary;
    return this;
  }

  /**
   * The bill unit's secondary currency.
   * @return currencySecondary
   **/
  @Schema(description = "The bill unit's secondary currency.")
  
    public Integer getCurrencySecondary() {
    return currencySecondary;
  }

  public void setCurrencySecondary(Integer currencySecondary) {
    this.currencySecondary = currencySecondary;
  }

  public BillUnit status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the bill unit: defunct (<b>0</b>), active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>)
   * @return status
   **/
  @Schema(description = "The status of the bill unit: defunct (<b>0</b>), active (<b>10100</b>), inactive (<b>10102</b>), or closed (<b>10103</b>)")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BillUnit arBillUnitRef(ResourceRef arBillUnitRef) {
    this.arBillUnitRef = arBillUnitRef;
    return this;
  }

  /**
   * Get arBillUnitRef
   * @return arBillUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getArBillUnitRef() {
    return arBillUnitRef;
  }

  public void setArBillUnitRef(ResourceRef arBillUnitRef) {
    this.arBillUnitRef = arBillUnitRef;
  }

  public BillUnit parentBillUnitName(String parentBillUnitName) {
    this.parentBillUnitName = parentBillUnitName;
    return this;
  }

  /**
   * The name of this bill unit's parent bill unit.
   * @return parentBillUnitName
   **/
  @Schema(required = true, description = "The name of this bill unit's parent bill unit.")
      @NotNull

    public String getParentBillUnitName() {
    return parentBillUnitName;
  }

  public void setParentBillUnitName(String parentBillUnitName) {
    this.parentBillUnitName = parentBillUnitName;
  }

  public BillUnit parentAccountId(String parentAccountId) {
    this.parentAccountId = parentAccountId;
    return this;
  }

  /**
   * The ID of this bill unit's parent account.
   * @return parentAccountId
   **/
  @Schema(required = true, description = "The ID of this bill unit's parent account.")
      @NotNull

    public String getParentAccountId() {
    return parentAccountId;
  }

  public void setParentAccountId(String parentAccountId) {
    this.parentAccountId = parentAccountId;
  }

  public BillUnit parentFirstName(String parentFirstName) {
    this.parentFirstName = parentFirstName;
    return this;
  }

  /**
   * The first name associated with the parent bill unit.
   * @return parentFirstName
   **/
  @Schema(required = true, description = "The first name associated with the parent bill unit.")
      @NotNull

    public String getParentFirstName() {
    return parentFirstName;
  }

  public void setParentFirstName(String parentFirstName) {
    this.parentFirstName = parentFirstName;
  }

  public BillUnit parentLastName(String parentLastName) {
    this.parentLastName = parentLastName;
    return this;
  }

  /**
   * The last name associated with the parent bill unit.
   * @return parentLastName
   **/
  @Schema(required = true, description = "The last name associated with the parent bill unit.")
      @NotNull

    public String getParentLastName() {
    return parentLastName;
  }

  public void setParentLastName(String parentLastName) {
    this.parentLastName = parentLastName;
  }

  public BillUnit parentCompanyName(String parentCompanyName) {
    this.parentCompanyName = parentCompanyName;
    return this;
  }

  /**
   * The parent bill unit's company name.
   * @return parentCompanyName
   **/
  @Schema(required = true, description = "The parent bill unit's company name.")
      @NotNull

    public String getParentCompanyName() {
    return parentCompanyName;
  }

  public void setParentCompanyName(String parentCompanyName) {
    this.parentCompanyName = parentCompanyName;
  }

  public BillUnit parentSalutation(String parentSalutation) {
    this.parentSalutation = parentSalutation;
    return this;
  }

  /**
   * The parent bill unit's salutation, such as Mr. or Mx.
   * @return parentSalutation
   **/
  @Schema(required = true, description = "The parent bill unit's salutation, such as Mr. or Mx.")
      @NotNull

    public String getParentSalutation() {
    return parentSalutation;
  }

  public void setParentSalutation(String parentSalutation) {
    this.parentSalutation = parentSalutation;
  }

  public BillUnit parentAccountNumber(String parentAccountNumber) {
    this.parentAccountNumber = parentAccountNumber;
    return this;
  }

  /**
   * The account number associated with the parent's bill unit.
   * @return parentAccountNumber
   **/
  @Schema(required = true, description = "The account number associated with the parent's bill unit.")
      @NotNull

    public String getParentAccountNumber() {
    return parentAccountNumber;
  }

  public void setParentAccountNumber(String parentAccountNumber) {
    this.parentAccountNumber = parentAccountNumber;
  }

  public BillUnit invoiceTemplate(String invoiceTemplate) {
    this.invoiceTemplate = invoiceTemplate;
    return this;
  }

  /**
   * The name of the invoice template associated with the bill unit.
   * @return invoiceTemplate
   **/
  @Schema(required = true, description = "The name of the invoice template associated with the bill unit.")
      @NotNull

    public String getInvoiceTemplate() {
    return invoiceTemplate;
  }

  public void setInvoiceTemplate(String invoiceTemplate) {
    this.invoiceTemplate = invoiceTemplate;
  }

  public BillUnit businessProfile(String businessProfile) {
    this.businessProfile = businessProfile;
    return this;
  }

  /**
   * The business profile associated with bill unit.
   * @return businessProfile
   **/
  @Schema(required = true, description = "The business profile associated with bill unit.")
      @NotNull

    public String getBusinessProfile() {
    return businessProfile;
  }

  public void setBusinessProfile(String businessProfile) {
    this.businessProfile = businessProfile;
  }

  public BillUnit wholesaleBilling(String wholesaleBilling) {
    this.wholesaleBilling = wholesaleBilling;
    return this;
  }

  /**
   * The wholesale billing key.
   * @return wholesaleBilling
   **/
  @Schema(required = true, description = "The wholesale billing key.")
      @NotNull

    public String getWholesaleBilling() {
    return wholesaleBilling;
  }

  public void setWholesaleBilling(String wholesaleBilling) {
    this.wholesaleBilling = wholesaleBilling;
  }

  public BillUnit correctiveInvoiceType(Integer correctiveInvoiceType) {
    this.correctiveInvoiceType = correctiveInvoiceType;
    return this;
  }

  /**
   * The type of invoice to create for corrective bills, such as an invoice correction letter or a replacement invoice.
   * @return correctiveInvoiceType
   **/
  @Schema(description = "The type of invoice to create for corrective bills, such as an invoice correction letter or a replacement invoice.")
  
    public Integer getCorrectiveInvoiceType() {
    return correctiveInvoiceType;
  }

  public void setCorrectiveInvoiceType(Integer correctiveInvoiceType) {
    this.correctiveInvoiceType = correctiveInvoiceType;
  }

  public BillUnit lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time the bill unit was last modified.
   * @return lastModified
   **/
  @Schema(description = "The date and time the bill unit was last modified.")
  
    @Valid
    public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public BillUnit creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the bill unit was created.
   * @return creationDate
   **/
  @Schema(required = true, description = "The date and time the bill unit was created.")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public BillUnit accountingCyclesUntilBillCycleEnds(Integer accountingCyclesUntilBillCycleEnds) {
    this.accountingCyclesUntilBillCycleEnds = accountingCyclesUntilBillCycleEnds;
    return this;
  }

  /**
   * The number of monthly accounting cycles remaining until the current billing cycle ends.
   * @return accountingCyclesUntilBillCycleEnds
   **/
  @Schema(description = "The number of monthly accounting cycles remaining until the current billing cycle ends.")
  
    public Integer getAccountingCyclesUntilBillCycleEnds() {
    return accountingCyclesUntilBillCycleEnds;
  }

  public void setAccountingCyclesUntilBillCycleEnds(Integer accountingCyclesUntilBillCycleEnds) {
    this.accountingCyclesUntilBillCycleEnds = accountingCyclesUntilBillCycleEnds;
  }

  public BillUnit billForCurrentCycleRef(ResourceRef billForCurrentCycleRef) {
    this.billForCurrentCycleRef = billForCurrentCycleRef;
    return this;
  }

  /**
   * Get billForCurrentCycleRef
   * @return billForCurrentCycleRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBillForCurrentCycleRef() {
    return billForCurrentCycleRef;
  }

  public void setBillForCurrentCycleRef(ResourceRef billForCurrentCycleRef) {
    this.billForCurrentCycleRef = billForCurrentCycleRef;
  }

  public BillUnit defaultBillUnit(Boolean defaultBillUnit) {
    this.defaultBillUnit = defaultBillUnit;
    return this;
  }

  /**
   * Whether this is the default bill unit (<b>true</b>) or not (<b>false</b>).
   * @return defaultBillUnit
   **/
  @Schema(description = "Whether this is the default bill unit (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isDefaultBillUnit() {
    return defaultBillUnit;
  }

  public void setDefaultBillUnit(Boolean defaultBillUnit) {
    this.defaultBillUnit = defaultBillUnit;
  }

  public BillUnit parentBillUnit(Boolean parentBillUnit) {
    this.parentBillUnit = parentBillUnit;
    return this;
  }

  /**
   * Whether this is a parent bill unit (<b>true</b>) or not (<b>false</b>).
   * @return parentBillUnit
   **/
  @Schema(description = "Whether this is a parent bill unit (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isParentBillUnit() {
    return parentBillUnit;
  }

  public void setParentBillUnit(Boolean parentBillUnit) {
    this.parentBillUnit = parentBillUnit;
  }

  public BillUnit billingFrequencyInMonths(Integer billingFrequencyInMonths) {
    this.billingFrequencyInMonths = billingFrequencyInMonths;
    return this;
  }

  /**
   * The billing frequency in number of months. Can be one of the following: <ul><li><b>1</b>: Monthly</li><li><b>2</b>: Bi-monthly</li><li><b>3</b>: Quarterly</li><li><b>12</b>: Yearly</li></ul>
   * @return billingFrequencyInMonths
   **/
  @Schema(description = "The billing frequency in number of months. Can be one of the following: <ul><li><b>1</b>: Monthly</li><li><b>2</b>: Bi-monthly</li><li><b>3</b>: Quarterly</li><li><b>12</b>: Yearly</li></ul>")
  
    public Integer getBillingFrequencyInMonths() {
    return billingFrequencyInMonths;
  }

  public void setBillingFrequencyInMonths(Integer billingFrequencyInMonths) {
    this.billingFrequencyInMonths = billingFrequencyInMonths;
  }

  public BillUnit accountingCycleStart(OffsetDateTime accountingCycleStart) {
    this.accountingCycleStart = accountingCycleStart;
    return this;
  }

  /**
   * The date and time the accounting cycle starts.
   * @return accountingCycleStart
   **/
  @Schema(description = "The date and time the accounting cycle starts.")
  
    @Valid
    public OffsetDateTime getAccountingCycleStart() {
    return accountingCycleStart;
  }

  public void setAccountingCycleStart(OffsetDateTime accountingCycleStart) {
    this.accountingCycleStart = accountingCycleStart;
  }

  public BillUnit accountingCycleEnd(OffsetDateTime accountingCycleEnd) {
    this.accountingCycleEnd = accountingCycleEnd;
    return this;
  }

  /**
   * The date and time the accounting cycle ends.
   * @return accountingCycleEnd
   **/
  @Schema(description = "The date and time the accounting cycle ends.")
  
    @Valid
    public OffsetDateTime getAccountingCycleEnd() {
    return accountingCycleEnd;
  }

  public void setAccountingCycleEnd(OffsetDateTime accountingCycleEnd) {
    this.accountingCycleEnd = accountingCycleEnd;
  }

  public BillUnit lastActualBillRef(ResourceRef lastActualBillRef) {
    this.lastActualBillRef = lastActualBillRef;
    return this;
  }

  /**
   * Get lastActualBillRef
   * @return lastActualBillRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getLastActualBillRef() {
    return lastActualBillRef;
  }

  public void setLastActualBillRef(ResourceRef lastActualBillRef) {
    this.lastActualBillRef = lastActualBillRef;
  }

  public BillUnit lastActualBillDate(OffsetDateTime lastActualBillDate) {
    this.lastActualBillDate = lastActualBillDate;
    return this;
  }

  /**
   * The date and time the last bill was created.
   * @return lastActualBillDate
   **/
  @Schema(description = "The date and time the last bill was created.")
  
    @Valid
    public OffsetDateTime getLastActualBillDate() {
    return lastActualBillDate;
  }

  public void setLastActualBillDate(OffsetDateTime lastActualBillDate) {
    this.lastActualBillDate = lastActualBillDate;
  }

  public BillUnit lastBillFromBillingRef(ResourceRef lastBillFromBillingRef) {
    this.lastBillFromBillingRef = lastBillFromBillingRef;
    return this;
  }

  /**
   * Get lastBillFromBillingRef
   * @return lastBillFromBillingRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getLastBillFromBillingRef() {
    return lastBillFromBillingRef;
  }

  public void setLastBillFromBillingRef(ResourceRef lastBillFromBillingRef) {
    this.lastBillFromBillingRef = lastBillFromBillingRef;
  }

  public BillUnit billingCycleStart(OffsetDateTime billingCycleStart) {
    this.billingCycleStart = billingCycleStart;
    return this;
  }

  /**
   * The date and time the billing cycle starts
   * @return billingCycleStart
   **/
  @Schema(description = "The date and time the billing cycle starts")
  
    @Valid
    public OffsetDateTime getBillingCycleStart() {
    return billingCycleStart;
  }

  public void setBillingCycleStart(OffsetDateTime billingCycleStart) {
    this.billingCycleStart = billingCycleStart;
  }

  public BillUnit billingCycleEnd(OffsetDateTime billingCycleEnd) {
    this.billingCycleEnd = billingCycleEnd;
    return this;
  }

  /**
   * The date and time the billing cycle ends.
   * @return billingCycleEnd
   **/
  @Schema(description = "The date and time the billing cycle ends.")
  
    @Valid
    public OffsetDateTime getBillingCycleEnd() {
    return billingCycleEnd;
  }

  public void setBillingCycleEnd(OffsetDateTime billingCycleEnd) {
    this.billingCycleEnd = billingCycleEnd;
  }

  public BillUnit segment(String segment) {
    this.segment = segment;
    return this;
  }

  /**
   * The customer segment associated with the bill unit. A customer segment is a user-defined customer description that can be used to group accounts according to customer billing and payment practices.
   * @return segment
   **/
  @Schema(description = "The customer segment associated with the bill unit. A customer segment is a user-defined customer description that can be used to group accounts according to customer billing and payment practices.")
  
    public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public BillUnit daysInBillCycle(Integer daysInBillCycle) {
    this.daysInBillCycle = daysInBillCycle;
    return this;
  }

  /**
   * The number of days in a billing cycle.
   * @return daysInBillCycle
   **/
  @Schema(description = "The number of days in a billing cycle.")
  
    public Integer getDaysInBillCycle() {
    return daysInBillCycle;
  }

  public void setDaysInBillCycle(Integer daysInBillCycle) {
    this.daysInBillCycle = daysInBillCycle;
  }

  public BillUnit daysRemainingInBillCycle(Integer daysRemainingInBillCycle) {
    this.daysRemainingInBillCycle = daysRemainingInBillCycle;
    return this;
  }

  /**
   * The number of days that remain in the current billing cycle.
   * @return daysRemainingInBillCycle
   **/
  @Schema(description = "The number of days that remain in the current billing cycle.")
  
    public Integer getDaysRemainingInBillCycle() {
    return daysRemainingInBillCycle;
  }

  public void setDaysRemainingInBillCycle(Integer daysRemainingInBillCycle) {
    this.daysRemainingInBillCycle = daysRemainingInBillCycle;
  }

  public BillUnit exemptFromCollections(Integer exemptFromCollections) {
    this.exemptFromCollections = exemptFromCollections;
    return this;
  }

  /**
   * Whether the bill unit is exempt from collections or not.
   * @return exemptFromCollections
   **/
  @Schema(description = "Whether the bill unit is exempt from collections or not.")
  
    public Integer getExemptFromCollections() {
    return exemptFromCollections;
  }

  public void setExemptFromCollections(Integer exemptFromCollections) {
    this.exemptFromCollections = exemptFromCollections;
  }

  public BillUnit scenarioRef(ResourceRef scenarioRef) {
    this.scenarioRef = scenarioRef;
    return this;
  }

  /**
   * Get scenarioRef
   * @return scenarioRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getScenarioRef() {
    return scenarioRef;
  }

  public void setScenarioRef(ResourceRef scenarioRef) {
    this.scenarioRef = scenarioRef;
  }

  public BillUnit numSuppressedCycles(Integer numSuppressedCycles) {
    this.numSuppressedCycles = numSuppressedCycles;
    return this;
  }

  /**
   * The number of consecutive billing cycles that the bill unit has been suppressed.
   * @return numSuppressedCycles
   **/
  @Schema(description = "The number of consecutive billing cycles that the bill unit has been suppressed.")
  
    public Integer getNumSuppressedCycles() {
    return numSuppressedCycles;
  }

  public void setNumSuppressedCycles(Integer numSuppressedCycles) {
    this.numSuppressedCycles = numSuppressedCycles;
  }

  public BillUnit suppressed(Integer suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  /**
   * Whether the bill unit is suppressed or not.
   * @return suppressed
   **/
  @Schema(description = "Whether the bill unit is suppressed or not.")
  
    public Integer getSuppressed() {
    return suppressed;
  }

  public void setSuppressed(Integer suppressed) {
    this.suppressed = suppressed;
  }

  public BillUnit suppressionCyclesLeft(Integer suppressionCyclesLeft) {
    this.suppressionCyclesLeft = suppressionCyclesLeft;
    return this;
  }

  /**
   * The number of consecutive billing cycles for which the bill is to be suppressed.
   * @return suppressionCyclesLeft
   **/
  @Schema(description = "The number of consecutive billing cycles for which the bill is to be suppressed.")
  
    public Integer getSuppressionCyclesLeft() {
    return suppressionCyclesLeft;
  }

  public void setSuppressionCyclesLeft(Integer suppressionCyclesLeft) {
    this.suppressionCyclesLeft = suppressionCyclesLeft;
  }

  public BillUnit collectionDate(OffsetDateTime collectionDate) {
    this.collectionDate = collectionDate;
    return this;
  }

  /**
   * The date collections is due.
   * @return collectionDate
   **/
  @Schema(description = "The date collections is due.")
  
    @Valid
    public OffsetDateTime getCollectionDate() {
    return collectionDate;
  }

  public void setCollectionDate(OffsetDateTime collectionDate) {
    this.collectionDate = collectionDate;
  }

  public BillUnit paymentInstrumentName(String paymentInstrumentName) {
    this.paymentInstrumentName = paymentInstrumentName;
    return this;
  }

  /**
   * The name of the payment instrument.
   * @return paymentInstrumentName
   **/
  @Schema(required = true, description = "The name of the payment instrument.")
      @NotNull

    public String getPaymentInstrumentName() {
    return paymentInstrumentName;
  }

  public void setPaymentInstrumentName(String paymentInstrumentName) {
    this.paymentInstrumentName = paymentInstrumentName;
  }

  public BillUnit collectionDetailsRef(ResourceRef collectionDetailsRef) {
    this.collectionDetailsRef = collectionDetailsRef;
    return this;
  }

  /**
   * Get collectionDetailsRef
   * @return collectionDetailsRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getCollectionDetailsRef() {
    return collectionDetailsRef;
  }

  public void setCollectionDetailsRef(ResourceRef collectionDetailsRef) {
    this.collectionDetailsRef = collectionDetailsRef;
  }

  public BillUnit inCollections(Boolean inCollections) {
    this.inCollections = inCollections;
    return this;
  }

  /**
   * Whether the bill unit is in collections (<b>true</b>) or not (<b>false</b>).
   * @return inCollections
   **/
  @Schema(description = "Whether the bill unit is in collections (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isInCollections() {
    return inCollections;
  }

  public void setInCollections(Boolean inCollections) {
    this.inCollections = inCollections;
  }

  public BillUnit paymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
   **/
  @Schema(description = "")
  
    @Valid
    public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public BillUnit paymentType(Integer paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The payment type. Can be one of the following: <ul><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>
   * @return paymentType
   **/
  @Schema(description = "The payment type. Can be one of the following: <ul><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>")
  
    public Integer getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Integer paymentType) {
    this.paymentType = paymentType;
  }

  public BillUnit totalChildAccounts(Integer totalChildAccounts) {
    this.totalChildAccounts = totalChildAccounts;
    return this;
  }

  /**
   * The total number of child accounts.
   * @return totalChildAccounts
   **/
  @Schema(description = "The total number of child accounts.")
  
    public Integer getTotalChildAccounts() {
    return totalChildAccounts;
  }

  public void setTotalChildAccounts(Integer totalChildAccounts) {
    this.totalChildAccounts = totalChildAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillUnit billUnit = (BillUnit) o;
    return Objects.equals(this.extension, billUnit.extension) &&
        Objects.equals(this.id, billUnit.id) &&
        Objects.equals(this.name, billUnit.name) &&
        Objects.equals(this.accountRef, billUnit.accountRef) &&
        Objects.equals(this.accountingCycleDom, billUnit.accountingCycleDom) &&
        Objects.equals(this.accountingType, billUnit.accountingType) &&
        Objects.equals(this.balanceGroups, billUnit.balanceGroups) &&
        Objects.equals(this.paymentInstrumentRef, billUnit.paymentInstrumentRef) &&
        Objects.equals(this.currency, billUnit.currency) &&
        Objects.equals(this.currencySecondary, billUnit.currencySecondary) &&
        Objects.equals(this.status, billUnit.status) &&
        Objects.equals(this.arBillUnitRef, billUnit.arBillUnitRef) &&
        Objects.equals(this.parentBillUnitName, billUnit.parentBillUnitName) &&
        Objects.equals(this.parentAccountId, billUnit.parentAccountId) &&
        Objects.equals(this.parentFirstName, billUnit.parentFirstName) &&
        Objects.equals(this.parentLastName, billUnit.parentLastName) &&
        Objects.equals(this.parentCompanyName, billUnit.parentCompanyName) &&
        Objects.equals(this.parentSalutation, billUnit.parentSalutation) &&
        Objects.equals(this.parentAccountNumber, billUnit.parentAccountNumber) &&
        Objects.equals(this.invoiceTemplate, billUnit.invoiceTemplate) &&
        Objects.equals(this.businessProfile, billUnit.businessProfile) &&
        Objects.equals(this.wholesaleBilling, billUnit.wholesaleBilling) &&
        Objects.equals(this.correctiveInvoiceType, billUnit.correctiveInvoiceType) &&
        Objects.equals(this.lastModified, billUnit.lastModified) &&
        Objects.equals(this.creationDate, billUnit.creationDate) &&
        Objects.equals(this.accountingCyclesUntilBillCycleEnds, billUnit.accountingCyclesUntilBillCycleEnds) &&
        Objects.equals(this.billForCurrentCycleRef, billUnit.billForCurrentCycleRef) &&
        Objects.equals(this.defaultBillUnit, billUnit.defaultBillUnit) &&
        Objects.equals(this.parentBillUnit, billUnit.parentBillUnit) &&
        Objects.equals(this.billingFrequencyInMonths, billUnit.billingFrequencyInMonths) &&
        Objects.equals(this.accountingCycleStart, billUnit.accountingCycleStart) &&
        Objects.equals(this.accountingCycleEnd, billUnit.accountingCycleEnd) &&
        Objects.equals(this.lastActualBillRef, billUnit.lastActualBillRef) &&
        Objects.equals(this.lastActualBillDate, billUnit.lastActualBillDate) &&
        Objects.equals(this.lastBillFromBillingRef, billUnit.lastBillFromBillingRef) &&
        Objects.equals(this.billingCycleStart, billUnit.billingCycleStart) &&
        Objects.equals(this.billingCycleEnd, billUnit.billingCycleEnd) &&
        Objects.equals(this.segment, billUnit.segment) &&
        Objects.equals(this.daysInBillCycle, billUnit.daysInBillCycle) &&
        Objects.equals(this.daysRemainingInBillCycle, billUnit.daysRemainingInBillCycle) &&
        Objects.equals(this.exemptFromCollections, billUnit.exemptFromCollections) &&
        Objects.equals(this.scenarioRef, billUnit.scenarioRef) &&
        Objects.equals(this.numSuppressedCycles, billUnit.numSuppressedCycles) &&
        Objects.equals(this.suppressed, billUnit.suppressed) &&
        Objects.equals(this.suppressionCyclesLeft, billUnit.suppressionCyclesLeft) &&
        Objects.equals(this.collectionDate, billUnit.collectionDate) &&
        Objects.equals(this.paymentInstrumentName, billUnit.paymentInstrumentName) &&
        Objects.equals(this.collectionDetailsRef, billUnit.collectionDetailsRef) &&
        Objects.equals(this.inCollections, billUnit.inCollections) &&
        Objects.equals(this.paymentMethod, billUnit.paymentMethod) &&
        Objects.equals(this.paymentType, billUnit.paymentType) &&
        Objects.equals(this.totalChildAccounts, billUnit.totalChildAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, name, accountRef, accountingCycleDom, accountingType, balanceGroups, paymentInstrumentRef, currency, currencySecondary, status, arBillUnitRef, parentBillUnitName, parentAccountId, parentFirstName, parentLastName, parentCompanyName, parentSalutation, parentAccountNumber, invoiceTemplate, businessProfile, wholesaleBilling, correctiveInvoiceType, lastModified, creationDate, accountingCyclesUntilBillCycleEnds, billForCurrentCycleRef, defaultBillUnit, parentBillUnit, billingFrequencyInMonths, accountingCycleStart, accountingCycleEnd, lastActualBillRef, lastActualBillDate, lastBillFromBillingRef, billingCycleStart, billingCycleEnd, segment, daysInBillCycle, daysRemainingInBillCycle, exemptFromCollections, scenarioRef, numSuppressedCycles, suppressed, suppressionCyclesLeft, collectionDate, paymentInstrumentName, collectionDetailsRef, inCollections, paymentMethod, paymentType, totalChildAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillUnit {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    accountingCycleDom: ").append(toIndentedString(accountingCycleDom)).append("\n");
    sb.append("    accountingType: ").append(toIndentedString(accountingType)).append("\n");
    sb.append("    balanceGroups: ").append(toIndentedString(balanceGroups)).append("\n");
    sb.append("    paymentInstrumentRef: ").append(toIndentedString(paymentInstrumentRef)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    currencySecondary: ").append(toIndentedString(currencySecondary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    arBillUnitRef: ").append(toIndentedString(arBillUnitRef)).append("\n");
    sb.append("    parentBillUnitName: ").append(toIndentedString(parentBillUnitName)).append("\n");
    sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
    sb.append("    parentFirstName: ").append(toIndentedString(parentFirstName)).append("\n");
    sb.append("    parentLastName: ").append(toIndentedString(parentLastName)).append("\n");
    sb.append("    parentCompanyName: ").append(toIndentedString(parentCompanyName)).append("\n");
    sb.append("    parentSalutation: ").append(toIndentedString(parentSalutation)).append("\n");
    sb.append("    parentAccountNumber: ").append(toIndentedString(parentAccountNumber)).append("\n");
    sb.append("    invoiceTemplate: ").append(toIndentedString(invoiceTemplate)).append("\n");
    sb.append("    businessProfile: ").append(toIndentedString(businessProfile)).append("\n");
    sb.append("    wholesaleBilling: ").append(toIndentedString(wholesaleBilling)).append("\n");
    sb.append("    correctiveInvoiceType: ").append(toIndentedString(correctiveInvoiceType)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    accountingCyclesUntilBillCycleEnds: ").append(toIndentedString(accountingCyclesUntilBillCycleEnds)).append("\n");
    sb.append("    billForCurrentCycleRef: ").append(toIndentedString(billForCurrentCycleRef)).append("\n");
    sb.append("    defaultBillUnit: ").append(toIndentedString(defaultBillUnit)).append("\n");
    sb.append("    parentBillUnit: ").append(toIndentedString(parentBillUnit)).append("\n");
    sb.append("    billingFrequencyInMonths: ").append(toIndentedString(billingFrequencyInMonths)).append("\n");
    sb.append("    accountingCycleStart: ").append(toIndentedString(accountingCycleStart)).append("\n");
    sb.append("    accountingCycleEnd: ").append(toIndentedString(accountingCycleEnd)).append("\n");
    sb.append("    lastActualBillRef: ").append(toIndentedString(lastActualBillRef)).append("\n");
    sb.append("    lastActualBillDate: ").append(toIndentedString(lastActualBillDate)).append("\n");
    sb.append("    lastBillFromBillingRef: ").append(toIndentedString(lastBillFromBillingRef)).append("\n");
    sb.append("    billingCycleStart: ").append(toIndentedString(billingCycleStart)).append("\n");
    sb.append("    billingCycleEnd: ").append(toIndentedString(billingCycleEnd)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    daysInBillCycle: ").append(toIndentedString(daysInBillCycle)).append("\n");
    sb.append("    daysRemainingInBillCycle: ").append(toIndentedString(daysRemainingInBillCycle)).append("\n");
    sb.append("    exemptFromCollections: ").append(toIndentedString(exemptFromCollections)).append("\n");
    sb.append("    scenarioRef: ").append(toIndentedString(scenarioRef)).append("\n");
    sb.append("    numSuppressedCycles: ").append(toIndentedString(numSuppressedCycles)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
    sb.append("    suppressionCyclesLeft: ").append(toIndentedString(suppressionCyclesLeft)).append("\n");
    sb.append("    collectionDate: ").append(toIndentedString(collectionDate)).append("\n");
    sb.append("    paymentInstrumentName: ").append(toIndentedString(paymentInstrumentName)).append("\n");
    sb.append("    collectionDetailsRef: ").append(toIndentedString(collectionDetailsRef)).append("\n");
    sb.append("    inCollections: ").append(toIndentedString(inCollections)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    totalChildAccounts: ").append(toIndentedString(totalChildAccounts)).append("\n");
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
