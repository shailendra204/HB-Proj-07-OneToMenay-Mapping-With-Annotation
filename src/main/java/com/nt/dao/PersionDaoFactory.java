package com.nt.dao;

public class PersionDaoFactory {
  public static IPersonMgmt	getInstance() {
	return new IPersonMgmtImpl();
	
}
}
