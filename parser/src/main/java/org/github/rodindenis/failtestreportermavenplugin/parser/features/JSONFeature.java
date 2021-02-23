package org.github.rodindenis.failtestreportermavenplugin.parser.features;

import lombok.Data;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.JSONScenario;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.tags.JSONFeatureTag;

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
