package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Criterias;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchCriterias
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class SearchCriterias   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("searchTemplateName")
  private String searchTemplateName = null;

  @JsonProperty("criterias")
  @Valid
  private List<Criterias> criterias = null;

  public SearchCriterias extension(Object extension) {
    this.extension = extension;
    return this;
  }

  /**
   * The extended attributes.
   * @return extension
   **/
  @Schema(description = "The extended attributes.")
  
    public Object getExtension() {
    return extension;
  }

  public void setExtension(Object extension) {
    this.extension = extension;
  }

  public SearchCriterias searchTemplateName(String searchTemplateName) {
    this.searchTemplateName = searchTemplateName;
    return this;
  }

  /**
   * Get searchTemplateName
   * @return searchTemplateName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getSearchTemplateName() {
    return searchTemplateName;
  }

  public void setSearchTemplateName(String searchTemplateName) {
    this.searchTemplateName = searchTemplateName;
  }

  public SearchCriterias criterias(List<Criterias> criterias) {
    this.criterias = criterias;
    return this;
  }

  public SearchCriterias addCriteriasItem(Criterias criteriasItem) {
    if (this.criterias == null) {
      this.criterias = new ArrayList<Criterias>();
    }
    this.criterias.add(criteriasItem);
    return this;
  }

  /**
   * Get criterias
   * @return criterias
   **/
  @Schema(description = "")
      @Valid
    public List<Criterias> getCriterias() {
    return criterias;
  }

  public void setCriterias(List<Criterias> criterias) {
    this.criterias = criterias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriterias searchCriterias = (SearchCriterias) o;
    return Objects.equals(this.extension, searchCriterias.extension) &&
        Objects.equals(this.searchTemplateName, searchCriterias.searchTemplateName) &&
        Objects.equals(this.criterias, searchCriterias.criterias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, searchTemplateName, criterias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriterias {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    searchTemplateName: ").append(toIndentedString(searchTemplateName)).append("\n");
    sb.append("    criterias: ").append(toIndentedString(criterias)).append("\n");
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
