package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bill
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Bill   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("adjusted")
  private BigDecimal adjusted = null;

  @JsonProperty("arBillinfoRef")
  private ResourceRef arBillinfoRef = null;

  @JsonProperty("billUnitRef")
  private ResourceRef billUnitRef = null;

  @JsonProperty("billNo")
  private String billNo = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("disputed")
  private BigDecimal disputed = null;

  @JsonProperty("currentTotal")
  private BigDecimal currentTotal = null;

  @JsonProperty("due")
  private BigDecimal due = null;

  @JsonProperty("previousTotal")
  private BigDecimal previousTotal = null;

  @JsonProperty("totalDue")
  private BigDecimal totalDue = null;

  @JsonProperty("receivedForBill")
  private BigDecimal receivedForBill = null;

  @JsonProperty("arActionsAmtExcludingPayments")
  private BigDecimal arActionsAmtExcludingPayments = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("cycleEnds")
  private OffsetDateTime cycleEnds = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parent")
  private ResourceRef parent = null;

  @JsonProperty("hierarchySize")
  private Integer hierarchySize = null;

  @JsonProperty("parentAccountRef")
  private ResourceRef parentAccountRef = null;

  @JsonProperty("parentFirstName")
  private String parentFirstName = null;

  @JsonProperty("parentLastName")
  private String parentLastName = null;

  @JsonProperty("parentCompanyName")
  private String parentCompanyName = null;

  @JsonProperty("parentSalutation")
  private String parentSalutation = null;

  @JsonProperty("cycleStarts")
  private OffsetDateTime cycleStarts = null;

  @JsonProperty("subordsTotal")
  private BigDecimal subordsTotal = null;

  @JsonProperty("transfered")
  private BigDecimal transfered = null;

  @JsonProperty("writeoff")
  private BigDecimal writeoff = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("billInfoId")
  private String billInfoId = null;

  @JsonProperty("billPaidDate")
  private OffsetDateTime billPaidDate = null;

  @JsonProperty("recurringCharges")
  private BigDecimal recurringCharges = null;

  @JsonProperty("billDisputed")
  private Boolean billDisputed = null;

  @JsonProperty("originalBillNo")
  private String originalBillNo = null;

  public Bill extension(Object extension) {
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

  public Bill id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID.
   * @return id
   **/
  @Schema(required = true, description = "The ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Bill accountRef(ResourceRef accountRef) {
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

  public Bill adjusted(BigDecimal adjusted) {
    this.adjusted = adjusted;
    return this;
  }

  /**
   * The amount on the bill that was adjusted.
   * @return adjusted
   **/
  @Schema(description = "The amount on the bill that was adjusted.")
  
    @Valid
    public BigDecimal getAdjusted() {
    return adjusted;
  }

  public void setAdjusted(BigDecimal adjusted) {
    this.adjusted = adjusted;
  }

  public Bill arBillinfoRef(ResourceRef arBillinfoRef) {
    this.arBillinfoRef = arBillinfoRef;
    return this;
  }

  /**
   * Get arBillinfoRef
   * @return arBillinfoRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getArBillinfoRef() {
    return arBillinfoRef;
  }

  public void setArBillinfoRef(ResourceRef arBillinfoRef) {
    this.arBillinfoRef = arBillinfoRef;
  }

  public Bill billUnitRef(ResourceRef billUnitRef) {
    this.billUnitRef = billUnitRef;
    return this;
  }

  /**
   * Get billUnitRef
   * @return billUnitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBillUnitRef() {
    return billUnitRef;
  }

  public void setBillUnitRef(ResourceRef billUnitRef) {
    this.billUnitRef = billUnitRef;
  }

  public Bill billNo(String billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * The bill number.
   * @return billNo
   **/
  @Schema(description = "The bill number.")
  
    public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  public Bill creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the bill was created.
   * @return creationDate
   **/
  @Schema(required = true, description = "The date and time the bill was created.")
      @NotNull

    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public Bill currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The type of currency associated with the bill.
   * @return currency
   **/
  @Schema(description = "The type of currency associated with the bill.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public Bill disputed(BigDecimal disputed) {
    this.disputed = disputed;
    return this;
  }

  /**
   * The amount in the bill that is in dispute.
   * @return disputed
   **/
  @Schema(description = "The amount in the bill that is in dispute.")
  
    @Valid
    public BigDecimal getDisputed() {
    return disputed;
  }

  public void setDisputed(BigDecimal disputed) {
    this.disputed = disputed;
  }

  public Bill currentTotal(BigDecimal currentTotal) {
    this.currentTotal = currentTotal;
    return this;
  }

  /**
   * The current total of the bill.
   * @return currentTotal
   **/
  @Schema(description = "The current total of the bill.")
  
    @Valid
    public BigDecimal getCurrentTotal() {
    return currentTotal;
  }

  public void setCurrentTotal(BigDecimal currentTotal) {
    this.currentTotal = currentTotal;
  }

  public Bill due(BigDecimal due) {
    this.due = due;
    return this;
  }

  /**
   * The amount due for the bill.
   * @return due
   **/
  @Schema(description = "The amount due for the bill.")
  
    @Valid
    public BigDecimal getDue() {
    return due;
  }

  public void setDue(BigDecimal due) {
    this.due = due;
  }

  public Bill previousTotal(BigDecimal previousTotal) {
    this.previousTotal = previousTotal;
    return this;
  }

  /**
   * The previous total for the bill.
   * @return previousTotal
   **/
  @Schema(description = "The previous total for the bill.")
  
    @Valid
    public BigDecimal getPreviousTotal() {
    return previousTotal;
  }

  public void setPreviousTotal(BigDecimal previousTotal) {
    this.previousTotal = previousTotal;
  }

  public Bill totalDue(BigDecimal totalDue) {
    this.totalDue = totalDue;
    return this;
  }

  /**
   * The total due for the bill.
   * @return totalDue
   **/
  @Schema(description = "The total due for the bill.")
  
    @Valid
    public BigDecimal getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(BigDecimal totalDue) {
    this.totalDue = totalDue;
  }

  public Bill receivedForBill(BigDecimal receivedForBill) {
    this.receivedForBill = receivedForBill;
    return this;
  }

  /**
   * The payment amount received for the bill.
   * @return receivedForBill
   **/
  @Schema(description = "The payment amount received for the bill.")
  
    @Valid
    public BigDecimal getReceivedForBill() {
    return receivedForBill;
  }

  public void setReceivedForBill(BigDecimal receivedForBill) {
    this.receivedForBill = receivedForBill;
  }

  public Bill arActionsAmtExcludingPayments(BigDecimal arActionsAmtExcludingPayments) {
    this.arActionsAmtExcludingPayments = arActionsAmtExcludingPayments;
    return this;
  }

  /**
   * The total of all accounts receivable actions applied toward the bill, excluding any payments.
   * @return arActionsAmtExcludingPayments
   **/
  @Schema(description = "The total of all accounts receivable actions applied toward the bill, excluding any payments.")
  
    @Valid
    public BigDecimal getArActionsAmtExcludingPayments() {
    return arActionsAmtExcludingPayments;
  }

  public void setArActionsAmtExcludingPayments(BigDecimal arActionsAmtExcludingPayments) {
    this.arActionsAmtExcludingPayments = arActionsAmtExcludingPayments;
  }

  public Bill dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The date and time the bill is due.
   * @return dueDate
   **/
  @Schema(description = "The date and time the bill is due.")
  
    @Valid
    public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Bill cycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
    return this;
  }

  /**
   * The date and time the billing cycle ends.
   * @return cycleEnds
   **/
  @Schema(description = "The date and time the billing cycle ends.")
  
    @Valid
    public OffsetDateTime getCycleEnds() {
    return cycleEnds;
  }

  public void setCycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
  }

  public Bill name(String name) {
    this.name = name;
    return this;
  }

  /**
   * he name of the bill.
   * @return name
   **/
  @Schema(description = "he name of the bill.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bill parent(ResourceRef parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getParent() {
    return parent;
  }

  public void setParent(ResourceRef parent) {
    this.parent = parent;
  }

  public Bill hierarchySize(Integer hierarchySize) {
    this.hierarchySize = hierarchySize;
    return this;
  }

  /**
   * The number of bills in a hierarchy.
   * @return hierarchySize
   **/
  @Schema(description = "The number of bills in a hierarchy.")
  
    public Integer getHierarchySize() {
    return hierarchySize;
  }

  public void setHierarchySize(Integer hierarchySize) {
    this.hierarchySize = hierarchySize;
  }

  public Bill parentAccountRef(ResourceRef parentAccountRef) {
    this.parentAccountRef = parentAccountRef;
    return this;
  }

  /**
   * Get parentAccountRef
   * @return parentAccountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getParentAccountRef() {
    return parentAccountRef;
  }

  public void setParentAccountRef(ResourceRef parentAccountRef) {
    this.parentAccountRef = parentAccountRef;
  }

  public Bill parentFirstName(String parentFirstName) {
    this.parentFirstName = parentFirstName;
    return this;
  }

  /**
   * The first name of the parent associated with the bill.
   * @return parentFirstName
   **/
  @Schema(description = "The first name of the parent associated with the bill.")
  
    public String getParentFirstName() {
    return parentFirstName;
  }

  public void setParentFirstName(String parentFirstName) {
    this.parentFirstName = parentFirstName;
  }

  public Bill parentLastName(String parentLastName) {
    this.parentLastName = parentLastName;
    return this;
  }

  /**
   * The last name of the parent associated with the bill.
   * @return parentLastName
   **/
  @Schema(description = "The last name of the parent associated with the bill.")
  
    public String getParentLastName() {
    return parentLastName;
  }

  public void setParentLastName(String parentLastName) {
    this.parentLastName = parentLastName;
  }

  public Bill parentCompanyName(String parentCompanyName) {
    this.parentCompanyName = parentCompanyName;
    return this;
  }

  /**
   * The company name of the parent associated with the bill.
   * @return parentCompanyName
   **/
  @Schema(required = true, description = "The company name of the parent associated with the bill.")
      @NotNull

    public String getParentCompanyName() {
    return parentCompanyName;
  }

  public void setParentCompanyName(String parentCompanyName) {
    this.parentCompanyName = parentCompanyName;
  }

  public Bill parentSalutation(String parentSalutation) {
    this.parentSalutation = parentSalutation;
    return this;
  }

  /**
   * The title of the parent associated with the bill.
   * @return parentSalutation
   **/
  @Schema(required = true, description = "The title of the parent associated with the bill.")
      @NotNull

    public String getParentSalutation() {
    return parentSalutation;
  }

  public void setParentSalutation(String parentSalutation) {
    this.parentSalutation = parentSalutation;
  }

  public Bill cycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
    return this;
  }

  /**
   * The date and time the billing cycle starts.
   * @return cycleStarts
   **/
  @Schema(description = "The date and time the billing cycle starts.")
  
    @Valid
    public OffsetDateTime getCycleStarts() {
    return cycleStarts;
  }

  public void setCycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
  }

  public Bill subordsTotal(BigDecimal subordsTotal) {
    this.subordsTotal = subordsTotal;
    return this;
  }

  /**
   * The total amount from all subordinates, if the bill is a parent in a billing hierarchy.
   * @return subordsTotal
   **/
  @Schema(description = "The total amount from all subordinates, if the bill is a parent in a billing hierarchy.")
  
    @Valid
    public BigDecimal getSubordsTotal() {
    return subordsTotal;
  }

  public void setSubordsTotal(BigDecimal subordsTotal) {
    this.subordsTotal = subordsTotal;
  }

  public Bill transfered(BigDecimal transfered) {
    this.transfered = transfered;
    return this;
  }

  /**
   * The amount in the bill that has been transferred.
   * @return transfered
   **/
  @Schema(description = "The amount in the bill that has been transferred.")
  
    @Valid
    public BigDecimal getTransfered() {
    return transfered;
  }

  public void setTransfered(BigDecimal transfered) {
    this.transfered = transfered;
  }

  public Bill writeoff(BigDecimal writeoff) {
    this.writeoff = writeoff;
    return this;
  }

  /**
   * The amount in the bill that has been written off.
   * @return writeoff
   **/
  @Schema(description = "The amount in the bill that has been written off.")
  
    @Valid
    public BigDecimal getWriteoff() {
    return writeoff;
  }

  public void setWriteoff(BigDecimal writeoff) {
    this.writeoff = writeoff;
  }

  public Bill amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount to be allocated.
   * @return amount
   **/
  @Schema(description = "The amount to be allocated.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Bill billInfoId(String billInfoId) {
    this.billInfoId = billInfoId;
    return this;
  }

  /**
   * The ID of the bill unit associated with the bill.
   * @return billInfoId
   **/
  @Schema(description = "The ID of the bill unit associated with the bill.")
  
    public String getBillInfoId() {
    return billInfoId;
  }

  public void setBillInfoId(String billInfoId) {
    this.billInfoId = billInfoId;
  }

  public Bill billPaidDate(OffsetDateTime billPaidDate) {
    this.billPaidDate = billPaidDate;
    return this;
  }

  /**
   * The date and time the bill was paid.
   * @return billPaidDate
   **/
  @Schema(required = true, description = "The date and time the bill was paid.")
      @NotNull

    @Valid
    public OffsetDateTime getBillPaidDate() {
    return billPaidDate;
  }

  public void setBillPaidDate(OffsetDateTime billPaidDate) {
    this.billPaidDate = billPaidDate;
  }

  public Bill recurringCharges(BigDecimal recurringCharges) {
    this.recurringCharges = recurringCharges;
    return this;
  }

  /**
   * The total amount of all recurring charges in the bill.
   * @return recurringCharges
   **/
  @Schema(description = "The total amount of all recurring charges in the bill.")
  
    @Valid
    public BigDecimal getRecurringCharges() {
    return recurringCharges;
  }

  public void setRecurringCharges(BigDecimal recurringCharges) {
    this.recurringCharges = recurringCharges;
  }

  public Bill billDisputed(Boolean billDisputed) {
    this.billDisputed = billDisputed;
    return this;
  }

  /**
   * Whether the bill includes a disputed item (<b>true</b>) or not (<b>false</b>).
   * @return billDisputed
   **/
  @Schema(description = "Whether the bill includes a disputed item (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isBillDisputed() {
    return billDisputed;
  }

  public void setBillDisputed(Boolean billDisputed) {
    this.billDisputed = billDisputed;
  }

  public Bill originalBillNo(String originalBillNo) {
    this.originalBillNo = originalBillNo;
    return this;
  }

  /**
   * The bill number associated with the original bill.
   * @return originalBillNo
   **/
  @Schema(description = "The bill number associated with the original bill.")
  
    public String getOriginalBillNo() {
    return originalBillNo;
  }

  public void setOriginalBillNo(String originalBillNo) {
    this.originalBillNo = originalBillNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bill bill = (Bill) o;
    return Objects.equals(this.extension, bill.extension) &&
        Objects.equals(this.id, bill.id) &&
        Objects.equals(this.accountRef, bill.accountRef) &&
        Objects.equals(this.adjusted, bill.adjusted) &&
        Objects.equals(this.arBillinfoRef, bill.arBillinfoRef) &&
        Objects.equals(this.billUnitRef, bill.billUnitRef) &&
        Objects.equals(this.billNo, bill.billNo) &&
        Objects.equals(this.creationDate, bill.creationDate) &&
        Objects.equals(this.currency, bill.currency) &&
        Objects.equals(this.disputed, bill.disputed) &&
        Objects.equals(this.currentTotal, bill.currentTotal) &&
        Objects.equals(this.due, bill.due) &&
        Objects.equals(this.previousTotal, bill.previousTotal) &&
        Objects.equals(this.totalDue, bill.totalDue) &&
        Objects.equals(this.receivedForBill, bill.receivedForBill) &&
        Objects.equals(this.arActionsAmtExcludingPayments, bill.arActionsAmtExcludingPayments) &&
        Objects.equals(this.dueDate, bill.dueDate) &&
        Objects.equals(this.cycleEnds, bill.cycleEnds) &&
        Objects.equals(this.name, bill.name) &&
        Objects.equals(this.parent, bill.parent) &&
        Objects.equals(this.hierarchySize, bill.hierarchySize) &&
        Objects.equals(this.parentAccountRef, bill.parentAccountRef) &&
        Objects.equals(this.parentFirstName, bill.parentFirstName) &&
        Objects.equals(this.parentLastName, bill.parentLastName) &&
        Objects.equals(this.parentCompanyName, bill.parentCompanyName) &&
        Objects.equals(this.parentSalutation, bill.parentSalutation) &&
        Objects.equals(this.cycleStarts, bill.cycleStarts) &&
        Objects.equals(this.subordsTotal, bill.subordsTotal) &&
        Objects.equals(this.transfered, bill.transfered) &&
        Objects.equals(this.writeoff, bill.writeoff) &&
        Objects.equals(this.amount, bill.amount) &&
        Objects.equals(this.billInfoId, bill.billInfoId) &&
        Objects.equals(this.billPaidDate, bill.billPaidDate) &&
        Objects.equals(this.recurringCharges, bill.recurringCharges) &&
        Objects.equals(this.billDisputed, bill.billDisputed) &&
        Objects.equals(this.originalBillNo, bill.originalBillNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, accountRef, adjusted, arBillinfoRef, billUnitRef, billNo, creationDate, currency, disputed, currentTotal, due, previousTotal, totalDue, receivedForBill, arActionsAmtExcludingPayments, dueDate, cycleEnds, name, parent, hierarchySize, parentAccountRef, parentFirstName, parentLastName, parentCompanyName, parentSalutation, cycleStarts, subordsTotal, transfered, writeoff, amount, billInfoId, billPaidDate, recurringCharges, billDisputed, originalBillNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bill {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    adjusted: ").append(toIndentedString(adjusted)).append("\n");
    sb.append("    arBillinfoRef: ").append(toIndentedString(arBillinfoRef)).append("\n");
    sb.append("    billUnitRef: ").append(toIndentedString(billUnitRef)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    disputed: ").append(toIndentedString(disputed)).append("\n");
    sb.append("    currentTotal: ").append(toIndentedString(currentTotal)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
    sb.append("    previousTotal: ").append(toIndentedString(previousTotal)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
    sb.append("    receivedForBill: ").append(toIndentedString(receivedForBill)).append("\n");
    sb.append("    arActionsAmtExcludingPayments: ").append(toIndentedString(arActionsAmtExcludingPayments)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    cycleEnds: ").append(toIndentedString(cycleEnds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    hierarchySize: ").append(toIndentedString(hierarchySize)).append("\n");
    sb.append("    parentAccountRef: ").append(toIndentedString(parentAccountRef)).append("\n");
    sb.append("    parentFirstName: ").append(toIndentedString(parentFirstName)).append("\n");
    sb.append("    parentLastName: ").append(toIndentedString(parentLastName)).append("\n");
    sb.append("    parentCompanyName: ").append(toIndentedString(parentCompanyName)).append("\n");
    sb.append("    parentSalutation: ").append(toIndentedString(parentSalutation)).append("\n");
    sb.append("    cycleStarts: ").append(toIndentedString(cycleStarts)).append("\n");
    sb.append("    subordsTotal: ").append(toIndentedString(subordsTotal)).append("\n");
    sb.append("    transfered: ").append(toIndentedString(transfered)).append("\n");
    sb.append("    writeoff: ").append(toIndentedString(writeoff)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billInfoId: ").append(toIndentedString(billInfoId)).append("\n");
    sb.append("    billPaidDate: ").append(toIndentedString(billPaidDate)).append("\n");
    sb.append("    recurringCharges: ").append(toIndentedString(recurringCharges)).append("\n");
    sb.append("    billDisputed: ").append(toIndentedString(billDisputed)).append("\n");
    sb.append("    originalBillNo: ").append(toIndentedString(originalBillNo)).append("\n");
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
