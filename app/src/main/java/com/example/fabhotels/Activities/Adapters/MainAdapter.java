package com.example.fabhotels.Activities.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fabhotels.Activities.DetailActivity;
import com.example.fabhotels.Activities.Models.MainModel;
import com.example.fabhotels.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder>{

    ArrayList<MainModel> list;
    Context context;

    public MainAdapter(ArrayList<MainModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        final MainModel model = list.get(position);
        holder.image.setImageResource(model.getImage());
        holder.price.setText(model.getPrice());
        holder.description.setText(model.getDescription());
        holder.mainName.setText(model.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image" , model.getImage());
                intent.putExtra("price" , model.getPrice());
                intent.putExtra("name" , model.getName());
                intent.putExtra("desc" ,model.getDescription());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView mainName,price,description;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.imageView2);
            mainName = itemView.findViewById(R.id.mainName);
            price = itemView.findViewById(R.id.price);
            description = itemView.findViewById(R.id.description);



        }
    }
}
