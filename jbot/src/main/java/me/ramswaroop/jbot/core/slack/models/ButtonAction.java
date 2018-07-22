package me.ramswaroop.jbot.core.slack.models;

public class ButtonAction extends Action {
    private String value;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
