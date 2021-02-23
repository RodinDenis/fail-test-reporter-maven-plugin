package org.github.rodindenis.failtestreportermavenplugin.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.JSONFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONCucumberReportParser {

    private ObjectMapper mapper = new ObjectMapper();

    public List<JSONFeature> parse(File file) throws IOException {
        return mapper.readValue(file, new TypeReference<List<JSONFeature>>() {
        });
    }
}
