package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
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
 * WriteOffDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class WriteOffDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionAffectsRef")
  private ResourceRef actionAffectsRef = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("writeoffType")
  private Long writeoffType = null;

  @JsonProperty("cycleStarts")
  private OffsetDateTime cycleStarts = null;

  @JsonProperty("cycleEnds")
  private OffsetDateTime cycleEnds = null;

  @JsonProperty("writeoffAmount")
  private BigDecimal writeoffAmount = null;

  @JsonProperty("writeoffID")
  private String writeoffID = null;

  @JsonProperty("itemName")
  private String itemName = null;

  @JsonProperty("billNumber")
  private String billNumber = null;

  @JsonProperty("itemNumber")
  private String itemNumber = null;

  @JsonProperty("billUnitName")
  private String billUnitName = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("notes")
  @Valid
  private List<Notes> notes = null;

  @JsonProperty("reversalAmount")
  private BigDecimal reversalAmount = null;

  @JsonProperty("reversalEffectiveDate")
  private OffsetDateTime reversalEffectiveDate = null;

  @JsonProperty("reversalId")
  private String reversalId = null;

  @JsonProperty("writeoffRef")
  private ResourceRef writeoffRef = null;

  @JsonProperty("reversalRef")
  private ResourceRef reversalRef = null;

  public WriteOffDetails extension(Object extension) {
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

  public WriteOffDetails actionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
    return this;
  }

  /**
   * Get actionAffectsRef
   * @return actionAffectsRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getActionAffectsRef() {
    return actionAffectsRef;
  }

  public void setActionAffectsRef(ResourceRef actionAffectsRef) {
    this.actionAffectsRef = actionAffectsRef;
  }

  public WriteOffDetails effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the write-off takes effect.
   * @return effectiveDate
   **/
  @Schema(description = "The date and time the write-off takes effect.")
  
    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public WriteOffDetails writeoffType(Long writeoffType) {
    this.writeoffType = writeoffType;
    return this;
  }

  /**
   * The type of write-off.
   * @return writeoffType
   **/
  @Schema(description = "The type of write-off.")
  
    public Long getWriteoffType() {
    return writeoffType;
  }

  public void setWriteoffType(Long writeoffType) {
    this.writeoffType = writeoffType;
  }

  public WriteOffDetails cycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
    return this;
  }

  /**
   * The date and time the cycle starts.
   * @return cycleStarts
   **/
  @Schema(description = "The date and time the cycle starts.")
  
    @Valid
    public OffsetDateTime getCycleStarts() {
    return cycleStarts;
  }

  public void setCycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
  }

  public WriteOffDetails cycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
    return this;
  }

  /**
   * The date and time the cycle ends.
   * @return cycleEnds
   **/
  @Schema(description = "The date and time the cycle ends.")
  
    @Valid
    public OffsetDateTime getCycleEnds() {
    return cycleEnds;
  }

  public void setCycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
  }

  public WriteOffDetails writeoffAmount(BigDecimal writeoffAmount) {
    this.writeoffAmount = writeoffAmount;
    return this;
  }

  /**
   * The amount to write off.
   * @return writeoffAmount
   **/
  @Schema(required = true, description = "The amount to write off.")
      @NotNull

    @Valid
    public BigDecimal getWriteoffAmount() {
    return writeoffAmount;
  }

  public void setWriteoffAmount(BigDecimal writeoffAmount) {
    this.writeoffAmount = writeoffAmount;
  }

  public WriteOffDetails writeoffID(String writeoffID) {
    this.writeoffID = writeoffID;
    return this;
  }

  /**
   * The write-off's ID.
   * @return writeoffID
   **/
  @Schema(description = "The write-off's ID.")
  
    public String getWriteoffID() {
    return writeoffID;
  }

  public void setWriteoffID(String writeoffID) {
    this.writeoffID = writeoffID;
  }

  public WriteOffDetails itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * The name of the item associated with the write-off.
   * @return itemName
   **/
  @Schema(description = "The name of the item associated with the write-off.")
  
    public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public WriteOffDetails billNumber(String billNumber) {
    this.billNumber = billNumber;
    return this;
  }

  /**
   * The bill number associated with the write-off.
   * @return billNumber
   **/
  @Schema(description = "The bill number associated with the write-off.")
  
    public String getBillNumber() {
    return billNumber;
  }

  public void setBillNumber(String billNumber) {
    this.billNumber = billNumber;
  }

  public WriteOffDetails itemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
    return this;
  }

  /**
   * The item number associated with the write-off.
   * @return itemNumber
   **/
  @Schema(description = "The item number associated with the write-off.")
  
    public String getItemNumber() {
    return itemNumber;
  }

  public void setItemNumber(String itemNumber) {
    this.itemNumber = itemNumber;
  }

  public WriteOffDetails billUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
    return this;
  }

  /**
   * The name of the bill unit associated with the write-off.
   * @return billUnitName
   **/
  @Schema(description = "The name of the bill unit associated with the write-off.")
  
    public String getBillUnitName() {
    return billUnitName;
  }

  public void setBillUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
  }

  public WriteOffDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * The account number associated with the write-off.
   * @return accountNumber
   **/
  @Schema(description = "The account number associated with the write-off.")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public WriteOffDetails notes(List<Notes> notes) {
    this.notes = notes;
    return this;
  }

  public WriteOffDetails addNotesItem(Notes notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<Notes>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Notes associated with the write-off.
   * @return notes
   **/
  @Schema(description = "Notes associated with the write-off.")
      @Valid
    public List<Notes> getNotes() {
    return notes;
  }

  public void setNotes(List<Notes> notes) {
    this.notes = notes;
  }

  public WriteOffDetails reversalAmount(BigDecimal reversalAmount) {
    this.reversalAmount = reversalAmount;
    return this;
  }

  /**
   * The amount of the write-off reversal.
   * @return reversalAmount
   **/
  @Schema(description = "The amount of the write-off reversal.")
  
    @Valid
    public BigDecimal getReversalAmount() {
    return reversalAmount;
  }

  public void setReversalAmount(BigDecimal reversalAmount) {
    this.reversalAmount = reversalAmount;
  }

  public WriteOffDetails reversalEffectiveDate(OffsetDateTime reversalEffectiveDate) {
    this.reversalEffectiveDate = reversalEffectiveDate;
    return this;
  }

  /**
   * The date and time the write-off reversal takes effect.
   * @return reversalEffectiveDate
   **/
  @Schema(description = "The date and time the write-off reversal takes effect.")
  
    @Valid
    public OffsetDateTime getReversalEffectiveDate() {
    return reversalEffectiveDate;
  }

  public void setReversalEffectiveDate(OffsetDateTime reversalEffectiveDate) {
    this.reversalEffectiveDate = reversalEffectiveDate;
  }

  public WriteOffDetails reversalId(String reversalId) {
    this.reversalId = reversalId;
    return this;
  }

  /**
   * The ID of the write-off reversal.
   * @return reversalId
   **/
  @Schema(description = "The ID of the write-off reversal.")
  
    public String getReversalId() {
    return reversalId;
  }

  public void setReversalId(String reversalId) {
    this.reversalId = reversalId;
  }

  public WriteOffDetails writeoffRef(ResourceRef writeoffRef) {
    this.writeoffRef = writeoffRef;
    return this;
  }

  /**
   * Get writeoffRef
   * @return writeoffRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getWriteoffRef() {
    return writeoffRef;
  }

  public void setWriteoffRef(ResourceRef writeoffRef) {
    this.writeoffRef = writeoffRef;
  }

  public WriteOffDetails reversalRef(ResourceRef reversalRef) {
    this.reversalRef = reversalRef;
    return this;
  }

  /**
   * Get reversalRef
   * @return reversalRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getReversalRef() {
    return reversalRef;
  }

  public void setReversalRef(ResourceRef reversalRef) {
    this.reversalRef = reversalRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WriteOffDetails writeOffDetails = (WriteOffDetails) o;
    return Objects.equals(this.extension, writeOffDetails.extension) &&
        Objects.equals(this.actionAffectsRef, writeOffDetails.actionAffectsRef) &&
        Objects.equals(this.effectiveDate, writeOffDetails.effectiveDate) &&
        Objects.equals(this.writeoffType, writeOffDetails.writeoffType) &&
        Objects.equals(this.cycleStarts, writeOffDetails.cycleStarts) &&
        Objects.equals(this.cycleEnds, writeOffDetails.cycleEnds) &&
        Objects.equals(this.writeoffAmount, writeOffDetails.writeoffAmount) &&
        Objects.equals(this.writeoffID, writeOffDetails.writeoffID) &&
        Objects.equals(this.itemName, writeOffDetails.itemName) &&
        Objects.equals(this.billNumber, writeOffDetails.billNumber) &&
        Objects.equals(this.itemNumber, writeOffDetails.itemNumber) &&
        Objects.equals(this.billUnitName, writeOffDetails.billUnitName) &&
        Objects.equals(this.accountNumber, writeOffDetails.accountNumber) &&
        Objects.equals(this.notes, writeOffDetails.notes) &&
        Objects.equals(this.reversalAmount, writeOffDetails.reversalAmount) &&
        Objects.equals(this.reversalEffectiveDate, writeOffDetails.reversalEffectiveDate) &&
        Objects.equals(this.reversalId, writeOffDetails.reversalId) &&
        Objects.equals(this.writeoffRef, writeOffDetails.writeoffRef) &&
        Objects.equals(this.reversalRef, writeOffDetails.reversalRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionAffectsRef, effectiveDate, writeoffType, cycleStarts, cycleEnds, writeoffAmount, writeoffID, itemName, billNumber, itemNumber, billUnitName, accountNumber, notes, reversalAmount, reversalEffectiveDate, reversalId, writeoffRef, reversalRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WriteOffDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionAffectsRef: ").append(toIndentedString(actionAffectsRef)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    writeoffType: ").append(toIndentedString(writeoffType)).append("\n");
    sb.append("    cycleStarts: ").append(toIndentedString(cycleStarts)).append("\n");
    sb.append("    cycleEnds: ").append(toIndentedString(cycleEnds)).append("\n");
    sb.append("    writeoffAmount: ").append(toIndentedString(writeoffAmount)).append("\n");
    sb.append("    writeoffID: ").append(toIndentedString(writeoffID)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    billNumber: ").append(toIndentedString(billNumber)).append("\n");
    sb.append("    itemNumber: ").append(toIndentedString(itemNumber)).append("\n");
    sb.append("    billUnitName: ").append(toIndentedString(billUnitName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reversalAmount: ").append(toIndentedString(reversalAmount)).append("\n");
    sb.append("    reversalEffectiveDate: ").append(toIndentedString(reversalEffectiveDate)).append("\n");
    sb.append("    reversalId: ").append(toIndentedString(reversalId)).append("\n");
    sb.append("    writeoffRef: ").append(toIndentedString(writeoffRef)).append("\n");
    sb.append("    reversalRef: ").append(toIndentedString(reversalRef)).append("\n");
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
