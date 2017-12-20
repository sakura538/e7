package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.EasyUIDatagridResult;
import cn.e3mall.service.ItemService;

@Controller
public class PageController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public String showIndex(){
		
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		
		return page;
		
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDatagridResult showPageList(int page, int rows){
		EasyUIDatagridResult result = itemService.getItemList(page, rows);
		return result;
	}
	
}
