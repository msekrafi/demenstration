package com.fr.demenstration.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PreconditionFailedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2399715569789849718L;
	private int errorCode;
	private String detailsMsg;
	public PreconditionFailedException(String detailsMsg) {
		super();
		this.errorCode=40000;
		this.detailsMsg = detailsMsg;
	}
}