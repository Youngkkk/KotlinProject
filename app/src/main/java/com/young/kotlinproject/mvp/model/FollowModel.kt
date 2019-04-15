package com.young.kotlinproject.mvp.model

import com.young.kotlinproject.mvp.model.bean.HomeBean
import com.young.kotlinproject.net.RetrofitManager
import com.young.kotlinproject.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * desc: 关注Model
 */
class FollowModel {

    /**
     * 获取关注信息
     */
    fun requestFollowList(): Observable<HomeBean.Issue> {

        return RetrofitManager.service.getFollowInfo()
                .compose(SchedulerUtils.ioToMain())
    }

    /**
     * 加载更多
     */
    fun loadMoreData(url:String):Observable<HomeBean.Issue>{
        return RetrofitManager.service.getIssueData(url)
                .compose(SchedulerUtils.ioToMain())
    }


}
