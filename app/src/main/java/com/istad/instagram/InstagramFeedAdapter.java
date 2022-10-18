package com.istad.instagram;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InstagramFeedAdapter extends RecyclerView.Adapter<InstagramFeedAdapter.InstagramFeedViewHolder> {

    @NonNull
    @Override
    public InstagramFeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull InstagramFeedViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class InstagramFeedViewHolder extends RecyclerView.ViewHolder{

        ImageView profile, picture, like, message, bookmark, send, moreOption;
        TextView name, username, totalLikes, viewComments, momentAgo, caption;

//        int[] imageViewsID = {R.id.profile, };

        public InstagramFeedViewHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.profile);
            picture = itemView.findViewById(R.id.picture);
            like = itemView.findViewById(R.id.like);
            message = itemView.findViewById(R.id.message);
            bookmark = itemView.findViewById(R.id.bookmark);
            send = itemView.findViewById(R.id.send);
            moreOption = itemView.findViewById(R.id.more_option);
            name = itemView.findViewById(R.id.name);
            username = itemView.findViewById(R.id.username);
            totalLikes = itemView.findViewById(R.id.total_likes);
            viewComments = itemView.findViewById(R.id.view_comments);
            momentAgo = itemView.findViewById(R.id.moment_ago);
            caption = itemView.findViewById(R.id.caption);

        }
    }
}
