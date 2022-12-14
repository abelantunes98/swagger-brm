package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The deposit transaction Details
 */
@Schema(description = "The deposit transaction Details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositTxnDepositDetails   {
  @JsonProperty("depositRef")
  private String depositRef = null;

  @JsonProperty("sourceDepositRef")
  private String sourceDepositRef = null;

  @JsonProperty("destDepositRef")
  private String destDepositRef = null;

  public DepositTxnDepositDetails depositRef(String depositRef) {
    this.depositRef = depositRef;
    return this;
  }

  /**
   * The deposit reference.
   * @return depositRef
   **/
  @Schema(required = true, description = "The deposit reference.")
      @NotNull

    public String getDepositRef() {
    return depositRef;
  }

  public void setDepositRef(String depositRef) {
    this.depositRef = depositRef;
  }

  public DepositTxnDepositDetails sourceDepositRef(String sourceDepositRef) {
    this.sourceDepositRef = sourceDepositRef;
    return this;
  }

  /**
   * The sourece deposit reference.
   * @return sourceDepositRef
   **/
  @Schema(required = true, description = "The sourece deposit reference.")
      @NotNull

    public String getSourceDepositRef() {
    return sourceDepositRef;
  }

  public void setSourceDepositRef(String sourceDepositRef) {
    this.sourceDepositRef = sourceDepositRef;
  }

  public DepositTxnDepositDetails destDepositRef(String destDepositRef) {
    this.destDepositRef = destDepositRef;
    return this;
  }

  /**
   * The destination deposit reference.
   * @return destDepositRef
   **/
  @Schema(required = true, description = "The destination deposit reference.")
      @NotNull

    public String getDestDepositRef() {
    return destDepositRef;
  }

  public void setDestDepositRef(String destDepositRef) {
    this.destDepositRef = destDepositRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTxnDepositDetails depositTxnDepositDetails = (DepositTxnDepositDetails) o;
    return Objects.equals(this.depositRef, depositTxnDepositDetails.depositRef) &&
        Objects.equals(this.sourceDepositRef, depositTxnDepositDetails.sourceDepositRef) &&
        Objects.equals(this.destDepositRef, depositTxnDepositDetails.destDepositRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositRef, sourceDepositRef, destDepositRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTxnDepositDetails {\n");
    
    sb.append("    depositRef: ").append(toIndentedString(depositRef)).append("\n");
    sb.append("    sourceDepositRef: ").append(toIndentedString(sourceDepositRef)).append("\n");
    sb.append("    destDepositRef: ").append(toIndentedString(destDepositRef)).append("\n");
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
