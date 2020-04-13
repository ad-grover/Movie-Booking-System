package constants;

public enum ShowTimings {
	
	MORNING {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "MORNING 10 AM";
		}
	},
	AFTERNOON {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "AFTERNOON 3 PM";
		}
	},
	EVENING {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "EVENING 6 PM";
		}
	};
}
