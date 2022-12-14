package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Fields;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The fields for the profile.
 */
@Schema(description = "The fields for the profile.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class ProfileFields   {
  @JsonProperty("extension")
  private Object extension = null;

  @JsonProperty("storableClass")
  private String storableClass = null;

  @JsonProperty("fields")
  @Valid
  private List<Fields> fields = new ArrayList<Fields>();

  public ProfileFields extension(Object extension) {
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

  public ProfileFields storableClass(String storableClass) {
    this.storableClass = storableClass;
    return this;
  }

  /**
   * The storable class associated with the profile field.
   * @return storableClass
   **/
  @Schema(required = true, description = "The storable class associated with the profile field.")
      @NotNull

    public String getStorableClass() {
    return storableClass;
  }

  public void setStorableClass(String storableClass) {
    this.storableClass = storableClass;
  }

  public ProfileFields fields(List<Fields> fields) {
    this.fields = fields;
    return this;
  }

  public ProfileFields addFieldsItem(Fields fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * The list of profile fields.
   * @return fields
   **/
  @Schema(required = true, description = "The list of profile fields.")
      @NotNull
    @Valid
    public List<Fields> getFields() {
    return fields;
  }

  public void setFields(List<Fields> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileFields profileFields = (ProfileFields) o;
    return Objects.equals(this.extension, profileFields.extension) &&
        Objects.equals(this.storableClass, profileFields.storableClass) &&
        Objects.equals(this.fields, profileFields.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extension, storableClass, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileFields {\n");
    
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    storableClass: ").append(toIndentedString(storableClass)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
