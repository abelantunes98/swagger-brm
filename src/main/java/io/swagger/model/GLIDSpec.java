package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The G/L ID specification.
 */
@Schema(description = "The G/L ID specification.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class GLIDSpec   {
  @JsonProperty("glid")
  private String glid = null;

  @JsonProperty("descr")
  private String descr = null;

  public GLIDSpec glid(String glid) {
    this.glid = glid;
    return this;
  }

  /**
   * The general ledger ID.
   * @return glid
   **/
  @Schema(required = true, description = "The general ledger ID.")
      @NotNull

    public String getGlid() {
    return glid;
  }

  public void setGlid(String glid) {
    this.glid = glid;
  }

  public GLIDSpec descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The G/L ID label or name.
   * @return descr
   **/
  @Schema(required = true, description = "The G/L ID label or name.")
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
    GLIDSpec glIDSpec = (GLIDSpec) o;
    return Objects.equals(this.glid, glIDSpec.glid) &&
        Objects.equals(this.descr, glIDSpec.descr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(glid, descr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GLIDSpec {\n");
    
    sb.append("    glid: ").append(toIndentedString(glid)).append("\n");
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
