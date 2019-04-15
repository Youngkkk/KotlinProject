package com.young.kotlinproject.mvp.model

import com.young.kotlinproject.mvp.model.bean.CategoryBean
import com.young.kotlinproject.net.RetrofitManager
import com.young.kotlinproject.scheduler.SchedulerUtils
import io.reactivex.Observable

/**
 * desc: 分类数据模型
 */
class CategoryModel {


    /**
     * 获取分类信息
     */
    fun getCategoryData(): Observable<ArrayList<CategoryBean>> {
        return RetrofitManager.service.getCategory()
                .compose(SchedulerUtils.ioToMain())
    }
}