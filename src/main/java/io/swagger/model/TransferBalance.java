package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LocationDetails;
import io.swagger.model.SourceRef;
import io.swagger.model.TargetRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The details of a balance transfer request.
 */
@Schema(description = "The details of a balance transfer request.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class TransferBalance   {
  @JsonProperty("extension")
  private Object extension = null;

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

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("sourceLocation")
  private LocationDetails sourceLocation = null;

  @JsonProperty("targetLocation")
  private LocationDetails targetLocation = null;

  public TransferBalance extension(Object extension) {
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

  public TransferBalance sourceRef(SourceRef sourceRef) {
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

  public TransferBalance targetRef(TargetRef targetRef) {
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

  public TransferBalance transferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

  /**
   * The amount to transfer.
   * @return transferAmount
   **/
  @Schema(required = true, description = "The amount to transfer.")
      @NotNull

    @Valid
    public BigDecimal getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(BigDecimal transferAmount) {
    this.transferAmount = transferAmount;
  }

  public TransferBalance transferAmountType(Integer transferAmountType) {
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

  public TransferBalance chargeSource(Boolean chargeSource) {
    this.chargeSource = chargeSource;
    return this;
  }

  /**
   * Whether to charge a fee to the transfer's source (<b>true</b>) or not (<b>false</b>). You can charge a fee to both the source and target.
   * @return chargeSource
   **/
  @Schema(description = "Whether to charge a fee to the transfer's source (<b>true</b>) or not (<b>false</b>). You can charge a fee to both the source and target.")
  
    public Boolean isChargeSource() {
    return chargeSource;
  }

  public void setChargeSource(Boolean chargeSource) {
    this.chargeSource = chargeSource;
  }

  public TransferBalance chargeDestination(Boolean chargeDestination) {
    this.chargeDestination = chargeDestination;
    return this;
  }

  /**
   * Whether to charge a fee to the transfer's target (<b>true</b>) or not (<b>false</b>). You can charge a fee to both the source and target.
   * @return chargeDestination
   **/
  @Schema(description = "Whether to charge a fee to the transfer's target (<b>true</b>) or not (<b>false</b>). You can charge a fee to both the source and target.")
  
    public Boolean isChargeDestination() {
    return chargeDestination;
  }

  public void setChargeDestination(Boolean chargeDestination) {
    this.chargeDestination = chargeDestination;
  }

  public TransferBalance validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time the transferred resource's validity starts.
   * @return validFrom
   **/
  @Schema(description = "The date and time the transferred resource's validity starts.")
  
    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public TransferBalance validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the transferred resource's validity ends.
   * @return validTo
   **/
  @Schema(description = "The date and time the transferred resource's validity ends.")
  
    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public TransferBalance description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The transfer's description.
   * @return description
   **/
  @Schema(description = "The transfer's description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransferBalance sourceLocation(LocationDetails sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

  /**
   * Get sourceLocation
   * @return sourceLocation
   **/
  @Schema(description = "")
  
    @Valid
    public LocationDetails getSourceLocation() {
    return sourceLocation;
  }

  public void setSourceLocation(LocationDetails sourceLocation) {
    this.sourceLocation = sourceLocation;
  }

  public TransferBalance targetLocation(LocationDetails targetLocation) {
    this.targetLocation = targetLocation;
    return this;
  }

  /**
   * Get targetLocation
   * @return targetLocation
   **/
  @Schema(description = "")
  
    @Valid
    public LocationDetails getTargetLocation() {
    return targetLocation;
  }

  public void setTargetLocation(LocationDetails targetLocation) {
    this.targetLocation = targetLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferBalance transferBalance = (TransferBalance) o;
    return Objects.equals(this.extension, transferBalance.extension) &&
        Objects.equals(this.sourceRef, transferBalance.sourceRef) &&
        Objects.equals(this.targetRef, transferBalance.targetRef) &&
        Objects.equals(this.transferAmount, transferBalance.transferAmount) &&
        Objects.equals(this.transferAmountType, transferBalance.transferAmountType) &&
        Objects.equals(this.chargeSource, transferBalance.chargeSource) &&
        Objects.equals(this.chargeDestination, transferBalance.chargeDestination) &&
        Objects.equals(this.validFrom, transferBalance.validFrom) &&
        Objects.equals(this.validTo, transferBalance.validTo) &&
        Objects.equals(this.description, transferBalance.description) &&
        Objects.equals(this.sourceLocation, transferBalance.sourceLocation) &&
        Objects.equals(this.targetLocation, transferBalance.targetLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, sourceRef, targetRef, transferAmount, transferAmountType, chargeSource, chargeDestination, validFrom, validTo, description, sourceLocation, targetLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferBalance {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    sourceRef: ").append(toIndentedString(sourceRef)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferAmountType: ").append(toIndentedString(transferAmountType)).append("\n");
    sb.append("    chargeSource: ").append(toIndentedString(chargeSource)).append("\n");
    sb.append("    chargeDestination: ").append(toIndentedString(chargeDestination)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    targetLocation: ").append(toIndentedString(targetLocation)).append("\n");
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
