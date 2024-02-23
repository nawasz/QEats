
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.crio.qeats.exchanges.GetRestaurantsResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

// TODO: CRIO_TASK_MODULE_SERIALIZATION - Pass tests in RestaurantTest.
class RestaurantTest {

  @Test
  public void serializeAndDeserializeRestaurantJson() throws IOException, JSONException {
    final String jsonString =
        "{\n"
            + "  \"restaurantId\": \"10\",\n"
            + "  \"name\": \"A2B\",\n"
            + "  \"city\": \"Hsr Layout\",\n"
            + "  \"imageUrl\": \"www.google.com\",\n"
            + "  \"latitude\": 20.027,\n"
            + "  \"longitude\": 30.0,\n"
            + "  \"opensAt\": \"18:00\",\n"
            + "  \"closesAt\": \"23:00\",\n"
            + "  \"attributes\": [\n"
            + "    \"Tamil\",\n"
            + "    \"South Indian\"\n"
            + "  ]\n"
            + "}";
    
    // Setting up a restaurant object for testing. The following ensures that restaurant
    // object can deserialize the right restaurant json.
    Restaurant restaurant = new Restaurant();
    restaurant = new ObjectMapper().readValue(jsonString, Restaurant.class);

    // Deserialize the Json string from Restaurant class to ensure its done cleanly.
    String actualJsonString = "";
    actualJsonString = new ObjectMapper().writeValueAsString(restaurant);
    JSONAssert.assertEquals(jsonString, actualJsonString, true);
  }

  @Test
  public void Deserialize12() throws IOException{
    final  String jsonString = "{\n" +
    "  \"restaurants\": [\n" +
    "    {\n" +
    "      \"restaurantId\": \"10\",\n" +
    "      \"name\": \"A2B\",\n" +
    "      \"city\": \"Hsr Layout\",\n" +
    "      \"imageUrl\": \"www.google.com\",\n" +
    "      \"latitude\": 20.027,\n" +
    "      \"longitude\": 30.0,\n" +
    "      \"opensAt\": \"18:00\",\n" +
    "      \"closesAt\": \"23:00\",\n" +
    "      \"attributes\": [\n" +
    "        \"Tamil\",\n" +
    "        \"South Indian\"\n" +
    "      ]\n" +
    "    },\n" +
    "    {\n" +
    "      \"restaurantId\": \"11\",\n" +
    "      \"name\": \"Shanti Sagar\",\n" +
    "      \"city\": \"Btm Layout\",\n" +
    "      \"imageUrl\": \"www.google.com\",\n" +
    "      \"latitude\": 20.0269,\n" +
    "      \"longitude\": 30.00,\n" +
    "      \"opensAt\": \"18:00\",\n" +
    "      \"closesAt\": \"23:00\",\n" +
    "      \"attributes\": [\n" +
    "        \"Udupi\",\n" +
    "        \"South Indian\"\n" +
    "      ]\n" +
    "    }\n" +
    "  ]\n" +
    "}";
    GetRestaurantsResponse ans = new ObjectMapper().readValue(jsonString,GetRestaurantsResponse.class);
    System.out.println(ans);
  // json to java Object 
  // java Object to json 
  GetRestaurantsResponse  GetRestaurantsResponse =  new GetRestaurantsResponse();
        
    String actualString=  new ObjectMapper().writeValueAsString(GetRestaurantsResponse);
    System.out.println(actualString);}
}
