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
 * The notification criteria.
 */
@Schema(description = "The notification criteria.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class NotificationCriteria   {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("value")
  private String value = null;

  /**
   * The notification criteria operator.
   */
  public enum OperatorEnum {
    EQ("EQ"),
    
    NE("NE"),
    
    LT("LT"),
    
    GT("GT"),
    
    LE("LE"),
    
    GE("GE"),
    
    LIKE("LIKE"),
    
    CONTAINS("CONTAINS"),
    
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
  private OperatorEnum operator = null;

  /**
   * The notification data type.
   */
  public enum DataTypeEnum {
    STRING("STRING"),
    
    INTEGER("INTEGER"),
    
    DECIMAL("DECIMAL"),
    
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
  private DataTypeEnum dataType = DataTypeEnum.STRING;

  public NotificationCriteria key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The notification criteria key.
   * @return key
   **/
  @Schema(required = true, description = "The notification criteria key.")
      @NotNull

    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public NotificationCriteria value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The notification criteria value.
   * @return value
   **/
  @Schema(required = true, description = "The notification criteria value.")
      @NotNull

    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public NotificationCriteria operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * The notification criteria operator.
   * @return operator
   **/
  @Schema(required = true, description = "The notification criteria operator.")
      @NotNull

    public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public NotificationCriteria dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * The notification data type.
   * @return dataType
   **/
  @Schema(description = "The notification data type.")
  
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
    NotificationCriteria notificationCriteria = (NotificationCriteria) o;
    return Objects.equals(this.key, notificationCriteria.key) &&
        Objects.equals(this.value, notificationCriteria.value) &&
        Objects.equals(this.operator, notificationCriteria.operator) &&
        Objects.equals(this.dataType, notificationCriteria.dataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, operator, dataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationCriteria {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
