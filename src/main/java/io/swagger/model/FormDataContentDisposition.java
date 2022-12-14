package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FormDataContentDisposition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class FormDataContentDisposition   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("parameters")
  @Valid
  private Map<String, String> parameters = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("modificationDate")
  private OffsetDateTime modificationDate = null;

  @JsonProperty("readDate")
  private OffsetDateTime readDate = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("name")
  private String name = null;

  public FormDataContentDisposition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FormDataContentDisposition parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public FormDataContentDisposition putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(description = "")
  
    public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public FormDataContentDisposition fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   **/
  @Schema(description = "")
  
    public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FormDataContentDisposition creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public FormDataContentDisposition modificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Get modificationDate
   * @return modificationDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public FormDataContentDisposition readDate(OffsetDateTime readDate) {
    this.readDate = readDate;
    return this;
  }

  /**
   * Get readDate
   * @return readDate
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getReadDate() {
    return readDate;
  }

  public void setReadDate(OffsetDateTime readDate) {
    this.readDate = readDate;
  }

  public FormDataContentDisposition size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   **/
  @Schema(description = "")
  
    public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public FormDataContentDisposition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDataContentDisposition formDataContentDisposition = (FormDataContentDisposition) o;
    return Objects.equals(this.type, formDataContentDisposition.type) &&
        Objects.equals(this.parameters, formDataContentDisposition.parameters) &&
        Objects.equals(this.fileName, formDataContentDisposition.fileName) &&
        Objects.equals(this.creationDate, formDataContentDisposition.creationDate) &&
        Objects.equals(this.modificationDate, formDataContentDisposition.modificationDate) &&
        Objects.equals(this.readDate, formDataContentDisposition.readDate) &&
        Objects.equals(this.size, formDataContentDisposition.size) &&
        Objects.equals(this.name, formDataContentDisposition.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parameters, fileName, creationDate, modificationDate, readDate, size, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDataContentDisposition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    readDate: ").append(toIndentedString(readDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
