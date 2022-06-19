package com.apps.allo24.adapters.shop_products_adapters;

import android.view.View;

import com.apps.allo24.databinding.GroupTitleRowBinding;
import com.apps.allo24.databinding.ProductChildRowBinding;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class ShopGroupViewHolder extends GroupViewHolder {
    public GroupTitleRowBinding binding;
    public ShopGroupViewHolder(GroupTitleRowBinding binding) {
        super(binding.getRoot());
        this.binding =binding;
    }


}
