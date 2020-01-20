package com.example.myapplication.ListFilm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.ListFilm2.Watch;
import com.example.myapplication.R;

import java.util.ArrayList;

public class ListWatchAdapter extends RecyclerView.Adapter<ListWatchAdapter.ViewHolder> {
    private Context context;
    private OnItemClickListener onItemClickListener;
    private ArrayList<Watch> list;

    public ListWatchAdapter(Context context, ArrayList<Watch> list){
        this.context =context;
        this.list=list;
    }
    public void updatelist(ArrayList<Watch> list){
        this.list=list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_film_list,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final Watch watch =getItem(position);


        holder.textView1.setText(watch.getTitle());

        if (watch.getOverview().length()>50){
            holder.textView2.setText(watch.getOverview().substring(0,49)+"....");
        }else {
            holder.textView2.setText(watch.getOverview());
        }
        holder.imageView.setImageResource(watch.getPoster());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickListener.onItemClick(holder.itemView,position,list.get(position));
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
    public void SetOnClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    private Watch getItem(int position){
        return list.get(position);
    }
    public interface  OnItemClickListener{
        void onItemClick(View view,int position,Watch watch);
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;

        public ViewHolder(final View itemView) {
            super(itemView);

            this.imageView =itemView.findViewById(R.id.fotodetail);
            this.textView1=itemView.findViewById(R.id.judulfilm);
            this.textView2=itemView.findViewById(R.id.item_overview);




        }
    }

    }

