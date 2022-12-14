package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserIdentity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class UserIdentity   {
  @JsonProperty("principalName")
  private String principalName = null;

  @JsonProperty("loggedIn")
  private Boolean loggedIn = null;

  public UserIdentity principalName(String principalName) {
    this.principalName = principalName;
    return this;
  }

  /**
   * Get principalName
   * @return principalName
   **/
  @Schema(description = "")
  
    public String getPrincipalName() {
    return principalName;
  }

  public void setPrincipalName(String principalName) {
    this.principalName = principalName;
  }

  public UserIdentity loggedIn(Boolean loggedIn) {
    this.loggedIn = loggedIn;
    return this;
  }

  /**
   * Get loggedIn
   * @return loggedIn
   **/
  @Schema(description = "")
  
    public Boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(Boolean loggedIn) {
    this.loggedIn = loggedIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdentity userIdentity = (UserIdentity) o;
    return Objects.equals(this.principalName, userIdentity.principalName) &&
        Objects.equals(this.loggedIn, userIdentity.loggedIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalName, loggedIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdentity {\n");
    
    sb.append("    principalName: ").append(toIndentedString(principalName)).append("\n");
    sb.append("    loggedIn: ").append(toIndentedString(loggedIn)).append("\n");
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
