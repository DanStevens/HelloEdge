package com.example.helloedge;

import android.content.Context;
import android.widget.RemoteViews;

import com.samsung.android.sdk.look.cocktailbar.SlookCocktailManager;
import com.samsung.android.sdk.look.cocktailbar.SlookCocktailProvider;

public class EdgeWidgetProvider extends SlookCocktailProvider {
    @Override
    public void onUpdate(Context context, SlookCocktailManager cocktailManager, int[] cocktailIds) {
        super.onUpdate(context, cocktailManager, cocktailIds);

        RemoteViews edgeView = new RemoteViews(context.getPackageName(), R.layout.edge_panel);

        if(cocktailIds != null) {
            for(int id : cocktailIds) {
                cocktailManager.updateCocktail(id, edgeView);
            }
        }
    }
}
