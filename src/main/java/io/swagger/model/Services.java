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
 * The list of services shared in the group.
 */
@Schema(description = "The list of services shared in the group.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Services   {
  @JsonProperty("serviceRef")
  private ResourceRef serviceRef = null;

  @JsonProperty("index")
  private Integer index = null;

  public Services serviceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
    return this;
  }

  /**
   * Get serviceRef
   * @return serviceRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getServiceRef() {
    return serviceRef;
  }

  public void setServiceRef(ResourceRef serviceRef) {
    this.serviceRef = serviceRef;
  }

  public Services index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * The position of the entry in the index. For example, the first service in a list would have an <b>index</b> value of <b>1</b>.
   * @return index
   **/
  @Schema(description = "The position of the entry in the index. For example, the first service in a list would have an <b>index</b> value of <b>1</b>.")
  
    public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Services services = (Services) o;
    return Objects.equals(this.serviceRef, services.serviceRef) &&
        Objects.equals(this.index, services.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRef, index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Services {\n");
    
    sb.append("    serviceRef: ").append(toIndentedString(serviceRef)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
