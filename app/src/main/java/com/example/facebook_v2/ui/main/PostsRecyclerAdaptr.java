package com.example.facebook_v2.ui.main;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebook_v2.R;
import com.example.facebook_v2.pojo.PostModel;

import java.util.ArrayList;

public class PostsRecyclerAdaptr extends RecyclerView.Adapter<PostsRecyclerAdaptr.PostViewHolder> {
    private ArrayList<PostModel> postsList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.titleTv.setText(postsList.get(position).getTitle());
        holder.userIdTv.setText(postsList.get(position).getUserId()+"");
        holder.bodyTv.setText(postsList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }


    @SuppressLint("NotifyDataSetChanged")
    public void setPostsList(ArrayList<PostModel> newPostsList) {
        this.postsList = newPostsList;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        TextView titleTv, userIdTv, bodyTv;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTv = itemView.findViewById(R.id.titleTv);
            userIdTv= itemView.findViewById(R.id.userIdTv);
            bodyTv = itemView.findViewById(R.id.bodyTv);
        }
    }
}
