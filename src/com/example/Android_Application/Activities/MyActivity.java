package com.example.Android_Application.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import com.example.Android_Application.ActivitiesHelpers.MyActivityFieldsHelper;
import com.example.Android_Application.Person.Person;
import com.example.Android_Application.R;

import java.util.ArrayList;

public class MyActivity extends Activity {

    private MyActivityFieldsHelper fieldsHelper = new MyActivityFieldsHelper();
    private ArrayList<Person> persons = new ArrayList<Person>();
    private ArrayAdapter<Person> personsAdapter = null;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        personsAdapter = new ArrayAdapter<Person>(this,android.R.layout.simple_list_item_1, persons);

        fieldsHelper.setEditName((EditText)findViewById(R.id.editName));
        fieldsHelper.setEditSurname((EditText) findViewById(R.id.editSurname));
        fieldsHelper.setEditPhoneNumber((EditText) findViewById(R.id.editPhoneNumber));
        fieldsHelper.setPersonList((ListView)findViewById(R.id.personList));

        fieldsHelper.getPersonList().setAdapter(personsAdapter);

    }

    public void onSave(View v){
        String name = fieldsHelper.getEditName().getText().toString();
        String surname = fieldsHelper.getEditSurname().getText().toString();
        String phoneNumber = fieldsHelper.getEditPhoneNumber().getText().toString();

        personsAdapter.add(new Person(name,surname,phoneNumber));
    }
}
