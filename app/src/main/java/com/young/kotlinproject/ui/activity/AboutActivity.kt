package com.young.kotlinproject.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import com.young.kotlinproject.MyApplication
import com.young.kotlinproject.R
import com.young.kotlinproject.base.BaseActivity
import com.young.kotlinproject.utils.AppUtils
import com.young.kotlinproject.utils.StatusBarUtil
import kotlinx.android.synthetic.main.activity_about.*

/**
 * desc: 关于
 */
class AboutActivity : BaseActivity() {
    override fun layoutId(): Int = R.layout.activity_about

    override fun initData() {
    }

    @SuppressLint("SetTextI18n")
    override fun initView() {
        StatusBarUtil.darkMode(this)
        StatusBarUtil.setPaddingSmart(this, toolbar)

        tv_version_name.text ="v${AppUtils.getVerName(MyApplication.context)}"
        //返回
        toolbar.setNavigationOnClickListener { finish() }
        //访问 GitHub
        relayout_gitHub.setOnClickListener {
            val uri = Uri.parse("https://github.com/Youngkkk/KotlinStudy")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }

    override fun start() {

    }
}
