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
 * A list of aging buckets.
 */
@Schema(description = "A list of aging buckets.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AgingBuckets   {
  @JsonProperty("days")
  private Integer days = null;

  @JsonProperty("due")
  private BigDecimal due = null;

  public AgingBuckets days(Integer days) {
    this.days = days;
    return this;
  }

  /**
   * The number of overdue days in this aging bucket.
   * @return days
   **/
  @Schema(description = "The number of overdue days in this aging bucket.")
  
    public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public AgingBuckets due(BigDecimal due) {
    this.due = due;
    return this;
  }

  /**
   * The amount due in this aging bucket.
   * @return due
   **/
  @Schema(required = true, description = "The amount due in this aging bucket.")
      @NotNull

    @Valid
    public BigDecimal getDue() {
    return due;
  }

  public void setDue(BigDecimal due) {
    this.due = due;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgingBuckets agingBuckets = (AgingBuckets) o;
    return Objects.equals(this.days, agingBuckets.days) &&
        Objects.equals(this.due, agingBuckets.due);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, due);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgingBuckets {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    due: ").append(toIndentedString(due)).append("\n");
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
