package junior.bernardino.com.br.calculadorakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView

class MainActivity : AppCompatActivity() {

    @BindView(R.id.tvDisplay)
    lateinit var tvDisplay : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay.text = ""
        tvDisplay.requestFocus()
    }
}