package com.young.kotlinproject.mvp.contract

import com.young.kotlinproject.base.IBaseView
import com.young.kotlinproject.base.IPresenter
import com.young.kotlinproject.mvp.model.bean.HomeBean

/**
 * desc: 契约类
 */
interface RankContract {

    interface View: IBaseView {
        /**
         * 设置排行榜的数据
         */
        fun setRankList(itemList: ArrayList<HomeBean.Issue.Item>)

        fun showError(errorMsg:String,errorCode:Int)
    }


    interface Presenter: IPresenter<View> {
        /**
         * 获取 TabInfo
         */
        fun requestRankList(apiUrl:String)
    }
}