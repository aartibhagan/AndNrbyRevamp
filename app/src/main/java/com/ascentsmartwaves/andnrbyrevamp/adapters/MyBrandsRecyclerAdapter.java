package com.ascentsmartwaves.andnrbyrevamp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

/**
 * Created by AARTI on 25-12-2015.
 */
public class MyBrandsRecyclerAdapter extends RecyclerView.Adapter<MyBrandsRecyclerAdapter.ViewHolder> {

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
    public MyBrandsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyBrandsRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
