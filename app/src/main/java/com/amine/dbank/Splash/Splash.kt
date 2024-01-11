package com.amine.dbank.Splash

interface Splash {

    interface View<T>{
        var presenter: T
        fun goToHome()
        fun goToLogin()
    }

    interface presenter{
        fun authenticated()
    }
}