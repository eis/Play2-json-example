package controllers;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import play.mvc.Result;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class ApplicationTest {
    @Test
    public void testRoutes() {
        running(fakeApplication(), new Runnable() {
            public void run() {
                Result result = callAction(controllers.routes.ref.Application.index());

                assertThat(status(result)).isEqualTo(OK);
                
                Map<String,String> data = new HashMap<String,String>();
                result = callAction(
                        controllers.routes.ref.Application.newCountry(), 
                        fakeRequest().withFormUrlEncodedBody(data)
                    );
                assertThat(status(result)).isEqualTo(BAD_REQUEST);
                
                data.put("ISOName", "SU");
                
                result = callAction(
                        controllers.routes.ref.Application.newCountry(), 
                        fakeRequest().withFormUrlEncodedBody(data)
                    );
                
                assertThat(status(result)).isEqualTo(SEE_OTHER);
                assertThat(redirectLocation(result)).isEqualTo("/countries");
            }
         });

    }
}
