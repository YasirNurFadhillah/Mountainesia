package id.kuliah.mouintainesiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        textView_regist_log.setOnClickListener(){
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        Login_btn_log.setOnClickListener(){
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

}
