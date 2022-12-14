package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.DepositInterestRule;
import io.swagger.model.DepositRefundRule;
import io.swagger.model.DepositValidityRule;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositSpecProfile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositSpecProfile   {
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

  @JsonProperty("expiresAt")
  private String expiresAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("descr")
  private String descr = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("isRefundable")
  private Boolean isRefundable = true;

  @JsonProperty("isPayinterest")
  private Boolean isPayinterest = false;

  @JsonProperty("isExemptible")
  private Boolean isExemptible = false;

  @JsonProperty("isOverridable")
  private Boolean isOverridable = true;

  @JsonProperty("isTransferrable")
  private Boolean isTransferrable = true;

  /**
   * Specify the release type for the deposit specification profile.
   */
  public enum ReleaseTypeEnum {
    REFUND("REFUND"),
    
    PREPAYMENT("PREPAYMENT"),
    
    ZEROISE("ZEROISE");

    private String value;

    ReleaseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReleaseTypeEnum fromValue(String text) {
      for (ReleaseTypeEnum b : ReleaseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("releaseType")
  private ReleaseTypeEnum releaseType = null;

  @JsonProperty("refundRule")
  private DepositRefundRule refundRule = null;

  @JsonProperty("interestRule")
  private DepositInterestRule interestRule = null;

  @JsonProperty("validityRule")
  private DepositValidityRule validityRule = null;

  /**
   * The deposit validity rule source.
   */
  public enum ValidityRuleSourceEnum {
    SYSTEM_DEFINED("SYSTEM_DEFINED"),
    
    RULE_DEFINED("RULE_DEFINED");

    private String value;

    ValidityRuleSourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValidityRuleSourceEnum fromValue(String text) {
      for (ValidityRuleSourceEnum b : ValidityRuleSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("validityRuleSource")
  private ValidityRuleSourceEnum validityRuleSource = null;

  public DepositSpecProfile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit specification profile ID.
   * @return id
   **/
  @Schema(description = "The deposit specification profile ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositSpecProfile href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL, used to get the deposit specification profile object.
   * @return href
   **/
  @Schema(description = "The unique resource URL, used to get the deposit specification profile object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public DepositSpecProfile createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit specification profile is created.
   * @return createdAt
   **/
  @Schema(description = "The date when the deposit specification profile is created.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositSpecProfile modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date when the deposit specification profile is modified.
   * @return modifiedAt
   **/
  @Schema(description = "The date when the deposit specification profile is modified.")
  
    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public DepositSpecProfile startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * The start date of the deposit specification profile.
   * @return startsAt
   **/
  @Schema(description = "The start date of the deposit specification profile.")
  
    public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public DepositSpecProfile expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The expiry date of the deposit specification profile.
   * @return expiresAt
   **/
  @Schema(description = "The expiry date of the deposit specification profile.")
  
    public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public DepositSpecProfile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The deposit specification profile name.
   * @return name
   **/
  @Schema(required = true, description = "The deposit specification profile name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DepositSpecProfile descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The deposit specification profile description.
   * @return descr
   **/
  @Schema(description = "The deposit specification profile description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public DepositSpecProfile code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The deposit specification profile code.
   * @return code
   **/
  @Schema(description = "The deposit specification profile code.")
  
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DepositSpecProfile isRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
    return this;
  }

  /**
   * Specify if the deposit specification profile is refundable (<b>true</b>) or not (<b>false</b>).
   * @return isRefundable
   **/
  @Schema(description = "Specify if the deposit specification profile is refundable (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isIsRefundable() {
    return isRefundable;
  }

  public void setIsRefundable(Boolean isRefundable) {
    this.isRefundable = isRefundable;
  }

  public DepositSpecProfile isPayinterest(Boolean isPayinterest) {
    this.isPayinterest = isPayinterest;
    return this;
  }

  /**
   * Specify if the interest must be payed for the deposit specification profile (<b>true</b>) or not (<b>false</b>).
   * @return isPayinterest
   **/
  @Schema(description = "Specify if the interest must be payed for the deposit specification profile (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isIsPayinterest() {
    return isPayinterest;
  }

  public void setIsPayinterest(Boolean isPayinterest) {
    this.isPayinterest = isPayinterest;
  }

  public DepositSpecProfile isExemptible(Boolean isExemptible) {
    this.isExemptible = isExemptible;
    return this;
  }

  /**
   * Specify if the deposit specification profile is exemptible (<b>true</b>) or not (<b>false</b>).
   * @return isExemptible
   **/
  @Schema(description = "Specify if the deposit specification profile is exemptible (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isIsExemptible() {
    return isExemptible;
  }

  public void setIsExemptible(Boolean isExemptible) {
    this.isExemptible = isExemptible;
  }

  public DepositSpecProfile isOverridable(Boolean isOverridable) {
    this.isOverridable = isOverridable;
    return this;
  }

  /**
   * Specify if the deposit specification profile is overridable (<b>true</b>) or not (<b>false</b>).
   * @return isOverridable
   **/
  @Schema(description = "Specify if the deposit specification profile is overridable (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isIsOverridable() {
    return isOverridable;
  }

  public void setIsOverridable(Boolean isOverridable) {
    this.isOverridable = isOverridable;
  }

  public DepositSpecProfile isTransferrable(Boolean isTransferrable) {
    this.isTransferrable = isTransferrable;
    return this;
  }

  /**
   * Specify if the deposit specification profile is transferrable (<b>true</b>) or not (<b>false</b>).
   * @return isTransferrable
   **/
  @Schema(description = "Specify if the deposit specification profile is transferrable (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isIsTransferrable() {
    return isTransferrable;
  }

  public void setIsTransferrable(Boolean isTransferrable) {
    this.isTransferrable = isTransferrable;
  }

  public DepositSpecProfile releaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
    return this;
  }

  /**
   * Specify the release type for the deposit specification profile.
   * @return releaseType
   **/
  @Schema(description = "Specify the release type for the deposit specification profile.")
  
    public ReleaseTypeEnum getReleaseType() {
    return releaseType;
  }

  public void setReleaseType(ReleaseTypeEnum releaseType) {
    this.releaseType = releaseType;
  }

  public DepositSpecProfile refundRule(DepositRefundRule refundRule) {
    this.refundRule = refundRule;
    return this;
  }

  /**
   * Get refundRule
   * @return refundRule
   **/
  @Schema(description = "")
  
    @Valid
    public DepositRefundRule getRefundRule() {
    return refundRule;
  }

  public void setRefundRule(DepositRefundRule refundRule) {
    this.refundRule = refundRule;
  }

  public DepositSpecProfile interestRule(DepositInterestRule interestRule) {
    this.interestRule = interestRule;
    return this;
  }

  /**
   * Get interestRule
   * @return interestRule
   **/
  @Schema(description = "")
  
    @Valid
    public DepositInterestRule getInterestRule() {
    return interestRule;
  }

  public void setInterestRule(DepositInterestRule interestRule) {
    this.interestRule = interestRule;
  }

  public DepositSpecProfile validityRule(DepositValidityRule validityRule) {
    this.validityRule = validityRule;
    return this;
  }

  /**
   * Get validityRule
   * @return validityRule
   **/
  @Schema(description = "")
  
    @Valid
    public DepositValidityRule getValidityRule() {
    return validityRule;
  }

  public void setValidityRule(DepositValidityRule validityRule) {
    this.validityRule = validityRule;
  }

  public DepositSpecProfile validityRuleSource(ValidityRuleSourceEnum validityRuleSource) {
    this.validityRuleSource = validityRuleSource;
    return this;
  }

  /**
   * The deposit validity rule source.
   * @return validityRuleSource
   **/
  @Schema(description = "The deposit validity rule source.")
  
    public ValidityRuleSourceEnum getValidityRuleSource() {
    return validityRuleSource;
  }

  public void setValidityRuleSource(ValidityRuleSourceEnum validityRuleSource) {
    this.validityRuleSource = validityRuleSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositSpecProfile depositSpecProfile = (DepositSpecProfile) o;
    return Objects.equals(this.id, depositSpecProfile.id) &&
        Objects.equals(this.href, depositSpecProfile.href) &&
        Objects.equals(this.createdAt, depositSpecProfile.createdAt) &&
        Objects.equals(this.modifiedAt, depositSpecProfile.modifiedAt) &&
        Objects.equals(this.startsAt, depositSpecProfile.startsAt) &&
        Objects.equals(this.expiresAt, depositSpecProfile.expiresAt) &&
        Objects.equals(this.name, depositSpecProfile.name) &&
        Objects.equals(this.descr, depositSpecProfile.descr) &&
        Objects.equals(this.code, depositSpecProfile.code) &&
        Objects.equals(this.isRefundable, depositSpecProfile.isRefundable) &&
        Objects.equals(this.isPayinterest, depositSpecProfile.isPayinterest) &&
        Objects.equals(this.isExemptible, depositSpecProfile.isExemptible) &&
        Objects.equals(this.isOverridable, depositSpecProfile.isOverridable) &&
        Objects.equals(this.isTransferrable, depositSpecProfile.isTransferrable) &&
        Objects.equals(this.releaseType, depositSpecProfile.releaseType) &&
        Objects.equals(this.refundRule, depositSpecProfile.refundRule) &&
        Objects.equals(this.interestRule, depositSpecProfile.interestRule) &&
        Objects.equals(this.validityRule, depositSpecProfile.validityRule) &&
        Objects.equals(this.validityRuleSource, depositSpecProfile.validityRuleSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, modifiedAt, startsAt, expiresAt, name, descr, code, isRefundable, isPayinterest, isExemptible, isOverridable, isTransferrable, releaseType, refundRule, interestRule, validityRule, validityRuleSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositSpecProfile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isRefundable: ").append(toIndentedString(isRefundable)).append("\n");
    sb.append("    isPayinterest: ").append(toIndentedString(isPayinterest)).append("\n");
    sb.append("    isExemptible: ").append(toIndentedString(isExemptible)).append("\n");
    sb.append("    isOverridable: ").append(toIndentedString(isOverridable)).append("\n");
    sb.append("    isTransferrable: ").append(toIndentedString(isTransferrable)).append("\n");
    sb.append("    releaseType: ").append(toIndentedString(releaseType)).append("\n");
    sb.append("    refundRule: ").append(toIndentedString(refundRule)).append("\n");
    sb.append("    interestRule: ").append(toIndentedString(interestRule)).append("\n");
    sb.append("    validityRule: ").append(toIndentedString(validityRule)).append("\n");
    sb.append("    validityRuleSource: ").append(toIndentedString(validityRuleSource)).append("\n");
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
