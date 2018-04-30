package com.example.holmesy.finalyearbuddycu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentGradeOther extends Fragment {



    public FragmentGradeOther() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_grade_other, container, false);

        final EditText editText = (EditText)rootView.findViewById(R.id.grade_et_onee);
        final EditText editText1 = (EditText)rootView.findViewById(R.id.grade_et_twoo);
        final EditText editText2 = (EditText)rootView.findViewById(R.id.grade_et_threee);
        final EditText editText3 = (EditText)rootView.findViewById(R.id.grade_et_fourr);
        final EditText editText4 = (EditText)rootView.findViewById(R.id.grade_et_fivee);

        Button calculate = (Button)rootView.findViewById(R.id.grade_get_result_buttonn);
       final TextView output = (TextView)rootView.findViewById(R.id.grade_result_tvv);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oneMark = editText.getText().toString();
                String twoMark = editText1.getText().toString();
                String threeMark = editText2.getText().toString();
                String fourMark = editText3.getText().toString();
                String fiveMark = editText4.getText().toString();

                double sum = (Double.parseDouble(oneMark)+ Double.parseDouble(twoMark) + Double.parseDouble(threeMark)
                        + Double.parseDouble(fourMark) + Double.parseDouble(fiveMark));
                double result =  (sum / 5);

                output.setText(String.valueOf(result));

            }
        });


        return rootView;
    }

    private void getResult(){


    }
}