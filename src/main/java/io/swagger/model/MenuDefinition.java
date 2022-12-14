package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Menu;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MenuDefinition
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class MenuDefinition   {
  @JsonProperty("menu")
  @Valid
  private List<Menu> menu = new ArrayList<Menu>();

  public MenuDefinition menu(List<Menu> menu) {
    this.menu = menu;
    return this;
  }

  public MenuDefinition addMenuItem(Menu menuItem) {
    this.menu.add(menuItem);
    return this;
  }

  /**
   * Get menu
   * @return menu
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<Menu> getMenu() {
    return menu;
  }

  public void setMenu(List<Menu> menu) {
    this.menu = menu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuDefinition menuDefinition = (MenuDefinition) o;
    return Objects.equals(this.menu, menuDefinition.menu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuDefinition {\n");
    
    sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
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
