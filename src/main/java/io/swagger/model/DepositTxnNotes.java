package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The deposit transaction note
 */
@Schema(description = "The deposit transaction note")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class DepositTxnNotes   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("modifiedAt")
  private String modifiedAt = null;

  public DepositTxnNotes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The deposit transaction note ID.
   * @return id
   **/
  @Schema(required = true, description = "The deposit transaction note ID.")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DepositTxnNotes note(String note) {
    this.note = note;
    return this;
  }

  /**
   * The deposit transaction note
   * @return note
   **/
  @Schema(required = true, description = "The deposit transaction note")
      @NotNull

    public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public DepositTxnNotes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when the deposit transaction note is created.
   * @return createdAt
   **/
  @Schema(required = true, description = "The date when the deposit transaction note is created.")
      @NotNull

    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DepositTxnNotes modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date when the deposit transaction note is modified.
   * @return modifiedAt
   **/
  @Schema(required = true, description = "The date when the deposit transaction note is modified.")
      @NotNull

    public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTxnNotes depositTxnNotes = (DepositTxnNotes) o;
    return Objects.equals(this.id, depositTxnNotes.id) &&
        Objects.equals(this.note, depositTxnNotes.note) &&
        Objects.equals(this.createdAt, depositTxnNotes.createdAt) &&
        Objects.equals(this.modifiedAt, depositTxnNotes.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, note, createdAt, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTxnNotes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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
