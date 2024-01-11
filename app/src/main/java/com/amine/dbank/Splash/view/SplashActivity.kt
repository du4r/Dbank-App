package com.amine.dbank.Splash.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.amine.dbank.R
import com.amine.dbank.Splash.Splash
import com.amine.dbank.Splash.presenter.SplashPresenter
import com.amine.dbank.databinding.ActivitySplashBinding

class splashActivity : AppCompatActivity(), Splash.View<SplashPresenter> {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this,R.color.green_lemon)
    }

    override var presenter: SplashPresenter
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun goToHome() {
        TODO("Not yet implemented")
    }

    override fun goToLogin() {
        TODO("Not yet implemented")
    }
}