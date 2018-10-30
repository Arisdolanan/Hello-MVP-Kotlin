package com.hokagelab.www.hellomvp.model

import com.hokagelab.www.hellomvp.presenter.BasicPresenter
import com.hokagelab.www.hellomvp.view.BasicView

class BasicModel(private val basicView: BasicView) :
    BasicPresenter() {

    override fun clickMe() {
        basicView.clickSuccess(helloTag)
    }

    override fun datas(){
        basicView.datasa(nama)
    }

    companion object {
        val helloTag = "Hello, MVP Kotlin!"
        val nama = "Hai Kotlin"
    }
}