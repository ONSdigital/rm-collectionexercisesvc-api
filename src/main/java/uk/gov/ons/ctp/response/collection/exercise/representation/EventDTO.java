package uk.gov.ons.ctp.response.collection.exercise.representation;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class EventDTO {
    private UUID collectionExerciseId;
    private String tag;
    private Date timestamp;
}
