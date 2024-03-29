// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addEventButton;

  @NonNull
  public final Button deleteBtn;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button updateBtn;

  @NonNull
  public final Button viewBtn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button addEventButton,
      @NonNull Button deleteBtn, @NonNull ImageView imageView, @NonNull Button updateBtn,
      @NonNull Button viewBtn) {
    this.rootView = rootView;
    this.addEventButton = addEventButton;
    this.deleteBtn = deleteBtn;
    this.imageView = imageView;
    this.updateBtn = updateBtn;
    this.viewBtn = viewBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addEventButton;
      Button addEventButton = ViewBindings.findChildViewById(rootView, id);
      if (addEventButton == null) {
        break missingId;
      }

      id = R.id.deleteBtn;
      Button deleteBtn = ViewBindings.findChildViewById(rootView, id);
      if (deleteBtn == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.updateBtn;
      Button updateBtn = ViewBindings.findChildViewById(rootView, id);
      if (updateBtn == null) {
        break missingId;
      }

      id = R.id.viewBtn;
      Button viewBtn = ViewBindings.findChildViewById(rootView, id);
      if (viewBtn == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, addEventButton, deleteBtn,
          imageView, updateBtn, viewBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
