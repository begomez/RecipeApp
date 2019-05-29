package com.recipe_app.client.ui.menus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.R;

public class MenuScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.layout = R.layout.screen_menu;
        super.onCreate(savedInstanceState);
    }
}
