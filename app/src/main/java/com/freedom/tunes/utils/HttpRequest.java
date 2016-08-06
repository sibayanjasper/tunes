package com.freedom.tunes.utils;

import android.os.AsyncTask;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jaspersibayan on 07/08/2016.
 */
public class HttpRequest extends AsyncTask<String, Void, String> {

    public static final String BASE_URL = "http://api.tunes.tm";

    @Override
    protected String doInBackground(String... params) {
        String result = "";
        HttpURLConnection connection;

        try {
            connection = (HttpURLConnection) new URL(BASE_URL).openConnection();
        } catch (final MalformedURLException e) {
            return e.getMessage();
        } catch (final IOException e) {
            return e.getMessage();
        }

        try {
            Toast.makeText(null, connection.getInputStream().toString(), Toast.LENGTH_SHORT).show();
        } catch (final IOException e) {
            return e.getMessage();
        }

        return result;
    }

}
