package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about an extended rating attribute.
 */
@Schema(description = "Information about an extended rating attribute.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Extrating   {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("referenceCount")
  private Integer referenceCount = null;

  @JsonProperty("status")
  private Integer status = null;

  public Extrating label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The ERA's label name.
   * @return label
   **/
  @Schema(description = "The ERA's label name.")
  
    public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Extrating referenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
    return this;
  }

  /**
   * A number that keeps the reference count. For purchases, the counter is incremented by one. For cancellations, the counter is decreased by one.
   * @return referenceCount
   **/
  @Schema(description = "A number that keeps the reference count. For purchases, the counter is incremented by one. For cancellations, the counter is decreased by one.")
  
    public Integer getReferenceCount() {
    return referenceCount;
  }

  public void setReferenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
  }

  public Extrating status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The provisioning status. Can be one of the following&colon; <ul><li><b>0</b>: No operation</li><li><b>1</b>: Provisioning ERA</li><li><b>2</b>: Provisioning ERA failed</li><li><b>3</b>: ERA active</li><li><b>4</b>: Unprovisioning ERA</li><li><b>5</b>: Unprovisioning ERA failed</li><li><b>6</b>: ERA unprovisioned</li><li><b>7</b>: Suspending ERA</li><li><b>8</b>: ERA suspension failed</li><li><b>9</b>: ERA suspended</li></ul>
   * @return status
   **/
  @Schema(description = "The provisioning status. Can be one of the following&colon; <ul><li><b>0</b>: No operation</li><li><b>1</b>: Provisioning ERA</li><li><b>2</b>: Provisioning ERA failed</li><li><b>3</b>: ERA active</li><li><b>4</b>: Unprovisioning ERA</li><li><b>5</b>: Unprovisioning ERA failed</li><li><b>6</b>: ERA unprovisioned</li><li><b>7</b>: Suspending ERA</li><li><b>8</b>: ERA suspension failed</li><li><b>9</b>: ERA suspended</li></ul>")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Extrating extrating = (Extrating) o;
    return Objects.equals(this.label, extrating.label) &&
        Objects.equals(this.referenceCount, extrating.referenceCount) &&
        Objects.equals(this.status, extrating.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, referenceCount, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Extrating {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    referenceCount: ").append(toIndentedString(referenceCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
