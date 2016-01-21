package com.softnetcomm.aman.sunshineapplication.data;

import android.provider.BaseColumns;

/**
 * Created by aman on 1/21/16.
 */
public class WeatherContract {

    public static final class LocationEntry  implements BaseColumns {

        public static final String TABLE_NAME = "location";

        public static final String COLUMN_LOCATION_SETTINGS = "location_settings";

        public static final String COLUMN_CITY_NAME = "city_name";

        public static final String COLUMN_COORD_LAT = "coord_lat";

        public static final String COLUMN_COORD_LONG = "coord_long";
    }

    public static final class WeatherEntry implements BaseColumns{


        public static final String TABLE_NAME = "weather";

        public static final String COLUMN_LOCATION_KEY =  "location_id";

        public static final String COLUMN_DATETEXT = "date";

        public static final String COLUMN_WEATHER_ID = "weather_id";

        public static final String COLUMN_SHORT_DESC = "short_desc";

        public static final String COLUMN_MIN_TEMP =  "min";

        public static final String COLUMN_MAX_TEP = "max";

        public static final String COLUMN_HUMIDITY = "humidity";

        public static final String COLUMN_PRESSURE = "pressure";

        public static final String COLUMN_WIND = "wind";

        public static final String COLUMN_DEGREES = "degrees";


    }

}
