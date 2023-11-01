package com.example.kakaopr

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kakaopr.Fragment.ChatFragment
import com.example.kakaopr.Fragment.GroupChatFragment
import com.example.kakaopr.Fragment.HomeFragment
import com.example.kakaopr.Fragment.ShopFragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

import com.example.kakaopr.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {

    private lateinit var homeFragment: HomeFragment
    private lateinit var chatFragment: ChatFragment
    private lateinit var groupChatFragment: GroupChatFragment
    private lateinit var shopFragment: ShopFragment

    companion object {
        const val TAG: String = "로그"
    }


    private var activityMainBinding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 레이아웃과 연결
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")



    }




}

