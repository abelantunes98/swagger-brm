package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.model.Service;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplyLoan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ApplyLoan   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("service")
  private Service service = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("resourceId")
  private BigDecimal resourceId = null;

  @JsonProperty("locale")
  private String locale = null;

  @JsonProperty("zoneMapTarget")
  private String zoneMapTarget = null;

  @JsonProperty("zoneMapName")
  private String zoneMapName = null;

  @JsonProperty("channel")
  private String channel = null;

  @JsonProperty("type")
  private Integer type = null;

  public ApplyLoan extension(Object extension) {
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

  public ApplyLoan accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public ApplyLoan service(Service service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   **/
  @Schema(description = "")
  
    @Valid
    public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }

  public ApplyLoan amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The loan amount.
   * @return amount
   **/
  @Schema(required = true, description = "The loan amount.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public ApplyLoan resourceId(BigDecimal resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The ID of the resource associated with the loan.
   * @return resourceId
   **/
  @Schema(required = true, description = "The ID of the resource associated with the loan.")
      @NotNull

    @Valid
    public BigDecimal getResourceId() {
    return resourceId;
  }

  public void setResourceId(BigDecimal resourceId) {
    this.resourceId = resourceId;
  }

  public ApplyLoan locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The locale associated with the loan.
   * @return locale
   **/
  @Schema(required = true, description = "The locale associated with the loan.")
      @NotNull

    public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public ApplyLoan zoneMapTarget(String zoneMapTarget) {
    this.zoneMapTarget = zoneMapTarget;
    return this;
  }

  /**
   * The zone map associated with the loan.
   * @return zoneMapTarget
   **/
  @Schema(required = true, description = "The zone map associated with the loan.")
      @NotNull

    public String getZoneMapTarget() {
    return zoneMapTarget;
  }

  public void setZoneMapTarget(String zoneMapTarget) {
    this.zoneMapTarget = zoneMapTarget;
  }

  public ApplyLoan zoneMapName(String zoneMapName) {
    this.zoneMapName = zoneMapName;
    return this;
  }

  /**
   * The name of the zonemap associated with the loan.
   * @return zoneMapName
   **/
  @Schema(required = true, description = "The name of the zonemap associated with the loan.")
      @NotNull

    public String getZoneMapName() {
    return zoneMapName;
  }

  public void setZoneMapName(String zoneMapName) {
    this.zoneMapName = zoneMapName;
  }

  public ApplyLoan channel(String channel) {
    this.channel = channel;
    return this;
  }

  /**
   * The channel requesting the loan. For example, USSD or IVR.
   * @return channel
   **/
  @Schema(required = true, description = "The channel requesting the loan. For example, USSD or IVR.")
      @NotNull

    public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public ApplyLoan type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * The type of loan. Can be one of the following: <ul><li><b>0</b>: Currency or emergency loan</li><li><b>1</b>: Data loan</li><li><b>2</b>: Hybrid loan</li><ul>
   * @return type
   **/
  @Schema(description = "The type of loan. Can be one of the following: <ul><li><b>0</b>: Currency or emergency loan</li><li><b>1</b>: Data loan</li><li><b>2</b>: Hybrid loan</li><ul>")
  
    public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyLoan applyLoan = (ApplyLoan) o;
    return Objects.equals(this.extension, applyLoan.extension) &&
        Objects.equals(this.accountRef, applyLoan.accountRef) &&
        Objects.equals(this.service, applyLoan.service) &&
        Objects.equals(this.amount, applyLoan.amount) &&
        Objects.equals(this.resourceId, applyLoan.resourceId) &&
        Objects.equals(this.locale, applyLoan.locale) &&
        Objects.equals(this.zoneMapTarget, applyLoan.zoneMapTarget) &&
        Objects.equals(this.zoneMapName, applyLoan.zoneMapName) &&
        Objects.equals(this.channel, applyLoan.channel) &&
        Objects.equals(this.type, applyLoan.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountRef, service, amount, resourceId, locale, zoneMapTarget, zoneMapName, channel, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyLoan {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    zoneMapTarget: ").append(toIndentedString(zoneMapTarget)).append("\n");
    sb.append("    zoneMapName: ").append(toIndentedString(zoneMapName)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
