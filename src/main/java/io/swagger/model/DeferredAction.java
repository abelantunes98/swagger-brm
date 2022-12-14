package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeferredAction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DeferredAction   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("actionId")
  private ResourceRef actionId = null;

  @JsonProperty("actionName")
  private String actionName = null;

  @JsonProperty("serviceId")
  private ResourceRef serviceId = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("scheduledDate")
  private OffsetDateTime scheduledDate = null;

  @JsonProperty("serviceLogin")
  private String serviceLogin = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isCollectionsAction")
  private Boolean isCollectionsAction = null;

  @JsonProperty("actionStatus")
  private Integer actionStatus = null;

  public DeferredAction extension(Object extension) {
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

  public DeferredAction actionId(ResourceRef actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Get actionId
   * @return actionId
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public ResourceRef getActionId() {
    return actionId;
  }

  public void setActionId(ResourceRef actionId) {
    this.actionId = actionId;
  }

  public DeferredAction actionName(String actionName) {
    this.actionName = actionName;
    return this;
  }

  /**
   * The action's name.
   * @return actionName
   **/
  @Schema(required = true, description = "The action's name.")
      @NotNull

    public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) {
    this.actionName = actionName;
  }

  public DeferredAction serviceId(ResourceRef serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getServiceId() {
    return serviceId;
  }

  public void setServiceId(ResourceRef serviceId) {
    this.serviceId = serviceId;
  }

  public DeferredAction serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * The type of the service associated with the action.
   * @return serviceType
   **/
  @Schema(description = "The type of the service associated with the action.")
  
    public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public DeferredAction scheduledDate(OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * The date and time the deferred action is scheduled to occur.
   * @return scheduledDate
   **/
  @Schema(required = true, description = "The date and time the deferred action is scheduled to occur.")
      @NotNull

    @Valid
    public OffsetDateTime getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(OffsetDateTime scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public DeferredAction serviceLogin(String serviceLogin) {
    this.serviceLogin = serviceLogin;
    return this;
  }

  /**
   * The service login information.
   * @return serviceLogin
   **/
  @Schema(description = "The service login information.")
  
    public String getServiceLogin() {
    return serviceLogin;
  }

  public void setServiceLogin(String serviceLogin) {
    this.serviceLogin = serviceLogin;
  }

  public DeferredAction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The deferred action's description.
   * @return description
   **/
  @Schema(description = "The deferred action's description.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeferredAction isCollectionsAction(Boolean isCollectionsAction) {
    this.isCollectionsAction = isCollectionsAction;
    return this;
  }

  /**
   * Whether the deferred action is for collections (<b>true</b>) or not (<b>false</b>).
   * @return isCollectionsAction
   **/
  @Schema(description = "Whether the deferred action is for collections (<b>true</b>) or not (<b>false</b>).")
  
    public Boolean isIsCollectionsAction() {
    return isCollectionsAction;
  }

  public void setIsCollectionsAction(Boolean isCollectionsAction) {
    this.isCollectionsAction = isCollectionsAction;
  }

  public DeferredAction actionStatus(Integer actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

  /**
   * The status of the deferred action. Possible values are: <ul><li><b>0</b>: Pending</li><li><b>1</b>: Done</li><li><b>2</b>: Error</li><li><b>3</b>: Pending and undeletable</li></ul>
   * @return actionStatus
   **/
  @Schema(description = "The status of the deferred action. Possible values are: <ul><li><b>0</b>: Pending</li><li><b>1</b>: Done</li><li><b>2</b>: Error</li><li><b>3</b>: Pending and undeletable</li></ul>")
  
    public Integer getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(Integer actionStatus) {
    this.actionStatus = actionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeferredAction deferredAction = (DeferredAction) o;
    return Objects.equals(this.extension, deferredAction.extension) &&
        Objects.equals(this.actionId, deferredAction.actionId) &&
        Objects.equals(this.actionName, deferredAction.actionName) &&
        Objects.equals(this.serviceId, deferredAction.serviceId) &&
        Objects.equals(this.serviceType, deferredAction.serviceType) &&
        Objects.equals(this.scheduledDate, deferredAction.scheduledDate) &&
        Objects.equals(this.serviceLogin, deferredAction.serviceLogin) &&
        Objects.equals(this.description, deferredAction.description) &&
        Objects.equals(this.isCollectionsAction, deferredAction.isCollectionsAction) &&
        Objects.equals(this.actionStatus, deferredAction.actionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, actionId, actionName, serviceId, serviceType, scheduledDate, serviceLogin, description, isCollectionsAction, actionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeferredAction {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    serviceLogin: ").append(toIndentedString(serviceLogin)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isCollectionsAction: ").append(toIndentedString(isCollectionsAction)).append("\n");
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
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
