package uk.gov.ons.ctp.response.collection.exercise.representation;

import java.util.List;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for linking SampleSummaries to CollectionExercises
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class LinkSampleSummaryDTO {
  
  public enum SampleLinkState {
    INIT, ACTIVE
  }

  public enum SampleLinkEvent {
    ACTIVATE
  }

  private List<UUID> sampleSummaryIds;
}
