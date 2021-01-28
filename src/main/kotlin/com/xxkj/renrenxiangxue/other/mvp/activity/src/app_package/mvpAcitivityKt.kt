package com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package

fun mvpAcitivityKt(
        applicationPackage:String?,
        activityClass:String,
        layoutName:String,
        packageName:String
)="""
package $packageName

import ${applicationPackage}.R
import ${applicationPackage}.base.MvpBaseActivity

class ${activityClass}Activity : MvpBaseActivity<${activityClass}Presenter>(), ${activityClass}Contract.View {
    
    override fun initPresenter(): ${activityClass}Presenter = ${activityClass}Presenter()
    
    override fun setTitleId(): Int = R.layout.base_title_layout
    
    override fun setContentId(): Int = R.layout.${layoutName} 
} 
"""