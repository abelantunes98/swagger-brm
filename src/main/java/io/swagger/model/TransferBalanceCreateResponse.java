package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SourceBucket;
import io.swagger.model.SourceRef;
import io.swagger.model.SourceTransferFee;
import io.swagger.model.TargetBucket;
import io.swagger.model.TargetRef;
import io.swagger.model.TargetTransferFee;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response to a balance transfer create request.
 */
@Schema(description = "The response to a balance transfer create request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class TransferBalanceCreateResponse   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("sourceRef")
  private SourceRef sourceRef = null;

  @JsonProperty("targetRef")
  private TargetRef targetRef = null;

  @JsonProperty("transferAmount")
  private BigDecimal transferAmount = null;

  @JsonProperty("transferAmountType")
  private Integer transferAmountType = null;

  @JsonProperty("sourceBucket")
  private SourceBucket sourceBucket = null;

  @JsonProperty("targetBucket")
  private TargetBucket targetBucket = null;

  @JsonProperty("sourceTransferFee")
  private SourceTransferFee sourceTransferFee = null;

  @JsonProperty("targetTransferFee")
  private TargetTransferFee targetTransferFee = null;

  public TransferBalanceCreateResponse extension(Object extension) {
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

  public TransferBalanceCreateResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The response's ID.
   * @return id
   **/
  @Schema(required = true, description = "The response's ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TransferBalanceCreateResponse uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The response's URI.
   * @return uri
   **/
  @Schema(description = "The response's URI.")
  
    public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public TransferBalanceCreateResponse sourceRef(SourceRef sourceRef) {
    this.sourceRef = sourceRef;
    return this;
  }

  /**
   * Get sourceRef
   * @return sourceRef
   **/
  @Schema(description = "")
  
    @Valid
    public SourceRef getSourceRef() {
    return sourceRef;
  }

  public void setSourceRef(SourceRef sourceRef) {
    this.sourceRef = sourceRef;
  }

  public TransferBalanceCreateResponse targetRef(TargetRef targetRef) {
    this.targetRef = targetRef;
    return this;
  }

  /**
   * Get targetRef
   * @return targetRef
   **/
  @Schema(description = "")
  
    @Valid
    public TargetRef getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(TargetRef targetRef) {
    this.targetRef = targetRef;
  }

  public TransferBalanceCreateResponse transferAmount(BigDecimal transferAmount) {
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

  public TransferBalanceCreateResponse transferAmountType(Integer transferAmountType) {
    this.transferAmountType = transferAmountType;
    return this;
  }

  /**
   * The transfer amount's type.
   * @return transferAmountType
   **/
  @Schema(required = true, description = "The transfer amount's type.")
      @NotNull

    public Integer getTransferAmountType() {
    return transferAmountType;
  }

  public void setTransferAmountType(Integer transferAmountType) {
    this.transferAmountType = transferAmountType;
  }

  public TransferBalanceCreateResponse sourceBucket(SourceBucket sourceBucket) {
    this.sourceBucket = sourceBucket;
    return this;
  }

  /**
   * Get sourceBucket
   * @return sourceBucket
   **/
  @Schema(description = "")
  
    @Valid
    public SourceBucket getSourceBucket() {
    return sourceBucket;
  }

  public void setSourceBucket(SourceBucket sourceBucket) {
    this.sourceBucket = sourceBucket;
  }

  public TransferBalanceCreateResponse targetBucket(TargetBucket targetBucket) {
    this.targetBucket = targetBucket;
    return this;
  }

  /**
   * Get targetBucket
   * @return targetBucket
   **/
  @Schema(description = "")
  
    @Valid
    public TargetBucket getTargetBucket() {
    return targetBucket;
  }

  public void setTargetBucket(TargetBucket targetBucket) {
    this.targetBucket = targetBucket;
  }

  public TransferBalanceCreateResponse sourceTransferFee(SourceTransferFee sourceTransferFee) {
    this.sourceTransferFee = sourceTransferFee;
    return this;
  }

  /**
   * Get sourceTransferFee
   * @return sourceTransferFee
   **/
  @Schema(description = "")
  
    @Valid
    public SourceTransferFee getSourceTransferFee() {
    return sourceTransferFee;
  }

  public void setSourceTransferFee(SourceTransferFee sourceTransferFee) {
    this.sourceTransferFee = sourceTransferFee;
  }

  public TransferBalanceCreateResponse targetTransferFee(TargetTransferFee targetTransferFee) {
    this.targetTransferFee = targetTransferFee;
    return this;
  }

  /**
   * Get targetTransferFee
   * @return targetTransferFee
   **/
  @Schema(description = "")
  
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
    TransferBalanceCreateResponse transferBalanceCreateResponse = (TransferBalanceCreateResponse) o;
    return Objects.equals(this.extension, transferBalanceCreateResponse.extension) &&
        Objects.equals(this.id, transferBalanceCreateResponse.id) &&
        Objects.equals(this.uri, transferBalanceCreateResponse.uri) &&
        Objects.equals(this.sourceRef, transferBalanceCreateResponse.sourceRef) &&
        Objects.equals(this.targetRef, transferBalanceCreateResponse.targetRef) &&
        Objects.equals(this.transferAmount, transferBalanceCreateResponse.transferAmount) &&
        Objects.equals(this.transferAmountType, transferBalanceCreateResponse.transferAmountType) &&
        Objects.equals(this.sourceBucket, transferBalanceCreateResponse.sourceBucket) &&
        Objects.equals(this.targetBucket, transferBalanceCreateResponse.targetBucket) &&
        Objects.equals(this.sourceTransferFee, transferBalanceCreateResponse.sourceTransferFee) &&
        Objects.equals(this.targetTransferFee, transferBalanceCreateResponse.targetTransferFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, uri, sourceRef, targetRef, transferAmount, transferAmountType, sourceBucket, targetBucket, sourceTransferFee, targetTransferFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferBalanceCreateResponse {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    sourceRef: ").append(toIndentedString(sourceRef)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferAmountType: ").append(toIndentedString(transferAmountType)).append("\n");
    sb.append("    sourceBucket: ").append(toIndentedString(sourceBucket)).append("\n");
    sb.append("    targetBucket: ").append(toIndentedString(targetBucket)).append("\n");
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
