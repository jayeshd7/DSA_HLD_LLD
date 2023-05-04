package RestAssuredPractice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.cucumber.java.mk_latn.No;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter@Setter@NoArgsConstructor @AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqresPostResponse {


        public String name;
        public String job;
        public String id;
        public Date createdAt;

}
