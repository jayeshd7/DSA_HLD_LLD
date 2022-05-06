package FOX;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponseDataObject {
    public String status;
    public String place_id;
    public String scope;
    public String reference;
    public String id;

    @Override
    public String toString() {
        return "ResponseDataObject{" +
                "status='" + status + '\'' +
                ", place_id='" + place_id + '\'' +
                ", scope='" + scope + '\'' +
                ", reference='" + reference + '\'' +
                ", id='" + id + '\'' +
                '}';
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
