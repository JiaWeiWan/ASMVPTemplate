package com.xxkj.renrenxiangxue.other.mvp.fragment.src.app_package

fun mvpFragmentKt(
        applicationPackage:String?,
        fragmentClass:String,
        layoutName:String,
        packageName:String
)="""
package $packageName

import ${applicationPackage}.R
import ${applicationPackage}.base.MvpBaseFragment

class ${fragmentClass}Fragment : MvpBaseFragment<${fragmentClass}Presenter>(), ${fragmentClass}Contract.View {
    override fun initPresenter(): ${fragmentClass}Presenter = ${fragmentClass}Presenter()
    
    override fun contentLayoutId(): Int = R.layout.${layoutName} 

} 
"""