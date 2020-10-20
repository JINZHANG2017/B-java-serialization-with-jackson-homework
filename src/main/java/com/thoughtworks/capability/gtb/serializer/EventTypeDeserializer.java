package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.thoughtworks.capability.gtb.vo.EventType;

import java.io.IOException;

public class EventTypeDeserializer extends JsonDeserializer<EventType> {
    @Override
    public EventType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String str=p.getText();
        if(str.equals("D")){
            return EventType.DOWNLOAD;
        }
        if(str.equals("U")){
            return EventType.UPLOAD;
        }
        return null;
    }
}
