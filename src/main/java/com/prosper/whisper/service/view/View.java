package com.prosper.whisper.service.view;

import com.prosper.whisper.service.common.Opcode;

public class View {
	
	private int opCode = Opcode.SUCCESS;
	
	public View() {}
	
	public View(int opCode) {
		this.setOpCode(opCode);
	}

	public int getOpCode() {
		return opCode;
	}

	public void setOpCode(int opCode) {
		this.opCode = opCode;
	}

}
