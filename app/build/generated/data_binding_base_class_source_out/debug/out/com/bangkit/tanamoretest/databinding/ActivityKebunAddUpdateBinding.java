// Generated by view binder compiler. Do not edit!
package com.bangkit.tanamoretest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bangkit.tanamoretest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityKebunAddUpdateBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSubmit;

  @NonNull
  public final EditText edtDescription;

  @NonNull
  public final LinearLayout headerLayout;

  @NonNull
  public final ImageView icBack;

  @NonNull
  public final ImageView imgPhoto;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final TextView pageTitle;

  @NonNull
  public final Spinner spinnerTitle;

  private ActivityKebunAddUpdateBinding(@NonNull LinearLayout rootView, @NonNull Button btnSubmit,
      @NonNull EditText edtDescription, @NonNull LinearLayout headerLayout,
      @NonNull ImageView icBack, @NonNull ImageView imgPhoto, @NonNull LinearLayout main,
      @NonNull TextView pageTitle, @NonNull Spinner spinnerTitle) {
    this.rootView = rootView;
    this.btnSubmit = btnSubmit;
    this.edtDescription = edtDescription;
    this.headerLayout = headerLayout;
    this.icBack = icBack;
    this.imgPhoto = imgPhoto;
    this.main = main;
    this.pageTitle = pageTitle;
    this.spinnerTitle = spinnerTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityKebunAddUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityKebunAddUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_kebun_add_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityKebunAddUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_submit;
      Button btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.edt_description;
      EditText edtDescription = ViewBindings.findChildViewById(rootView, id);
      if (edtDescription == null) {
        break missingId;
      }

      id = R.id.headerLayout;
      LinearLayout headerLayout = ViewBindings.findChildViewById(rootView, id);
      if (headerLayout == null) {
        break missingId;
      }

      id = R.id.ic_back;
      ImageView icBack = ViewBindings.findChildViewById(rootView, id);
      if (icBack == null) {
        break missingId;
      }

      id = R.id.img_photo;
      ImageView imgPhoto = ViewBindings.findChildViewById(rootView, id);
      if (imgPhoto == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.pageTitle;
      TextView pageTitle = ViewBindings.findChildViewById(rootView, id);
      if (pageTitle == null) {
        break missingId;
      }

      id = R.id.spinner_title;
      Spinner spinnerTitle = ViewBindings.findChildViewById(rootView, id);
      if (spinnerTitle == null) {
        break missingId;
      }

      return new ActivityKebunAddUpdateBinding((LinearLayout) rootView, btnSubmit, edtDescription,
          headerLayout, icBack, imgPhoto, main, pageTitle, spinnerTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
