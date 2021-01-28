package com.xxkj.renrenxiangxue.other.mvp.fragment

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.xxkj.renrenxiangxue.other.mvp.activity.src.app_package.mvpModel
import com.xxkj.renrenxiangxue.other.mvp.fragment.src.app_package.mvpContract
import com.xxkj.renrenxiangxue.other.mvp.fragment.res.layout.mvpFragmentXml
import com.xxkj.renrenxiangxue.other.mvp.fragment.src.app_package.mvpFragmentKt
import com.xxkj.renrenxiangxue.other.mvp.fragment.src.app_package.mvpFragmentPresenter

fun RecipeExecutor.mvpFragmentRecipe(
        moduleData: ModuleTemplateData,
        fragmentClass: String,
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

    val mvpFragment = mvpFragmentKt(projectData.applicationPackage, fragmentClass, layoutName, packageName)
    // 保存Activity
    save(mvpFragment, srcOut.resolve("${fragmentClass}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mvpFragmentXml(packageName, fragmentClass), resOut.resolve("layout/${layoutName}.xml"))
    // 保存presenter
    save(mvpFragmentPresenter(projectData.applicationPackage, packageName, fragmentClass), srcOut.resolve("${fragmentClass}Presenter.${ktOrJavaExt}"))
    // 保存model
    save(mvpContract(projectData.applicationPackage, packageName, fragmentClass), srcOut.resolve("${fragmentClass}Model.${ktOrJavaExt}"))
    // 保存contract
    save(mvpModel(projectData.applicationPackage, packageName, fragmentClass), srcOut.resolve("${fragmentClass}Contract.${ktOrJavaExt}"))

}