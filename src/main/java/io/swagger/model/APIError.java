package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The API error type.
 */
@Schema(description = "The API error type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class APIError   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("referenceError")
  private String referenceError = null;

  @JsonProperty("baseType")
  private String baseType = null;

  @JsonProperty("schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("type")
  private String type = null;

  public APIError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * An application error code defined in the API or a common list.
   * @return code
   **/
  @Schema(required = true, description = "An application error code defined in the API or a common list.")
      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public APIError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for the error.
   * @return reason
   **/
  @Schema(required = true, description = "The reason for the error.")
      @NotNull

    public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public APIError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Any details or corrective actions related to the error.
   * @return message
   **/
  @Schema(required = true, description = "Any details or corrective actions related to the error.")
      @NotNull

    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public APIError status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The HTTP error code extension.
   * @return status
   **/
  @Schema(description = "The HTTP error code extension.")
  
    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public APIError referenceError(String referenceError) {
    this.referenceError = referenceError;
    return this;
  }

  /**
   * The reference link error.
   * @return referenceError
   **/
  @Schema(description = "The reference link error.")
  
    public String getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }

  public APIError baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * The object's superclass.
   * @return baseType
   **/
  @Schema(description = "The object's superclass.")
  
    public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public APIError schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI of the JSON schema file that defines the additional attributes and relationships.
   * @return schemaLocation
   **/
  @Schema(description = "A URI of the JSON schema file that defines the additional attributes and relationships.")
  
    public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public APIError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The object's subclass.
   * @return type
   **/
  @Schema(description = "The object's subclass.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIError apIError = (APIError) o;
    return Objects.equals(this.code, apIError.code) &&
        Objects.equals(this.reason, apIError.reason) &&
        Objects.equals(this.message, apIError.message) &&
        Objects.equals(this.status, apIError.status) &&
        Objects.equals(this.referenceError, apIError.referenceError) &&
        Objects.equals(this.baseType, apIError.baseType) &&
        Objects.equals(this.schemaLocation, apIError.schemaLocation) &&
        Objects.equals(this.type, apIError.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, message, status, referenceError, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
