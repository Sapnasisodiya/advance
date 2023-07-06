package com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testAdd();
		// testDelete();
		// testUpdate();
		// testSearch();
		// testFindByRollNumber();
		 testsearch2();

	}

	private static void testsearch2() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		MarksheetModel model = new MarksheetModel();

		List list = model.Search2(bean);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean = (MarksheetBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getRollNumber());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());

		}

	}

	private static void testFindByRollNumber() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByRollNumber(1002);
		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getRollNumber());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());

		} else {
			System.out.println("roll number not exist");
		}
	}

	private static void testSearch() throws Exception {
		MarksheetModel model = new MarksheetModel();
		List list = model.Search();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			MarksheetBean bean = (MarksheetBean) it.next();
			System.out.println(bean.getId());
			System.out.println(bean.getRollNumber());
			System.out.println(bean.getName());
			System.out.println(bean.getPhysics());
			System.out.println(bean.getChemistry());
			System.out.println(bean.getMaths());

		}

	}

	private static void testUpdate() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(22);
		bean.setRoll_number(1006);
		bean.setName("rrr");
		bean.setPhysics(40);
		bean.setchemitry(80);
		bean.setMaths(55);

		MarksheetModel model = new MarksheetModel();
		model.update(bean);

	}

	private static void testDelete() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setId(21);

		MarksheetModel model = new MarksheetModel();
		model.delete(bean);

	}

	private static void testAdd() throws Exception {
		MarksheetBean bean = new MarksheetBean();
	
		bean.setRoll_number(123);
		bean.setName("Sapna");
		bean.setPhysics(90);
		bean.setchemitry(89);
		bean.setMaths(87);
		MarksheetModel model = new MarksheetModel();
		model.add(bean);

	}
}
