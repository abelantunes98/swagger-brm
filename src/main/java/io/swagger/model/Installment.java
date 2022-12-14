package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The installment resource.
 */
@Schema(description = "The installment resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Installment   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("descr")
  private String descr = null;

  /**
   * The status of the installment.
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    PAID("PAID"),
    
    BROKEN("BROKEN"),
    
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = StatusEnum.OPEN;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("amount")
  private Money amount = null;

  @JsonProperty("scheduleRef")
  private String scheduleRef = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  public Installment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The installment's ID.
   * @return id
   **/
  @Schema(description = "The installment's ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Installment href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL. Used for getting the object.
   * @return href
   **/
  @Schema(description = "The unique resource URL. Used for getting the object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Installment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date of creation.
   * @return createdAt
   **/
  @Schema(description = "The date of creation.")
  
    @Valid
    public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Installment descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The installment description.
   * @return descr
   **/
  @Schema(description = "The installment description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public Installment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the installment.
   * @return status
   **/
  @Schema(description = "The status of the installment.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Installment dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The date of installment collection/charge.
   * @return dueDate
   **/
  @Schema(required = true, description = "The date of installment collection/charge.")
      @NotNull

    @Valid
    public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Installment amount(Money amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public Installment scheduleRef(String scheduleRef) {
    this.scheduleRef = scheduleRef;
    return this;
  }

  /**
   * The reference to the installment schedule.
   * @return scheduleRef
   **/
  @Schema(required = true, description = "The reference to the installment schedule.")
      @NotNull

    public String getScheduleRef() {
    return scheduleRef;
  }

  public void setScheduleRef(String scheduleRef) {
    this.scheduleRef = scheduleRef;
  }

  public Installment customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * The customer reference.
   * @return customerRef
   **/
  @Schema(required = true, description = "The customer reference.")
      @NotNull

    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Installment installment = (Installment) o;
    return Objects.equals(this.id, installment.id) &&
        Objects.equals(this.href, installment.href) &&
        Objects.equals(this.createdAt, installment.createdAt) &&
        Objects.equals(this.descr, installment.descr) &&
        Objects.equals(this.status, installment.status) &&
        Objects.equals(this.dueDate, installment.dueDate) &&
        Objects.equals(this.amount, installment.amount) &&
        Objects.equals(this.scheduleRef, installment.scheduleRef) &&
        Objects.equals(this.customerRef, installment.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, descr, status, dueDate, amount, scheduleRef, customerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Installment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    scheduleRef: ").append(toIndentedString(scheduleRef)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
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
