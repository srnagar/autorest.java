package com.azure.ai.formrecognizer.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DataTable model.
 */
@Fluent
public final class DataTable {
    /*
     * Number of rows.
     */
    @JsonProperty(value = "rows", required = true)
    private int rows;

    /*
     * Number of columns.
     */
    @JsonProperty(value = "columns", required = true)
    private int columns;

    /*
     * List of cells contained in the table.
     */
    @JsonProperty(value = "cells", required = true)
    private List<DataTableCell> cells;

    /**
     * Get the rows property: Number of rows.
     * 
     * @return the rows value.
     */
    public int getRows() {
        return this.rows;
    }

    /**
     * Set the rows property: Number of rows.
     * 
     * @param rows the rows value to set.
     * @return the DataTable object itself.
     */
    public DataTable setRows(int rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Get the columns property: Number of columns.
     * 
     * @return the columns value.
     */
    public int getColumns() {
        return this.columns;
    }

    /**
     * Set the columns property: Number of columns.
     * 
     * @param columns the columns value to set.
     * @return the DataTable object itself.
     */
    public DataTable setColumns(int columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the cells property: List of cells contained in the table.
     * 
     * @return the cells value.
     */
    public List<DataTableCell> getCells() {
        return this.cells;
    }

    /**
     * Set the cells property: List of cells contained in the table.
     * 
     * @param cells the cells value to set.
     * @return the DataTable object itself.
     */
    public DataTable setCells(List<DataTableCell> cells) {
        this.cells = cells;
        return this;
    }

    public void validate() {
        if (getCells() == null) {
            throw new IllegalArgumentException("Missing required property cells in model DataTable");
        } else {
            getCells().forEach(e -> e.validate());
        }
    }
}
