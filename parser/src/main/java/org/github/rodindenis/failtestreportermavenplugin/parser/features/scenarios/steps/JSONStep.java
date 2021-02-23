package org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.steps;

import lombok.Data;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.steps.matches.JSONMatch;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.steps.results.JSONResult;

@Data
public class JSONStep {
    private JSONResult result;
    private int line;
    private String name;
    private JSONMatch match;
    private String keyword;
}
