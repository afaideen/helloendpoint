package com.google.devrel.samples.helloendpoints.backend;

/**
 * Created by han on 20-Sep-17.
 */

/**
 * Contains the client IDs and scopes for allowed clients consuming the helloworld API.
 */
public class Constants {
    public static final String WEB_CLIENT_ID = "1082051436958-kt9nej20b2qmkk6tt7plh8dkqauh3dan.apps.googleusercontent.com";
    public static final String ANDROID_CLIENT_ID = "1082051436958-b7kp1c45reosclndq3ugebccoh84kers.apps.googleusercontent.com";//"1082051436958-8h1ioht5ouosfiu3i0k5rie0grj0lmba.apps.googleusercontent.com";
    public static final String IOS_CLIENT_ID = "replace this with your iOS client ID";
    public static final String ANDROID_AUDIENCE = WEB_CLIENT_ID;

    public static final String EMAIL_SCOPE = "https://www.googleapis.com/auth/userinfo.email";
}
