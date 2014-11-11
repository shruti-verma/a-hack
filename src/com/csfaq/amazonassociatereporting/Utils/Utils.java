package com.csfaq.amazonassociatereporting.Utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.view.View;

import com.csfaq.amazonassociatereporting.Activity.MainActivity;
import com.csfaq.amazonassociatereporting.R;

import java.util.Random;

public class Utils {

	public static int randInt(int min, int max) {

		// NOTE: Usually this should be a field rather than a method
		// variable so that it is not re-seeded every call.
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static void createNotification(Context ctx, View view, String type) {

				if (type.equals("earnings")) {
//					// Prepare intent which is triggered if the
//					// notification is selected
//					Intent intent = new Intent(ctx, MainActivity.class);
//					PendingIntent pIntent = PendingIntent.getActivity(ctx, 0, intent, 0);
//		
//					// Build notification
//					Notification notification = new Notification.Builder(ctx)
//					.setContentTitle("Congratulations!!")
//					.setContentText("You just earned $200 from Amazon associates program").setSmallIcon(R.drawable.ic_launcher)
//					.setContentIntent(pIntent)
//					//.addAction(R.drawable.ic_launcher, "Call", pIntent)
//					//.addAction(R.drawable.ic_launcher, "More", pIntent)
//					//.addAction(R.drawable.ic_launcher, "And more", pIntent)
//					.build();
//					NotificationManager notificationManager = (NotificationManager) ctx.getSystemService(ctx.NOTIFICATION_SERVICE);
//					// hide the notification after its selected
//					notification.flags |= Notification.FLAG_AUTO_CANCEL;
//		
//					notificationManager.notify(0, notification);
					
					Intent intent = new Intent(ctx, MainActivity.class);
					PendingIntent pIntent = PendingIntent.getActivity(ctx, 0, intent, 0);
					NotificationCompat.Builder builder =
							new NotificationCompat.Builder(ctx)
					.setSmallIcon(R.drawable.ic_launcher)
					.setContentTitle("Congratulations!!")
					.setContentText("You just earned $200 from Amazon associates program")
					.setContentIntent(pIntent)
					.setDefaults(Notification.DEFAULT_ALL) // requires VIBRATE permission
					.setStyle(new NotificationCompat.BigTextStyle()
					.bigText("You just earned $200 from Amazon associates program"));

					NotificationManager notificationManager = (NotificationManager) ctx.getSystemService(ctx.NOTIFICATION_SERVICE);

					// Will display the notification in the notification bar
					notificationManager.notify(0, builder.build());
					
				} else if (type.equals("ranking")) {
//					// Prepare intent which is triggered if the
//					// notification is selected
//					Intent intent = new Intent(ctx, MainActivity.class);
//					PendingIntent pIntent = PendingIntent.getActivity(ctx, 0, intent, 0);
//		
//					// Build notification
//					Notification notification = new Notification.Builder(ctx)
//					.setContentTitle("Congratulations!!")
//					.setContentText("For being in top 5 most OPS driving stores for this month").setSmallIcon(R.drawable.ic_launcher)
//					.setContentIntent(pIntent)
//					//.addAction(R.drawable.ic_launcher, "Call", pIntent)
//					//.addAction(R.drawable.ic_launcher, "More", pIntent)
//					//.addAction(R.drawable.ic_launcher, "And more", pIntent)
//					.build();
//					NotificationManager notificationManager = (NotificationManager) ctx.getSystemService(ctx.NOTIFICATION_SERVICE);
//					// hide the notification after its selected
//					notification.flags |= Notification.FLAG_AUTO_CANCEL;
//		
//					notificationManager.notify(1, notification);
					
					Intent intent = new Intent(ctx, MainActivity.class);
					PendingIntent pIntent = PendingIntent.getActivity(ctx, 0, intent, 0);
					NotificationCompat.Builder builder =
							new NotificationCompat.Builder(ctx)
					.setSmallIcon(R.drawable.ic_launcher)
					.setContentTitle("Congratulations!!")
					.setContentText("For being in top 5 most OPS driving stores for this month")
					.setContentIntent(pIntent)
					.setDefaults(Notification.DEFAULT_ALL) // requires VIBRATE permission
					.setStyle(new NotificationCompat.BigTextStyle()
					.bigText("For being in top 5 most OPS driving stores for this month"));

					NotificationManager notificationManager = (NotificationManager) ctx.getSystemService(ctx.NOTIFICATION_SERVICE);

					// Will display the notification in the notification bar
					notificationManager.notify(1, builder.build());
				}


				
	}
}
