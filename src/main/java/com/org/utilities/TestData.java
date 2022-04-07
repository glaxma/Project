package com.org.utilities;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "Zipcode")
	public static Object[][] getData() {
		return new Object[][] { { "75035" } };
	}

}
//{"85282"},{"72227"},{"95051"},{"80209"},{"06810"},{"19711"},{"20002"},{"32807"},{"35242"}
//{"84058"} {"604106"}
//{"85282"},{"72227"},{"95051"},{"80209"},{"06810"},{"19711"},{"20002"},{"32807"}
//AZ 85019, 80907 MAIC,33432 30141 96825-Anico 83705 60640 46516 Iowa-51503, kansas 67301, Kentucky 40241, LA-70119,
//MAIne-04401,MAryland-21202,Massachusetts 02139,02554 Michigan 49417, 48101 Minnesota 55114, 55419 ANICO 55114, Mississippi 39216,38671 Missouri 64112,64109 Montana 59102, 59808
//Nebraska 68102, 68131 Nevada 89014, 89102 New Hampshire 03109 03063  New Mexico 87109, 87111 NC 28117
//33139 33755 07079 07032 07030 07304 07112 ANICO-07102 NY 10012 11222 12203 11375 PA 19027, 19130 19004 
//CA 95112,ANICO 94043,95060 91205 TX 75035
