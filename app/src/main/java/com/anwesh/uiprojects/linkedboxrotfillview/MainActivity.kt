package com.anwesh.uiprojects.linkedboxrotfillview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.boxrotfillview.BoxRotFillView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BoxRotFillView.create(this)
    }
}
