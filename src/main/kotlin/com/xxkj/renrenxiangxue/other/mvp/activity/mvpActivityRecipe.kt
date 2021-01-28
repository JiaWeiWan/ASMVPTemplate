package com.xxkj.renrenxiangxue.other.mvp.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.xxkj.renrenxiangxue.other.mvp.activity.res.layout.mvpActivityXml
import com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package.mvpAcitivityKt
import com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package.mvpModel
import com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package.mvpPresenter

fun RecipeExecutor.mvpActivityRecipe(
        moduleData: ModuleTemplateData,
        activityClass: String,
        layoutName: String,
        packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val mvpActivity = mvpAcitivityKt(projectData.applicationPackage, activityClass, layoutName, packageName)
    // 保存Activity
    save(mvpActivity, srcOut.resolve("${activityClass}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mvpActivityXml(packageName, activityClass), resOut.resolve("layout/${layoutName}.xml"))
    // 保存presenter
    save(mvpPresenter(projectData.applicationPackage, packageName, activityClass), srcOut.resolve("${activityClass}Presenter.${ktOrJavaExt}"))
    // 保存model
    save(mvpModel(projectData.applicationPackage, packageName, activityClass), srcOut.resolve("${activityClass}Model.${ktOrJavaExt}"))
    // 保存contract
    save(mvpModel(projectData.applicationPackage, packageName, activityClass), srcOut.resolve("${activityClass}Contract.${ktOrJavaExt}"))

}