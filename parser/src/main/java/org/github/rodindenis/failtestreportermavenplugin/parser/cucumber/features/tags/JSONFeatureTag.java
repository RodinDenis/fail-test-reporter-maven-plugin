package org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.tags;

import lombok.Data;
import org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.tags.locations.JSONLocation;

@Data
public class JSONFeatureTag {
    private String name;
    private String type;
    private JSONLocation location;

}
