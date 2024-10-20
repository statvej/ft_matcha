package com.matcha.backend.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matcha.backend.entity.enums.InterestEnum;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.io.IOException;
import java.util.List;

@Converter
public class InterestEnumJsonConverter implements AttributeConverter<List<InterestEnum>, String> {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public String convertToDatabaseColumn(List<InterestEnum> attribute) {
    try {
      return objectMapper.writeValueAsString(attribute);
    } catch (JsonProcessingException e) {
      throw new RuntimeException("Failed to convert list of interests to JSON", e);
    }
  }

  @Override
  public List<InterestEnum> convertToEntityAttribute(String dbData) {
    try {
      return objectMapper.readValue(dbData, objectMapper.getTypeFactory().constructCollectionType(List.class, InterestEnum.class));
    } catch (IOException e) {
      throw new RuntimeException("Failed to convert JSON to list of interests", e);
    }
  }
}
