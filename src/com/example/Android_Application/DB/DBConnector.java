package com.example.Android_Application.DB;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.CursorAdapter;
import com.example.Android_Application.Person.Person;

/**
 * Created by Admin on 2014-12-09.
 */
public class DBConnector {

    SQLiteOpenHelper helper;

    public DBConnector(SQLiteOpenHelper helper)
    {
        this.helper = helper;
    }

    public long putDataToDB(Person person)
    {
        SQLiteDatabase database = helper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(OpenHelper.nameColumn, person.getName());
        values.put(OpenHelper.surnameColumn, person.getSurname());
        values.put(OpenHelper.phoneNumberColumn, person.getPhoneNumber());

        return database.insert(OpenHelper.tableName, null, values);
    }


    public Cursor getDataFromDB(String[] columnNames)
    {
        SQLiteDatabase database = helper.getReadableDatabase();
        Cursor cursor;
        String statement = "SELECT rowid as _id, * FROM " + OpenHelper.tableName;

        cursor = database.rawQuery(statement,columnNames);


        return cursor;
    }
}
