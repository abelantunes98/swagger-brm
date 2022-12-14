package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CreditCardType;
import io.swagger.model.DirectDebitType;
import io.swagger.model.InvoiceType;
import io.swagger.model.SepaType;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A payment method.
 */
@Schema(description = "A payment method.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PaymentMethod   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("creditCard")
  private CreditCardType creditCard = null;

  @JsonProperty("directDebit")
  private DirectDebitType directDebit = null;

  @JsonProperty("invoice")
  private InvoiceType invoice = null;

  @JsonProperty("sepa")
  private SepaType sepa = null;

  @JsonProperty("paymentType")
  private Integer paymentType = null;

  public PaymentMethod extension(Object extension) {
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

  public PaymentMethod creditCard(CreditCardType creditCard) {
    this.creditCard = creditCard;
    return this;
  }

  /**
   * Get creditCard
   * @return creditCard
   **/
  @Schema(description = "")
  
    @Valid
    public CreditCardType getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(CreditCardType creditCard) {
    this.creditCard = creditCard;
  }

  public PaymentMethod directDebit(DirectDebitType directDebit) {
    this.directDebit = directDebit;
    return this;
  }

  /**
   * Get directDebit
   * @return directDebit
   **/
  @Schema(description = "")
  
    @Valid
    public DirectDebitType getDirectDebit() {
    return directDebit;
  }

  public void setDirectDebit(DirectDebitType directDebit) {
    this.directDebit = directDebit;
  }

  public PaymentMethod invoice(InvoiceType invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   * @return invoice
   **/
  @Schema(description = "")
  
    @Valid
    public InvoiceType getInvoice() {
    return invoice;
  }

  public void setInvoice(InvoiceType invoice) {
    this.invoice = invoice;
  }

  public PaymentMethod sepa(SepaType sepa) {
    this.sepa = sepa;
    return this;
  }

  /**
   * Get sepa
   * @return sepa
   **/
  @Schema(description = "")
  
    @Valid
    public SepaType getSepa() {
    return sepa;
  }

  public void setSepa(SepaType sepa) {
    this.sepa = sepa;
  }

  public PaymentMethod paymentType(Integer paymentType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.extension, paymentMethod.extension) &&
        Objects.equals(this.creditCard, paymentMethod.creditCard) &&
        Objects.equals(this.directDebit, paymentMethod.directDebit) &&
        Objects.equals(this.invoice, paymentMethod.invoice) &&
        Objects.equals(this.sepa, paymentMethod.sepa) &&
        Objects.equals(this.paymentType, paymentMethod.paymentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, creditCard, directDebit, invoice, sepa, paymentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    sepa: ").append(toIndentedString(sepa)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
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
