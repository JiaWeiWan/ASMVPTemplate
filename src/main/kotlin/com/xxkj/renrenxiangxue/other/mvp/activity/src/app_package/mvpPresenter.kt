package com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package

fun mvpPresenter(
        applicationPackage:String?,
        packageName:String,
        activityClass:String
)="""
package $packageName

import ${applicationPackage}.base.basemvp.BasePresenter

class ${activityClass}Presenter : BasePresenter<${activityClass}Contract.View>(), ${activityClass}Contract.Presenter {
   
    private val model by lazy { ${activityClass}Model() }

}    
"""