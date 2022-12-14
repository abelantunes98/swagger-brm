package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of comments associated with the note.
 */
@Schema(description = "The list of comments associated with the note.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Comments   {
  @JsonProperty("csrLoginId")
  private String csrLoginId = null;

  @JsonProperty("csrFirstName")
  private String csrFirstName = null;

  @JsonProperty("csrLastName")
  private String csrLastName = null;

  @JsonProperty("csrAccountId")
  private String csrAccountId = null;

  @JsonProperty("externalUser")
  private String externalUser = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("trackingId")
  private String trackingId = null;

  @JsonProperty("entryDate")
  private OffsetDateTime entryDate = null;

  public Comments csrLoginId(String csrLoginId) {
    this.csrLoginId = csrLoginId;
    return this;
  }

  /**
   * The login ID associated with the CSR.
   * @return csrLoginId
   **/
  @Schema(description = "The login ID associated with the CSR.")
  
    public String getCsrLoginId() {
    return csrLoginId;
  }

  public void setCsrLoginId(String csrLoginId) {
    this.csrLoginId = csrLoginId;
  }

  public Comments csrFirstName(String csrFirstName) {
    this.csrFirstName = csrFirstName;
    return this;
  }

  /**
   * The CSR's first name.
   * @return csrFirstName
   **/
  @Schema(description = "The CSR's first name.")
  
    public String getCsrFirstName() {
    return csrFirstName;
  }

  public void setCsrFirstName(String csrFirstName) {
    this.csrFirstName = csrFirstName;
  }

  public Comments csrLastName(String csrLastName) {
    this.csrLastName = csrLastName;
    return this;
  }

  /**
   * The CSR's last name.
   * @return csrLastName
   **/
  @Schema(description = "The CSR's last name.")
  
    public String getCsrLastName() {
    return csrLastName;
  }

  public void setCsrLastName(String csrLastName) {
    this.csrLastName = csrLastName;
  }

  public Comments csrAccountId(String csrAccountId) {
    this.csrAccountId = csrAccountId;
    return this;
  }

  /**
   * The CSR's account ID.
   * @return csrAccountId
   **/
  @Schema(description = "The CSR's account ID.")
  
    public String getCsrAccountId() {
    return csrAccountId;
  }

  public void setCsrAccountId(String csrAccountId) {
    this.csrAccountId = csrAccountId;
  }

  public Comments externalUser(String externalUser) {
    this.externalUser = externalUser;
    return this;
  }

  /**
   * The external user.
   * @return externalUser
   **/
  @Schema(description = "The external user.")
  
    public String getExternalUser() {
    return externalUser;
  }

  public void setExternalUser(String externalUser) {
    this.externalUser = externalUser;
  }

  public Comments comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * The comment.
   * @return comment
   **/
  @Schema(required = true, description = "The comment.")
      @NotNull

    public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Comments trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  /**
   * The tracking ID.
   * @return trackingId
   **/
  @Schema(description = "The tracking ID.")
  
    public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public Comments entryDate(OffsetDateTime entryDate) {
    this.entryDate = entryDate;
    return this;
  }

  /**
   * The date and time the comment was entered by the CSR.
   * @return entryDate
   **/
  @Schema(description = "The date and time the comment was entered by the CSR.")
  
    @Valid
    public OffsetDateTime getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(OffsetDateTime entryDate) {
    this.entryDate = entryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comments comments = (Comments) o;
    return Objects.equals(this.csrLoginId, comments.csrLoginId) &&
        Objects.equals(this.csrFirstName, comments.csrFirstName) &&
        Objects.equals(this.csrLastName, comments.csrLastName) &&
        Objects.equals(this.csrAccountId, comments.csrAccountId) &&
        Objects.equals(this.externalUser, comments.externalUser) &&
        Objects.equals(this.comment, comments.comment) &&
        Objects.equals(this.trackingId, comments.trackingId) &&
        Objects.equals(this.entryDate, comments.entryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrLoginId, csrFirstName, csrLastName, csrAccountId, externalUser, comment, trackingId, entryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comments {\n");
    
    sb.append("    csrLoginId: ").append(toIndentedString(csrLoginId)).append("\n");
    sb.append("    csrFirstName: ").append(toIndentedString(csrFirstName)).append("\n");
    sb.append("    csrLastName: ").append(toIndentedString(csrLastName)).append("\n");
    sb.append("    csrAccountId: ").append(toIndentedString(csrAccountId)).append("\n");
    sb.append("    externalUser: ").append(toIndentedString(externalUser)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    entryDate: ").append(toIndentedString(entryDate)).append("\n");
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
