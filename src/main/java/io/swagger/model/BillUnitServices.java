package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Service;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of services, organized by bill unit.
 */
@Schema(description = "The list of services, organized by bill unit.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillUnitServices   {
  @JsonProperty("billUnitID")
  private String billUnitID = null;

  @JsonProperty("billUnitName")
  private String billUnitName = null;

  @JsonProperty("services")
  @Valid
  private List<Service> services = null;

  public BillUnitServices billUnitID(String billUnitID) {
    this.billUnitID = billUnitID;
    return this;
  }

  /**
   * The bill unit's ID.
   * @return billUnitID
   **/
  @Schema(description = "The bill unit's ID.")
  
    public String getBillUnitID() {
    return billUnitID;
  }

  public void setBillUnitID(String billUnitID) {
    this.billUnitID = billUnitID;
  }

  public BillUnitServices billUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
    return this;
  }

  /**
   * The bill unit's name.
   * @return billUnitName
   **/
  @Schema(description = "The bill unit's name.")
  
    public String getBillUnitName() {
    return billUnitName;
  }

  public void setBillUnitName(String billUnitName) {
    this.billUnitName = billUnitName;
  }

  public BillUnitServices services(List<Service> services) {
    this.services = services;
    return this;
  }

  public BillUnitServices addServicesItem(Service servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Service>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The list of services associated with the bill unit.
   * @return services
   **/
  @Schema(description = "The list of services associated with the bill unit.")
      @Valid
    public List<Service> getServices() {
    return services;
  }

  public void setServices(List<Service> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillUnitServices billUnitServices = (BillUnitServices) o;
    return Objects.equals(this.billUnitID, billUnitServices.billUnitID) &&
        Objects.equals(this.billUnitName, billUnitServices.billUnitName) &&
        Objects.equals(this.services, billUnitServices.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billUnitID, billUnitName, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillUnitServices {\n");
    
    sb.append("    billUnitID: ").append(toIndentedString(billUnitID)).append("\n");
    sb.append("    billUnitName: ").append(toIndentedString(billUnitName)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
