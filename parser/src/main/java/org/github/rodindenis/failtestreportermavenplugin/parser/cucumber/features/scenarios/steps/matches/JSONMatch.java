package org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.scenarios.steps.matches;

import lombok.Data;
import org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.scenarios.steps.matches.arguments.JSONArgument;

import java.util.List;

@Data
public class JSONMatch {
    private String location;
    private List<JSONArgument> arguments;
}
