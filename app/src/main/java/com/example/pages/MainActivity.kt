package com.example.pages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAccount: Button = findViewById(R.id.btnMyAccount)
        val btnTransaction: Button = findViewById(R.id.btnTransactions)
        val btnSendCash: Button = findViewById(R.id.btnSendMoney)
        val btnSettings: Button = findViewById(R.id.btnSetting)

        btnAccount.setOnClickListener{
           val intent  = Intent(this, MyAccountActivity::class.java)
            startActivity(intent)

        }
        btnSettings.setOnClickListener{
            val intent  = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        btnSendCash.setOnClickListener{
            val intent  = Intent(this, SendmoneyActivity::class.java)
            startActivity(intent)
        }
        btnTransaction.setOnClickListener{
            val intent  = Intent(this, TransactionsActivity::class.java)
            startActivity(intent)
        }

    }
}