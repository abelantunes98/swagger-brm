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
 * PayinfoType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PayinfoType   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private ResourceRef id = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("accountObj")
  private ResourceRef accountObj = null;

  @JsonProperty("paymentType")
  private Integer paymentType = null;

  @JsonProperty("name")
  private String name = null;

  public PayinfoType extension(Object extension) {
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

  public PayinfoType id(ResourceRef id) {
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

  public PayinfoType creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the payment type was created.
   * @return creationDate
   **/
  @Schema(description = "The date and time the payment type was created.")
  
    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public PayinfoType accountObj(ResourceRef accountObj) {
    this.accountObj = accountObj;
    return this;
  }

  /**
   * Get accountObj
   * @return accountObj
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountObj() {
    return accountObj;
  }

  public void setAccountObj(ResourceRef accountObj) {
    this.accountObj = accountObj;
  }

  public PayinfoType paymentType(Integer paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The payment type.
   * @return paymentType
   **/
  @Schema(description = "The payment type.")
  
    public Integer getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Integer paymentType) {
    this.paymentType = paymentType;
  }

  public PayinfoType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the payment type.
   * @return name
   **/
  @Schema(description = "The name of the payment type.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayinfoType payinfoType = (PayinfoType) o;
    return Objects.equals(this.extension, payinfoType.extension) &&
        Objects.equals(this.id, payinfoType.id) &&
        Objects.equals(this.creationDate, payinfoType.creationDate) &&
        Objects.equals(this.accountObj, payinfoType.accountObj) &&
        Objects.equals(this.paymentType, payinfoType.paymentType) &&
        Objects.equals(this.name, payinfoType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, creationDate, accountObj, paymentType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayinfoType {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    accountObj: ").append(toIndentedString(accountObj)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
