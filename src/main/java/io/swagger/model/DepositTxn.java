package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.DepositTxnBalanceImpacts;
import io.swagger.model.DepositTxnDepositDetails;
import io.swagger.model.DepositTxnDepositInfo;
import io.swagger.model.DepositTxnNotes;
import io.swagger.model.DepositTxnPayment;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositTxn
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositTxn   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("modifiedAt")
  private String modifiedAt = null;

  @JsonProperty("startsAt")
  private String startsAt = null;

  @JsonProperty("txnType")
  private String txnType = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("descr")
  private String descr = null;

  @JsonProperty("systemEvent")
  private String systemEvent = null;

  @JsonProperty("notes")
  private DepositTxnNotes notes = null;

  @JsonProperty("depositInfo")
  private DepositTxnDepositInfo depositInfo = null;

  @JsonProperty("depositDetails")
  private DepositTxnDepositDetails depositDetails = null;

  @JsonProperty("balanceImpacts")
  private DepositTxnBalanceImpacts balanceImpacts = null;

  @JsonProperty("payment")
  private DepositTxnPayment payment = null;

  public DepositTxn id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit transaction event ID.
   * @return id
   **/
  @Schema(required = true, description = "The deposit transaction event ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositTxn href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL, used to get the deposit transaction event
   * @return href
   **/
  @Schema(required = true, description = "The unique resource URL, used to get the deposit transaction event")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public DepositTxn createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit transaction event is created.
   * @return createdAt
   **/
  @Schema(required = true, description = "The date when the deposit transaction event is created.")
      @NotNull

    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositTxn modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date when the deposit transaction event is modified.
   * @return modifiedAt
   **/
  @Schema(required = true, description = "The date when the deposit transaction event is modified.")
      @NotNull

    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public DepositTxn startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * The start date of the deposit transaction event.
   * @return startsAt
   **/
  @Schema(required = true, description = "The start date of the deposit transaction event.")
      @NotNull

    public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public DepositTxn txnType(String txnType) {
    this.txnType = txnType;
    return this;
  }

  /**
   * The transaction type of the deposit transaction event.
   * @return txnType
   **/
  @Schema(required = true, description = "The transaction type of the deposit transaction event.")
      @NotNull

    public String getTxnType() {
    return txnType;
  }

  public void setTxnType(String txnType) {
    this.txnType = txnType;
  }

  public DepositTxn quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of the deposit transaction event.
   * @return quantity
   **/
  @Schema(description = "The quantity of the deposit transaction event.")
  
    public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public DepositTxn descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The deposit transaction event description.
   * @return descr
   **/
  @Schema(required = true, description = "The deposit transaction event description.")
      @NotNull

    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public DepositTxn systemEvent(String systemEvent) {
    this.systemEvent = systemEvent;
    return this;
  }

  /**
   * The system event of the deposit transaction event.
   * @return systemEvent
   **/
  @Schema(required = true, description = "The system event of the deposit transaction event.")
      @NotNull

    public String getSystemEvent() {
    return systemEvent;
  }

  public void setSystemEvent(String systemEvent) {
    this.systemEvent = systemEvent;
  }

  public DepositTxn notes(DepositTxnNotes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DepositTxnNotes getNotes() {
    return notes;
  }

  public void setNotes(DepositTxnNotes notes) {
    this.notes = notes;
  }

  public DepositTxn depositInfo(DepositTxnDepositInfo depositInfo) {
    this.depositInfo = depositInfo;
    return this;
  }

  /**
   * Get depositInfo
   * @return depositInfo
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DepositTxnDepositInfo getDepositInfo() {
    return depositInfo;
  }

  public void setDepositInfo(DepositTxnDepositInfo depositInfo) {
    this.depositInfo = depositInfo;
  }

  public DepositTxn depositDetails(DepositTxnDepositDetails depositDetails) {
    this.depositDetails = depositDetails;
    return this;
  }

  /**
   * Get depositDetails
   * @return depositDetails
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DepositTxnDepositDetails getDepositDetails() {
    return depositDetails;
  }

  public void setDepositDetails(DepositTxnDepositDetails depositDetails) {
    this.depositDetails = depositDetails;
  }

  public DepositTxn balanceImpacts(DepositTxnBalanceImpacts balanceImpacts) {
    this.balanceImpacts = balanceImpacts;
    return this;
  }

  /**
   * Get balanceImpacts
   * @return balanceImpacts
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public DepositTxnBalanceImpacts getBalanceImpacts() {
    return balanceImpacts;
  }

  public void setBalanceImpacts(DepositTxnBalanceImpacts balanceImpacts) {
    this.balanceImpacts = balanceImpacts;
  }

  public DepositTxn payment(DepositTxnPayment payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
   **/
  @Schema(description = "")
  
    @Valid
    public DepositTxnPayment getPayment() {
    return payment;
  }

  public void setPayment(DepositTxnPayment payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTxn depositTxn = (DepositTxn) o;
    return Objects.equals(this.id, depositTxn.id) &&
        Objects.equals(this.href, depositTxn.href) &&
        Objects.equals(this.createdAt, depositTxn.createdAt) &&
        Objects.equals(this.modifiedAt, depositTxn.modifiedAt) &&
        Objects.equals(this.startsAt, depositTxn.startsAt) &&
        Objects.equals(this.txnType, depositTxn.txnType) &&
        Objects.equals(this.quantity, depositTxn.quantity) &&
        Objects.equals(this.descr, depositTxn.descr) &&
        Objects.equals(this.systemEvent, depositTxn.systemEvent) &&
        Objects.equals(this.notes, depositTxn.notes) &&
        Objects.equals(this.depositInfo, depositTxn.depositInfo) &&
        Objects.equals(this.depositDetails, depositTxn.depositDetails) &&
        Objects.equals(this.balanceImpacts, depositTxn.balanceImpacts) &&
        Objects.equals(this.payment, depositTxn.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, modifiedAt, startsAt, txnType, quantity, descr, systemEvent, notes, depositInfo, depositDetails, balanceImpacts, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTxn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    systemEvent: ").append(toIndentedString(systemEvent)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    depositInfo: ").append(toIndentedString(depositInfo)).append("\n");
    sb.append("    depositDetails: ").append(toIndentedString(depositDetails)).append("\n");
    sb.append("    balanceImpacts: ").append(toIndentedString(balanceImpacts)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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
