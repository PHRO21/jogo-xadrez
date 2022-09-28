package com.projeto.xadrez.boardgame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class position {
	
	private int row;
	
	private int column;
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
