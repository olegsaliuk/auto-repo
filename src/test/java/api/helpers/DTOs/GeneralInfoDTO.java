package api.helpers.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class GeneralInfoDTO {
    @JsonProperty(required = true)
    String name;

    @JsonProperty(required = true)
    int value;
}
