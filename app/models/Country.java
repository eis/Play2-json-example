package models;

import java.util.ArrayList;
import java.util.List;

import play.data.validation.Constraints.Required;

public class Country {
  @Required
  public String id;
  public static List<Country> all() {
    return new ArrayList<Country>();
  }
  
  public static void create(Country country) {
    
  }
  
  public static void delete(String id) {
    
  }

}
