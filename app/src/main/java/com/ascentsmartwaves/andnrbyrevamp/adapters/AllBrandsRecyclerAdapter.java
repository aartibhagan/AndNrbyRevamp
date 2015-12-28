package com.ascentsmartwaves.andnrbyrevamp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by AARTI on 25-12-2015.
 */
public class AllBrandsRecyclerAdapter extends RecyclerView.Adapter<AllBrandsRecyclerAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //should implement the onclicklistener
        // each data item is just a string in this case
        AdapterView.OnItemClickListener onItemClickListener;
        public View view;

        public ViewHolder(View v) {
            super(v);
            view = v;
        }
    }


    @Override
    public AllBrandsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AllBrandsRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
