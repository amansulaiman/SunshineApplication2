package com.softnetcomm.aman.sunshineapplication.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.softnetcomm.aman.sunshineapplication.data.WeatherContract.WeatherEntry;
import com.softnetcomm.aman.sunshineapplication.data.WeatherContract.LocationEntry;

/**
 * Created by aman on 1/21/16.
 */
public class WeatherDBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME =  "weather.db";

    public WeatherDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_WEATHER_TABLE =
                "CREATE TABLE" + WeatherEntry.TABLE_NAME + " (" +
                        WeatherEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        WeatherEntry.COLUMN_LOCATION_KEY + " INTEGER NOT NULL, " +
                        WeatherEntry.COLUMN_DATETEXT + "";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
