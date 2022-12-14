package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of products associated with the service.
 */
@Schema(description = "The list of products associated with the service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Product   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private ResourceRef id = null;

  @JsonProperty("productRef")
  private ResourceRef productRef = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("planName")
  private String planName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("purchaseDate")
  private OffsetDateTime purchaseDate = null;

  @JsonProperty("purchaseEndDate")
  private OffsetDateTime purchaseEndDate = null;

  @JsonProperty("lastStatusChange")
  private OffsetDateTime lastStatusChange = null;

  @JsonProperty("isOfferCustomized")
  private Boolean isOfferCustomized = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private Integer type = null;

  public Product extension(Object extension) {
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

  public Product id(ResourceRef id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getId() {
    return id;
  }

  public void setId(ResourceRef id) {
    this.id = id;
  }

  public Product productRef(ResourceRef productRef) {
    this.productRef = productRef;
    return this;
  }

  /**
   * Get productRef
   * @return productRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getProductRef() {
    return productRef;
  }

  public void setProductRef(ResourceRef productRef) {
    this.productRef = productRef;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The product's name.
   * @return name
   **/
  @Schema(description = "The product's name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * The name of the package that contains the product.
   * @return planName
   **/
  @Schema(description = "The name of the package that contains the product.")
  
    public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The product's descritpion.
   * @return description
   **/
  @Schema(description = "The product's descritpion.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product purchaseDate(OffsetDateTime purchaseDate) {
    this.purchaseDate = purchaseDate;
    return this;
  }

  /**
   * The date and time the product was purchased.
   * @return purchaseDate
   **/
  @Schema(required = true, description = "The date and time the product was purchased.")
      @NotNull

    @Valid
    public OffsetDateTime getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(OffsetDateTime purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public Product purchaseEndDate(OffsetDateTime purchaseEndDate) {
    this.purchaseEndDate = purchaseEndDate;
    return this;
  }

  /**
   * The date and time the purchase ends.
   * @return purchaseEndDate
   **/
  @Schema(required = true, description = "The date and time the purchase ends.")
      @NotNull

    @Valid
    public OffsetDateTime getPurchaseEndDate() {
    return purchaseEndDate;
  }

  public void setPurchaseEndDate(OffsetDateTime purchaseEndDate) {
    this.purchaseEndDate = purchaseEndDate;
  }

  public Product lastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
    return this;
  }

  /**
   * The date and time the product's status was last changed.
   * @return lastStatusChange
   **/
  @Schema(description = "The date and time the product's status was last changed.")
  
    @Valid
    public OffsetDateTime getLastStatusChange() {
    return lastStatusChange;
  }

  public void setLastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
  }

  public Product isOfferCustomized(Boolean isOfferCustomized) {
    this.isOfferCustomized = isOfferCustomized;
    return this;
  }

  /**
   * Whether the product contains customized offers (<b>true</b>) or not (<b>false</b>).
   * @return isOfferCustomized
   **/
  @Schema(description = "Whether the product contains customized offers (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isIsOfferCustomized() {
    return isOfferCustomized;
  }

  public void setIsOfferCustomized(Boolean isOfferCustomized) {
    this.isOfferCustomized = isOfferCustomized;
  }

  public Product status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The product's status.
   * @return status
   **/
  @Schema(description = "The product's status.")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Product type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * The type of product. Can be one of the following: <ul><li><b>0</b>: Optional</li><li><b>1</b>: Required</li><li><b>2</b>: Regular</li></ul>
   * @return type
   **/
  @Schema(description = "The type of product. Can be one of the following: <ul><li><b>0</b>: Optional</li><li><b>1</b>: Required</li><li><b>2</b>: Regular</li></ul>")
  
    public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.extension, product.extension) &&
        Objects.equals(this.id, product.id) &&
        Objects.equals(this.productRef, product.productRef) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.planName, product.planName) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.purchaseDate, product.purchaseDate) &&
        Objects.equals(this.purchaseEndDate, product.purchaseEndDate) &&
        Objects.equals(this.lastStatusChange, product.lastStatusChange) &&
        Objects.equals(this.isOfferCustomized, product.isOfferCustomized) &&
        Objects.equals(this.status, product.status) &&
        Objects.equals(this.type, product.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, productRef, name, planName, description, purchaseDate, purchaseEndDate, lastStatusChange, isOfferCustomized, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purchaseDate: ").append(toIndentedString(purchaseDate)).append("\n");
    sb.append("    purchaseEndDate: ").append(toIndentedString(purchaseEndDate)).append("\n");
    sb.append("    lastStatusChange: ").append(toIndentedString(lastStatusChange)).append("\n");
    sb.append("    isOfferCustomized: ").append(toIndentedString(isOfferCustomized)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
