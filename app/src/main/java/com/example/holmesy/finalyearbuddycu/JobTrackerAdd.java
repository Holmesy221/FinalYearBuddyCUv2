package com.example.holmesy.finalyearbuddycu;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.example.holmesy.finalyearbuddycu.Database.DbContract;
import com.example.holmesy.finalyearbuddycu.Database.DbHelper;

public class JobTrackerAdd extends Fragment {

    private EditText moduleEditText;
    private EditText revNotesEditText;
    String moduleString, revNoteString;
    DbHelper dbHelper;


    public JobTrackerAdd(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.job_add, container, false);
       final EditText editText = (EditText) rootView.findViewById(R.id.edit_text_module);
       final EditText editText1 = (EditText) rootView.findViewById(R.id.edit__text_revnotes);
        Button button = (Button)rootView.findViewById(R.id.jobadd);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String job = editText.getText().toString().trim();
                String job2 = editText1.getText().toString().trim();
                dbHelper = new DbHelper(getActivity());
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put(DbContract.jobTracker.COLUMN_MODULE, moduleString);
                values.put(DbContract.jobTracker.COLUMN_REVNOTES, revNoteString);

                long newJobId = db.insert(DbContract.jobTracker.TABLE_NAME, null, values);

            }
        });

        return rootView;
    }

}
