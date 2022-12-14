package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Metafield
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Metafield   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  /**
   * The data type.
   */
  public enum DataTypeEnum {
    INTEGER("INTEGER"),
    
    DECIMAL("DECIMAL"),
    
    STRING("STRING"),
    
    BOOLEAN("BOOLEAN"),
    
    JSON("JSON"),
    
    XML("XML");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataTypeEnum fromValue(String text) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("dataType")
  private DataTypeEnum dataType = null;

  public Metafield name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name.
   * @return name
   **/
  @Schema(description = "The name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Metafield value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value.
   * @return value
   **/
  @Schema(description = "The value.")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Metafield dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The data type.
   * @return dataType
   **/
  @Schema(description = "The data type.")
  
    public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metafield metafield = (Metafield) o;
    return Objects.equals(this.name, metafield.name) &&
        Objects.equals(this.value, metafield.value) &&
        Objects.equals(this.dataType, metafield.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, dataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metafield {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
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
