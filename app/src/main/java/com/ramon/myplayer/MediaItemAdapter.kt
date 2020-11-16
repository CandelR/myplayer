package com.ramon.myplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ramon.myplayer.models.MediaItem

class MediaItemAdapter(private val mediaItemList: List<MediaItem>) :
        RecyclerView.Adapter<MediaItemAdapter.MediaItemViewHolder>() {

    class MediaItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val title: TextView = itemView.findViewById(R.id.mediaTitle)
        private val thumb: ImageView = itemView.findViewById(R.id.mediaThumb)

        fun bind(mediaItem: MediaItem) {
            title.text = mediaItem.title
            Glide.with(thumb).load(mediaItem.url).into(thumb)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MediaItemAdapter.MediaItemViewHolder {
        val mediaItemView = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.view_media_item, parent, false)
        return MediaItemViewHolder(mediaItemView)
    }

    override fun onBindViewHolder(holder: MediaItemViewHolder, position: Int) {
        val item = mediaItemList[position]
        holder.bind(item)
    }

    override fun getItemCount() = mediaItemList.size

}