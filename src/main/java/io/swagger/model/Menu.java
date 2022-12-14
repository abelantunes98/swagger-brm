package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Contents;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Menu
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Menu   {
  @JsonProperty("headerKey")
  private String headerKey = null;

  @JsonProperty("contents")
  private Contents contents = null;

  @JsonProperty("id")
  private String id = null;

  public Menu headerKey(String headerKey) {
    this.headerKey = headerKey;
    return this;
  }

  /**
   * Get headerKey
   * @return headerKey
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getHeaderKey() {
    return headerKey;
  }

  public void setHeaderKey(String headerKey) {
    this.headerKey = headerKey;
  }

  public Menu contents(Contents contents) {
    this.contents = contents;
    return this;
  }

  /**
   * Get contents
   * @return contents
   **/
  @Schema(description = "")
  
    @Valid
    public Contents getContents() {
    return contents;
  }

  public void setContents(Contents contents) {
    this.contents = contents;
  }

  public Menu id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu) o;
    return Objects.equals(this.headerKey, menu.headerKey) &&
        Objects.equals(this.contents, menu.contents) &&
        Objects.equals(this.id, menu.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerKey, contents, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    
    sb.append("    headerKey: ").append(toIndentedString(headerKey)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
