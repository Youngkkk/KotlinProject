package com.young.kotlinproject.mvp.model

import com.young.kotlinproject.mvp.model.bean.HomeBean
import com.young.kotlinproject.net.RetrofitManager
import com.young.kotlinproject.scheduler.SchedulerUtils
import io.reactivex.Observable

class VideoDetailModel {

    fun requestRelatedData(id:Long):Observable<HomeBean.Issue>{

        return RetrofitManager.service.getRelatedData(id)
                .compose(SchedulerUtils.ioToMain())
    }

}