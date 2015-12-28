package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.ascentsmartwaves.andnrbyrevamp.R;

public class DisplayProductActivity extends Activity {


    private RecyclerView otherProductsRecyclerView;
    private RecyclerView.Adapter otherProductsRecyclerAdapter;
    private RecyclerView.LayoutManager otherProductsLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product);

        findViews();
        measuringTheAdapterLayout();
    }

    public void findViews(){

        otherProductsRecyclerView = (RecyclerView) findViewById(R.id.other_products_recycler_view_display_product_activity);
    }

    public void measuringTheAdapterLayout(){

        otherProductsLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        otherProductsRecyclerView.setLayoutManager(otherProductsLayoutManager);
        otherProductsRecyclerView.setHasFixedSize(true);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_product, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
