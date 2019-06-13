package com.recipe_app.client.db;


import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

@Database(entities={TableRecipe.class, TableIngredient.class,
                    TableRecipeIngredients.class, TableRecipePreparation.class,
                    TableRecipeNotes.class},
            version = 1,
            exportSchema = false)
public abstract class RecipeAppDatabase extends RoomDatabase {

    public abstract RecipeAppDao recipeDao();

    private static volatile RecipeAppDatabase INSTANCE;

    public static RecipeAppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (RecipeAppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            RecipeAppDatabase.class, "recipe_app_db.db")
                            .addCallback(sRoomDatabaseCallback).build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback =
            new RoomDatabase.Callback(){

                @Override
                public void onOpen (@NonNull SupportSQLiteDatabase db){
                    super.onOpen(db);
                    new PopulateDbAsync(INSTANCE).execute();
                }
            };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final RecipeAppDao mDao;

        PopulateDbAsync(RecipeAppDatabase db) {
            mDao = db.recipeDao();
        }

        @Override
        protected Void doInBackground(final Void... params) {
            mDao.deleteAllRecipes();
            TableRecipe trec = new TableRecipe("Pa de Platan");
            mDao.insertRecipe(trec);
            trec = new TableRecipe("Llobarro al forn");
            mDao.insertRecipe(trec);
            return null;
        }
    }
}
