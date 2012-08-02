package models;

import org.junit.Test;

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
        }
      });
    }    
}
