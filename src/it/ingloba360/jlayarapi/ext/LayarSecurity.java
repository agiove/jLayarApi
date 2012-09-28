/* ===========================================================
 * jLayarApi: a Java wrapper for Layar API
 * ===========================================================
 * 
 * (C) Copyright 2012 by Ingloba360
 * 
 * Project Info:  https://github.com/agiove/jLayarApi/
 * 
 * This library is free software; you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software Foundation;
 * either version 3 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with this
 * library. If not, see <http://www.gnu.org/licenses/>.
 * 
 * ------------------
 * LayarSecurity.java
 * ------------------
 * (C) Copyright 2012 by Ingloba360
 * 
 * Original Author: Angelo Giove (angelo.giove AT ingloba360.it)
 */
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
		layarServers.add("54.247.0.0/16 (54.247.0.0 – 54.247.255.255)");
		
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
		layarVersions.add("6.2");
		layarVersions.add("7.0");
	}
}
