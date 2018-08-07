package com.mp.demo.api.util;

import org.springframework.http.HttpHeaders;

/**
 * @author Kshitiz Garg
 */
public class ApiDocumentation{

	static final String CACHE_CONTROL_PARAM = "Cache-Control";

	static final String CACHE_CONTROL_PARAM_VALUE = "no-cache, no-store, must-revalidate";

	static final String PRAGMA_PARAM = "Pragma";

	static final String PRAGMA_PARAM_VALUE = "no-cache";

	static final String EXPIRES_PARAM = "Expires";

	static final String EXPIRES_PARAM_VALUE = "0";

	public static final String GET = "GET";
	public static final String POST = "POST";
	public static final String PUT = "PUT";
	public static final String DELETE = "DELETE";

	private ApiDocumentation(){
		
	}
	
	public static HttpHeaders noCacheHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(EXPIRES_PARAM, EXPIRES_PARAM_VALUE);
		headers.add(CACHE_CONTROL_PARAM, CACHE_CONTROL_PARAM_VALUE);
		headers.add(PRAGMA_PARAM, PRAGMA_PARAM_VALUE);
		return headers;
	}

	public static final String API = "api";
	public static final String USER = "user";
	public static final String USERS = "users";
	public static final String USERS_API = "/"+USERS;
	public static final String USER_GET = "Fetches user";
	public static final String USERS_POST = "Creates a new user in the system";
	public static final String USER_PUT = "Updates user";
	public static final String USER_DELETE = "Deletes user";

}