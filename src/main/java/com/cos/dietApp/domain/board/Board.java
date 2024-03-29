package com.cos.dietApp.domain.board;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.cos.dietApp.domain.boardmenu.BoardMenu;
import com.cos.dietApp.domain.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // PK (자동 증가 번호)
	@Column(nullable = false, length = 50)
	private String title;
	@Lob
	private String content;
	@Lob
	private String thumbnail;
	
	@JoinColumn(name = "menuId")
	@ManyToOne(fetch = FetchType.LAZY)
	private BoardMenu boardMenu;

	@JoinColumn(name = "userId")
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

}