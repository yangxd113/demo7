package com.my.test.demo7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/demo7")
public class Controller7 {
	
	@Autowired
	LoginService uuu;
	
    @RequestMapping("/hello")
    public String hello() {
    	return "hello demo7()";
    }
    
  //GET获取全部数据
    @RequestMapping(value="/get2",method=RequestMethod.GET)
    public List<Login> get7(){
    	return uuu.get222();
    }
    //GET获取一条数据
    @RequestMapping(value="get2/{id}",method=RequestMethod.GET)
    public Login get77(@PathVariable("id") Integer id) {
    	return uuu.get2221(id);
    }
    //POST 增加一个用户
    @RequestMapping(value="/save2",method=RequestMethod.POST)
    public String save7(@RequestBody Login lll) {
    	uuu.save222(lll); 
    	return "save7() is ok!";
    }   
    //PUT修改一条数据：Login put222(Integer lid,Login lput);
    @RequestMapping(value="put2/{lid}",method=RequestMethod.PUT)
    public Login put7(@PathVariable("lid") Integer lid,@RequestBody Login lput) {
        return 	uuu.put222(lid, lput);
    }
    //删除一个用户
    @RequestMapping("/delete2")
    public int delete7(@RequestParam int id) {
        uuu.delete222(id);
        return id;
   }
    @RequestMapping(value="/delete2/{id}",method=RequestMethod.DELETE)
    public String delete77(@PathVariable("id") int id) {
    	uuu.delete222(id);
    	return id+"行已经被删除！";
    }
    
}
