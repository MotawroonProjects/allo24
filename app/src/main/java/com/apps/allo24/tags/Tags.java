package com.apps.allo24.tags;

import android.os.Environment;

public class Tags {
    public static String base_url = "http://emdad.eparfum.net/";
    public static final String IMAGE_URL= base_url+"storage/";
    public static final String IMAGE_Places_URL = "https://maps.googleapis.com/maps/api/place/photo?maxwidth=400&photoreference=";
    public static final String sign_up_driver_success = base_url+"register/success";
    public static final String sign_up_driver_failed = base_url+"register/fail";

    public static final String session_login = "login";
    public static final String session_logout = "logout";
    public static final String not_tag = "allo24_not_tag";
    public static final String audio_path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/allo24";
    public static final int not_id = 3254;

    //allo24app40@gmail.com  aass@123456

}
