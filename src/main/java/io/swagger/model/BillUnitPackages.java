package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AccountGroup;
import io.swagger.model.ServiceGroup;
import io.swagger.model.SubscriptionTerms;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of purchased packages
 */
@Schema(description = "A list of purchased packages")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillUnitPackages   {
  @JsonProperty("packageID")
  private String packageID = null;

  @JsonProperty("packageName")
  private String packageName = null;

  @JsonProperty("packagePurchasedDate")
  private OffsetDateTime packagePurchasedDate = null;

  @JsonProperty("packageTerms")
  private SubscriptionTerms packageTerms = null;

  @JsonProperty("serviceType")
  @Valid
  private List<ServiceGroup> serviceType = null;

  @JsonProperty("accountBundles")
  private AccountGroup accountBundles = null;

  @JsonProperty("packageCreatedDate")
  private OffsetDateTime packageCreatedDate = null;

  public BillUnitPackages packageID(String packageID) {
    this.packageID = packageID;
    return this;
  }

  /**
   * The package's ID.
   * @return packageID
   **/
  @Schema(description = "The package's ID.")
  
    public String getPackageID() {
    return packageID;
  }

  public void setPackageID(String packageID) {
    this.packageID = packageID;
  }

  public BillUnitPackages packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * The package's name.
   * @return packageName
   **/
  @Schema(description = "The package's name.")
  
    public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public BillUnitPackages packagePurchasedDate(OffsetDateTime packagePurchasedDate) {
    this.packagePurchasedDate = packagePurchasedDate;
    return this;
  }

  /**
   * The date and time the package was purchased.
   * @return packagePurchasedDate
   **/
  @Schema(description = "The date and time the package was purchased.")
  
    @Valid
    public OffsetDateTime getPackagePurchasedDate() {
    return packagePurchasedDate;
  }

  public void setPackagePurchasedDate(OffsetDateTime packagePurchasedDate) {
    this.packagePurchasedDate = packagePurchasedDate;
  }

  public BillUnitPackages packageTerms(SubscriptionTerms packageTerms) {
    this.packageTerms = packageTerms;
    return this;
  }

  /**
   * Get packageTerms
   * @return packageTerms
   **/
  @Schema(description = "")
  
    @Valid
    public SubscriptionTerms getPackageTerms() {
    return packageTerms;
  }

  public void setPackageTerms(SubscriptionTerms packageTerms) {
    this.packageTerms = packageTerms;
  }

  public BillUnitPackages serviceType(List<ServiceGroup> serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  public BillUnitPackages addServiceTypeItem(ServiceGroup serviceTypeItem) {
    if (this.serviceType == null) {
      this.serviceType = new ArrayList<ServiceGroup>();
    }
    this.serviceType.add(serviceTypeItem);
    return this;
  }

  /**
   * The list of services in the package.
   * @return serviceType
   **/
  @Schema(description = "The list of services in the package.")
      @Valid
    public List<ServiceGroup> getServiceType() {
    return serviceType;
  }

  public void setServiceType(List<ServiceGroup> serviceType) {
    this.serviceType = serviceType;
  }

  public BillUnitPackages accountBundles(AccountGroup accountBundles) {
    this.accountBundles = accountBundles;
    return this;
  }

  /**
   * Get accountBundles
   * @return accountBundles
   **/
  @Schema(description = "")
  
    @Valid
    public AccountGroup getAccountBundles() {
    return accountBundles;
  }

  public void setAccountBundles(AccountGroup accountBundles) {
    this.accountBundles = accountBundles;
  }

  public BillUnitPackages packageCreatedDate(OffsetDateTime packageCreatedDate) {
    this.packageCreatedDate = packageCreatedDate;
    return this;
  }

  /**
   * The date and time the package was created.
   * @return packageCreatedDate
   **/
  @Schema(description = "The date and time the package was created.")
  
    @Valid
    public OffsetDateTime getPackageCreatedDate() {
    return packageCreatedDate;
  }

  public void setPackageCreatedDate(OffsetDateTime packageCreatedDate) {
    this.packageCreatedDate = packageCreatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillUnitPackages billUnitPackages = (BillUnitPackages) o;
    return Objects.equals(this.packageID, billUnitPackages.packageID) &&
        Objects.equals(this.packageName, billUnitPackages.packageName) &&
        Objects.equals(this.packagePurchasedDate, billUnitPackages.packagePurchasedDate) &&
        Objects.equals(this.packageTerms, billUnitPackages.packageTerms) &&
        Objects.equals(this.serviceType, billUnitPackages.serviceType) &&
        Objects.equals(this.accountBundles, billUnitPackages.accountBundles) &&
        Objects.equals(this.packageCreatedDate, billUnitPackages.packageCreatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageID, packageName, packagePurchasedDate, packageTerms, serviceType, accountBundles, packageCreatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillUnitPackages {\n");
    
    sb.append("    packageID: ").append(toIndentedString(packageID)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    packagePurchasedDate: ").append(toIndentedString(packagePurchasedDate)).append("\n");
    sb.append("    packageTerms: ").append(toIndentedString(packageTerms)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    accountBundles: ").append(toIndentedString(accountBundles)).append("\n");
    sb.append("    packageCreatedDate: ").append(toIndentedString(packageCreatedDate)).append("\n");
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
