// Generated code from Butter Knife. Do not modify!
package com.example.nginx.latesoccer;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailActivity_ViewBinding implements Unbinder {
  private DetailActivity target;

  @UiThread
  public DetailActivity_ViewBinding(DetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailActivity_ViewBinding(DetailActivity target, View source) {
    this.target = target;

    target.foto_tim = Utils.findRequiredViewAsType(source, R.id.fotoTim, "field 'foto_tim'", ImageView.class);
    target.nama_tim = Utils.findRequiredViewAsType(source, R.id.namaTim, "field 'nama_tim'", TextView.class);
    target.kota_tim = Utils.findRequiredViewAsType(source, R.id.kotaTim, "field 'kota_tim'", TextView.class);
    target.desk_tim = Utils.findRequiredViewAsType(source, R.id.deskTim, "field 'desk_tim'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.foto_tim = null;
    target.nama_tim = null;
    target.kota_tim = null;
    target.desk_tim = null;
  }
}
