package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BillUnitServices;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of customer assets.
 */
@Schema(description = "A list of customer assets.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class CustomerAssets   {
  @JsonProperty("billUnitServices")
  @Valid
  private List<BillUnitServices> billUnitServices = null;

  public CustomerAssets billUnitServices(List<BillUnitServices> billUnitServices) {
    this.billUnitServices = billUnitServices;
    return this;
  }

  public CustomerAssets addBillUnitServicesItem(BillUnitServices billUnitServicesItem) {
    if (this.billUnitServices == null) {
      this.billUnitServices = new ArrayList<BillUnitServices>();
    }
    this.billUnitServices.add(billUnitServicesItem);
    return this;
  }

  /**
   * The list of services, organized by bill unit.
   * @return billUnitServices
   **/
  @Schema(description = "The list of services, organized by bill unit.")
      @Valid
    public List<BillUnitServices> getBillUnitServices() {
    return billUnitServices;
  }

  public void setBillUnitServices(List<BillUnitServices> billUnitServices) {
    this.billUnitServices = billUnitServices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAssets customerAssets = (CustomerAssets) o;
    return Objects.equals(this.billUnitServices, customerAssets.billUnitServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billUnitServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAssets {\n");
    
    sb.append("    billUnitServices: ").append(toIndentedString(billUnitServices)).append("\n");
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
