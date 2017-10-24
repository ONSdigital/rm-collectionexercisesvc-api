package uk.gov.ons.ctp.response.collection.exercise.representation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

/**
 * output for endpoint for linking SampleSummary to CollectionExercise
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class LinkedSampleSummariesDTO {

  private UUID collectionExerciseId;
  private List<UUID> sampleSummaryIds;
}
