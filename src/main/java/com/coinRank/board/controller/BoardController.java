package com.coinRank.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
	@RequestMapping("/board")
	@ResponseBody
	public String boad() {
		return "board OK";
	}

}
