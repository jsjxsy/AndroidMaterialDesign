package com.chiclam.material.widget;

import android.view.View;

import com.chiclam.material.BaseFragment;
import com.chiclam.material.R;

/**
 * Created by chiclaim on 2016/07/10
 */
public class WidgetsFragment extends BaseFragment {
    @Override
    public void initViews(View view) {
        showTitleBack(view, "MaterialWidgets");
        view.findViewById(R.id.btn_material_widget).setOnClickListener(this);
        view.findViewById(R.id.btn_material_widgets).setOnClickListener(this);
        view.findViewById(R.id.btn_tab_recycler_card).setOnClickListener(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_material_widgets_layout;
    }


    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_material_widget:
                addFragment(new TextInputLayoutFragment());
                break;

            case R.id.btn_material_widgets:
                addFragment(new SwitchSnackFBARippleShadowFragment());
                break;

            case R.id.btn_tab_recycler_card:
                addFragment(new TabLayoutRecyclerCardFragment());
                break;
        }
    }
}
