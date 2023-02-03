package com.example.m5_hw5.ui

import java.io.Serializable

data class Model(
    var  img : Int? = null,
    var title : String? = null,
    var description : String? = null,
    var isLast: Boolean? = false,
    var bg:Int?=null
): Serializable