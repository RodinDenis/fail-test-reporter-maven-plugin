package org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features;

import lombok.Data;
import org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.scenarios.JSONScenario;
import org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.tags.JSONFeatureTag;

import java.util.List;

@Data
public class JSONFeature {
    private int line;
    private List<JSONScenario> elements;
    private String name;
    private String description;
    private String id;
    private String keyword;
    private String uri;
    private List<JSONFeatureTag> tags;
}
