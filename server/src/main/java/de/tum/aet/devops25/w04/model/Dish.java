package de.tum.aet.devops25.w04.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Dish(String name, String dish_type, List<String> labels) {
}