package br.com.class023.day023;

public enum Categoria {
	ALIMENTO {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Alimento";
		}
		private void Categoria() {
			// TODO Verifing when to use a constructor method within Enums
		}
	},
	ELETRONICO{
		@Override
		public String toString() {
			return "Eletr�nico";
		}
	},
	LIMPEZA {
		@Override
		public String toString() {
			return "Limpeza";
		}
	},
	VESTUARIO{
		@Override
		public String toString() {
			return "Vestu�rio";
		}
	},
	PERFUMARIA{
		@Override
		public String toString() {
			return "Perfumaria";
		}
	};
	
	
}
