package com.xxkj.renrenxiangxue.other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import com.xxkj.renrenxiangxue.other.mvp.activity.mvpActivityTemplate
import com.xxkj.renrenxiangxue.other.mvp.fragment.mvpFragmentTemplate

class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> = listOf(
            // activity的模板
            mvpActivityTemplate,
            // fragment的模板
            mvpFragmentTemplate
    )
}