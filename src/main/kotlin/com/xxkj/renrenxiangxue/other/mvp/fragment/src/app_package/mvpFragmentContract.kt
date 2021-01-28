package com.xxkj.renrenxiangxue.other.mvp.fragment.src.app_package

fun mvpContract(
        applicationPackage:String?,
        packageName:String,
        fragmentClass:String
)="""
package $packageName

import ${applicationPackage}.base.basemvp.BaseContract

interface ${fragmentClass}Contract() {

    interface View : BaseContract.BaseView{
       
    }
    
    interface Presenter:BaseContract.BasePresenter{
       
    }
}
"""