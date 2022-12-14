package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AccountAndBillItems;
import io.swagger.model.ServicesAndBillItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bill charge group from other nonpaying accounts.
 */
@Schema(description = "A bill charge group from other nonpaying accounts.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class BillChargeGroup   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("account")
  private AccountAndBillItems account = null;

  @JsonProperty("services")
  @Valid
  private List<ServicesAndBillItems> services = new ArrayList<ServicesAndBillItems>();

  public BillChargeGroup extension(Object extension) {
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

  public BillChargeGroup account(AccountAndBillItems account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
   **/
  @Schema(description = "")
  
    @Valid
    public AccountAndBillItems getAccount() {
    return account;
  }

  public void setAccount(AccountAndBillItems account) {
    this.account = account;
  }

  public BillChargeGroup services(List<ServicesAndBillItems> services) {
    this.services = services;
    return this;
  }

  public BillChargeGroup addServicesItem(ServicesAndBillItems servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

  /**
   * The services and bill items in the bill charge group.
   * @return services
   **/
  @Schema(required = true, description = "The services and bill items in the bill charge group.")
      @NotNull
    @Valid
    public List<ServicesAndBillItems> getServices() {
    return services;
  }

  public void setServices(List<ServicesAndBillItems> services) {
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
    BillChargeGroup billChargeGroup = (BillChargeGroup) o;
    return Objects.equals(this.extension, billChargeGroup.extension) &&
        Objects.equals(this.account, billChargeGroup.account) &&
        Objects.equals(this.services, billChargeGroup.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, account, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillChargeGroup {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
