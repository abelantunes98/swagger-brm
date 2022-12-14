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
 * The qualifier type.
 */
@Schema(description = "The qualifier type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Qualifier   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  /**
   * Gets or Sets dataType
   */
  public enum DataTypeEnum {
    INTEGER("INTEGER"),
    
    DECIMAL("DECIMAL"),
    
    STRING("STRING"),
    
    BOOLEAN("BOOLEAN"),
    
    TSTAMP("TSTAMP"),
    
    POID("POID");

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
  private DataTypeEnum dataType = DataTypeEnum.STRING;

  /**
   * The string operator. For example, CONTAINS-String match, EQ-Equal, LT-Lesser than, GT-Greater than, and NEQ- Not Equal.
   */
  public enum OperatorEnum {
    EQ("EQ"),
    
    NE("NE"),
    
    LIKE("LIKE"),
    
    LT("LT"),
    
    GT("GT"),
    
    GE("GE"),
    
    LE("LE"),
    
    NE_7("NE"),
    
    IN("IN");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("operator")
  private OperatorEnum operator = OperatorEnum.EQ;

  public Qualifier key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The name or the identifier from a storable class.
   * @return key
   **/
  @Schema(required = true, description = "The name or the identifier from a storable class.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Qualifier value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The reference value to be evaluated.
   * @return value
   **/
  @Schema(required = true, description = "The reference value to be evaluated.")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Qualifier dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
   **/
  @Schema(description = "")
  
    public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public Qualifier operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The string operator. For example, CONTAINS-String match, EQ-Equal, LT-Lesser than, GT-Greater than, and NEQ- Not Equal.
   * @return operator
   **/
  @Schema(description = "The string operator. For example, CONTAINS-String match, EQ-Equal, LT-Lesser than, GT-Greater than, and NEQ- Not Equal.")
  
    public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Qualifier qualifier = (Qualifier) o;
    return Objects.equals(this.key, qualifier.key) &&
        Objects.equals(this.value, qualifier.value) &&
        Objects.equals(this.dataType, qualifier.dataType) &&
        Objects.equals(this.operator, qualifier.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, dataType, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Qualifier {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
