package uk.gov.ons.ctp.response.collection.exercise.representation;

import java.util.List;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** DTO for linking SampleSummaries to CollectionExercises */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class LinkSampleSummaryDTO {

  /** Valid states for a SampleLink */
  public enum SampleLinkState {
    INIT,
    ACTIVE
  }

  /** Valid events that can be fired at a SampleLink state machine */
  public enum SampleLinkEvent {
    ACTIVATE
  }

  private List<UUID> sampleSummaryIds;
}
