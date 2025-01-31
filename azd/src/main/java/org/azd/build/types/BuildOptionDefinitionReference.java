package org.azd.build.types;
/**
 * ----------------------------------------------------------
 * GENERATED FILE, should be edited to suit the purpose.
 * ----------------------------------------------------------
 **/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The reason that the build was created. 
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildOptionDefinitionReference {
    /**
     * The ID of the referenced build option.
     **/
    @JsonProperty("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BuildOptionDefinitionReference{" +
                "id='" + id + '\'' +
                '}';
    }
}