package org.github.rodindenis.failtestreportermavenplugin.parser.cucumber.features.tags.locations;

import lombok.Data;

@Data
public class JSONLocation {
    private int line;
    private int column;
}
