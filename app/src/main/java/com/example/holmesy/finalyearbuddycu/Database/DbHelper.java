package com.example.holmesy.finalyearbuddycu.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import static com.example.holmesy.finalyearbuddycu.Database.DbContract.jobTracker.TABLE_NAME;

public class DbHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "revision.db";
    private static final String _ID = "_id";
    private static final int DATABASE_VERSION = 1;


    public DbHelper (Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    public void onCreate (SQLiteDatabase sqLiteDatabase){
        String SQL_CREATE_REV_TABLE = "CREATE TABLE " + TABLE_NAME + "( "
        + _ID + "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                DbContract.jobTracker.COLUMN_MODULE + " TEXT NOT NULL," +
                DbContract.jobTracker.COLUMN_MODULE + "TEXT NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_REV_TABLE);

    }

    @Override
    public void onUpgrade (SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion){
    }

}
