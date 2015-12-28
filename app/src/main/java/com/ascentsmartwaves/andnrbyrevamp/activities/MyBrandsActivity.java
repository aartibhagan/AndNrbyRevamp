package com.ascentsmartwaves.andnrbyrevamp.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;


import com.ascentsmartwaves.andnrbyrevamp.R;

public class MyBrandsActivity extends Activity {

    private RecyclerView myBrandsRecyclerView;
    private RecyclerView.Adapter myBrandsAdapter;
    private RecyclerView.LayoutManager myBrandsLayoutManager;
    RelativeLayout showMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_brands);
        findViews();
        measuringTheAdapterLayout();

    }

    private void findViews()
    {
        myBrandsRecyclerView = (RecyclerView) findViewById(R.id.my_brands_recycler_view);
        showMenu = (RelativeLayout) findViewById(R.id.showMenu);
    }

    private void measuringTheAdapterLayout(){

        myBrandsLayoutManager = new LinearLayoutManager(getApplicationContext());
        myBrandsRecyclerView.setLayoutManager(myBrandsLayoutManager);
        myBrandsRecyclerView.setHasFixedSize(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_brands, menu);
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
