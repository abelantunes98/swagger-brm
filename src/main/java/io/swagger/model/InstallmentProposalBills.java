package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bills array type.
 */
@Schema(description = "Bills array type.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class InstallmentProposalBills   {
  @JsonProperty("billId")
  private String billId = null;

  public InstallmentProposalBills billId(String billId) {
    this.billId = billId;
    return this;
  }

  /**
   * An <b>/item</b> or <b>/bill</b> ID.
   * @return billId
   **/
  @Schema(description = "An <b>/item</b> or <b>/bill</b> ID.")
  
    public String getBillId() {
    return billId;
  }

  public void setBillId(String billId) {
    this.billId = billId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentProposalBills installmentProposalBills = (InstallmentProposalBills) o;
    return Objects.equals(this.billId, installmentProposalBills.billId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentProposalBills {\n");
    
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
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
