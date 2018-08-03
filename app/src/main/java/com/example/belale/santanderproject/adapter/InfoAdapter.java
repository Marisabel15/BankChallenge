package com.example.belale.santanderproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.belale.santanderproject.R;
import com.example.belale.santanderproject.models.models.parts.Info;

import java.util.List;


public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {

        Context mContext;
        List<Info> infoList;


    public InfoAdapter(Context mContext, List<Info> infoList) {
        this.mContext = mContext;
        this.infoList = infoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from( mContext ).inflate(R.layout.info_list, parent, false);
        ViewHolder viewHolder = new ViewHolder( view );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Info info = infoList.get( position );
        holder.tvTaxa.setText(infoList.get(position).getName());
        holder.tvValor.setText(infoList.get(position).getData());
    }

    @Override
    public int getItemCount() {
        return infoList.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTaxa, tvValor;

        public ViewHolder(View itemView) {
            super( itemView );

            tvTaxa = (TextView) itemView.findViewById( R.id.tvName );
            tvValor = (TextView) itemView.findViewById( R.id.tvData );
        }
    }}














