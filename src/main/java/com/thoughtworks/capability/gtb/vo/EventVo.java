package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.thoughtworks.capability.gtb.serializer.EventTypeDeserializer;
import com.thoughtworks.capability.gtb.serializer.EventTypeSerializer;
import com.thoughtworks.capability.gtb.serializer.MyDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventVo {

  private String id;
  private String name;
  @JsonSerialize(using = EventTypeSerializer.class)
  @JsonDeserialize(using = EventTypeDeserializer.class)
  private EventType type;
  @JsonSerialize(using = MyDateSerializer.class)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}
