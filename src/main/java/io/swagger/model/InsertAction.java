package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InsertAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class InsertAction   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("billUnitRef")
  private ResourceRef billUnitRef = null;

  @JsonProperty("startDate")
  private OffsetDateTime startDate = null;

  @JsonProperty("collectionAgent")
  private String collectionAgent = null;

  @JsonProperty("slipByDays")
  private Integer slipByDays = null;

  @JsonProperty("cancelFollowupActions")
  private Boolean cancelFollowupActions = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("paymentMethodRef")
  private ResourceRef paymentMethodRef = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public InsertAction extension(Object extension) {
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

  public InsertAction billUnitRef(ResourceRef billUnitRef) {
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

  public InsertAction startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date and time the collections action starts.
   * @return startDate
   **/
  @Schema(required = true, description = "The date and time the collections action starts.")
      @NotNull

    @Valid
    public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public InsertAction collectionAgent(String collectionAgent) {
    this.collectionAgent = collectionAgent;
    return this;
  }

  /**
   * The agent assigned to the collections action.
   * @return collectionAgent
   **/
  @Schema(description = "The agent assigned to the collections action.")
  
    public String getCollectionAgent() {
    return collectionAgent;
  }

  public void setCollectionAgent(String collectionAgent) {
    this.collectionAgent = collectionAgent;
  }

  public InsertAction slipByDays(Integer slipByDays) {
    this.slipByDays = slipByDays;
    return this;
  }

  /**
   * The number of days to slip the scheduled action.
   * @return slipByDays
   **/
  @Schema(description = "The number of days to slip the scheduled action.")
  
    public Integer getSlipByDays() {
    return slipByDays;
  }

  public void setSlipByDays(Integer slipByDays) {
    this.slipByDays = slipByDays;
  }

  public InsertAction cancelFollowupActions(Boolean cancelFollowupActions) {
    this.cancelFollowupActions = cancelFollowupActions;
    return this;
  }

  /**
   * Whether to cancel all of the follow-up collections actions (<b>true</b>) or keep the existing follow-up collections actions (<b>false</b>).
   * @return cancelFollowupActions
   **/
  @Schema(description = "Whether to cancel all of the follow-up collections actions (<b>true</b>) or keep the existing follow-up collections actions (<b>false</b>).")
  
    public Boolean isCancelFollowupActions() {
    return cancelFollowupActions;
  }

  public void setCancelFollowupActions(Boolean cancelFollowupActions) {
    this.cancelFollowupActions = cancelFollowupActions;
  }

  public InsertAction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount to collect for the new action.
   * @return amount
   **/
  @Schema(description = "The amount to collect for the new action.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public InsertAction paymentMethodRef(ResourceRef paymentMethodRef) {
    this.paymentMethodRef = paymentMethodRef;
    return this;
  }

  /**
   * Get paymentMethodRef
   * @return paymentMethodRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentMethodRef() {
    return paymentMethodRef;
  }

  public void setPaymentMethodRef(ResourceRef paymentMethodRef) {
    this.paymentMethodRef = paymentMethodRef;
  }

  public InsertAction notes(Notes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    @Valid
    public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertAction insertAction = (InsertAction) o;
    return Objects.equals(this.extension, insertAction.extension) &&
        Objects.equals(this.billUnitRef, insertAction.billUnitRef) &&
        Objects.equals(this.startDate, insertAction.startDate) &&
        Objects.equals(this.collectionAgent, insertAction.collectionAgent) &&
        Objects.equals(this.slipByDays, insertAction.slipByDays) &&
        Objects.equals(this.cancelFollowupActions, insertAction.cancelFollowupActions) &&
        Objects.equals(this.amount, insertAction.amount) &&
        Objects.equals(this.paymentMethodRef, insertAction.paymentMethodRef) &&
        Objects.equals(this.notes, insertAction.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, billUnitRef, startDate, collectionAgent, slipByDays, cancelFollowupActions, amount, paymentMethodRef, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertAction {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    billUnitRef: ").append(toIndentedString(billUnitRef)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    collectionAgent: ").append(toIndentedString(collectionAgent)).append("\n");
    sb.append("    slipByDays: ").append(toIndentedString(slipByDays)).append("\n");
    sb.append("    cancelFollowupActions: ").append(toIndentedString(cancelFollowupActions)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paymentMethodRef: ").append(toIndentedString(paymentMethodRef)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
