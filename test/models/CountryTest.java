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
            finland.id = "FI";
            Country.create(finland);
            assertThat(finland.id).isEqualTo("FI");
            assertThat(Country.all().size()).isEqualTo(1);
            Country.delete(finland.id);
            assertThat(Country.all().size()).isEqualTo(0);
        }
      });
    }    
}
