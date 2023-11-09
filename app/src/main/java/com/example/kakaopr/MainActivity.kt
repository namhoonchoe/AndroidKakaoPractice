package com.example.kakaopr

// 네비게이션 패키지
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.kakaopr.databinding.ActivityMainBinding


class  MainActivity : AppCompatActivity() {

    companion object {
        const val TAG: String = "로그"
    }
//????? 컴페니언 오브젝트??

    private lateinit  var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        //바인딩 인플레이트 설정
        setContentView(activityMainBinding.root)

        // 네비게이션들을 담는 호스트
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment

        // 네비게이션 컨트롤러
        val kakaoNavController = navHostFragment.navController

        //activityMainBinding. => 다음에 뭐가 오는지 이해안됨?
        NavigationUI.setupWithNavController(activityMainBinding.bottomNavigation,kakaoNavController)
    }
}

