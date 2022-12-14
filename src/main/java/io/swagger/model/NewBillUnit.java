package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BalanceGroups;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewBillUnit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class NewBillUnit   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("paymentType")
  private String paymentType = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("balanceGroups")
  @Valid
  private List<BalanceGroups> balanceGroups = null;

  public NewBillUnit extension(Object extension) {
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

  public NewBillUnit id(String id) {
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

  public NewBillUnit name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the new bill unit.
   * @return name
   **/
  @Schema(required = true, description = "The name of the new bill unit.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewBillUnit paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * The payment type of the new bill unit.
   * @return paymentType
   **/
  @Schema(required = true, description = "The payment type of the new bill unit.")
      @NotNull

    public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public NewBillUnit accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public NewBillUnit balanceGroups(List<BalanceGroups> balanceGroups) {
    this.balanceGroups = balanceGroups;
    return this;
  }

  public NewBillUnit addBalanceGroupsItem(BalanceGroups balanceGroupsItem) {
    if (this.balanceGroups == null) {
      this.balanceGroups = new ArrayList<BalanceGroups>();
    }
    this.balanceGroups.add(balanceGroupsItem);
    return this;
  }

  /**
   * The list of balance groups associated with the new bill unit.
   * @return balanceGroups
   **/
  @Schema(description = "The list of balance groups associated with the new bill unit.")
      @Valid
    public List<BalanceGroups> getBalanceGroups() {
    return balanceGroups;
  }

  public void setBalanceGroups(List<BalanceGroups> balanceGroups) {
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
    NewBillUnit newBillUnit = (NewBillUnit) o;
    return Objects.equals(this.extension, newBillUnit.extension) &&
        Objects.equals(this.id, newBillUnit.id) &&
        Objects.equals(this.name, newBillUnit.name) &&
        Objects.equals(this.paymentType, newBillUnit.paymentType) &&
        Objects.equals(this.accountRef, newBillUnit.accountRef) &&
        Objects.equals(this.balanceGroups, newBillUnit.balanceGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, name, paymentType, accountRef, balanceGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBillUnit {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
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
