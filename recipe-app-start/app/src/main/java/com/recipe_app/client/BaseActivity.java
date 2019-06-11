package com.recipe_app.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

import com.recipe_app.client.ui.ExtrasFactory;
import com.recipe_app.client.ui.widget.ToolbarWidget;

public class BaseActivity extends AppCompatActivity {

    protected int layout = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(this.layout);

        this.setListeners();

        this.configDrawer();

        if ((getIntent() != null) && (getIntent().getExtras() != null)) {
            this.extractExtras(getIntent());
        }
    }

    protected void setListeners() {

    }

    protected int getDrawerViewID() {
        return 0;
    }

    protected int getToolbarViewID() {
        return 0;
    }

    protected void configDrawer() {
        final DrawerLayout drawer = this.findViewById(getDrawerViewID());
        Toolbar toolbar = this.findViewById(getToolbarViewID());

        if ((drawer != null) && (toolbar != null)) {
            this.setSupportActionBar(toolbar);

            this.getSupportActionBar().setDisplayShowHomeEnabled(true);
            this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            drawer.addDrawerListener(
                new ActionBarDrawerToggle(this, drawer, toolbar, R.string.str_open, R.string.str_close)
            );

            NavigationView navView = this.findViewById(R.id.nav_view);

            if (navView != null) {
                navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.menu_rec:
                                Navigator.toRecipes(BaseActivity.this, new Bundle());
                                drawer.closeDrawer(Gravity.LEFT);
                                break;
                            case R.id.menu_ingr:
                                Navigator.toIngredients(BaseActivity.this, new Bundle());
                                drawer.closeDrawer(Gravity.LEFT);
                                break;
                            default:
                                break;
                        }

                        return true;
                    }
                });
            }
        }

    }

    protected void extractExtras(Intent i) {

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
