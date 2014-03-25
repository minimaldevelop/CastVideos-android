package com.google.sample.cast.refplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.gms.cast.MediaInfo;
import com.google.sample.cast.refplayer.mediaplayer.LocalPlayerActivity;

public class TestCastHlsActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.test_activity);
		
		Button button = (Button) findViewById(R.id.button1);
		
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Bundle b = new Bundle();
				b.putString("movie-urls", "http://hls.twit.tv:1935/flosoft/smil:twitStream.smil/playlist.m3u8");
				b.putString("content-type", "application/x-mpegurl");
				b.putInt("stream-type", MediaInfo.STREAM_TYPE_BUFFERED);
				Intent i = new Intent(TestCastHlsActivity.this, LocalPlayerActivity.class);
				i.putExtra("media", b);
				startActivity(i);
				
			}
		});
		

		
	}
	
	
}
