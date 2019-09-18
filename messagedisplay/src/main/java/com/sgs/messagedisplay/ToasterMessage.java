package com.sgs.messagedisplay;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by sunilnraikar on 13/09/19.
 */

public  class  ToasterMessage {

    private static final void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
