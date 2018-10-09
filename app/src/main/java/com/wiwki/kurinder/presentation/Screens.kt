package com.wiwki.kurinder.presentation

import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import com.wiwki.kurinder.presentation.code_check.CodeCheckFragment
import com.wiwki.kurinder.presentation.login.LoginFragment
import com.wiwki.kurinder.presentation.main.MainActivity
import com.wiwki.kurinder.presentation.phone.PhoneFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    class MainScreen : SupportAppScreen() {
        override fun getActivityIntent(context: Context?): Intent = Intent(context, MainActivity::class.java)
    }

    class LoginScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = LoginFragment()
    }

    class PhoneScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = PhoneFragment()
    }

    class CodeCheckScreen(private val phone: String, private val verificationId: String) : SupportAppScreen() {
        override fun getFragment(): Fragment = CodeCheckFragment.newInstance(phone, verificationId)
    }
}