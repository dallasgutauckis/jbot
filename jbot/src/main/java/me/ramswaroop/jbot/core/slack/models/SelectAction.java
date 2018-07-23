package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SelectAction extends Action {
    @JsonProperty("data_source")
    private String dataSource;

    private List<Option> optiions;

    {
        setType(Type.SELECT);
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public List<Option> getOptiions() {
        return optiions;
    }

    public void setOptiions(List<Option> optiions) {
        this.optiions = optiions;
    }
}
