package com.ascentsmartwaves.andnrbyrevamp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AARTI on 27-12-2015.
 */
public class DisplayOtherProductsRecyclerAdapter extends RecyclerView.Adapter<DisplayOtherProductsRecyclerAdapter.ViewHolder>{



    public class ViewHolder extends RecyclerView.ViewHolder {

        public View view;
        public ViewHolder(View v) {
            super(v);

            view =v;
        }
    }

    @Override
    public DisplayOtherProductsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DisplayOtherProductsRecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
