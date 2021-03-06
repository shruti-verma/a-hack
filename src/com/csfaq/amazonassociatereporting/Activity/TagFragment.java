package com.csfaq.amazonassociatereporting.Activity;

import com.csfaq.amazonassociatereporting.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TagFragment extends Fragment {

	private View rootView;
	private String mType;

	public TagFragment(String type) {
		mType = type;
	}


	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_tag, container, false);
		
		TextView tv1 = (TextView) rootView.findViewById(R.id.tv_tag1);
		TextView tv2 = (TextView) rootView.findViewById(R.id.tv_tag2);

		if (mType.equals("CLICK")) {
			tv1.setText("300");
			tv2.setText("700");

		} else if (mType.equals("OPS")) {
			tv1.setText("50$");
			tv2.setText("150$");
			
		} else if (mType.equals("UNITS")) {
			tv1.setText("10");
			tv2.setText("40");
		}


		return rootView;
	}

}
