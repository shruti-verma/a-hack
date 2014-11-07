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

public class HomeFragment extends Fragment {
	
	private View rootView;

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		rootView = inflater.inflate(R.layout.fragment_home, container, false);

		setClicks();
		
		return rootView;
	}
	
	private void setClicks() {
		final TextView tvClicks = (TextView) rootView.findViewById(R.id.tv_clicks);
		final TextView tvOps = (TextView) rootView.findViewById(R.id.tv_ops);
		final TextView tvUnits = (TextView) rootView.findViewById(R.id.tv_units);

		tvClicks.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), ClickViewActivity.class);
				intent.putExtra("DATA", "CLICKS");
				startActivity(intent);			}
			    
		});
		
		tvOps.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), ClickViewActivity.class);
				intent.putExtra("DATA", "OPS");
				startActivity(intent);			}
			
		});

		tvUnits.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(getActivity(), ClickViewActivity.class);
				intent.putExtra("DATA", "UNITS");
				startActivity(intent);			}
		});		

	}

}
