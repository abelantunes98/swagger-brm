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
 * AssignSuspensePaymentHandler
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AssignSuspensePaymentHandler   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("paymentEventRef")
  private ResourceRef paymentEventRef = null;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("locale")
  private String locale = null;

  public AssignSuspensePaymentHandler extension(Object extension) {
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

  public AssignSuspensePaymentHandler paymentEventRef(ResourceRef paymentEventRef) {
    this.paymentEventRef = paymentEventRef;
    return this;
  }

  /**
   * Get paymentEventRef
   * @return paymentEventRef
   **/
  @Schema(description = "")
  
    @Valid
    public ResourceRef getPaymentEventRef() {
    return paymentEventRef;
  }

  public void setPaymentEventRef(ResourceRef paymentEventRef) {
    this.paymentEventRef = paymentEventRef;
  }

  public AssignSuspensePaymentHandler userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * The user name of the suspense payment handler.
   * @return userName
   **/
  @Schema(required = true, description = "The user name of the suspense payment handler.")
      @NotNull

    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AssignSuspensePaymentHandler userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user ID of the suspense payment handler.
   * @return userId
   **/
  @Schema(description = "The user ID of the suspense payment handler.")
  
    public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public AssignSuspensePaymentHandler locale(String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The locale of the suspence payment handler, such as <b>en_US</b> or <b>fr_FR</b>. For a list of valid values, see 'Locale Names' in <i>BRM Developer's Guide</i>.
   * @return locale
   **/
  @Schema(required = true, description = "The locale of the suspence payment handler, such as <b>en_US</b> or <b>fr_FR</b>. For a list of valid values, see 'Locale Names' in <i>BRM Developer's Guide</i>.")
      @NotNull

    public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignSuspensePaymentHandler assignSuspensePaymentHandler = (AssignSuspensePaymentHandler) o;
    return Objects.equals(this.extension, assignSuspensePaymentHandler.extension) &&
        Objects.equals(this.paymentEventRef, assignSuspensePaymentHandler.paymentEventRef) &&
        Objects.equals(this.userName, assignSuspensePaymentHandler.userName) &&
        Objects.equals(this.userId, assignSuspensePaymentHandler.userId) &&
        Objects.equals(this.locale, assignSuspensePaymentHandler.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, paymentEventRef, userName, userId, locale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignSuspensePaymentHandler {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    paymentEventRef: ").append(toIndentedString(paymentEventRef)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
