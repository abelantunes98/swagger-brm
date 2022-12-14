package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BalanceGroup;
import io.swagger.model.ServiceGroupIndex;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of existing bill units.
 */
@Schema(description = "The list of existing bill units.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ExistingBillUnits   {
  @JsonProperty("billUnitId")
  private String billUnitId = null;

  @JsonProperty("forServiceGroup")
  @Valid
  private List<ServiceGroupIndex> forServiceGroup = new ArrayList<ServiceGroupIndex>();

  @JsonProperty("balanceGroups")
  @Valid
  private List<BalanceGroup> balanceGroups = null;

  public ExistingBillUnits billUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
    return this;
  }

  /**
   * The ID of the bill unit.
   * @return billUnitId
   **/
  @Schema(required = true, description = "The ID of the bill unit.")
      @NotNull

    public String getBillUnitId() {
    return billUnitId;
  }

  public void setBillUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
  }

  public ExistingBillUnits forServiceGroup(List<ServiceGroupIndex> forServiceGroup) {
    this.forServiceGroup = forServiceGroup;
    return this;
  }

  public ExistingBillUnits addForServiceGroupItem(ServiceGroupIndex forServiceGroupItem) {
    this.forServiceGroup.add(forServiceGroupItem);
    return this;
  }

  /**
   * The list of service groups associated with the bill unit.
   * @return forServiceGroup
   **/
  @Schema(required = true, description = "The list of service groups associated with the bill unit.")
      @NotNull
    @Valid
    public List<ServiceGroupIndex> getForServiceGroup() {
    return forServiceGroup;
  }

  public void setForServiceGroup(List<ServiceGroupIndex> forServiceGroup) {
    this.forServiceGroup = forServiceGroup;
  }

  public ExistingBillUnits balanceGroups(List<BalanceGroup> balanceGroups) {
    this.balanceGroups = balanceGroups;
    return this;
  }

  public ExistingBillUnits addBalanceGroupsItem(BalanceGroup balanceGroupsItem) {
    if (this.balanceGroups == null) {
      this.balanceGroups = new ArrayList<BalanceGroup>();
    }
    this.balanceGroups.add(balanceGroupsItem);
    return this;
  }

  /**
   * The list of balance groups associated with the bill unit.
   * @return balanceGroups
   **/
  @Schema(description = "The list of balance groups associated with the bill unit.")
      @Valid
    public List<BalanceGroup> getBalanceGroups() {
    return balanceGroups;
  }

  public void setBalanceGroups(List<BalanceGroup> balanceGroups) {
    this.balanceGroups = balanceGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExistingBillUnits existingBillUnits = (ExistingBillUnits) o;
    return Objects.equals(this.billUnitId, existingBillUnits.billUnitId) &&
        Objects.equals(this.forServiceGroup, existingBillUnits.forServiceGroup) &&
        Objects.equals(this.balanceGroups, existingBillUnits.balanceGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billUnitId, forServiceGroup, balanceGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExistingBillUnits {\n");
    
    sb.append("    billUnitId: ").append(toIndentedString(billUnitId)).append("\n");
    sb.append("    forServiceGroup: ").append(toIndentedString(forServiceGroup)).append("\n");
    sb.append("    balanceGroups: ").append(toIndentedString(balanceGroups)).append("\n");
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
