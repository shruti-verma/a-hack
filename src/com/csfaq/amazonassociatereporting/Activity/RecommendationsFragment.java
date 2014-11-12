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
import android.widget.ImageView;
import android.widget.LinearLayout;

public class RecommendationsFragment extends Fragment {

	private View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_recommendations, container, false);

		setClicks();

		return rootView;
	}

	private void setClicks() {
		final ImageView layout1 = (ImageView) rootView.findViewById(R.id.shareImageView1);
		//		final ImageView layout2 = (ImageView) rootView.findViewById(R.id.shareImageView1);
		//		final ImageView layout3 = (ImageView) rootView.findViewById(R.id.shareImageView1);
		//		final ImageView layout4 = (ImageView) rootView.findViewById(R.id.shareImageView1);
		//		final ImageView layout5 = (ImageView) rootView.findViewById(R.id.shareImageView1);

		OnClickListener clickListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				String tag = (String)v.getTag();			

				String shareTitle = "Share this recommendation via";;
				String shareSubject;
				String shareBody;

				if (tag.equals("1")) {					
					shareSubject = "Check out the new Black Friday promotions!";
					shareBody = "Great Black Friday promotions on associate central \n https://affiliate-program.amazon.com/gp/associates/network/promo-hub/promo.html";
				} else if (tag.equals("2")) {
					shareSubject = "Checkout Thanksgiving deals!";
					shareBody = "Dinner and Desserts Thanksgiving promotions now live on associate central";
				} else if (tag.equals("3")) {
					shareSubject = "subject3";
					shareBody = "body3";
				} else if (tag.equals("4")) {
					shareSubject = "subject4";
					shareBody = "body4";
				} else {
					shareSubject = "subject5";
					shareBody = "body5";
				}
				
				Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
				sharingIntent.setType("text/plain");
				sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSubject);
				sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
				startActivity(Intent.createChooser(sharingIntent, shareTitle));
			}
		};

		layout1.setOnClickListener(clickListener);
		//		layout2.setOnClickListener(clickListener);
		//		layout3.setOnClickListener(clickListener);
		//		layout4.setOnClickListener(clickListener);
		//		layout5.setOnClickListener(clickListener);
	}

}
