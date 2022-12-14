package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Balances;
import io.swagger.model.ServiceType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of balance groups associated with the bill unit.
 */
@Schema(description = "The list of balance groups associated with the bill unit.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BalanceGroup   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("services")
  @Valid
  private List<ServiceType> services = null;

  @JsonProperty("balances")
  @Valid
  private List<Balances> balances = null;

  @JsonProperty("elem")
  private Integer elem = null;

  public BalanceGroup extension(Object extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extended attributes.
   * @return extension
   **/
  @Schema(description = "The extended attributes.")
  
    public Object getExtension() {
    return extension;
  }

  public void setExtension(Object extension) {
    this.extension = extension;
  }

  public BalanceGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID.
   * @return id
   **/
  @Schema(required = true, description = "The ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BalanceGroup name(String name) {
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

  public BalanceGroup services(List<ServiceType> services) {
    this.services = services;
    return this;
  }

  public BalanceGroup addServicesItem(ServiceType servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<ServiceType>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The list of services associated with the balance group.
   * @return services
   **/
  @Schema(description = "The list of services associated with the balance group.")
      @Valid
    public List<ServiceType> getServices() {
    return services;
  }

  public void setServices(List<ServiceType> services) {
    this.services = services;
  }

  public BalanceGroup balances(List<Balances> balances) {
    this.balances = balances;
    return this;
  }

  public BalanceGroup addBalancesItem(Balances balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<Balances>();
    }
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * The list of balances associated with the balance group.
   * @return balances
   **/
  @Schema(description = "The list of balances associated with the balance group.")
      @Valid
    public List<Balances> getBalances() {
    return balances;
  }

  public void setBalances(List<Balances> balances) {
    this.balances = balances;
  }

  public BalanceGroup elem(Integer elem) {
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
    BalanceGroup balanceGroup = (BalanceGroup) o;
    return Objects.equals(this.extension, balanceGroup.extension) &&
        Objects.equals(this.id, balanceGroup.id) &&
        Objects.equals(this.name, balanceGroup.name) &&
        Objects.equals(this.services, balanceGroup.services) &&
        Objects.equals(this.balances, balanceGroup.balances) &&
        Objects.equals(this.elem, balanceGroup.elem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, name, services, balances, elem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceGroup {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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
