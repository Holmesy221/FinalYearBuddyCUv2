package com.example.holmesy.finalyearbuddycu;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.holmesy.finalyearbuddycu.Database.DbContract;
import com.example.holmesy.finalyearbuddycu.Database.DbHelper;

public class JobTracker extends Fragment {

private DbHelper dbHelper;
    public JobTracker() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.job_tacker, container, false);
        ListView listView = (ListView)rootView.findViewById(R.id.list);

        final FloatingActionButton floatingActionButton =
                (FloatingActionButton)rootView.findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new JobTrackerAdd();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, fragment);
                fragmentTransaction.commit();

            }
        });

        dbHelper = new DbHelper(getActivity());
        SQLiteDatabase db = dbHelper.getReadableDatabase();



        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
                DbContract.jobTracker._ID,
                DbContract.jobTracker.COLUMN_MODULE,
                DbContract.jobTracker.COLUMN_REVNOTES,
        };

        // Querys the DB table
        Cursor cursor = db.rawQuery(
                "SELECT rowid _id,* FROM jobTracker", null);


        //setup cursor adapter
        JobAdapter adapter = new JobAdapter(getActivity(), cursor);
        // attaches cursor adapter to listview
        listView.setAdapter(adapter);
        //change to new cursor , update listview
        adapter.changeCursor(cursor);


        return rootView;
    }



    }
