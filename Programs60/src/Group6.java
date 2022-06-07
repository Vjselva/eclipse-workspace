class Group {
	void groupSeries() {
		for (int i = 101; i <= 104; i++) {
			System.out.println("Group : " + (i - 100));
			for (int j = i; j <= 120; j = j + 4) {
				System.out.println(j);
			}
		}
	}

}

public class Group6 {
	public static void main(String[] args) {
		new Group().groupSeries();
	}
}
/*
 * Group : 1 101 105 109 113 117 Group : 2 102 106 110 114 118 Group : 3 103 107
 * 111 115 119 Group : 4 104 108 112 116 120
 */