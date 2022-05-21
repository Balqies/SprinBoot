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

/**
 * The result of the sendForgotPasswordCode operation includes the destination of the notification and the delivery medium 
 */
@ApiModel(description = "The result of the sendForgotPasswordCode operation includes the destination of the notification and the delivery medium ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-06T14:03:51.433+01:00")
public class SendForgotPasswordCodeResult {
  @JsonProperty("destination")
  private String destination = null;

  @JsonProperty("deliveryMedium")
  private String deliveryMedium = null;

  public SendForgotPasswordCodeResult destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * The destination for the code delivery details.
   * @return destination
  **/
  @ApiModelProperty(value = "The destination for the code delivery details.")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public SendForgotPasswordCodeResult deliveryMedium(String deliveryMedium) {
    this.deliveryMedium = deliveryMedium;
    return this;
  }

   /**
   * The delivery medium (email message or phone number). Possible values: SMS | EMAIL 
   * @return deliveryMedium
  **/
  @ApiModelProperty(value = "The delivery medium (email message or phone number). Possible values: SMS | EMAIL ")
  public String getDeliveryMedium() {
    return deliveryMedium;
  }

  public void setDeliveryMedium(String deliveryMedium) {
    this.deliveryMedium = deliveryMedium;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendForgotPasswordCodeResult sendForgotPasswordCodeResult = (SendForgotPasswordCodeResult) o;
    return Objects.equals(this.destination, sendForgotPasswordCodeResult.destination) &&
        Objects.equals(this.deliveryMedium, sendForgotPasswordCodeResult.deliveryMedium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, deliveryMedium);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendForgotPasswordCodeResult {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    deliveryMedium: ").append(toIndentedString(deliveryMedium)).append("\n");
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

