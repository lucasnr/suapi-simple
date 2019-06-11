package br.edu.ifrn.suapi.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Classe pai de todos os tipos de vinculo com o SUAP
 * 
 * @author Lucas do Nascimento Ribeiro
 * @since 1.1
 * @version 1.1
 */

@Getter
@ToString
@EqualsAndHashCode
public class VinculoSUAP implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * A matrícula do usuário com este vinculo com o SUAP
	 * 
	 * @since 1.1
	 */
	protected String matricula;
	

	/**
	 * O nome do usuário com este vinculo com o SUAP
	 * 
	 * @since 1.1
	 */
	protected String nome;

	/**
	 * O campus deste vinculo com o SUAP
	 * 
	 * @since 1.1
	 */
	protected String campus;

	/**
	 * O curriculo lattes do usuário com este vinculo com o SUAP
	 * 
	 * @since 1.1
	 */
	@SerializedName("curriculo_lattes")
	protected String curriculoLattes;

	protected VinculoSUAP() {
	}

}
