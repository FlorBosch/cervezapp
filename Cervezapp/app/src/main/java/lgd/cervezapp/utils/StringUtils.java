package lgd.cervezapp.utils;

import android.content.Context;

/**
 * Created by florencia on 30/01/16.
 */
public class StringUtils {

    public static String getStringFromResource(Context context, int resource){
        return context.getResources().getString(resource);
    }

}
