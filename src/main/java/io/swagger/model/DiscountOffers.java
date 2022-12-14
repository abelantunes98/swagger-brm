package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of discount offers.
 */
@Schema(description = "The list of discount offers.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DiscountOffers   {
  @JsonProperty("ref")
  private ResourceRef ref = null;

  public DiscountOffers ref(ResourceRef ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getRef() {
    return ref;
  }

  public void setRef(ResourceRef ref) {
    this.ref = ref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountOffers discountOffers = (DiscountOffers) o;
    return Objects.equals(this.ref, discountOffers.ref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountOffers {\n");
    
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
