package sharma.gq.toaster

import android.content.Context
import android.widget.Toast

object Toasty {
    fun setText(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}