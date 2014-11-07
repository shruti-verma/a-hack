package com.csfaq.amazonassociatereporting.Activity;

import com.csfaq.amazonassociatereporting.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DidYouKnowFragment extends Fragment {

	View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_section_dummy, container, false);

		setClicks();

		return rootView;
	}


	private void setClicks() {
		final Button btnYes1 = (Button) rootView.findViewById(R.id.btn_response_yes1);
		final Button btnNo1 = (Button) rootView.findViewById(R.id.btn_response_no1);
		final Button btnHide1 = (Button) rootView.findViewById(R.id.btn_response_hide1);

		final Button btnYes2 = (Button) rootView.findViewById(R.id.btn_response_yes2);
		final Button btnNo2 = (Button) rootView.findViewById(R.id.btn_response_no2);
		final Button btnHide2 = (Button) rootView.findViewById(R.id.btn_response_hide2);

		final Button btnYes3 = (Button) rootView.findViewById(R.id.btn_response_yes3);
		final Button btnNo3 = (Button) rootView.findViewById(R.id.btn_response_no3);
		final Button btnHide3 = (Button) rootView.findViewById(R.id.btn_response_hide3);

		final LinearLayout layoutQ1 = (LinearLayout) rootView.findViewById(R.id.layout_q1);
		final LinearLayout layoutQ2 = (LinearLayout) rootView.findViewById(R.id.layout_q2);
		final LinearLayout layoutQ3 = (LinearLayout) rootView.findViewById(R.id.layout_q3);


		OnClickListener yesListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Thanks for the participation.\nWe really appreciate it", Toast.LENGTH_SHORT).show();

				String tag = (String)v.getTag();
				if (tag.equals("q1")) {				
					layoutQ1.setVisibility(View.GONE);
				} else if (tag.equals("q2")) {				
					layoutQ2.setVisibility(View.GONE);
				} else if (tag.equals("q3")) {				
					layoutQ3.setVisibility(View.GONE);
				}  
			}

		};

		OnClickListener noListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Thanks for the participation.\nWe really appreciate it", Toast.LENGTH_SHORT).show();

				String tag = (String)v.getTag();
				if (tag.equals("q1")) {				
					layoutQ1.setVisibility(View.GONE);
				} else if (tag.equals("q2")) {				
					layoutQ2.setVisibility(View.GONE);
				} else if (tag.equals("q3")) {				
					layoutQ3.setVisibility(View.GONE);
				}  		
			}

		};

		OnClickListener hideListener = new OnClickListener() {

			@Override
			public void onClick(View v) {					

				String tag = (String)v.getTag();
				if (tag.equals("q1")) {				
					layoutQ1.setVisibility(View.GONE);
				} else if (tag.equals("q2")) {				
					layoutQ2.setVisibility(View.GONE);
				} else if (tag.equals("q3")) {				
					layoutQ3.setVisibility(View.GONE);
				}  	
			}
		};

		btnYes1.setOnClickListener(yesListener);
		btnNo1.setOnClickListener(noListener);
		btnHide1.setOnClickListener(hideListener);

		btnYes2.setOnClickListener(yesListener);
		btnNo2.setOnClickListener(noListener);
		btnHide2.setOnClickListener(hideListener);

		btnYes3.setOnClickListener(yesListener);
		btnNo3.setOnClickListener(noListener);
		btnHide3.setOnClickListener(hideListener);

	}
}

