package models;

import org.junit.Test;

import play.db.ebean.Model;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;


public class CountryTest {
    @Test
    public void createAndDelete() {
      running(fakeApplication(inMemoryDatabase()), new Runnable() {
        public void run() {
            Country finland = new Country();
            finland.ISOName = "FI";
            finland.save();
            assertThat(finland.id).isNotNull();
            
            assertThat(new Model.Finder(String.class, Country.class).all().size())
                .isGreaterThanOrEqualTo(1);
            finland.delete();
            assertThat(new Model.Finder(String.class, Country.class).all().size())
                .isEqualTo(0);
        }
      });
    }    
}
