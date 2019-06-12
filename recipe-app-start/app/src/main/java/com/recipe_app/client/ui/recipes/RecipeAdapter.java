package com.recipe_app.client.ui.recipes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.recipe_app.client.R;
import com.recipe_app.client.data.model.DummyData;
import com.recipe_app.client.data.model.Ingredient;
import com.recipe_app.client.data.model.Recipe;

import java.util.ArrayList;


public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {
    private ArrayList<Recipe> data;
    private IRecipeClick callback;

    public RecipeAdapter(ArrayList<Recipe> data, IRecipeClick callback){
        this.data = data;
        this.callback = callback;
    }

    public RecipeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewGroup vg = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipes, parent, false);
        RecipeViewHolder ivh = new RecipeViewHolder(vg);
        return ivh;
    }

    @Override
    public void onBindViewHolder(RecipeViewHolder holder, int i) {
        //holder.imgRec.setImageDrawable(data[i].getPhoto()); //TODO
        holder.txtNameRec.setText(data.get(i).getName());
        holder.txtDifficulty.setText(data.get(i).getLevelOfDifficulty());
        holder.txtTimeToPrep.setText(data.get(i).getTimeToPrepare());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    /**
     *
     */
    public class RecipeViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgRec;
        public TextView txtNameRec;
        public TextView txtDifficulty;
        public TextView txtTimeToPrep;

        public RecipeViewHolder(ViewGroup itemView) {
            super(itemView);

            this.bindViews();

            this.setListeners();
        }


        private void bindViews() {
            this.imgRec = (ImageView)itemView.findViewById(R.id.rec_img);
            this.txtNameRec = (TextView) itemView.findViewById(R.id.rec_txt_name);
            this.txtDifficulty = (TextView)itemView.findViewById(R.id.rec_txt_difficulty);
            this.txtTimeToPrep = (TextView)itemView.findViewById(R.id.rec_txt_timeToPrep);
        }

        private void setListeners() {
            this.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();

                    callback.onRecipeClick(data.get(pos));
                }
            });
        }
    }
}
