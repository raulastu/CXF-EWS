package com.raul.cxfws;

import javax.jws.WebService;
import javax.jws.WebParam;

@WebService
public interface AuthService {
	Employee getEmployee(@WebParam(name = "gid") String gid);
}