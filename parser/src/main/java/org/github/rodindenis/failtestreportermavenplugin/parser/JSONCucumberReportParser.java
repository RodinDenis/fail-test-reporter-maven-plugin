package org.github.rodindenis.failtestreportermavenplugin.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.JSONFeature;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.JSONScenario;
import org.github.rodindenis.failtestreportermavenplugin.parser.features.scenarios.steps.JSONStep;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONCucumberReportParser {

    private ObjectMapper mapper = new ObjectMapper();
    private List<JSONFeature> features;

    public JSONCucumberReportParser(File file) throws IOException {
        features = mapper.readValue(file, new TypeReference<List<JSONFeature>>() {
        });
    }

    public int getFailedFeaturesCount() {
        int count = 0;
        for (JSONFeature feature : features) {
            for (JSONScenario element : feature.getElements()) {
                for (JSONStep step : element.getSteps()) {
                    if (step.getResult().getStatus() != "passed") {
                        ++count;
                    }
                }
            }
        }
        return count;

        //too many memory for big files ((
//        List<JSONFeature> failedFeatures = features.stream()
//                .filter(feature -> feature.getElements().stream()
//                        .flatMap(element -> element.getSteps().stream())
//                        .anyMatch(step -> step.getResult().getStatus() != "passed")
//                ).collect(Collectors.toList());
//
//        return failedFeatures.size();
    }

}
