package org.github.rodindenis.failtestreportermavenplugin.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.JSONFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class JSONCucumberReportParser {

    private ObjectMapper mapper = new ObjectMapper();
    private List<JSONFeature> features;

    public JSONCucumberReportParser(File file) throws IOException {
        features = mapper.readValue(file, new TypeReference<List<JSONFeature>>() {
        });
    }

    public int getFailedFeaturesCount() {
        List<JSONFeature> failedFeatures = features.stream()
                .filter(feature -> feature.getElements().stream()
                        .flatMap(element -> element.getSteps().stream())
                        .anyMatch(step -> step.getResult().getStatus() != "passed")
                ).collect(Collectors.toList());

        return failedFeatures.size();
    }

}
