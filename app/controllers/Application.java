package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return redirect(routes.Application.countries());
  }
  public static Result countries() {
    return TODO;
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