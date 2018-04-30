package com.example.holmesy.finalyearbuddycu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentGrade extends Fragment {

    public FragmentGrade(){}





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_grade, container, false);

        /*/
        Reference views
         */
       final EditText editText = (EditText)rootView.findViewById(R.id.grade_et_one);
       final EditText editText1 = (EditText)rootView.findViewById(R.id.grade_et_two);
       final EditText editText2 = (EditText)rootView.findViewById(R.id.grade_et_three);
       final EditText editText3 = (EditText)rootView.findViewById(R.id.grade_et_four);
       final EditText editText4 = (EditText)rootView.findViewById(R.id.grade_et_five);
       final EditText editText5 = (EditText)rootView.findViewById(R.id.grade_et_six);
       final EditText editText6 = (EditText)rootView.findViewById(R.id.grade_et_seven);
       final EditText editText7 = (EditText)rootView.findViewById(R.id.grade_et_eight);
       final EditText editText8 = (EditText)rootView.findViewById(R.id.grade_et_nine);
       final EditText editText9 = (EditText)rootView.findViewById(R.id.grade_et_ten);
       final EditText editText10 = (EditText)rootView.findViewById(R.id.grade_et_eleven);
       final TextView output = (TextView)rootView.findViewById(R.id.grade_result_tv);



      Button calculate = (Button)rootView.findViewById(R.id.grade_get_result_button);
       calculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String oneMark = editText.getText().toString();
               String twoMark = editText1.getText().toString();
               String threeMark = editText2.getText().toString();
               String fourMark = editText3.getText().toString();
               String fiveMark = editText4.getText().toString();
               String sixMark = editText5.getText().toString();
               String sevenMark = editText6.getText().toString();
               String eightMark = editText7.getText().toString();
               String nineMark = editText8.getText().toString();
               String tenMark = editText9.getText().toString();
               String elevenMark = editText10.getText().toString();

               double sum = (Double.parseDouble(oneMark)+ Double.parseDouble(twoMark) + Double.parseDouble(threeMark)
                       + Double.parseDouble(fourMark) + Double.parseDouble(fiveMark) + Double.parseDouble(sixMark) +
                       Double.parseDouble(sevenMark) + Double.parseDouble(eightMark) + Double.parseDouble(nineMark) +
                       Double.parseDouble(tenMark) + Double.parseDouble(elevenMark));
               double result =  (sum / 11);

               output.setText(String.valueOf(result));

           }
       });


        return rootView;
    }




}