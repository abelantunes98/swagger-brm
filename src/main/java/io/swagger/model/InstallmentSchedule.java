package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Installment;
import io.swagger.model.InstallmentScheduleBills;
import io.swagger.model.Money;
import io.swagger.model.TimePeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The installment schedule resource.
 */
@Schema(description = "The installment schedule resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class InstallmentSchedule   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("descr")
  private String descr = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("modifiedAt")
  private String modifiedAt = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  /**
   * Various possible statuses for an installment schedule. The implemented status are OPEN, BROKEN, FINISHED, and CANCELED.
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    OPEN("OPEN"),
    
    BROKEN("BROKEN"),
    
    FINISHED("FINISHED"),
    
    CANCELED("CANCELED"),
    
    SUSPENDED("SUSPENDED");

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

  @JsonProperty("lastInstallmentAt")
  private OffsetDateTime lastInstallmentAt = null;

  @JsonProperty("nextInstallmentAt")
  private OffsetDateTime nextInstallmentAt = null;

  /**
   * The installment type.
   */
  public enum InstallmentTypeEnum {
    EQUAL_INSTALLMENT("EQUAL INSTALLMENT"),
    
    NON_EQUAL_INSTALLMENT("NON-EQUAL INSTALLMENT");

    private String value;

    InstallmentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstallmentTypeEnum fromValue(String text) {
      for (InstallmentTypeEnum b : InstallmentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("installmentType")
  private InstallmentTypeEnum installmentType = null;

  /**
   * Indicates either to bill the installment amount immediately or to keep it open and include it with the customer's billing cycle.
   */
  public enum BillPreferenceEnum {
    IMMEDIATE("IMMEDIATE"),
    
    AUTO_ALIGN("AUTO-ALIGN");

    private String value;

    BillPreferenceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BillPreferenceEnum fromValue(String text) {
      for (BillPreferenceEnum b : BillPreferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("billPreference")
  private BillPreferenceEnum billPreference = BillPreferenceEnum.AUTO_ALIGN;

  /**
   * The installment cycle. Future use only.
   */
  public enum InstallmentPeriodEnum {
    ANNUAL("ANNUAL"),
    
    SEMI_ANNUAL("SEMI-ANNUAL"),
    
    QUARTERLY("QUARTERLY"),
    
    MONTHLY("MONTHLY"),
    
    WEEKLY("WEEKLY"),
    
    DAILY("DAILY");

    private String value;

    InstallmentPeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InstallmentPeriodEnum fromValue(String text) {
      for (InstallmentPeriodEnum b : InstallmentPeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("installmentPeriod")
  private InstallmentPeriodEnum installmentPeriod = InstallmentPeriodEnum.MONTHLY;

  @JsonProperty("totalAmount")
  private Money totalAmount = null;

  @JsonProperty("totalDue")
  private Money totalDue = null;

  @JsonProperty("totalInstallments")
  private Integer totalInstallments = null;

  @JsonProperty("installmentAmount")
  private Money installmentAmount = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  @JsonProperty("billProfileRef")
  private String billProfileRef = null;

  @JsonProperty("chargeOfferRef")
  private String chargeOfferRef = null;

  @JsonProperty("bills")
  @Valid
  private List<InstallmentScheduleBills> bills = new ArrayList<InstallmentScheduleBills>();

  @JsonProperty("glid")
  private String glid = null;

  @JsonProperty("channel")
  private String channel = null;

  @JsonProperty("scheduleSpecRef")
  private String scheduleSpecRef = null;

  @JsonProperty("installments")
  @Valid
  private List<Installment> installments = null;

  public InstallmentSchedule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The installment schedule's ID.
   * @return id
   **/
  @Schema(description = "The installment schedule's ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InstallmentSchedule href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL that is used for getting the object.
   * @return href
   **/
  @Schema(description = "The unique resource URL that is used for getting the object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public InstallmentSchedule descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The installment schedule description.
   * @return descr
   **/
  @Schema(description = "The installment schedule description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public InstallmentSchedule createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date of creation.
   * @return createdAt
   **/
  @Schema(description = "The date of creation.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public InstallmentSchedule modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The last updated date.
   * @return modifiedAt
   **/
  @Schema(description = "The last updated date.")
  
    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public InstallmentSchedule validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public InstallmentSchedule status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Various possible statuses for an installment schedule. The implemented status are OPEN, BROKEN, FINISHED, and CANCELED.
   * @return status
   **/
  @Schema(description = "Various possible statuses for an installment schedule. The implemented status are OPEN, BROKEN, FINISHED, and CANCELED.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public InstallmentSchedule lastInstallmentAt(OffsetDateTime lastInstallmentAt) {
    this.lastInstallmentAt = lastInstallmentAt;
    return this;
  }

  /**
   * The last installment date. Place holder for future use.
   * @return lastInstallmentAt
   **/
  @Schema(description = "The last installment date. Place holder for future use.")
  
    @Valid
    public OffsetDateTime getLastInstallmentAt() {
    return lastInstallmentAt;
  }

  public void setLastInstallmentAt(OffsetDateTime lastInstallmentAt) {
    this.lastInstallmentAt = lastInstallmentAt;
  }

  public InstallmentSchedule nextInstallmentAt(OffsetDateTime nextInstallmentAt) {
    this.nextInstallmentAt = nextInstallmentAt;
    return this;
  }

  /**
   * The next installment date. Place holder for future use.
   * @return nextInstallmentAt
   **/
  @Schema(description = "The next installment date. Place holder for future use.")
  
    @Valid
    public OffsetDateTime getNextInstallmentAt() {
    return nextInstallmentAt;
  }

  public void setNextInstallmentAt(OffsetDateTime nextInstallmentAt) {
    this.nextInstallmentAt = nextInstallmentAt;
  }

  public InstallmentSchedule installmentType(InstallmentTypeEnum installmentType) {
    this.installmentType = installmentType;
    return this;
  }

  /**
   * The installment type.
   * @return installmentType
   **/
  @Schema(description = "The installment type.")
  
    public InstallmentTypeEnum getInstallmentType() {
    return installmentType;
  }

  public void setInstallmentType(InstallmentTypeEnum installmentType) {
    this.installmentType = installmentType;
  }

  public InstallmentSchedule billPreference(BillPreferenceEnum billPreference) {
    this.billPreference = billPreference;
    return this;
  }

  /**
   * Indicates either to bill the installment amount immediately or to keep it open and include it with the customer's billing cycle.
   * @return billPreference
   **/
  @Schema(description = "Indicates either to bill the installment amount immediately or to keep it open and include it with the customer's billing cycle.")
  
    public BillPreferenceEnum getBillPreference() {
    return billPreference;
  }

  public void setBillPreference(BillPreferenceEnum billPreference) {
    this.billPreference = billPreference;
  }

  public InstallmentSchedule installmentPeriod(InstallmentPeriodEnum installmentPeriod) {
    this.installmentPeriod = installmentPeriod;
    return this;
  }

  /**
   * The installment cycle. Future use only.
   * @return installmentPeriod
   **/
  @Schema(description = "The installment cycle. Future use only.")
  
    public InstallmentPeriodEnum getInstallmentPeriod() {
    return installmentPeriod;
  }

  public void setInstallmentPeriod(InstallmentPeriodEnum installmentPeriod) {
    this.installmentPeriod = installmentPeriod;
  }

  public InstallmentSchedule totalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Get totalAmount
   * @return totalAmount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Money getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Money totalAmount) {
    this.totalAmount = totalAmount;
  }

  public InstallmentSchedule totalDue(Money totalDue) {
    this.totalDue = totalDue;
    return this;
  }

  /**
   * Get totalDue
   * @return totalDue
   **/
  @Schema(description = "")
  
    @Valid
    public Money getTotalDue() {
    return totalDue;
  }

  public void setTotalDue(Money totalDue) {
    this.totalDue = totalDue;
  }

  public InstallmentSchedule totalInstallments(Integer totalInstallments) {
    this.totalInstallments = totalInstallments;
    return this;
  }

  /**
   * The total number of installments.
   * @return totalInstallments
   **/
  @Schema(description = "The total number of installments.")
  
    public Integer getTotalInstallments() {
    return totalInstallments;
  }

  public void setTotalInstallments(Integer totalInstallments) {
    this.totalInstallments = totalInstallments;
  }

  public InstallmentSchedule installmentAmount(Money installmentAmount) {
    this.installmentAmount = installmentAmount;
    return this;
  }

  /**
   * Get installmentAmount
   * @return installmentAmount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getInstallmentAmount() {
    return installmentAmount;
  }

  public void setInstallmentAmount(Money installmentAmount) {
    this.installmentAmount = installmentAmount;
  }

  public InstallmentSchedule customerRef(String customerRef) {
    this.customerRef = customerRef;
    return this;
  }

  /**
   * The customer account reference.
   * @return customerRef
   **/
  @Schema(required = true, description = "The customer account reference.")
      @NotNull

    public String getCustomerRef() {
    return customerRef;
  }

  public void setCustomerRef(String customerRef) {
    this.customerRef = customerRef;
  }

  public InstallmentSchedule billProfileRef(String billProfileRef) {
    this.billProfileRef = billProfileRef;
    return this;
  }

  /**
   * The customer bill unit reference.
   * @return billProfileRef
   **/
  @Schema(description = "The customer bill unit reference.")
  
    public String getBillProfileRef() {
    return billProfileRef;
  }

  public void setBillProfileRef(String billProfileRef) {
    this.billProfileRef = billProfileRef;
  }

  public InstallmentSchedule chargeOfferRef(String chargeOfferRef) {
    this.chargeOfferRef = chargeOfferRef;
    return this;
  }

  /**
   * The charge offer reference. For future use only.
   * @return chargeOfferRef
   **/
  @Schema(description = "The charge offer reference. For future use only.")
  
    public String getChargeOfferRef() {
    return chargeOfferRef;
  }

  public void setChargeOfferRef(String chargeOfferRef) {
    this.chargeOfferRef = chargeOfferRef;
  }

  public InstallmentSchedule bills(List<InstallmentScheduleBills> bills) {
    this.bills = bills;
    return this;
  }

  public InstallmentSchedule addBillsItem(InstallmentScheduleBills billsItem) {
    this.bills.add(billsItem);
    return this;
  }

  /**
   * Get bills
   * @return bills
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<InstallmentScheduleBills> getBills() {
    return bills;
  }

  public void setBills(List<InstallmentScheduleBills> bills) {
    this.bills = bills;
  }

  public InstallmentSchedule glid(String glid) {
    this.glid = glid;
    return this;
  }

  /**
   * The G/L ID for the installment charge.
   * @return glid
   **/
  @Schema(description = "The G/L ID for the installment charge.")
  
    public String getGlid() {
    return glid;
  }

  public void setGlid(String glid) {
    this.glid = glid;
  }

  public InstallmentSchedule channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * The source of this request. Specify the name of the store, or a web app/CRM/mobile app, or so on. Future use only.
   * @return channel
   **/
  @Schema(description = "The source of this request. Specify the name of the store, or a web app/CRM/mobile app, or so on. Future use only.")
  
    public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public InstallmentSchedule scheduleSpecRef(String scheduleSpecRef) {
    this.scheduleSpecRef = scheduleSpecRef;
    return this;
  }

  /**
   * The installment schedule specification reference.
   * @return scheduleSpecRef
   **/
  @Schema(required = true, description = "The installment schedule specification reference.")
      @NotNull

    public String getScheduleSpecRef() {
    return scheduleSpecRef;
  }

  public void setScheduleSpecRef(String scheduleSpecRef) {
    this.scheduleSpecRef = scheduleSpecRef;
  }

  public InstallmentSchedule installments(List<Installment> installments) {
    this.installments = installments;
    return this;
  }

  public InstallmentSchedule addInstallmentsItem(Installment installmentsItem) {
    if (this.installments == null) {
      this.installments = new ArrayList<Installment>();
    }
    this.installments.add(installmentsItem);
    return this;
  }

  /**
   * The installments associated to the installment schedule.
   * @return installments
   **/
  @Schema(description = "The installments associated to the installment schedule.")
      @Valid
    public List<Installment> getInstallments() {
    return installments;
  }

  public void setInstallments(List<Installment> installments) {
    this.installments = installments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentSchedule installmentSchedule = (InstallmentSchedule) o;
    return Objects.equals(this.id, installmentSchedule.id) &&
        Objects.equals(this.href, installmentSchedule.href) &&
        Objects.equals(this.descr, installmentSchedule.descr) &&
        Objects.equals(this.createdAt, installmentSchedule.createdAt) &&
        Objects.equals(this.modifiedAt, installmentSchedule.modifiedAt) &&
        Objects.equals(this.validFor, installmentSchedule.validFor) &&
        Objects.equals(this.status, installmentSchedule.status) &&
        Objects.equals(this.lastInstallmentAt, installmentSchedule.lastInstallmentAt) &&
        Objects.equals(this.nextInstallmentAt, installmentSchedule.nextInstallmentAt) &&
        Objects.equals(this.installmentType, installmentSchedule.installmentType) &&
        Objects.equals(this.billPreference, installmentSchedule.billPreference) &&
        Objects.equals(this.installmentPeriod, installmentSchedule.installmentPeriod) &&
        Objects.equals(this.totalAmount, installmentSchedule.totalAmount) &&
        Objects.equals(this.totalDue, installmentSchedule.totalDue) &&
        Objects.equals(this.totalInstallments, installmentSchedule.totalInstallments) &&
        Objects.equals(this.installmentAmount, installmentSchedule.installmentAmount) &&
        Objects.equals(this.customerRef, installmentSchedule.customerRef) &&
        Objects.equals(this.billProfileRef, installmentSchedule.billProfileRef) &&
        Objects.equals(this.chargeOfferRef, installmentSchedule.chargeOfferRef) &&
        Objects.equals(this.bills, installmentSchedule.bills) &&
        Objects.equals(this.glid, installmentSchedule.glid) &&
        Objects.equals(this.channel, installmentSchedule.channel) &&
        Objects.equals(this.scheduleSpecRef, installmentSchedule.scheduleSpecRef) &&
        Objects.equals(this.installments, installmentSchedule.installments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, descr, createdAt, modifiedAt, validFor, status, lastInstallmentAt, nextInstallmentAt, installmentType, billPreference, installmentPeriod, totalAmount, totalDue, totalInstallments, installmentAmount, customerRef, billProfileRef, chargeOfferRef, bills, glid, channel, scheduleSpecRef, installments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentSchedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lastInstallmentAt: ").append(toIndentedString(lastInstallmentAt)).append("\n");
    sb.append("    nextInstallmentAt: ").append(toIndentedString(nextInstallmentAt)).append("\n");
    sb.append("    installmentType: ").append(toIndentedString(installmentType)).append("\n");
    sb.append("    billPreference: ").append(toIndentedString(billPreference)).append("\n");
    sb.append("    installmentPeriod: ").append(toIndentedString(installmentPeriod)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalDue: ").append(toIndentedString(totalDue)).append("\n");
    sb.append("    totalInstallments: ").append(toIndentedString(totalInstallments)).append("\n");
    sb.append("    installmentAmount: ").append(toIndentedString(installmentAmount)).append("\n");
    sb.append("    customerRef: ").append(toIndentedString(customerRef)).append("\n");
    sb.append("    billProfileRef: ").append(toIndentedString(billProfileRef)).append("\n");
    sb.append("    chargeOfferRef: ").append(toIndentedString(chargeOfferRef)).append("\n");
    sb.append("    bills: ").append(toIndentedString(bills)).append("\n");
    sb.append("    glid: ").append(toIndentedString(glid)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    scheduleSpecRef: ").append(toIndentedString(scheduleSpecRef)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
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
