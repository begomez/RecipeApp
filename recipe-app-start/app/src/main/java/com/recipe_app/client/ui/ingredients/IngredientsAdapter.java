package com.recipe_app.client.ui.ingredients;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.recipe_app.client.R;
import com.recipe_app.client.data.model.Ingredient;


public class IngredientsAdapter extends RecyclerView.Adapter<IngredientsAdapter.IngredientsViewHolder> {

    private Ingredient[] data;

    public static class IngredientsViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgIngr;
        public TextView txtNameIngr;
        public TextView txtWhereToBuy;

        public IngredientsViewHolder(ViewGroup itemView) {
            super(itemView);
            this.imgIngr = (ImageView)itemView.findViewById(R.id.ingr_img);
            this.txtNameIngr = (TextView) itemView.findViewById(R.id.ingr_txt_name);
            this.txtWhereToBuy = (TextView)itemView.findViewById(R.id.ingr_txt_whereToBuy);
        }
    }

    public IngredientsAdapter(){
        this.data = IngredientsAdapter.generateDummyData(15);
    }

    public IngredientsAdapter(Ingredient[] data){
        //this.data = data;                                         //TODO
        this.data = IngredientsAdapter.generateDummyData(15);
    }

    private static Ingredient[] generateDummyData(int length) {
            Ingredient[] ingList = new Ingredient[length];
            for(int i = 0; i < length; i++) {
                ingList[i] = new Ingredient("", "Ingredient " + i, "Veritas", "bla bla bla");
            }
        return ingList;
    }

    public IngredientsAdapter.IngredientsViewHolder onCreateViewHolder(ViewGroup parent,
                                                                       int viewType) {
        RelativeLayout rl = (RelativeLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ingredients, parent, false);
        IngredientsViewHolder ivh = new IngredientsViewHolder(rl);
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

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_ingredients);
    }*/
}
