package RestAssuredPractice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MRDataResponse {

    @JsonProperty("MRData")
    public MRData mRData;

    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    public static class Circuit{
        public String circuitId;
        public String url;
        public String circuitName;

        @JsonProperty("Location")
        public Location location;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    public static class CircuitTable{
        public String season;
        @JsonProperty("Circuits")
        public ArrayList<Circuit> circuits;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    public static class Location{
        public String lat;
        @JsonProperty("long")
        public String mylong;
        public String locality;
        public String country;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    public static class MRData{
        public String xmlns;
        public String series;
        public String url;
        public String limit;
        public String offset;
        public String total;
        @JsonProperty("CircuitTable")
        public CircuitTable circuitTable;
    }


}
