package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import models.*;

public class Application extends Controller {
  
  static Form<Country> countryForm = form(Country.class);
  
  public static Result index() {
    return redirect(routes.Application.countries());
  }
  public static Result countries() {
    return ok(
        views.html.index.render(Country.all(), countryForm)
      );
  }
  public static Result newCountry() {
    return TODO;
  }
  public static Result deleteCountry(String id) {
    return TODO;
  }
  public static Result markets() {
    return TODO;
  }
  public static Result newMarket() {
    return TODO;
  }
  public static Result deleteMarket(Long id) {
    return TODO;
  }
}