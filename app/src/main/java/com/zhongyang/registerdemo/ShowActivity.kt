package com.zhongyang.registerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*

class ShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        //接收数据
        getIntentData()
    }

    private fun getIntentData() {
        //通过Intent获取数据
        val userName = intent.getStringExtra("key_user_name")
        val password = intent.getStringExtra("key_pwd")
        //设置控件显示内容
        tv_show_userName.text = userName
        tv_show_pwd.text = password
    }
}