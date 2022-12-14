package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PaymentBatchFileHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class PaymentBatchFileHeader   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("lockBoxName")
  private String lockBoxName = null;

  @JsonProperty("lockBoxId")
  private String lockBoxId = null;

  @JsonProperty("institutionName")
  private String institutionName = null;

  @JsonProperty("templateName")
  private String templateName = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("fileCreationDate")
  private OffsetDateTime fileCreationDate = null;

  @JsonProperty("fileSize")
  private Double fileSize = null;

  @JsonProperty("noOfPayments")
  private Long noOfPayments = null;

  @JsonProperty("status")
  private Integer status = null;

  public PaymentBatchFileHeader extension(Object extension) {
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

  public PaymentBatchFileHeader lockBoxName(String lockBoxName) {
    this.lockBoxName = lockBoxName;
    return this;
  }

  /**
   * The lockbox's name.
   * @return lockBoxName
   **/
  @Schema(description = "The lockbox's name.")
  
    public String getLockBoxName() {
    return lockBoxName;
  }

  public void setLockBoxName(String lockBoxName) {
    this.lockBoxName = lockBoxName;
  }

  public PaymentBatchFileHeader lockBoxId(String lockBoxId) {
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

  public PaymentBatchFileHeader institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

  /**
   * The name of the institution that created the batch payment file.
   * @return institutionName
   **/
  @Schema(required = true, description = "The name of the institution that created the batch payment file.")
      @NotNull

    public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public PaymentBatchFileHeader templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * The template name.
   * @return templateName
   **/
  @Schema(required = true, description = "The template name.")
      @NotNull

    public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public PaymentBatchFileHeader currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of all payments in the batch payment file.
   * @return currency
   **/
  @Schema(required = true, description = "The currency of all payments in the batch payment file.")
      @NotNull

    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentBatchFileHeader fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The file name for the batch payment file.
   * @return fileName
   **/
  @Schema(required = true, description = "The file name for the batch payment file.")
      @NotNull

    public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public PaymentBatchFileHeader fileCreationDate(OffsetDateTime fileCreationDate) {
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

  public PaymentBatchFileHeader fileSize(Double fileSize) {
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

  public PaymentBatchFileHeader noOfPayments(Long noOfPayments) {
    this.noOfPayments = noOfPayments;
    return this;
  }

  /**
   * The number of payments in the batch payment file.
   * @return noOfPayments
   **/
  @Schema(description = "The number of payments in the batch payment file.")
  
    public Long getNoOfPayments() {
    return noOfPayments;
  }

  public void setNoOfPayments(Long noOfPayments) {
    this.noOfPayments = noOfPayments;
  }

  public PaymentBatchFileHeader status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the batch payment file. Can be one of the following: <ul><li><b>1</b>: New</li><li><b>2</b>: Format error</li><li><b>3</b>: Unknown template</li><li><b>4</b>: Processing error</li><li><b>5</b>: Threshold exceeded</li><li><b>6</b>: Processing</li></ul>
   * @return status
   **/
  @Schema(description = "The status of the batch payment file. Can be one of the following: <ul><li><b>1</b>: New</li><li><b>2</b>: Format error</li><li><b>3</b>: Unknown template</li><li><b>4</b>: Processing error</li><li><b>5</b>: Threshold exceeded</li><li><b>6</b>: Processing</li></ul>")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentBatchFileHeader paymentBatchFileHeader = (PaymentBatchFileHeader) o;
    return Objects.equals(this.extension, paymentBatchFileHeader.extension) &&
        Objects.equals(this.lockBoxName, paymentBatchFileHeader.lockBoxName) &&
        Objects.equals(this.lockBoxId, paymentBatchFileHeader.lockBoxId) &&
        Objects.equals(this.institutionName, paymentBatchFileHeader.institutionName) &&
        Objects.equals(this.templateName, paymentBatchFileHeader.templateName) &&
        Objects.equals(this.currency, paymentBatchFileHeader.currency) &&
        Objects.equals(this.fileName, paymentBatchFileHeader.fileName) &&
        Objects.equals(this.fileCreationDate, paymentBatchFileHeader.fileCreationDate) &&
        Objects.equals(this.fileSize, paymentBatchFileHeader.fileSize) &&
        Objects.equals(this.noOfPayments, paymentBatchFileHeader.noOfPayments) &&
        Objects.equals(this.status, paymentBatchFileHeader.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, lockBoxName, lockBoxId, institutionName, templateName, currency, fileName, fileCreationDate, fileSize, noOfPayments, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentBatchFileHeader {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    lockBoxName: ").append(toIndentedString(lockBoxName)).append("\n");
    sb.append("    lockBoxId: ").append(toIndentedString(lockBoxId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileCreationDate: ").append(toIndentedString(fileCreationDate)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    noOfPayments: ").append(toIndentedString(noOfPayments)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
