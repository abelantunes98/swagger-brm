package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CustomizedBundleForPurchase;
import io.swagger.model.Notes;
import io.swagger.model.PurchasingService;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PackageTransition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PackageTransition   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("toPackage")
  private String toPackage = null;

  @JsonProperty("fromPackage")
  private String fromPackage = null;

  @JsonProperty("transitionType")
  private Integer transitionType = null;

  @JsonProperty("mappedServiceIds")
  @Valid
  private List<String> mappedServiceIds = null;

  @JsonProperty("services")
  @Valid
  private List<PurchasingService> services = null;

  @JsonProperty("genericBundle")
  private CustomizedBundleForPurchase genericBundle = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public PackageTransition extension(Object extension) {
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

  public PackageTransition toPackage(String toPackage) {
    this.toPackage = toPackage;
    return this;
  }

  /**
   * The package the account is transitioning to.
   * @return toPackage
   **/
  @Schema(required = true, description = "The package the account is transitioning to.")
      @NotNull

    public String getToPackage() {
    return toPackage;
  }

  public void setToPackage(String toPackage) {
    this.toPackage = toPackage;
  }

  public PackageTransition fromPackage(String fromPackage) {
    this.fromPackage = fromPackage;
    return this;
  }

  /**
   * The package the account is transitioning from.
   * @return fromPackage
   **/
  @Schema(required = true, description = "The package the account is transitioning from.")
      @NotNull

    public String getFromPackage() {
    return fromPackage;
  }

  public void setFromPackage(String fromPackage) {
    this.fromPackage = fromPackage;
  }

  public PackageTransition transitionType(Integer transitionType) {
    this.transitionType = transitionType;
    return this;
  }

  /**
   * The type of transition, such as <b>upgrade</b>, <b>downgrade</b>, <b>generation change</b>, or a custom trasition type.
   * @return transitionType
   **/
  @Schema(description = "The type of transition, such as <b>upgrade</b>, <b>downgrade</b>, <b>generation change</b>, or a custom trasition type.")
  
    public Integer getTransitionType() {
    return transitionType;
  }

  public void setTransitionType(Integer transitionType) {
    this.transitionType = transitionType;
  }

  public PackageTransition mappedServiceIds(List<String> mappedServiceIds) {
    this.mappedServiceIds = mappedServiceIds;
    return this;
  }

  public PackageTransition addMappedServiceIdsItem(String mappedServiceIdsItem) {
    if (this.mappedServiceIds == null) {
      this.mappedServiceIds = new ArrayList<String>();
    }
    this.mappedServiceIds.add(mappedServiceIdsItem);
    return this;
  }

  /**
   * The list of service IDs.
   * @return mappedServiceIds
   **/
  @Schema(description = "The list of service IDs.")
  
    public List<String> getMappedServiceIds() {
    return mappedServiceIds;
  }

  public void setMappedServiceIds(List<String> mappedServiceIds) {
    this.mappedServiceIds = mappedServiceIds;
  }

  public PackageTransition services(List<PurchasingService> services) {
    this.services = services;
    return this;
  }

  public PackageTransition addServicesItem(PurchasingService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<PurchasingService>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The list of services.
   * @return services
   **/
  @Schema(description = "The list of services.")
      @Valid
    public List<PurchasingService> getServices() {
    return services;
  }

  public void setServices(List<PurchasingService> services) {
    this.services = services;
  }

  public PackageTransition genericBundle(CustomizedBundleForPurchase genericBundle) {
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

  public PackageTransition notes(Notes notes) {
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
    PackageTransition packageTransition = (PackageTransition) o;
    return Objects.equals(this.extension, packageTransition.extension) &&
        Objects.equals(this.toPackage, packageTransition.toPackage) &&
        Objects.equals(this.fromPackage, packageTransition.fromPackage) &&
        Objects.equals(this.transitionType, packageTransition.transitionType) &&
        Objects.equals(this.mappedServiceIds, packageTransition.mappedServiceIds) &&
        Objects.equals(this.services, packageTransition.services) &&
        Objects.equals(this.genericBundle, packageTransition.genericBundle) &&
        Objects.equals(this.notes, packageTransition.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, toPackage, fromPackage, transitionType, mappedServiceIds, services, genericBundle, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageTransition {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    toPackage: ").append(toIndentedString(toPackage)).append("\n");
    sb.append("    fromPackage: ").append(toIndentedString(fromPackage)).append("\n");
    sb.append("    transitionType: ").append(toIndentedString(transitionType)).append("\n");
    sb.append("    mappedServiceIds: ").append(toIndentedString(mappedServiceIds)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
