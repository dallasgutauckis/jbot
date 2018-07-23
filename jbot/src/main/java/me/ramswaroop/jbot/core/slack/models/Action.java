package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Action {
    private String name;

    private Type type;

    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Type getType() {
        return type;
    }

    void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        @JsonProperty("button")
        BUTTON,
        @JsonProperty("select")
        SELECT
    }
}
