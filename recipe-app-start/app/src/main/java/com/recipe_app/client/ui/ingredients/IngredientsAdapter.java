package com.recipe_app.client.ui.ingredients;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.recipe_app.client.R;
import com.recipe_app.client.data.model.Ingredient;


public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.IngredientsViewHolder> {

    private Ingredient[] data;
    private IIngredientClick callback;


    public IngredientsAdapter(Ingredient[] data, IIngredientClick callback){
        this.data = data;
        this.callback = callback;
    }

    public IngredientsAdapter.IngredientsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewGroup vg = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ingredients, parent, false);
        IngredientsViewHolder ivh = new IngredientsViewHolder(vg);
        return ivh;
    }

    @Override
    public void onBindViewHolder(IngredientsViewHolder holder, int i) {
        //holder.imgIngr.setImageDrawable(data[i].getPhoto()); //TODO
        holder.txtNameIngr.setText(data[i].getName());
        holder.txtWhereToBuy.setText(data[i].getWhereToBuy());
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    /**
     *
     */
    public class IngredientsViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgIngr;
        public TextView txtNameIngr;
        public TextView txtWhereToBuy;

        public IngredientsViewHolder(ViewGroup itemView) {
            super(itemView);

            this.bindViews();

            this.setListeners();
        }

        private void bindViews() {
            this.imgIngr = (ImageView)itemView.findViewById(R.id.ingr_img);
            this.txtNameIngr = (TextView) itemView.findViewById(R.id.ingr_txt_name);
            this.txtWhereToBuy = (TextView)itemView.findViewById(R.id.ingr_txt_whereToBuy);
        }

        private void setListeners() {
            this.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();

                    callback.onIngredientClick(data[pos]);
                }
            });
        }
    }

}
