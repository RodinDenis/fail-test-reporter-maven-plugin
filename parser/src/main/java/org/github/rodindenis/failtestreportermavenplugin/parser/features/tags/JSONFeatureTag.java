package org.github.rodindenis.failtestreportermavenplugin.parser.features.tags;

import lombok.Data;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.tags.locations.JSONLocation;

@Data
public class JSONFeatureTag {
    private String name;
    private String type;
    private JSONLocation location;

}
