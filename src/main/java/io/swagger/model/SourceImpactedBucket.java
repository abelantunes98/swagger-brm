package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The impacted bucket at the source.
 */
@Schema(description = "The impacted bucket at the source.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SourceImpactedBucket   {
  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  public SourceImpactedBucket validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  /**
   * The date and time the bucket's validity starts.
   * @return validFrom
   **/
  @Schema(description = "The date and time the bucket's validity starts.")
  
    @Valid
    public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public SourceImpactedBucket validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  /**
   * The date and time the bucket's validity ends.
   * @return validTo
   **/
  @Schema(description = "The date and time the bucket's validity ends.")
  
    @Valid
    public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public SourceImpactedBucket amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount transferred from the bucket.
   * @return amount
   **/
  @Schema(required = true, description = "The amount transferred from the bucket.")
      @NotNull

    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceImpactedBucket sourceImpactedBucket = (SourceImpactedBucket) o;
    return Objects.equals(this.validFrom, sourceImpactedBucket.validFrom) &&
        Objects.equals(this.validTo, sourceImpactedBucket.validTo) &&
        Objects.equals(this.amount, sourceImpactedBucket.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validFrom, validTo, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceImpactedBucket {\n");
    
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
