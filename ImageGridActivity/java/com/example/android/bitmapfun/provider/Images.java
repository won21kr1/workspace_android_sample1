/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bitmapfun.provider;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * This are PicasaWeb URLs and could potentially change. Ideally the PicasaWeb API should be
     * used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageUrls = new String[] {
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hhl.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_sjl.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_igis.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_bua.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_12b.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_chu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_kiu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_nbu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_test12.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_kdu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_kgu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_knu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_kookm.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_kpu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_mjc.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_nsr.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_olt.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_pjl.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_puu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_sample.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_sgu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_sju.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_slu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_smu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_sook.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_ssu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_swu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_syu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_tauto.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_tuu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_unist.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_yju.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_yonsei.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_ysanu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_ysu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_bcu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_cau.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_cwu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_dank.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_dau.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_deu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_dju.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_dsu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_ewha.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_gcu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hanyang.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hiu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hku.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hnu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hrw.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hseu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_hsu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_ihu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/bg_jbu.png",
    };

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally the PicasaWeb API
     * should be used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageThumbUrls = new String[] {
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hhl.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_sjl.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_igis.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_bua.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_12b.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_chu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_kiu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_nbu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_test12.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_kdu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_kgu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_knu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_kookm.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_kpu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_mjc.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_nsr.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_olt.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_pjl.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_puu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_sample.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_sgu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_sju.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_slu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_smu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_sook.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_ssu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_swu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_syu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_tauto.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_tuu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_unist.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_yju.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_yonsei.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_ysanu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_ysu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_bcu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_cau.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_cwu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_dank.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_dau.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_deu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_dju.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_dsu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_ewha.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_gcu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hanyang.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hiu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hku.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hnu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hrw.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hseu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_hsu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_ihu.png",
            "http://tlib.autoenglish.co.kr/newpage/image/applib_android/v2_library_jbu.png",
    };
}
