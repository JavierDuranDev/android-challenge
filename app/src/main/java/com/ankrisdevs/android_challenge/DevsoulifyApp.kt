package com.ankrisdevs.android_challenge

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Fichero application --> fichero que se ejecuta nada más abrirse la app. Es donde se hacen configuraciones globales.
//Este fichero hay que definirlo en el MANIFEST
@HiltAndroidApp
class DevsoulifyApp : Application()