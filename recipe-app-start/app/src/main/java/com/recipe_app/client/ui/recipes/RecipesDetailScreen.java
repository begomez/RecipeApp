package com.recipe_app.client.ui.recipes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.R;


public class RecipesDetailScreen extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.screen_recipes_detail;
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.setTabs();
    }

    private void setTabs() {
        RecipeFragmentAdapter adapter = new RecipeFragmentAdapter(this, this.getSupportFragmentManager());
        ViewPager pager = ((ViewPager) this.findViewById(R.id.recipe_detail_pager));
        pager.setAdapter(adapter);

//        ((TabLayout) this.findViewById(R.id.recipe_detail_tabs)).setupWithViewPager(pager);

        TabLayout tabLayout = ((TabLayout) this.findViewById(R.id.recipe_detail_tabs));
        tabLayout.setupWithViewPager(pager);

//      Custom Text Color
//      Option A (no XML)
      tabLayout.setTabTextColors(getResources().getColor(R.color.textColorAccentLight), getResources().getColor(R.color.textColorPrimary));

//      Custom Text Color
//        Option B (with XML)
//        TextView tv = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_contents,null);
//        for (int i = 0; i < tabLayout.getTabCount(); i++) {
//            tabLayout.getTabAt(i).setCustomView(tv);
//        }

    }
}
