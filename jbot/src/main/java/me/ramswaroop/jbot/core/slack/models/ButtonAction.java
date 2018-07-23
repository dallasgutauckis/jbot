package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ButtonAction extends Action {
    private String value;

    private Style style;

    {
        setType(Type.BUTTON);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public enum Style {
        @JsonProperty("default")
        DEFAULT,
        @JsonProperty("primary")
        PRIMARY,
        @JsonProperty("danger")
        DANGER
    }
}
