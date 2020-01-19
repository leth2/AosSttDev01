package com.example.aossttdev01

import CustomDialog2
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.stt_dialog.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_button.setOnClickListener {
            val dialog = CustomDialog2()
            dialog.show(supportFragmentManager,"dialog")
            val hd = Handler()
            hd.postDelayed({
                dialog.changeMessage("jajan")
                Log.d("delayed","jajan")
                hd.postDelayed({dialog.dismiss()},2000)
            },2000)

        }
    }
}
