package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A consumption rule that defines the order in which to consume balances.
 */
@Schema(description = "A consumption rule that defines the order in which to consume balances.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Rules   {
  @JsonProperty("consumptionRule")
  private String consumptionRule = null;

  @JsonProperty("elem")
  private Integer elem = null;

  public Rules consumptionRule(String consumptionRule) {
    this.consumptionRule = consumptionRule;
    return this;
  }

  /**
   * The consumption rule. Can be one of the following&colon; <ul><li><b>0</b>: Not defined</li><li><b>1</b>: Earliest start time</li><li><b>2</b>: Latest start time</li><li><b>3</b>: Earliest expiration time</li><li><b>4</b>: Latest expiration time</li><li><b>5</b>: Earliest start time and latest expiration time</li><li><b>6</b>: Earliest start time and earliest expiration time</li><li><b>7</b>: Latest start time and earliest expiration time</li><li><b>8</b>: Latest start time and latest expiration time</li><li><b>9</b>: Earliest expiration time and earliest start time</li><li><b>10</b>: Earliest expiration time and latest start time</li><li><b>10</b>: Latest expiration time and earliest start time</li><li><b>10</b>: Latest expiration time and latest start time</li></ul>
   * @return consumptionRule
   **/
  @Schema(description = "The consumption rule. Can be one of the following&colon; <ul><li><b>0</b>: Not defined</li><li><b>1</b>: Earliest start time</li><li><b>2</b>: Latest start time</li><li><b>3</b>: Earliest expiration time</li><li><b>4</b>: Latest expiration time</li><li><b>5</b>: Earliest start time and latest expiration time</li><li><b>6</b>: Earliest start time and earliest expiration time</li><li><b>7</b>: Latest start time and earliest expiration time</li><li><b>8</b>: Latest start time and latest expiration time</li><li><b>9</b>: Earliest expiration time and earliest start time</li><li><b>10</b>: Earliest expiration time and latest start time</li><li><b>10</b>: Latest expiration time and earliest start time</li><li><b>10</b>: Latest expiration time and latest start time</li></ul>")
  
    public String getConsumptionRule() {
    return consumptionRule;
  }

  public void setConsumptionRule(String consumptionRule) {
    this.consumptionRule = consumptionRule;
  }

  public Rules elem(Integer elem) {
    this.elem = elem;
    return this;
  }

  /**
   * The position of the entry in the array. For example, the first item in a list would have an <b>elem</b> value of <b>1</b>.
   * @return elem
   **/
  @Schema(description = "The position of the entry in the array. For example, the first item in a list would have an <b>elem</b> value of <b>1</b>.")
  
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
    Rules rules = (Rules) o;
    return Objects.equals(this.consumptionRule, rules.consumptionRule) &&
        Objects.equals(this.elem, rules.elem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumptionRule, elem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rules {\n");
    
    sb.append("    consumptionRule: ").append(toIndentedString(consumptionRule)).append("\n");
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
