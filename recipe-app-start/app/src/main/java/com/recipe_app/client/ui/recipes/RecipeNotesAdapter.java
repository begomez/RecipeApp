package com.recipe_app.client.ui.recipes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.recipe_app.client.R;
import com.recipe_app.client.data.model.DummyData;
import com.recipe_app.client.data.model.RecipeNote;
import com.recipe_app.client.data.model.RecipePreparation;

import java.util.ArrayList;


public class RecipeNotesAdapter extends RecyclerView.Adapter<RecipeNotesAdapter.RecipeNoteViewHolder> {

    private ArrayList<RecipeNote> data;

    public static class RecipeNoteViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgNoteMadeBy;
        public TextView txtNoteMadeBy;
        public TextView txtNoteMadeOn;
        public TextView txtNoteText;

        public RecipeNoteViewHolder(ViewGroup itemView) {
            super(itemView);
            this.imgNoteMadeBy = (ImageView) itemView.findViewById(R.id.recipe_notes_who_img);
            this.txtNoteMadeBy = (TextView) itemView.findViewById(R.id.recipe_notes_who_name);
            this.txtNoteMadeOn = (TextView)itemView.findViewById(R.id.recipe_notes_when);
            this.txtNoteText = (TextView)itemView.findViewById(R.id.recipe_notes_text);
        }
    }

    public RecipeNotesAdapter(){
        this.data = DummyData.getListOfRecipeNotes(15);
    }

    public RecipeNotesAdapter(RecipePreparation[] data){
        //this.data = data;                     //TODO database
        this.data = DummyData.getListOfRecipeNotes(15);
    }

    public RecipeNotesAdapter.RecipeNoteViewHolder onCreateViewHolder(ViewGroup parent,
                                                                             int viewType) {
        ViewGroup vg = (ViewGroup) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recipe_notes, parent, false);
        RecipeNoteViewHolder ivh = new RecipeNoteViewHolder(vg);
        return ivh;
    }

    @Override
    public void onBindViewHolder(RecipeNoteViewHolder holder, int i) {
        if(data != null) { //TODO needed?
//            holder.imgNoteMadeBy.setImageDrawable();
            holder.txtNoteMadeBy.setText(data.get(i).getNoteMadeBy());
            holder.txtNoteMadeOn.setText(data.get(i).getNoteMadeOn());
            holder.txtNoteText.setText(data.get(i).getNoteText());
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
