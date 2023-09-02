package mai.hu.beast.first.loginscreen

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity(){
    private lateinit var create : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse(videoUrl))
        intent.setPackage("com.google.android.youtube")
        create = findViewById(R.id.create)

        create.setOnClickListener{

            startActivity(intent)
        }

    }
}