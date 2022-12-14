package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PurchasedBundle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of bundles purchased by the account.
 */
@Schema(description = "A list of bundles purchased by the account.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class AccountGroup   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("lastStatusChange")
  private OffsetDateTime lastStatusChange = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("bundles")
  @Valid
  private List<PurchasedBundle> bundles = null;

  public AccountGroup extension(Object extension) {
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

  public AccountGroup lastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
    return this;
  }

  /**
   * The date and time the account group's status was last modified.
   * @return lastStatusChange
   **/
  @Schema(description = "The date and time the account group's status was last modified.")
  
    @Valid
    public OffsetDateTime getLastStatusChange() {
    return lastStatusChange;
  }

  public void setLastStatusChange(OffsetDateTime lastStatusChange) {
    this.lastStatusChange = lastStatusChange;
  }

  public AccountGroup status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * The account group's status.
   * @return status
   **/
  @Schema(description = "The account group's status.")
  
    public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public AccountGroup bundles(List<PurchasedBundle> bundles) {
    this.bundles = bundles;
    return this;
  }

  public AccountGroup addBundlesItem(PurchasedBundle bundlesItem) {
    if (this.bundles == null) {
      this.bundles = new ArrayList<PurchasedBundle>();
    }
    this.bundles.add(bundlesItem);
    return this;
  }

  /**
   * A list of bundles associated with the account group.
   * @return bundles
   **/
  @Schema(description = "A list of bundles associated with the account group.")
      @Valid
    public List<PurchasedBundle> getBundles() {
    return bundles;
  }

  public void setBundles(List<PurchasedBundle> bundles) {
    this.bundles = bundles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGroup accountGroup = (AccountGroup) o;
    return Objects.equals(this.extension, accountGroup.extension) &&
        Objects.equals(this.lastStatusChange, accountGroup.lastStatusChange) &&
        Objects.equals(this.status, accountGroup.status) &&
        Objects.equals(this.bundles, accountGroup.bundles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, lastStatusChange, status, bundles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGroup {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    lastStatusChange: ").append(toIndentedString(lastStatusChange)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bundles: ").append(toIndentedString(bundles)).append("\n");
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
