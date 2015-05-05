package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseUser;
import com.parse.ParseObject;

public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();


    // Initialize Crash Reporting.
    ParseCrashReporting.enable(this);

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(this, "xibRugv4vFBUOUrCSRbyQzhu0yqlLIL9V3HJFLFw", "foC0VeWeNRJdx4HGBk4L0zd2R4yFYWdGgcOLcGgR");

      ParseObject testObject = new ParseObject("TestObject");
      testObject.put("fusacao", "bar");
      testObject.saveInBackground();

    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);



  }
}
