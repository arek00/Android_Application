package com.example.Android_Application.Adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.example.Android_Application.R;

/**
 * Created by Admin on 2014-12-08.
 */
public class DBPersonAdapter extends CursorAdapter{

    private Cursor dbCursor;
    private Context context;

    public DBPersonAdapter(Context context, Cursor cursor)
    {
        super(context, cursor);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {

        View line;

            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            line = inflater.inflate(R.layout.listview_layout, null);

        return line;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView surnameLine = (TextView)view.findViewById(R.id.SurnameLine);
        TextView phoneNumberLine = (TextView)view.findViewById(R.id.PhoneNumberLine);

        String name = cursor.getString(1);
        String surname = cursor.getString(2);
        String phoneNumber = cursor.getString(3);

        surnameLine.setText(name + " " + surname.toUpperCase());
        phoneNumberLine.setText(phoneNumber);
    }
}
