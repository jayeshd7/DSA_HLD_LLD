package FOX;



import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

public class FoxResponse{
    public String boolean_key;
    public String empty_string_translation;
    public String key_with_description;

    @JsonProperty("key_with_line-break")
    public String keyWithLineBreak;
    public Nested nested;
    public Object null_translation;

    public String getBoolean_key() {
        return boolean_key;
    }

    public void setBoolean_key(String boolean_key) {
        this.boolean_key = boolean_key;
    }

    public String getEmpty_string_translation() {
        return empty_string_translation;
    }

    public void setEmpty_string_translation(String empty_string_translation) {
        this.empty_string_translation = empty_string_translation;
    }

    public String getKey_with_description() {
        return key_with_description;
    }

    public void setKey_with_description(String key_with_description) {
        this.key_with_description = key_with_description;
    }

    public String getKeyWithLineBreak() {
        return keyWithLineBreak;
    }

    public void setKeyWithLineBreak(String keyWithLineBreak) {
        this.keyWithLineBreak = keyWithLineBreak;
    }

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    public Object getNull_translation() {
        return null_translation;
    }

    public void setNull_translation(Object null_translation) {
        this.null_translation = null_translation;
    }

    public PluralizedKey getPluralized_key() {
        return pluralized_key;
    }

    public void setPluralized_key(PluralizedKey pluralized_key) {
        this.pluralized_key = pluralized_key;
    }

    public List<String> getSample_collection() {
        return sample_collection;
    }

    public void setSample_collection(List<String> sample_collection) {
        this.sample_collection = sample_collection;
    }

    public String getSimple_key() {
        return simple_key;
    }

    public void setSimple_key(String simple_key) {
        this.simple_key = simple_key;
    }

    public String getUnverified_key() {
        return unverified_key;
    }

    public void setUnverified_key(String unverified_key) {
        this.unverified_key = unverified_key;
    }

    public PluralizedKey pluralized_key;
    public List<String> sample_collection;
    public String simple_key;
    public String unverified_key;
}

class Deeply{
    public String key;
}

 class Nested{
    public Deeply deeply;
    public String key;
}

 class PluralizedKey{
     public String getOne() {
         return one;
     }

     public void setOne(String one) {
         this.one = one;
     }

     public String getOther() {
         return other;
     }

     public void setOther(String other) {
         this.other = other;
     }

     public String getZero() {
         return zero;
     }

     public void setZero(String zero) {
         this.zero = zero;
     }

     public String one;
    public String other;
    public String zero;
}


