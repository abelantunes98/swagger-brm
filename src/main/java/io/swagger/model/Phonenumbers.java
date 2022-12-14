package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The list of the account&#x27;s phone numbers.
 */
@Schema(description = "The list of the account's phone numbers.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Phonenumbers   {
  @JsonProperty("number")
  private String number = null;

  @JsonProperty("phonetype")
  private Integer phonetype = null;

  public Phonenumbers number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The phone number.
   * @return number
   **/
  @Schema(required = true, description = "The phone number.")
      @NotNull

    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Phonenumbers phonetype(Integer phonetype) {
    this.phonetype = phonetype;
    return this;
  }

  /**
   * The phone number's type.
   * @return phonetype
   **/
  @Schema(description = "The phone number's type.")
  
    public Integer getPhonetype() {
    return phonetype;
  }

  public void setPhonetype(Integer phonetype) {
    this.phonetype = phonetype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phonenumbers phonenumbers = (Phonenumbers) o;
    return Objects.equals(this.number, phonenumbers.number) &&
        Objects.equals(this.phonetype, phonenumbers.phonetype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, phonetype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phonenumbers {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    phonetype: ").append(toIndentedString(phonetype)).append("\n");
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
