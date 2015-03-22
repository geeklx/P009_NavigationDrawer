package com.liangxiao.navigationdrawerleft;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	private DrawerLayout mDrawerLayout;
	private LinearLayout mLayout;
	private ImageView iv_right;
	private ImageView iv_left;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv_left = (ImageView) findViewById(R.id.iv_left);
		iv_right = (ImageView) findViewById(R.id.iv_right);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);
		mLayout = (LinearLayout) findViewById(R.id.left_drawer);

		iv_left.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (mDrawerLayout.isDrawerOpen(mLayout)) {
					mDrawerLayout.closeDrawer(Gravity.START);
				} else {
					mDrawerLayout.openDrawer(Gravity.START);
				}
			}
		});
	}

}
