package model;

public class mTipoProduto {

		private int codTipoProduto;
		private String tDescTipo;
		
		public mTipoProduto() {
			
		}
		
		public mTipoProduto(int codTipoProduto, String tDescTipo) {
			super();
			this.codTipoProduto = codTipoProduto;
			this.tDescTipo = tDescTipo;
		}



		public int getCodTipoProduto() {
			return codTipoProduto;
		}


		public void setCodTipoProduto(int codTipoProduto) {
			this.codTipoProduto = codTipoProduto;
		}


		public String gettDescTipo() {
			return tDescTipo;
		}


		public void settDescTipo(String tDescTipo) {
			this.tDescTipo = tDescTipo;
		}


		
}

