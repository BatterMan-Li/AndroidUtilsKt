package com.lindroid.androidutilskt.extension.logcat.printer

import com.lindroid.androidutilskt.extension.logcat.LogLevel
import com.lindroid.androidutilskt.extension.logcat.logadapter.LogAdapter

/**
 * @author Lin
 * @date 2019/3/19
 * @function
 * @Description
 */
interface Printer {

    fun v(tag: String?, message: String?, vararg args: Any?)

    fun i(tag: String?, message: String?, vararg args: Any?)

    fun d(tag: String?, message: String?, vararg args: Any?)

    fun d(tag: String?, content: Any?)

    fun w(tag: String?, message: String?, vararg args: Any?)

    fun e(tag: String?, throwable: Throwable? = null, message: String?, vararg args: Any?)

    fun wtf(tag: String?, message: String?, vararg args: Any?)

    fun json(tag: String?, json: String?)

    fun xml(tag: String?, xml: String?)

    fun log(@LogLevel level: Int, tag: String?, message: String?, throwable: Throwable?)

    fun addAdapter(adapter: LogAdapter)

    fun clearLogAdapters()

    /**
     * 重置成全局设置
     */
    fun resetLogAdapter()
}