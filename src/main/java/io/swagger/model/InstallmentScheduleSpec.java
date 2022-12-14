package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Qualifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The installment schedule specification resource.
 */
@Schema(description = "The installment schedule specification resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class InstallmentScheduleSpec   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("descr")
  private String descr = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("modifiedAt")
  private String modifiedAt = null;

  @JsonProperty("expiresAt")
  private String expiresAt = null;

  /**
   * The installment type that specifies if the installment schedule is EQUAL or UNEQUAL installments.
   */
  public enum InstallmentTypeEnum {
    EQUAL_INSTALLMENT("EQUAL_INSTALLMENT"),
    
    NONEQUAL_INSTALLMENT("NONEQUAL_INSTALLMENT");

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
  private InstallmentTypeEnum installmentType = InstallmentTypeEnum.EQUAL_INSTALLMENT;

  /**
   * The frequency of the Installment. For future use.
   */
  public enum InstallmentPeriodEnum {
    ANNUAL("ANNUAL"),
    
    SEMIANNUAL("SEMIANNUAL"),
    
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

  @JsonProperty("chargeOfferRef")
  private String chargeOfferRef = null;

  @JsonProperty("glid")
  private String glid = null;

  @JsonProperty("minPercent")
  private BigDecimal minPercent = null;

  @JsonProperty("minAmount")
  private BigDecimal minAmount = null;

  @JsonProperty("maxIntervalDaysNEI")
  private Integer maxIntervalDaysNEI = null;

  @JsonProperty("maxNumNEI")
  private Integer maxNumNEI = null;

  @JsonProperty("qualifiers")
  @Valid
  private List<Qualifier> qualifiers = null;

  public InstallmentScheduleSpec id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The installment schedule specification ID.
   * @return id
   **/
  @Schema(description = "The installment schedule specification ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InstallmentScheduleSpec href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL that is used to get the object.
   * @return href
   **/
  @Schema(description = "The unique resource URL that is used to get the object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public InstallmentScheduleSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The installment schedule specification name.
   * @return name
   **/
  @Schema(required = true, description = "The installment schedule specification name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstallmentScheduleSpec descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The installment schedule specification description.
   * @return descr
   **/
  @Schema(description = "The installment schedule specification description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public InstallmentScheduleSpec createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the installment schedule specification is created.
   * @return createdAt
   **/
  @Schema(description = "The date when the installment schedule specification is created.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public InstallmentScheduleSpec modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date when the installment schedule specification is modified.
   * @return modifiedAt
   **/
  @Schema(description = "The date when the installment schedule specification is modified.")
  
    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public InstallmentScheduleSpec expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The expiry date of the installment schedule specification.
   * @return expiresAt
   **/
  @Schema(description = "The expiry date of the installment schedule specification.")
  
    public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public InstallmentScheduleSpec installmentType(InstallmentTypeEnum installmentType) {
    this.installmentType = installmentType;
    return this;
  }

  /**
   * The installment type that specifies if the installment schedule is EQUAL or UNEQUAL installments.
   * @return installmentType
   **/
  @Schema(description = "The installment type that specifies if the installment schedule is EQUAL or UNEQUAL installments.")
  
    public InstallmentTypeEnum getInstallmentType() {
    return installmentType;
  }

  public void setInstallmentType(InstallmentTypeEnum installmentType) {
    this.installmentType = installmentType;
  }

  public InstallmentScheduleSpec installmentPeriod(InstallmentPeriodEnum installmentPeriod) {
    this.installmentPeriod = installmentPeriod;
    return this;
  }

  /**
   * The frequency of the Installment. For future use.
   * @return installmentPeriod
   **/
  @Schema(description = "The frequency of the Installment. For future use.")
  
    public InstallmentPeriodEnum getInstallmentPeriod() {
    return installmentPeriod;
  }

  public void setInstallmentPeriod(InstallmentPeriodEnum installmentPeriod) {
    this.installmentPeriod = installmentPeriod;
  }

  public InstallmentScheduleSpec chargeOfferRef(String chargeOfferRef) {
    this.chargeOfferRef = chargeOfferRef;
    return this;
  }

  /**
   * The charge offer reference. For future use.
   * @return chargeOfferRef
   **/
  @Schema(description = "The charge offer reference. For future use.")
  
    public String getChargeOfferRef() {
    return chargeOfferRef;
  }

  public void setChargeOfferRef(String chargeOfferRef) {
    this.chargeOfferRef = chargeOfferRef;
  }

  public InstallmentScheduleSpec glid(String glid) {
    this.glid = glid;
    return this;
  }

  /**
   * The G/L ID used for recording the installment charge.
   * @return glid
   **/
  @Schema(description = "The G/L ID used for recording the installment charge.")
  
    public String getGlid() {
    return glid;
  }

  public void setGlid(String glid) {
    this.glid = glid;
  }

  public InstallmentScheduleSpec minPercent(BigDecimal minPercent) {
    this.minPercent = minPercent;
    return this;
  }

  /**
   * Conditional mandatory. Either minimum percentage or minimum amount is mandatory. The minimum bill/charge percentage to be considered for the installment conversion.
   * @return minPercent
   **/
  @Schema(required = true, description = "Conditional mandatory. Either minimum percentage or minimum amount is mandatory. The minimum bill/charge percentage to be considered for the installment conversion.")
      @NotNull

    @Valid
    public BigDecimal getMinPercent() {
    return minPercent;
  }

  public void setMinPercent(BigDecimal minPercent) {
    this.minPercent = minPercent;
  }

  public InstallmentScheduleSpec minAmount(BigDecimal minAmount) {
    this.minAmount = minAmount;
    return this;
  }

  /**
   * Conditional mandatory. Either minimum percentage or minimum amount is mandatory. The minimum bill/charge amount to be considered for the installment conversion.
   * @return minAmount
   **/
  @Schema(required = true, description = "Conditional mandatory. Either minimum percentage or minimum amount is mandatory. The minimum bill/charge amount to be considered for the installment conversion.")
      @NotNull

    @Valid
    public BigDecimal getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(BigDecimal minAmount) {
    this.minAmount = minAmount;
  }

  public InstallmentScheduleSpec maxIntervalDaysNEI(Integer maxIntervalDaysNEI) {
    this.maxIntervalDaysNEI = maxIntervalDaysNEI;
    return this;
  }

  /**
   * The maximum number of days between non-equal installments.
   * @return maxIntervalDaysNEI
   **/
  @Schema(required = true, description = "The maximum number of days between non-equal installments.")
      @NotNull

    public Integer getMaxIntervalDaysNEI() {
    return maxIntervalDaysNEI;
  }

  public void setMaxIntervalDaysNEI(Integer maxIntervalDaysNEI) {
    this.maxIntervalDaysNEI = maxIntervalDaysNEI;
  }

  public InstallmentScheduleSpec maxNumNEI(Integer maxNumNEI) {
    this.maxNumNEI = maxNumNEI;
    return this;
  }

  /**
   * The maximum number of non-equal installments.
   * @return maxNumNEI
   **/
  @Schema(required = true, description = "The maximum number of non-equal installments.")
      @NotNull

    public Integer getMaxNumNEI() {
    return maxNumNEI;
  }

  public void setMaxNumNEI(Integer maxNumNEI) {
    this.maxNumNEI = maxNumNEI;
  }

  public InstallmentScheduleSpec qualifiers(List<Qualifier> qualifiers) {
    this.qualifiers = qualifiers;
    return this;
  }

  public InstallmentScheduleSpec addQualifiersItem(Qualifier qualifiersItem) {
    if (this.qualifiers == null) {
      this.qualifiers = new ArrayList<Qualifier>();
    }
    this.qualifiers.add(qualifiersItem);
    return this;
  }

  /**
   * The key-value pairs and comparison operators to be evaluated against customer data during the installment creation.
   * @return qualifiers
   **/
  @Schema(description = "The key-value pairs and comparison operators to be evaluated against customer data during the installment creation.")
      @Valid
    public List<Qualifier> getQualifiers() {
    return qualifiers;
  }

  public void setQualifiers(List<Qualifier> qualifiers) {
    this.qualifiers = qualifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentScheduleSpec installmentScheduleSpec = (InstallmentScheduleSpec) o;
    return Objects.equals(this.id, installmentScheduleSpec.id) &&
        Objects.equals(this.href, installmentScheduleSpec.href) &&
        Objects.equals(this.name, installmentScheduleSpec.name) &&
        Objects.equals(this.descr, installmentScheduleSpec.descr) &&
        Objects.equals(this.createdAt, installmentScheduleSpec.createdAt) &&
        Objects.equals(this.modifiedAt, installmentScheduleSpec.modifiedAt) &&
        Objects.equals(this.expiresAt, installmentScheduleSpec.expiresAt) &&
        Objects.equals(this.installmentType, installmentScheduleSpec.installmentType) &&
        Objects.equals(this.installmentPeriod, installmentScheduleSpec.installmentPeriod) &&
        Objects.equals(this.chargeOfferRef, installmentScheduleSpec.chargeOfferRef) &&
        Objects.equals(this.glid, installmentScheduleSpec.glid) &&
        Objects.equals(this.minPercent, installmentScheduleSpec.minPercent) &&
        Objects.equals(this.minAmount, installmentScheduleSpec.minAmount) &&
        Objects.equals(this.maxIntervalDaysNEI, installmentScheduleSpec.maxIntervalDaysNEI) &&
        Objects.equals(this.maxNumNEI, installmentScheduleSpec.maxNumNEI) &&
        Objects.equals(this.qualifiers, installmentScheduleSpec.qualifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, descr, createdAt, modifiedAt, expiresAt, installmentType, installmentPeriod, chargeOfferRef, glid, minPercent, minAmount, maxIntervalDaysNEI, maxNumNEI, qualifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentScheduleSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    installmentType: ").append(toIndentedString(installmentType)).append("\n");
    sb.append("    installmentPeriod: ").append(toIndentedString(installmentPeriod)).append("\n");
    sb.append("    chargeOfferRef: ").append(toIndentedString(chargeOfferRef)).append("\n");
    sb.append("    glid: ").append(toIndentedString(glid)).append("\n");
    sb.append("    minPercent: ").append(toIndentedString(minPercent)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    maxIntervalDaysNEI: ").append(toIndentedString(maxIntervalDaysNEI)).append("\n");
    sb.append("    maxNumNEI: ").append(toIndentedString(maxNumNEI)).append("\n");
    sb.append("    qualifiers: ").append(toIndentedString(qualifiers)).append("\n");
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
