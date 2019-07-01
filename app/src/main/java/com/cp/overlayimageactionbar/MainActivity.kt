package com.cp.overlayimageactionbar


import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titleTextView.text ="hello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\n" +
                "hello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\n" +
                "hello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\n" +
                "hello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\n" +
                "hello\nhello\nhello\nhello\nhello\n" +
                "hello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\n" +
                "hello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\nhello\n" +
                "hello\nhello\nhello\nhello\nhello\nhello\n" +
                "" +
                "" +
                "" +
                ""


//        initViewSingle()
//        setUpBanner()


    }



//    private fun setUpBanner(image: List<Banner>) {
//        viewPagerSingle.addOnPageChangeListener(pagerAdapterSingle)
//    }
//
//    private fun initViewSingle() {
//        val metrics = DisplayMetrics()
//        windowManager.defaultDisplay.getMetrics(metrics)
//        pagerAdapterSingle = ViewPagerAdapter(this, supportFragmentManager)
//        pagerAdapterSingle.notifyDataSetChanged()
//
//        viewPagerSingle.apply {
//            adapter = pagerAdapterSingle
//            offscreenPageLimit = 3
//            visibility = View.INVISIBLE
////            layoutParams.height = resources.getDimension(R.dimen.carousel_view_height).toInt()
//        }
//
//        loopIndicatorSingle = LoopPagerIndicator(this, pagesContainerSingle, viewPagerSingle, R.drawable.indicator_circle)
//
//    }

}
