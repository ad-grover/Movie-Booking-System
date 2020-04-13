package constants;

public enum SeatTypes {
	
	SILVER {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "SILVER-Price 250";
		}
	},
	GOLD {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "GOLD-Price 500";
		}
	},
	DIAMOND {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "DIAMOND-Price 750";
		}
	}
}
