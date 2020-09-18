package com.oxoo.spagreen;

public class Config {

    // copy your api url from php admin dashboard & paste below
    public static final String API_SERVER_URL = "https://abangjono.000webhostapp.com/rest-api/";

    //copy your api key from php admin dashboard & paste below
    public static final String API_KEY = "zgo0wjgvj655n74d1mmz4nne";

    //copy your terms url from php admin dashboard & paste below
    public static final String TERMS_URL = "https://abangjono.000webhostapp.com/tearms-of-services/";

    //youtube video auto play
    public static boolean YOUTUBE_VIDEO_AUTO_PLAY = true;

    //default theme
    public static boolean DEFAULT_DARK_THEME_ENABLE = true;

    // First, you have to configure firebase to enable facebook, phone and google login
    // facebook authentication
    public static final boolean ENABLE_FACEBOOK_LOGIN = false;

    //Phone authentication
    public static final boolean ENABLE_PHONE_LOGIN = false;

    //Google authentication
    public static final boolean ENABLE_GOOGLE_LOGIN = false;
}
