package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Chargeoffers;
import io.swagger.model.Discountoffers;
import io.swagger.model.ResourceRef;
import io.swagger.model.Service;
import io.swagger.model.SubscriptionTerms;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bundle.
 */
@Schema(description = "A bundle.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Bundle   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("bundleId")
  private String bundleId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("permitted")
  private String permitted = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("tags")
  private String tags = null;

  @JsonProperty("ref")
  private ResourceRef ref = null;

  @JsonProperty("chargeoffers")
  @Valid
  private List<Chargeoffers> chargeoffers = null;

  @JsonProperty("discountoffers")
  @Valid
  private List<Discountoffers> discountoffers = null;

  @JsonProperty("subscriptionTerms")
  private SubscriptionTerms subscriptionTerms = null;

  @JsonProperty("service")
  private Service service = null;

  public Bundle extension(Object extension) {
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

  public Bundle bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * The ID of the bundle.
   * @return bundleId
   **/
  @Schema(description = "The ID of the bundle.")
  
    public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public Bundle name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the bundle.
   * @return name
   **/
  @Schema(description = "The name of the bundle.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bundle permitted(String permitted) {
    this.permitted = permitted;
    return this;
  }

  /**
   * The purchase level permitted for the bundle. This can be a single service (for example, <b>/service/email</b>), all services (<b>/service</b>), all accounts (<b>/account</b>), or all accounts and services (<b>*</b>).
   * @return permitted
   **/
  @Schema(description = "The purchase level permitted for the bundle. This can be a single service (for example, <b>/service/email</b>), all services (<b>/service</b>), all accounts (<b>/account</b>), or all accounts and services (<b>*</b>).")
  
    public String getPermitted() {
    return permitted;
  }

  public void setPermitted(String permitted) {
    this.permitted = permitted;
  }

  public Bundle creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the bundle was created.
   * @return creationDate
   **/
  @Schema(required = true, description = "The date and time the bundle was created.")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Bundle description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The bundle's description.
   * @return description
   **/
  @Schema(description = "The bundle's description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bundle validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the validity period ends.
   * @return validTo
   **/
  @Schema(description = "The date and time the validity period ends.")
  
    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public Bundle tags(String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * The tags associated with the bundle.
   * @return tags
   **/
  @Schema(description = "The tags associated with the bundle.")
  
    public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public Bundle ref(ResourceRef ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getRef() {
    return ref;
  }

  public void setRef(ResourceRef ref) {
    this.ref = ref;
  }

  public Bundle chargeoffers(List<Chargeoffers> chargeoffers) {
    this.chargeoffers = chargeoffers;
    return this;
  }

  public Bundle addChargeoffersItem(Chargeoffers chargeoffersItem) {
    if (this.chargeoffers == null) {
      this.chargeoffers = new ArrayList<Chargeoffers>();
    }
    this.chargeoffers.add(chargeoffersItem);
    return this;
  }

  /**
   * The list of charge offers in the bundle.
   * @return chargeoffers
   **/
  @Schema(description = "The list of charge offers in the bundle.")
      @Valid
    public List<Chargeoffers> getChargeoffers() {
    return chargeoffers;
  }

  public void setChargeoffers(List<Chargeoffers> chargeoffers) {
    this.chargeoffers = chargeoffers;
  }

  public Bundle discountoffers(List<Discountoffers> discountoffers) {
    this.discountoffers = discountoffers;
    return this;
  }

  public Bundle addDiscountoffersItem(Discountoffers discountoffersItem) {
    if (this.discountoffers == null) {
      this.discountoffers = new ArrayList<Discountoffers>();
    }
    this.discountoffers.add(discountoffersItem);
    return this;
  }

  /**
   * The list of discount offers in the bundle.
   * @return discountoffers
   **/
  @Schema(description = "The list of discount offers in the bundle.")
      @Valid
    public List<Discountoffers> getDiscountoffers() {
    return discountoffers;
  }

  public void setDiscountoffers(List<Discountoffers> discountoffers) {
    this.discountoffers = discountoffers;
  }

  public Bundle subscriptionTerms(SubscriptionTerms subscriptionTerms) {
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

  public Bundle service(Service service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   **/
  @Schema(description = "")
  
    @Valid
    public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bundle bundle = (Bundle) o;
    return Objects.equals(this.extension, bundle.extension) &&
        Objects.equals(this.bundleId, bundle.bundleId) &&
        Objects.equals(this.name, bundle.name) &&
        Objects.equals(this.permitted, bundle.permitted) &&
        Objects.equals(this.creationDate, bundle.creationDate) &&
        Objects.equals(this.description, bundle.description) &&
        Objects.equals(this.validTo, bundle.validTo) &&
        Objects.equals(this.tags, bundle.tags) &&
        Objects.equals(this.ref, bundle.ref) &&
        Objects.equals(this.chargeoffers, bundle.chargeoffers) &&
        Objects.equals(this.discountoffers, bundle.discountoffers) &&
        Objects.equals(this.subscriptionTerms, bundle.subscriptionTerms) &&
        Objects.equals(this.service, bundle.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, bundleId, name, permitted, creationDate, description, validTo, tags, ref, chargeoffers, discountoffers, subscriptionTerms, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bundle {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permitted: ").append(toIndentedString(permitted)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    chargeoffers: ").append(toIndentedString(chargeoffers)).append("\n");
    sb.append("    discountoffers: ").append(toIndentedString(discountoffers)).append("\n");
    sb.append("    subscriptionTerms: ").append(toIndentedString(subscriptionTerms)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
