package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Comments;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notes associated with the object.
 */
@Schema(description = "Notes associated with the object.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Notes   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("billUnitId")
  private String billUnitId = null;

  @JsonProperty("billId")
  private String billId = null;

  @JsonProperty("closedDate")
  private OffsetDateTime closedDate = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("effectiveDate")
  private OffsetDateTime effectiveDate = null;

  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("header")
  private String header = null;

  @JsonProperty("itemId")
  private String itemId = null;

  @JsonProperty("subType")
  private Integer subType = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("domainId")
  private Integer domainId = null;

  @JsonProperty("reasonId")
  private Integer reasonId = null;

  @JsonProperty("serviceId")
  private String serviceId = null;

  @JsonProperty("status")
  private BigDecimal status = null;

  @JsonProperty("comments")
  @Valid
  private List<Comments> comments = null;

  public Notes extension(Object extension) {
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

  public Notes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID.
   * @return id
   **/
  @Schema(description = "The ID.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Notes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The ID of the account associated with the note.
   * @return accountId
   **/
  @Schema(required = true, description = "The ID of the account associated with the note.")
      @NotNull

    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Notes amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount associated with the note. It can be a payment amount, adjustment amount, or so on.
   * @return amount
   **/
  @Schema(description = "The amount associated with the note. It can be a payment amount, adjustment amount, or so on.")
  
    @Valid
    public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Notes billUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
    return this;
  }

  /**
   * The ID of the bill unit associated with the note.
   * @return billUnitId
   **/
  @Schema(description = "The ID of the bill unit associated with the note.")
  
    public String getBillUnitId() {
    return billUnitId;
  }

  public void setBillUnitId(String billUnitId) {
    this.billUnitId = billUnitId;
  }

  public Notes billId(String billId) {
    this.billId = billId;
    return this;
  }

  /**
   * The ID of the bill associated with the note.
   * @return billId
   **/
  @Schema(description = "The ID of the bill associated with the note.")
  
    public String getBillId() {
    return billId;
  }

  public void setBillId(String billId) {
    this.billId = billId;
  }

  public Notes closedDate(OffsetDateTime closedDate) {
    this.closedDate = closedDate;
    return this;
  }

  /**
   * The date and time the note was resolved.
   * @return closedDate
   **/
  @Schema(description = "The date and time the note was resolved.")
  
    @Valid
    public OffsetDateTime getClosedDate() {
    return closedDate;
  }

  public void setClosedDate(OffsetDateTime closedDate) {
    this.closedDate = closedDate;
  }

  public Notes count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of comments associated with the note.
   * @return count
   **/
  @Schema(description = "The number of comments associated with the note.")
  
    public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Notes effectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date and time the comment was posted.
   * @return effectiveDate
   **/
  @Schema(description = "The date and time the comment was posted.")
  
    @Valid
    public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public Notes eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The ID of the event associated with the note.
   * @return eventId
   **/
  @Schema(description = "The ID of the event associated with the note.")
  
    public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Notes header(String header) {
    this.header = header;
    return this;
  }

  /**
   * The header associated with the note.
   * @return header
   **/
  @Schema(description = "The header associated with the note.")
  
    public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public Notes itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the item associated with the note.
   * @return itemId
   **/
  @Schema(description = "The ID of the item associated with the note.")
  
    public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public Notes subType(Integer subType) {
    this.subType = subType;
    return this;
  }

  /**
   * The note's subtype. Possible values are stored in the <b>/config/note_type</b> object. See <a href=http://docs.oracle.com/pls/topic/lookup?ctx=brm120&id=GUID-D733989B-5B0E-4643-B70A-77B62A73314D>Localizing and Customizing Strings</a> in <i>BRM Developer's Guide</i> for information about how to customize these values using the <b>note.</b><i>locale</i> file.
   * @return subType
   **/
  @Schema(description = "The note's subtype. Possible values are stored in the <b>/config/note_type</b> object. See <a href=http://docs.oracle.com/pls/topic/lookup?ctx=brm120&id=GUID-D733989B-5B0E-4643-B70A-77B62A73314D>Localizing and Customizing Strings</a> in <i>BRM Developer's Guide</i> for information about how to customize these values using the <b>note.</b><i>locale</i> file.")
  
    public Integer getSubType() {
    return subType;
  }

  public void setSubType(Integer subType) {
    this.subType = subType;
  }

  public Notes type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * The note's type. Possible values are stored in the <b>/config/note_type</b> object. See <a href=http://docs.oracle.com/pls/topic/lookup?ctx=brm120&id=GUID-D733989B-5B0E-4643-B70A-77B62A73314D>Localizing and Customizing Strings</a> in <i>BRM Developer's Guide</i> for information about how to customize these values using the <b>note.</b><i>locale</i> file.
   * @return type
   **/
  @Schema(description = "The note's type. Possible values are stored in the <b>/config/note_type</b> object. See <a href=http://docs.oracle.com/pls/topic/lookup?ctx=brm120&id=GUID-D733989B-5B0E-4643-B70A-77B62A73314D>Localizing and Customizing Strings</a> in <i>BRM Developer's Guide</i> for information about how to customize these values using the <b>note.</b><i>locale</i> file.")
  
    public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Notes domainId(Integer domainId) {
    this.domainId = domainId;
    return this;
  }

  /**
   * The domain ID associated with the note.
   * @return domainId
   **/
  @Schema(description = "The domain ID associated with the note.")
  
    public Integer getDomainId() {
    return domainId;
  }

  public void setDomainId(Integer domainId) {
    this.domainId = domainId;
  }

  public Notes reasonId(Integer reasonId) {
    this.reasonId = reasonId;
    return this;
  }

  /**
   * The reason ID associated with the note. Possible values are stored in <b>/config/reason_code_scope</b> objects. See <a href=http://docs.oracle.com/pls/topic/lookup?ctx=brm120&id=GUID-D733989B-5B0E-4643-B70A-77B62A73314D>Localizing and Customizing Strings</a> in <i>BRM Developer's Guide</i> for information about how to customize these values using the <b>reasons.</b><i>locale</i> file.
   * @return reasonId
   **/
  @Schema(description = "The reason ID associated with the note. Possible values are stored in <b>/config/reason_code_scope</b> objects. See <a href=http://docs.oracle.com/pls/topic/lookup?ctx=brm120&id=GUID-D733989B-5B0E-4643-B70A-77B62A73314D>Localizing and Customizing Strings</a> in <i>BRM Developer's Guide</i> for information about how to customize these values using the <b>reasons.</b><i>locale</i> file.")
  
    public Integer getReasonId() {
    return reasonId;
  }

  public void setReasonId(Integer reasonId) {
    this.reasonId = reasonId;
  }

  public Notes serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * The service ID associated with the note.
   * @return serviceId
   **/
  @Schema(description = "The service ID associated with the note.")
  
    public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public Notes status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * The note's status&colon; not set (<b>100</b>), resolved (<b>101</b>), or unresolved (<b>102</b>). The default value is <b>102</b>.
   * @return status
   **/
  @Schema(description = "The note's status&colon; not set (<b>100</b>), resolved (<b>101</b>), or unresolved (<b>102</b>). The default value is <b>102</b>.")
  
    @Valid
    public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public Notes comments(List<Comments> comments) {
    this.comments = comments;
    return this;
  }

  public Notes addCommentsItem(Comments commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comments>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * The list of comments associated with the note.
   * @return comments
   **/
  @Schema(description = "The list of comments associated with the note.")
      @Valid
    public List<Comments> getComments() {
    return comments;
  }

  public void setComments(List<Comments> comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notes notes = (Notes) o;
    return Objects.equals(this.extension, notes.extension) &&
        Objects.equals(this.id, notes.id) &&
        Objects.equals(this.accountId, notes.accountId) &&
        Objects.equals(this.amount, notes.amount) &&
        Objects.equals(this.billUnitId, notes.billUnitId) &&
        Objects.equals(this.billId, notes.billId) &&
        Objects.equals(this.closedDate, notes.closedDate) &&
        Objects.equals(this.count, notes.count) &&
        Objects.equals(this.effectiveDate, notes.effectiveDate) &&
        Objects.equals(this.eventId, notes.eventId) &&
        Objects.equals(this.header, notes.header) &&
        Objects.equals(this.itemId, notes.itemId) &&
        Objects.equals(this.subType, notes.subType) &&
        Objects.equals(this.type, notes.type) &&
        Objects.equals(this.domainId, notes.domainId) &&
        Objects.equals(this.reasonId, notes.reasonId) &&
        Objects.equals(this.serviceId, notes.serviceId) &&
        Objects.equals(this.status, notes.status) &&
        Objects.equals(this.comments, notes.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, id, accountId, amount, billUnitId, billId, closedDate, count, effectiveDate, eventId, header, itemId, subType, type, domainId, reasonId, serviceId, status, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notes {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billUnitId: ").append(toIndentedString(billUnitId)).append("\n");
    sb.append("    billId: ").append(toIndentedString(billId)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    reasonId: ").append(toIndentedString(reasonId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
