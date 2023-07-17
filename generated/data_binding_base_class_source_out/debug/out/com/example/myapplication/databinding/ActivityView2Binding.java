// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityView2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button searchButton2;

  @NonNull
  public final TextView searchEventDate1;

  @NonNull
  public final TextView searchEventLocation1;

  @NonNull
  public final EditText searchEventName;

  @NonNull
  public final TextView searchEventName1;

  @NonNull
  public final TextView searchEventTime1;

  private ActivityView2Binding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView,
      @NonNull Button searchButton2, @NonNull TextView searchEventDate1,
      @NonNull TextView searchEventLocation1, @NonNull EditText searchEventName,
      @NonNull TextView searchEventName1, @NonNull TextView searchEventTime1) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.searchButton2 = searchButton2;
    this.searchEventDate1 = searchEventDate1;
    this.searchEventLocation1 = searchEventLocation1;
    this.searchEventName = searchEventName;
    this.searchEventName1 = searchEventName1;
    this.searchEventTime1 = searchEventTime1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityView2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityView2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityView2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.searchButton2;
      Button searchButton2 = ViewBindings.findChildViewById(rootView, id);
      if (searchButton2 == null) {
        break missingId;
      }

      id = R.id.searchEventDate1;
      TextView searchEventDate1 = ViewBindings.findChildViewById(rootView, id);
      if (searchEventDate1 == null) {
        break missingId;
      }

      id = R.id.searchEventLocation1;
      TextView searchEventLocation1 = ViewBindings.findChildViewById(rootView, id);
      if (searchEventLocation1 == null) {
        break missingId;
      }

      id = R.id.searchEventName;
      EditText searchEventName = ViewBindings.findChildViewById(rootView, id);
      if (searchEventName == null) {
        break missingId;
      }

      id = R.id.searchEventName1;
      TextView searchEventName1 = ViewBindings.findChildViewById(rootView, id);
      if (searchEventName1 == null) {
        break missingId;
      }

      id = R.id.searchEventTime1;
      TextView searchEventTime1 = ViewBindings.findChildViewById(rootView, id);
      if (searchEventTime1 == null) {
        break missingId;
      }

      return new ActivityView2Binding((ConstraintLayout) rootView, imageView, searchButton2,
          searchEventDate1, searchEventLocation1, searchEventName, searchEventName1,
          searchEventTime1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
