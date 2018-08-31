package com.my.test.demo7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class loginmodify implements LoginService {
	@Autowired
	Repository rr;
	
	@Override
	public List<Login> get222() {
		return  rr.findAll();
		
	}
	@Override
	public Login get2221(Integer id) {
		return rr.findOne(id);
	}
	@Override
	public String save222(Login ll) {		
		rr.save(ll);
		return "进入save77方法";
	}
   @Override
	public Login put222(Integer lid,Login lput) {
		 Login newlog=rr.findOne(lid);
		 newlog.setPwd(lput.getPwd());
		 newlog.setUname(lput.getUname());
		 rr.save(newlog);
		 return newlog;

	}
   @Override
	public void delete222(Integer id7) {
		rr.delete(id7);
	}
    
}
