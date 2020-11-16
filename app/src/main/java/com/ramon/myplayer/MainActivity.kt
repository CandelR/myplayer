package com.ramon.myplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.ramon.myplayer.models.MediaItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaItemList = listOf<MediaItem>(
                MediaItem("Title 1", "https://placekitten.com/200/200?image=1"),
                MediaItem("Title 2", "https://placekitten.com/200/200?image=2"),
                MediaItem("Title 3", "https://placekitten.com/200/200?image=3"),
                MediaItem("Title 4", "https://placekitten.com/200/200?image=4"),
                MediaItem("Title 5", "https://placekitten.com/200/200?image=5"),
                MediaItem("Title 6", "https://placekitten.com/200/200?image=6"),
                MediaItem("Title 7", "https://placekitten.com/200/200?image=7"),
                MediaItem("Title 8", "https://placekitten.com/200/200?image=8"),
                MediaItem("Title 9", "https://placekitten.com/200/200?image=9"),
                MediaItem("Title 10", "https://placekitten.com/200/200?image=10"),
        )

        val recycler: RecyclerView = findViewById(R.id.recycler)
        recycler.adapter = MediaItemAdapter(mediaItemList)
        toast("Hello toast")
    }


}
