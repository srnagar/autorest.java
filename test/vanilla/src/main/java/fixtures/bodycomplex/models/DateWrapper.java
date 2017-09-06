/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import org.joda.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DateWrapper model.
 */
public class DateWrapper {
    /**
     * The field property.
     */
    @JsonProperty(value = "field")
    private LocalDate field;

    /**
     * The leap property.
     */
    @JsonProperty(value = "leap")
    private LocalDate leap;

    /**
     * Get the field value.
     *
     * @return the field value
     */
    public LocalDate field() {
        return this.field;
    }

    /**
     * Set the field value.
     *
     * @param field the field value to set
     * @return the DateWrapper object itself.
     */
    public DateWrapper withField(LocalDate field) {
        this.field = field;
        return this;
    }

    /**
     * Get the leap value.
     *
     * @return the leap value
     */
    public LocalDate leap() {
        return this.leap;
    }

    /**
     * Set the leap value.
     *
     * @param leap the leap value to set
     * @return the DateWrapper object itself.
     */
    public DateWrapper withLeap(LocalDate leap) {
        this.leap = leap;
        return this;
    }

}