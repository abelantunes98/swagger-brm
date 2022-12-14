package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CustomizedBundleForPurchase;
import io.swagger.model.ExistingBillUnits;
import io.swagger.model.NewBillUnits;
import io.swagger.model.Notes;
import io.swagger.model.PurchasingService;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PackageBasedOrder
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PackageBasedOrder   {
  @JsonProperty("purchasingPackageRef")
  private String purchasingPackageRef = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("services")
  @Valid
  private List<PurchasingService> services = new ArrayList<PurchasingService>();

  @JsonProperty("existingBillunitsForBalanceGroups")
  @Valid
  private List<ExistingBillUnits> existingBillunitsForBalanceGroups = null;

  @JsonProperty("newBillunitsForBalanceGroups")
  @Valid
  private List<NewBillUnits> newBillunitsForBalanceGroups = null;

  @JsonProperty("genericBundle")
  private CustomizedBundleForPurchase genericBundle = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public PackageBasedOrder purchasingPackageRef(String purchasingPackageRef) {
    this.purchasingPackageRef = purchasingPackageRef;
    return this;
  }

  /**
   * The resource associated with the package purchase.
   * @return purchasingPackageRef
   **/
  @Schema(required = true, description = "The resource associated with the package purchase.")
      @NotNull

    public String getPurchasingPackageRef() {
    return purchasingPackageRef;
  }

  public void setPurchasingPackageRef(String purchasingPackageRef) {
    this.purchasingPackageRef = purchasingPackageRef;
  }

  public PackageBasedOrder effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the package purchase takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the package purchase takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public PackageBasedOrder services(List<PurchasingService> services) {
    this.services = services;
    return this;
  }

  public PackageBasedOrder addServicesItem(PurchasingService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The list of services in the package.
   * @return services
   **/
  @Schema(required = true, description = "The list of services in the package.")
      @NotNull
    @Valid
    public List<PurchasingService> getServices() {
    return services;
  }

  public void setServices(List<PurchasingService> services) {
    this.services = services;
  }

  public PackageBasedOrder existingBillunitsForBalanceGroups(List<ExistingBillUnits> existingBillunitsForBalanceGroups) {
    this.existingBillunitsForBalanceGroups = existingBillunitsForBalanceGroups;
    return this;
  }

  public PackageBasedOrder addExistingBillunitsForBalanceGroupsItem(ExistingBillUnits existingBillunitsForBalanceGroupsItem) {
    if (this.existingBillunitsForBalanceGroups == null) {
      this.existingBillunitsForBalanceGroups = new ArrayList<ExistingBillUnits>();
    }
    this.existingBillunitsForBalanceGroups.add(existingBillunitsForBalanceGroupsItem);
    return this;
  }

  /**
   * The list of existing bill units.
   * @return existingBillunitsForBalanceGroups
   **/
  @Schema(description = "The list of existing bill units.")
      @Valid
    public List<ExistingBillUnits> getExistingBillunitsForBalanceGroups() {
    return existingBillunitsForBalanceGroups;
  }

  public void setExistingBillunitsForBalanceGroups(List<ExistingBillUnits> existingBillunitsForBalanceGroups) {
    this.existingBillunitsForBalanceGroups = existingBillunitsForBalanceGroups;
  }

  public PackageBasedOrder newBillunitsForBalanceGroups(List<NewBillUnits> newBillunitsForBalanceGroups) {
    this.newBillunitsForBalanceGroups = newBillunitsForBalanceGroups;
    return this;
  }

  public PackageBasedOrder addNewBillunitsForBalanceGroupsItem(NewBillUnits newBillunitsForBalanceGroupsItem) {
    if (this.newBillunitsForBalanceGroups == null) {
      this.newBillunitsForBalanceGroups = new ArrayList<NewBillUnits>();
    }
    this.newBillunitsForBalanceGroups.add(newBillunitsForBalanceGroupsItem);
    return this;
  }

  /**
   * The list of new bill units.
   * @return newBillunitsForBalanceGroups
   **/
  @Schema(description = "The list of new bill units.")
      @Valid
    public List<NewBillUnits> getNewBillunitsForBalanceGroups() {
    return newBillunitsForBalanceGroups;
  }

  public void setNewBillunitsForBalanceGroups(List<NewBillUnits> newBillunitsForBalanceGroups) {
    this.newBillunitsForBalanceGroups = newBillunitsForBalanceGroups;
  }

  public PackageBasedOrder genericBundle(CustomizedBundleForPurchase genericBundle) {
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

  public PackageBasedOrder notes(Notes notes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageBasedOrder packageBasedOrder = (PackageBasedOrder) o;
    return Objects.equals(this.purchasingPackageRef, packageBasedOrder.purchasingPackageRef) &&
        Objects.equals(this.effective, packageBasedOrder.effective) &&
        Objects.equals(this.services, packageBasedOrder.services) &&
        Objects.equals(this.existingBillunitsForBalanceGroups, packageBasedOrder.existingBillunitsForBalanceGroups) &&
        Objects.equals(this.newBillunitsForBalanceGroups, packageBasedOrder.newBillunitsForBalanceGroups) &&
        Objects.equals(this.genericBundle, packageBasedOrder.genericBundle) &&
        Objects.equals(this.notes, packageBasedOrder.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchasingPackageRef, effective, services, existingBillunitsForBalanceGroups, newBillunitsForBalanceGroups, genericBundle, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageBasedOrder {\n");
    
    sb.append("    purchasingPackageRef: ").append(toIndentedString(purchasingPackageRef)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    existingBillunitsForBalanceGroups: ").append(toIndentedString(existingBillunitsForBalanceGroups)).append("\n");
    sb.append("    newBillunitsForBalanceGroups: ").append(toIndentedString(newBillunitsForBalanceGroups)).append("\n");
    sb.append("    genericBundle: ").append(toIndentedString(genericBundle)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
