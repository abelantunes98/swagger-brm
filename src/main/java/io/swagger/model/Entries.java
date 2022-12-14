package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Cells;
import io.swagger.model.NonCurrencyCells;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Entries
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-14T12:38:42.664Z[GMT]")


public class Entries   {
  @JsonProperty("recordId")
  private String recordId = null;

  @JsonProperty("cells")
  @Valid
  private List<Cells> cells = null;

  @JsonProperty("nonCurrencyCells")
  @Valid
  private List<NonCurrencyCells> nonCurrencyCells = null;

  public Entries recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * Get recordId
   * @return recordId
   **/
  @Schema(description = "")
  
    public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public Entries cells(List<Cells> cells) {
    this.cells = cells;
    return this;
  }

  public Entries addCellsItem(Cells cellsItem) {
    if (this.cells == null) {
      this.cells = new ArrayList<Cells>();
    }
    this.cells.add(cellsItem);
    return this;
  }

  /**
   * Get cells
   * @return cells
   **/
  @Schema(description = "")
      @Valid
    public List<Cells> getCells() {
    return cells;
  }

  public void setCells(List<Cells> cells) {
    this.cells = cells;
  }

  public Entries nonCurrencyCells(List<NonCurrencyCells> nonCurrencyCells) {
    this.nonCurrencyCells = nonCurrencyCells;
    return this;
  }

  public Entries addNonCurrencyCellsItem(NonCurrencyCells nonCurrencyCellsItem) {
    if (this.nonCurrencyCells == null) {
      this.nonCurrencyCells = new ArrayList<NonCurrencyCells>();
    }
    this.nonCurrencyCells.add(nonCurrencyCellsItem);
    return this;
  }

  /**
   * Get nonCurrencyCells
   * @return nonCurrencyCells
   **/
  @Schema(description = "")
      @Valid
    public List<NonCurrencyCells> getNonCurrencyCells() {
    return nonCurrencyCells;
  }

  public void setNonCurrencyCells(List<NonCurrencyCells> nonCurrencyCells) {
    this.nonCurrencyCells = nonCurrencyCells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entries entries = (Entries) o;
    return Objects.equals(this.recordId, entries.recordId) &&
        Objects.equals(this.cells, entries.cells) &&
        Objects.equals(this.nonCurrencyCells, entries.nonCurrencyCells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, cells, nonCurrencyCells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entries {\n");
    
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    nonCurrencyCells: ").append(toIndentedString(nonCurrencyCells)).append("\n");
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
