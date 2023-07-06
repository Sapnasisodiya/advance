package com.rays.user;

public class TestUserBean {
	public static void main (String []args) throws Exception {
		//testAdd();
		update();
		//delete();
	}
	
	

	public static void delete() throws Exception {
		UserBean bean = new UserBean();
		bean.setId(11);
		
		UserModel model = new UserModel();
		model.delete(bean);;
		
	}


	public static void update() throws Exception {
		UserBean bean = new UserBean();
		bean.setId(10);
		bean.setName("aaa");
		bean.setSalary(2300);
		bean.setAddress(111);
		
		UserModel model = new UserModel();
		model.update(bean);
		
	}



	public static void testAdd() throws Exception {
		UserBean bean = new UserBean();
		bean.setId(10);
		bean.setName("sss");
		bean.setSalary(13900);
		bean.setAddress(108);
		
		UserModel model = new UserModel();
		model.add(bean);
	}
		
	
}
