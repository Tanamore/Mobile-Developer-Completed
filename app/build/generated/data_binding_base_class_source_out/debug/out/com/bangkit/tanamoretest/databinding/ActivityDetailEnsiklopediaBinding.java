// Generated by view binder compiler. Do not edit!
package com.bangkit.tanamoretest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bangkit.tanamoretest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailEnsiklopediaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout deskripsiLayout;

  @NonNull
  public final LinearLayout headerLayout;

  @NonNull
  public final ImageView icBack;

  @NonNull
  public final ImageView ivPlantImage;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView pageTitle;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final TextView tvClimate;

  @NonNull
  public final TextView tvCommonDisease;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvFertilizer;

  @NonNull
  public final TextView tvHarvestTime;

  @NonNull
  public final TextView tvOriginPlace;

  @NonNull
  public final TextView tvPlantName;

  @NonNull
  public final TextView tvScientificName;

  @NonNull
  public final TextView tvUses;

  @NonNull
  public final TextView tvWateringFreq;

  private ActivityDetailEnsiklopediaBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout deskripsiLayout, @NonNull LinearLayout headerLayout,
      @NonNull ImageView icBack, @NonNull ImageView ivPlantImage, @NonNull ConstraintLayout main,
      @NonNull TextView pageTitle, @NonNull ProgressBar progressBar,
      @NonNull NestedScrollView scrollView, @NonNull TextView tvClimate,
      @NonNull TextView tvCommonDisease, @NonNull TextView tvDescription,
      @NonNull TextView tvFertilizer, @NonNull TextView tvHarvestTime,
      @NonNull TextView tvOriginPlace, @NonNull TextView tvPlantName,
      @NonNull TextView tvScientificName, @NonNull TextView tvUses,
      @NonNull TextView tvWateringFreq) {
    this.rootView = rootView;
    this.deskripsiLayout = deskripsiLayout;
    this.headerLayout = headerLayout;
    this.icBack = icBack;
    this.ivPlantImage = ivPlantImage;
    this.main = main;
    this.pageTitle = pageTitle;
    this.progressBar = progressBar;
    this.scrollView = scrollView;
    this.tvClimate = tvClimate;
    this.tvCommonDisease = tvCommonDisease;
    this.tvDescription = tvDescription;
    this.tvFertilizer = tvFertilizer;
    this.tvHarvestTime = tvHarvestTime;
    this.tvOriginPlace = tvOriginPlace;
    this.tvPlantName = tvPlantName;
    this.tvScientificName = tvScientificName;
    this.tvUses = tvUses;
    this.tvWateringFreq = tvWateringFreq;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailEnsiklopediaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailEnsiklopediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_ensiklopedia, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailEnsiklopediaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.deskripsiLayout;
      LinearLayout deskripsiLayout = ViewBindings.findChildViewById(rootView, id);
      if (deskripsiLayout == null) {
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

      id = R.id.ivPlantImage;
      ImageView ivPlantImage = ViewBindings.findChildViewById(rootView, id);
      if (ivPlantImage == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.pageTitle;
      TextView pageTitle = ViewBindings.findChildViewById(rootView, id);
      if (pageTitle == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.scrollView;
      NestedScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.tvClimate;
      TextView tvClimate = ViewBindings.findChildViewById(rootView, id);
      if (tvClimate == null) {
        break missingId;
      }

      id = R.id.tvCommonDisease;
      TextView tvCommonDisease = ViewBindings.findChildViewById(rootView, id);
      if (tvCommonDisease == null) {
        break missingId;
      }

      id = R.id.tvDescription;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tvFertilizer;
      TextView tvFertilizer = ViewBindings.findChildViewById(rootView, id);
      if (tvFertilizer == null) {
        break missingId;
      }

      id = R.id.tvHarvestTime;
      TextView tvHarvestTime = ViewBindings.findChildViewById(rootView, id);
      if (tvHarvestTime == null) {
        break missingId;
      }

      id = R.id.tvOriginPlace;
      TextView tvOriginPlace = ViewBindings.findChildViewById(rootView, id);
      if (tvOriginPlace == null) {
        break missingId;
      }

      id = R.id.tvPlantName;
      TextView tvPlantName = ViewBindings.findChildViewById(rootView, id);
      if (tvPlantName == null) {
        break missingId;
      }

      id = R.id.tvScientificName;
      TextView tvScientificName = ViewBindings.findChildViewById(rootView, id);
      if (tvScientificName == null) {
        break missingId;
      }

      id = R.id.tvUses;
      TextView tvUses = ViewBindings.findChildViewById(rootView, id);
      if (tvUses == null) {
        break missingId;
      }

      id = R.id.tvWateringFreq;
      TextView tvWateringFreq = ViewBindings.findChildViewById(rootView, id);
      if (tvWateringFreq == null) {
        break missingId;
      }

      return new ActivityDetailEnsiklopediaBinding((ConstraintLayout) rootView, deskripsiLayout,
          headerLayout, icBack, ivPlantImage, main, pageTitle, progressBar, scrollView, tvClimate,
          tvCommonDisease, tvDescription, tvFertilizer, tvHarvestTime, tvOriginPlace, tvPlantName,
          tvScientificName, tvUses, tvWateringFreq);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
