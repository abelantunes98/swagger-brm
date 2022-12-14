package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Details;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A credit card payment method.
 */
@Schema(description = "A credit card payment method.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CreditCardType   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("paymentType")
  private Integer paymentType = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("correctiveInvoiceType")
  private Integer correctiveInvoiceType = null;

  @JsonProperty("details")
  private Details details = null;

  public CreditCardType extension(Object extension) {
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

  public CreditCardType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID.
   * @return id
   **/
  @Schema(description = "The ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreditCardType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The payment instrument's name.
   * @return name
   **/
  @Schema(description = "The payment instrument's name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreditCardType paymentType(Integer paymentType) {
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

  public CreditCardType accountRef(ResourceRef accountRef) {
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

  public CreditCardType correctiveInvoiceType(Integer correctiveInvoiceType) {
    this.correctiveInvoiceType = correctiveInvoiceType;
    return this;
  }

  /**
   * The type of invoice to create, such as an invoice correction letter or a replacement invoice.
   * @return correctiveInvoiceType
   **/
  @Schema(description = "The type of invoice to create, such as an invoice correction letter or a replacement invoice.")
  
    public Integer getCorrectiveInvoiceType() {
    return correctiveInvoiceType;
  }

  public void setCorrectiveInvoiceType(Integer correctiveInvoiceType) {
    this.correctiveInvoiceType = correctiveInvoiceType;
  }

  public CreditCardType details(Details details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   **/
  @Schema(description = "")
  
    @Valid
    public Details getDetails() {
    return details;
  }

  public void setDetails(Details details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardType creditCardType = (CreditCardType) o;
    return Objects.equals(this.extension, creditCardType.extension) &&
        Objects.equals(this.id, creditCardType.id) &&
        Objects.equals(this.name, creditCardType.name) &&
        Objects.equals(this.paymentType, creditCardType.paymentType) &&
        Objects.equals(this.accountRef, creditCardType.accountRef) &&
        Objects.equals(this.correctiveInvoiceType, creditCardType.correctiveInvoiceType) &&
        Objects.equals(this.details, creditCardType.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, name, paymentType, accountRef, correctiveInvoiceType, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardType {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    correctiveInvoiceType: ").append(toIndentedString(correctiveInvoiceType)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
