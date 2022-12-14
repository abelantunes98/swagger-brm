package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResourceGrants
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ResourceGrants   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("resourceName")
  private String resourceName = null;

  @JsonProperty("grantedActions")
  @Valid
  private List<String> grantedActions = new ArrayList<String>();

  @JsonProperty("deniedActions")
  @Valid
  private List<String> deniedActions = new ArrayList<String>();

  public ResourceGrants extension(Object extension) {
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

  public ResourceGrants resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the resource being granted.
   * @return resourceName
   **/
  @Schema(required = true, description = "The name of the resource being granted.")
      @NotNull

    public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public ResourceGrants grantedActions(List<String> grantedActions) {
    this.grantedActions = grantedActions;
    return this;
  }

  public ResourceGrants addGrantedActionsItem(String grantedActionsItem) {
    this.grantedActions.add(grantedActionsItem);
    return this;
  }

  /**
   * The actions allowed as part of the grant.
   * @return grantedActions
   **/
  @Schema(required = true, description = "The actions allowed as part of the grant.")
      @NotNull

    public List<String> getGrantedActions() {
    return grantedActions;
  }

  public void setGrantedActions(List<String> grantedActions) {
    this.grantedActions = grantedActions;
  }

  public ResourceGrants deniedActions(List<String> deniedActions) {
    this.deniedActions = deniedActions;
    return this;
  }

  public ResourceGrants addDeniedActionsItem(String deniedActionsItem) {
    this.deniedActions.add(deniedActionsItem);
    return this;
  }

  /**
   * The actions denied as part of the grant.
   * @return deniedActions
   **/
  @Schema(required = true, description = "The actions denied as part of the grant.")
      @NotNull

    public List<String> getDeniedActions() {
    return deniedActions;
  }

  public void setDeniedActions(List<String> deniedActions) {
    this.deniedActions = deniedActions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceGrants resourceGrants = (ResourceGrants) o;
    return Objects.equals(this.extension, resourceGrants.extension) &&
        Objects.equals(this.resourceName, resourceGrants.resourceName) &&
        Objects.equals(this.grantedActions, resourceGrants.grantedActions) &&
        Objects.equals(this.deniedActions, resourceGrants.deniedActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, resourceName, grantedActions, deniedActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceGrants {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    grantedActions: ").append(toIndentedString(grantedActions)).append("\n");
    sb.append("    deniedActions: ").append(toIndentedString(deniedActions)).append("\n");
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
