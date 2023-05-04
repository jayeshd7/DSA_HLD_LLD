package zensar.test.ResponsePOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;


@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchPOJO {

    @JsonProperty("domains")
    public List<String> domains;
    public String country;

    @JsonProperty("alpha_two_code")
    public String alphaTwoCode;

    @JsonProperty("state-province")
    public String stateProvince;

    @JsonProperty("web_pages")
    public List<String> webPages;

    public String name;
}
