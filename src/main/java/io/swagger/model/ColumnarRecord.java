package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ColumnDefinitions;
import io.swagger.model.Entries;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ColumnarRecord
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ColumnarRecord   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("templateName")
  private String templateName = null;

  @JsonProperty("xmlTemplateName")
  private String xmlTemplateName = null;

  @JsonProperty("saveResults")
  private Boolean saveResults = null;

  @JsonProperty("columnDefinitions")
  @Valid
  private List<ColumnDefinitions> columnDefinitions = null;

  @JsonProperty("entries")
  @Valid
  private List<Entries> entries = null;

  public ColumnarRecord extension(Object extension) {
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

  public ColumnarRecord templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

  /**
   * Get templateName
   * @return templateName
   **/
  @Schema(description = "")
  
    public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }

  public ColumnarRecord xmlTemplateName(String xmlTemplateName) {
    this.xmlTemplateName = xmlTemplateName;
    return this;
  }

  /**
   * Get xmlTemplateName
   * @return xmlTemplateName
   **/
  @Schema(description = "")
  
    public String getXmlTemplateName() {
    return xmlTemplateName;
  }

  public void setXmlTemplateName(String xmlTemplateName) {
    this.xmlTemplateName = xmlTemplateName;
  }

  public ColumnarRecord saveResults(Boolean saveResults) {
    this.saveResults = saveResults;
    return this;
  }

  /**
   * Get saveResults
   * @return saveResults
   **/
  @Schema(description = "")
  
    public Boolean isSaveResults() {
    return saveResults;
  }

  public void setSaveResults(Boolean saveResults) {
    this.saveResults = saveResults;
  }

  public ColumnarRecord columnDefinitions(List<ColumnDefinitions> columnDefinitions) {
    this.columnDefinitions = columnDefinitions;
    return this;
  }

  public ColumnarRecord addColumnDefinitionsItem(ColumnDefinitions columnDefinitionsItem) {
    if (this.columnDefinitions == null) {
      this.columnDefinitions = new ArrayList<ColumnDefinitions>();
    }
    this.columnDefinitions.add(columnDefinitionsItem);
    return this;
  }

  /**
   * Get columnDefinitions
   * @return columnDefinitions
   **/
  @Schema(description = "")
      @Valid
    public List<ColumnDefinitions> getColumnDefinitions() {
    return columnDefinitions;
  }

  public void setColumnDefinitions(List<ColumnDefinitions> columnDefinitions) {
    this.columnDefinitions = columnDefinitions;
  }

  public ColumnarRecord entries(List<Entries> entries) {
    this.entries = entries;
    return this;
  }

  public ColumnarRecord addEntriesItem(Entries entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<Entries>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
   **/
  @Schema(description = "")
      @Valid
    public List<Entries> getEntries() {
    return entries;
  }

  public void setEntries(List<Entries> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColumnarRecord columnarRecord = (ColumnarRecord) o;
    return Objects.equals(this.extension, columnarRecord.extension) &&
        Objects.equals(this.templateName, columnarRecord.templateName) &&
        Objects.equals(this.xmlTemplateName, columnarRecord.xmlTemplateName) &&
        Objects.equals(this.saveResults, columnarRecord.saveResults) &&
        Objects.equals(this.columnDefinitions, columnarRecord.columnDefinitions) &&
        Objects.equals(this.entries, columnarRecord.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, templateName, xmlTemplateName, saveResults, columnDefinitions, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnarRecord {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    xmlTemplateName: ").append(toIndentedString(xmlTemplateName)).append("\n");
    sb.append("    saveResults: ").append(toIndentedString(saveResults)).append("\n");
    sb.append("    columnDefinitions: ").append(toIndentedString(columnDefinitions)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
