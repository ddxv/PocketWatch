package com.gate.pocketwatch;

/**
 * Created by ddxv on 9/11/2014.
 *
 * based on tutorial found at: http://www.tutorialsbuzz.com/2013/11/android-sqlite-database-with.html
 *
 */


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBhelper extends SQLiteOpenHelper {

    // TABLES INFORMATTION
    public static final String TABLE_MEMBER = "member";


    public static final String MEMBER_ID = "_id";
    public static final String MEMBER_NAME = "name";
    public static final String MEMBER_PASSWORD = "mmeberpassword";

    // DATABASE INFORMATION
    static final String DB_NAME = "MEMBER.DB";
    static final int DB_VERSION = 1;

    // TABLE CREATION STATEMENT
    private static final String CREATE_TABLE = "create table "
            + TABLE_MEMBER + "(" + MEMBER_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + MEMBER_NAME + " TEXT NOT NULL);";

    public DBhelper(Context context) {
        super(context, DB_NAME, null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBER);
        onCreate(db);
    }
}