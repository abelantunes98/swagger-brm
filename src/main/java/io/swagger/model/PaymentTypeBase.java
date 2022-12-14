package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The details of the payment type. Can be one of the following: &lt;ul&gt;&lt;li&gt;&lt;b&gt;Externalpayment10011&lt;/b&gt;: Cash&lt;/li&gt;&lt;li&gt;&lt;b&gt;Externalpayment10012&lt;/b&gt;: Check&lt;/li&gt;&lt;li&gt;&lt;b&gt;Externalpayment10013&lt;/b&gt;: Wire transfer&lt;/li&gt;&lt;li&gt;&lt;b&gt;Externalpayment10014&lt;/b&gt;: Inter-bank payment order&lt;/li&gt;&lt;li&gt;&lt;b&gt;Externalpayment10015&lt;/b&gt;: Postal payment order&lt;/li&gt;&lt;li&gt;&lt;b&gt;Externalpayment10017&lt;/b&gt;: Failed payment&lt;/li&gt;&lt;li&gt;&lt;b&gt;Externalpayment10018&lt;/b&gt;: SEPA payment&lt;/li&gt;&lt;/ul&gt;
 */
@Schema(description = "The details of the payment type. Can be one of the following: <ul><li><b>Externalpayment10011</b>: Cash</li><li><b>Externalpayment10012</b>: Check</li><li><b>Externalpayment10013</b>: Wire transfer</li><li><b>Externalpayment10014</b>: Inter-bank payment order</li><li><b>Externalpayment10015</b>: Postal payment order</li><li><b>Externalpayment10017</b>: Failed payment</li><li><b>Externalpayment10018</b>: SEPA payment</li></ul>")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@class", visible = true )
@JsonSubTypes({
})


public class PaymentTypeBase   {
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

  public PaymentTypeBase extension(Object extension) {
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

  public PaymentTypeBase id(ResourceRef id) {
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

  public PaymentTypeBase creationDate(OffsetDateTime creationDate) {
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

  public PaymentTypeBase accountObj(ResourceRef accountObj) {
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

  public PaymentTypeBase paymentType(Integer paymentType) {
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

  public PaymentTypeBase name(String name) {
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
    PaymentTypeBase paymentTypeBase = (PaymentTypeBase) o;
    return Objects.equals(this.extension, paymentTypeBase.extension) &&
        Objects.equals(this.id, paymentTypeBase.id) &&
        Objects.equals(this.creationDate, paymentTypeBase.creationDate) &&
        Objects.equals(this.accountObj, paymentTypeBase.accountObj) &&
        Objects.equals(this.paymentType, paymentTypeBase.paymentType) &&
        Objects.equals(this.name, paymentTypeBase.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, creationDate, accountObj, paymentType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTypeBase {\n");
    
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
