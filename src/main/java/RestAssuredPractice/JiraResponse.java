package RestAssuredPractice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class JiraResponse {
    public ArrayList<String> _expands;
    public int size;
    public int start;
    public int limit;
    public boolean isLastPage;
    public Links _links;
    public ArrayList<Value> values;

    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)

    public static class AvatarUrls{
        @JsonProperty("48x48")
        public String _48x48;
        @JsonProperty("24x24")
        public String _24x24;
        @JsonProperty("16x16")
        public String _16x16;
        @JsonProperty("32x32")
        public String _32x32;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CreatedDate{
        public Date iso8601;
        public Date jira;
        public String friendly;
        public Object epochMillis;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CurrentStatus{
        public String status;
        public String statusCategory;
        public StatusDate statusDate;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Links{
        public String self;
        public String base;
        public String context;
        public String jiraRest;
        public AvatarUrls avatarUrls;
        public String web;
        public String agent;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RenderedValue{
        public String html;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Reporter{
        public String accountId;
        public String emailAddress;
        public String displayName;
        public boolean active;
        public String timeZone;
        public Links _links;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)

    public static class RequestFieldValue{
        public String fieldId;
        public String label;
        public Object value;
        public RenderedValue renderedValue;
    }



    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)

    public static class StatusDate{
        public Date iso8601;
        public Date jira;
        public String friendly;
        public Object epochMillis;
    }
    @Getter @Setter @NoArgsConstructor @AllArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Value{
        public ArrayList<String> _expands;
        public String issueId;
        public String issueKey;
        public String requestTypeId;
        public String serviceDeskId;
        public CreatedDate createdDate;
        public Reporter reporter;
        public ArrayList<RequestFieldValue> requestFieldValues;
        public CurrentStatus currentStatus;
        public Links _links;
    }


}
