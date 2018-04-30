package com.example.holmesy.finalyearbuddycu.Database;

import android.provider.BaseColumns;

public class DbContract {

    private DbContract(){}


    public static final class jobTracker implements BaseColumns{

        public static final String TABLE_NAME = "jobTracker";
        public static final String _ID = BaseColumns._ID;
        public final static String COLUMN_MODULE = "job";
        public final static String COLUMN_REVNOTES = "notes";
    }

}
