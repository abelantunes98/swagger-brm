package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.LimitType;
import io.swagger.model.Rules;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Balance groups.
 */
@Schema(description = "Balance groups.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BalanceGroups   {
  @JsonProperty("limits")
  @Valid
  private List<LimitType> limits = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rules")
  @Valid
  private List<Rules> rules = null;

  @JsonProperty("elem")
  private Integer elem = null;

  @JsonProperty("default")
  private Boolean _default = null;

  public BalanceGroups limits(List<LimitType> limits) {
    this.limits = limits;
    return this;
  }

  public BalanceGroups addLimitsItem(LimitType limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<LimitType>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * The list of credit limits and credit thresholds associated with the balance group.
   * @return limits
   **/
  @Schema(description = "The list of credit limits and credit thresholds associated with the balance group.")
      @Valid
    public List<LimitType> getLimits() {
    return limits;
  }

  public void setLimits(List<LimitType> limits) {
    this.limits = limits;
  }

  public BalanceGroups name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the balance group.
   * @return name
   **/
  @Schema(description = "The name of the balance group.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BalanceGroups rules(List<Rules> rules) {
    this.rules = rules;
    return this;
  }

  public BalanceGroups addRulesItem(Rules rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Rules>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * The list of consumption rules that define the order in which to consume balances.
   * @return rules
   **/
  @Schema(description = "The list of consumption rules that define the order in which to consume balances.")
      @Valid
    public List<Rules> getRules() {
    return rules;
  }

  public void setRules(List<Rules> rules) {
    this.rules = rules;
  }

  public BalanceGroups elem(Integer elem) {
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

  public BalanceGroups _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
   **/
  @Schema(description = "")
  
    public Boolean isDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceGroups balanceGroups = (BalanceGroups) o;
    return Objects.equals(this.limits, balanceGroups.limits) &&
        Objects.equals(this.name, balanceGroups.name) &&
        Objects.equals(this.rules, balanceGroups.rules) &&
        Objects.equals(this.elem, balanceGroups.elem) &&
        Objects.equals(this._default, balanceGroups._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, name, rules, elem, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceGroups {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    elem: ").append(toIndentedString(elem)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
