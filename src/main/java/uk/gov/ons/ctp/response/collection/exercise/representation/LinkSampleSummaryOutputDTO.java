package uk.gov.ons.ctp.response.collection.exercise.representation;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * output for endpoint for linking SampleSummary to CollectionExercise
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class LinkSampleSummaryOutputDTO {

  private UUID collectionExerciseId;
  private UUID sampleSummaryId;
}
