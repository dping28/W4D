package com.ping_consultants.whats4dinner;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openInventoryActivity(View v){
        // Opens new Activity - Inventory
        Intent InvAct = new Intent(this, InventoryActivity.class);
        startActivity(InvAct);
    }

    public void openShoppingListActivity(View v) {
        // Opens new Activity - Shopping List
        Intent ShopLst = new Intent(this, ShoppingListActivity.class);
        startActivity(ShopLst);
    }

    public void openRecipesActivity(View v){
        // Opens new Activity - Recipes
        Intent Recipes = new Intent(this, RecipesActivity.class);
        startActivity(Recipes);
    }

    public void openScheduledMealsActivity(View v) {
        // Opens new Activity - Scheduled Meals
        Intent SchdMeals = new Intent(this, ScheduledMealsActivity.class);
        startActivity(SchdMeals);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
