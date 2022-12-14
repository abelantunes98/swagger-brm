package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about a batch of payments.
 */
@Schema(description = "Details about a batch of payments.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PaymentBatchStatistics   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("batchRef")
  private ResourceRef batchRef = null;

  @JsonProperty("lockBoxName")
  private String lockBoxName = null;

  @JsonProperty("processedBy")
  private String processedBy = null;

  @JsonProperty("lockBoxId")
  private String lockBoxId = null;

  @JsonProperty("institutionName")
  private String institutionName = null;

  @JsonProperty("totalPaymentsProcessed")
  private Integer totalPaymentsProcessed = null;

  @JsonProperty("totalPayments")
  private Integer totalPayments = null;

  @JsonProperty("totalPaymentsSuspended")
  private Integer totalPaymentsSuspended = null;

  @JsonProperty("processStartDate")
  private OffsetDateTime processStartDate = null;

  @JsonProperty("processEndDate")
  private OffsetDateTime processEndDate = null;

  @JsonProperty("processCompletionDate")
  private OffsetDateTime processCompletionDate = null;

  @JsonProperty("durationInQueue")
  private Integer durationInQueue = null;

  @JsonProperty("durationProcessed")
  private Integer durationProcessed = null;

  @JsonProperty("batchCurrency")
  private Integer batchCurrency = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileCreationDate")
  private OffsetDateTime fileCreationDate = null;

  @JsonProperty("fileSize")
  private Double fileSize = null;

  @JsonProperty("totalAmount")
  private BigDecimal totalAmount = null;

  public PaymentBatchStatistics extension(Object extension) {
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

  public PaymentBatchStatistics batchRef(ResourceRef batchRef) {
    this.batchRef = batchRef;
    return this;
  }

  /**
   * Get batchRef
   * @return batchRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBatchRef() {
    return batchRef;
  }

  public void setBatchRef(ResourceRef batchRef) {
    this.batchRef = batchRef;
  }

  public PaymentBatchStatistics lockBoxName(String lockBoxName) {
    this.lockBoxName = lockBoxName;
    return this;
  }

  /**
   * The lockbox's name.
   * @return lockBoxName
   **/
  @Schema(required = true, description = "The lockbox's name.")
      @NotNull

    public String getLockBoxName() {
    return lockBoxName;
  }

  public void setLockBoxName(String lockBoxName) {
    this.lockBoxName = lockBoxName;
  }

  public PaymentBatchStatistics processedBy(String processedBy) {
    this.processedBy = processedBy;
    return this;
  }

  /**
   * The company that processed the lockbox payments.
   * @return processedBy
   **/
  @Schema(required = true, description = "The company that processed the lockbox payments.")
      @NotNull

    public String getProcessedBy() {
    return processedBy;
  }

  public void setProcessedBy(String processedBy) {
    this.processedBy = processedBy;
  }

  public PaymentBatchStatistics lockBoxId(String lockBoxId) {
    this.lockBoxId = lockBoxId;
    return this;
  }

  /**
   * The lockbox's ID.
   * @return lockBoxId
   **/
  @Schema(required = true, description = "The lockbox's ID.")
      @NotNull

    public String getLockBoxId() {
    return lockBoxId;
  }

  public void setLockBoxId(String lockBoxId) {
    this.lockBoxId = lockBoxId;
  }

  public PaymentBatchStatistics institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

  /**
   * The name of the institution, such as a commercial bank, that processed the batch payment.
   * @return institutionName
   **/
  @Schema(required = true, description = "The name of the institution, such as a commercial bank, that processed the batch payment.")
      @NotNull

    public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public PaymentBatchStatistics totalPaymentsProcessed(Integer totalPaymentsProcessed) {
    this.totalPaymentsProcessed = totalPaymentsProcessed;
    return this;
  }

  /**
   * The total number of payments that have been processed.
   * @return totalPaymentsProcessed
   **/
  @Schema(description = "The total number of payments that have been processed.")
  
    public Integer getTotalPaymentsProcessed() {
    return totalPaymentsProcessed;
  }

  public void setTotalPaymentsProcessed(Integer totalPaymentsProcessed) {
    this.totalPaymentsProcessed = totalPaymentsProcessed;
  }

  public PaymentBatchStatistics totalPayments(Integer totalPayments) {
    this.totalPayments = totalPayments;
    return this;
  }

  /**
   * The total number of payments in the batch payment file.
   * @return totalPayments
   **/
  @Schema(description = "The total number of payments in the batch payment file.")
  
    public Integer getTotalPayments() {
    return totalPayments;
  }

  public void setTotalPayments(Integer totalPayments) {
    this.totalPayments = totalPayments;
  }

  public PaymentBatchStatistics totalPaymentsSuspended(Integer totalPaymentsSuspended) {
    this.totalPaymentsSuspended = totalPaymentsSuspended;
    return this;
  }

  /**
   * The total number of payments that were suspended.
   * @return totalPaymentsSuspended
   **/
  @Schema(description = "The total number of payments that were suspended.")
  
    public Integer getTotalPaymentsSuspended() {
    return totalPaymentsSuspended;
  }

  public void setTotalPaymentsSuspended(Integer totalPaymentsSuspended) {
    this.totalPaymentsSuspended = totalPaymentsSuspended;
  }

  public PaymentBatchStatistics processStartDate(OffsetDateTime processStartDate) {
    this.processStartDate = processStartDate;
    return this;
  }

  /**
   * The date BRM started processing the batch payment file.
   * @return processStartDate
   **/
  @Schema(required = true, description = "The date BRM started processing the batch payment file.")
      @NotNull

    @Valid
    public OffsetDateTime getProcessStartDate() {
    return processStartDate;
  }

  public void setProcessStartDate(OffsetDateTime processStartDate) {
    this.processStartDate = processStartDate;
  }

  public PaymentBatchStatistics processEndDate(OffsetDateTime processEndDate) {
    this.processEndDate = processEndDate;
    return this;
  }

  /**
   * The date BRM stopped processing the batch payment file.
   * @return processEndDate
   **/
  @Schema(required = true, description = "The date BRM stopped processing the batch payment file.")
      @NotNull

    @Valid
    public OffsetDateTime getProcessEndDate() {
    return processEndDate;
  }

  public void setProcessEndDate(OffsetDateTime processEndDate) {
    this.processEndDate = processEndDate;
  }

  public PaymentBatchStatistics processCompletionDate(OffsetDateTime processCompletionDate) {
    this.processCompletionDate = processCompletionDate;
    return this;
  }

  /**
   * The date BRM completed processing the batch payment file.
   * @return processCompletionDate
   **/
  @Schema(required = true, description = "The date BRM completed processing the batch payment file.")
      @NotNull

    @Valid
    public OffsetDateTime getProcessCompletionDate() {
    return processCompletionDate;
  }

  public void setProcessCompletionDate(OffsetDateTime processCompletionDate) {
    this.processCompletionDate = processCompletionDate;
  }

  public PaymentBatchStatistics durationInQueue(Integer durationInQueue) {
    this.durationInQueue = durationInQueue;
    return this;
  }

  /**
   * The amount of time that the batch payment file was in the BRM queue.
   * @return durationInQueue
   **/
  @Schema(description = "The amount of time that the batch payment file was in the BRM queue.")
  
    public Integer getDurationInQueue() {
    return durationInQueue;
  }

  public void setDurationInQueue(Integer durationInQueue) {
    this.durationInQueue = durationInQueue;
  }

  public PaymentBatchStatistics durationProcessed(Integer durationProcessed) {
    this.durationProcessed = durationProcessed;
    return this;
  }

  /**
   * The amount of time that the batch payment file was being processed by BRM.
   * @return durationProcessed
   **/
  @Schema(description = "The amount of time that the batch payment file was being processed by BRM.")
  
    public Integer getDurationProcessed() {
    return durationProcessed;
  }

  public void setDurationProcessed(Integer durationProcessed) {
    this.durationProcessed = durationProcessed;
  }

  public PaymentBatchStatistics batchCurrency(Integer batchCurrency) {
    this.batchCurrency = batchCurrency;
    return this;
  }

  /**
   * The currency of all payments in the batch payment file.
   * @return batchCurrency
   **/
  @Schema(description = "The currency of all payments in the batch payment file.")
  
    public Integer getBatchCurrency() {
    return batchCurrency;
  }

  public void setBatchCurrency(Integer batchCurrency) {
    this.batchCurrency = batchCurrency;
  }

  public PaymentBatchStatistics fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The name of the batch payment file.
   * @return fileName
   **/
  @Schema(required = true, description = "The name of the batch payment file.")
      @NotNull

    public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public PaymentBatchStatistics fileCreationDate(OffsetDateTime fileCreationDate) {
    this.fileCreationDate = fileCreationDate;
    return this;
  }

  /**
   * The date and time the batch payment file was created.
   * @return fileCreationDate
   **/
  @Schema(required = true, description = "The date and time the batch payment file was created.")
      @NotNull

    @Valid
    public OffsetDateTime getFileCreationDate() {
    return fileCreationDate;
  }

  public void setFileCreationDate(OffsetDateTime fileCreationDate) {
    this.fileCreationDate = fileCreationDate;
  }

  public PaymentBatchStatistics fileSize(Double fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * The size of the batch payment file.
   * @return fileSize
   **/
  @Schema(description = "The size of the batch payment file.")
  
    public Double getFileSize() {
    return fileSize;
  }

  public void setFileSize(Double fileSize) {
    this.fileSize = fileSize;
  }

  public PaymentBatchStatistics totalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * The total amount of all payments in the batch payment file.
   * @return totalAmount
   **/
  @Schema(required = true, description = "The total amount of all payments in the batch payment file.")
      @NotNull

    @Valid
    public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentBatchStatistics paymentBatchStatistics = (PaymentBatchStatistics) o;
    return Objects.equals(this.extension, paymentBatchStatistics.extension) &&
        Objects.equals(this.batchRef, paymentBatchStatistics.batchRef) &&
        Objects.equals(this.lockBoxName, paymentBatchStatistics.lockBoxName) &&
        Objects.equals(this.processedBy, paymentBatchStatistics.processedBy) &&
        Objects.equals(this.lockBoxId, paymentBatchStatistics.lockBoxId) &&
        Objects.equals(this.institutionName, paymentBatchStatistics.institutionName) &&
        Objects.equals(this.totalPaymentsProcessed, paymentBatchStatistics.totalPaymentsProcessed) &&
        Objects.equals(this.totalPayments, paymentBatchStatistics.totalPayments) &&
        Objects.equals(this.totalPaymentsSuspended, paymentBatchStatistics.totalPaymentsSuspended) &&
        Objects.equals(this.processStartDate, paymentBatchStatistics.processStartDate) &&
        Objects.equals(this.processEndDate, paymentBatchStatistics.processEndDate) &&
        Objects.equals(this.processCompletionDate, paymentBatchStatistics.processCompletionDate) &&
        Objects.equals(this.durationInQueue, paymentBatchStatistics.durationInQueue) &&
        Objects.equals(this.durationProcessed, paymentBatchStatistics.durationProcessed) &&
        Objects.equals(this.batchCurrency, paymentBatchStatistics.batchCurrency) &&
        Objects.equals(this.fileName, paymentBatchStatistics.fileName) &&
        Objects.equals(this.fileCreationDate, paymentBatchStatistics.fileCreationDate) &&
        Objects.equals(this.fileSize, paymentBatchStatistics.fileSize) &&
        Objects.equals(this.totalAmount, paymentBatchStatistics.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, batchRef, lockBoxName, processedBy, lockBoxId, institutionName, totalPaymentsProcessed, totalPayments, totalPaymentsSuspended, processStartDate, processEndDate, processCompletionDate, durationInQueue, durationProcessed, batchCurrency, fileName, fileCreationDate, fileSize, totalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBatchStatistics {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    batchRef: ").append(toIndentedString(batchRef)).append("\n");
    sb.append("    lockBoxName: ").append(toIndentedString(lockBoxName)).append("\n");
    sb.append("    processedBy: ").append(toIndentedString(processedBy)).append("\n");
    sb.append("    lockBoxId: ").append(toIndentedString(lockBoxId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    totalPaymentsProcessed: ").append(toIndentedString(totalPaymentsProcessed)).append("\n");
    sb.append("    totalPayments: ").append(toIndentedString(totalPayments)).append("\n");
    sb.append("    totalPaymentsSuspended: ").append(toIndentedString(totalPaymentsSuspended)).append("\n");
    sb.append("    processStartDate: ").append(toIndentedString(processStartDate)).append("\n");
    sb.append("    processEndDate: ").append(toIndentedString(processEndDate)).append("\n");
    sb.append("    processCompletionDate: ").append(toIndentedString(processCompletionDate)).append("\n");
    sb.append("    durationInQueue: ").append(toIndentedString(durationInQueue)).append("\n");
    sb.append("    durationProcessed: ").append(toIndentedString(durationProcessed)).append("\n");
    sb.append("    batchCurrency: ").append(toIndentedString(batchCurrency)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileCreationDate: ").append(toIndentedString(fileCreationDate)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
