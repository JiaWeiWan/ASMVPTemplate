package com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package

fun mvpModel(
        applicationPackage:String?,
        packageName:String,
        activityClass:String
)="""
package $packageName

import ${applicationPackage}.base.basemvp.BaseModel

class ${activityClass}Model : BaseModel() {

}
"""