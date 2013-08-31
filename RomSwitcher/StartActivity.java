package com.grarak.romswitchers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends Activity {
	
	private static String device = android.os.Build.DEVICE.toString();
	private static String board = android.os.Build.BOARD.toString();
	public static String downloadlink;
	public static String first;
	public static String second;
	public static String bootpartition;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//i9500
		if (device.equals("ja3g")) {
			downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/i9500";
			first = "Samsung TouchWiz 4.2.2";
			second = "Android Open Source Project 4.3";
			bootpartition = "/dev/block/mmcblk0p9";
		}
		
		//Manta
		if (device.equals("manta")) {
			downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/manta";
			first = "First Rom";
			second = "Second Rom";
			bootpartition = "/dev/block/platform/dw_mmc.0/by-name/boot";
		}

		if (device.equals("m470")) {
			downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/m470";
			first = "Stock";
			second = "XE";
			bootpartition = "/dev/block/platform/sdhci-tegra.3/by-name/LNX";
		}
		
		//Odin
		if (device.equals("odin") || device.equals("C6503")) {
			downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/odin";
			first = "Sony Timescape 4.2.2";
			second = "Android Open Source Project 4.3";
			bootpartition = "/dev/block/platform/msm_sdcc.1/by-name/boot";
		}
		
		//Tuna
		if (board.equals("tuna")) {
			downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/tuna";
			first = "First Rom";
			second = "Second Rom";
			bootpartition = "/dev/block/platform/omap/omap_hsmmc.0/by-name/boot";
		}
        
		//Yuga
		if (device.equals("yuga") || device.equals("C6603")) {
			downloadlink = "https://raw.github.com/RomSwitchers/Downloadlinks/master/yuga";
			first = "Sony Timescape 4.2.2";
			second = "Android Open Source Project 4.3";
			bootpartition = "/dev/block/platform/msm_sdcc.1/by-name/boot";
		}
		
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	}
}
