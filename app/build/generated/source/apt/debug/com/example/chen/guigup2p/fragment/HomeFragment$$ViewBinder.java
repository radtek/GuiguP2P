// Generated code from Butter Knife. Do not modify!
package com.example.chen.guigup2p.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomeFragment$$ViewBinder<T extends com.example.chen.guigup2p.fragment.HomeFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624167, "field 'ivTopTitleBack'");
    target.ivTopTitleBack = finder.castView(view, 2131624167, "field 'ivTopTitleBack'");
    view = finder.findRequiredView(source, 2131624168, "field 'tvTopTitleTap'");
    target.tvTopTitleTap = finder.castView(view, 2131624168, "field 'tvTopTitleTap'");
    view = finder.findRequiredView(source, 2131624169, "field 'ivTopTitleSetting'");
    target.ivTopTitleSetting = finder.castView(view, 2131624169, "field 'ivTopTitleSetting'");
    view = finder.findRequiredView(source, 2131624166, "field 'llTopTitleMain'");
    target.llTopTitleMain = finder.castView(view, 2131624166, "field 'llTopTitleMain'");
    view = finder.findRequiredView(source, 2131624116, "field 'banner'");
    target.banner = finder.castView(view, 2131624116, "field 'banner'");
    view = finder.findRequiredView(source, 2131624117, "field 'tvHomeFragmentProduct'");
    target.tvHomeFragmentProduct = finder.castView(view, 2131624117, "field 'tvHomeFragmentProduct'");
    view = finder.findRequiredView(source, 2131624118, "field 'diyRoundProgress'");
    target.diyRoundProgress = finder.castView(view, 2131624118, "field 'diyRoundProgress'");
    view = finder.findRequiredView(source, 2131624119, "field 'tvFragmentHomeYearrate'");
    target.tvFragmentHomeYearrate = finder.castView(view, 2131624119, "field 'tvFragmentHomeYearrate'");
    view = finder.findRequiredView(source, 2131624120, "field 'btFragmentHomeJoin'");
    target.btFragmentHomeJoin = finder.castView(view, 2131624120, "field 'btFragmentHomeJoin'");
  }

  @Override public void unbind(T target) {
    target.ivTopTitleBack = null;
    target.tvTopTitleTap = null;
    target.ivTopTitleSetting = null;
    target.llTopTitleMain = null;
    target.banner = null;
    target.tvHomeFragmentProduct = null;
    target.diyRoundProgress = null;
    target.tvFragmentHomeYearrate = null;
    target.btFragmentHomeJoin = null;
  }
}
