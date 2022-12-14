package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The reference resource.
 */
@Schema(description = "The reference resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class EntityRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  public EntityRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * An encoded POID value.
   * @return id
   **/
  @Schema(example = "0.0.0.1+-/account+3255+0", required = true, description = "An encoded POID value.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntityRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL that is used for getting the object.
   * @return href
   **/
  @Schema(example = "https://host:port/bc/webresources/v1.0/_*0.0.0.1+-/account+3255+0", required = true, description = "The unique resource URL that is used for getting the object.")
      @NotNull

    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityRef entityRef = (EntityRef) o;
    return Objects.equals(this.id, entityRef.id) &&
        Objects.equals(this.href, entityRef.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
