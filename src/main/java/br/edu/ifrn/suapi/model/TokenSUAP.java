package br.edu.ifrn.suapi.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public final class TokenSUAP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String token;
}