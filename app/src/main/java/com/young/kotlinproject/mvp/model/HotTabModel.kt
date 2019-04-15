package com.young.kotlinproject.mvp.model

import com.young.kotlinproject.mvp.model.bean.TabInfoBean
import com.young.kotlinproject.net.RetrofitManager
import com.young.kotlinproject.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * desc: 热门 Model
 */
class HotTabModel {

    /**
     * 获取 TabInfo
     */
    fun getTabInfo(): Observable<TabInfoBean> {

        return RetrofitManager.service.getRankList()
                .compose(SchedulerUtils.ioToMain())
    }

}
