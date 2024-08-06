package com.infotech.fisglobal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Customer_Client_Test {

	public static void main(String[] args) {

		List<Collection_Example> custList = new ArrayList<>();
		custList.add(new Collection_Example(1, "Leslie", "Bass", "F", 27, "B", "37307", "endslost@everyma1l.org",
				"Gibson", "Dellwood", "Y"));
		custList.add(new Collection_Example(2, "Judy", "Burks", "M", 53, "S", "84759", "rfleming@hotma1l.co.uk",
				"Suwanee", "Trabue", "Y"));
		custList.add(new Collection_Example(3, "Marsha", "Doyle", "F", 48, "B", "80932", "arethe53@ma1lbox.net",
				"Perry", "Moxadarla", "Y"));
		custList.add(new Collection_Example(4, "Alexis", "Battle", "M", 27, "S", "71701", "ofcame@ma1lbox.org",
				"Morven", "Dennis", "Y"));
		custList.add(new Collection_Example(5, "Martha", "Combs", "F", 49, "B", "83947", "camedied@everyma1l.us",
				"Ocilla", "Greenwood", "Y"));
		custList.add(new Collection_Example(6, "Marilyn", "Nguyen", "M", 57, "S", "72274", "discoveredlist82@gma1l.org",
				"Byron", "Wetsell", "Y"));
		custList.add(new Collection_Example(7, "Billy", "Middleton", "F", 26, "B", "30544", "rkirk@yah00.co.uk", "Kite",
				"Aspen", "Y"));
		custList.add(new Collection_Example(8, "Justin", "Watson", "M", 53, "S", "47814", "lbrennan@ma1lbox.us",
				"Baxley", "Sibley", "Y"));
		custList.add(new Collection_Example(9, "Christian", "Marquez", "F", 39, "B", "83616", "isno@yah00.org",
				"Sandy Springs", "Brill", "Y"));
		custList.add(new Collection_Example(10, "Howard", "Duran", "M", 52, "S", "52254", "mroman@somema1l.org",
				"Colquitt", "Cochran", "Y"));
		custList.add(new Collection_Example(11, "William", "Copeland", "F", 18, "B", "78131", "ecollins@ma1lbox.net",
				"Offerman", "Harmony", "Y"));
		custList.add(new Collection_Example(12, "Frank", "Tran", "M", 24, "S", "58656", "textopen@yah00.org", "Ambrose",
				"Yost", "Y"));
		custList.add(new Collection_Example(13, "Shawn", "Ashley", "M", 26, "S", "65031", "pellison@ma1lbox.com",
				"Ambrose", "Jefferson", "Y"));
		custList.add(new Collection_Example(14, "Roger", "Melendez", "M", 55, "S", "31074", "openlist@yah00.org",
				"Offerman", "Mcclain", "Y"));
		custList.add(new Collection_Example(15, "Jacob", "Thornton", "F", 54, "B", "74233", "ggallagher@hotma1l.us",
				"Howell", "Rhonda", "Y"));
		custList.add(new Collection_Example(16, "Chelsea", "Beach", "M", 33, "S", "46507", "toconnor@hotma1l.org",
				"Remerton", "Heckel", "Y"));
		custList.add(new Collection_Example(17, "Lawrence", "Williamson", "F", 42, "B", "31526",
				"rtownsend40@gma1l.co.uk", "Duluth", "Hazlett", "Y"));
		custList.add(new Collection_Example(18, "Tammy", "Harvey", "M", 20, "S", "39864", "arichmond47@hotma1l.net",
				"Moultrie", "Basin", "Y"));
		custList.add(new Collection_Example(19, "Melody", "Richmond", "F", 39, "B", "89364",
				"discoveredof@hotma1l.co.uk", "Johns Creek", "Talley", "Y"));
		custList.add(new Collection_Example(20, "Evelyn", "Vang", "M", 61, "S", "36284", "scarver@ma1l2u.org", "Canton",
				"Blaine", "Y"));

		custList.add(new Collection_Example(25, "Kevin", "Owen", "F", 38, "B", "48304", "cgarrett@everyma1l.us",
				"Glory", "Stormont", "N"));
		custList.add(new Collection_Example(26, "Katrina", "Love", "M", 30, "S", "81137", "pkelly@b1zmail.biz",
				"Needmore", "Hopewell", "Y"));
		custList.add(new Collection_Example(27, "Mary", "Schultz", "F", 34, "B", "81154", "djordan@somema1l.net",
				"Mcrae", "Shady", "Y"));
		custList.add(new Collection_Example(28, "Ronald", "Church", "M", 18, "S", "64953", "sjohnson@everyma1l.co.uk",
				"Ocilla", "Applegate", "Y"));
		custList.add(new Collection_Example(29, "Edward", "Underwood", "F", 42, "B", "83985", "outare29@somema1l.us",
				"Withers", "Brookover", "Y"));
		custList.add(new Collection_Example(30, "Nathan", "Clark", "M", 54, "S", "23053", "diedthey@hotma1l.us",
				"Pulaski", "Myrtle", "Y"));

		addElementsInListUsingListIterator(custList);
	}

	private static void addElementsInListUsingListIterator(List<Collection_Example> custList) {
		for (ListIterator<Collection_Example> listIterator = custList.listIterator(); listIterator.hasNext();) {
			Collection_Example customer = listIterator.next();
			if (!customer.getFirstName().equalsIgnoreCase("Vernon") && !customer.getLastName().equalsIgnoreCase("Quinn")
					&& !customer.getGender().equalsIgnoreCase("F") && !customer.getState().equalsIgnoreCase("Rustle")) {
				listIterator.add(customer);
				break;
			}
			for (Collection_Example coll : custList) {
				System.out.println(coll);
			}

		}
	}

}
