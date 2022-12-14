package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of extended rating attributes (ERAs).
 */
@Schema(description = "A list of extended rating attributes (ERAs).")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DataArray   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("elem")
  private Integer elem = null;

  public DataArray name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The ERA's name.
   * @return name
   **/
  @Schema(description = "The ERA's name.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataArray validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time the ERA's validity period starts.
   * @return validFrom
   **/
  @Schema(description = "The date and time the ERA's validity period starts.")
  
    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public DataArray validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the ERA's validity period ends.
   * @return validTo
   **/
  @Schema(description = "The date and time the ERA's validity period ends.")
  
    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public DataArray value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The ERA's value.
   * @return value
   **/
  @Schema(description = "The ERA's value.")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DataArray elem(Integer elem) {
    this.elem = elem;
    return this;
  }

  /**
   * The position of the entry in the array. For example, the first item in the array would have an <b>elem</b> value of <b>1</b>.
   * @return elem
   **/
  @Schema(description = "The position of the entry in the array. For example, the first item in the array would have an <b>elem</b> value of <b>1</b>.")
  
    public Integer getElem() {
    return elem;
  }

  public void setElem(Integer elem) {
    this.elem = elem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataArray dataArray = (DataArray) o;
    return Objects.equals(this.name, dataArray.name) &&
        Objects.equals(this.validFrom, dataArray.validFrom) &&
        Objects.equals(this.validTo, dataArray.validTo) &&
        Objects.equals(this.value, dataArray.value) &&
        Objects.equals(this.elem, dataArray.elem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, validFrom, validTo, value, elem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataArray {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    elem: ").append(toIndentedString(elem)).append("\n");
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
