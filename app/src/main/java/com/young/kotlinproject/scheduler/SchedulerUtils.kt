package com.young.kotlinproject.scheduler

import com.hazz.kotlinmvp.rx.scheduler.IoMainScheduler

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }
}
