package uk.gov.ons.ctp.response.collection.exercise.representation;

import lombok.Data;

@Data
public class SampleUnitValidationErrorDTO {
    public enum ValidationError { MISSING_COLLECTION_INSTRUMENT, MISSING_PARTY }

    private String sampleUnitRef;
    private ValidationError[] errors;
}
