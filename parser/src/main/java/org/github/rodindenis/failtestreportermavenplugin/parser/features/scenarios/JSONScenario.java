package org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.steps.JSONStep;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.steps.tags.JSONStapTag;

import java.util.List;

@Data
public class JSONScenario {
    @JsonProperty("start_timestamp")
    private String startTimestamp;

    private int line;
    private String name;
    private String description;
    private String id;
    private String type;
    private String keyword;
    private List<JSONStep> steps;
    private List<JSONStapTag> tags;

}
