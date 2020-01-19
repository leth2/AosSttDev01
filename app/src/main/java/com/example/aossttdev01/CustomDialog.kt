package com.example.aossttdev01

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.stt_dialog.*

class CustomDialog(context:Context) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setCanceledOnTouchOutside(false)
        window?.setBackgroundDrawable(ColorDrawable())
        window?.setDimAmount(0.0f)

        setContentView(R.layout.stt_dialog)
    }
    class Builder(context:Context) {
        private val dialog = CustomDialog(context)
        fun show() : CustomDialog {
            dialog.setTitle("1111")
            dialog.show()
            return dialog
        }
    }
}

