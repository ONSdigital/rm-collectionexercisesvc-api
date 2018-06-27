package uk.gov.ons.ctp.response.collection.exercise.representation;

import java.util.HashMap;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

/** CaseType API representation. */
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class PartyDTO {

  private String sampleUnitType;

  private String sampleUnitRef;

  private UUID id;

  private HashMap<String, String> attributes;
}
