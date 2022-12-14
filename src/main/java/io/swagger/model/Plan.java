package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Plan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Plan   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("descr")
  private String descr = null;

  public Plan id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The plan's ID.
   * @return id
   **/
  @Schema(required = true, description = "The plan's ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plan createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time the plan was created.
   * @return createdAt
   **/
  @Schema(required = true, description = "The date and time the plan was created.")
      @NotNull

    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Plan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The plan's name.
   * @return name
   **/
  @Schema(required = true, description = "The plan's name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plan code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The plan's code.
   * @return code
   **/
  @Schema(required = true, description = "The plan's code.")
      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Plan descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The plan's description.
   * @return descr
   **/
  @Schema(required = true, description = "The plan's description.")
      @NotNull

    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.id, plan.id) &&
        Objects.equals(this.createdAt, plan.createdAt) &&
        Objects.equals(this.name, plan.name) &&
        Objects.equals(this.code, plan.code) &&
        Objects.equals(this.descr, plan.descr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, name, code, descr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
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
