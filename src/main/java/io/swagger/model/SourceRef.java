package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The balance transfer&#x27;s source.
 */
@Schema(description = "The balance transfer's source.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SourceRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  public SourceRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The source's ID. Can be a balance group ID, account ID, account number, service ID, or service number/MSISDN number
   * @return id
   **/
  @Schema(required = true, description = "The source's ID. Can be a balance group ID, account ID, account number, service ID, or service number/MSISDN number")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SourceRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The source's type. Can be one of the following: <ul><li>balanceGroup</li><li>account</li><li>service</li></ul>The source and target type must be the same.
   * @return type
   **/
  @Schema(required = true, description = "The source's type. Can be one of the following: <ul><li>balanceGroup</li><li>account</li><li>service</li></ul>The source and target type must be the same.")
      @NotNull

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
    SourceRef sourceRef = (SourceRef) o;
    return Objects.equals(this.id, sourceRef.id) &&
        Objects.equals(this.type, sourceRef.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
