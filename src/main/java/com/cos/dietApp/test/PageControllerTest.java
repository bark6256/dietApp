package com.cos.dietApp.test;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.dietApp.domain.board.Board;
import com.cos.dietApp.domain.board.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PageControllerTest {
	private final BoardRepository boardRepository;
	
	@GetMapping("/test/paging")
	public @ResponseBody Page<Board> pageing(){
		System.out.println("페이징 시작");
		int page=1, menuId=1;
		PageRequest pageRequest = PageRequest.of(page, 3, Sort.by("id").descending());
		Page<Board> boardsEntity = boardRepository.findAll(pageRequest);
		
	//	Page<Board> boardsEntity = boardRepository.mFindSearch(menuId, pageRequest);
	//	model.addAttribute("boardsEntity", boardsEntity);
		
		return boardsEntity;
	}
}
