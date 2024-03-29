// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddEventBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText eventDate;

  @NonNull
  public final EditText eventLocation;

  @NonNull
  public final EditText eventName;

  @NonNull
  public final EditText eventTime;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button saveButton;

  private ActivityAddEventBinding(@NonNull ConstraintLayout rootView, @NonNull EditText eventDate,
      @NonNull EditText eventLocation, @NonNull EditText eventName, @NonNull EditText eventTime,
      @NonNull ImageView imageView, @NonNull Button saveButton) {
    this.rootView = rootView;
    this.eventDate = eventDate;
    this.eventLocation = eventLocation;
    this.eventName = eventName;
    this.eventTime = eventTime;
    this.imageView = imageView;
    this.saveButton = saveButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_event, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddEventBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.eventDate;
      EditText eventDate = ViewBindings.findChildViewById(rootView, id);
      if (eventDate == null) {
        break missingId;
      }

      id = R.id.eventLocation;
      EditText eventLocation = ViewBindings.findChildViewById(rootView, id);
      if (eventLocation == null) {
        break missingId;
      }

      id = R.id.eventName;
      EditText eventName = ViewBindings.findChildViewById(rootView, id);
      if (eventName == null) {
        break missingId;
      }

      id = R.id.eventTime;
      EditText eventTime = ViewBindings.findChildViewById(rootView, id);
      if (eventTime == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.saveButton;
      Button saveButton = ViewBindings.findChildViewById(rootView, id);
      if (saveButton == null) {
        break missingId;
      }

      return new ActivityAddEventBinding((ConstraintLayout) rootView, eventDate, eventLocation,
          eventName, eventTime, imageView, saveButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
