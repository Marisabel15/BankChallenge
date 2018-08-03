package com.example.belale.santanderproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.belale.santanderproject.R;
import com.example.belale.santanderproject.models.models.parts.DownInfo;


import java.util.List;

public class DownInfoAdapter extends RecyclerView.Adapter<DownInfoAdapter.ViewHolder> {

    Context mContext;
    List<DownInfo> downInfoList;


    public DownInfoAdapter(Context mContext, List<DownInfo> downInfoList) {
        this.mContext = mContext;
        this.downInfoList = downInfoList;
    }

    @Override
    public DownInfoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from( mContext ).inflate( R.layout.down_info_list, parent, false);
        DownInfoAdapter.ViewHolder viewHolder = new DownInfoAdapter.ViewHolder( view );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DownInfoAdapter.ViewHolder holder, final int position) {
        DownInfo downInfo = downInfoList.get( position );
        holder.tvTaxa.setText(downInfoList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return downInfoList.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTaxa;

        public ViewHolder(View itemView) {
            super( itemView );

            tvTaxa = (TextView) itemView.findViewById( R.id.tvName_1 );
         }
    }}
