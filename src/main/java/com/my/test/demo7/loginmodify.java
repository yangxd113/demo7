package com.my.test.demo7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class loginmodify implements LoginService {
	@Autowired
	Repository rr;
	@Override
	public List<Login>  put222() {
		return rr.findAll();
	}
	
	@Override
	public String save222(Login ll) {		
		rr.save(ll);
		return "进入save77方法";
	}
	@Override
	public void delete222(Integer id7) {
		rr.delete(id7);
	}
}
