package org.fottchen.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fottchen.po.Goods;
import org.fottchen.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoodsController {

	@Autowired private GoodsService goodsService;
	
	@RequestMapping("/goods/updateTwice.do")
	public void updateTwice(ModelAndView mav,
			HttpServletRequest req, HttpServletResponse res,
			@RequestParam(value="id") Integer id) {
		Goods goods = new Goods();
		goods.setId(id);
		try {
			goodsService.updateTwice(goods);
		} catch(Exception e) {
			
		}
	}
	
	@RequestMapping("/goods/insert.do")
	public void insert(ModelAndView mav,
			HttpServletRequest req, HttpServletResponse res,
			@RequestParam(value="name") String name) {
		Goods goods = new Goods();
		goods.setName(name);
		goodsService.insert(goods);
	}
	
}
