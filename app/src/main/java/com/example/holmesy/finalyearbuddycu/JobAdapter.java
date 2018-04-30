package com.example.holmesy.finalyearbuddycu;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.holmesy.finalyearbuddycu.Database.DbContract;
import com.example.holmesy.finalyearbuddycu.Database.DbHelper;

import static com.example.holmesy.finalyearbuddycu.Database.DbContract.jobTracker._ID;

public class JobAdapter extends CursorAdapter {

   DbHelper dbHelper;
    Context context;


/*
Gets the context and the cursor to get the data
 */

    public JobAdapter (Context context, Cursor cursor){
        super(context,cursor,0);
        this.context = context;
        dbHelper = new DbHelper(context);

    }



    @Override
    public View newView  (Context context, Cursor cursor, ViewGroup parent){
        return LayoutInflater.from(context).inflate(R.layout.job_list,parent,false);

    }



    @Override
    public void bindView(View view, Context context, Cursor cursor){


        TextView nameTextView = (TextView) view.findViewById(R.id.job);
        TextView summaryTextView  = (TextView) view.findViewById(R.id.summary);




        int moduleColumnIndex = cursor.getColumnIndex(DbContract.jobTracker.COLUMN_MODULE);
        int revNoteColumnIndex = cursor.getColumnIndex(DbContract.jobTracker.COLUMN_REVNOTES);
        int idColumnIndex = cursor.getColumnIndex(_ID);


        String moduleName = cursor.getString(moduleColumnIndex);
        String moduleNote = cursor.getString(revNoteColumnIndex);
        final String rowId = cursor.getString(idColumnIndex);


        nameTextView.setText(moduleName);
        summaryTextView.setText(moduleNote);

    }
}

