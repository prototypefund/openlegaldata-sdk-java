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
import io.swagger.client.model.CaseMarker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-18T15:11:46.584Z")
public class InlineResponse2002 {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("next")
  private String next = null;

  @SerializedName("previous")
  private String previous = null;

  @SerializedName("results")
  private List<CaseMarker> results = new ArrayList<CaseMarker>();

  public InlineResponse2002 count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public InlineResponse2002 next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public InlineResponse2002 previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(value = "")
  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public InlineResponse2002 results(List<CaseMarker> results) {
    this.results = results;
    return this;
  }

  public InlineResponse2002 addResultsItem(CaseMarker resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CaseMarker> getResults() {
    return results;
  }

  public void setResults(List<CaseMarker> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.count, inlineResponse2002.count) &&
        Objects.equals(this.next, inlineResponse2002.next) &&
        Objects.equals(this.previous, inlineResponse2002.previous) &&
        Objects.equals(this.results, inlineResponse2002.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, next, previous, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

