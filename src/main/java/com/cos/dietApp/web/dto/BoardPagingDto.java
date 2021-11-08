package com.cos.dietApp.web.dto;

import com.cos.dietApp.domain.boardmenu.BoardMenu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardPagingDto {
	private int id;
	private String title;
	private String content;
	private String thumbnail;
	private BoardMenu boardMenu;
}
