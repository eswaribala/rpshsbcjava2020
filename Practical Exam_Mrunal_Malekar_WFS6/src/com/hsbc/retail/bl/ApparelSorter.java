package com.hsbc.retail.bl;

import java.util.Comparator;

import com.hsbc.retail.models.Apparel;

public class ApparelSorter implements Comparator<Apparel> {

	@Override
	public int compare(Apparel o1, Apparel o2) {
		// TODO Auto-generated method stub
		return o1.getQuantity()-o2.getQuantity();
	}

}
