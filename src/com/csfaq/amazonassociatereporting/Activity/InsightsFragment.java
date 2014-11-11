package com.csfaq.amazonassociatereporting.Activity;

import com.csfaq.amazonassociatereporting.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class InsightsFragment extends Fragment {
	
	private View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		rootView = inflater.inflate(R.layout.fragment_insights, container, false);
		
		setClicks();

		return rootView;
	}

	private void setClicks() {
		final LinearLayout layout1 = (LinearLayout) rootView.findViewById(R.id.whats_new_linearlayout1);
		final LinearLayout layout2 = (LinearLayout) rootView.findViewById(R.id.whats_new_linearlayout2);
		final LinearLayout layout3 = (LinearLayout) rootView.findViewById(R.id.whats_new_linearlayout3);
		final LinearLayout layout4 = (LinearLayout) rootView.findViewById(R.id.whats_new_linearlayout4);
		final LinearLayout layout5 = (LinearLayout) rootView.findViewById(R.id.whats_new_linearlayout5);
		
		OnClickListener clickListener = new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			    startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://associates.amazon.com")));				
			}
		};
		
		layout1.setOnClickListener(clickListener);
		layout2.setOnClickListener(clickListener);
		layout3.setOnClickListener(clickListener);
		layout4.setOnClickListener(clickListener);
		layout5.setOnClickListener(clickListener);
	}

}
