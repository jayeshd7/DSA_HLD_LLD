package RestAssuredPractice;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class JSONSuccessResponse {

    public String code;
    public String message;
}
