package org.azd.core.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Reference object for a TeamProjectCollection.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamProjectCollectionReference {
    /***
     * Collection Id.
     */
    @JsonProperty("id")
    private String id;
    /***
     * Collection Name.
     */
    @JsonProperty("name")
    private String name;
    /***
     * Collection REST Url.
     */
    @JsonProperty("url")
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TeamProjectCollectionReference{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
