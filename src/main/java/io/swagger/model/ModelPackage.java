package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BalanceGroups;
import io.swagger.model.GroupOfServices;
import io.swagger.model.SubscriptionTerms;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A package.
 */
@Schema(description = "A package.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ModelPackage   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lastModified")
  private OffsetDateTime lastModified = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tags")
  private String tags = null;

  @JsonProperty("serviceGroup")
  @Valid
  private List<GroupOfServices> serviceGroup = null;

  @JsonProperty("packageId")
  private Integer packageId = null;

  @JsonProperty("serviceIds")
  @Valid
  private List<String> serviceIds = null;

  @JsonProperty("purchaseFeeWaived")
  private Boolean purchaseFeeWaived = false;

  @JsonProperty("terminationFeeWaived")
  private Boolean terminationFeeWaived = false;

  @JsonProperty("balanceGroups")
  @Valid
  private List<BalanceGroups> balanceGroups = null;

  @JsonProperty("subscriptionTerms")
  private SubscriptionTerms subscriptionTerms = null;

  public ModelPackage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The package's ID.
   * @return id
   **/
  @Schema(required = true, description = "The package's ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ModelPackage creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the package was created.
   * @return creationDate
   **/
  @Schema(required = true, description = "The date and time the package was created.")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ModelPackage description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The package's description.
   * @return description
   **/
  @Schema(description = "The package's description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModelPackage lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time the package was last modified.
   * @return lastModified
   **/
  @Schema(required = true, description = "The date and time the package was last modified.")
      @NotNull

    @Valid
    public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public ModelPackage validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The end date for the package's validity.
   * @return validTo
   **/
  @Schema(description = "The end date for the package's validity.")
  
    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public ModelPackage name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The package's name.
   * @return name
   **/
  @Schema(description = "The package's name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModelPackage tags(String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * The tags associated with the package.
   * @return tags
   **/
  @Schema(description = "The tags associated with the package.")
  
    public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public ModelPackage serviceGroup(List<GroupOfServices> serviceGroup) {
    this.serviceGroup = serviceGroup;
    return this;
  }

  public ModelPackage addServiceGroupItem(GroupOfServices serviceGroupItem) {
    if (this.serviceGroup == null) {
      this.serviceGroup = new ArrayList<GroupOfServices>();
    }
    this.serviceGroup.add(serviceGroupItem);
    return this;
  }

  /**
   * The list of services associated with the package.
   * @return serviceGroup
   **/
  @Schema(description = "The list of services associated with the package.")
      @Valid
    public List<GroupOfServices> getServiceGroup() {
    return serviceGroup;
  }

  public void setServiceGroup(List<GroupOfServices> serviceGroup) {
    this.serviceGroup = serviceGroup;
  }

  public ModelPackage packageId(Integer packageId) {
    this.packageId = packageId;
    return this;
  }

  /**
   * The package's ID.
   * @return packageId
   **/
  @Schema(description = "The package's ID.")
  
    public Integer getPackageId() {
    return packageId;
  }

  public void setPackageId(Integer packageId) {
    this.packageId = packageId;
  }

  public ModelPackage serviceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
    return this;
  }

  public ModelPackage addServiceIdsItem(String serviceIdsItem) {
    if (this.serviceIds == null) {
      this.serviceIds = new ArrayList<String>();
    }
    this.serviceIds.add(serviceIdsItem);
    return this;
  }

  /**
   * The list of service IDs associated with the package.
   * @return serviceIds
   **/
  @Schema(description = "The list of service IDs associated with the package.")
  
    public List<String> getServiceIds() {
    return serviceIds;
  }

  public void setServiceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
  }

  public ModelPackage purchaseFeeWaived(Boolean purchaseFeeWaived) {
    this.purchaseFeeWaived = purchaseFeeWaived;
    return this;
  }

  /**
   * Whether to waive the purchase fee for the package (<b>true</b>) or not (<b>false</b>). The default is (<b>false</b>).
   * @return purchaseFeeWaived
   **/
  @Schema(description = "Whether to waive the purchase fee for the package (<b>true</b>) or not (<b>false</b>). The default is (<b>false</b>).")
  
    public Boolean isPurchaseFeeWaived() {
    return purchaseFeeWaived;
  }

  public void setPurchaseFeeWaived(Boolean purchaseFeeWaived) {
    this.purchaseFeeWaived = purchaseFeeWaived;
  }

  public ModelPackage terminationFeeWaived(Boolean terminationFeeWaived) {
    this.terminationFeeWaived = terminationFeeWaived;
    return this;
  }

  /**
   * Whether to waive the termination fee for the package (<b>true</b>) or not (<b>false</b>). The default is (<b>false</b>).
   * @return terminationFeeWaived
   **/
  @Schema(description = "Whether to waive the termination fee for the package (<b>true</b>) or not (<b>false</b>). The default is (<b>false</b>).")
  
    public Boolean isTerminationFeeWaived() {
    return terminationFeeWaived;
  }

  public void setTerminationFeeWaived(Boolean terminationFeeWaived) {
    this.terminationFeeWaived = terminationFeeWaived;
  }

  public ModelPackage balanceGroups(List<BalanceGroups> balanceGroups) {
    this.balanceGroups = balanceGroups;
    return this;
  }

  public ModelPackage addBalanceGroupsItem(BalanceGroups balanceGroupsItem) {
    if (this.balanceGroups == null) {
      this.balanceGroups = new ArrayList<BalanceGroups>();
    }
    this.balanceGroups.add(balanceGroupsItem);
    return this;
  }

  /**
   * Balance groups associated with the package.
   * @return balanceGroups
   **/
  @Schema(description = "Balance groups associated with the package.")
      @Valid
    public List<BalanceGroups> getBalanceGroups() {
    return balanceGroups;
  }

  public void setBalanceGroups(List<BalanceGroups> balanceGroups) {
    this.balanceGroups = balanceGroups;
  }

  public ModelPackage subscriptionTerms(SubscriptionTerms subscriptionTerms) {
    this.subscriptionTerms = subscriptionTerms;
    return this;
  }

  /**
   * Get subscriptionTerms
   * @return subscriptionTerms
   **/
  @Schema(description = "")
  
    @Valid
    public SubscriptionTerms getSubscriptionTerms() {
    return subscriptionTerms;
  }

  public void setSubscriptionTerms(SubscriptionTerms subscriptionTerms) {
    this.subscriptionTerms = subscriptionTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPackage _package = (ModelPackage) o;
    return Objects.equals(this.id, _package.id) &&
        Objects.equals(this.creationDate, _package.creationDate) &&
        Objects.equals(this.description, _package.description) &&
        Objects.equals(this.lastModified, _package.lastModified) &&
        Objects.equals(this.validTo, _package.validTo) &&
        Objects.equals(this.name, _package.name) &&
        Objects.equals(this.tags, _package.tags) &&
        Objects.equals(this.serviceGroup, _package.serviceGroup) &&
        Objects.equals(this.packageId, _package.packageId) &&
        Objects.equals(this.serviceIds, _package.serviceIds) &&
        Objects.equals(this.purchaseFeeWaived, _package.purchaseFeeWaived) &&
        Objects.equals(this.terminationFeeWaived, _package.terminationFeeWaived) &&
        Objects.equals(this.balanceGroups, _package.balanceGroups) &&
        Objects.equals(this.subscriptionTerms, _package.subscriptionTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, description, lastModified, validTo, name, tags, serviceGroup, packageId, serviceIds, purchaseFeeWaived, terminationFeeWaived, balanceGroups, subscriptionTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPackage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
    sb.append("    purchaseFeeWaived: ").append(toIndentedString(purchaseFeeWaived)).append("\n");
    sb.append("    terminationFeeWaived: ").append(toIndentedString(terminationFeeWaived)).append("\n");
    sb.append("    balanceGroups: ").append(toIndentedString(balanceGroups)).append("\n");
    sb.append("    subscriptionTerms: ").append(toIndentedString(subscriptionTerms)).append("\n");
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
