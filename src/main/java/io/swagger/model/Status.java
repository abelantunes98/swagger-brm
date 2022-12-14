package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Notes;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Status
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Status   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("effective")
  private OffsetDateTime effective = null;

  @JsonProperty("effectiveWhen")
  private String effectiveWhen = null;

  @JsonProperty("lifeCycleStateEnabled")
  private Boolean lifeCycleStateEnabled = null;

  @JsonProperty("notes")
  private Notes notes = null;

  public Status extension(Object extension) {
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

  public Status statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status code. Can be one of the following: <ul><li><b>10100</b>: Active</li><li><b>10102</b>: Inactive</li><li><b>10103</b>: Closed</li></ul>
   * @return statusCode
   **/
  @Schema(description = "The status code. Can be one of the following: <ul><li><b>10100</b>: Active</li><li><b>10102</b>: Inactive</li><li><b>10103</b>: Closed</li></ul>")
  
    public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public Status effective(OffsetDateTime effective) {
    this.effective = effective;
    return this;
  }

  /**
   * The date and time the status takes effect.
   * @return effective
   **/
  @Schema(description = "The date and time the status takes effect.")
  
    @Valid
    public OffsetDateTime getEffective() {
    return effective;
  }

  public void setEffective(OffsetDateTime effective) {
    this.effective = effective;
  }

  public Status effectiveWhen(String effectiveWhen) {
    this.effectiveWhen = effectiveWhen;
    return this;
  }

  /**
   * When the status takes effect. Can be one of the following: <ul><li><b>1</b>: Immediately</li><li><b>2</b>: Backdated</li><li><b>3</b>: Future-dated</li></ul>
   * @return effectiveWhen
   **/
  @Schema(required = true, description = "When the status takes effect. Can be one of the following: <ul><li><b>1</b>: Immediately</li><li><b>2</b>: Backdated</li><li><b>3</b>: Future-dated</li></ul>")
      @NotNull

    public String getEffectiveWhen() {
    return effectiveWhen;
  }

  public void setEffectiveWhen(String effectiveWhen) {
    this.effectiveWhen = effectiveWhen;
  }

  public Status lifeCycleStateEnabled(Boolean lifeCycleStateEnabled) {
    this.lifeCycleStateEnabled = lifeCycleStateEnabled;
    return this;
  }

  /**
   * Whether the life cycle state is enabled (<b>true</b>) or not (<b>false</b>).
   * @return lifeCycleStateEnabled
   **/
  @Schema(description = "Whether the life cycle state is enabled (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isLifeCycleStateEnabled() {
    return lifeCycleStateEnabled;
  }

  public void setLifeCycleStateEnabled(Boolean lifeCycleStateEnabled) {
    this.lifeCycleStateEnabled = lifeCycleStateEnabled;
  }

  public Status notes(Notes notes) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Status status = (Status) o;
    return Objects.equals(this.extension, status.extension) &&
        Objects.equals(this.statusCode, status.statusCode) &&
        Objects.equals(this.effective, status.effective) &&
        Objects.equals(this.effectiveWhen, status.effectiveWhen) &&
        Objects.equals(this.lifeCycleStateEnabled, status.lifeCycleStateEnabled) &&
        Objects.equals(this.notes, status.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, statusCode, effective, effectiveWhen, lifeCycleStateEnabled, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Status {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    effectiveWhen: ").append(toIndentedString(effectiveWhen)).append("\n");
    sb.append("    lifeCycleStateEnabled: ").append(toIndentedString(lifeCycleStateEnabled)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
