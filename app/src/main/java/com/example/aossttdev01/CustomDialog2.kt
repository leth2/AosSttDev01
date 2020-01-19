import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.aossttdev01.R

class CustomDialog2 : DialogFragment() {
    private lateinit var tv : TextView
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            isCancelable = false
            val builder = AlertDialog.Builder(it)
            val inf = requireActivity().layoutInflater.inflate(R.layout.stt_dialog,null)
            tv = inf.findViewById<TextView>(R.id.stt_message)
            tv.setText("말씀하세요")
            tv.setOnClickListener {
                tv.setText("바꿨어요")
            }
            builder.setView(inf)
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    fun changeMessage(str : String) {
        tv.setText(str)
    }
}