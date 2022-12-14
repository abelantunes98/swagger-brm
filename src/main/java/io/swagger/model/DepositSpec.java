package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.Money;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The deposit specification.
 */
@Schema(description = "The deposit specification.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositSpec   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("modifiedAt")
  private String modifiedAt = null;

  @JsonProperty("expiresAt")
  private String expiresAt = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("permitted")
  private String permitted = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("descr")
  private String descr = null;

  /**
   * The deposit specification status.
   */
  public enum StatusEnum {
    DRAFT("DRAFT"),
    
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

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
  private StatusEnum status = null;

  @JsonProperty("profileRef")
  private String profileRef = null;

  @JsonProperty("chargeOfferRef")
  private String chargeOfferRef = null;

  /**
   * The bill preference for the deposit specification.
   */
  public enum BillPreferenceEnum {
    IMMEDIATE("IMMEDIATE"),
    
    AUTOALIGN("AUTOALIGN");

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
  private BillPreferenceEnum billPreference = BillPreferenceEnum.AUTOALIGN;

  @JsonProperty("creditLimitFlag")
  private Boolean creditLimitFlag = null;

  @JsonProperty("amount")
  private Money amount = null;

  @JsonProperty("glCode")
  private String glCode = null;

  public DepositSpec id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit specification ID
   * @return id
   **/
  @Schema(description = "The deposit specification ID")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositSpec href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL, used to get the object.
   * @return href
   **/
  @Schema(description = "The unique resource URL, used to get the object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public DepositSpec createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit specification is created.
   * @return createdAt
   **/
  @Schema(description = "The date when the deposit specification is created.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositSpec modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date when the deposit specification is modified.
   * @return modifiedAt
   **/
  @Schema(description = "The date when the deposit specification is modified.")
  
    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public DepositSpec expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The expiry date of the deposit specfication.
   * @return expiresAt
   **/
  @Schema(description = "The expiry date of the deposit specfication.")
  
    public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public DepositSpec category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The deposit specification category.
   * @return category
   **/
  @Schema(description = "The deposit specification category.")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DepositSpec permitted(String permitted) {
    this.permitted = permitted;
    return this;
  }

  /**
   * If the deposit specification is permitted or not.
   * @return permitted
   **/
  @Schema(description = "If the deposit specification is permitted or not.")
  
    public String getPermitted() {
    return permitted;
  }

  public void setPermitted(String permitted) {
    this.permitted = permitted;
  }

  public DepositSpec code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The deposit specification code type.
   * @return code
   **/
  @Schema(description = "The deposit specification code type.")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DepositSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The deposit specification name.
   * @return name
   **/
  @Schema(required = true, description = "The deposit specification name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DepositSpec descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The deposit specification description.
   * @return descr
   **/
  @Schema(description = "The deposit specification description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public DepositSpec status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The deposit specification status.
   * @return status
   **/
  @Schema(description = "The deposit specification status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DepositSpec profileRef(String profileRef) {
    this.profileRef = profileRef;
    return this;
  }

  /**
   * The deposit specification profile reference.
   * @return profileRef
   **/
  @Schema(required = true, description = "The deposit specification profile reference.")
      @NotNull

    public String getProfileRef() {
    return profileRef;
  }

  public void setProfileRef(String profileRef) {
    this.profileRef = profileRef;
  }

  public DepositSpec chargeOfferRef(String chargeOfferRef) {
    this.chargeOfferRef = chargeOfferRef;
    return this;
  }

  /**
   * The charge offer reference for the deposit specification.
   * @return chargeOfferRef
   **/
  @Schema(required = true, description = "The charge offer reference for the deposit specification.")
      @NotNull

    public String getChargeOfferRef() {
    return chargeOfferRef;
  }

  public void setChargeOfferRef(String chargeOfferRef) {
    this.chargeOfferRef = chargeOfferRef;
  }

  public DepositSpec billPreference(BillPreferenceEnum billPreference) {
    this.billPreference = billPreference;
    return this;
  }

  /**
   * The bill preference for the deposit specification.
   * @return billPreference
   **/
  @Schema(description = "The bill preference for the deposit specification.")
  
    public BillPreferenceEnum getBillPreference() {
    return billPreference;
  }

  public void setBillPreference(BillPreferenceEnum billPreference) {
    this.billPreference = billPreference;
  }

  public DepositSpec creditLimitFlag(Boolean creditLimitFlag) {
    this.creditLimitFlag = creditLimitFlag;
    return this;
  }

  /**
   * Whether to increase the customer credit limit by the deposit amount (<b>true</b>) or not (<b>false</b>).
   * @return creditLimitFlag
   **/
  @Schema(description = "Whether to increase the customer credit limit by the deposit amount (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isCreditLimitFlag() {
    return creditLimitFlag;
  }

  public void setCreditLimitFlag(Boolean creditLimitFlag) {
    this.creditLimitFlag = creditLimitFlag;
  }

  public DepositSpec amount(Money amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @Schema(description = "")
  
    @Valid
    public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public DepositSpec glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

  /**
   * The general ledger ID.
   * @return glCode
   **/
  @Schema(description = "The general ledger ID.")
  
    public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSpec depositSpec = (DepositSpec) o;
    return Objects.equals(this.id, depositSpec.id) &&
        Objects.equals(this.href, depositSpec.href) &&
        Objects.equals(this.createdAt, depositSpec.createdAt) &&
        Objects.equals(this.modifiedAt, depositSpec.modifiedAt) &&
        Objects.equals(this.expiresAt, depositSpec.expiresAt) &&
        Objects.equals(this.category, depositSpec.category) &&
        Objects.equals(this.permitted, depositSpec.permitted) &&
        Objects.equals(this.code, depositSpec.code) &&
        Objects.equals(this.name, depositSpec.name) &&
        Objects.equals(this.descr, depositSpec.descr) &&
        Objects.equals(this.status, depositSpec.status) &&
        Objects.equals(this.profileRef, depositSpec.profileRef) &&
        Objects.equals(this.chargeOfferRef, depositSpec.chargeOfferRef) &&
        Objects.equals(this.billPreference, depositSpec.billPreference) &&
        Objects.equals(this.creditLimitFlag, depositSpec.creditLimitFlag) &&
        Objects.equals(this.amount, depositSpec.amount) &&
        Objects.equals(this.glCode, depositSpec.glCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, modifiedAt, expiresAt, category, permitted, code, name, descr, status, profileRef, chargeOfferRef, billPreference, creditLimitFlag, amount, glCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    permitted: ").append(toIndentedString(permitted)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    profileRef: ").append(toIndentedString(profileRef)).append("\n");
    sb.append("    chargeOfferRef: ").append(toIndentedString(chargeOfferRef)).append("\n");
    sb.append("    billPreference: ").append(toIndentedString(billPreference)).append("\n");
    sb.append("    creditLimitFlag: ").append(toIndentedString(creditLimitFlag)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
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
