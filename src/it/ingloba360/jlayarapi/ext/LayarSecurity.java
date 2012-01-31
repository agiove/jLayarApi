package it.ingloba360.jlayarapi.ext;

import java.util.ArrayList;
import java.util.List;

public class LayarSecurity {

	private static List<String> layarServers;
	private static List<String> layarVersions;
	static {
		layarServers = new ArrayList<String>();
		layarServers.add("79.125.0.0/17 (79.125.0.0 - 79.125.127.255)");
		layarServers.add("46.51.128.0/18 (46.51.128.0 - 46.51.191.255)");
		layarServers.add("46.51.192.0/20 (46.51.192.0 - 46.51.207.255)");
		layarServers.add("46.137.0.0/17 (46.137.0.0 - 46.137.127.255)");
		layarServers.add("46.137.128.0/18 (46.137.128.0 - 46.137.191.255)");
		layarServers.add("176.34.128.0/17 (176.34.128.0 - 176.34.255.255)");
		layarServers.add("176.34.64.0/18 (176.34.64.0 – 176.34.127.255)");
		
		layarVersions.add("2");
		layarVersions.add("2.1");
		layarVersions.add("ip2.0");
		layarVersions.add("2.2");
		layarVersions.add("ip2.1");
		layarVersions.add("2.2.1");
		layarVersions.add("2.2.2");
		layarVersions.add("3.0");
		layarVersions.add("ip3.0");
		layarVersions.add("3.1");
		layarVersions.add("3.5");
		layarVersions.add("3.6");
		layarVersions.add("4.0");
		layarVersions.add("5.0");
		layarVersions.add("6.0");
	}
}
