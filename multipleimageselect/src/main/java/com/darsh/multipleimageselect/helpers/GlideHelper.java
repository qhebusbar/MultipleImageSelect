package com.darsh.multipleimageselect.helpers;

import com.bumptech.glide.request.RequestOptions;
import com.darsh.multipleimageselect.R;

public class GlideHelper {

    public static RequestOptions getDefaultRequestOptions() {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.image_placeholder);
        requestOptions.error(android.R.drawable.stat_sys_warning);
        return requestOptions;
    }

}
