package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillUnitPackages;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerPackages
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomerPackages   {
  @JsonProperty("billUnitPackages")
  @Valid
  private List<BillUnitPackages> billUnitPackages = null;

  public CustomerPackages billUnitPackages(List<BillUnitPackages> billUnitPackages) {
    this.billUnitPackages = billUnitPackages;
    return this;
  }

  public CustomerPackages addBillUnitPackagesItem(BillUnitPackages billUnitPackagesItem) {
    if (this.billUnitPackages == null) {
      this.billUnitPackages = new ArrayList<BillUnitPackages>();
    }
    this.billUnitPackages.add(billUnitPackagesItem);
    return this;
  }

  /**
   * A list of purchased packages
   * @return billUnitPackages
   **/
  @Schema(description = "A list of purchased packages")
      @Valid
    public List<BillUnitPackages> getBillUnitPackages() {
    return billUnitPackages;
  }

  public void setBillUnitPackages(List<BillUnitPackages> billUnitPackages) {
    this.billUnitPackages = billUnitPackages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPackages customerPackages = (CustomerPackages) o;
    return Objects.equals(this.billUnitPackages, customerPackages.billUnitPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billUnitPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPackages {\n");
    
    sb.append("    billUnitPackages: ").append(toIndentedString(billUnitPackages)).append("\n");
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
