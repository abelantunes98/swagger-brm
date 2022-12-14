package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Details;
import io.swagger.model.Notes;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RefundDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class RefundDetails   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("refundStatus")
  private Long refundStatus = null;

  @JsonProperty("billNo")
  private String billNo = null;

  @JsonProperty("refundAmount")
  private BigDecimal refundAmount = null;

  @JsonProperty("cycleStarts")
  private OffsetDateTime cycleStarts = null;

  @JsonProperty("cycleEnds")
  private OffsetDateTime cycleEnds = null;

  @JsonProperty("refundMethod")
  private String refundMethod = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("notes")
  private Notes notes = null;

  @JsonProperty("refundType")
  private Integer refundType = null;

  @JsonProperty("details")
  @Valid
  private List<Details> details = null;

  public RefundDetails extension(Object extension) {
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

  public RefundDetails effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the refund occurred.
   * @return effectiveDate
   **/
  @Schema(required = true, description = "The date and time the refund occurred.")
      @NotNull

    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public RefundDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the refund.
   * @return id
   **/
  @Schema(description = "The ID of the refund.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RefundDetails refundStatus(Long refundStatus) {
    this.refundStatus = refundStatus;
    return this;
  }

  /**
   * The status of the refund.
   * @return refundStatus
   **/
  @Schema(description = "The status of the refund.")
  
    public Long getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(Long refundStatus) {
    this.refundStatus = refundStatus;
  }

  public RefundDetails billNo(String billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * The bill number associated with the refund.
   * @return billNo
   **/
  @Schema(required = true, description = "The bill number associated with the refund.")
      @NotNull

    public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  public RefundDetails refundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  /**
   * The amount of the refund.
   * @return refundAmount
   **/
  @Schema(required = true, description = "The amount of the refund.")
      @NotNull

    @Valid
    public BigDecimal getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
  }

  public RefundDetails cycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
    return this;
  }

  /**
   * The date and time the billing cycle starts.
   * @return cycleStarts
   **/
  @Schema(description = "The date and time the billing cycle starts.")
  
    @Valid
    public OffsetDateTime getCycleStarts() {
    return cycleStarts;
  }

  public void setCycleStarts(OffsetDateTime cycleStarts) {
    this.cycleStarts = cycleStarts;
  }

  public RefundDetails cycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
    return this;
  }

  /**
   * The date and time the billing cycle ends.
   * @return cycleEnds
   **/
  @Schema(description = "The date and time the billing cycle ends.")
  
    @Valid
    public OffsetDateTime getCycleEnds() {
    return cycleEnds;
  }

  public void setCycleEnds(OffsetDateTime cycleEnds) {
    this.cycleEnds = cycleEnds;
  }

  public RefundDetails refundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
    return this;
  }

  /**
   * The refund method.
   * @return refundMethod
   **/
  @Schema(description = "The refund method.")
  
    public String getRefundMethod() {
    return refundMethod;
  }

  public void setRefundMethod(String refundMethod) {
    this.refundMethod = refundMethod;
  }

  public RefundDetails accountRef(ResourceRef accountRef) {
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

  public RefundDetails notes(Notes notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @Schema(description = "")
  
    @Valid
    public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }

  public RefundDetails refundType(Integer refundType) {
    this.refundType = refundType;
    return this;
  }

  /**
   * The level of the refund. Can be one of the following: <ul><li><b>1</b>: Bill-level</li><li><b>2</b>: Bill unit-level (/billinfo)</li></ul>
   * @return refundType
   **/
  @Schema(description = "The level of the refund. Can be one of the following: <ul><li><b>1</b>: Bill-level</li><li><b>2</b>: Bill unit-level (/billinfo)</li></ul>")
  
    public Integer getRefundType() {
    return refundType;
  }

  public void setRefundType(Integer refundType) {
    this.refundType = refundType;
  }

  public RefundDetails details(List<Details> details) {
    this.details = details;
    return this;
  }

  public RefundDetails addDetailsItem(Details detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<Details>();
    }
    this.details.add(detailsItem);
    return this;
  }

  /**
   * The list of details about the refund.
   * @return details
   **/
  @Schema(description = "The list of details about the refund.")
      @Valid
    public List<Details> getDetails() {
    return details;
  }

  public void setDetails(List<Details> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundDetails refundDetails = (RefundDetails) o;
    return Objects.equals(this.extension, refundDetails.extension) &&
        Objects.equals(this.effectiveDate, refundDetails.effectiveDate) &&
        Objects.equals(this.id, refundDetails.id) &&
        Objects.equals(this.refundStatus, refundDetails.refundStatus) &&
        Objects.equals(this.billNo, refundDetails.billNo) &&
        Objects.equals(this.refundAmount, refundDetails.refundAmount) &&
        Objects.equals(this.cycleStarts, refundDetails.cycleStarts) &&
        Objects.equals(this.cycleEnds, refundDetails.cycleEnds) &&
        Objects.equals(this.refundMethod, refundDetails.refundMethod) &&
        Objects.equals(this.accountRef, refundDetails.accountRef) &&
        Objects.equals(this.notes, refundDetails.notes) &&
        Objects.equals(this.refundType, refundDetails.refundType) &&
        Objects.equals(this.details, refundDetails.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, effectiveDate, id, refundStatus, billNo, refundAmount, cycleStarts, cycleEnds, refundMethod, accountRef, notes, refundType, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundDetails {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    cycleStarts: ").append(toIndentedString(cycleStarts)).append("\n");
    sb.append("    cycleEnds: ").append(toIndentedString(cycleEnds)).append("\n");
    sb.append("    refundMethod: ").append(toIndentedString(refundMethod)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
