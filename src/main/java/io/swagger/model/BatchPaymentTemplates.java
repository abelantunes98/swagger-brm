package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BatchPaymentTemplates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BatchPaymentTemplates   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("payTypeCode")
  private Integer payTypeCode = null;

  @JsonProperty("payTypeName")
  private String payTypeName = null;

  @JsonProperty("templateName")
  private String templateName = null;

  @JsonProperty("locale")
  private String locale = null;

  public BatchPaymentTemplates extension(Object extension) {
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

  public BatchPaymentTemplates payTypeCode(Integer payTypeCode) {
    this.payTypeCode = payTypeCode;
    return this;
  }

  /**
   * The payment type code: cash payment batch (<b>10011</b>), check payment batch (<b>10012</b>), wire-transfer payment batch (<b>10013</b>), interbank payment order payment batch (<b>10014</b>), postal order payment batch (<b>10015</b>), or failed payment batch (<b>10017</b>).
   * @return payTypeCode
   **/
  @Schema(description = "The payment type code: cash payment batch (<b>10011</b>), check payment batch (<b>10012</b>), wire-transfer payment batch (<b>10013</b>), interbank payment order payment batch (<b>10014</b>), postal order payment batch (<b>10015</b>), or failed payment batch (<b>10017</b>).")
  
    public Integer getPayTypeCode() {
    return payTypeCode;
  }

  public void setPayTypeCode(Integer payTypeCode) {
    this.payTypeCode = payTypeCode;
  }

  public BatchPaymentTemplates payTypeName(String payTypeName) {
    this.payTypeName = payTypeName;
    return this;
  }

  /**
   * The payment type name, such as Cash Payment Batch or Failed Payment Batch.
   * @return payTypeName
   **/
  @Schema(required = true, description = "The payment type name, such as Cash Payment Batch or Failed Payment Batch.")
      @NotNull

    public String getPayTypeName() {
    return payTypeName;
  }

  public void setPayTypeName(String payTypeName) {
    this.payTypeName = payTypeName;
  }

  public BatchPaymentTemplates templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * The file name for the batch payment template.
   * @return templateName
   **/
  @Schema(required = true, description = "The file name for the batch payment template.")
      @NotNull

    public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public BatchPaymentTemplates locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The template's locale, such as <b>en_US</b> or <b>fr_FR</b>. For a list of valid values, see 'Locale Names' in <i>BRM Developer's Guide</i>.
   * @return locale
   **/
  @Schema(required = true, description = "The template's locale, such as <b>en_US</b> or <b>fr_FR</b>. For a list of valid values, see 'Locale Names' in <i>BRM Developer's Guide</i>.")
      @NotNull

    public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchPaymentTemplates batchPaymentTemplates = (BatchPaymentTemplates) o;
    return Objects.equals(this.extension, batchPaymentTemplates.extension) &&
        Objects.equals(this.payTypeCode, batchPaymentTemplates.payTypeCode) &&
        Objects.equals(this.payTypeName, batchPaymentTemplates.payTypeName) &&
        Objects.equals(this.templateName, batchPaymentTemplates.templateName) &&
        Objects.equals(this.locale, batchPaymentTemplates.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, payTypeCode, payTypeName, templateName, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchPaymentTemplates {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    payTypeCode: ").append(toIndentedString(payTypeCode)).append("\n");
    sb.append("    payTypeName: ").append(toIndentedString(payTypeName)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
