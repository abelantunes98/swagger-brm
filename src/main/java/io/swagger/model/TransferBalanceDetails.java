package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.model.SourceImpactedBucket;
import io.swagger.model.SourceRef;
import io.swagger.model.SourceTransferFee;
import io.swagger.model.TargetImpactedBucket;
import io.swagger.model.TargetRef;
import io.swagger.model.TargetTransferFee;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The details of a balance transfer.
 */
@Schema(description = "The details of a balance transfer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class TransferBalanceDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("sourceAccountRef")
  private ResourceRef sourceAccountRef = null;

  @JsonProperty("targetAccountRef")
  private ResourceRef targetAccountRef = null;

  @JsonProperty("transferDate")
  private OffsetDateTime transferDate = null;

  @JsonProperty("sourceRef")
  private SourceRef sourceRef = null;

  @JsonProperty("targetRef")
  private TargetRef targetRef = null;

  @JsonProperty("transferAmount")
  private BigDecimal transferAmount = null;

  @JsonProperty("transferAmountType")
  private Integer transferAmountType = null;

  @JsonProperty("chargeSource")
  private Boolean chargeSource = null;

  @JsonProperty("chargeDestination")
  private Boolean chargeDestination = null;

  @JsonProperty("sourceImpactedBucket")
  @Valid
  private List<SourceImpactedBucket> sourceImpactedBucket = new ArrayList<SourceImpactedBucket>();

  @JsonProperty("targetImpactedBucket")
  @Valid
  private List<TargetImpactedBucket> targetImpactedBucket = new ArrayList<TargetImpactedBucket>();

  @JsonProperty("sourceTransferFee")
  private SourceTransferFee sourceTransferFee = null;

  @JsonProperty("targetTransferFee")
  private TargetTransferFee targetTransferFee = null;

  public TransferBalanceDetails extension(Object extension) {
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

  public TransferBalanceDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The transfer's ID.
   * @return id
   **/
  @Schema(required = true, description = "The transfer's ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransferBalanceDetails sourceAccountRef(ResourceRef sourceAccountRef) {
    this.sourceAccountRef = sourceAccountRef;
    return this;
  }

  /**
   * Get sourceAccountRef
   * @return sourceAccountRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getSourceAccountRef() {
    return sourceAccountRef;
  }

  public void setSourceAccountRef(ResourceRef sourceAccountRef) {
    this.sourceAccountRef = sourceAccountRef;
  }

  public TransferBalanceDetails targetAccountRef(ResourceRef targetAccountRef) {
    this.targetAccountRef = targetAccountRef;
    return this;
  }

  /**
   * Get targetAccountRef
   * @return targetAccountRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getTargetAccountRef() {
    return targetAccountRef;
  }

  public void setTargetAccountRef(ResourceRef targetAccountRef) {
    this.targetAccountRef = targetAccountRef;
  }

  public TransferBalanceDetails transferDate(OffsetDateTime transferDate) {
    this.transferDate = transferDate;
    return this;
  }

  /**
   * The date and time of the transfer.
   * @return transferDate
   **/
  @Schema(required = true, description = "The date and time of the transfer.")
      @NotNull

    @Valid
    public OffsetDateTime getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(OffsetDateTime transferDate) {
    this.transferDate = transferDate;
  }

  public TransferBalanceDetails sourceRef(SourceRef sourceRef) {
    this.sourceRef = sourceRef;
    return this;
  }

  /**
   * Get sourceRef
   * @return sourceRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SourceRef getSourceRef() {
    return sourceRef;
  }

  public void setSourceRef(SourceRef sourceRef) {
    this.sourceRef = sourceRef;
  }

  public TransferBalanceDetails targetRef(TargetRef targetRef) {
    this.targetRef = targetRef;
    return this;
  }

  /**
   * Get targetRef
   * @return targetRef
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public TargetRef getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(TargetRef targetRef) {
    this.targetRef = targetRef;
  }

  public TransferBalanceDetails transferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  /**
   * The transfer amount.
   * @return transferAmount
   **/
  @Schema(required = true, description = "The transfer amount.")
      @NotNull

    @Valid
    public BigDecimal getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
  }

  public TransferBalanceDetails transferAmountType(Integer transferAmountType) {
    this.transferAmountType = transferAmountType;
    return this;
  }

  /**
   * The transfer amount's type.
   * @return transferAmountType
   **/
  @Schema(description = "The transfer amount's type.")
  
    public Integer getTransferAmountType() {
    return transferAmountType;
  }

  public void setTransferAmountType(Integer transferAmountType) {
    this.transferAmountType = transferAmountType;
  }

  public TransferBalanceDetails chargeSource(Boolean chargeSource) {
    this.chargeSource = chargeSource;
    return this;
  }

  /**
   * Whether the fee is charged to the transfer's source (<b>true</b>) or not (<b>false</b>). A fee can be charged to both the source and target.
   * @return chargeSource
   **/
  @Schema(description = "Whether the fee is charged to the transfer's source (<b>true</b>) or not (<b>false</b>). A fee can be charged to both the source and target.")
  
    public Boolean isChargeSource() {
    return chargeSource;
  }

  public void setChargeSource(Boolean chargeSource) {
    this.chargeSource = chargeSource;
  }

  public TransferBalanceDetails chargeDestination(Boolean chargeDestination) {
    this.chargeDestination = chargeDestination;
    return this;
  }

  /**
   * Whether the fee is charged to the transfer's target (<b>true</b>) or not (<b>false</b>). A fee can be charged to both the source and target.
   * @return chargeDestination
   **/
  @Schema(description = "Whether the fee is charged to the transfer's target (<b>true</b>) or not (<b>false</b>). A fee can be charged to both the source and target.")
  
    public Boolean isChargeDestination() {
    return chargeDestination;
  }

  public void setChargeDestination(Boolean chargeDestination) {
    this.chargeDestination = chargeDestination;
  }

  public TransferBalanceDetails sourceImpactedBucket(List<SourceImpactedBucket> sourceImpactedBucket) {
    this.sourceImpactedBucket = sourceImpactedBucket;
    return this;
  }

  public TransferBalanceDetails addSourceImpactedBucketItem(SourceImpactedBucket sourceImpactedBucketItem) {
    this.sourceImpactedBucket.add(sourceImpactedBucketItem);
    return this;
  }

  /**
   * The list of impacted buckets at the source.
   * @return sourceImpactedBucket
   **/
  @Schema(required = true, description = "The list of impacted buckets at the source.")
      @NotNull
    @Valid
    public List<SourceImpactedBucket> getSourceImpactedBucket() {
    return sourceImpactedBucket;
  }

  public void setSourceImpactedBucket(List<SourceImpactedBucket> sourceImpactedBucket) {
    this.sourceImpactedBucket = sourceImpactedBucket;
  }

  public TransferBalanceDetails targetImpactedBucket(List<TargetImpactedBucket> targetImpactedBucket) {
    this.targetImpactedBucket = targetImpactedBucket;
    return this;
  }

  public TransferBalanceDetails addTargetImpactedBucketItem(TargetImpactedBucket targetImpactedBucketItem) {
    this.targetImpactedBucket.add(targetImpactedBucketItem);
    return this;
  }

  /**
   * The list of impacted buckets at the target.
   * @return targetImpactedBucket
   **/
  @Schema(required = true, description = "The list of impacted buckets at the target.")
      @NotNull
    @Valid
    public List<TargetImpactedBucket> getTargetImpactedBucket() {
    return targetImpactedBucket;
  }

  public void setTargetImpactedBucket(List<TargetImpactedBucket> targetImpactedBucket) {
    this.targetImpactedBucket = targetImpactedBucket;
  }

  public TransferBalanceDetails sourceTransferFee(SourceTransferFee sourceTransferFee) {
    this.sourceTransferFee = sourceTransferFee;
    return this;
  }

  /**
   * Get sourceTransferFee
   * @return sourceTransferFee
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public SourceTransferFee getSourceTransferFee() {
    return sourceTransferFee;
  }

  public void setSourceTransferFee(SourceTransferFee sourceTransferFee) {
    this.sourceTransferFee = sourceTransferFee;
  }

  public TransferBalanceDetails targetTransferFee(TargetTransferFee targetTransferFee) {
    this.targetTransferFee = targetTransferFee;
    return this;
  }

  /**
   * Get targetTransferFee
   * @return targetTransferFee
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public TargetTransferFee getTargetTransferFee() {
    return targetTransferFee;
  }

  public void setTargetTransferFee(TargetTransferFee targetTransferFee) {
    this.targetTransferFee = targetTransferFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferBalanceDetails transferBalanceDetails = (TransferBalanceDetails) o;
    return Objects.equals(this.extension, transferBalanceDetails.extension) &&
        Objects.equals(this.id, transferBalanceDetails.id) &&
        Objects.equals(this.sourceAccountRef, transferBalanceDetails.sourceAccountRef) &&
        Objects.equals(this.targetAccountRef, transferBalanceDetails.targetAccountRef) &&
        Objects.equals(this.transferDate, transferBalanceDetails.transferDate) &&
        Objects.equals(this.sourceRef, transferBalanceDetails.sourceRef) &&
        Objects.equals(this.targetRef, transferBalanceDetails.targetRef) &&
        Objects.equals(this.transferAmount, transferBalanceDetails.transferAmount) &&
        Objects.equals(this.transferAmountType, transferBalanceDetails.transferAmountType) &&
        Objects.equals(this.chargeSource, transferBalanceDetails.chargeSource) &&
        Objects.equals(this.chargeDestination, transferBalanceDetails.chargeDestination) &&
        Objects.equals(this.sourceImpactedBucket, transferBalanceDetails.sourceImpactedBucket) &&
        Objects.equals(this.targetImpactedBucket, transferBalanceDetails.targetImpactedBucket) &&
        Objects.equals(this.sourceTransferFee, transferBalanceDetails.sourceTransferFee) &&
        Objects.equals(this.targetTransferFee, transferBalanceDetails.targetTransferFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, sourceAccountRef, targetAccountRef, transferDate, sourceRef, targetRef, transferAmount, transferAmountType, chargeSource, chargeDestination, sourceImpactedBucket, targetImpactedBucket, sourceTransferFee, targetTransferFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferBalanceDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sourceAccountRef: ").append(toIndentedString(sourceAccountRef)).append("\n");
    sb.append("    targetAccountRef: ").append(toIndentedString(targetAccountRef)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    sourceRef: ").append(toIndentedString(sourceRef)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferAmountType: ").append(toIndentedString(transferAmountType)).append("\n");
    sb.append("    chargeSource: ").append(toIndentedString(chargeSource)).append("\n");
    sb.append("    chargeDestination: ").append(toIndentedString(chargeDestination)).append("\n");
    sb.append("    sourceImpactedBucket: ").append(toIndentedString(sourceImpactedBucket)).append("\n");
    sb.append("    targetImpactedBucket: ").append(toIndentedString(targetImpactedBucket)).append("\n");
    sb.append("    sourceTransferFee: ").append(toIndentedString(sourceTransferFee)).append("\n");
    sb.append("    targetTransferFee: ").append(toIndentedString(targetTransferFee)).append("\n");
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
