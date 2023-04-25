package FOX;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;

@Getter @Setter @ToString @JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor @AllArgsConstructor
public class GetBookDetailsResponse {
    public ArrayList<Book> books;


    @Getter @Setter @ToString @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Book{
        public String isbn;
        public String title;
        public String subTitle;
        public String author;
        @JsonProperty("publish_date")
        public String publishDate;

        public String publisher;
        public int pages;
        public String description;
        public String website;
    }



}
