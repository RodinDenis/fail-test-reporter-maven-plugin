package org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.scenarios.steps.results;

import lombok.Data;

@Data
public class JSONResult {
    private String error_message;
    private int duration;
    private String status;
}
