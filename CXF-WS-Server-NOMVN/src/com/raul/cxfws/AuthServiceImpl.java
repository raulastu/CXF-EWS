package com.raul.cxfws;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.raul.cxfws.AuthService", serviceName = "corporateAuthService")
public class AuthServiceImpl implements AuthService {

	public Employee getEmployee(@WebParam(name="gid")String gid) {
		System.err.println("getting employee... it does not matter which one, we will always send the same :p");
		EmployeeDAO dao = new EmployeeDAO();
		return dao.getEmployee(gid);
	}

}