package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import models.*;

import play.db.ebean.Model;
import play.db.ebean.Transactional;
//import play.db.jpa.Transactional;

import java.util.List;
import static play.libs.Json.toJson;

public class Application extends Controller {
  
  static Form<Country> countryForm = form(Country.class);
  
  @Transactional()
  public static Result index() {
      return ok(index.render(new Model.Finder(String.class, Country.class).all()));
    //return redirect(routes.Application.countries());
  }
  public static Result countries() {
      List<Country> countries = new Model.Finder(String.class, Country.class).all();
      return ok(toJson(countries));
      /*
    return ok(
        views.html.index.render(Country.all(), countryForm)
      );
      */
  }
  public static Result newCountryForm() {
      return ok(add.render(countryForm));
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