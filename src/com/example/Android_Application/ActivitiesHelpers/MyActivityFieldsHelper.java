package com.example.Android_Application.ActivitiesHelpers;

import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by Admin on 2014-11-26.
 */
public class MyActivityFieldsHelper {

    private EditText editName = null;
    private EditText editSurname = null;
    private EditText editPhoneNumber = null;

    private ListView personList = null;

    public EditText getEditName() {
        return editName;
    }

    public void setEditName(EditText editName) {
        this.editName = editName;
    }

    public EditText getEditSurname() {
        return editSurname;
    }

    public void setEditSurname(EditText editSurname) {
        this.editSurname = editSurname;
    }

    public EditText getEditPhoneNumber() {
        return editPhoneNumber;
    }

    public void setEditPhoneNumber(EditText editPhoneNumber) {
        this.editPhoneNumber = editPhoneNumber;
    }

    public ListView getPersonList() {
        return personList;
    }

    public void setPersonList(ListView personList) {
        this.personList = personList;
    }
}
