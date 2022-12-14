package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The charges.
 */
@Schema(description = "The charges.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Charge   {
  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("priceTag")
  private String priceTag = null;

  @JsonProperty("type")
  private String type = null;

  public Charge amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The charge amount.
   * @return amount
   **/
  @Schema(required = true, description = "The charge amount.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Charge priceTag(String priceTag) {
    this.priceTag = priceTag;
    return this;
  }

  /**
   * The charge's price tag.
   * @return priceTag
   **/
  @Schema(required = true, description = "The charge's price tag.")
      @NotNull

    public String getPriceTag() {
    return priceTag;
  }

  public void setPriceTag(String priceTag) {
    this.priceTag = priceTag;
  }

  public Charge type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The charge type.
   * @return type
   **/
  @Schema(required = true, description = "The charge type.")
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this.amount, charge.amount) &&
        Objects.equals(this.priceTag, charge.priceTag) &&
        Objects.equals(this.type, charge.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, priceTag, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    priceTag: ").append(toIndentedString(priceTag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
