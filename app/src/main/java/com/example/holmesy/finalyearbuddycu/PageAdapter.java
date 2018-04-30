package com.example.holmesy.finalyearbuddycu;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private Context context;
    public PageAdapter(Context context, FragmentManager fragmentManager){
        super(fragmentManager);
        this.context=context;
    }

    @Override
    public int getCount(){
        return 3;
    }

    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return new FragmentGrade();
            case 1:
                return new FragmentGradeOther();
            default:
                return null;

        }
    }

    @Override
    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return context.getString(R.string.grade_calculator_string);
            case 1:
                return  context.getString(R.string.grade_calculator_string);
            default:
                return null;

        }
    }




}
