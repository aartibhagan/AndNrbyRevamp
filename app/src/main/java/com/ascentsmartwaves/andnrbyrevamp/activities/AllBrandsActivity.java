package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.ascentsmartwaves.andnrbyrevamp.R;

public class AllBrandsActivity extends Activity {
    private RecyclerView allBrandsRecyclerView;
    private RecyclerView.Adapter allBrandsAdapter;
    private RecyclerView.LayoutManager allBrandsLayoutManager;
    RelativeLayout showMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_brands);

        findViews();
        measuringTheAdapterLayout();

    }


        private void findViews(){

            allBrandsRecyclerView = (RecyclerView) findViewById(R.id.all_brands_recycler_view);
            showMenu = (RelativeLayout) findViewById(R.id.showMenu);

        }



    private void measuringTheAdapterLayout(){

        allBrandsLayoutManager = new LinearLayoutManager(getApplicationContext());
        allBrandsRecyclerView.setLayoutManager(allBrandsLayoutManager);
        allBrandsRecyclerView.setHasFixedSize(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_all_brands, menu);
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
