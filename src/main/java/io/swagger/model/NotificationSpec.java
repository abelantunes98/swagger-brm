package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.NotificationCriteria;
import io.swagger.model.NotificationDeliveryMethod;
import io.swagger.model.NotificationDeliverySchedule;
import io.swagger.model.NotificationDeliverySpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A notification specification.
 */
@Schema(description = "A notification specification.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class NotificationSpec   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("modifiedAt")
  private String modifiedAt = null;

  @JsonProperty("startsAt")
  private String startsAt = null;

  @JsonProperty("expiresAt")
  private String expiresAt = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("descr")
  private String descr = null;

  /**
   * The notification specification status.
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("systemEvent")
  private String systemEvent = null;

  /**
   * The notification type.
   */
  public enum TypeEnum {
    ADVANCE("ADVANCE"),
    
    REALTIME("REALTIME"),
    
    POSTEVENT("POSTEVENT"),
    
    ALL("ALL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * The notification trigger type.
   */
  public enum TriggerTypeEnum {
    SYSTEM("SYSTEM"),
    
    AUTO("AUTO"),
    
    ALL("ALL");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TriggerTypeEnum fromValue(String text) {
      for (TriggerTypeEnum b : TriggerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("triggerType")
  private TriggerTypeEnum triggerType = null;

  /**
   * The notification scope.
   */
  public enum ScopeEnum {
    USER("USER"),
    
    SYSTEM("SYSTEM");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("scope")
  private ScopeEnum scope = null;

  /**
   * The notification control flag type.
   */
  public enum DeliveryControlFlagEnum {
    NO_DELIVERY_IN_SILENT_PERIOD("NO_DELIVERY_IN_SILENT_PERIOD"),
    
    NO_DELIVERY_IN_HOLIDAYS("NO_DELIVERY_IN_HOLIDAYS"),
    
    ALWAYS_DELIVER("ALWAYS_DELIVER");

    private String value;

    DeliveryControlFlagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliveryControlFlagEnum fromValue(String text) {
      for (DeliveryControlFlagEnum b : DeliveryControlFlagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("deliveryControlFlag")
  private DeliveryControlFlagEnum deliveryControlFlag = null;

  @JsonProperty("criteria")
  private NotificationCriteria criteria = null;

  @JsonProperty("deliveryMethods")
  @Valid
  private List<NotificationDeliveryMethod> deliveryMethods = new ArrayList<NotificationDeliveryMethod>();

  @JsonProperty("deliverySpec")
  private NotificationDeliverySpec deliverySpec = null;

  @JsonProperty("advanceNotifications")
  @Valid
  private List<NotificationDeliverySchedule> advanceNotifications = null;

  public NotificationSpec id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The notification specification ID.
   * @return id
   **/
  @Schema(description = "The notification specification ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NotificationSpec href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The unique resource URL, used to get the notification specification object.
   * @return href
   **/
  @Schema(description = "The unique resource URL, used to get the notification specification object.")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public NotificationSpec createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the notification specification is created.
   * @return createdAt
   **/
  @Schema(description = "The date when the notification specification is created.")
  
    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public NotificationSpec modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date when the notification specification is modified.
   * @return modifiedAt
   **/
  @Schema(description = "The date when the notification specification is modified.")
  
    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public NotificationSpec startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * The start date of the notification specification.
   * @return startsAt
   **/
  @Schema(description = "The start date of the notification specification.")
  
    public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public NotificationSpec expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * The expiry date of the notification specification.
   * @return expiresAt
   **/
  @Schema(description = "The expiry date of the notification specification.")
  
    public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public NotificationSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The notification specification name.
   * @return name
   **/
  @Schema(required = true, description = "The notification specification name.")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationSpec descr(String descr) {
    this.descr = descr;
    return this;
  }

  /**
   * The notification specification description.
   * @return descr
   **/
  @Schema(description = "The notification specification description.")
  
    public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public NotificationSpec status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The notification specification status.
   * @return status
   **/
  @Schema(description = "The notification specification status.")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public NotificationSpec category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Free text. Use this field for classification.
   * @return category
   **/
  @Schema(description = "Free text. Use this field for classification.")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public NotificationSpec systemEvent(String systemEvent) {
    this.systemEvent = systemEvent;
    return this;
  }

  /**
   * The notification event POID type.
   * @return systemEvent
   **/
  @Schema(required = true, description = "The notification event POID type.")
      @NotNull

    public String getSystemEvent() {
    return systemEvent;
  }

  public void setSystemEvent(String systemEvent) {
    this.systemEvent = systemEvent;
  }

  public NotificationSpec type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The notification type.
   * @return type
   **/
  @Schema(description = "The notification type.")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NotificationSpec triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  /**
   * The notification trigger type.
   * @return triggerType
   **/
  @Schema(description = "The notification trigger type.")
  
    public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }

  public NotificationSpec scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The notification scope.
   * @return scope
   **/
  @Schema(description = "The notification scope.")
  
    public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public NotificationSpec deliveryControlFlag(DeliveryControlFlagEnum deliveryControlFlag) {
    this.deliveryControlFlag = deliveryControlFlag;
    return this;
  }

  /**
   * The notification control flag type.
   * @return deliveryControlFlag
   **/
  @Schema(description = "The notification control flag type.")
  
    public DeliveryControlFlagEnum getDeliveryControlFlag() {
    return deliveryControlFlag;
  }

  public void setDeliveryControlFlag(DeliveryControlFlagEnum deliveryControlFlag) {
    this.deliveryControlFlag = deliveryControlFlag;
  }

  public NotificationSpec criteria(NotificationCriteria criteria) {
    this.criteria = criteria;
    return this;
  }

  /**
   * Get criteria
   * @return criteria
   **/
  @Schema(description = "")
  
    @Valid
    public NotificationCriteria getCriteria() {
    return criteria;
  }

  public void setCriteria(NotificationCriteria criteria) {
    this.criteria = criteria;
  }

  public NotificationSpec deliveryMethods(List<NotificationDeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
    return this;
  }

  public NotificationSpec addDeliveryMethodsItem(NotificationDeliveryMethod deliveryMethodsItem) {
    this.deliveryMethods.add(deliveryMethodsItem);
    return this;
  }

  /**
   * The notification delivery method.
   * @return deliveryMethods
   **/
  @Schema(required = true, description = "The notification delivery method.")
      @NotNull
    @Valid
    public List<NotificationDeliveryMethod> getDeliveryMethods() {
    return deliveryMethods;
  }

  public void setDeliveryMethods(List<NotificationDeliveryMethod> deliveryMethods) {
    this.deliveryMethods = deliveryMethods;
  }

  public NotificationSpec deliverySpec(NotificationDeliverySpec deliverySpec) {
    this.deliverySpec = deliverySpec;
    return this;
  }

  /**
   * Get deliverySpec
   * @return deliverySpec
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public NotificationDeliverySpec getDeliverySpec() {
    return deliverySpec;
  }

  public void setDeliverySpec(NotificationDeliverySpec deliverySpec) {
    this.deliverySpec = deliverySpec;
  }

  public NotificationSpec advanceNotifications(List<NotificationDeliverySchedule> advanceNotifications) {
    this.advanceNotifications = advanceNotifications;
    return this;
  }

  public NotificationSpec addAdvanceNotificationsItem(NotificationDeliverySchedule advanceNotificationsItem) {
    if (this.advanceNotifications == null) {
      this.advanceNotifications = new ArrayList<NotificationDeliverySchedule>();
    }
    this.advanceNotifications.add(advanceNotificationsItem);
    return this;
  }

  /**
   * The list of notification delivery schedules.
   * @return advanceNotifications
   **/
  @Schema(description = "The list of notification delivery schedules.")
      @Valid
    public List<NotificationDeliverySchedule> getAdvanceNotifications() {
    return advanceNotifications;
  }

  public void setAdvanceNotifications(List<NotificationDeliverySchedule> advanceNotifications) {
    this.advanceNotifications = advanceNotifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSpec notificationSpec = (NotificationSpec) o;
    return Objects.equals(this.id, notificationSpec.id) &&
        Objects.equals(this.href, notificationSpec.href) &&
        Objects.equals(this.createdAt, notificationSpec.createdAt) &&
        Objects.equals(this.modifiedAt, notificationSpec.modifiedAt) &&
        Objects.equals(this.startsAt, notificationSpec.startsAt) &&
        Objects.equals(this.expiresAt, notificationSpec.expiresAt) &&
        Objects.equals(this.name, notificationSpec.name) &&
        Objects.equals(this.descr, notificationSpec.descr) &&
        Objects.equals(this.status, notificationSpec.status) &&
        Objects.equals(this.category, notificationSpec.category) &&
        Objects.equals(this.systemEvent, notificationSpec.systemEvent) &&
        Objects.equals(this.type, notificationSpec.type) &&
        Objects.equals(this.triggerType, notificationSpec.triggerType) &&
        Objects.equals(this.scope, notificationSpec.scope) &&
        Objects.equals(this.deliveryControlFlag, notificationSpec.deliveryControlFlag) &&
        Objects.equals(this.criteria, notificationSpec.criteria) &&
        Objects.equals(this.deliveryMethods, notificationSpec.deliveryMethods) &&
        Objects.equals(this.deliverySpec, notificationSpec.deliverySpec) &&
        Objects.equals(this.advanceNotifications, notificationSpec.advanceNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, createdAt, modifiedAt, startsAt, expiresAt, name, descr, status, category, systemEvent, type, triggerType, scope, deliveryControlFlag, criteria, deliveryMethods, deliverySpec, advanceNotifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSpec {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    systemEvent: ").append(toIndentedString(systemEvent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    deliveryControlFlag: ").append(toIndentedString(deliveryControlFlag)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    deliveryMethods: ").append(toIndentedString(deliveryMethods)).append("\n");
    sb.append("    deliverySpec: ").append(toIndentedString(deliverySpec)).append("\n");
    sb.append("    advanceNotifications: ").append(toIndentedString(advanceNotifications)).append("\n");
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
