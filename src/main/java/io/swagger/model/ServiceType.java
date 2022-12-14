package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.AliasList;
import io.swagger.model.ResourceRef;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about a service.
 */
@Schema(description = "Details about a service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ServiceType   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private ResourceRef id = null;

  @JsonProperty("pendingDeferredActionsCount")
  private Integer pendingDeferredActionsCount = null;

  @JsonProperty("accountRef")
  private ResourceRef accountRef = null;

  @JsonProperty("aliasList")
  @Valid
  private List<AliasList> aliasList = null;

  @JsonProperty("balanceGroupRef")
  private ResourceRef balanceGroupRef = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("lastStatusComment")
  private String lastStatusComment = null;

  @JsonProperty("lastStatusChange")
  private OffsetDateTime lastStatusChange = null;

  @JsonProperty("login")
  private String login = null;

  @JsonProperty("lifeCycleState")
  private Integer lifeCycleState = null;

  @JsonProperty("lastModified")
  private OffsetDateTime lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("passwordExpiration")
  private OffsetDateTime passwordExpiration = null;

  @JsonProperty("passwordStatus")
  private Integer passwordStatus = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("statusFlags")
  private Integer statusFlags = null;

  @JsonProperty("subscriptionServiceRef")
  private ResourceRef subscriptionServiceRef = null;

  @JsonProperty("serviceAccessLevel")
  private String serviceAccessLevel = null;

  @JsonProperty("balGrpIndex")
  private Integer balGrpIndex = null;

  public ServiceType extension(Object extension) {
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

  public ServiceType id(ResourceRef id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getId() {
    return id;
  }

  public void setId(ResourceRef id) {
    this.id = id;
  }

  public ServiceType pendingDeferredActionsCount(Integer pendingDeferredActionsCount) {
    this.pendingDeferredActionsCount = pendingDeferredActionsCount;
    return this;
  }

  /**
   * The number of deferred actions that are pending for the service.
   * @return pendingDeferredActionsCount
   **/
  @Schema(description = "The number of deferred actions that are pending for the service.")
  
    public Integer getPendingDeferredActionsCount() {
    return pendingDeferredActionsCount;
  }

  public void setPendingDeferredActionsCount(Integer pendingDeferredActionsCount) {
    this.pendingDeferredActionsCount = pendingDeferredActionsCount;
  }

  public ServiceType accountRef(ResourceRef accountRef) {
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

  public ServiceType aliasList(List<AliasList> aliasList) {
    this.aliasList = aliasList;
    return this;
  }

  public ServiceType addAliasListItem(AliasList aliasListItem) {
    if (this.aliasList == null) {
      this.aliasList = new ArrayList<AliasList>();
    }
    this.aliasList.add(aliasListItem);
    return this;
  }

  /**
   * The list of aliases associated with the service.
   * @return aliasList
   **/
  @Schema(description = "The list of aliases associated with the service.")
      @Valid
    public List<AliasList> getAliasList() {
    return aliasList;
  }

  public void setAliasList(List<AliasList> aliasList) {
    this.aliasList = aliasList;
  }

  public ServiceType balanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
    return this;
  }

  /**
   * Get balanceGroupRef
   * @return balanceGroupRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getBalanceGroupRef() {
    return balanceGroupRef;
  }

  public void setBalanceGroupRef(ResourceRef balanceGroupRef) {
    this.balanceGroupRef = balanceGroupRef;
  }

  public ServiceType creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date and time the service type was created.
   * @return creationDate
   **/
  @Schema(description = "The date and time the service type was created.")
  
    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ServiceType effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the service takes effect.
   * @return effectiveDate
   **/
  @Schema(description = "The date and time the service takes effect.")
  
    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ServiceType lastStatusComment(String lastStatusComment) {
    this.lastStatusComment = lastStatusComment;
    return this;
  }

  /**
   * The comment associated with the last status change.
   * @return lastStatusComment
   **/
  @Schema(description = "The comment associated with the last status change.")
  
    public String getLastStatusComment() {
    return lastStatusComment;
  }

  public void setLastStatusComment(String lastStatusComment) {
    this.lastStatusComment = lastStatusComment;
  }

  public ServiceType lastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
    return this;
  }

  /**
   * The date and time of the last status change.
   * @return lastStatusChange
   **/
  @Schema(description = "The date and time of the last status change.")
  
    @Valid
    public OffsetDateTime getLastStatusChange() {
    return lastStatusChange;
  }

  public void setLastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
  }

  public ServiceType login(String login) {
    this.login = login;
    return this;
  }

  /**
   * The login associated with the service.
   * @return login
   **/
  @Schema(required = true, description = "The login associated with the service.")
      @NotNull

    public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public ServiceType lifeCycleState(Integer lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

  /**
   * The current life cycle state.
   * @return lifeCycleState
   **/
  @Schema(description = "The current life cycle state.")
  
    public Integer getLifeCycleState() {
    return lifeCycleState;
  }

  public void setLifeCycleState(Integer lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
  }

  public ServiceType lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date and time the service was last modified.
   * @return lastModified
   **/
  @Schema(description = "The date and time the service was last modified.")
  
    @Valid
    public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public ServiceType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the service.
   * @return name
   **/
  @Schema(description = "The name of the service.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceType password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The password associated with the service.
   * @return password
   **/
  @Schema(required = true, description = "The password associated with the service.")
      @NotNull

    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ServiceType passwordExpiration(OffsetDateTime passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
    return this;
  }

  /**
   * The date and time the password expires.
   * @return passwordExpiration
   **/
  @Schema(description = "The date and time the password expires.")
  
    @Valid
    public OffsetDateTime getPasswordExpiration() {
    return passwordExpiration;
  }

  public void setPasswordExpiration(OffsetDateTime passwordExpiration) {
    this.passwordExpiration = passwordExpiration;
  }

  public ServiceType passwordStatus(Integer passwordStatus) {
    this.passwordStatus = passwordStatus;
    return this;
  }

  /**
   * The current status of the password.
   * @return passwordStatus
   **/
  @Schema(description = "The current status of the password.")
  
    public Integer getPasswordStatus() {
    return passwordStatus;
  }

  public void setPasswordStatus(Integer passwordStatus) {
    this.passwordStatus = passwordStatus;
  }

  public ServiceType status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The status.
   * @return status
   **/
  @Schema(description = "The status.")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ServiceType statusFlags(Integer statusFlags) {
    this.statusFlags = statusFlags;
    return this;
  }

  /**
   * The status flags.
   * @return statusFlags
   **/
  @Schema(description = "The status flags.")
  
    public Integer getStatusFlags() {
    return statusFlags;
  }

  public void setStatusFlags(Integer statusFlags) {
    this.statusFlags = statusFlags;
  }

  public ServiceType subscriptionServiceRef(ResourceRef subscriptionServiceRef) {
    this.subscriptionServiceRef = subscriptionServiceRef;
    return this;
  }

  /**
   * Get subscriptionServiceRef
   * @return subscriptionServiceRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getSubscriptionServiceRef() {
    return subscriptionServiceRef;
  }

  public void setSubscriptionServiceRef(ResourceRef subscriptionServiceRef) {
    this.subscriptionServiceRef = subscriptionServiceRef;
  }

  public ServiceType serviceAccessLevel(String serviceAccessLevel) {
    this.serviceAccessLevel = serviceAccessLevel;
    return this;
  }

  /**
   * The service access level.
   * @return serviceAccessLevel
   **/
  @Schema(description = "The service access level.")
  
    public String getServiceAccessLevel() {
    return serviceAccessLevel;
  }

  public void setServiceAccessLevel(String serviceAccessLevel) {
    this.serviceAccessLevel = serviceAccessLevel;
  }

  public ServiceType balGrpIndex(Integer balGrpIndex) {
    this.balGrpIndex = balGrpIndex;
    return this;
  }

  /**
   * The balance group index.
   * @return balGrpIndex
   **/
  @Schema(description = "The balance group index.")
  
    public Integer getBalGrpIndex() {
    return balGrpIndex;
  }

  public void setBalGrpIndex(Integer balGrpIndex) {
    this.balGrpIndex = balGrpIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceType serviceType = (ServiceType) o;
    return Objects.equals(this.extension, serviceType.extension) &&
        Objects.equals(this.id, serviceType.id) &&
        Objects.equals(this.pendingDeferredActionsCount, serviceType.pendingDeferredActionsCount) &&
        Objects.equals(this.accountRef, serviceType.accountRef) &&
        Objects.equals(this.aliasList, serviceType.aliasList) &&
        Objects.equals(this.balanceGroupRef, serviceType.balanceGroupRef) &&
        Objects.equals(this.creationDate, serviceType.creationDate) &&
        Objects.equals(this.effectiveDate, serviceType.effectiveDate) &&
        Objects.equals(this.lastStatusComment, serviceType.lastStatusComment) &&
        Objects.equals(this.lastStatusChange, serviceType.lastStatusChange) &&
        Objects.equals(this.login, serviceType.login) &&
        Objects.equals(this.lifeCycleState, serviceType.lifeCycleState) &&
        Objects.equals(this.lastModified, serviceType.lastModified) &&
        Objects.equals(this.name, serviceType.name) &&
        Objects.equals(this.password, serviceType.password) &&
        Objects.equals(this.passwordExpiration, serviceType.passwordExpiration) &&
        Objects.equals(this.passwordStatus, serviceType.passwordStatus) &&
        Objects.equals(this.status, serviceType.status) &&
        Objects.equals(this.statusFlags, serviceType.statusFlags) &&
        Objects.equals(this.subscriptionServiceRef, serviceType.subscriptionServiceRef) &&
        Objects.equals(this.serviceAccessLevel, serviceType.serviceAccessLevel) &&
        Objects.equals(this.balGrpIndex, serviceType.balGrpIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, pendingDeferredActionsCount, accountRef, aliasList, balanceGroupRef, creationDate, effectiveDate, lastStatusComment, lastStatusChange, login, lifeCycleState, lastModified, name, password, passwordExpiration, passwordStatus, status, statusFlags, subscriptionServiceRef, serviceAccessLevel, balGrpIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceType {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pendingDeferredActionsCount: ").append(toIndentedString(pendingDeferredActionsCount)).append("\n");
    sb.append("    accountRef: ").append(toIndentedString(accountRef)).append("\n");
    sb.append("    aliasList: ").append(toIndentedString(aliasList)).append("\n");
    sb.append("    balanceGroupRef: ").append(toIndentedString(balanceGroupRef)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    lastStatusComment: ").append(toIndentedString(lastStatusComment)).append("\n");
    sb.append("    lastStatusChange: ").append(toIndentedString(lastStatusChange)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    lifeCycleState: ").append(toIndentedString(lifeCycleState)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordExpiration: ").append(toIndentedString(passwordExpiration)).append("\n");
    sb.append("    passwordStatus: ").append(toIndentedString(passwordStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusFlags: ").append(toIndentedString(statusFlags)).append("\n");
    sb.append("    subscriptionServiceRef: ").append(toIndentedString(subscriptionServiceRef)).append("\n");
    sb.append("    serviceAccessLevel: ").append(toIndentedString(serviceAccessLevel)).append("\n");
    sb.append("    balGrpIndex: ").append(toIndentedString(balGrpIndex)).append("\n");
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
