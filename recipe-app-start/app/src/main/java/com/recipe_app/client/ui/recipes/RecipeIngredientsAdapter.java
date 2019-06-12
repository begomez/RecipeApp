package com.recipe_app.client.ui.recipes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.recipe_app.client.R;
import com.recipe_app.client.data.model.DummyData;
import com.recipe_app.client.data.model.Ingredient;
import com.recipe_app.client.data.model.RecipeIngredient;

import java.util.ArrayList;


public class RecipeIngredientsAdapter extends RecyclerView.Adapter<RecipeIngredientsAdapter.RecipeIngredientsViewHolder> {

    private ArrayList<RecipeIngredient> data;

    public static class RecipeIngredientsViewHolder extends RecyclerView.ViewHolder {

        public TextView txtQuantity;
        public TextView txtUOM;
        public TextView txtNameIngr;

        public RecipeIngredientsViewHolder(ViewGroup itemView) {
            super(itemView);
            this.txtQuantity = (TextView)itemView.findViewById(R.id.rec_ingr_quantity);
            this.txtUOM = (TextView)itemView.findViewById(R.id.rec_ingr_uom);
            this.txtNameIngr = (TextView) itemView.findViewById(R.id.rec_ingr_txt_name);
        }
    }

    public RecipeIngredientsAdapter(){
        this.data = DummyData.getListOfRecipeIngredients(15);
    }

    public RecipeIngredientsAdapter(RecipeIngredient[] data){
        //this.data = data;                     //TODO database
        this.data = DummyData.getListOfRecipeIngredients(15);
    }

    public RecipeIngredientsAdapter.RecipeIngredientsViewHolder onCreateViewHolder(ViewGroup parent,
                                                                             int viewType) {
        ViewGroup vg = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipe_ingredients, parent, false);
        RecipeIngredientsViewHolder ivh = new RecipeIngredientsViewHolder(vg);
        return ivh;
    }

    @Override
    public void onBindViewHolder(RecipeIngredientsViewHolder holder, int i) {

        if(data != null) { //TODO needed?
            //holder.imgIngr.setImageDrawable(data[i].getPhoto()); //TODO Photo
            holder.txtNameIngr.setText(data.get(i).getIngredient().getName());
            holder.txtQuantity.setText(""+data.get(i).getQuantity());
            holder.txtUOM.setText(data.get(i).getUom());
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_ingredients);
    }*/
}
