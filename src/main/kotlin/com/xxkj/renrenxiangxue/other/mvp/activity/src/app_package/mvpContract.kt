package com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package

fun mvpContract(
        applicationPackage:String?,
        packageName:String,
        activityClass:String
)="""
package $packageName

import ${applicationPackage}.base.basemvp.BaseContract

interface ${activityClass}Contract() {

    interface View : BaseContract.BaseView{
       
    }
    
    interface Presenter:BaseContract.BasePresenter{
       
    }
}
"""