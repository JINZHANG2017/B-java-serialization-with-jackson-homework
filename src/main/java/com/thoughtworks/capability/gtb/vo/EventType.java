package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");

  private String code;

  @JsonValue
  public String getOrdinal(){
    return name();
  }
  EventType(String code) {
    this.code = code;
  }
}
