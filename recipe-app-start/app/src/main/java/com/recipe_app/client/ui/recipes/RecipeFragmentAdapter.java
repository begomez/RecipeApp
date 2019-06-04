package com.recipe_app.client.ui.recipes;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class RecipeFragmentAdapter extends FragmentPagerAdapter {

    interface Numbers {
        int FIRST = 0;
        int SECOND = 1;
        int THIRD = 2;
        int NUM_FRAGMENTS = 3;
    }

    public RecipeFragmentAdapter(FragmentManager fm) {
        super(fm);
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
                return "Ingr";
            case Numbers.SECOND:
                return "Prep";
            case Numbers.THIRD:
                return "Notes";
            default:
                return "";
        }
    }

    @Override
    public int getCount() {
        return Numbers.NUM_FRAGMENTS;
    }
}
