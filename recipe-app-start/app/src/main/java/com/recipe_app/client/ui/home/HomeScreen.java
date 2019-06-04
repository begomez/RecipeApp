/*
 * Copyright 2014 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.recipe_app.client.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.recipe_app.client.BaseActivity;
import com.recipe_app.client.Navigator;
import com.recipe_app.client.R;

/**
 * This Activity class defines the home screen for the recipe app.
 */
public class HomeScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.layout = (R.layout.screen_home);

        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setListeners() {
        super.setListeners();

        ((Button) this.findViewById(R.id.btnAddIngredients)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigator.toIngredients(HomeScreen.this, new Bundle());
            }
        });

        ((Button) this.findViewById(R.id.btnAddRecipes)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigator.toRecipes(HomeScreen.this, new Bundle());
            }
        });
    }
}
