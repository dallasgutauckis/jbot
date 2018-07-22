package me.ramswaroop.jbot.core.slack.models;

public class Action {
    private String name;
    /**
     * Possible values: button, select
     */
    private String type; // TODO is it possible to make this an enum in this project?
    private String text;
    private String style;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
