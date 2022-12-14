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
 * PromiseToPay
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PromiseToPay   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("promiseToPayAmount")
  private BigDecimal promiseToPayAmount = null;

  @JsonProperty("numberOfMilestones")
  private Integer numberOfMilestones = null;

  @JsonProperty("amountPerMilestone")
  private BigDecimal amountPerMilestone = null;

  @JsonProperty("daysToPayAmount")
  private Integer daysToPayAmount = null;

  @JsonProperty("daysBetweenMilestones")
  private Integer daysBetweenMilestones = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("paymentRef")
  private ResourceRef paymentRef = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public PromiseToPay extension(Object extension) {
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

  public PromiseToPay promiseToPayAmount(BigDecimal promiseToPayAmount) {
    this.promiseToPayAmount = promiseToPayAmount;
    return this;
  }

  /**
   * The amount that is agreed to be paid.
   * @return promiseToPayAmount
   **/
  @Schema(description = "The amount that is agreed to be paid.")
  
    @Valid
    public BigDecimal getPromiseToPayAmount() {
    return promiseToPayAmount;
  }

  public void setPromiseToPayAmount(BigDecimal promiseToPayAmount) {
    this.promiseToPayAmount = promiseToPayAmount;
  }

  public PromiseToPay numberOfMilestones(Integer numberOfMilestones) {
    this.numberOfMilestones = numberOfMilestones;
    return this;
  }

  /**
   * The number of installments to be paid.
   * @return numberOfMilestones
   **/
  @Schema(description = "The number of installments to be paid.")
  
    public Integer getNumberOfMilestones() {
    return numberOfMilestones;
  }

  public void setNumberOfMilestones(Integer numberOfMilestones) {
    this.numberOfMilestones = numberOfMilestones;
  }

  public PromiseToPay amountPerMilestone(BigDecimal amountPerMilestone) {
    this.amountPerMilestone = amountPerMilestone;
    return this;
  }

  /**
   * The amount of each installment to be paid.
   * @return amountPerMilestone
   **/
  @Schema(description = "The amount of each installment to be paid.")
  
    @Valid
    public BigDecimal getAmountPerMilestone() {
    return amountPerMilestone;
  }

  public void setAmountPerMilestone(BigDecimal amountPerMilestone) {
    this.amountPerMilestone = amountPerMilestone;
  }

  public PromiseToPay daysToPayAmount(Integer daysToPayAmount) {
    this.daysToPayAmount = daysToPayAmount;
    return this;
  }

  /**
   * The number of days until the payment is completed.
   * @return daysToPayAmount
   **/
  @Schema(description = "The number of days until the payment is completed.")
  
    public Integer getDaysToPayAmount() {
    return daysToPayAmount;
  }

  public void setDaysToPayAmount(Integer daysToPayAmount) {
    this.daysToPayAmount = daysToPayAmount;
  }

  public PromiseToPay daysBetweenMilestones(Integer daysBetweenMilestones) {
    this.daysBetweenMilestones = daysBetweenMilestones;
    return this;
  }

  /**
   * The number of days between each installment.
   * @return daysBetweenMilestones
   **/
  @Schema(description = "The number of days between each installment.")
  
    public Integer getDaysBetweenMilestones() {
    return daysBetweenMilestones;
  }

  public void setDaysBetweenMilestones(Integer daysBetweenMilestones) {
    this.daysBetweenMilestones = daysBetweenMilestones;
  }

  public PromiseToPay effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the promise-to-pay agreement is effective.
   * @return effectiveDate
   **/
  @Schema(required = true, description = "The date and time the promise-to-pay agreement is effective.")
      @NotNull

    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public PromiseToPay paymentRef(ResourceRef paymentRef) {
    this.paymentRef = paymentRef;
    return this;
  }

  /**
   * Get paymentRef
   * @return paymentRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentRef() {
    return paymentRef;
  }

  public void setPaymentRef(ResourceRef paymentRef) {
    this.paymentRef = paymentRef;
  }

  public PromiseToPay notes(Notes notes) {
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
    PromiseToPay promiseToPay = (PromiseToPay) o;
    return Objects.equals(this.extension, promiseToPay.extension) &&
        Objects.equals(this.promiseToPayAmount, promiseToPay.promiseToPayAmount) &&
        Objects.equals(this.numberOfMilestones, promiseToPay.numberOfMilestones) &&
        Objects.equals(this.amountPerMilestone, promiseToPay.amountPerMilestone) &&
        Objects.equals(this.daysToPayAmount, promiseToPay.daysToPayAmount) &&
        Objects.equals(this.daysBetweenMilestones, promiseToPay.daysBetweenMilestones) &&
        Objects.equals(this.effectiveDate, promiseToPay.effectiveDate) &&
        Objects.equals(this.paymentRef, promiseToPay.paymentRef) &&
        Objects.equals(this.notes, promiseToPay.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, promiseToPayAmount, numberOfMilestones, amountPerMilestone, daysToPayAmount, daysBetweenMilestones, effectiveDate, paymentRef, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromiseToPay {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    promiseToPayAmount: ").append(toIndentedString(promiseToPayAmount)).append("\n");
    sb.append("    numberOfMilestones: ").append(toIndentedString(numberOfMilestones)).append("\n");
    sb.append("    amountPerMilestone: ").append(toIndentedString(amountPerMilestone)).append("\n");
    sb.append("    daysToPayAmount: ").append(toIndentedString(daysToPayAmount)).append("\n");
    sb.append("    daysBetweenMilestones: ").append(toIndentedString(daysBetweenMilestones)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    paymentRef: ").append(toIndentedString(paymentRef)).append("\n");
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
