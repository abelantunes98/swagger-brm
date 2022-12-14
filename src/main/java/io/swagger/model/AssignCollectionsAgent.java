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
 * AssignCollectionsAgent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AssignCollectionsAgent   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("billunitRef")
  private ResourceRef billunitRef = null;

  @JsonProperty("scenarioRef")
  private ResourceRef scenarioRef = null;

  @JsonProperty("collectionAgent")
  private String collectionAgent = null;

  public AssignCollectionsAgent extension(Object extension) {
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

  public AssignCollectionsAgent accountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
    return this;
  }

  /**
   * Get accountRef
   * @return accountRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getAccountRef() {
    return accountRef;
  }

  public void setAccountRef(ResourceRef accountRef) {
    this.accountRef = accountRef;
  }

  public AssignCollectionsAgent billunitRef(ResourceRef billunitRef) {
    this.billunitRef = billunitRef;
    return this;
  }

  /**
   * Get billunitRef
   * @return billunitRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBillunitRef() {
    return billunitRef;
  }

  public void setBillunitRef(ResourceRef billunitRef) {
    this.billunitRef = billunitRef;
  }

  public AssignCollectionsAgent scenarioRef(ResourceRef scenarioRef) {
    this.scenarioRef = scenarioRef;
    return this;
  }

  /**
   * Get scenarioRef
   * @return scenarioRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getScenarioRef() {
    return scenarioRef;
  }

  public void setScenarioRef(ResourceRef scenarioRef) {
    this.scenarioRef = scenarioRef;
  }

  public AssignCollectionsAgent collectionAgent(String collectionAgent) {
    this.collectionAgent = collectionAgent;
    return this;
  }

  /**
   * The collections agent.
   * @return collectionAgent
   **/
  @Schema(required = true, description = "The collections agent.")
      @NotNull

    public String getCollectionAgent() {
    return collectionAgent;
  }

  public void setCollectionAgent(String collectionAgent) {
    this.collectionAgent = collectionAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignCollectionsAgent assignCollectionsAgent = (AssignCollectionsAgent) o;
    return Objects.equals(this.extension, assignCollectionsAgent.extension) &&
        Objects.equals(this.accountRef, assignCollectionsAgent.accountRef) &&
        Objects.equals(this.billunitRef, assignCollectionsAgent.billunitRef) &&
        Objects.equals(this.scenarioRef, assignCollectionsAgent.scenarioRef) &&
        Objects.equals(this.collectionAgent, assignCollectionsAgent.collectionAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, accountRef, billunitRef, scenarioRef, collectionAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignCollectionsAgent {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    billunitRef: ").append(toIndentedString(billunitRef)).append("\n");
    sb.append("    scenarioRef: ").append(toIndentedString(scenarioRef)).append("\n");
    sb.append("    collectionAgent: ").append(toIndentedString(collectionAgent)).append("\n");
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
