package com.young.kotlinproject.mvp.presenter

import com.young.kotlinproject.base.BasePresenter
import com.young.kotlinproject.mvp.contract.HotTabContract
import com.young.kotlinproject.mvp.model.HotTabModel
import com.young.kotlinproject.net.exception.ExceptionHandle

/**
 * desc: 获取 TabInfo Presenter
 */
class HotTabPresenter: BasePresenter<HotTabContract.View>(), HotTabContract.Presenter {

    private val hotTabModel by lazy { HotTabModel() }


    override fun getTabInfo() {
        checkViewAttached()
        mRootView?.showLoading()
        val disposable = hotTabModel.getTabInfo()
                .subscribe({
                    tabInfo->
                    mRootView?.setTabInfo(tabInfo)
                },{
                    throwable->
                    //处理异常
                    mRootView?.showError(ExceptionHandle.handleException(throwable), ExceptionHandle.errorCode)
                })
        addSubscription(disposable)
    }
}