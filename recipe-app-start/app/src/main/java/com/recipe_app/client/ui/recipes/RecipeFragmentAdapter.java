package com.recipe_app.client.ui.recipes;


import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.recipe_app.client.R;


public class RecipeFragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    interface Numbers {
        int FIRST = 0;
        int SECOND = 1;
        int THIRD = 2;
        int NUM_FRAGMENTS = 3;
    }

    public RecipeFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int i) {


        switch (i) {
            case Numbers.FIRST:
                return RecipeDetailFragmentIngr.newInstance();
            case Numbers.SECOND:
                return RecipeDetailFragmentPrep.newInstance();
            case Numbers.THIRD:
                return RecipeDetailFragmentNotes.newInstance();
            default:
                return null;
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case Numbers.FIRST:
                return context.getString(R.string.tab_ingredients);
            case Numbers.SECOND:
                return context.getString(R.string.tab_preparation);
            case Numbers.THIRD:
                return context.getString(R.string.tab_notes);
            default:
                return "";
        }
    }

    @Override
    public int getCount() {
        return Numbers.NUM_FRAGMENTS;
    }
}
