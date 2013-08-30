package com.grarak.romswitchers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends Activity {
	
	private static String device = android.os.Build.DEVICE.toString();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//i9500
		if (device.equals("ja3g")) {
			MainActivity.downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/i9500";
			MainActivity.first = "Samsung TouchWiz 4.2.2";
			MainActivity.second = "Android Open Source Project 4.3";
			MainActivity.bootpartition = "/dev/block/mmcblk0p9";
		}
		
		//Manta
		if (device.equals("manta")) {
			MainActivity.downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/manta";
			MainActivity.first = "First Rom";
			MainActivity.second = "Second Rom";
			MainActivity.bootpartition = "/dev/block/platform/dw_mmc.0/by-name/boot";
		}
		
		//Odin
		if (device.equals("odin") || device.equals("C6503")) {
			MainActivity.downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/odin";
			MainActivity.first = "Sony Timescape 4.2.2";
			MainActivity.second = "Android Open Source Project 4.3";
			MainActivity.bootpartition = "/dev/block/platform/msm_sdcc.1/by-name/boot";
		}
        
		//Yuga
		if (device.equals("yuga") || device.equals("C6603")) {
			MainActivity.downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/yuga";
			MainActivity.first = "Sony Timescape 4.2.2";
			MainActivity.second = "Android Open Source Project 4.3";
			MainActivity.bootpartition = "/dev/block/platform/msm_sdcc.1/by-name/boot";
		}
        
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	}
}
