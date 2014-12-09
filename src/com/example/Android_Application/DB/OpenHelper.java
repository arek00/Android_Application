package com.example.Android_Application.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Admin on 2014-11-28.
 */
public class OpenHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "person.db";
    private static final int DB_VERSION = 4;

    public final static String tableName = "Person";
    public final static String nameColumn = "Name";
    public final static String surnameColumn = "Surname";
    public final static String phoneNumberColumn = "PhoneNumber";


    private static final String CREATE_TABLE =
            String.format("CREATE TABLE %s ( _id INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT);",tableName,nameColumn,surnameColumn,phoneNumberColumn);


    public OpenHelper(Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqliteDatabase) {
        sqliteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}
