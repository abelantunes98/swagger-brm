package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillDetails;
import io.swagger.model.Notes;
import io.swagger.model.OriginalPaymentDetails;
import io.swagger.model.PaymentAuditDetailsType;
import io.swagger.model.PaymentTypeBase;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about a payment.
 */
@Schema(description = "Details about a payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PaymentDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("originalPaymentAmount")
  private BigDecimal originalPaymentAmount = null;

  @JsonProperty("allocatedAmount")
  private BigDecimal allocatedAmount = null;

  @JsonProperty("unallocatedAmount")
  private BigDecimal unallocatedAmount = null;

  @JsonProperty("currencyId")
  private Integer currencyId = null;

  @JsonProperty("receiptDate")
  private OffsetDateTime receiptDate = null;

  @JsonProperty("postedDate")
  private OffsetDateTime postedDate = null;

  @JsonProperty("paymentType")
  private Long paymentType = null;

  @JsonProperty("paymentAction")
  private Integer paymentAction = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("subTransactionId")
  private String subTransactionId = null;

  @JsonProperty("eventRef")
  private ResourceRef eventRef = null;

  @JsonProperty("notes")
  @Valid
  private List<Notes> notes = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("reversalId")
  private String reversalId = null;

  @JsonProperty("reversalAmount")
  private BigDecimal reversalAmount = null;

  @JsonProperty("reversalDate")
  private OffsetDateTime reversalDate = null;

  @JsonProperty("payinfoTypeObject")
  private PaymentTypeBase payinfoTypeObject = null;

  @JsonProperty("originalPaymentDetails")
  private OriginalPaymentDetails originalPaymentDetails = null;

  @JsonProperty("billDetails")
  @Valid
  private List<BillDetails> billDetails = null;

  @JsonProperty("paymentAuditDetails")
  @Valid
  private List<PaymentAuditDetailsType> paymentAuditDetails = null;

  public PaymentDetails extension(Object extension) {
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

  public PaymentDetails originalPaymentAmount(BigDecimal originalPaymentAmount) {
    this.originalPaymentAmount = originalPaymentAmount;
    return this;
  }

  /**
   * The amount paid against the original bill.
   * @return originalPaymentAmount
   **/
  @Schema(description = "The amount paid against the original bill.")
  
    @Valid
    public BigDecimal getOriginalPaymentAmount() {
    return originalPaymentAmount;
  }

  public void setOriginalPaymentAmount(BigDecimal originalPaymentAmount) {
    this.originalPaymentAmount = originalPaymentAmount;
  }

  public PaymentDetails allocatedAmount(BigDecimal allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
    return this;
  }

  /**
   * The amount of the payment that has been allocated.
   * @return allocatedAmount
   **/
  @Schema(description = "The amount of the payment that has been allocated.")
  
    @Valid
    public BigDecimal getAllocatedAmount() {
    return allocatedAmount;
  }

  public void setAllocatedAmount(BigDecimal allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
  }

  public PaymentDetails unallocatedAmount(BigDecimal unallocatedAmount) {
    this.unallocatedAmount = unallocatedAmount;
    return this;
  }

  /**
   * The amount of the payment that hasn't been allocated yet.
   * @return unallocatedAmount
   **/
  @Schema(description = "The amount of the payment that hasn't been allocated yet.")
  
    @Valid
    public BigDecimal getUnallocatedAmount() {
    return unallocatedAmount;
  }

  public void setUnallocatedAmount(BigDecimal unallocatedAmount) {
    this.unallocatedAmount = unallocatedAmount;
  }

  public PaymentDetails currencyId(Integer currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * The currency ID of the payment.
   * @return currencyId
   **/
  @Schema(description = "The currency ID of the payment.")
  
    public Integer getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Integer currencyId) {
    this.currencyId = currencyId;
  }

  public PaymentDetails receiptDate(OffsetDateTime receiptDate) {
    this.receiptDate = receiptDate;
    return this;
  }

  /**
   * The date and time the payment receipt was issued.
   * @return receiptDate
   **/
  @Schema(description = "The date and time the payment receipt was issued.")
  
    @Valid
    public OffsetDateTime getReceiptDate() {
    return receiptDate;
  }

  public void setReceiptDate(OffsetDateTime receiptDate) {
    this.receiptDate = receiptDate;
  }

  public PaymentDetails postedDate(OffsetDateTime postedDate) {
    this.postedDate = postedDate;
    return this;
  }

  /**
   * The date and time the payment was posted.
   * @return postedDate
   **/
  @Schema(description = "The date and time the payment was posted.")
  
    @Valid
    public OffsetDateTime getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(OffsetDateTime postedDate) {
    this.postedDate = postedDate;
  }

  public PaymentDetails paymentType(Long paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The payment type. Can be one of the following: <ul><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>
   * @return paymentType
   **/
  @Schema(description = "The payment type. Can be one of the following: <ul><li><b>10001</b>:Invoice</li><li><b>10003</b>: Credit card</li><li><b>10005</b>: Direct debit</li><li><b>10007</b>: Subordinate</li></ul>")
  
    public Long getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(Long paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentDetails paymentAction(Integer paymentAction) {
    this.paymentAction = paymentAction;
    return this;
  }

  /**
   * Whether the payment has been reversed or suspended. Can be one of the following: <ul><li><b>0</b>: Not reversed. </li><li><b>1</b>: Reversed. </li><li><b>2</b>: Suspended.</li></ul>
   * @return paymentAction
   **/
  @Schema(description = "Whether the payment has been reversed or suspended. Can be one of the following: <ul><li><b>0</b>: Not reversed. </li><li><b>1</b>: Reversed. </li><li><b>2</b>: Suspended.</li></ul>")
  
    public Integer getPaymentAction() {
    return paymentAction;
  }

  public void setPaymentAction(Integer paymentAction) {
    this.paymentAction = paymentAction;
  }

  public PaymentDetails paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * The ID of the payment.
   * @return paymentId
   **/
  @Schema(description = "The ID of the payment.")
  
    public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentDetails transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * The ID of the transaction.
   * @return transactionId
   **/
  @Schema(description = "The ID of the transaction.")
  
    public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PaymentDetails subTransactionId(String subTransactionId) {
    this.subTransactionId = subTransactionId;
    return this;
  }

  /**
   * The ID of the subtransaction.
   * @return subTransactionId
   **/
  @Schema(description = "The ID of the subtransaction.")
  
    public String getSubTransactionId() {
    return subTransactionId;
  }

  public void setSubTransactionId(String subTransactionId) {
    this.subTransactionId = subTransactionId;
  }

  public PaymentDetails eventRef(ResourceRef eventRef) {
    this.eventRef = eventRef;
    return this;
  }

  /**
   * Get eventRef
   * @return eventRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getEventRef() {
    return eventRef;
  }

  public void setEventRef(ResourceRef eventRef) {
    this.eventRef = eventRef;
  }

  public PaymentDetails notes(List<Notes> notes) {
    this.notes = notes;
    return this;
  }

  public PaymentDetails addNotesItem(Notes notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Notes>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Notes associated with the payment.
   * @return notes
   **/
  @Schema(description = "Notes associated with the payment.")
      @Valid
    public List<Notes> getNotes() {
    return notes;
  }

  public void setNotes(List<Notes> notes) {
    this.notes = notes;
  }

  public PaymentDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The ID of the account.
   * @return accountId
   **/
  @Schema(required = true, description = "The ID of the account.")
      @NotNull

    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public PaymentDetails reversalId(String reversalId) {
    this.reversalId = reversalId;
    return this;
  }

  /**
   * The ID of the payment reversal.
   * @return reversalId
   **/
  @Schema(required = true, description = "The ID of the payment reversal.")
      @NotNull

    public String getReversalId() {
    return reversalId;
  }

  public void setReversalId(String reversalId) {
    this.reversalId = reversalId;
  }

  public PaymentDetails reversalAmount(BigDecimal reversalAmount) {
    this.reversalAmount = reversalAmount;
    return this;
  }

  /**
   * The amount of the payment reversal.
   * @return reversalAmount
   **/
  @Schema(required = true, description = "The amount of the payment reversal.")
      @NotNull

    @Valid
    public BigDecimal getReversalAmount() {
    return reversalAmount;
  }

  public void setReversalAmount(BigDecimal reversalAmount) {
    this.reversalAmount = reversalAmount;
  }

  public PaymentDetails reversalDate(OffsetDateTime reversalDate) {
    this.reversalDate = reversalDate;
    return this;
  }

  /**
   * The date and time the payment reversal occurred.
   * @return reversalDate
   **/
  @Schema(description = "The date and time the payment reversal occurred.")
  
    @Valid
    public OffsetDateTime getReversalDate() {
    return reversalDate;
  }

  public void setReversalDate(OffsetDateTime reversalDate) {
    this.reversalDate = reversalDate;
  }

  public PaymentDetails payinfoTypeObject(PaymentTypeBase payinfoTypeObject) {
    this.payinfoTypeObject = payinfoTypeObject;
    return this;
  }

  /**
   * Get payinfoTypeObject
   * @return payinfoTypeObject
   **/
  @Schema(description = "")
  
    @Valid
    public PaymentTypeBase getPayinfoTypeObject() {
    return payinfoTypeObject;
  }

  public void setPayinfoTypeObject(PaymentTypeBase payinfoTypeObject) {
    this.payinfoTypeObject = payinfoTypeObject;
  }

  public PaymentDetails originalPaymentDetails(OriginalPaymentDetails originalPaymentDetails) {
    this.originalPaymentDetails = originalPaymentDetails;
    return this;
  }

  /**
   * Get originalPaymentDetails
   * @return originalPaymentDetails
   **/
  @Schema(description = "")
  
    @Valid
    public OriginalPaymentDetails getOriginalPaymentDetails() {
    return originalPaymentDetails;
  }

  public void setOriginalPaymentDetails(OriginalPaymentDetails originalPaymentDetails) {
    this.originalPaymentDetails = originalPaymentDetails;
  }

  public PaymentDetails billDetails(List<BillDetails> billDetails) {
    this.billDetails = billDetails;
    return this;
  }

  public PaymentDetails addBillDetailsItem(BillDetails billDetailsItem) {
    if (this.billDetails == null) {
      this.billDetails = new ArrayList<BillDetails>();
    }
    this.billDetails.add(billDetailsItem);
    return this;
  }

  /**
   * The list of bill details associated with the payment.
   * @return billDetails
   **/
  @Schema(description = "The list of bill details associated with the payment.")
      @Valid
    public List<BillDetails> getBillDetails() {
    return billDetails;
  }

  public void setBillDetails(List<BillDetails> billDetails) {
    this.billDetails = billDetails;
  }

  public PaymentDetails paymentAuditDetails(List<PaymentAuditDetailsType> paymentAuditDetails) {
    this.paymentAuditDetails = paymentAuditDetails;
    return this;
  }

  public PaymentDetails addPaymentAuditDetailsItem(PaymentAuditDetailsType paymentAuditDetailsItem) {
    if (this.paymentAuditDetails == null) {
      this.paymentAuditDetails = new ArrayList<PaymentAuditDetailsType>();
    }
    this.paymentAuditDetails.add(paymentAuditDetailsItem);
    return this;
  }

  /**
   * The list of payment audit details.
   * @return paymentAuditDetails
   **/
  @Schema(description = "The list of payment audit details.")
      @Valid
    public List<PaymentAuditDetailsType> getPaymentAuditDetails() {
    return paymentAuditDetails;
  }

  public void setPaymentAuditDetails(List<PaymentAuditDetailsType> paymentAuditDetails) {
    this.paymentAuditDetails = paymentAuditDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.extension, paymentDetails.extension) &&
        Objects.equals(this.originalPaymentAmount, paymentDetails.originalPaymentAmount) &&
        Objects.equals(this.allocatedAmount, paymentDetails.allocatedAmount) &&
        Objects.equals(this.unallocatedAmount, paymentDetails.unallocatedAmount) &&
        Objects.equals(this.currencyId, paymentDetails.currencyId) &&
        Objects.equals(this.receiptDate, paymentDetails.receiptDate) &&
        Objects.equals(this.postedDate, paymentDetails.postedDate) &&
        Objects.equals(this.paymentType, paymentDetails.paymentType) &&
        Objects.equals(this.paymentAction, paymentDetails.paymentAction) &&
        Objects.equals(this.paymentId, paymentDetails.paymentId) &&
        Objects.equals(this.transactionId, paymentDetails.transactionId) &&
        Objects.equals(this.subTransactionId, paymentDetails.subTransactionId) &&
        Objects.equals(this.eventRef, paymentDetails.eventRef) &&
        Objects.equals(this.notes, paymentDetails.notes) &&
        Objects.equals(this.accountId, paymentDetails.accountId) &&
        Objects.equals(this.reversalId, paymentDetails.reversalId) &&
        Objects.equals(this.reversalAmount, paymentDetails.reversalAmount) &&
        Objects.equals(this.reversalDate, paymentDetails.reversalDate) &&
        Objects.equals(this.payinfoTypeObject, paymentDetails.payinfoTypeObject) &&
        Objects.equals(this.originalPaymentDetails, paymentDetails.originalPaymentDetails) &&
        Objects.equals(this.billDetails, paymentDetails.billDetails) &&
        Objects.equals(this.paymentAuditDetails, paymentDetails.paymentAuditDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, originalPaymentAmount, allocatedAmount, unallocatedAmount, currencyId, receiptDate, postedDate, paymentType, paymentAction, paymentId, transactionId, subTransactionId, eventRef, notes, accountId, reversalId, reversalAmount, reversalDate, payinfoTypeObject, originalPaymentDetails, billDetails, paymentAuditDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    originalPaymentAmount: ").append(toIndentedString(originalPaymentAmount)).append("\n");
    sb.append("    allocatedAmount: ").append(toIndentedString(allocatedAmount)).append("\n");
    sb.append("    unallocatedAmount: ").append(toIndentedString(unallocatedAmount)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    receiptDate: ").append(toIndentedString(receiptDate)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    subTransactionId: ").append(toIndentedString(subTransactionId)).append("\n");
    sb.append("    eventRef: ").append(toIndentedString(eventRef)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    reversalId: ").append(toIndentedString(reversalId)).append("\n");
    sb.append("    reversalAmount: ").append(toIndentedString(reversalAmount)).append("\n");
    sb.append("    reversalDate: ").append(toIndentedString(reversalDate)).append("\n");
    sb.append("    payinfoTypeObject: ").append(toIndentedString(payinfoTypeObject)).append("\n");
    sb.append("    originalPaymentDetails: ").append(toIndentedString(originalPaymentDetails)).append("\n");
    sb.append("    billDetails: ").append(toIndentedString(billDetails)).append("\n");
    sb.append("    paymentAuditDetails: ").append(toIndentedString(paymentAuditDetails)).append("\n");
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
