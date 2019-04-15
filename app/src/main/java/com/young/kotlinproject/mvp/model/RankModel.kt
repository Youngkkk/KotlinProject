package com.young.kotlinproject.mvp.model

import com.young.kotlinproject.mvp.model.bean.HomeBean
import com.young.kotlinproject.net.RetrofitManager
import com.young.kotlinproject.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * desc: 排行榜 Model
 */
class RankModel {

    /**
     * 获取排行榜
     */
    fun requestRankList(apiUrl:String): Observable<HomeBean.Issue> {

        return RetrofitManager.service.getIssueData(apiUrl)
                .compose(SchedulerUtils.ioToMain())
    }

}
