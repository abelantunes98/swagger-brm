package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CreditCardType;
import io.swagger.model.DirectDebitType;
import io.swagger.model.InvoiceType;
import io.swagger.model.ResourceRef;
import io.swagger.model.SepaType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PayMethod
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PayMethod   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("paymentType")
  private Integer paymentType = null;

  @JsonProperty("creditCard")
  private CreditCardType creditCard = null;

  @JsonProperty("directDebit")
  private DirectDebitType directDebit = null;

  @JsonProperty("invoice")
  private InvoiceType invoice = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("assignedBillUnits")
  @Valid
  private List<String> assignedBillUnits = null;

  @JsonProperty("deassignedBillUnits")
  @Valid
  private List<String> deassignedBillUnits = null;

  @JsonProperty("sepa")
  private SepaType sepa = null;

  public PayMethod extension(Object extension) {
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

  public PayMethod paymentType(Integer paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The payment type. Can be one of the following: <ul><li><b>0</b>: Undefined</li><li><b>10000</b>: Prepaid</li><li><b>10001</b>: Invoice</li><li><b>10002</b>: Debit card</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: US or Canada direct debit</li><li><b>10006</b>: Smartcard</li><li><b>10007</b>: Subordinate</li><li><b>10011</b>: Cash</li><li><b>10012</b>: Check</li><li><b>10013</b>: Wire transfer</li><li><b>10014</b>: Inter-bank payment order</li><li><b>10015</b>: Postal payment order</li><li><b>10016</b>: Voucher</li><li><b>10017</b>: Failed payment</li><li><b>10018</b>: SEPA payment</li></ul>
   * @return paymentType
   **/
  @Schema(description = "The payment type. Can be one of the following: <ul><li><b>0</b>: Undefined</li><li><b>10000</b>: Prepaid</li><li><b>10001</b>: Invoice</li><li><b>10002</b>: Debit card</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: US or Canada direct debit</li><li><b>10006</b>: Smartcard</li><li><b>10007</b>: Subordinate</li><li><b>10011</b>: Cash</li><li><b>10012</b>: Check</li><li><b>10013</b>: Wire transfer</li><li><b>10014</b>: Inter-bank payment order</li><li><b>10015</b>: Postal payment order</li><li><b>10016</b>: Voucher</li><li><b>10017</b>: Failed payment</li><li><b>10018</b>: SEPA payment</li></ul>")
  
    public Integer getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Integer paymentType) {
    this.paymentType = paymentType;
  }

  public PayMethod creditCard(CreditCardType creditCard) {
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

  public PayMethod directDebit(DirectDebitType directDebit) {
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

  public PayMethod invoice(InvoiceType invoice) {
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

  public PayMethod accountRef(ResourceRef accountRef) {
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

  public PayMethod assignedBillUnits(List<String> assignedBillUnits) {
    this.assignedBillUnits = assignedBillUnits;
    return this;
  }

  public PayMethod addAssignedBillUnitsItem(String assignedBillUnitsItem) {
    if (this.assignedBillUnits == null) {
      this.assignedBillUnits = new ArrayList<String>();
    }
    this.assignedBillUnits.add(assignedBillUnitsItem);
    return this;
  }

  /**
   * Bill units assigned to the payment method.
   * @return assignedBillUnits
   **/
  @Schema(description = "Bill units assigned to the payment method.")
  
    public List<String> getAssignedBillUnits() {
    return assignedBillUnits;
  }

  public void setAssignedBillUnits(List<String> assignedBillUnits) {
    this.assignedBillUnits = assignedBillUnits;
  }

  public PayMethod deassignedBillUnits(List<String> deassignedBillUnits) {
    this.deassignedBillUnits = deassignedBillUnits;
    return this;
  }

  public PayMethod addDeassignedBillUnitsItem(String deassignedBillUnitsItem) {
    if (this.deassignedBillUnits == null) {
      this.deassignedBillUnits = new ArrayList<String>();
    }
    this.deassignedBillUnits.add(deassignedBillUnitsItem);
    return this;
  }

  /**
   * Bill units to deassign from the payment method.
   * @return deassignedBillUnits
   **/
  @Schema(description = "Bill units to deassign from the payment method.")
  
    public List<String> getDeassignedBillUnits() {
    return deassignedBillUnits;
  }

  public void setDeassignedBillUnits(List<String> deassignedBillUnits) {
    this.deassignedBillUnits = deassignedBillUnits;
  }

  public PayMethod sepa(SepaType sepa) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayMethod payMethod = (PayMethod) o;
    return Objects.equals(this.extension, payMethod.extension) &&
        Objects.equals(this.paymentType, payMethod.paymentType) &&
        Objects.equals(this.creditCard, payMethod.creditCard) &&
        Objects.equals(this.directDebit, payMethod.directDebit) &&
        Objects.equals(this.invoice, payMethod.invoice) &&
        Objects.equals(this.accountRef, payMethod.accountRef) &&
        Objects.equals(this.assignedBillUnits, payMethod.assignedBillUnits) &&
        Objects.equals(this.deassignedBillUnits, payMethod.deassignedBillUnits) &&
        Objects.equals(this.sepa, payMethod.sepa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, paymentType, creditCard, directDebit, invoice, accountRef, assignedBillUnits, deassignedBillUnits, sepa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayMethod {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    directDebit: ").append(toIndentedString(directDebit)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    assignedBillUnits: ").append(toIndentedString(assignedBillUnits)).append("\n");
    sb.append("    deassignedBillUnits: ").append(toIndentedString(deassignedBillUnits)).append("\n");
    sb.append("    sepa: ").append(toIndentedString(sepa)).append("\n");
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
