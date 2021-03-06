package com.young.kotlinproject.mvp.contract

import com.young.kotlinproject.base.IBaseView
import com.young.kotlinproject.base.IPresenter
import com.young.kotlinproject.mvp.model.bean.CategoryBean

/**
 * desc: 分类 契约类
 */
interface CategoryContract {

    interface View : IBaseView {
        /**
         * 显示分类的信息
         */
        fun showCategory(categoryList: ArrayList<CategoryBean>)

        /**
         * 显示错误信息
         */
        fun showError(errorMsg:String,errorCode:Int)
    }

    interface Presenter: IPresenter<View> {
        /**
         * 获取分类的信息
         */
        fun getCategoryData()
    }
}