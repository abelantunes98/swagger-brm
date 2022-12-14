package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.InstallmentProposalBills;
import io.swagger.model.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The installment proposal resource.
 */
@Schema(description = "The installment proposal resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class InstallmentProposal   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("totalAmount")
  private Money totalAmount = null;

  @JsonProperty("totalInstallments")
  private Integer totalInstallments = null;

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

  @JsonProperty("bills")
  @Valid
  private List<InstallmentProposalBills> bills = null;

  @JsonProperty("specRef")
  private String specRef = null;

  @JsonProperty("customerRef")
  private String customerRef = null;

  public InstallmentProposal id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The installment proposal's ID. Proposals are not persisted in the system, so this field is always null.
   * @return id
   **/
  @Schema(description = "The installment proposal's ID. Proposals are not persisted in the system, so this field is always null.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InstallmentProposal href(String href) {
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

  public InstallmentProposal totalAmount(Money totalAmount) {
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

  public InstallmentProposal totalInstallments(Integer totalInstallments) {
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

  public InstallmentProposal installmentType(InstallmentTypeEnum installmentType) {
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

  public InstallmentProposal installmentPeriod(InstallmentPeriodEnum installmentPeriod) {
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

  public InstallmentProposal bills(List<InstallmentProposalBills> bills) {
    this.bills = bills;
    return this;
  }

  public InstallmentProposal addBillsItem(InstallmentProposalBills billsItem) {
    if (this.bills == null) {
      this.bills = new ArrayList<InstallmentProposalBills>();
    }
    this.bills.add(billsItem);
    return this;
  }

  /**
   * Get bills
   * @return bills
   **/
  @Schema(description = "")
      @Valid
    public List<InstallmentProposalBills> getBills() {
    return bills;
  }

  public void setBills(List<InstallmentProposalBills> bills) {
    this.bills = bills;
  }

  public InstallmentProposal specRef(String specRef) {
    this.specRef = specRef;
    return this;
  }

  /**
   * The installment schedule specification reference.
   * @return specRef
   **/
  @Schema(required = true, description = "The installment schedule specification reference.")
      @NotNull

    public String getSpecRef() {
    return specRef;
  }

  public void setSpecRef(String specRef) {
    this.specRef = specRef;
  }

  public InstallmentProposal customerRef(String customerRef) {
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
    InstallmentProposal installmentProposal = (InstallmentProposal) o;
    return Objects.equals(this.id, installmentProposal.id) &&
        Objects.equals(this.href, installmentProposal.href) &&
        Objects.equals(this.totalAmount, installmentProposal.totalAmount) &&
        Objects.equals(this.totalInstallments, installmentProposal.totalInstallments) &&
        Objects.equals(this.installmentType, installmentProposal.installmentType) &&
        Objects.equals(this.installmentPeriod, installmentProposal.installmentPeriod) &&
        Objects.equals(this.bills, installmentProposal.bills) &&
        Objects.equals(this.specRef, installmentProposal.specRef) &&
        Objects.equals(this.customerRef, installmentProposal.customerRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, totalAmount, totalInstallments, installmentType, installmentPeriod, bills, specRef, customerRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentProposal {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalInstallments: ").append(toIndentedString(totalInstallments)).append("\n");
    sb.append("    installmentType: ").append(toIndentedString(installmentType)).append("\n");
    sb.append("    installmentPeriod: ").append(toIndentedString(installmentPeriod)).append("\n");
    sb.append("    bills: ").append(toIndentedString(bills)).append("\n");
    sb.append("    specRef: ").append(toIndentedString(specRef)).append("\n");
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
