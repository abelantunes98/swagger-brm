package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NonCurrencyCells
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class NonCurrencyCells   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recordId")
  @Valid
  private List<String> recordId = null;

  public NonCurrencyCells name(String name) {
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

  public NonCurrencyCells recordId(List<String> recordId) {
    this.recordId = recordId;
    return this;
  }

  public NonCurrencyCells addRecordIdItem(String recordIdItem) {
    if (this.recordId == null) {
      this.recordId = new ArrayList<String>();
    }
    this.recordId.add(recordIdItem);
    return this;
  }

  /**
   * Get recordId
   * @return recordId
   **/
  @Schema(description = "")
  
    public List<String> getRecordId() {
    return recordId;
  }

  public void setRecordId(List<String> recordId) {
    this.recordId = recordId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NonCurrencyCells nonCurrencyCells = (NonCurrencyCells) o;
    return Objects.equals(this.name, nonCurrencyCells.name) &&
        Objects.equals(this.recordId, nonCurrencyCells.recordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, recordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NonCurrencyCells {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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
