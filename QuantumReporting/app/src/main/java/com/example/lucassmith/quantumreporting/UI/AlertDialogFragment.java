package com.example.lucassmith.quantumreporting.UI;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Mister Jabber on 3/28/2015.
 */
public class AlertDialogFragment extends DialogFragment {

    private String mAlertMessage;

    public AlertDialogFragment(String message){
        mAlertMessage = message;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstance){
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Oops!")
                .setMessage(mAlertMessage)
                .setPositiveButton("Ok", null);

        AlertDialog dialog = builder.create();
        return  dialog;
    }
}
