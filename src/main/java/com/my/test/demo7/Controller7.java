package com.my.test.demo7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/demo7")
public class Controller7 {
	@Autowired
	Repository rr;
	
	@Autowired
	LoginService uuu;
	
    @RequestMapping("/hello")
    public String hello() {
    	return "hello demo7()";
    }
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String save7(@RequestBody Login lll) {
    	uuu.save222(lll); 
    	return "save7() is ok!";
    }
    @RequestMapping(value="/save2",method=RequestMethod.POST)
    public String save8(@RequestBody Login lll) {
        rr.save(lll);
    	return "save8() is ok!";
    }
	
    @RequestMapping("/delete")
    public int delete7(@RequestParam int id) {
        uuu.delete222(id);
        return id;
   }
    @RequestMapping(value="/delete2",method=RequestMethod.DELETE)
    public String delete8(@RequestParam int id) {
    	rr.delete(id);
        return "delete方式提交:delete8() is ok!";
   } 
    
}
