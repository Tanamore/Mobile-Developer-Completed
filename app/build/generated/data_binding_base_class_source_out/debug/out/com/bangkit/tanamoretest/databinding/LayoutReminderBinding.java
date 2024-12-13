// Generated by view binder compiler. Do not edit!
package com.bangkit.tanamoretest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bangkit.tanamoretest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutReminderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnDeleteReminder;

  @NonNull
  public final TextView tvReminderDate;

  @NonNull
  public final TextView tvReminderTime;

  @NonNull
  public final TextView tvReminderTitle;

  private LayoutReminderBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView btnDeleteReminder, @NonNull TextView tvReminderDate,
      @NonNull TextView tvReminderTime, @NonNull TextView tvReminderTitle) {
    this.rootView = rootView;
    this.btnDeleteReminder = btnDeleteReminder;
    this.tvReminderDate = tvReminderDate;
    this.tvReminderTime = tvReminderTime;
    this.tvReminderTitle = tvReminderTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutReminderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutReminderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_reminder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutReminderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_delete_reminder;
      ImageView btnDeleteReminder = ViewBindings.findChildViewById(rootView, id);
      if (btnDeleteReminder == null) {
        break missingId;
      }

      id = R.id.tv_reminder_date;
      TextView tvReminderDate = ViewBindings.findChildViewById(rootView, id);
      if (tvReminderDate == null) {
        break missingId;
      }

      id = R.id.tv_reminder_time;
      TextView tvReminderTime = ViewBindings.findChildViewById(rootView, id);
      if (tvReminderTime == null) {
        break missingId;
      }

      id = R.id.tv_reminder_title;
      TextView tvReminderTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvReminderTitle == null) {
        break missingId;
      }

      return new LayoutReminderBinding((LinearLayout) rootView, btnDeleteReminder, tvReminderDate,
          tvReminderTime, tvReminderTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
