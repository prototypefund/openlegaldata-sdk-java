/*
 * Open Legal Data API
 * With the Open Legal Data API you can access various data from the legal domain, e.g. law text or case files. The data may be used for semantic analysis or to create statistics. For more information visit our website. https://openlegaldata.io/
 *
 * OpenAPI spec version: v1
 * Contact: hello@openlegaldata.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * State
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-18T15:11:46.584Z")
public class State {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("country")
  private Integer country = null;

  @SerializedName("slug")
  private String slug = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public State name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public State country(Integer country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCountry() {
    return country;
  }

  public void setCountry(Integer country) {
    this.country = country;
  }

  public State slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Name field as slug
   * @return slug
  **/
  @ApiModelProperty(required = true, value = "Name field as slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    State state = (State) o;
    return Objects.equals(this.id, state.id) &&
        Objects.equals(this.name, state.name) &&
        Objects.equals(this.country, state.country) &&
        Objects.equals(this.slug, state.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, country, slug);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class State {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
