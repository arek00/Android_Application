package com.example.Android_Application.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.Android_Application.Person.Person;
import com.example.Android_Application.R;

import java.util.List;

/**
 * Created by Admin on 2014-11-27.
 */
public class PersonAdapter extends ArrayAdapter<Person>{

    private Context context;
    public PersonAdapter(Context context, List<Person> persons)
    {
        super(context,R.layout.listview_layout, persons);
        this.context = context;
    }

    public View getView(int position, View view, ViewGroup group)
    {
        View line = view;

        if(line == null)
        {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            line = inflater.inflate(R.layout.listview_layout, null);
        }

        Person person = getItem(position);

        String name = person.getName();
        String surname = person.getSurname();
        String phoneNumber = person.getPhoneNumber();


        ((TextView)line.findViewById(R.id.SurnameLine)).setText(name + " " + surname.toUpperCase());
        ((TextView)line.findViewById(R.id.PhoneNumberLine)).setText(phoneNumber);

        return line;
    }
}
