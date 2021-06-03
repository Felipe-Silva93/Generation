package org.generation.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Produto {



	



		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long idProduto;
		
		
		private String nomeProduto;
		private String descricaoProduto;
		private Double valor;
		
		
	
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "idCategoria")
		@JsonIgnoreProperties("produto")
		private Categoria categoria;
		
		
		public Long getIdProduto() {
			return idProduto;
		}
		public void setIdProduto(Long idProduto) {
			this.idProduto = idProduto;
		}
		public String getNomeProduto() {
			return nomeProduto;
		}
		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}
		public String getDescricaoProduto() {
			return descricaoProduto;
		}
		public void setDescricaoProduto(String descricaoProduto) {
			this.descricaoProduto = descricaoProduto;
		}
		public Double getValor() {
			return valor;
		}
		public void setValor(Double valor) {
			this.valor = valor;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
		
		
}


