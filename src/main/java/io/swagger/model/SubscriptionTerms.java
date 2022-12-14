package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.model.SubscriptionTerms;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Subscription terms.
 */
@Schema(description = "Subscription terms.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SubscriptionTerms   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("termsName")
  private String termsName = null;

  @JsonProperty("termsDescription")
  private String termsDescription = null;

  @JsonProperty("packageRef")
  private ResourceRef packageRef = null;

  @JsonProperty("bundleRef")
  private ResourceRef bundleRef = null;

  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("subscriberContractRef")
  private ResourceRef subscriberContractRef = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("commitmentPeriod")
  private Integer commitmentPeriod = null;

  @JsonProperty("commitmentUnit")
  private Integer commitmentUnit = null;

  @JsonProperty("commitmentStartDate")
  private OffsetDateTime commitmentStartDate = null;

  @JsonProperty("commitmentEndDate")
  private OffsetDateTime commitmentEndDate = null;

  @JsonProperty("earlyCancellationAllowed")
  private Boolean earlyCancellationAllowed = null;

  @JsonProperty("earlyCancellationDate")
  private OffsetDateTime earlyCancellationDate = null;

  @JsonProperty("earlyCancellationFee")
  private BigDecimal earlyCancellationFee = null;

  @JsonProperty("reducedCancellationFee")
  private BigDecimal reducedCancellationFee = null;

  @JsonProperty("autoRenew")
  private Boolean autoRenew = null;

  @JsonProperty("renewWithSameTerms")
  private Boolean renewWithSameTerms = null;

  @JsonProperty("bundleName")
  private String bundleName = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("gracePeriod")
  private Integer gracePeriod = null;

  @JsonProperty("packageId")
  private Integer packageId = null;

  @JsonProperty("gracePeriodUnit")
  private Integer gracePeriodUnit = null;

  @JsonProperty("earlyCancellationType")
  private Integer earlyCancellationType = null;

  @JsonProperty("renewalContractTerms")
  private SubscriptionTerms renewalContractTerms = null;

  public SubscriptionTerms extension(Object extension) {
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

  public SubscriptionTerms id(String id) {
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

  public SubscriptionTerms termsName(String termsName) {
    this.termsName = termsName;
    return this;
  }

  /**
   * The subscription terms' name.
   * @return termsName
   **/
  @Schema(required = true, description = "The subscription terms' name.")
      @NotNull

    public String getTermsName() {
    return termsName;
  }

  public void setTermsName(String termsName) {
    this.termsName = termsName;
  }

  public SubscriptionTerms termsDescription(String termsDescription) {
    this.termsDescription = termsDescription;
    return this;
  }

  /**
   * The subscription terms' description.
   * @return termsDescription
   **/
  @Schema(description = "The subscription terms' description.")
  
    public String getTermsDescription() {
    return termsDescription;
  }

  public void setTermsDescription(String termsDescription) {
    this.termsDescription = termsDescription;
  }

  public SubscriptionTerms packageRef(ResourceRef packageRef) {
    this.packageRef = packageRef;
    return this;
  }

  /**
   * Get packageRef
   * @return packageRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPackageRef() {
    return packageRef;
  }

  public void setPackageRef(ResourceRef packageRef) {
    this.packageRef = packageRef;
  }

  public SubscriptionTerms bundleRef(ResourceRef bundleRef) {
    this.bundleRef = bundleRef;
    return this;
  }

  /**
   * Get bundleRef
   * @return bundleRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBundleRef() {
    return bundleRef;
  }

  public void setBundleRef(ResourceRef bundleRef) {
    this.bundleRef = bundleRef;
  }

  public SubscriptionTerms serviceRef(ResourceRef serviceRef) {
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

  public SubscriptionTerms subscriberContractRef(ResourceRef subscriberContractRef) {
    this.subscriberContractRef = subscriberContractRef;
    return this;
  }

  /**
   * Get subscriberContractRef
   * @return subscriberContractRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getSubscriberContractRef() {
    return subscriberContractRef;
  }

  public void setSubscriberContractRef(ResourceRef subscriberContractRef) {
    this.subscriberContractRef = subscriberContractRef;
  }

  public SubscriptionTerms accountRef(ResourceRef accountRef) {
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

  public SubscriptionTerms commitmentPeriod(Integer commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
    return this;
  }

  /**
   * The duration of the commitment period.
   * @return commitmentPeriod
   **/
  @Schema(description = "The duration of the commitment period.")
  
    public Integer getCommitmentPeriod() {
    return commitmentPeriod;
  }

  public void setCommitmentPeriod(Integer commitmentPeriod) {
    this.commitmentPeriod = commitmentPeriod;
  }

  public SubscriptionTerms commitmentUnit(Integer commitmentUnit) {
    this.commitmentUnit = commitmentUnit;
    return this;
  }

  /**
   * The unit for the commitment period. Can be one of the following: <ul><li><b>0</b>: Months</li><li><b>1</b>: Days</li></ul>
   * @return commitmentUnit
   **/
  @Schema(description = "The unit for the commitment period. Can be one of the following: <ul><li><b>0</b>: Months</li><li><b>1</b>: Days</li></ul>")
  
    public Integer getCommitmentUnit() {
    return commitmentUnit;
  }

  public void setCommitmentUnit(Integer commitmentUnit) {
    this.commitmentUnit = commitmentUnit;
  }

  public SubscriptionTerms commitmentStartDate(OffsetDateTime commitmentStartDate) {
    this.commitmentStartDate = commitmentStartDate;
    return this;
  }

  /**
   * The date and time the commitment period starts.
   * @return commitmentStartDate
   **/
  @Schema(required = true, description = "The date and time the commitment period starts.")
      @NotNull

    @Valid
    public OffsetDateTime getCommitmentStartDate() {
    return commitmentStartDate;
  }

  public void setCommitmentStartDate(OffsetDateTime commitmentStartDate) {
    this.commitmentStartDate = commitmentStartDate;
  }

  public SubscriptionTerms commitmentEndDate(OffsetDateTime commitmentEndDate) {
    this.commitmentEndDate = commitmentEndDate;
    return this;
  }

  /**
   * The date and time the commitment period ends.
   * @return commitmentEndDate
   **/
  @Schema(required = true, description = "The date and time the commitment period ends.")
      @NotNull

    @Valid
    public OffsetDateTime getCommitmentEndDate() {
    return commitmentEndDate;
  }

  public void setCommitmentEndDate(OffsetDateTime commitmentEndDate) {
    this.commitmentEndDate = commitmentEndDate;
  }

  public SubscriptionTerms earlyCancellationAllowed(Boolean earlyCancellationAllowed) {
    this.earlyCancellationAllowed = earlyCancellationAllowed;
    return this;
  }

  /**
   * Whether early cancellation is allowed (<b>true</b>) or not (<b>false</b>).
   * @return earlyCancellationAllowed
   **/
  @Schema(description = "Whether early cancellation is allowed (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isEarlyCancellationAllowed() {
    return earlyCancellationAllowed;
  }

  public void setEarlyCancellationAllowed(Boolean earlyCancellationAllowed) {
    this.earlyCancellationAllowed = earlyCancellationAllowed;
  }

  public SubscriptionTerms earlyCancellationDate(OffsetDateTime earlyCancellationDate) {
    this.earlyCancellationDate = earlyCancellationDate;
    return this;
  }

  /**
   * The date and time of early cancellation.
   * @return earlyCancellationDate
   **/
  @Schema(required = true, description = "The date and time of early cancellation.")
      @NotNull

    @Valid
    public OffsetDateTime getEarlyCancellationDate() {
    return earlyCancellationDate;
  }

  public void setEarlyCancellationDate(OffsetDateTime earlyCancellationDate) {
    this.earlyCancellationDate = earlyCancellationDate;
  }

  public SubscriptionTerms earlyCancellationFee(BigDecimal earlyCancellationFee) {
    this.earlyCancellationFee = earlyCancellationFee;
    return this;
  }

  /**
   * The fee for cancelling a subscription early.
   * @return earlyCancellationFee
   **/
  @Schema(required = true, description = "The fee for cancelling a subscription early.")
      @NotNull

    @Valid
    public BigDecimal getEarlyCancellationFee() {
    return earlyCancellationFee;
  }

  public void setEarlyCancellationFee(BigDecimal earlyCancellationFee) {
    this.earlyCancellationFee = earlyCancellationFee;
  }

  public SubscriptionTerms reducedCancellationFee(BigDecimal reducedCancellationFee) {
    this.reducedCancellationFee = reducedCancellationFee;
    return this;
  }

  /**
   * The reduced cancellation fee.
   * @return reducedCancellationFee
   **/
  @Schema(required = true, description = "The reduced cancellation fee.")
      @NotNull

    @Valid
    public BigDecimal getReducedCancellationFee() {
    return reducedCancellationFee;
  }

  public void setReducedCancellationFee(BigDecimal reducedCancellationFee) {
    this.reducedCancellationFee = reducedCancellationFee;
  }

  public SubscriptionTerms autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

  /**
   * Whether to automatically renew the terms at the end of its commitment period (<b>true</b>) or not (<b>false</b>).
   * @return autoRenew
   **/
  @Schema(description = "Whether to automatically renew the terms at the end of its commitment period (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public SubscriptionTerms renewWithSameTerms(Boolean renewWithSameTerms) {
    this.renewWithSameTerms = renewWithSameTerms;
    return this;
  }

  /**
   * Whether to renew with the same terms (<b>true</b>) or with different terms (<b>false</b>).
   * @return renewWithSameTerms
   **/
  @Schema(description = "Whether to renew with the same terms (<b>true</b>) or with different terms (<b>false</b>).")
  
    public Boolean isRenewWithSameTerms() {
    return renewWithSameTerms;
  }

  public void setRenewWithSameTerms(Boolean renewWithSameTerms) {
    this.renewWithSameTerms = renewWithSameTerms;
  }

  public SubscriptionTerms bundleName(String bundleName) {
    this.bundleName = bundleName;
    return this;
  }

  /**
   * The name of the bundle associated with the subscription terms.
   * @return bundleName
   **/
  @Schema(required = true, description = "The name of the bundle associated with the subscription terms.")
      @NotNull

    public String getBundleName() {
    return bundleName;
  }

  public void setBundleName(String bundleName) {
    this.bundleName = bundleName;
  }

  public SubscriptionTerms currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency associated with the subscription fee.
   * @return currency
   **/
  @Schema(description = "The currency associated with the subscription fee.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public SubscriptionTerms gracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

  /**
   * The duration of the grace period.
   * @return gracePeriod
   **/
  @Schema(description = "The duration of the grace period.")
  
    public Integer getGracePeriod() {
    return gracePeriod;
  }

  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }

  public SubscriptionTerms packageId(Integer packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * The ID of package associated with the subscription terms.
   * @return packageId
   **/
  @Schema(description = "The ID of package associated with the subscription terms.")
  
    public Integer getPackageId() {
    return packageId;
  }

  public void setPackageId(Integer packageId) {
    this.packageId = packageId;
  }

  public SubscriptionTerms gracePeriodUnit(Integer gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
    return this;
  }

  /**
   * The unit for the grace period. Can be one of the following: <ul><li><b>0</b>: Months</li><li><b>1</b>: Days</li></ul>
   * @return gracePeriodUnit
   **/
  @Schema(description = "The unit for the grace period. Can be one of the following: <ul><li><b>0</b>: Months</li><li><b>1</b>: Days</li></ul>")
  
    public Integer getGracePeriodUnit() {
    return gracePeriodUnit;
  }

  public void setGracePeriodUnit(Integer gracePeriodUnit) {
    this.gracePeriodUnit = gracePeriodUnit;
  }

  public SubscriptionTerms earlyCancellationType(Integer earlyCancellationType) {
    this.earlyCancellationType = earlyCancellationType;
    return this;
  }

  /**
   * The type of early cancelation fee. Can be one of the following: <ul><li><b>0</b>: Fixed</li><li><b>1</b>: Reducing</li></ul>
   * @return earlyCancellationType
   **/
  @Schema(description = "The type of early cancelation fee. Can be one of the following: <ul><li><b>0</b>: Fixed</li><li><b>1</b>: Reducing</li></ul>")
  
    public Integer getEarlyCancellationType() {
    return earlyCancellationType;
  }

  public void setEarlyCancellationType(Integer earlyCancellationType) {
    this.earlyCancellationType = earlyCancellationType;
  }

  public SubscriptionTerms renewalContractTerms(SubscriptionTerms renewalContractTerms) {
    this.renewalContractTerms = renewalContractTerms;
    return this;
  }

  /**
   * Get renewalContractTerms
   * @return renewalContractTerms
   **/
  @Schema(description = "")
  
    @Valid
    public SubscriptionTerms getRenewalContractTerms() {
    return renewalContractTerms;
  }

  public void setRenewalContractTerms(SubscriptionTerms renewalContractTerms) {
    this.renewalContractTerms = renewalContractTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionTerms subscriptionTerms = (SubscriptionTerms) o;
    return Objects.equals(this.extension, subscriptionTerms.extension) &&
        Objects.equals(this.id, subscriptionTerms.id) &&
        Objects.equals(this.termsName, subscriptionTerms.termsName) &&
        Objects.equals(this.termsDescription, subscriptionTerms.termsDescription) &&
        Objects.equals(this.packageRef, subscriptionTerms.packageRef) &&
        Objects.equals(this.bundleRef, subscriptionTerms.bundleRef) &&
        Objects.equals(this.serviceRef, subscriptionTerms.serviceRef) &&
        Objects.equals(this.subscriberContractRef, subscriptionTerms.subscriberContractRef) &&
        Objects.equals(this.accountRef, subscriptionTerms.accountRef) &&
        Objects.equals(this.commitmentPeriod, subscriptionTerms.commitmentPeriod) &&
        Objects.equals(this.commitmentUnit, subscriptionTerms.commitmentUnit) &&
        Objects.equals(this.commitmentStartDate, subscriptionTerms.commitmentStartDate) &&
        Objects.equals(this.commitmentEndDate, subscriptionTerms.commitmentEndDate) &&
        Objects.equals(this.earlyCancellationAllowed, subscriptionTerms.earlyCancellationAllowed) &&
        Objects.equals(this.earlyCancellationDate, subscriptionTerms.earlyCancellationDate) &&
        Objects.equals(this.earlyCancellationFee, subscriptionTerms.earlyCancellationFee) &&
        Objects.equals(this.reducedCancellationFee, subscriptionTerms.reducedCancellationFee) &&
        Objects.equals(this.autoRenew, subscriptionTerms.autoRenew) &&
        Objects.equals(this.renewWithSameTerms, subscriptionTerms.renewWithSameTerms) &&
        Objects.equals(this.bundleName, subscriptionTerms.bundleName) &&
        Objects.equals(this.currency, subscriptionTerms.currency) &&
        Objects.equals(this.gracePeriod, subscriptionTerms.gracePeriod) &&
        Objects.equals(this.packageId, subscriptionTerms.packageId) &&
        Objects.equals(this.gracePeriodUnit, subscriptionTerms.gracePeriodUnit) &&
        Objects.equals(this.earlyCancellationType, subscriptionTerms.earlyCancellationType) &&
        Objects.equals(this.renewalContractTerms, subscriptionTerms.renewalContractTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, termsName, termsDescription, packageRef, bundleRef, serviceRef, subscriberContractRef, accountRef, commitmentPeriod, commitmentUnit, commitmentStartDate, commitmentEndDate, earlyCancellationAllowed, earlyCancellationDate, earlyCancellationFee, reducedCancellationFee, autoRenew, renewWithSameTerms, bundleName, currency, gracePeriod, packageId, gracePeriodUnit, earlyCancellationType, renewalContractTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionTerms {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    termsName: ").append(toIndentedString(termsName)).append("\n");
    sb.append("    termsDescription: ").append(toIndentedString(termsDescription)).append("\n");
    sb.append("    packageRef: ").append(toIndentedString(packageRef)).append("\n");
    sb.append("    bundleRef: ").append(toIndentedString(bundleRef)).append("\n");
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    subscriberContractRef: ").append(toIndentedString(subscriberContractRef)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    commitmentPeriod: ").append(toIndentedString(commitmentPeriod)).append("\n");
    sb.append("    commitmentUnit: ").append(toIndentedString(commitmentUnit)).append("\n");
    sb.append("    commitmentStartDate: ").append(toIndentedString(commitmentStartDate)).append("\n");
    sb.append("    commitmentEndDate: ").append(toIndentedString(commitmentEndDate)).append("\n");
    sb.append("    earlyCancellationAllowed: ").append(toIndentedString(earlyCancellationAllowed)).append("\n");
    sb.append("    earlyCancellationDate: ").append(toIndentedString(earlyCancellationDate)).append("\n");
    sb.append("    earlyCancellationFee: ").append(toIndentedString(earlyCancellationFee)).append("\n");
    sb.append("    reducedCancellationFee: ").append(toIndentedString(reducedCancellationFee)).append("\n");
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    renewWithSameTerms: ").append(toIndentedString(renewWithSameTerms)).append("\n");
    sb.append("    bundleName: ").append(toIndentedString(bundleName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    gracePeriodUnit: ").append(toIndentedString(gracePeriodUnit)).append("\n");
    sb.append("    earlyCancellationType: ").append(toIndentedString(earlyCancellationType)).append("\n");
    sb.append("    renewalContractTerms: ").append(toIndentedString(renewalContractTerms)).append("\n");
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
