package com.xxkj.renrenxiangxue.other.mvp.fragment.src.app_package

fun mvpFragmentPresenter(
        applicationPackage:String?,
        packageName:String,
        fragmentClass:String
)="""
package $packageName

import ${applicationPackage}.base.basemvp.BasePresenter

class ${fragmentClass}Presenter : BasePresenter<${fragmentClass}Contract.View>(), ${fragmentClass}Contract.Presenter {
   
    private val model by lazy { ${fragmentClass}Model() }

}    
"""