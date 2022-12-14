package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Criteria;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Filter
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Filter   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("defaultPageSize")
  private Integer defaultPageSize = 50;

  @JsonProperty("criteria")
  @Valid
  private List<Criteria> criteria = null;

  public Filter extension(Object extension) {
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

  public Filter defaultPageSize(Integer defaultPageSize) {
    this.defaultPageSize = defaultPageSize;
    return this;
  }

  /**
   * Get defaultPageSize
   * @return defaultPageSize
   **/
  @Schema(description = "")
  
    public Integer getDefaultPageSize() {
    return defaultPageSize;
  }

  public void setDefaultPageSize(Integer defaultPageSize) {
    this.defaultPageSize = defaultPageSize;
  }

  public Filter criteria(List<Criteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  public Filter addCriteriaItem(Criteria criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<Criteria>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

  /**
   * Get criteria
   * @return criteria
   **/
  @Schema(description = "")
      @Valid
    public List<Criteria> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<Criteria> criteria) {
    this.criteria = criteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.extension, filter.extension) &&
        Objects.equals(this.defaultPageSize, filter.defaultPageSize) &&
        Objects.equals(this.criteria, filter.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, defaultPageSize, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    defaultPageSize: ").append(toIndentedString(defaultPageSize)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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
