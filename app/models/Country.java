package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Country extends Model {
  @Id
  public String id;
  
  public String ISOName;
  
}
