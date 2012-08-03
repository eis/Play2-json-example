package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Country extends Model {
    @Override
    public String toString() {
        return "Country [id=" + id + ", ISOName=" + ISOName + "]";
    }

    @Id
    private String id;
      
    @Required
    private String ISOName;

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @JsonProperty("ISOName")
    public String getISOName() {
        return ISOName;
    }
    
    public void setISOName(String iSOName) {
        ISOName = iSOName;
    }
  
}
