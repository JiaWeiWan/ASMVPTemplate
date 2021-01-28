package com.xxkj.renrenxiangxue.other.mvp.fragment.src.app_package

fun mvpFragmentModel(
        applicationPackage:String?,
        packageName:String,
        fragmentClass:String
)="""
package $packageName

import ${applicationPackage}.base.basemvp.BaseModel

class ${fragmentClass}Model : BaseModel() {

}
"""