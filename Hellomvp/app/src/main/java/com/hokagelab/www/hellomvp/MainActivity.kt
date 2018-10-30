package com.hokagelab.www.hellomvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.hokagelab.www.footballmatch.R
import com.hokagelab.www.hellomvp.model.BasicModel
import com.hokagelab.www.hellomvp.presenter.BasicPresenter
import com.hokagelab.www.hellomvp.view.BasicView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), BasicView {

    private lateinit var btnClickMe : Button
    private lateinit var presenter: BasicPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = BasicModel(this)

        btnClickMe = btn

        presenter.datas()

        btnClickMe.setOnClickListener {
            presenter.clickMe()
        }

    }

    override fun datasa(text: String) {
        txt.text = text
    }

    override fun clickSuccess(text: String) {
        val toast = Toast.makeText(applicationContext, text, Toast.LENGTH_SHORT)
        toast.show()
    }

}
