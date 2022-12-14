package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ContractPreviewCancellationCharge;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubscriptionPreviewCancellationCharges
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SubscriptionPreviewCancellationCharges   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("scopeLevel")
  private Integer scopeLevel = null;

  @JsonProperty("currency")
  private Integer currency = null;

  @JsonProperty("totalCancellationFee")
  private BigDecimal totalCancellationFee = null;

  @JsonProperty("contractPreviewCancellationCharges")
  @Valid
  private List<ContractPreviewCancellationCharge> contractPreviewCancellationCharges = null;

  public SubscriptionPreviewCancellationCharges extension(Object extension) {
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

  public SubscriptionPreviewCancellationCharges accountRef(ResourceRef accountRef) {
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

  public SubscriptionPreviewCancellationCharges scopeLevel(Integer scopeLevel) {
    this.scopeLevel = scopeLevel;
    return this;
  }

  /**
   * The level of the cancelation. Can be one of the following: <ul><li><b>1</b>: Account level</li><li><b>2</b>: Package level</li><li><b>3</b>: Bundle level</li></ul>
   * @return scopeLevel
   **/
  @Schema(description = "The level of the cancelation. Can be one of the following: <ul><li><b>1</b>: Account level</li><li><b>2</b>: Package level</li><li><b>3</b>: Bundle level</li></ul>")
  
    public Integer getScopeLevel() {
    return scopeLevel;
  }

  public void setScopeLevel(Integer scopeLevel) {
    this.scopeLevel = scopeLevel;
  }

  public SubscriptionPreviewCancellationCharges currency(Integer currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency associated with the cancelation fee.
   * @return currency
   **/
  @Schema(description = "The currency associated with the cancelation fee.")
  
    public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }

  public SubscriptionPreviewCancellationCharges totalCancellationFee(BigDecimal totalCancellationFee) {
    this.totalCancellationFee = totalCancellationFee;
    return this;
  }

  /**
   * The total cancelation fee.
   * @return totalCancellationFee
   **/
  @Schema(required = true, description = "The total cancelation fee.")
      @NotNull

    @Valid
    public BigDecimal getTotalCancellationFee() {
    return totalCancellationFee;
  }

  public void setTotalCancellationFee(BigDecimal totalCancellationFee) {
    this.totalCancellationFee = totalCancellationFee;
  }

  public SubscriptionPreviewCancellationCharges contractPreviewCancellationCharges(List<ContractPreviewCancellationCharge> contractPreviewCancellationCharges) {
    this.contractPreviewCancellationCharges = contractPreviewCancellationCharges;
    return this;
  }

  public SubscriptionPreviewCancellationCharges addContractPreviewCancellationChargesItem(ContractPreviewCancellationCharge contractPreviewCancellationChargesItem) {
    if (this.contractPreviewCancellationCharges == null) {
      this.contractPreviewCancellationCharges = new ArrayList<ContractPreviewCancellationCharge>();
    }
    this.contractPreviewCancellationCharges.add(contractPreviewCancellationChargesItem);
    return this;
  }

  /**
   * An itemized list of cancelation fees.
   * @return contractPreviewCancellationCharges
   **/
  @Schema(description = "An itemized list of cancelation fees.")
      @Valid
    public List<ContractPreviewCancellationCharge> getContractPreviewCancellationCharges() {
    return contractPreviewCancellationCharges;
  }

  public void setContractPreviewCancellationCharges(List<ContractPreviewCancellationCharge> contractPreviewCancellationCharges) {
    this.contractPreviewCancellationCharges = contractPreviewCancellationCharges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPreviewCancellationCharges subscriptionPreviewCancellationCharges = (SubscriptionPreviewCancellationCharges) o;
    return Objects.equals(this.extension, subscriptionPreviewCancellationCharges.extension) &&
        Objects.equals(this.accountRef, subscriptionPreviewCancellationCharges.accountRef) &&
        Objects.equals(this.scopeLevel, subscriptionPreviewCancellationCharges.scopeLevel) &&
        Objects.equals(this.currency, subscriptionPreviewCancellationCharges.currency) &&
        Objects.equals(this.totalCancellationFee, subscriptionPreviewCancellationCharges.totalCancellationFee) &&
        Objects.equals(this.contractPreviewCancellationCharges, subscriptionPreviewCancellationCharges.contractPreviewCancellationCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountRef, scopeLevel, currency, totalCancellationFee, contractPreviewCancellationCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPreviewCancellationCharges {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    scopeLevel: ").append(toIndentedString(scopeLevel)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalCancellationFee: ").append(toIndentedString(totalCancellationFee)).append("\n");
    sb.append("    contractPreviewCancellationCharges: ").append(toIndentedString(contractPreviewCancellationCharges)).append("\n");
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
