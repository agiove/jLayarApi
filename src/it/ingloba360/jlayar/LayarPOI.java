package it.ingloba360.jlayar;

import java.util.List;

import models.crudsiena.SienaSupport;
import siena.Id;
import siena.Max;
import siena.NotNull;

public class LayarPOI extends SienaSupport {

	@Id
	public Long id;
	
	public String codLayer;
	
	@Max(150)
	public String attribution;
	
	@Max(150)
	@NotNull
	public String title;
	
	@NotNull
	public Double lat;
	
	@NotNull
	public Double lon;
	
	@Max(255)
	public String imageURL;
	
	@Max(150)
	public String line4;
	
	@Max(150)
	public String line3;
	
	@Max(150)
	public String line2;
	
	public Integer type = 0;
	
	public Integer dimension = 1;
	
	public Integer alt;
	
	public Integer relativeAlt;
	
	@NotNull
	public Double distance;
	
	public Integer inFocus = 0;
	
	public Integer doNotIndex = 0;
	
	public Integer showSmallBiw = 1;
	
	public Integer showBiwOnClick = 1;
	
	public List<String> cells;

	public static LayarPOI fromCSV(String[] items) {
		LayarPOI ret = new LayarPOI();
		
		ret.codLayer = items[0].trim();
		ret.attribution = items[1].trim();
		ret.title = items[2].trim();
		ret.lat = Double.valueOf(items[3].trim());
		ret.lon = Double.valueOf(items[4].trim());
		ret.imageURL = items[5].trim();
		ret.line4 = items[6].trim();
		ret.line3 = items[7].trim();
		ret.line2 = items[8].trim();
		ret.type = Integer.valueOf(items[9].trim());
		ret.dimension = Integer.valueOf(items[10].trim());
		ret.alt = Integer.valueOf(items[11].trim());
		ret.relativeAlt = Integer.valueOf(items[12].trim());
		ret.distance = Double.valueOf(items[13].trim());
		ret.inFocus = Integer.valueOf(items[14].trim());
		ret.doNotIndex = Integer.valueOf(items[15].trim());
		ret.showSmallBiw = Integer.valueOf(items[16].trim());
		ret.showBiwOnClick = Integer.valueOf(items[17].trim());
		
		return ret;
	}
}
