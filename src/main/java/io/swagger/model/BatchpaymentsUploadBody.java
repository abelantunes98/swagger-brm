package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.FormDataContentDisposition;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BatchpaymentsUploadBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BatchpaymentsUploadBody   {
  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("file")
  private FormDataContentDisposition file = null;

  public BatchpaymentsUploadBody filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
   **/
  @Schema(description = "")
  
    public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public BatchpaymentsUploadBody file(FormDataContentDisposition file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
   **/
  @Schema(description = "")
  
    @Valid
    public FormDataContentDisposition getFile() {
    return file;
  }

  public void setFile(FormDataContentDisposition file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchpaymentsUploadBody batchpaymentsUploadBody = (BatchpaymentsUploadBody) o;
    return Objects.equals(this.filename, batchpaymentsUploadBody.filename) &&
        Objects.equals(this.file, batchpaymentsUploadBody.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchpaymentsUploadBody {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
