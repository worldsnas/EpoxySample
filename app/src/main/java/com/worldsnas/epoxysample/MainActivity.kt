package com.worldsnas.epoxysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val images = listOf(
        "https://unsplash.com/photos/eqFOKASP2ww/download?force=true",
        UUID.randomUUID().toString(),
        "https://unsplash.com/photos/mWqwd1jtDAM/download?force=true",
        "https://unsplash.com/photos/16CsJNasu74/download?force=true",
        UUID.randomUUID().toString(),
        UUID.randomUUID().toString(),
        UUID.randomUUID().toString(),
        "https://unsplash.com/photos/K3q1KVUeGQY/download?force=true",
        "https://unsplash.com/photos/wL8Yx2tOmYI/download?force=true",
        "https://unsplash.com/photos/7OWVghYY2xM/download?force=true",
        "https://unsplash.com/photos/lEvxp3JQAK4/download?force=true",
        "https://unsplash.com/photos/GJ8ZQV7eGmU/download?force=true",
        "https://unsplash.com/photos/em7gIbjEL0I/download?force=true",
        "https://unsplash.com/photos/OgR0fme8RVQ/download?force=true",
        "https://unsplash.com/photos/akQ06aB6MfM/download?force=true",
        "https://unsplash.com/photos/vvme8J-gJVE/download?force=true",
        "https://unsplash.com/photos/yV0nQYOgAvI/download?force=true",
        "https://unsplash.com/photos/hrZ6ZnheaYk/download?force=true",
        UUID.randomUUID().toString()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listEpoxy.withModels {
            images.forEach {
                if (Patterns.WEB_URL.matcher(it).matches()) {
                    ImageModel(
                        it
                    )
                        .id(it)
                        .addTo(this)
                } else {
                    TextModel(
                        it
                    )
                        .id(it)
                        .addTo(this)
                }
            }
        }
    }
}
