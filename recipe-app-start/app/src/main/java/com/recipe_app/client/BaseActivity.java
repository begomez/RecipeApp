package com.recipe_app.client;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    protected int layout = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(this.layout);

        this.setListeners();
    }

    protected void setListeners() {

    }

    protected void launchMainFragment(int target, BaseFragment frag) {
        this.launchMainFragment(target, frag, false);
    }


    protected void launchMainFragment(int target, BaseFragment frag, boolean stack) {
        FragmentManager mgr = this.getSupportFragmentManager();

        FragmentTransaction trans = mgr.beginTransaction();

        trans.replace(target, frag);

        if (stack) {
            trans.addToBackStack(frag.getTagging());
        }

        trans.commit();

        mgr.executePendingTransactions();
    }
}
