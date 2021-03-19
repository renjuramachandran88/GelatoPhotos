package com.gelatotest.gelatophotos

class MockApp: PicsumPhotosApplication() {
    val appComponentForTest: AppComponentForTest by lazy {
        DaggerAppComponentForTest.factory().create(applicationContext)
    }


}
