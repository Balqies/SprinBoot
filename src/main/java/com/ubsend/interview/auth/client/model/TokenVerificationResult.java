/*
 * Monty Authentication API
 * Authentication service for the Monty API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@sendasyou.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ubsend.interview.auth.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * The result of the token verification includes basic properties such as the username and the claims.
 */
@ApiModel(description = "The result of the token verification includes basic properties such as the username and the claims.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T14:03:51.433+01:00")
public class TokenVerificationResult {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("claims")
  private List<Claim> claims = null;

  public TokenVerificationResult username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the user
   * @return username
  **/
  @ApiModelProperty(value = "The username of the user")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public TokenVerificationResult claims(List<Claim> claims) {
    this.claims = claims;
    return this;
  }

  public TokenVerificationResult addClaimsItem(Claim claimsItem) {
    if (this.claims == null) {
      this.claims = new ArrayList<Claim>();
    }
    this.claims.add(claimsItem);
    return this;
  }

   /**
   * The clients that the user is a member of
   * @return claims
  **/
  @ApiModelProperty(value = "The clients that the user is a member of")
  public List<Claim> getClaims() {
    return claims;
  }

  public void setClaims(List<Claim> claims) {
    this.claims = claims;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenVerificationResult tokenVerificationResult = (TokenVerificationResult) o;
    return Objects.equals(this.username, tokenVerificationResult.username) &&
        Objects.equals(this.claims, tokenVerificationResult.claims);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, claims);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenVerificationResult {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

