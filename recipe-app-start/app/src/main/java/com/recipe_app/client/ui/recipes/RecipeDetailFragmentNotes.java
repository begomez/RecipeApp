package com.recipe_app.client.ui.recipes;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.recipe_app.client.BaseFragment;
import com.recipe_app.client.R;


public class RecipeDetailFragmentNotes extends BaseFragment {

    public static RecipeDetailFragmentNotes newInstance() {
        return newInstance(new Bundle());
    }

    public static RecipeDetailFragmentNotes newInstance(Bundle b) {
        RecipeDetailFragmentNotes frag = new RecipeDetailFragmentNotes();
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.layout = R.layout.fragment_recipes_detail_notes;
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.addAdapter();
//        this.addFloatingButton();
    }

    protected void addAdapter() {
        RecyclerView recyclerView = (RecyclerView) this.getView().findViewById(R.id.list_recipe_notes);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(layoutManager);
//        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
//                                                                                    ((LinearLayoutManager) layoutManager).getOrientation());
//        recyclerView.addItemDecoration(mDividerItemDecoration);
        RecipeNotesAdapter mAdapter = new RecipeNotesAdapter();            //TODO database
        recyclerView.setAdapter(mAdapter);
    }

    //TODO add notes in recipe
    protected void addFloatingButton() {
      /*  FloatingActionButton fab = this.getView().findViewById(R.id.rec_notes_btn_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "New Recipe Note added!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}
