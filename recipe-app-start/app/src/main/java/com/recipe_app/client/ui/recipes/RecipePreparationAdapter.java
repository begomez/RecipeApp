package com.recipe_app.client.ui.recipes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.recipe_app.client.R;
import com.recipe_app.client.data.model.DummyData;
import com.recipe_app.client.data.model.RecipePreparation;

import java.util.ArrayList;


public class RecipePreparationAdapter extends RecyclerView.Adapter<RecipePreparationAdapter.RecipePreparationViewHolder> {

    private ArrayList<RecipePreparation> data;

    public static class RecipePreparationViewHolder extends RecyclerView.ViewHolder {

        public TextView txtStepNumber;
        public TextView txtStepDesc;

        public RecipePreparationViewHolder(ViewGroup itemView) {
            super(itemView);
            this.txtStepNumber = (TextView) itemView.findViewById(R.id.rec_prep_txt_step_nr);
            this.txtStepDesc = (TextView)itemView.findViewById(R.id.rec_prep_txt_step_desc);
        }
    }

    public RecipePreparationAdapter(){
        this.data = DummyData.getListOfRecipePreparationSteps(15);
    }

    public RecipePreparationAdapter(RecipePreparation[] data){
        //this.data = data;                     //TODO database
        this.data = DummyData.getListOfRecipePreparationSteps(15);
    }

    public RecipePreparationAdapter.RecipePreparationViewHolder onCreateViewHolder(ViewGroup parent,
                                                                                   int viewType) {
        ViewGroup vg = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipe_preparation, parent, false);
        RecipePreparationViewHolder ivh = new RecipePreparationViewHolder(vg);
        return ivh;
    }

    @Override
    public void onBindViewHolder(RecipePreparationViewHolder holder, int i) {
        if(data != null) { //TODO needed?
            holder.txtStepNumber.setText(data.get(i).getStepNumber()+".");
            holder.txtStepDesc.setText(data.get(i).getStepDescription());
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
