package FOX;

import java.util.List;

public class AddPlace {
    private int accuracy=0;
    private String name=null;
    private String phone_number=null;
    private String address=null;
    private String website=null;
    private String language=null;
    private Location location=null;
    private List<String> types=null;

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<String> getTypes() {
        return types;
    }
    public void setTypes(List<String> types) {
        this.types = types;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}
